package com.mshdabiola.ludo.ui.gamescreen

import com.mshdabiola.naijaludo.LudoGame
import com.mshdabiola.naijaludo.state.LudoGameState

data class GameUiState(
    val ludoGameState: LudoGameState = LudoGame.getDefaultGameState(),
    val isStartDialogOpen: Boolean = true,
    val isRestartDialogOpen: Boolean = false
)
