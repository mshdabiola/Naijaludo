package com.mshdabiola.naijaludo.model.player

import com.mshdabiola.naijaludo.model.GameColor


interface Player {
    val name: String
    val win: Int
    val isCurrent: Boolean
    val colors: List<GameColor>
    val iconIndex: Int

    fun copyPlayer(
        name: String = this.name,
        win: Int = this.win,
        isCurrent: Boolean = this.isCurrent,
        colors: List<GameColor> = this.colors,
    ): Player
}
