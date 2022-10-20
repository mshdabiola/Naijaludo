package com.mshdabiola.ludo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.mshdabiola.ludo.ui.gamescreen.gameScreenGraph
import com.mshdabiola.ludo.ui.mainscreen.MainDestination
import com.mshdabiola.ludo.ui.mainscreen.mainScreenGraph

@Composable
fun LudoNavHost(
    modifier: Modifier,
    navController: NavHostController,
    onNavigate : (String)->Unit,
    onBackClick : ()->Unit,
    startDestination: String=MainDestination.route
    ) {
    NavHost(modifier = modifier,
        navController =navController ,
        startDestination =startDestination){

        mainScreenGraph(onNavigate)
        gameScreenGraph()

    }
}