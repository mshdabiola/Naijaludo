package com.mshdabiola.ludo.screen.market

import androidx.compose.runtime.Composable
import com.mshdabiola.ludo.screen.DEVICE_TYPE
import com.mshdabiola.ludo.screen.GeneralViewModel
import org.koin.androidx.compose.koinViewModel


@Composable
fun MarketScreenNav(deviceType: DEVICE_TYPE, onBack: () -> Unit) {

    val viewModel: GeneralViewModel = koinViewModel()
    MarketScreen(viewModel = viewModel, deviceType = deviceType, onBack = onBack)
}


