package com.mshdabiola.mainscreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mshdabiola.ludo.model.navigation.LudoNavDestination

fun NavGraphBuilder.mainScreenGraph(navigateTo: (String) -> Unit) {
    composable(route = LudoNavDestination.MainNavDestination.route) {
        MainScreen(navigateTo = navigateTo)
    }
}
