package com.mshdabiola.naijaludo.model.player

import com.mshdabiola.naijaludo.model.GameColor


data class HumanPlayer(
    override val name: String = "Human",
    override val win: Int = 0,
    override val isCurrent: Boolean = false,
    override val colors: List<GameColor> = emptyList(),
    override val iconIndex: Int,
) : Player {

    override fun copyPlayer(
        name: String,
        win: Int,
        isCurrent: Boolean,
        colors: List<GameColor>,
    ): Player {
        return copy(
            name = name,
            win = win,
            isCurrent = isCurrent,
            colors = colors,
        )
    }
}
