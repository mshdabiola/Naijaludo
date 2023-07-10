package com.mshdabiola.ludo.screen

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.ludo.screen.game.GameUiState
import com.mshdabiola.ludo.screen.game.state.BoardUiState
import com.mshdabiola.ludo.screen.game.state.LudoUiState
import com.mshdabiola.ludo.screen.game.state.PointUiState
import com.mshdabiola.ludo.screen.game.state.toLudoUiState
import com.mshdabiola.ludo.screen.game.state.toPawn
import com.mshdabiola.ludo.screen.game.state.toPointUiState
import com.mshdabiola.ludo.screen.game.state.toSaverPlayer
import com.mshdabiola.ludo.screen.main.SettingUiState
import com.mshdabiola.ludo.screen.main.toSetting
import com.mshdabiola.ludo.screen.main.toUi
import com.mshdabiola.naijaludo.LudoGame
import com.mshdabiola.naijaludo.OfflinePlayer
import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.naijaludo.model.GameType
import com.mshdabiola.naijaludo.model.LudoGameState
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.naijaludo.model.log
import com.mshdabiola.naijaludo.model.player.HumanPlayer
import com.mshdabiola.setting.MultiplatformSettings
import com.mshdabiola.util.multiplayer.P2pManager
import com.mshdabiola.util.sound.SoundSystem
import kotlinx.collections.immutable.toImmutableList
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
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.mapNotNull
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import timber.log.Timber

class GeneralViewModel(
    private val savedStateHandle: SavedStateHandle,
    private val soundSystem: SoundSystem,
    private val blueManager: P2pManager,
    private val setting: MultiplatformSettings,
) : ViewModel() {


    private val game by lazy { LudoGame(soundSystem) }
    private val showDialog = savedStateHandle.get<Boolean>(SHOW_DIALOG)
    private val gameId2 = savedStateHandle.get<Int>(GAME_ID) ?: 2
    private var currId = gameId2
    private val _gameUiState =
        MutableStateFlow(GameUiState(isStartDialogOpen = showDialog ?: true))
    val gameUiState = _gameUiState.asStateFlow()

    private var clientServerJob: Job? = null

    val settingUiState = setting.setting
        .map { it.toUi() }
        .distinctUntilChanged { old, new -> old == new }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), SettingUiState())

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

        viewModelScope.launch(Dispatchers.IO) {

            if (!gameUiState.value.isStartDialogOpen) {
                resumeFromDatabase()
            }
        }

        //get and set settings
        viewModelScope.launch(Dispatchers.IO) {


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

        viewModelScope.launch(Dispatchers.IO) {
            settingUiState
                .map { Pair(it.music, it.sound) }
                .distinctUntilChanged()
                .collectLatest {
                    soundSystem.playSound = it.second
                    soundSystem.setPlayMusic(it.first)
                }
        }


        //multiplayer

        viewModelScope.launch(Dispatchers.IO) {
            blueManager.state
                .mapNotNull { it?.serverConnected }
                .buffer(2)
                .distinctUntilChanged { old, new -> old == new }
                .collect {
                    log("collected $it")
                    if (it) {
                        if (blueManager.state.value?.isServer == true) {
                            sendString(
                                "setting,${settingUiState.value.playerName[0]}," +
                                        "${settingUiState.value.pawnNumber},${settingUiState.value.boardStyle}",
                            )
                        } else {
                            delay(500)
                            sendString("client_name,${settingUiState.value.playerName[0]}")
                        }
                    } else {
                        _gameUiState.value =
                            gameUiState.value.copy(navigateBackBcosOfBlueError = true)
                    }
                }
        }

        viewModelScope.launch(Dispatchers.IO) {
            blueManager.state
                .map { it?.message ?: "" }
                .filter { it.isNotBlank() }
                .buffer(2)
                .collect { message ->

                    onRemoteClick(message)
                }
        }

        viewModelScope.launch(Dispatchers.IO) {
            blueManager
                .state
                .mapNotNull { it?.devices }
                .distinctUntilChanged()
                .collectLatest {

                    _gameUiState.value = gameUiState
                        .value.copy(listOfDevice = it.toImmutableList())
                }
        }
        viewModelScope.launch(Dispatchers.IO) {
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


    //game logic

    fun onDice() {
        viewModelScope.launch {
            val intArray = game.onDice()

            intArray?.let {
                sendString("dice,${it[0]},${it[2]}")
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
            logFirebase("on pawn exception", Pair("exception", e.message ?: ""))
            _gameUiState.update {
                it.copy(navigateBackBcosOfBlueError = true)
            }
        }

    }

    private fun onPlayerFinishPlaying() {
        saveData()
    }


    //game screen lifecycle logic


    fun onResume() {
        soundSystem.resume()
        game.resume()
    }

    fun onPause() {
        soundSystem.pause()
        game.pause()
        saveData()
    }

    fun onDestroy() {
        Timber.e("destroy game")
        _gameUiState.update {
            it.copy(isStartDialogOpen = true)
        }
        _ludoGameState.update {
            LudoUiState(board = BoardUiState())
        }
        closeBlue()
    }

    //on start game logic
    private suspend fun startGame(
        ludoGameState: LudoGameState,
        ludoSetting: Setting,
    ) {

        viewModelScope.launch(Dispatchers.IO) {
            savedStateHandle[SHOW_DIALOG] = false
        }

        delay(300)
        game.start(
            ludoGameState = ludoGameState,
            ludoSetting = ludoSetting,
            onGameFinish = this@GeneralViewModel::onGameFinish,
            onPlayerFinishPlaying = this@GeneralViewModel::onPlayerFinishPlaying,
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

            val ludoGameState =
                getSavedGame(currId)
                    ?: Constant.getDefaultGameState(
                        numberOfPawn = settingUiState.value.pawnNumber,
                        playerNames = settingUiState.value.playerName.toTypedArray(),
                    )

            startGame(
                ludoGameState,
                settingUiState.value.toSetting(),
            )
            launch(Dispatchers.IO) { savedStateHandle[GAME_ID] = currId }
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
                    playerNames = ludoSetting.playerName.toTypedArray(),
                ).copy(gameType = GameType.FRIEND, listOfPlayer = players),
                ludoSetting.toSetting(),
            )
        }
    }

    fun onTournament() {
        val ludoSetting = settingUiState.value
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)
        viewModelScope.launch(Dispatchers.Default) {
            currId = 4

            val ludoGameState =
                getSavedGame(currId)
                    ?: Constant.getDefaultGameState(
                        numberOfPlayer = 4,
                        numberOfPawn = ludoSetting.pawnNumber,
                        playerNames = ludoSetting.playerName.toTypedArray(),
                    )
            startGame(
                ludoGameState,
                ludoSetting.toSetting(),
            )
            launch(Dispatchers.IO) { savedStateHandle[GAME_ID] = currId }
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


    //multiplayer logic

    private fun sendString(str: String) {
        log("send string $str")
        viewModelScope.launch(Dispatchers.IO) {
            blueManager.sendString(str)
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
                    name = ludoSetting.playerName[0],
                    isCurrent = true,
                    colors = listOf(GameColor.values()[0], GameColor.values()[1]),
                    iconIndex = 6,
                ),
            )

            startGame(
                Constant.getDefaultGameState(
                    numberOfPlayer = 2,
                    numberOfPawn = ludoSetting.pawnNumber,
                    playerNames = ludoSetting.playerName.toTypedArray(),
                ).copy(listOfPlayer = player, gameType = GameType.REMOTE),
                ludoSetting.toSetting().copy(boardStyle = 0, gameLevel = 0),
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
                    name = ludoSetting.playerName[0],
                    colors = listOf(GameColor.values()[2], GameColor.values()[3]),
                    iconIndex = 6,
                ),
            )

            startGame(
                Constant.getDefaultGameState(
                    numberOfPlayer = 2,
                    numberOfPawn = noOfPawn,
                    playerNames = ludoSetting.playerName.toTypedArray(),
                ).copy(listOfPlayer = player, gameType = GameType.REMOTE),
                ludoSetting.toSetting().copy(pawnNumber = noOfPawn, boardStyle = 0, gameLevel = 0),
            )
        }
    }


    private fun onDevice(index: Int) {
        clientServerJob = viewModelScope.launch(Dispatchers.IO) {
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


    //log logic
    fun logScreen(name: String) {
        // fireAnalyticsLog.logScreen(name)
    }

    fun logFirebase(name: String, vararg pair: Pair<String, Any>) {
        //   fireAnalyticsLog.log(name, *pair)
    }


    //save game logic
    var job: Job? = null
    private fun saveData() {
        if (gameType() == GameType.COMPUTER) {
            val players = ludoGameState.value.listOfPlayer.map { it.toSaverPlayer() }
            val pawns = ludoGameState.value.listOfPawn.map { it.toPawn() }
            job?.cancel()
            job = viewModelScope.launch {
                setting.setGame(
                    players, pawns
                )
            }
        }
    }

    private fun getSavedGame(id: Int): LudoGameState? {
        val ludoAndOthers = setting.getGame(id)

        var pawns = ludoAndOthers?.pawns
        val players = ludoAndOthers?.getPlayer()

        if (players.isNullOrEmpty())
            return null

        if (!pawns.isNullOrEmpty()) {
            players.forEach { player ->
                val isOut = pawns!!.filter { it.color in player.colors }.all { it.isOut() }
                if (isOut) {
                    pawns = Constant.getDefaultPawns(settingUiState.value.pawnNumber)
                }
            }
        } else {
            pawns = Constant.getDefaultPawns(settingUiState.value.pawnNumber)
        }

        return Constant.getDefaultGameState()
            .copy(listOfPlayer = players, listOfPawn = pawns!!)
    }

    private fun resumeFromDatabase() {
        viewModelScope.launch {
            if (gameId2 == 2)
                onYouAndComputer()
            else
                onTournament()

        }
    }


    //general
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

    //setting

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