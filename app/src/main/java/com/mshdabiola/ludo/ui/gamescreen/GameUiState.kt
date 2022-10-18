package com.mshdabiola.ludo.ui.gamescreen

import com.mshdabiola.ludo.ui.gamescreen.state.LudoUiState
import com.mshdabiola.ludo.ui.gamescreen.state.toLudoUiState
import com.mshdabiola.naijaludo.LudoGame
import com.mshdabiola.naijaludo.state.LudoGameState

data class GameUiState(
    val ludoGameState: LudoUiState = LudoGame.getDefaultGameState().toLudoUiState(),
    val isStartDialogOpen: Boolean = true,
    val isRestartDialogOpen: Boolean = false
)
