package com.mshdabiola.naijaludo.model

import kotlin.math.abs

class Board(val colors: List<GameColor> = GameColor.values().toList(), val boardType: Int = 0) {
    init {
        Constant.colors=colors
    }
}
