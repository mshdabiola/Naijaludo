package com.mshdabiola.gamescreen.state

import androidx.compose.runtime.Immutable
import com.mshdabiola.naijaludo.model.GameType
import com.mshdabiola.naijaludo.model.LudoGameState
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

@Immutable
data class LudoUiState(
    val listOfPlayer: ImmutableList<PlayerUiState> = emptyList<PlayerUiState>().toImmutableList(),
    val listOfDice: ImmutableList<DiceUiState> = emptyList<DiceUiState>().toImmutableList(),
    val listOfPawn: ImmutableList<PawnUiState> = emptyList<PawnUiState>().toImmutableList(),
    val listOfCounter: ImmutableList<CounterUiState> =
        emptyList<CounterUiState>().toImmutableList(),
    val drawer: ImmutableList<PawnUiState>? = null,
    val board: BoardUiState,
    val isHumanPlayer: Boolean = false,
    val rotate: Boolean = false,
    val numGamePlay: Int = 0,
    val gameType: GameType = GameType.COMPUTER,
)

fun LudoGameState.toLudoUiState() =
    LudoUiState(
        listOfPlayer = listOfPlayer.map { it.toPlayerUiState() }.toImmutableList(),
        listOfDice = listOfDice.filter { !it.isTotal }.map { it.toDiceUiState() }.toImmutableList(),
        listOfPawn = listOfPawn.map { it.toPawnUiState() }.toImmutableList(),
        listOfCounter = listOfCounter.map { it.toCounterUiState() }.toImmutableList(),
        drawer = listOfPawnDrawer?.map { it.toPawnUiState() }?.toImmutableList(),
        board = board.toBoardUiState(),
        isHumanPlayer = isHumanPlayer,
        rotate = rotate,
        numGamePlay = numGamePlay,
        gameType = gameType,
    )
