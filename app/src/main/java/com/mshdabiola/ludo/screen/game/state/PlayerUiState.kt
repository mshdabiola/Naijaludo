package com.mshdabiola.ludo.screen.game.state

import androidx.compose.runtime.Immutable
import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.naijaludo.model.player.ComputerPlayer
import com.mshdabiola.naijaludo.model.player.HumanPlayer
import com.mshdabiola.naijaludo.model.player.Player
import com.mshdabiola.naijaludo.model.player.RandomComputerPlayer

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

fun PlayerUiState.toSaverPlayer() =
    if (isComputer)
        RandomComputerPlayer(name, win, isCurrent, colors, iconIndex)
    else
        HumanPlayer(name, win, isCurrent, colors, iconIndex)
