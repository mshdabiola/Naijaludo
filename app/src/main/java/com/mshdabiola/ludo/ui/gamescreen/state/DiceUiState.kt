package com.mshdabiola.ludo.ui.gamescreen.state

import com.mshdabiola.naijaludo.state.Dice

data class DiceUiState(
    val id: Int = 1,
    val isEnable: Boolean = false,
    val animate: Boolean = false,
    val number: Int = 1
)

fun Dice.toDiceUiState()=DiceUiState(id, isEnable, animate, number)
