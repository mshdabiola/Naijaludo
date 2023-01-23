package com.mshdabiola.gamescreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mshdabiola.ludo.model.navigation.DEVICE_TYPE
import com.mshdabiola.ludo.model.navigation.LudoNavDestination

fun NavGraphBuilder.gameScreenGraph(deviceType: DEVICE_TYPE, onBack: () -> Unit) {
    composable(route = LudoNavDestination.GameNavDestination.route) {
        GameScreen(deviceType = deviceType, onBack = onBack)
    }
}
