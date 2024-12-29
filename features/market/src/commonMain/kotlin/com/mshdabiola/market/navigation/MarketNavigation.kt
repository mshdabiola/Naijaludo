/*
 *abiola 2022
 */

package com.mshdabiola.market.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mshdabiola.market.MarketRoute
import com.mshdabiola.market.MarketViewModel
import com.mshdabiola.model.DEVICE_TYPE
import org.koin.compose.viewmodel.koinViewModel

fun NavController.navigateToMarket() {
    // val encodedId = URLEncoder.encode(topicId, URL_CHARACTER_ENCODING)
    navigate(Market) {
        launchSingleTop = true
    }
}

@OptIn(ExperimentalSharedTransitionApi::class)
fun NavGraphBuilder.marketScreen(
    modifier: Modifier = Modifier,
    sharedTransitionScope: SharedTransitionScope,
    onShowSnack: suspend (String, String?) -> Boolean,
    onBack: () -> Unit,
    deviceType: DEVICE_TYPE,
) {
    composable<Market> { backStack ->

        val viewModel: MarketViewModel = koinViewModel()

        MarketRoute(
            modifier = modifier,
            sharedTransitionScope = sharedTransitionScope,
            animatedContentScope = this,
            onShowSnackbar = onShowSnack,
            onBack = onBack,
            gameScreenViewModel = viewModel,
//            deviceType = deviceType,
        )
    }
}
