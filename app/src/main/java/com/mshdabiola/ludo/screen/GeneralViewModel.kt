package com.mshdabiola.ludo.screen

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.ludo.database.IGameSaver
import com.mshdabiola.ludo.screen.game.GameUiState
import com.mshdabiola.ludo.screen.game.GameViewModel
import com.mshdabiola.ludo.screen.game.state.BoardUiState
import com.mshdabiola.ludo.screen.game.state.LudoUiState
import com.mshdabiola.ludo.screen.game.state.PointUiState
import com.mshdabiola.ludo.screen.game.state.toLudoUiState
import com.mshdabiola.ludo.screen.game.state.toPointUiState
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
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class GeneralViewModel(
    private val savedStateHandle: SavedStateHandle,
    private val soundSystem: SoundSystem,
    private val blueManager: P2pManager,
    private val setting: MultiplatformSettings,
    private val iGameSaver: IGameSaver
) : ViewModel() {


    private val game = LudoGame(soundSystem)
    private val showDialog = savedStateHandle.get<Boolean>(GameViewModel.SHOW_DIALOG)
    private val gameId2 = savedStateHandle.get<Long>(GameViewModel.GAME_ID) ?: 200L
    private var currId = gameId2
    private val _gameUiState =
        MutableStateFlow(GameUiState(isStartDialogOpen = showDialog ?: true))
    val gameUiState = _gameUiState.asStateFlow()

    private var clientServerJob: Job? = null
    private val _settingUiState = MutableStateFlow(SettingUiState())
    val settingUiState = _settingUiState.asStateFlow()

    val ludoGameState = game.gameState
        .map { it.toLudoUiState() }
        .distinctUntilChanged { old, new -> old == new }
        .stateIn(
            viewModelScope,
            started = SharingStarted.WhileSubscribed(),
            LudoUiState(board = BoardUiState()),
        )


    init {
        // react to game ui state change for computer and remote
        viewModelScope.launch {
            game.onStateChange()
        }

        //get and set settings
        viewModelScope.launch {
            val gameSetting = setting.getGameSetting()
            _settingUiState.update {
                gameSetting.toUi()
            }
            settingUiState
                .distinctUntilChanged { old, new -> old == new }
                .collectLatest {
                    setting.setGameSetting(it.toSetting())
                }
        }

        //get saved game
        viewModelScope.launch {

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
        //  saveData()
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

    //on start game logic
    private suspend fun startGame(
        ludoGameState: LudoGameState,
        ludoSetting: Setting,
    ) {
        viewModelScope.launch {
            //  log(ludoGameState)
        }
        viewModelScope.launch(Dispatchers.IO) {
            savedStateHandle[GameViewModel.SHOW_DIALOG] = false
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
            currId = 200L

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
            launch(Dispatchers.IO) { savedStateHandle[GameViewModel.GAME_ID] = currId }
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
            currId = 100L

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
            launch(Dispatchers.IO) { savedStateHandle[GameViewModel.GAME_ID] = currId }
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
    private fun saveData() {
        if (gameType() == GameType.COMPUTER) {
//            viewModelScope.launch(Dispatchers.IO) {
//                log("on game dispose")

//                ludoStateDomain.insertLudo(game.gameState.value, currId)
            // Saver.saveGame(game.gameState.value, currId)

//            }
        }
    }

    private suspend fun getSavedGame(id: Long): LudoGameState? {
        return null
    }


    fun updateScore(score: Long, name: String) {
        //update score from play store
        log("score is $score")
        viewModelScope.launch(Dispatchers.IO) {
            game.updateScore(score, name)
        }
    }


    //general
    fun setMusic(value: Boolean) {
//        viewModelScope.launch {
//            userPreferenceDataSource
//                .setSoundSetting(SoundPref(sound = gameUiState.value.sound, music = value))
//        }
    }

    fun setSound(value: Boolean) {
//        viewModelScope.launch {
//            userPreferenceDataSource
//                .setSoundSetting(SoundPref(music = gameUiState.value.music, sound = value))
//        }
    }

    fun getPositionIntOffset(id: Int, gameColor: GameColor): PointUiState {
        return game.getPositionIntOffset(id, gameColor).toPointUiState()
    }


}