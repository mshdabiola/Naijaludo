package com.mshdabiola.ludo.ui.gamescreen

import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mshdabiola.ludo.navigation.LudoNavDestination

object GameDestination : LudoNavDestination{
    override val route: String
        get() = "game_route"

}

fun NavGraphBuilder.gameScreenGraph(){
    composable(route=GameDestination.route){

        GameScreen()
    }
}