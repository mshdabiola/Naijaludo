package com.mshdabiola.gamescreen


import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mshdabiola.ludo.model.navigation.DEVICE_TYPE

const val gameRoute = "game_route"

fun NavGraphBuilder.gameScreen(deviceType: DEVICE_TYPE, onBack: () -> Unit) {
    composable(route = gameRoute) {
        GameScreen(deviceType = deviceType, onBack = onBack)
    }
}

fun NavController.navigateToGame() {
    navigate(route = gameRoute)
}

