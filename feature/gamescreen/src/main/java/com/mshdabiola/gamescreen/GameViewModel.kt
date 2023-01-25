package com.mshdabiola.gamescreen

import android.content.Context
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.database.LudoStateDomain
import com.mshdabiola.database.model.toPair
import com.mshdabiola.datastore.ProfilePref
import com.mshdabiola.datastore.SoundPref
import com.mshdabiola.datastore.UserPreferenceDataSource
import com.mshdabiola.datastore.toList
import com.mshdabiola.gamescreen.state.BoardUiState
import com.mshdabiola.gamescreen.state.LudoUiState
import com.mshdabiola.gamescreen.state.PointUiState
import com.mshdabiola.gamescreen.state.toLudoUiState
import com.mshdabiola.gamescreen.state.toPointUiState
import com.mshdabiola.ludo.model.Constant.getDefaultGameState
import com.mshdabiola.ludo.model.Constant.getDefaultPawns
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.GameType
import com.mshdabiola.ludo.model.LudoGameState
import com.mshdabiola.ludo.model.LudoSetting
import com.mshdabiola.ludo.model.log
import com.mshdabiola.ludo.model.player.HumanPlayer
import com.mshdabiola.multiplayerblue.P2pManager
import com.mshdabiola.naijaludo.LudoGame
import com.mshdabiola.naijaludo.OfflinePlayer
import com.mshdabiola.soundsystem.SoundSystem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
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
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GameViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val ludoStateDomain: LudoStateDomain,
    private val userPreferenceDataSource: UserPreferenceDataSource,
    private val soundSystem: SoundSystem,
    private val blueManager: P2pManager,
) : ViewModel() {

    private val game = LudoGame(soundSystem)
    private val showDialog = savedStateHandle.get<Boolean>(SHOW_DIALOG)

    private val _gameUiState =
        MutableStateFlow(GameUiState(isStartDialogOpen = showDialog ?: true))

    val gameUiState = _gameUiState.asStateFlow()

    private var clientServerJob: Job? = null

    val ludoGameState = game.gameState
        .map { it.toLudoUiState() }
        .distinctUntilChanged { old, new -> old == new }
        .stateIn(
            viewModelScope,
            started = SharingStarted.WhileSubscribed(),
            LudoUiState(board = BoardUiState()),
        )

    private var gameId: Long? = null
    private lateinit var profName: Array<String>
    private lateinit var ludoSetting: LudoSetting

    private var waitingForDevice = false

    init {
        // react to game ui state change for computer and remote
        viewModelScope.launch {
            game.onStateChange()
        }

        // check if it have continue game
        viewModelScope.launch {
            val ludoAndOthers = async { ludoStateDomain.getLatestLudoAndOther().firstOrNull() }

            if (gameUiState.value.isStartDialogOpen && ludoAndOthers.await() != null) {
                _gameUiState.value = gameUiState.value.copy(showContinueButton = true)
            }
        }

        viewModelScope.launch {

            if (!gameUiState.value.isStartDialogOpen) {
                resumeFromDatabase()
            }
        }
        viewModelScope.launch(Dispatchers.IO) {
            val basicPref = userPreferenceDataSource.getBasicSetting().first()
            // val soundPref = userPreferenceDataSource.getSoundSetting().first()
            val profilePref = userPreferenceDataSource.getProfileSetting().first()
            val boardPref = userPreferenceDataSource.getBoardSetting().first()

            val defaultNames = ProfilePref().toList()
            profName = Array(defaultNames.size) {
                val str = profilePref.toList()[it]
                str.ifBlank { defaultNames[it] }
            }

            ludoSetting = LudoSetting(
                level = basicPref.gameLevel,
                assist = basicPref.assistant,
                style = boardPref.boardStyle,
                numberOfPawn = boardPref.pawnNumber,
                rotateBoard = boardPref.rotate,
                boardType = boardPref.boardType,
            )
        }
        viewModelScope.launch(Dispatchers.IO) {
            userPreferenceDataSource
                .getSoundSetting().collectLatest {
                    soundSystem.playSound = it.sound
                    soundSystem.setPlayMusic(it.music)

                    _gameUiState.value = gameUiState.value.copy(music = it.music, sound = it.sound)
                }
        }

//        viewModelScope.launch(Dispatchers.IO) {
//            blueManager.state
//                .map { it?.connected }
//                .buffer(2)
//                .distinctUntilChanged { old, new -> old == new }
//                .collect {
//                    log("collected $it")
//                    if (it != null) {
//                        if (it) {
//                            _gameUiState.value = gameUiState
//                                .value.copy(
//                                    isBluetoothConnected = it,
//                                )
//
//                            if (isServer!!) {
//                                sendString(
//                                    "setting,${profName[0]}," +
//                                            "${ludoSetting.numberOfPawn},${ludoSetting.style}",
//                                )
//                            } else {
//                                delay(500)
//                                sendString("client_name,${profName[0]}")
//                            }
//                        } else {
//                            //   closeBlue()
//                            _gameUiState.value =
//                                gameUiState.value.copy(navigateBackBcosOfBlueError = true)
//                        }
//                    } else {
//                        _gameUiState.value = gameUiState
//                            .value.copy(
//                                isBluetoothConnected = false,
//                            )
//                    }
//                }
//        }
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
                                "setting,${profName[0]}," +
                                    "${ludoSetting.numberOfPawn},${ludoSetting.style}",
                            )
                        } else {
                            delay(500)
                            sendString("client_name,${profName[0]}")
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

        viewModelScope.launch {
            blueManager
                .state
                .mapNotNull { it?.devices }
                .distinctUntilChanged()
                .collectLatest {

                    _gameUiState.value = gameUiState
                        .value.copy(listOfDevice = it.toImmutableList())
                }
        }
        viewModelScope.launch {
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

    // start game
    private suspend fun startGame(
        ludoGameState: LudoGameState,
        ludoSetting: LudoSetting,
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            savedStateHandle[SHOW_DIALOG] = false
        }

        delay(300)
        game.start(
            ludoGameState = ludoGameState,
            ludoSetting = ludoSetting,
            onGameFinish = this@GameViewModel::onGameFinish,
            onPlayerFinishPlaying = this@GameViewModel::onPlayerFinishPlaying,
        )
    }

    private fun resumeFromDatabase() {
        viewModelScope.launch {
            val ludoAndOthers = ludoStateDomain.getLatestLudoAndOther().firstOrNull()
            gameId = ludoAndOthers?.ludoEntity?.id

            val pair = ludoAndOthers?.toPair()
            var pawns = pair?.second
            val players = pair?.first

            if (players != null && pawns != null) {
                if (pawns.all { it.isOut() }) {
                    pawns = getDefaultPawns(ludoSetting.numberOfPawn)
                }

                val ludoState = getDefaultGameState()
                    .copy(listOfPlayer = players, listOfPawn = pawns)

                startGame(ludoState, ludoSetting)
            }
        }
    }

    // Start dialog
    fun onYouAndComputer() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)

        viewModelScope.launch(Dispatchers.Default) {
            startGame(
                getDefaultGameState(
                    numberOfPawn = ludoSetting.numberOfPawn,
                    playerNames = profName,
                ),
                ludoSetting,
            )
        }
        deleteData()
    }

    fun onFriend() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)

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
                getDefaultGameState(
                    numberOfPawn = ludoSetting.numberOfPawn,
                    playerNames = profName,
                ).copy(gameType = GameType.FRIEND, listOfPlayer = players),
                ludoSetting,
            )
        }
    }

    fun onTournament() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)
        viewModelScope.launch(Dispatchers.Default) {
            startGame(
                getDefaultGameState(
                    numberOfPlayer = 4,
                    numberOfPawn = ludoSetting.numberOfPawn,
                    playerNames = profName,
                ),
                ludoSetting,
            )
        }
        deleteData()
    }

    fun onContinueClick() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)

        resumeFromDatabase()
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

//    fun onHost() {
//        _gameUiState.value =
//            gameUiState.value.copy(
//                isStartDialogOpen = false,
//                isWaitingDialogOpen = true,
//            )
//        setUpBlue()
//    }

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

    // lifecycle
    fun onResume() {
        soundSystem.resume()
        game.resume()
//        if (waitingForDevice) {
//            //loadDevice()
//            waitingForDevice = false
//        }
    }

    fun onPause() {
        soundSystem.pause()
        game.pause()
    }

    // on game click
    private fun onGameFinish() {
        game.stop()
        _gameUiState.value = gameUiState.value.copy(isRestartDialogOpen = true)

        saveData()
    }

    fun onRestart() {
        _gameUiState.value = gameUiState.value.copy(isRestartDialogOpen = false)

        viewModelScope.launch {
            game.restart()
        }
    }

    private fun gameType(): GameType {
        return ludoGameState.value.gameType
    }

    fun onDice() {
        viewModelScope.launch {
            val intArray = game.onDice()

            intArray?.let {
                sendString("dice,${it[0]},${it[2]}")
            }
        }
    }

    fun onCounter(counterId: Int) {
        game.onCounter(counterId)
        sendString("counter,$counterId")
    }

    fun onPawn(index: Int, isDrawer: Boolean = false) {
        game.onPawn(index, isDrawer)
        val int = if (isDrawer) 1 else 0
        sendString("pawn,$index,$int")
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
        _gameUiState.value = gameUiState.value.copy(isWaitingDialogOpen = false)
        viewModelScope.launch(Dispatchers.Default) {
            val player = listOf(
                OfflinePlayer(
                    name = name.ifBlank { "Offline" },
                    iconIndex = 4,
                    colors = listOf(GameColor.values()[2], GameColor.values()[3]),
                ),
                HumanPlayer(
                    name = profName[0],
                    isCurrent = true,
                    colors = listOf(GameColor.values()[0], GameColor.values()[1]),
                    iconIndex = 6,
                ),
            )

            startGame(
                getDefaultGameState(
                    numberOfPlayer = 2,
                    numberOfPawn = ludoSetting.numberOfPawn,
                    playerNames = profName,
                ).copy(listOfPlayer = player, gameType = GameType.REMOTE),
                ludoSetting.copy(style = 0, level = 0),
            )
        }
    }

    private fun onLineClientGame(name: String, noOfPawn: Int, style: Int) {
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
                    name = profName[0],
                    colors = listOf(GameColor.values()[2], GameColor.values()[3]),
                    iconIndex = 6,
                ),
            )

            startGame(
                getDefaultGameState(
                    numberOfPlayer = 2,
                    numberOfPawn = noOfPawn,
                    playerNames = profName,
                ).copy(listOfPlayer = player, gameType = GameType.REMOTE),
                ludoSetting.copy(numberOfPawn = noOfPawn, style = 0, level = 0),
            )
        }
    }

    fun getPositionIntOffset(id: Int, gameColor: GameColor): PointUiState {
        return game.getPositionIntOffset(id, gameColor).toPointUiState()
    }

    fun setMusic(value: Boolean) {
        viewModelScope.launch {
            userPreferenceDataSource
                .setSoundSetting(SoundPref(sound = gameUiState.value.sound, music = value))
        }
    }

    fun setSound(value: Boolean) {
        viewModelScope.launch {
            userPreferenceDataSource
                .setSoundSetting(SoundPref(music = gameUiState.value.music, sound = value))
        }
    }

    fun restartGame() {
        viewModelScope.launch {
            game.resign()
        }
    }

    private fun onPlayerFinishPlaying() {
        saveData()
    }

    // game database
    private fun saveData() {
        if (gameType() == GameType.COMPUTER) {
            viewModelScope.launch(Dispatchers.IO) {
                log("on game dispose")
                viewModelScope.launch(Dispatchers.IO) {
                    val id = gameId ?: 1

                    ludoStateDomain.insertLudo(game.gameState.value, id)
                }
            }
        }
    }

    private fun deleteData() {
        viewModelScope.launch(Dispatchers.IO) {
            ludoStateDomain.deleteGame(1)
        }
    }

// bluetooth function

    fun isBluetoothEnable() = false // blueManager.isBluetoothEnable()

    private fun startOffGame() {
        clientServerJob?.cancel()
        clientServerJob = viewModelScope.launch {
            log("start Server")
            _gameUiState.value = gameUiState.value.copy(isWaitingDialogOpen = false)
            blueManager.connect()
        }
    }

//    fun onConnect() {
//        isServer = false
//        log("start Client")
//        loadDevice()
//    }

    //  fun loadDevice() {
//        viewModelScope.launch {
//            val devices=blueManager.getDevice()
//            _gameUiState.value = gameUiState
//                .value.copy(listOfDevice = devices?.toImmutableList()?: emptyList<String>().toImmutableList())
//        }

    //  }

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

    fun onPairDevice() {
        waitingForDevice = true
    }

    private fun sendString(str: String) {
        log("send string $str")
        viewModelScope.launch(Dispatchers.IO) {
            blueManager.sendString(str)
        }
    }

    fun bluetoothPermission(context: Context): ImmutableList<String> {
        return blueManager.wifiPermission(context).toImmutableList()
    }

    companion object {
        const val SHOW_DIALOG = "show_dialog"
    }

    override fun onCleared() {
        super.onCleared()
        closeBlue()
    }
}
