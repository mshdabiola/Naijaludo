package com.mshdabiola.gamescreen.state

import com.mshdabiola.ludo.model.Box
import com.mshdabiola.ludo.model.GameColor

data class BoxUiState(
    val point: PointUiState,
    val color: GameColor = GameColor.RED,
    val showColor: Boolean = false,
)

fun Box.toBoxUiState() = BoxUiState(point.toPointUiState(), color, showColor)
