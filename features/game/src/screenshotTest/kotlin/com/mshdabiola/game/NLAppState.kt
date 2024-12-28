/*
 *abiola 2022
 */

package com.mshdabiola.game

import androidx.compose.runtime.Stable
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import com.mshdabiola.model.DEVICE_TYPE
import kotlin.reflect.KClass

@Stable
class NaijaLudoAppState(
    val windowSizeClass: WindowSizeClass,
) {

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
