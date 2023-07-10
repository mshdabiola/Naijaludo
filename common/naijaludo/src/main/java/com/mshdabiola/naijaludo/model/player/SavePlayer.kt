package com.mshdabiola.naijaludo.model.player

import com.mshdabiola.naijaludo.model.GameColor
import kotlinx.serialization.Serializable

@Serializable
data class SavePlayer(
    val name: String = "C. Player",
    val win: Int = 0,
    val isCurrent: Boolean = false,
    val colors: List<GameColor>,
    val iconIndex: Int,
    val isHumanPlayer: Boolean = false
) {


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