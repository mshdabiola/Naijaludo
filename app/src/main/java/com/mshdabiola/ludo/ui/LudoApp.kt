package com.mshdabiola.ludo.ui

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mshdabiola.ludo.navigation.LudoNavHost
import com.mshdabiola.ludo.ui.theme.NaijaLudoTheme

@Composable
fun LudoApp(
    windowSizeClass: WindowSizeClass,
    appState: LudoAppState = rememBerLudoAppState(windowSizeClass = windowSizeClass)
) {
    NaijaLudoTheme {
        LudoNavHost(
            modifier = Modifier,
            navController = appState.navHostController,
            onNavigate = appState::navigateTo,
            onBackClick = appState::onBackPressed,
        )
        //change display here
    }

}