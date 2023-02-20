package com.mshdabiola.naijaludo.model

data class LudoSetting(
    val level: Int = 0,
    val assist: Boolean = true,
    val style: Int = 0,
    val numberOfPawn: Int = 4,
    val rotateBoard: Boolean = true,
    val boardType: Int = 0,
)
