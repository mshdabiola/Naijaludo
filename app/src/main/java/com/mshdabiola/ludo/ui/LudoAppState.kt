package com.mshdabiola.ludo.ui

import androidx.compose.material3.windowsizeclass.WindowHeightSizeClass
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mshdabiola.ludo.model.navigation.DEVICE_TYPE

class LudoAppState(
     val windowSizeClass : WindowSizeClass,
     val navHostController: NavHostController){

     fun navigateTo(destination: String) = navHostController.navigate(destination)

     fun onBackPressed() =navHostController.popBackStack()

     private fun isPhone() =
         windowSizeClass.widthSizeClass== WindowWidthSizeClass.Compact
                 &&
                 windowSizeClass.heightSizeClass== WindowHeightSizeClass.Compact

     private fun isFold() = windowSizeClass.widthSizeClass==WindowWidthSizeClass.Medium
             && windowSizeClass.heightSizeClass== WindowHeightSizeClass.Medium

     fun isTablet() = windowSizeClass.widthSizeClass==WindowWidthSizeClass.Expanded
             && windowSizeClass.heightSizeClass== WindowHeightSizeClass.Expanded

    fun getDevietype()=when{
        isFold()-> DEVICE_TYPE.FOLD
        isPhone()->DEVICE_TYPE.PHONE
       else ->DEVICE_TYPE.TABLET
    }

    //fun isFoldLand()=          windowSizeClass.


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


