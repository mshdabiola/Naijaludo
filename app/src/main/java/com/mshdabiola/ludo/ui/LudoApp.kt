package com.mshdabiola.ludo.ui

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mshdabiola.designsystem.theme.LudoAppTheme
import com.mshdabiola.ludo.navigation.LudoNavHost

@Composable
fun LudoApp(
    windowSizeClass: WindowSizeClass,
    appState: LudoAppState = rememBerLudoAppState(windowSizeClass = windowSizeClass),
) {

        LudoNavHost(
            modifier = Modifier,
            navController = appState.navHostController,
            deviceType = appState.getDevietype()
        )
        // change display here

}
