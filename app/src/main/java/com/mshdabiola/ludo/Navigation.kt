package com.mshdabiola.ludo

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mshdabiola.ludo.ui.gamescreen.GameScreen
import com.mshdabiola.ludo.ui.gamescreen.GameViewModel
import com.mshdabiola.ludo.ui.mainscreen.MainScreen


//@Composable
//fun MyNavigationGraph(
//    navHostController: NavHostController = rememberNavController(),
//    gameScreenViewModel: GameViewModel
//) {
//
//    NavHost(navController = navHostController, startDestination = "main") {
//
//        composable(route = "main") {
//            MainScreen(navHostController)
//        }
//
//        composable(route = "game") {
//            GameScreen(gameScreenViewModel = gameScreenViewModel)
//        }
//
//    }
//
//}