/*
 *abiola 2022
 */

package com.mshdabiola.ludo.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import com.mshdabiola.game.navigation.Game
import com.mshdabiola.main.navigation.Main
import com.mshdabiola.model.DEVICE_TYPE
import kotlinx.coroutines.CoroutineScope
import kotlin.reflect.KClass

@Composable
fun rememberNaijaLudoAppState(
    windowSizeClass: WindowSizeClass,
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    navController: NavHostController = rememberNavController(),
): NaijaLudoAppState {
    return remember(
        navController,
        coroutineScope,
        windowSizeClass,
    ) {
        NaijaLudoAppState(
            navController,
            coroutineScope,
            windowSizeClass,
        )
    }
}

@Stable
class NaijaLudoAppState(
    val navController: NavHostController,
    val coroutineScope: CoroutineScope,
    val windowSizeClass: WindowSizeClass,
) {
    val currentRoute: String
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination?.route ?: ""

    val isMain: Boolean
        @Composable get() = currentRoute.contains(Main::class.name)

    val shouldShowTopBar: Boolean
        @Composable get() = currentRoute.contains(Game::class.name).not()
    val shouldShowBottomBar: Boolean
        @Composable get() = windowSizeClass.windowWidthSizeClass == WindowWidthSizeClass.COMPACT && isMain

    val shouldShowNavRail: Boolean
        @Composable get() = windowSizeClass.windowWidthSizeClass == WindowWidthSizeClass.MEDIUM && isMain

    val shouldShowDrawer: Boolean
        @Composable get() = windowSizeClass.windowWidthSizeClass == WindowWidthSizeClass.EXPANDED && isMain

    private fun isPhonePort() =
        windowSizeClass.windowWidthSizeClass == WindowWidthSizeClass.COMPACT

    private fun isPhoneLand() = windowSizeClass.windowHeightSizeClass == WindowHeightSizeClass.COMPACT

    private fun isFondPort() =
        windowSizeClass.windowHeightSizeClass == WindowHeightSizeClass.MEDIUM &&
            windowSizeClass.windowWidthSizeClass == WindowWidthSizeClass.MEDIUM

    private fun isFondLandAndTabletPort() =
        windowSizeClass.windowHeightSizeClass == WindowHeightSizeClass.MEDIUM &&
            windowSizeClass.windowWidthSizeClass == WindowWidthSizeClass.EXPANDED

    private fun isTabletPort() = windowSizeClass.windowHeightSizeClass == WindowHeightSizeClass.EXPANDED

    fun getDevietype(): DEVICE_TYPE {
        val dev = when {
            isPhonePort() -> DEVICE_TYPE.PHONE_PORT
            isPhoneLand() -> DEVICE_TYPE.PHONE_LAND
            isFondPort() -> DEVICE_TYPE.FOLD_PORT
            isFondLandAndTabletPort() -> DEVICE_TYPE.FOLD_LAND_AND_TABLET_LAND
            isTabletPort() -> DEVICE_TYPE.TABLET_PORT
            else -> DEVICE_TYPE.DEFAULT
        }
        // log("device $dev height- ${windowSizeClass.heightSizeClass}, width- ${windowSizeClass.widthSizeClass}")
        return dev
    }
}

val <T : Any> KClass<T>.name: String
    get() {
        return this.qualifiedName.toString()
    }
