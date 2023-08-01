package com.mshdabiola.ludo.screen.market

import androidx.compose.runtime.Composable
import com.mshdabiola.ludo.screen.DEVICE_TYPE
import com.mshdabiola.ludo.screen.GeneralViewModel
import com.mshdabiola.setting.MultiplatformSettings
import org.koin.androidx.compose.koinViewModel
import org.koin.compose.koinInject


@Composable
fun MarketScreenNav(deviceType: DEVICE_TYPE, onBack: () -> Unit) {

    val viewModel: GeneralViewModel = koinViewModel()
    val setting : MultiplatformSettings= koinInject()
    MarketScreen(settings = setting, deviceType = deviceType, onBack = onBack)
}


