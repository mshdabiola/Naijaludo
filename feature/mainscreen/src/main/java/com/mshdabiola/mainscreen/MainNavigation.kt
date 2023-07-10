package com.mshdabiola.mainscreen

import androidx.compose.runtime.Composable
@Composable
fun MainScreenNav(onBack: () -> Unit) {
    MainScreen {
        onBack()
    }
}

