package com.mshdabiola.ludo.model

data class LudoSetting(
    val level: Int = 2,
    val assist: Boolean = true,
    val style: Int = 1,
    val numberOfPawn: Int = 4,
    val rotateBoard: Boolean = true,
    val boardType: Int = 0
)
