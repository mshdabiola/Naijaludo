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
import com.mshdabiola.ludo.model.LudoGameState
import com.mshdabiola.ludo.model.LudoSetting
import com.mshdabiola.ludo.model.Point
import com.mshdabiola.multiplayerblue.Manager
import com.mshdabiola.naijaludo.LudoGame
import com.mshdabiola.naijaludo.OfflinePlayer
import com.mshdabiola.soundsystem.SoundSystem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
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
        // react to ludoGame change
//        viewModelScope.launch {
//            game
//                .gameState
//                .distinctUntilChanged { old, new -> old == new }
//                .collect { ludoGameState ->
//                    _gameUiState.value =
//                        gameUiState.value.copy(ludoGameState = ludoGameState.toLudoUiState())
//                }
//        }

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
            blueManager.state.collect { managerState ->
                if (managerState?.connected == true) {
                    blueManager.bluetoothSocket?.let {
                        // offlinePlayer = OfflinePlayer(it.inputStream, it.outputStream)

                        if (managerState.isServer) {
                            OfflinePlayer.sendString("4,abiola", it.outputStream)
                            val name = async { OfflinePlayer.getString(it.inputStream) }
                            log("Name ${name.await()}")
                        } else {
                            OfflinePlayer.sendString("ClientName", it.outputStream)
                            val string = async { OfflinePlayer.getString(it.inputStream) }
                            log("Pair ${string.await()}")
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
        setUpBlue()
        onClient()
    }

    fun onHost() {
        _gameUiState.value =
            gameUiState.value.copy(
                isStartDialogOpen = false,
                isWaitingDialogOpen = true
            )
        setUpBlue()
        onServer()
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
                game.sendDiceToRemote(it[0], it[2])
            }
        }
    }

    fun onCounter(counterId: Int) {
        game.onCounter(counterId)
        viewModelScope.launch {
            game.sendCounterToRemote(counterId)
        }
    }

    fun onPawn(index: Int, isDrawer: Boolean = false) {
        game.onPawn(index, isDrawer)
        if (!isDrawer) {
            viewModelScope.launch {
                game.sendPawnToRemote(index)
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

    private fun onServer() {
        viewModelScope.launch(Dispatchers.IO) {
            log("start Server")
            blueManager.onServer()
        }
    }

    private fun onClient() {
        log("start Client")
        blueManager.onClient()
    }

    fun onDevice(index: Int) {
        viewModelScope.launch(Dispatchers.IO) { blueManager.onBlueDevice(index) }
    }

    private fun setUpBlue() {
        blueManager.setUp()
    }

    fun closeBlue() {
        blueManager.close()
    }

    fun setIsServer(isServer: Boolean) {
        blueManager.setIsServer(isServer)
    }

    companion object {
        const val SHOWDIALOG = "show_dialog"
    }
}
