package com.mshdabiola.naijaludo.state

data class Dice(
    val id: Int = 1,
    val isEnable: Boolean = false,
    val animate: Boolean = false,
    val isTotal: Boolean = false,
    val number: Int = 1
)