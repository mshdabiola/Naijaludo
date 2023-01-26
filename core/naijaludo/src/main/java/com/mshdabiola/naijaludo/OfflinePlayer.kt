package com.mshdabiola.naijaludo

import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.player.Player

data class OfflinePlayer(

    override val name: String = "C. Player",
    override val win: Int = 0,
    override val isCurrent: Boolean = false,
    override val colors: List<GameColor> = emptyList(),
    override val iconIndex: Int = 0,
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
            iconIndex = iconIndex,
        )
    }
}

fun ByteArray.trim(size: Int): ByteArray {
    val data = ByteArray(size)
    System.arraycopy(this, 0, data, 0, size)
    return data
}
