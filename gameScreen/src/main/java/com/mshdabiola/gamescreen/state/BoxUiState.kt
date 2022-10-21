package com.mshdabiola.gamescreen.state

import com.mshdabiola.ludo.model.Box
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.Point

data class BoxUiState(
    val point: Point,
    val color: GameColor = GameColor.RED,
    val showColor: Boolean = false,
)

fun Box.toBoxUiState()=BoxUiState(point, color, showColor)
