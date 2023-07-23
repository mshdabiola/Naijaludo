package com.mshdabiola.ludo.screen.game.state

import androidx.compose.runtime.Immutable
import com.mshdabiola.naijaludo.model.Board
import com.mshdabiola.naijaludo.model.GameColor

// ToDo("change it to immutable list")
@Immutable
data class BoardUiState(
    val boardType: Int = 0,
    val colors: List<GameColor> = emptyList(),
)

fun Board.toBoardUiState() = BoardUiState(
    boardType = boardType,
    colors = colors,
)
