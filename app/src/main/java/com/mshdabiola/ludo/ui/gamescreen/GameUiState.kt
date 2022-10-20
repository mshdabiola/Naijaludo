package com.mshdabiola.ludo.ui.gamescreen

import com.mshdabiola.ludo.ui.gamescreen.state.BoardUiState
import com.mshdabiola.ludo.ui.gamescreen.state.LudoUiState

data class GameUiState(
    val ludoGameState: LudoUiState = LudoUiState(board = BoardUiState()),
    val isStartDialogOpen: Boolean = true,
    val isRestartDialogOpen: Boolean = false
)
