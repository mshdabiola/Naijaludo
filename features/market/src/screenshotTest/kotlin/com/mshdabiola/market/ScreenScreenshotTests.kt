/*
 *abiola 2023
 */

package com.mshdabiola.market

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import com.mshdabiola.designsystem.theme.darkDefaultScheme
import com.mshdabiola.designsystem.theme.lightDefaultScheme
import com.mshdabiola.ui.DevicePreviews
import com.mshdabiola.ui.SharedContentPreview

class ScreenScreenshotTests {

    @OptIn(ExperimentalSharedTransitionApi::class)
    @DevicePreviews
    @Composable
    fun LoadingLight() {
        MaterialTheme(colorScheme = lightDefaultScheme) {
            val windowAdaptiveInfo = currentWindowAdaptiveInfo()
            val state = NaijaLudoAppState(windowAdaptiveInfo.windowSizeClass)
            Surface {
                SharedContentPreview { sharedTransitionScope, animatedContentScope ->
                    MarketScreen()
                }
            }
        }
    }

    @OptIn(ExperimentalSharedTransitionApi::class)
    @DevicePreviews
    @Composable
    fun LoadingDark() {
        MaterialTheme(colorScheme = darkDefaultScheme) {
            val windowAdaptiveInfo = currentWindowAdaptiveInfo()
            val state = NaijaLudoAppState(windowAdaptiveInfo.windowSizeClass)
            Surface {
                SharedContentPreview { sharedTransitionScope, animatedContentScope ->
                    MarketScreen()
                }
            }
        }
    }

    @OptIn(ExperimentalSharedTransitionApi::class)
    @DevicePreviews
    @Composable
    fun MainLight() {
        MaterialTheme(colorScheme = lightDefaultScheme) {
            val windowAdaptiveInfo = currentWindowAdaptiveInfo()
            val state = NaijaLudoAppState(windowAdaptiveInfo.windowSizeClass)
            Surface {
                SharedContentPreview { sharedTransitionScope, animatedContentScope ->
                    MarketScreen()
                }
            }
        }
    }

    @OptIn(ExperimentalSharedTransitionApi::class)
    @DevicePreviews
    @Composable
    fun MainDark() {
        MaterialTheme(colorScheme = darkDefaultScheme) {
            val windowAdaptiveInfo = currentWindowAdaptiveInfo()
            val state = NaijaLudoAppState(windowAdaptiveInfo.windowSizeClass)
            Surface {
                SharedContentPreview { sharedTransitionScope, animatedContentScope ->
                    MarketScreen()
                }
            }
        }
    }
}
