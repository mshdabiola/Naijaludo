package com.mshdabiola.gamescreen

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.database.LudoStateDomain
import com.mshdabiola.database.model.toPair
import com.mshdabiola.datastore.BasicPref
import com.mshdabiola.datastore.BoardPref
import com.mshdabiola.datastore.ProfilePref
import com.mshdabiola.datastore.SoundPref
import com.mshdabiola.datastore.UserPreferenceDataSource
import com.mshdabiola.datastore.toList
import com.mshdabiola.gamescreen.state.toLudoUiState
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.LudoGameState
import com.mshdabiola.ludo.model.Point
import com.mshdabiola.naijaludo.LudoGame
import com.mshdabiola.naijaludo.LudoSetting
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch

@HiltViewModel
class GameViewModel @Inject constructor(
    val savedStateHandle: SavedStateHandle,
    private val ludoStateDomain: LudoStateDomain,
    private val userPreferenceDataSource: UserPreferenceDataSource,
    private val soundSystem: SoundSystem
) : ViewModel() {

    private val game = LudoGame(soundSystem)
    private val showDialog = savedStateHandle.get<Boolean>(SHOWDIALOG)

    private val _gameUiState =
        MutableStateFlow(GameUiState(isStartDialogOpen = showDialog ?: true))
    val gameUiState = _gameUiState.asStateFlow()

    var gameId: Long? = null

    lateinit var basicPref: BasicPref
    lateinit var soundPref: SoundPref
    lateinit var boardPref: BoardPref
    lateinit var profilePref: ProfilePref
    lateinit var profName: Array<String>
    lateinit var ludoSetting: LudoSetting

    init {
        // react to ludoGame change
        viewModelScope.launch {
            game
                .gameState
                .distinctUntilChanged { old, new -> old == new }
                .collect { ludoGameState ->
                    _gameUiState.value =
                        gameUiState.value.copy(ludoGameState = ludoGameState.toLudoUiState())
                }
        }

        // react to gameuistate change
        viewModelScope.launch {
            game.onStateChange()
        }

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
            basicPref = userPreferenceDataSource.getBasicSetting().first()
            soundPref = userPreferenceDataSource.getSoundSetting().first()
            profilePref = userPreferenceDataSource.getProfileSetting().first()
            boardPref = userPreferenceDataSource.getBoardSetting().first()

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

            soundSystem.playSound = soundPref.sound
        }
        viewModelScope.launch {
            delay(6000)
            soundSystem.playMusic()
        }
    }

    private suspend fun startGame(ludoGameState: LudoGameState) {


        delay(300)
        game.start(
            ludoGameState = ludoGameState,
            ludoSetting = ludoSetting,
            onGameFinish = this@GameViewModel::onGameFinish,
            onPlayerFinishPlaying = this@GameViewModel::onPlayerFinishPlaying
        )
    }

    fun onYouAndComputer() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)
        savedStateHandle[SHOWDIALOG] = false

        viewModelScope.launch(Dispatchers.Default) {

            startGame(
                LudoGame
                    .getDefaultGameState(
                        numberOfPawn = boardPref.pawnNumber,
                        playerNames = profName
                    )
            )
        }
    }

    fun onContinueClick() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)
        savedStateHandle[SHOWDIALOG] = false
        loadGame()
    }

    private fun loadGame() {
        viewModelScope.launch() {
            val ludoAndOthers = ludoStateDomain.getLatestLudoAndOther().firstOrNull()
            gameId = ludoAndOthers?.ludoEntity?.id

            val pair = ludoAndOthers?.toPair()
            val pawns = pair?.second?.toMutableList()
            val players = pair?.first

            if (players != null && pawns != null) {

                if (pawns.all { it.isOut() }) {
                    (0 until pawns.size).forEach {
                        val pawn = pawns[it]
                        pawns[it] = pawn.copy(currentPos = pawn.id * -1)
                    }
                }

                val ludoState = LudoGame
                    .getDefaultGameState()
                    .copy(listOfPlayer = players, listOfPawn = pawns)

                startGame(ludoState)
            }
        }
    }

    fun onTournament() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)
        viewModelScope.launch(Dispatchers.Default) {
            startGame(
                LudoGame
                    .getDefaultGameState(
                        numberOfPlayer = 4,
                        numberOfPawn = boardPref.pawnNumber,
                        playerNames = profName
                    )
            )
        }
    }

    fun onResume() {
        soundSystem.playMusic()
        game.resume()
    }

    fun onPause() {
        soundSystem.stopMusic()
        game.pause()
    }

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
            game.onDice()
        }
    }

    fun onCounter(counterId: Int) {
        game.onCounter(counterId)
    }

    fun onPawn(index: Int, isDrawer: Boolean = false) {
        game.onPawn(index, isDrawer)
    }

    fun getPositionIntOffset(id: Int, gameColor: GameColor): Point {
        return game.getPositionIntOffset(id, gameColor)
    }

    private fun saveData() {
        viewModelScope.launch(Dispatchers.IO) {
            log("on game dispose")
            viewModelScope.launch(Dispatchers.IO) {
                val id = gameId ?: 1

                ludoStateDomain.insertLudo(game.gameState.value, id)
            }
        }
    }

    private fun onPlayerFinishPlaying() {
        saveData()
    }

    override fun onCleared() {
        super.onCleared()
        soundSystem.close()
    }

    companion object {
        const val SHOWDIALOG = "show_dialog"
    }
}
