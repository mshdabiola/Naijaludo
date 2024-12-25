/*
 *abiola 2022
 */

package com.mshdabiola.game.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mshdabiola.game.GameRoute
import com.mshdabiola.game.GeneralViewModel
import com.mshdabiola.model.DEVICE_TYPE
import org.koin.compose.viewmodel.koinViewModel

fun NavController.navigateToGame() {
    // val encodedId = URLEncoder.encode(topicId, URL_CHARACTER_ENCODING)
    navigate(Game) {
        launchSingleTop = true
    }
}

@OptIn(ExperimentalSharedTransitionApi::class)
fun NavGraphBuilder.gameScreen(
    modifier: Modifier = Modifier,
    sharedTransitionScope: SharedTransitionScope,
    onShowSnack: suspend (String, String?) -> Boolean,
    onBack: () -> Unit,
    deviceType: DEVICE_TYPE,
    navigateToMarket: () -> Unit,
) {
    composable<Game> { backStack ->

        val viewModel: GeneralViewModel = koinViewModel()

        GameRoute(
            modifier = modifier,
            sharedTransitionScope = sharedTransitionScope,
            animatedContentScope = this,
            onShowSnackbar = onShowSnack,
            onBack = onBack,
            gameScreenViewModel = viewModel,
            deviceType = deviceType,
            navigateToMarket = navigateToMarket,
        )
    }
}
