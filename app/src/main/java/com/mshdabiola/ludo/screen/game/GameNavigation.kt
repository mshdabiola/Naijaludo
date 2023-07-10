package com.mshdabiola.ludo.screen.game

import androidx.compose.runtime.Composable
import com.mshdabiola.ludo.screen.DEVICE_TYPE
import com.mshdabiola.ludo.screen.GeneralViewModel
import org.koin.androidx.compose.koinViewModel


@Composable
fun GameScreenNav(deviceType: DEVICE_TYPE, onBack: () -> Unit) {

    val viewModel: GeneralViewModel = koinViewModel()
    GameScreen(gameScreenViewModel = viewModel, deviceType = deviceType, onBack = onBack)
}


