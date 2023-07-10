package com.mshdabiola.ludo.screen.game.state

import com.mshdabiola.naijaludo.model.Counter

data class CounterUiState(
    val id: Int = 0,
    val isEnable: Boolean = false,
    val number: Int = 0,
)

fun Counter.toCounterUiState() = CounterUiState(id, isEnable, number)
