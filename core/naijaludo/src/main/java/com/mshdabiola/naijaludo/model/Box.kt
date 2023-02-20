package com.mshdabiola.naijaludo.model
data class Box(
    val point: Point,
    val color: GameColor = GameColor.RED,
    val showColor: Boolean = false,
    val isSafeArea: Boolean = false,
    val isHome: Boolean = false,

    )
