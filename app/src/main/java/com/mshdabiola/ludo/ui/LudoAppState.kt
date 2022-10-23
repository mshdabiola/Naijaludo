package com.mshdabiola.ludo.ui

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

class LudoAppState(
     val windowSizeClass : WindowSizeClass,
     val navHostController: NavHostController){

     fun navigateTo(destination: String) = navHostController.navigate(destination)

     fun onBackPressed() =navHostController.popBackStack()

     fun isPhone() = windowSizeClass.widthSizeClass== WindowWidthSizeClass.Compact

     fun isTablet() = windowSizeClass.widthSizeClass==WindowWidthSizeClass.Medium

     fun isSystem() = windowSizeClass.widthSizeClass==WindowWidthSizeClass.Medium
 }

@Composable

fun rememBerLudoAppState(
    windowSizeClass: WindowSizeClass,
    navController: NavHostController= rememberNavController()
) : LudoAppState {
    return remember(key1  = navController,key2 = windowSizeClass) {
        LudoAppState(windowSizeClass,navController)
    }
}
