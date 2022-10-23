package com.mshdabiola.gamescreen.state

import androidx.compose.runtime.Immutable
import com.mshdabiola.ludo.model.Drawer

@Immutable
data class DrawerUiState(
    val listOfPawnUiState: List<PawnUiState> = emptyList()
)

fun Drawer.toDrawerUiState()
=DrawerUiState(pawns.map { it.toPawnUiState() })