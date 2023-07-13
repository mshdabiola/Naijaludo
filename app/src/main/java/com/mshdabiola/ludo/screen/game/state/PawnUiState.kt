package com.mshdabiola.ludo.screen.game.state

import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.naijaludo.model.Pawn

data class PawnUiState(
    val colorNumber: Int = 0,
    val pawnId: Int = 0,
    val currentPos: Int = 0,
    val color: GameColor = GameColor.RED,
    val isEnable: Boolean = false,
    val zIndex: Float = 1f,
)

fun Pawn.toPawnUiState() =
    PawnUiState(
        colorNumber = colorNumber,
        pawnId = pawnId,
        currentPos = currentPos,
        color = color,
        isEnable = isEnable,
        zIndex = zIndex
    )



fun PawnUiState.showText() = zIndex.toInt() > 1 && currentPos < 56
