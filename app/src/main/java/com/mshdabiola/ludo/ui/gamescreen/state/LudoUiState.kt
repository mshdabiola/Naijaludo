package com.mshdabiola.ludo.ui.gamescreen.state

import androidx.compose.runtime.Immutable
import com.mshdabiola.naijaludo.state.LudoGameState

@Immutable
data class LudoUiState(
    val listOfPlayer: List<PlayerUiState> = emptyList(),
    val listOfDice: List<DiceUiState> = emptyList(),
    val listOfPawn: List<PawnUiState> = emptyList(),
    val listOfCounter: List<CounterUiState> = emptyList(),
    val drawer: DrawerUiState? = null,
    val board: BoardUiState,
    val isHumanPlayer: Boolean = false,
    val rotate: Boolean = false,
    val numGamePlay: Int = 0
)

fun LudoGameState.toLudoUiState() =
    LudoUiState(
        listOfPlayer = listOfPlayer.map { it.toPlayerUiState() },
        listOfDice = listOfDice.filter { !it.isTotal }.map { it.toDiceUiState() },
        listOfPawn = listOfPawn.map { it.toPawnUiState() },
        listOfCounter = listOfCounter.map { it.toCounterUiState() },
        drawer = drawer?.toDrawerUiState(),
        board = board.toBoardUiState(),
        isHumanPlayer, rotate, numGamePlay
    )
