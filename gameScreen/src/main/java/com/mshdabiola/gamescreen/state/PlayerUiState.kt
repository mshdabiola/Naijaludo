package com.mshdabiola.gamescreen.state

import androidx.compose.runtime.Immutable
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.player.PlayerInteface

@Immutable
data class PlayerUiState(
    val name: String="Player",
    val win : Int=9,
    val isCurrent: Boolean=false,
    val colors: List<GameColor> = listOf(GameColor.RED,GameColor.BLUE)
)

fun PlayerInteface.toPlayerUiState()
= PlayerUiState(
    name, win, isCurrent, colors
)
