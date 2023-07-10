package com.mshdabiola.ludo.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mshdabiola.designsystem.theme.LudoAppTheme
import com.mshdabiola.ludo.navigation.LudoNavHost
import com.mshdabiola.navigation.IRootComponent

@Composable
fun LudoApp(
    iRootComponent: IRootComponent,
    windowSizeClass: WindowSizeClass,
    appState: LudoAppState = rememberLudoAppState(windowSizeClass = windowSizeClass),
) {

        LudoNavHost(
            iRootComponent = iRootComponent,
            modifier = Modifier.fillMaxSize(),
            deviceType = appState.getDevietype()
        )
        // change display here

}
