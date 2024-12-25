package com.mshdabiola.ui.state

import androidx.compose.runtime.Immutable
import com.mshdabiola.naijaludo.model.Board
import com.mshdabiola.naijaludo.model.GameColor
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

// ToDo("change it to immutable list")
@Immutable
data class BoardUiState(
    val boardType: Int = 0,
    val colors: ImmutableList<GameColor> = emptyList<GameColor>().toImmutableList(),
)

fun Board.toBoardUiState() = BoardUiState(
    boardType = boardType,
    colors = colors.toImmutableList(),
)
