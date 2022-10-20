package com.mshdabiola.ludo.ui.gamescreen.state

import com.mshdabiola.ludo.model.Counter

data class CounterUiState(
    val id: Int = 0,
    val isEnable: Boolean = false,
    val number: Int = 0
)

fun Counter.toCounterUiState()= CounterUiState(id, isEnable, number)
