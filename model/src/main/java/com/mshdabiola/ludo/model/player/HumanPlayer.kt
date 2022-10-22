package com.mshdabiola.ludo.model.player

import com.mshdabiola.ludo.model.GameColor

data class HumanPlayer (
    override val name : String="Human",
    override val win : Int =0,
    override val isCurrent: Boolean = false,
    override val colors: List<GameColor> = emptyList()
) : Player(name, win, isCurrent, colors),PlayerIn
