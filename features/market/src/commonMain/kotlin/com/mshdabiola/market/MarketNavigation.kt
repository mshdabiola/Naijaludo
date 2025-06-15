package com.mshdabiola.market

import androidx.compose.runtime.Composable
import com.mshdabiola.model.PhoneType
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MarketScreenNav(
    deviceType: PhoneType,
    onBack: () -> Unit,
) {
    val viewModel: MarketViewModel = koinViewModel()
//    MarketScreen(settings = setting, deviceType = deviceType, onBack = onBack)
}
