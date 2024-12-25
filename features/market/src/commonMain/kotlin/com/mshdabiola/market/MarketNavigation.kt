package com.mshdabiola.market

import androidx.compose.runtime.Composable
import com.mshdabiola.model.DEVICE_TYPE
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MarketScreenNav(deviceType: DEVICE_TYPE, onBack: () -> Unit) {
    val viewModel: GeneralViewModel = koinViewModel()
//    MarketScreen(settings = setting, deviceType = deviceType, onBack = onBack)
}
