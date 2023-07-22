package com.mshdabiola.ludo.screen.game.state

import androidx.compose.runtime.Immutable
import com.mshdabiola.naijaludo.model.Board
import com.mshdabiola.naijaludo.model.GameColor

// ToDo("change it to immutable list")
@Immutable
data class BoardUiState(
//    val rotate: Boolean ,
    val boardType: Int = 0,
    val colors: List<GameColor> = emptyList(),
    val homeBoxes: List<BoxUiState> = emptyList(),
    val pathBoxes: List<BoxUiState> = emptyList(),
    val heavenBoxes: List<BoxUiState> = emptyList(),
)

fun Board.toBoardUiState() = BoardUiState(
    boardType = boardType,
    colors = colors,
//    homeBoxes = bigHomeBoxes.map { it.toBoxUiState() },
//    pathBoxes = paths.map { it.toBoxUiState() },
//    heavenBoxes = safePath.map { it.toBoxUiState() },
)
