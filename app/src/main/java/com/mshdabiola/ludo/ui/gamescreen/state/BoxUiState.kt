package com.mshdabiola.ludo.ui.gamescreen.state

import com.mshdabiola.naijaludo.state.Box
import com.mshdabiola.naijaludo.state.GameColor
import com.mshdabiola.naijaludo.state.Point

data class BoxUiState(
    val point: Point,
    val color: GameColor = GameColor.RED,
    val showColor: Boolean = false,
)

fun Box.toBoxUiState()=BoxUiState(point, color, showColor)
