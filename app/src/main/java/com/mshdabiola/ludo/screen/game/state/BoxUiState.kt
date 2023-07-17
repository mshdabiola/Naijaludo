package com.mshdabiola.ludo.screen.game.state

import com.mshdabiola.naijaludo.model.Box
import com.mshdabiola.naijaludo.model.GameColor

data class BoxUiState(
    val point: PointUiState,
    val color: GameColor = GameColor.RED,
    val showColor: Boolean = false,
)

fun Box.toBoxUiState() = BoxUiState(point.toPointUiState(), color, showColor)
