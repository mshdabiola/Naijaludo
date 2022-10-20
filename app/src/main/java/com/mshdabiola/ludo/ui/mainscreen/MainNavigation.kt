package com.mshdabiola.ludo.ui.mainscreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mshdabiola.ludo.navigation.LudoNavDestination

object MainDestination : LudoNavDestination{
    override val route: String
        get() = "main_route"

}

fun NavGraphBuilder.mainScreenGraph(navigateTo : (String)->Unit){
    composable(route=MainDestination.route){
        MainScreen(navigateTo = navigateTo)
    }
}