package com.mshdabiola.ludo.screen.game.state

import com.mshdabiola.naijaludo.model.Dice

data class DiceUiState(
    val id: Int = 1,
    val isEnable: Boolean = false,
    val animate: Boolean = false,
    val number: Int = 1,
    val color:Long=0xFF00FF00
)

fun Dice.toDiceUiState() = DiceUiState(
    id = id,
    isEnable = isEnable,
    animate = animate,
    number = number
)
