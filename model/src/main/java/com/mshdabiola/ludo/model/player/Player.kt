package com.mshdabiola.ludo.model.player

import com.mshdabiola.ludo.model.GameColor

sealed class Player(
    open val name: String,
    open val win : Int,
    open val isCurrent: Boolean,
    open val colors: List<GameColor>
)
