package com.mshdabiola.mainscreen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mshdabiola.ludo.model.navigation.DEVICE_TYPE

const val mainRoute = "main_route"

fun NavGraphBuilder.mainScreen(navigateTo: () -> Unit, deviceType: DEVICE_TYPE) {
    composable(route = mainRoute) {
        MainScreen(navigateTo = navigateTo, deviceType = deviceType)
    }
}

fun NavController.navigateTomain() {
    navigate(route = mainRoute)
}

