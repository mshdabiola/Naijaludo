package com.mshdabiola.gamescreen

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.database.LudoStateDomain
import com.mshdabiola.gamescreen.state.toLudoUiState
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.LudoGameState
import com.mshdabiola.ludo.model.Point
import com.mshdabiola.ludo.model.player.HumanPlayer
import com.mshdabiola.ludo.model.player.RandomComputerPlayer
import com.mshdabiola.naijaludo.LudoGame
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GameViewModel @Inject constructor(
    val savedStateHandle: SavedStateHandle,
    private val ludoStateDomain: LudoStateDomain
) : ViewModel() {

    private val game = LudoGame()
    private var gameId = savedStateHandle.get<Long>(GAMEID)
    private val showDialog = savedStateHandle.get<Boolean>(SHOWDIALOG)

    private val _gameUiState = MutableStateFlow(GameUiState(isStartDialogOpen = showDialog ?: true))
    val gameUiState = _gameUiState.asStateFlow()

//    val se =savedStateHandle.

    init {
        viewModelScope.launch {
            val id= ludoStateDomain.getLatestGameId().firstOrNull()
            _gameUiState.value = gameUiState.value.copy(showContinueButton = id!= null)
        }

        //react to ludoGame change
        viewModelScope.launch {
            game

                .gameState
                .distinctUntilChanged { old, new -> old == new }
                .collect { ludoGameState ->
                    _gameUiState.value =
                        gameUiState.value.copy(ludoGameState = ludoGameState.toLudoUiState())
                }
        }


        //react to gameuistate change
        viewModelScope.launch {
            game.onStateChange()
        }

        viewModelScope.launch {
            gameId?.let {

                val other = ludoStateDomain.getLudoAndOther(it).first()
                //get game from data
                val ludoState = LudoGame
                    .getDefaultGameState()
                    .copy(listOfPlayer = other.first, listOfPawn = other.second)

                startGame(ludoState)
            }
        }

    }

    private suspend fun startGame(ludoGameState: LudoGameState?=null){

            delay(300)
            game.start(
                ludoGameState = ludoGameState,
                onGameFinish = this@GameViewModel::onGameFinish,
                onPlayerFinishPlaying = this@GameViewModel::onPlayerFinishPlaying
            )


    }

    fun onYouAndComputer() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)
        savedStateHandle[SHOWDIALOG] = false

        viewModelScope.launch(Dispatchers.Default) {

         startGame()
        }
    }

    fun onContinueClick(){
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)
        savedStateHandle[SHOWDIALOG] = false

        viewModelScope.launch(Dispatchers.Default) {

            val id= ludoStateDomain.getLatestGameId().first()

            gameId = id

            val other = ludoStateDomain.getLudoAndOther(id).first()

            val pawns= other.second.toMutableList()

            if(pawns.all { it.isOut() }){
                (0 until pawns.size).forEach {
                    val pawn= pawns[it]
                    pawns[it]=pawn.copy(currentPos =pawn.id*-1 )
                }
            }

            val ludoState = LudoGame
                .getDefaultGameState()
                .copy(listOfPlayer = other.first, listOfPawn = pawns)

            startGame(ludoState)
        }
    }


    fun onTournament() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)
        viewModelScope.launch(Dispatchers.Default) {
            val players = listOf(
                RandomComputerPlayer(
                    colors = listOf(GameColor.values()[0])
                ),
                RandomComputerPlayer(

                    colors = listOf(GameColor.values()[1])
                ),
                RandomComputerPlayer(

                    colors = listOf(GameColor.values()[2])
                ),
                HumanPlayer(isCurrent = true, colors = listOf(GameColor.values()[3]))
            )
            val ludoGameState = LudoGame.getDefaultGameState().copy(listOfPlayer = players)

            startGame(ludoGameState)
        }
    }

    fun onResume() {
        game.resume()
    }

    fun onPause() {
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

                val id = ludoStateDomain.insertLudo(game.gameState.value, gameId)

                if (gameId == null) {
                    savedStateHandle[GAMEID] = id
                    gameId = id
                }

            }
        }
    }

    private fun onPlayerFinishPlaying(){
        saveData()
    }


    companion object {
        const val GAMEID = "game_id"
        const val SHOWDIALOG = "show_dialog"
    }

}