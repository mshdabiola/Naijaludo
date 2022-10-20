package com.mshdabiola.ludo.ui.gamescreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.ludo.ui.gamescreen.state.toLudoUiState
import com.mshdabiola.naijaludo.LudoGame
import com.mshdabiola.naijaludo.state.Counter
import com.mshdabiola.naijaludo.state.GameColor
import com.mshdabiola.naijaludo.state.Point
import com.mshdabiola.naijaludo.state.player.HumanPlayer
import com.mshdabiola.naijaludo.state.player.RandomComputerPlayer
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch

class GameViewModel : ViewModel() {

    val game = LudoGame()
    private val _gameUiState = MutableStateFlow(GameUiState())
    val gameUiState = _gameUiState.asStateFlow()


    init {

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

    }

    fun onYouAndComputer() {


        viewModelScope.launch {
            _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)
            delay(300)
            game.start(onGameFinish = this@GameViewModel::onGameFinish)
        }
    }


    fun onTournament() {
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)
        viewModelScope.launch {
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
                HumanPlayer(isCurrent = true,colors = listOf(GameColor.values()[3]))
            )
            game.start(
                LudoGame.getDefaultGameState().copy(listOfPlayer = players),
               // isGameFinish = { pawns -> pawns.any { it.isOut() } },
                onGameFinish = this@GameViewModel::onGameFinish
            )
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

    fun onPawn(index: Int,isDrawer: Boolean=false) {
        game.onPawn(index, isDrawer)
    }

    fun getPositionIntOffset(id: Int, gameColor: GameColor): Point {
      return  game.getPositionIntOffset(id,gameColor)
    }


}