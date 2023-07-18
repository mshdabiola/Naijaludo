package com.mshdabiola.ludo.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTagsAsResourceId
import com.mshdabiola.ludo.navigation.LudoNavHost
import com.mshdabiola.navigation.IRootComponent

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun LudoApp(
    iRootComponent: IRootComponent,
    windowSizeClass: WindowSizeClass,
    appState: LudoAppState = rememberLudoAppState(windowSizeClass = windowSizeClass),
) {

    LudoNavHost(
        iRootComponent = iRootComponent,
        modifier = Modifier
            .fillMaxSize()
            .semantics {
                testTagsAsResourceId = true
            },
        deviceType = appState.getDevietype()
    )
    // change display here

}
