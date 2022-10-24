package com.mshdabiola.ludo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.mshdabiola.gamescreen.gameScreenGraph
import com.mshdabiola.gamescreen.gameScreenLandGraph
import com.mshdabiola.ludo.model.navigation.DEVICE_TYPE
import com.mshdabiola.ludo.model.navigation.LudoNavDestination
import com.mshdabiola.mainscreen.mainScreenGraph


@Composable
fun LudoNavHost(
    modifier: Modifier,
    navController: NavHostController,
    onNavigate : (String)->Unit,
    onBackClick : ()->Unit,
    deviceType: DEVICE_TYPE,
    startDestination: String=LudoNavDestination.MainNavDestination.route
    ) {
    NavHost(modifier = modifier,
        navController =navController ,
        startDestination =startDestination){

        mainScreenGraph(onNavigate)
       gameScreenGraph(deviceType)

    }
}