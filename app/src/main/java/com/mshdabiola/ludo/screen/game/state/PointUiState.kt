package com.mshdabiola.ludo.screen.game.state

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.IntOffset
import com.mshdabiola.naijaludo.model.Point

data class PointUiState(val x: Float, val y: Float) {
    companion object {
        val Zero = PointUiState(0f, 0f)
    }
}

fun Point.toPointUiState() = PointUiState(x, y)

fun PointUiState.toIntOffset()= IntOffset(x.toInt(),y.toInt())
