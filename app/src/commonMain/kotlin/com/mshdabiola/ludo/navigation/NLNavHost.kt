/*
 *abiola 2022
 */

package com.mshdabiola.ludo.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.mshdabiola.game.navigation.gameScreen
import com.mshdabiola.game.navigation.navigateToGame
import com.mshdabiola.ludo.ui.NaijaLudoAppState
import com.mshdabiola.main.navigation.Main
import com.mshdabiola.main.navigation.mainScreen
import com.mshdabiola.market.navigation.marketScreen
import com.mshdabiola.market.navigation.navigateToMarket
import com.mshdabiola.setting.navigation.settingScreen

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun SkNavHost(
    appState: NaijaLudoAppState,
    onShowSnackbar: suspend (String, String?) -> Boolean = { _, _ -> false },
    modifier: Modifier = Modifier,
) {
    val navController = appState.navController
    SharedTransitionLayout(modifier = modifier) {
        NavHost(
            navController = navController,
            startDestination = Main,
        ) {
            mainScreen(
                modifier = Modifier,
                sharedTransitionScope = this@SharedTransitionLayout,
                navigateToGame = { navController.navigateToGame() },
                navigateToMarket = navController::navigateToMarket,
                deviceType = appState.getDevietype(),
            )
            gameScreen(
                modifier = Modifier,
                sharedTransitionScope = this@SharedTransitionLayout,
                onShowSnack = onShowSnackbar,
                onBack = navController::popBackStack,
                deviceType = appState.getDevietype(),
                navigateToMarket = navController::navigateToMarket,
            )
            marketScreen(
                modifier = Modifier,
                sharedTransitionScope = this@SharedTransitionLayout,
                onShowSnack = onShowSnackbar,
                onBack = navController::popBackStack,
                deviceType = appState.getDevietype(),
            )
            settingScreen(
                modifier = Modifier,
                onShowSnack = onShowSnackbar,
                onBack = navController::popBackStack,
            )
        }
    }
}
