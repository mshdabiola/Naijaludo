package com.mshdabiola.gamescreen.state

import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.naijaludo.model.Pawn

data class PawnUiState(
    val idx: Int = 0,
    val currentPos: Int = 0,
    val color: GameColor = GameColor.RED,
    val isEnable: Boolean = false,
    val zIndex: Float = 1f,
)

fun Pawn.toPawnUiState() =
    PawnUiState(idx, currentPos, color, isEnable, zIndex)

fun PawnUiState.showText() = zIndex.toInt() > 1 && currentPos < 56
