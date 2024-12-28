/*
 *abiola 2022
 */

package com.mshdabiola.main.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.mshdabiola.main.MainRoute
import com.mshdabiola.main.MainViewModel
import com.mshdabiola.model.DEVICE_TYPE
import org.koin.compose.viewmodel.koinViewModel

fun NavController.navigateToMain(main: Main, navOptions: NavOptions) = navigate(main, navOptions)

@OptIn(ExperimentalSharedTransitionApi::class)
fun NavGraphBuilder.mainScreen(
    modifier: Modifier = Modifier,
    sharedTransitionScope: SharedTransitionScope,
    navigateToGame: () -> Unit,
    navigateToMarket: () -> Unit,
    navigateToSetting: () -> Unit,
    deviceType: DEVICE_TYPE,
) {
    composable<Main> {
        val viewModel: MainViewModel = koinViewModel()
        MainRoute(
            modifier = modifier,
            sharedTransitionScope = sharedTransitionScope,
            animatedContentScope = this,
            navigateToGame = navigateToGame,
            navigateToMarket = navigateToMarket,
            deviceType = deviceType,
            mainViewModel = viewModel,
            navigateToSetting = navigateToSetting,
        )
    }
}
