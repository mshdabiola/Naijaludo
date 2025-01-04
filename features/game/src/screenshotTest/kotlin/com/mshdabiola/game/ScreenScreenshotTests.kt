/*
 *abiola 2023
 */

package com.mshdabiola.game

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import com.mshdabiola.designsystem.DevicePreviews
import com.mshdabiola.designsystem.theme.darkDefaultScheme
import com.mshdabiola.designsystem.theme.lightDefaultScheme
import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.ui.SharedContentPreview
import com.mshdabiola.ui.state.toLudoUiState

class ScreenScreenshotTests {
//
//    @OptIn(ExperimentalSharedTransitionApi::class)
//    @DevicePreviews
//    @Composable
//    fun LoadingLight() {
//        MaterialTheme(colorScheme = lightDefaultScheme) {
//            Surface {
//                SharedContentPreview { sharedTransitionScope, animatedContentScope ->
//                    val windowAdaptiveInfo = currentWindowAdaptiveInfo()
//                    val state = NaijaLudoAppState(windowAdaptiveInfo.windowSizeClass)
//                    Surface {
//                        SharedContentPreview { sharedTransitionScope, animatedContentScope ->
//                            GameScreen(
//                                deviceType = state.getDevietype(),
//                                gameUiState = Constant.getDefaultGameState().toLudoUiState(),
//                            )
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    @OptIn(ExperimentalSharedTransitionApi::class)
//    @DevicePreviews
//    @Composable
//    fun LoadingDark() {
//        MaterialTheme(colorScheme = darkDefaultScheme) {
//            Surface {
//                SharedContentPreview { sharedTransitionScope, animatedContentScope ->
//                    val windowAdaptiveInfo = currentWindowAdaptiveInfo()
//                    val state = NaijaLudoAppState(windowAdaptiveInfo.windowSizeClass)
//                    Surface {
//                        SharedContentPreview { sharedTransitionScope, animatedContentScope ->
//                            GameScreen(
//                                deviceType = state.getDevietype(),
//                                gameUiState = Constant.getDefaultGameState().toLudoUiState(),
//                            )
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    @OptIn(ExperimentalSharedTransitionApi::class)
//    @DevicePreviews
//    @Composable
//    fun MainLight() {
//        MaterialTheme(colorScheme = lightDefaultScheme) {
//            val windowAdaptiveInfo = currentWindowAdaptiveInfo()
//            val state = NaijaLudoAppState(windowAdaptiveInfo.windowSizeClass)
//            Surface {
//                SharedContentPreview { sharedTransitionScope, animatedContentScope ->
//                    GameScreen(
//                        deviceType = state.getDevietype(),
//                        gameUiState = Constant.getDefaultGameState().toLudoUiState(),
//                    )
//                }
//            }
//        }
//    }
//
//    @OptIn(ExperimentalSharedTransitionApi::class)
//    @DevicePreviews
//    @Composable
//    fun MainDark() {
//        MaterialTheme(colorScheme = darkDefaultScheme) {
//            val windowAdaptiveInfo = currentWindowAdaptiveInfo()
//            val state = NaijaLudoAppState(windowAdaptiveInfo.windowSizeClass)
//            Surface {
//                SharedContentPreview { sharedTransitionScope, animatedContentScope ->
//                    GameScreen(
//                        deviceType = state.getDevietype(),
//                        gameUiState = Constant.getDefaultGameState().toLudoUiState(),
//                    )
//                }
//            }
//        }
//    }
}
