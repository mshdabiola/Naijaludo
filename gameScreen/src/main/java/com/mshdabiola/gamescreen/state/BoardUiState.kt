package com.mshdabiola.gamescreen.state

import androidx.compose.runtime.Immutable
import com.mshdabiola.ludo.model.Board
import com.mshdabiola.ludo.model.GameColor

@Immutable
data class BoardUiState(
    val colors : List<GameColor> = emptyList(),
    val homeBoxes : List<BoxUiState> = emptyList(),
    val pathBoxes : List<BoxUiState> = emptyList(),
    val heavenBoxes : List<BoxUiState> = emptyList()
)

fun Board.toBoardUiState()=BoardUiState(
    colors=colors,
    homeBoxes = bigHomeBoxes.map { it.toBoxUiState() },
    pathBoxes = paths.map { it.toBoxUiState() },
    heavenBoxes = safePath.map { it.toBoxUiState() }
    )
