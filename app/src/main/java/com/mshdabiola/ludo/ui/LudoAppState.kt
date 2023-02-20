package com.mshdabiola.ludo.ui

import androidx.compose.material3.windowsizeclass.WindowHeightSizeClass
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mshdabiola.common.navigation.DEVICE_TYPE

class LudoAppState(
    val windowSizeClass: WindowSizeClass,
    val navHostController: NavHostController,
) {



    private fun isPhonePort() =
        windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact

    private fun isPhoneLand() = windowSizeClass.heightSizeClass == WindowHeightSizeClass.Compact

    private fun isFondPort() =
        windowSizeClass.heightSizeClass == WindowHeightSizeClass.Medium &&
                windowSizeClass.widthSizeClass == WindowWidthSizeClass.Medium

    private fun isFondLandAndTabletPort() =
        windowSizeClass.heightSizeClass == WindowHeightSizeClass.Medium &&
                windowSizeClass.widthSizeClass == WindowWidthSizeClass.Expanded

    private fun isTabletPort() = windowSizeClass.heightSizeClass == WindowHeightSizeClass.Expanded

    fun getDevietype(): com.mshdabiola.common.navigation.DEVICE_TYPE {
        val dev = when {
            isPhonePort() -> com.mshdabiola.common.navigation.DEVICE_TYPE.PHONE_PORT
            isPhoneLand() -> com.mshdabiola.common.navigation.DEVICE_TYPE.PHONE_LAND
            isFondPort() -> com.mshdabiola.common.navigation.DEVICE_TYPE.FOLD_PORT
            isFondLandAndTabletPort() -> com.mshdabiola.common.navigation.DEVICE_TYPE.FOLD_LAND_AND_TABLET_LAND
            isTabletPort() -> com.mshdabiola.common.navigation.DEVICE_TYPE.TABLET_PORT
            else -> com.mshdabiola.common.navigation.DEVICE_TYPE.DEFAULT
        }
        // log("device $dev height- ${windowSizeClass.heightSizeClass}, width- ${windowSizeClass.widthSizeClass}")
        return dev
    }
    // fun isFoldLand()=          windowSizeClass.
}

@Composable
fun rememBerLudoAppState(
    windowSizeClass: WindowSizeClass,
    navController: NavHostController = rememberNavController(),
): LudoAppState {
    return remember(key1 = navController, key2 = windowSizeClass) {
        LudoAppState(windowSizeClass, navController)
    }
}
