package com.mshdabiola.naijaludo.model.player

import com.mshdabiola.naijaludo.model.GameColor
import kotlinx.serialization.Serializable

@Serializable
data class SavePlayer(
    override val name: String = "C. Player",
    override val win: Int = 0,
    override val isCurrent: Boolean = false,
    override val colors: List<GameColor>,
    override val iconIndex: Int,
    val isHumanPlayer: Boolean = false
) : Player {
    override fun copyPlayer(
        name: String,
        win: Int,
        isCurrent: Boolean,
        colors: List<GameColor>
    ): Player {
        return copy(
            name = name,
            win = win,
            isCurrent = isCurrent,
            colors = colors,
        )
    }

    fun toOriginal(): Player {
        return if (isHumanPlayer)
            HumanPlayer(name, win, isCurrent, colors, iconIndex)
        else
            RandomComputerPlayer(name, win, isCurrent, colors, iconIndex)
    }

}

fun Player.toSaver() =
    if (this is HumanPlayer) SavePlayer(name, win, isCurrent, colors, iconIndex, true)
    else SavePlayer(name, win, isCurrent, colors, iconIndex)