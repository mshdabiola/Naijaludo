package com.mshdabiola.game

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.datastore.Store
import com.mshdabiola.model.LogLudoData
import com.mshdabiola.naijaludo.OfflinePlayer
import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.naijaludo.model.GameType
import com.mshdabiola.naijaludo.model.IP2pManager
import com.mshdabiola.naijaludo.model.LudoGameState
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.naijaludo.model.SoundInterface
import com.mshdabiola.naijaludo.model.log
import com.mshdabiola.naijaludo.model.player.HumanPlayer
import com.mshdabiola.ui.getUDice
import com.mshdabiola.ui.state.BoardUiState
import com.mshdabiola.ui.state.LudoUiState
import com.mshdabiola.ui.state.PointUiState
import com.mshdabiola.ui.state.SettingUiState
import com.mshdabiola.ui.state.toLudoUiState
import com.mshdabiola.ui.state.toPointUiState
import com.mshdabiola.ui.state.toSetting
import com.mshdabiola.ui.state.toUi
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.mapNotNull
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class GameViewModel(
    private val savedStateHandle: SavedStateHandle,
    private val soundSystem: SoundInterface,
    private val blueManager: IP2pManager,
    private val setting: Store,
    private val dispatcher: CoroutineDispatcher,
) : ViewModel() {

    private val game by lazy { LogLudo(soundSystem) }
    private val showDialog = savedStateHandle.get<Boolean>(SHOW_DIALOG)
    private val gameId2 = savedStateHandle.get<Int>(GAME_ID)
    private var currId = gameId2 ?: 2
    private val _gameUiState =
        MutableStateFlow(GameUiState(isStartDialogOpen = showDialog ?: true))
    val gameUiState = _gameUiState.asStateFlow()

    private var clientServerJob: Job? = null

    val settingUiState = setting.setting
        .map { it.toUi() }
        .distinctUntilChanged { old, new -> old == new }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            Setting.default.toUi(),
        )

    private val _ludoGameState = MutableStateFlow(LudoUiState(board = BoardUiState()))
    val ludoGameState = _ludoGameState.asStateFlow()

    init {
        // react to game ui state change for computer and remote
        viewModelScope.launch(Dispatchers.Default) {
            game.onStateChange()
        }
        viewModelScope.launch(Dispatchers.Default) {
            game.gameState
                .map { it.toLudoUiState() }
                .distinctUntilChanged { old, new -> old == new }
                .collectLatest { ludo ->
                    _ludoGameState
                        .update {
                            ludo
                        }
                }
        }

        viewModelScope.launch(dispatcher) {

            if (!gameUiState.value.isStartDialogOpen) {
                resumeFromDatabase()
            }
        }

        // get and set settings
        viewModelScope.launch(dispatcher) {

//            settingUiState
//                .distinctUntilChanged { old, new -> old == new }
//                .collectLatest {
//                    Timber.e(it.toString())
//                    setting.setGameSetting(it.toSetting())
//                }
        }

        viewModelScope.launch(Dispatchers.Default) {
            delay(6000)
            soundSystem.play()
        }

        viewModelScope.launch(dispatcher) {
            settingUiState
                .map { Pair(it.music, it.sound) }
                .distinctUntilChanged()
                .collectLatest {
                    soundSystem.setPlaySound2(it.second)
                    soundSystem.setPlayMusic(it.first)
                }
        }

        // multiplayer

        viewModelScope.launch(dispatcher) {
            blueManager.state
                .mapNotNull { it?.serverConnected }
                .buffer(2)
                .distinctUntilChanged { old, new -> old == new }
                .collect {
                    log("collected $it")
                    if (it) {
                        if (blueManager.state.value?.isServer == true) {
                            sendString(
                                "setting,${setting.getUser().name}," +
                                    "${settingUiState.value.pawnNumber},${settingUiState.value.boardStyle}",
                            )
                        } else {
                            delay(500)
                            sendString("client_name,${setting.getUser().name}")
                        }
                    } else {
                        _gameUiState.value =
                            gameUiState.value.copy(navigateBackBcosOfBlueError = true)
                    }
                }
        }

        viewModelScope.launch(dispatcher) {
            blueManager.state
                .map { it?.message ?: "" }
                .filter { it.isNotBlank() }
                .buffer(2)
                .collect { message ->

                    onRemoteClick(message)
                }
        }

        viewModelScope.launch(dispatcher) {
            blueManager
                .state
                .mapNotNull { it?.devices }
                .distinctUntilChanged()
                .collectLatest {

                    _gameUiState.value = gameUiState
                        .value.copy(listOfDevice = it.toImmutableList())
                }
        }
        viewModelScope.launch(dispatcher) {
            blueManager
                .state
                .mapNotNull { it?.connected }
                .distinctUntilChanged()
                .collectLatest {

                    if (it) {
                        _gameUiState.value = gameUiState
                            .value.copy(
                                connected = it,
                                isDeviceDialogOpen = false,
                                isWaitingDialogOpen = true,
                            )

                        startOffGame()
                    }
                }
        }
    }

    // game logic

    fun onDice() {
        viewModelScope.launch {
            val intArray = game.onDice()

            intArray?.let {
                sendString("dice,${it[0]},${it[1]}")
            }
        }
    }

    private fun gameType(): GameType {
        return ludoGameState.value.gameType
    }

    fun onCounter(counterId: Int) {
        game.onCounter(counterId)
        sendString("counter,$counterId")
    }

    fun onPawn(index: Int, isDrawer: Boolean = false) {
        try {
            game.onPawn(index, isDrawer)
            val int = if (isDrawer) 1 else 0
            sendString("pawn,$index,$int")
        } catch (e: Exception) {
            _gameUiState.update {
                it.copy(navigateBackBcosOfBlueError = true)
            }
        }
    }

    private fun onPlayerFinishPlaying() {
        saveData()
    }

    // game screen lifecycle logic

    fun onResume(
//        firebaseLog: (event: String, block: com.google.firebase.analytics.ktx.ParametersBuilder.() -> kotlin.Unit) -> Unit = { _, _ -> },
        unLockAchievement: (Int) -> Unit = {},
        increaseAchievement: (Int) -> Unit = {},
    ) {
        game.increaseAchievement = increaseAchievement
        game.unLockAchievement = unLockAchievement
//        game.firebaseLog = firebaseLog
        soundSystem.resume()
        game.resume()
    }

    fun onPause() {
        soundSystem.pause()
        game.pause()
        saveData()
    }

    fun onPlayGame() {
        viewModelScope.launch {
            log("destroy game")

            _ludoGameState.update {
                LudoUiState(board = BoardUiState())
            }
            closeBlue()
            _gameUiState.update {
                GameUiState().copy(isStartDialogOpen = false)
            }
            delay(250)
            _gameUiState.update {
                it.copy(isStartDialogOpen = true)
            }
        }
    }

    // on start game logic
    private suspend fun startGame(
        ludoGameState: LudoGameState,
        ludoSetting: Setting,
        logLudoData: LogLudoData?,
        saveLog: (LogLudoData) -> Unit,
    ) {
        viewModelScope.launch(dispatcher) {
            savedStateHandle[SHOW_DIALOG] = false
        }
        val diceId = setting.getCurrentDice().firstOrNull() ?: ""
        val boardId = setting.getCurrentBoard().firstOrNull() ?: ""
        val dice = getUDice(diceId)
        val newLudoUiState = ludoGameState.copy(
            listOfDice = ludoGameState.listOfDice.map {
                it.copy(color = dice.color)
            },
        )
        _gameUiState.update {
            it.copy(boardName = boardId)
        }

        delay(300)
        game.start2(
            logLudo = logLudoData,
            ludoGameState = newLudoUiState,
            ludoSetting = ludoSetting,
            onGameFinish = this@GameViewModel::onGameFinish,
            onPlayerFinishPlaying = this@GameViewModel::onPlayerFinishPlaying,
            saveLog = saveLog,
        )
    }

    fun onRestart() {
        _gameUiState.value = gameUiState.value.copy(isRestartDialogOpen = false)

        viewModelScope.launch {
            game.restart()
        }
    }

    private fun startOffGame() {
        clientServerJob?.cancel()
        clientServerJob = viewModelScope.launch {
            log("start Server")
            _gameUiState.value = gameUiState.value.copy(isWaitingDialogOpen = false)
            blueManager.connect()
        }
    }

    fun onYouAndComputer() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)

        viewModelScope.launch(Dispatchers.Default) {
            currId = 2
            val user = setting.getUser()
            Constant.photoUri = user.photoUri

            val ludoGameState =
                getSavedGame(currId, user.name)
                    ?: Constant.getDefaultGameState(
                        numberOfPawn = settingUiState.value.pawnNumber,
                        playerName = user.name,
                    )
            log("Loaded pawn ${ludoGameState.listOfPawn.joinToString { "color ${it.colorNumber}" }}")

            startGame(
                ludoGameState,
                settingUiState.value.toSetting(),
                logLudoData = setting.getLog2(),
                saveLog = {
                    viewModelScope.launch {
                        setting.setLog2(it)
                    }
                },
            )
            launch(dispatcher) { savedStateHandle[GAME_ID] = currId }
        }
        // deleteData()
    }

    fun onFriend() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)
        val ludoSetting = settingUiState.value
        viewModelScope.launch(Dispatchers.Default) {
            val players = listOf(
                HumanPlayer(
                    name = "Player 1",
                    colors = listOf(GameColor.values()[0], GameColor.values()[1]),
                    iconIndex = 0,
                ),
                HumanPlayer(
                    name = "Player 2",
                    isCurrent = true,
                    colors = listOf(GameColor.values()[2], GameColor.values()[3]),
                    iconIndex = 6,
                ),
            )
            startGame(
                Constant.getDefaultGameState(
                    numberOfPawn = ludoSetting.pawnNumber,
                    playerName = setting.getUser().name,
                ).copy(gameType = GameType.FRIEND, listOfPlayer = players),
                ludoSetting.toSetting(),
                logLudoData = null,
                saveLog = {},
            )
        }
    }

    fun onTournament() {
        val ludoSetting = settingUiState.value
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)
        viewModelScope.launch(Dispatchers.Default) {
            currId = 4

            val user = setting.getUser()
            Constant.photoUri = user.photoUri
            val ludoGameState =
                getSavedGame(currId, user.name)
                    ?: Constant.getDefaultGameState(
                        numberOfPlayer = 4,
                        numberOfPawn = ludoSetting.pawnNumber,
                        playerName = user.name,
                    )
            startGame(
                ludoGameState,
                ludoSetting.toSetting(),
                logLudoData = setting.getLog4(),
                saveLog = {
                    viewModelScope.launch {
                        setting.setLog4(it)
                    }
                },
            )
            launch(dispatcher) { savedStateHandle[GAME_ID] = currId }
        }
    }

    fun restartGame() {
        viewModelScope.launch {
            game.resign()
        }
    }

    private fun onGameFinish() {
        game.stop()
        _gameUiState.value = gameUiState.value.copy(isRestartDialogOpen = true)

        saveData()
    }

    // multiplayer logic

    private fun sendString(str: String) {
        if (ludoGameState.value.gameType == GameType.REMOTE) {
            log("send string $str")
            viewModelScope.launch(dispatcher) {
                blueManager.sendString(str)
            }
        }
    }

    private fun onRemoteClick(str: String) {
        when {
            str.contains("setting") -> {
                val input = str.split(",")
                log("setting is $str")
                onLineClientGame(input[1], input[2].toInt(), input[3].toInt())
            }

            str.contains("client_name") -> {
                val input = str.split(",")
                log("client name is $str")
                onLineServerGame(input[1])
            }

            str.contains("dice") -> {
                val input = str.split(",")
                log("dice is $str")
                viewModelScope.launch {
                    game.onDice(intArrayOf(input[1].toInt(), 0, input[2].toInt()))
                }
            }

            str.contains("pawn") -> {
                val input = str.split(",")
                log("pawn is $str")
                game.onPawn(input[1].toInt(), input[2].toInt() == 1)
            }

            str.contains("counter") -> {
                val input = str.split(",")
                log("counter is $str")
                game.onCounter(input[1].toInt())
            }

            else -> {
                log("else $str")
            }
        }
    }

    // Todo("fix style bug")
    private fun onLineServerGame(name: String) {
        val ludoSetting = settingUiState.value
        _gameUiState.value = gameUiState.value.copy(isWaitingDialogOpen = false)
        viewModelScope.launch(Dispatchers.Default) {
            val player = listOf(
                OfflinePlayer(
                    name = name.ifBlank { "Offline" },
                    iconIndex = 4,
                    colors = listOf(GameColor.values()[2], GameColor.values()[3]),
                ),
                HumanPlayer(
                    name = setting.getUser().name,
                    isCurrent = true,
                    colors = listOf(GameColor.values()[0], GameColor.values()[1]),
                    iconIndex = 6,
                ),
            )

            startGame(
                Constant.getDefaultGameState(
                    numberOfPlayer = 2,
                    numberOfPawn = ludoSetting.pawnNumber,
                    playerName = setting.getUser().name,
                ).copy(listOfPlayer = player, gameType = GameType.REMOTE),
                ludoSetting.toSetting().copy(boardStyle = 0, gameLevel = 0),
                logLudoData = null,
                saveLog = {},
            )
        }
    }

    private fun onLineClientGame(name: String, noOfPawn: Int, style: Int) {
        val ludoSetting = settingUiState.value
        _gameUiState.value = gameUiState.value.copy(isWaitingDialogOpen = false)
        viewModelScope.launch(Dispatchers.Default) {
            val player = listOf(
                OfflinePlayer(
                    name = name.ifBlank { "Offline" },
                    iconIndex = 4,
                    isCurrent = true,
                    colors = listOf(GameColor.values()[0], GameColor.values()[1]),
                ),
                HumanPlayer(
                    name = setting.getUser().name,
                    colors = listOf(GameColor.values()[2], GameColor.values()[3]),
                    iconIndex = 6,
                ),
            )

            startGame(
                Constant.getDefaultGameState(
                    numberOfPlayer = 2,
                    numberOfPawn = noOfPawn,
                    playerName = setting.getUser().name,
                ).copy(listOfPlayer = player, gameType = GameType.REMOTE),
                ludoSetting.toSetting().copy(pawnNumber = noOfPawn, boardStyle = 0, gameLevel = 0),
                logLudoData = null,
                saveLog = {},
            )
        }
    }

    private fun onDevice(index: Int) {
        clientServerJob = viewModelScope.launch(dispatcher) {
            blueManager.connectToDevice(index)
        }
    }

    private fun setUpBlue() {
        blueManager.setUp()
    }

    private fun closeBlue() {
        //  game.setGameToDefault()
        clientServerJob?.cancel()
        // isServer = null
        blueManager.close()
    }

    fun onJoin() {
        _gameUiState.value =
            gameUiState.value.copy(
                isStartDialogOpen = false,
                isDeviceDialogOpen = true,
            )
        setUpBlue()
        blueManager.discoverDevice()
    }

    fun onCancelBlueDialog() {
        _gameUiState.value =
            gameUiState.value.copy(
                isStartDialogOpen = true,
                isWaitingDialogOpen = false,
                isDeviceDialogOpen = false,
            )
        closeBlue()
    }

    fun onDeviceClick(index: Int) {
        _gameUiState.value =
            gameUiState.value.copy(
                isWaitingDialogOpen = true,
                isDeviceDialogOpen = false,
            )

        onDevice(index)
    }

    // save game logic
    var job: Job? = null
    private fun saveData() {
        job?.cancel()
        job = viewModelScope.launch {
            if (gameType() == GameType.COMPUTER) {
                val state = game.gameState.first()
                setting.setGame(
                    state.listOfPlayer,
                    state.listOfPawn,
                )
            }
        }
    }

    private suspend fun getSavedGame(id: Int, playerName: String): LudoGameState? {
        val ludoAndOthers = setting.getGame(id, playerName)

        var pawns = ludoAndOthers.second
        val players = ludoAndOthers.first.toMutableList()

        if (players.isEmpty()) {
            return null
        }

        if (pawns.isNotEmpty()) {
            players.forEach { player ->
                val isOut = pawns.filter { it.color in player.colors }.all { it.isOut() }
                if (isOut) {
                    pawns = Constant.getDefaultPawns(settingUiState.value.pawnNumber)
                }
            }
        } else {
            pawns = Constant.getDefaultPawns(settingUiState.value.pawnNumber)
        }

        val index = players.lastIndex
        players[index] = players[index].copyPlayer(name = playerName)
        return Constant.getDefaultGameState(playerName = playerName)
            .copy(listOfPlayer = players, listOfPawn = pawns.sortedBy { it.pawnId })
    }

    private fun resumeFromDatabase() {
        viewModelScope.launch {
            if (gameId2 != null) {
                if (gameId2 == 2) {
                    onYouAndComputer()
                } else {
                    onTournament()
                }
            }
        }
    }

    // general
    fun setMusic(value: Boolean) {
        viewModelScope.launch {
            val setti = settingUiState.value.copy(music = value)
            setting.setGameSetting(setti.toSetting())
        }
    }

    fun setSound(value: Boolean) {
        viewModelScope.launch {
            val setti = settingUiState.value.copy(sound = value)
            setting.setGameSetting(setti.toSetting())
        }
    }

    fun getPositionIntOffset(id: Int, gameColor: GameColor): PointUiState {
        return game.getPositionIntOffset(id, gameColor).toPointUiState()
    }

    // setting

    fun setSetting(settingUiState: SettingUiState) {
        viewModelScope.launch {
            setting.setGameSetting(settingUiState.toSetting())
        }
    }

    companion object {
        const val SHOW_DIALOG = "show_dialog"
        const val GAME_ID = "game_id"
    }
}
