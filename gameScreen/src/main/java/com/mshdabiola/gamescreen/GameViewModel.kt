package com.mshdabiola.gamescreen

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
import com.mshdabiola.gamescreen.state.toLudoUiState
import com.mshdabiola.ludo.model.Constant.getDefaultGameState
import com.mshdabiola.ludo.model.Constant.getDefaultPawns
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.GameType
import com.mshdabiola.ludo.model.LudoGameState
import com.mshdabiola.ludo.model.LudoSetting
import com.mshdabiola.ludo.model.Point
import com.mshdabiola.ludo.model.player.HumanPlayer
import com.mshdabiola.multiplayerblue.Manager
import com.mshdabiola.naijaludo.LudoGame
import com.mshdabiola.naijaludo.OfflinePlayer
import com.mshdabiola.soundsystem.SoundSystem
import dagger.hilt.android.lifecycle.HiltViewModel
import java.io.DataOutputStream
import java.io.IOException
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

@HiltViewModel
class GameViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val ludoStateDomain: LudoStateDomain,
    private val userPreferenceDataSource: UserPreferenceDataSource,
    private val soundSystem: SoundSystem,
    private val blueManager: Manager
) : ViewModel() {

    private val game = LudoGame(soundSystem)
    private val showDialog = savedStateHandle.get<Boolean>(SHOWDIALOG)

    private val _gameUiState =
        MutableStateFlow(GameUiState(isStartDialogOpen = showDialog ?: true))

    val gameUiState = _gameUiState.asStateFlow()

    val blueManagerState = blueManager.state.stateIn(
        viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        null
    )
    val ludoGameState = game.gameState
        .map { it.toLudoUiState() }
        .distinctUntilChanged { old, new -> old == new }
        .stateIn(
            viewModelScope, started = SharingStarted.WhileSubscribed(),
            LudoUiState(board = BoardUiState())
        )

    var gameId: Long? = null
    lateinit var profName: Array<String>
    lateinit var ludoSetting: LudoSetting

    init {
        // react to gameuistate change for computer and remote
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
                loadGame()
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
                boardType = boardPref.boardType
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

        viewModelScope.launch(Dispatchers.IO) {
            blueManager.state
                .map { it?.connected == true }
                .distinctUntilChanged { old, new -> old == new }
                .collect { isConnected ->
                    if (isConnected) {
                        blueManager.bluetoothSocket?.let {
                            // offlinePlayer = OfflinePlayer(it.inputStream, it.outputStream)

                            if (blueManager.state.value?.isServer == true) {
                                sendString(
                                    "setting,${ludoSetting.numberOfPawn}," +
                                        profName[0]
                                )
                            } else {
                                sendString("client_name,${profName[0]}")
                            }
                            launch(Dispatchers.IO) {
                                blueManager
                                    .readByteArrayStream(it.inputStream)
                                    .catch {
                                        onErrorOccurBluetooth(it)
                                    }
                                    .collect {
                                        onRemoteClick(it)
                                    }
                            }
                        }
                    }
                }
        }
    }

    // start game
    private suspend fun startGame(ludoGameState: LudoGameState) {

        delay(300)
        game.start(
            ludoGameState = ludoGameState,
            ludoSetting = ludoSetting,
            onGameFinish = this@GameViewModel::onGameFinish,
            onPlayerFinishPlaying = this@GameViewModel::onPlayerFinishPlaying
        )
    }

    // Todo("check if is not remote game")
    private fun loadGame() {
        viewModelScope.launch() {
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

                startGame(ludoState)
            }
        }
    }

    // Start dialog
    fun onYouAndComputer() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)
        savedStateHandle[SHOWDIALOG] = false

        viewModelScope.launch(Dispatchers.Default) {

            startGame(
                getDefaultGameState(
                    numberOfPawn = ludoSetting.numberOfPawn,
                    playerNames = profName
                )
            )
        }
        deleteData()
    }

    fun onTournament() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)
        viewModelScope.launch(Dispatchers.Default) {
            startGame(
                getDefaultGameState(
                    numberOfPlayer = 4,
                    numberOfPawn = ludoSetting.numberOfPawn,
                    playerNames = profName
                )
            )
        }
        deleteData()
    }

    fun onContinueClick() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)
        savedStateHandle[SHOWDIALOG] = false
        loadGame()
    }

    fun onJoin() {
        _gameUiState.value =
            gameUiState.value.copy(
                isStartDialogOpen = false,
                isDeviceDialogOpen = true
            )
        setUpBlue(false)
    }

    fun onHost() {
        _gameUiState.value =
            gameUiState.value.copy(
                isStartDialogOpen = false,
                isWaitingDialogOpen = true
            )
        setUpBlue(true)
    }

    fun onCancelBlueDialog() {
        _gameUiState.value =
            gameUiState.value.copy(
                isStartDialogOpen = true,
                isWaitingDialogOpen = false,
                isDeviceDialogOpen = false
            )
        closeBlue()
    }

    fun onDeviceClick(index: Int) {
        _gameUiState.value =
            gameUiState.value.copy(
                isWaitingDialogOpen = true,
                isDeviceDialogOpen = false
            )

        onDevice(index)
    }

    // lifecycle
    fun onResume() {
        soundSystem.resume()
        game.resume()
        blueManager.onResume()
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
        val int = if (isDrawer)1 else 0
        sendString("pawn,$index,$int")
    }

    fun onRemoteClick(str: String) {
        when {
            str.contains("setting") -> {
                val input = str.split(",")
                log("setting is $str")
                onLineClientGame(input[2], input[1].toInt())
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

    fun onLineServerGame(name: String) {
        _gameUiState.value = gameUiState.value.copy(isWaitingDialogOpen = false)
        viewModelScope.launch(Dispatchers.Default) {
            blueManager.bluetoothSocket?.let {

                val player = listOf(
                    OfflinePlayer(
                        name = name.ifBlank { "Offline" },
                        iconIndex = 4,
                        colors = listOf(GameColor.values()[2], GameColor.values()[3])
                    ),
                    HumanPlayer(
                        name = profName[0],
                        isCurrent = true,
                        colors = listOf(GameColor.values()[0], GameColor.values()[1]),
                        iconIndex = 6
                    )
                )

                startGame(
                    getDefaultGameState(
                        numberOfPlayer = 2,
                        numberOfPawn = ludoSetting.numberOfPawn,
                        playerNames = profName
                    ).copy(listOfPlayer = player, gameType = GameType.REMOTE)
                )
            }
        }
    }

    fun onLineClientGame(name: String, pawnSize: Int) {
        _gameUiState.value = gameUiState.value.copy(isWaitingDialogOpen = false)
        viewModelScope.launch(Dispatchers.Default) {
            blueManager.bluetoothSocket?.let {

                val player = listOf(
                    OfflinePlayer(
                        name = name.ifBlank { "Offline" },
                        iconIndex = 4,
                        isCurrent = true,
                        colors = listOf(GameColor.values()[0], GameColor.values()[1])
                    ),
                    HumanPlayer(
                        name = profName[0],
                        colors = listOf(GameColor.values()[2], GameColor.values()[3]),
                        iconIndex = 6
                    )
                )

                startGame(
                    getDefaultGameState(
                        numberOfPlayer = 2,
                        numberOfPawn = pawnSize,
                        playerNames = profName
                    ).copy(listOfPlayer = player, gameType = GameType.REMOTE)
                )
            }
        }
    }

    fun getPositionIntOffset(id: Int, gameColor: GameColor): Point {
        return game.getPositionIntOffset(id, gameColor)
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
        viewModelScope.launch(Dispatchers.IO) {
            log("on game dispose")
            viewModelScope.launch(Dispatchers.IO) {
                val id = gameId ?: 1

                ludoStateDomain.insertLudo(game.gameState.value, id)
            }
        }
    }

    private fun deleteData() {
        viewModelScope.launch(Dispatchers.IO) {
            ludoStateDomain.deleteGame(1)
        }
    }

    // bluetooth function

    fun isAllPermission(): Boolean {
        return blueManager.isAllPermissionGranted()
    }

    fun isBluetoothEnable() = blueManager.isBluetoothEnable()

    fun onServer() {
        viewModelScope.launch(Dispatchers.IO) {
            log("start Server")
            blueManager.onServer()
        }
    }

    fun onClient() {
        log("start Client")
        blueManager.onClient()
    }

    fun onDevice(index: Int) {
        viewModelScope.launch(Dispatchers.IO) { blueManager.onBlueDevice(index) }
    }

    private fun setUpBlue(isServer: Boolean) {
        blueManager.setUp(isServer)
    }

    fun closeBlue() {
        blueManager.close()
    }

    fun onPairDevice() {
        blueManager.onPairNewDevice()
    }
    fun onErrorOccurBluetooth(throwable: Throwable) {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = true)
        throwable.printStackTrace()
        blueManager.close()
    }

    fun sendString(str: String) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                blueManager.bluetoothSocket?.let {

                    DataOutputStream(it.outputStream).apply {
                        writeUTF(str)
                        flush()
                    }
                    log("send successful")
                }
            } catch (exception: IOException) {
                onErrorOccurBluetooth(exception)
            }
        }
    }

    companion object {
        const val SHOWDIALOG = "show_dialog"
    }

    override fun onCleared() {
        super.onCleared()
        closeBlue()
    }
}
