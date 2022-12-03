package com.mshdabiola.ludo.model.player

import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.LudoGameState

data class HumanPlayer(
    override val name: String = "Human",
    override val win: Int = 0,
    override val isCurrent: Boolean = false,
    override val colors: List<GameColor> = emptyList(),
    override val iconIndex: Int
) : LocalPlayer {
    override fun chooseCounter(gameState: LudoGameState): Int {
        TODO("Not yet implemented")
    }

    override fun choosePawn(gameState: LudoGameState): Int {
        TODO("Not yet implemented")
    }

    override fun copyPlayer(
        name: String,
        win: Int,
        isCurrent: Boolean,
        colors: List<GameColor>
    ): LocalPlayer {
        return copy(
            name = name,
            win = win,
            isCurrent = isCurrent,
            colors = colors
        )
    }
}
