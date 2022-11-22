package com.mshdabiola.gamescreen

import com.mshdabiola.gamescreen.state.BoardUiState
import com.mshdabiola.gamescreen.state.LudoUiState

data class GameUiState(
    val ludoGameState: LudoUiState = LudoUiState(board = BoardUiState()),
    val isStartDialogOpen: Boolean = true,
    val isRestartDialogOpen: Boolean = false,
    val showContinueButton: Boolean = false,
    val music: Boolean = false,
    val sound: Boolean = false
)
