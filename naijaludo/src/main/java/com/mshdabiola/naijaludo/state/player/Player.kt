package com.mshdabiola.naijaludo.state.player

import com.mshdabiola.naijaludo.state.GameColor

sealed class Player(
    open val name: String,
    open val win : Int,
    open val isCurrent: Boolean,
    open val colors: List<GameColor>
)
