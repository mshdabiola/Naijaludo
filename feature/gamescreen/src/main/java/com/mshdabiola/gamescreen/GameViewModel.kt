package com.mshdabiola.gamescreen

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.common.firebase.FireAnalyticsLog
import com.mshdabiola.common.multiplayer.P2pManager
import com.mshdabiola.common.sound.SoundSystem
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
import com.mshdabiola.naijaludo.LudoGame
import com.mshdabiola.naijaludo.OfflinePlayer
import com.mshdabiola.naijaludo.model.Constant.getDefaultGameState
import com.mshdabiola.naijaludo.model.Constant.getDefaultPawns
import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.naijaludo.model.GameType
import com.mshdabiola.naijaludo.model.LudoGameState
import com.mshdabiola.naijaludo.model.LudoSetting
import com.mshdabiola.naijaludo.model.log
import com.mshdabiola.naijaludo.model.player.HumanPlayer
import com.mshdabiola.worker.Saver
import dagger.hilt.android.lifecycle.HiltViewModel
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
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.mapNotNull
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GameViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val ludoStateDomain: LudoStateDomain,
    private val userPreferenceDataSource: UserPreferenceDataSource,
    private val soundSystem: SoundSystem,
    private val blueManager: P2pManager,
    private val fireAnalyticsLog: FireAnalyticsLog
) : ViewModel() {

    private val game = LudoGame(soundSystem)
    private val showDialog = savedStateHandle.get<Boolean>(SHOW_DIALOG)
    private val gameId2 = savedStateHandle.get<Long>(GAME_ID) ?: 200L
    private var currId = gameId2
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

    private lateinit var profName: Array<String>
    private lateinit var ludoSetting: LudoSetting

    init {
        // react to game ui state change for computer and remote
        viewModelScope.launch {
            game.onStateChange()
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

//
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
        viewModelScope.launch {
            log(ludoGameState)
        }
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

    private fun log(msg: LudoGameState) {
        val player = msg.listOfPlayer.map {
            it.name to it.win
        }
            .toTypedArray()
        logFirebase(
            "player",
            "gametype" to msg.gameType.name,
            *player,
            "no of pawn" to msg.listOfPawn.count()
        )

    }

    private fun resumeFromDatabase() {
        viewModelScope.launch {
            val ludoState = getSavedGame(gameId2)
            if (ludoState != null) {
                startGame(ludoState, ludoSetting)
            }
        }
    }

    private suspend fun getSavedGame(id: Long): LudoGameState? {
        val ludoAndOthers = ludoStateDomain.getLudoAndOtherById(id).firstOrNull()
        val pair = ludoAndOthers?.toPair()
        var pawns = pair?.second
        val players = pair?.first

        return if (!players.isNullOrEmpty() && !pawns.isNullOrEmpty()) {
//            if (pawns.all { it.isOut() }) {
//                pawns = getDefaultPawns(ludoSetting.numberOfPawn)
//            }
          players.forEach { player->
             val isOut= pawns.filter { it.color in player.colors  }.all { it.isOut() }
              if (isOut){
                  return null
              }
          }

            getDefaultGameState()
                .copy(listOfPlayer = players, listOfPawn = pawns)
        } else {
            null
        }
    }

    // Start dialog
    fun onYouAndComputer() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)

        viewModelScope.launch(Dispatchers.Default) {
            currId = 200L

            val ludoGameState =
                getSavedGame(currId)
                    ?: getDefaultGameState(
                        numberOfPawn = ludoSetting.numberOfPawn,
                        playerNames = profName,
                    )

            startGame(
                ludoGameState,
                ludoSetting,
            )
            launch(Dispatchers.IO) { savedStateHandle[GAME_ID] = currId }
        }
        // deleteData()
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
            currId = 100L

            val ludoGameState =
                getSavedGame(currId)
                    ?: getDefaultGameState(
                        numberOfPlayer = 4,
                        numberOfPawn = ludoSetting.numberOfPawn,
                        playerNames = profName,
                    )
            startGame(
                ludoGameState,
                ludoSetting,
            )
            launch(Dispatchers.IO) { savedStateHandle[GAME_ID] = currId }
        }
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

    // lifecycle
    fun onResume() {
        soundSystem.resume()
        game.resume()
    }

    fun onPause() {
        soundSystem.pause()
        game.pause()
        saveData()
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
        try {
            game.onPawn(index, isDrawer)
            val int = if (isDrawer) 1 else 0
            sendString("pawn,$index,$int")
        }catch (e:Exception){
            logFirebase("on pawn exception", Pair("exception",e.message?:""))
            _gameUiState.update {
                it.copy(navigateBackBcosOfBlueError = true)
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
      //  saveData()
    }

    // game database
    private fun saveData() {
        if (gameType() == GameType.COMPUTER) {
//            viewModelScope.launch(Dispatchers.IO) {
//                log("on game dispose")

//                ludoStateDomain.insertLudo(game.gameState.value, currId)
               Saver.saveGame(game.gameState.value,currId)

//            }
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

    private fun sendString(str: String) {
        log("send string $str")
        viewModelScope.launch(Dispatchers.IO) {
            blueManager.sendString(str)
        }
    }

    companion object {
        const val SHOW_DIALOG = "show_dialog"
        const val GAME_ID = "game_id"
    }

    override fun onCleared() {
        super.onCleared()
        closeBlue()
    }

    fun logScreen(name: String) = fireAnalyticsLog.logScreen(name)
    fun logFirebase(name: String, vararg pair: Pair<String, Any>) =
        fireAnalyticsLog.log(name, *pair)
}
