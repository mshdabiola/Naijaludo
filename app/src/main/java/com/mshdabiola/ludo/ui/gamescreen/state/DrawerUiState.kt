package com.mshdabiola.ludo.ui.gamescreen.state

import androidx.compose.runtime.Immutable
import com.mshdabiola.naijaludo.state.Drawer

@Immutable
data class DrawerUiState(
    val listOfPawnUiState: List<PawnUiState> = emptyList()
)

fun Drawer.toDrawerUiState()
=DrawerUiState(pawns.map { it.toPawnUiState() })