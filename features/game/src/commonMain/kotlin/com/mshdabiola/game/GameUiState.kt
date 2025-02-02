package com.mshdabiola.game

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

data class GameUiState(
    val isStartDialogOpen: Boolean = true,
    val isRestartDialogOpen: Boolean = false,
    val isWaitingDialogOpen: Boolean = false,
    val isDeviceDialogOpen: Boolean = false,
    val navigateBackBcosOfBlueError: Boolean = false,
    val listOfDevice: ImmutableList<String> = emptyList<String>().toImmutableList(),
    val connected: Boolean = false,
    val boardName: String = "",
)
