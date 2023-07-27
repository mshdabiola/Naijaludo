package com.mshdabiola.ludo.screen.main

import androidx.compose.runtime.Composable
import com.mshdabiola.ludo.screen.DEVICE_TYPE
import com.mshdabiola.ludo.screen.GeneralViewModel
import org.koin.androidx.compose.koinViewModel


@Composable
fun MainScreenNav(
    navigateToGame: () -> Unit,
    navigateToMarket: () -> Unit,
    deviceType: DEVICE_TYPE
) {

    val viewModel: GeneralViewModel = koinViewModel()
    MainScreen(
        mainViewModel = viewModel,
        navigateToGame = navigateToGame,
        navigateToMarket = navigateToMarket,
        deviceType = deviceType
    )

}

