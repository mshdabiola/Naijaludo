package com.mshdabiola.ludo.ui.gamescreen.state

import androidx.compose.runtime.Immutable
import com.mshdabiola.naijaludo.state.Board
import com.mshdabiola.naijaludo.state.GameColor

@Immutable
data class BoardUiState(
    val colors : List<GameColor>,
    val homeBoxes : List<BoxUiState>,
    val pathBoxes : List<BoxUiState>,
    val heavenBoxes : List<BoxUiState>
)

fun Board.toBoardUiState()=BoardUiState(
    colors=colors,
    homeBoxes = bigHomeBoxes.map { it.toBoxUiState() },
    pathBoxes = paths.map { it.toBoxUiState() },
    heavenBoxes = safePath.map { it.toBoxUiState() }
    )
