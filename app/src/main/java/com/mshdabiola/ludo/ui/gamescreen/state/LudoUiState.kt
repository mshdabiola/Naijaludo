package com.mshdabiola.ludo.ui.gamescreen.state

import androidx.compose.runtime.Immutable
import com.mshdabiola.ludo.model.LudoGameState
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

@Immutable
data class LudoUiState(
    val listOfPlayer: ImmutableList<PlayerUiState> = emptyList<PlayerUiState>().toImmutableList(),
    val listOfDice: ImmutableList<DiceUiState> = emptyList<DiceUiState>().toImmutableList(),
    val listOfPawn: ImmutableList<PawnUiState> = emptyList<PawnUiState>().toImmutableList(),
    val listOfCounter: ImmutableList<CounterUiState> = emptyList<CounterUiState>().toImmutableList(),
    val drawer: DrawerUiState? = null,
    val board: BoardUiState,
    val isHumanPlayer: Boolean = false,
    val rotate: Boolean = false,
    val numGamePlay: Int = 0
)

fun LudoGameState.toLudoUiState() =
    LudoUiState(
        listOfPlayer = listOfPlayer.map { it.toPlayerUiState() }.toImmutableList(),
        listOfDice = listOfDice.filter { !it.isTotal }.map { it.toDiceUiState() }.toImmutableList(),
        listOfPawn = listOfPawn.map { it.toPawnUiState() }.toImmutableList(),
        listOfCounter = listOfCounter.map { it.toCounterUiState() }.toImmutableList(),
        drawer = drawer?.toDrawerUiState(),
        board = board.toBoardUiState(),
        isHumanPlayer, rotate, numGamePlay
    )
