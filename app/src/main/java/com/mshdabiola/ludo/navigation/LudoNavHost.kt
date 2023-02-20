package com.mshdabiola.ludo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.mshdabiola.common.navigation.DEVICE_TYPE
import com.mshdabiola.gamescreen.gameScreen
import com.mshdabiola.gamescreen.navigateToGame
import com.mshdabiola.mainscreen.mainRoute
import com.mshdabiola.mainscreen.mainScreen

@Composable
fun LudoNavHost(
    modifier: Modifier,
    navController: NavHostController,
    deviceType: DEVICE_TYPE,
    startDestination: String = mainRoute,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination,
    ) {

        mainScreen(navController::navigateToGame, deviceType)
        gameScreen(deviceType, navController::popBackStack)
    }
}
