package com.mshdabiola.gamescreen

data class GameUiState(
    val isStartDialogOpen: Boolean = true,
    val isRestartDialogOpen: Boolean = false,
    val showContinueButton: Boolean = false,
    val isWaitingDialogOpen: Boolean = false,
    val isDeviceDialogOpen: Boolean = false,
    val music: Boolean = false,
    val sound: Boolean = false
)
