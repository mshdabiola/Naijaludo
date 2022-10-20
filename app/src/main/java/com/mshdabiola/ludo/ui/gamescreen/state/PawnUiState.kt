package com.mshdabiola.ludo.ui.gamescreen.state

import androidx.compose.ui.unit.IntOffset
import com.mshdabiola.naijaludo.state.GameColor
import com.mshdabiola.naijaludo.state.Pawn

data class PawnUiState(
    val index: Int = 0,
    val currentPos: Int =0,
    val color: GameColor = GameColor.RED,
    val isEnable: Boolean = false,
    val zIndex: Float = 1f
)

fun Pawn.toPawnUiState()
=PawnUiState(index,currentPos,color, isEnable, zIndex)
