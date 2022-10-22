package com.mshdabiola.gamescreen

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.database.LudoStateDomain
import com.mshdabiola.gamescreen.state.toLudoUiState
import com.mshdabiola.ludo.model.GameColor
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
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GameViewModel @Inject constructor(
   val savedStateHandle: SavedStateHandle,
   val ludoStateDomain: LudoStateDomain
) : ViewModel() {

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
        _gameUiState.value = gameUiState.value.copy(isStartDialogOpen = false)

        viewModelScope.launch(Dispatchers.Default) {

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

    fun onDispose(){
        viewModelScope.launch (Dispatchers.IO){
            ludoStateDomain.insertLudo(game.gameState.value)
        }
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