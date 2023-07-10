package com.mshdabiola.desktop.nav

import androidx.compose.runtime.Composable

sealed interface ChildComponent{
    @Composable
    fun render()
}
