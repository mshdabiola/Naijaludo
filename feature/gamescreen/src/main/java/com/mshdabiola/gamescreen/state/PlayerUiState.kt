package com.mshdabiola.gamescreen.state

import androidx.compose.runtime.Immutable
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.player.ComputerPlayer
import com.mshdabiola.ludo.model.player.Player

@Immutable
data class PlayerUiState(
    val name: String = "Player",
    val win: Int = 9,
    val isCurrent: Boolean = false,
    val colors: List<GameColor> = listOf(GameColor.RED, GameColor.BLUE),
    val iconIndex: Int = 0,
    val isComputer: Boolean = false,
)

fun Player.toPlayerUiState() =
    PlayerUiState(
        name,
        win,
        isCurrent,
        colors,
        iconIndex = iconIndex,
        isComputer = this is ComputerPlayer,
    )
