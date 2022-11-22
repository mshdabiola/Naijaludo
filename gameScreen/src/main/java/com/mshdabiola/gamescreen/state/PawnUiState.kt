package com.mshdabiola.gamescreen.state

import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.Pawn

data class PawnUiState(
    val index: Int = 0,
    val currentPos: Int = 0,
    val color: GameColor = GameColor.RED,
    val isEnable: Boolean = false,
    val zIndex: Float = 1f
)

fun Pawn.toPawnUiState() =
    PawnUiState(index, currentPos, color, isEnable, zIndex)
