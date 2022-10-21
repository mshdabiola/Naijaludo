package com.mshdabiola.gamescreen

import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mshdabiola.ludo.model.navigation.LudoNavDestination



fun NavGraphBuilder.gameScreenGraph(){
    composable(route=LudoNavDestination.GameNavDestination.route){

        GameScreen()
    }
}