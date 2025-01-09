package com.mshdabiola.ui.state

import androidx.compose.ui.unit.IntOffset
import com.mshdabiola.naijaludo.model.Point

data class PointUiState(val x: Int, val y: Int) {
    companion object {
        val Zero = PointUiState(0, 0)
    }
}

fun Point.toPointUiState() = PointUiState(x, y)

fun PointUiState.toIntOffset() = IntOffset(x.toInt(), y.toInt())
