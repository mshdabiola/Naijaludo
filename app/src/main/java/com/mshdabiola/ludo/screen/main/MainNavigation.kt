package com.mshdabiola.ludo.screen.main

import androidx.compose.runtime.Composable
import com.mshdabiola.ludo.screen.DEVICE_TYPE
import com.mshdabiola.ludo.screen.GeneralViewModel
import org.koin.androidx.compose.koinViewModel


@Composable
fun MainScreenNav(navigateTo: () -> Unit, deviceType: DEVICE_TYPE) {

    val viewModel: GeneralViewModel = koinViewModel()
    MainScreen(mainViewModel = viewModel, navigateTo = navigateTo, deviceType = deviceType)

}

