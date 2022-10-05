package com.mshdabiola.naijaludo.state
data class Box(
    val point: Point,
    val color: GameColor = GameColor.RED,
    val showColor: Boolean = false,
    val isSafeArea: Boolean = false,
    val isHome: Boolean = false

)

