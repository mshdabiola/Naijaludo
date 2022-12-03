package com.mshdabiola.ludo.model.player

import com.mshdabiola.ludo.model.GameColor

sealed interface Player {
    val name: String
    val win: Int
    val isCurrent: Boolean
    val colors: List<GameColor>
    val iconIndex: Int
}
