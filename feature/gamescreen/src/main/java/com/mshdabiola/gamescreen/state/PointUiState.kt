package com.mshdabiola.gamescreen.state

import com.mshdabiola.naijaludo.model.Point

data class PointUiState(val x: Float, val y: Float) {
    companion object {
        val Zero = PointUiState(0f, 0f)
    }
}

fun Point.toPointUiState() = PointUiState(x, y)
