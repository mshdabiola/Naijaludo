/*
 *abiola 2023
 */

package com.mshdabiola.game

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.mshdabiola.designsystem.theme.darkDefaultScheme
import com.mshdabiola.designsystem.theme.lightDefaultScheme
import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.ui.DevicePreviews
import com.mshdabiola.ui.SharedContentPreview
import com.mshdabiola.ui.state.toLudoUiState

class ScreenScreenshotTests {

    @OptIn(ExperimentalSharedTransitionApi::class)
    @DevicePreviews
    @Composable
    fun LoadingLight() {
        MaterialTheme(colorScheme = lightDefaultScheme) {
            Surface {
                SharedContentPreview { sharedTransitionScope, animatedContentScope ->
                    Surface {
                        SharedContentPreview { sharedTransitionScope, animatedContentScope ->
                            GameScreen(
                                gameUiState = Constant.getDefaultGameState().toLudoUiState(),
                            )
                        }
                    }
                }
            }
        }
    }

    @OptIn(ExperimentalSharedTransitionApi::class)
    @DevicePreviews
    @Composable
    fun LoadingDark() {
        MaterialTheme(colorScheme = darkDefaultScheme) {
            Surface {
                SharedContentPreview { sharedTransitionScope, animatedContentScope ->
                    Surface {
                        SharedContentPreview { sharedTransitionScope, animatedContentScope ->
                            GameScreen(
                                gameUiState = Constant.getDefaultGameState().toLudoUiState(),
                            )
                        }
                    }
                }
            }
        }
    }

    @OptIn(ExperimentalSharedTransitionApi::class)
    @DevicePreviews
    @Composable
    fun MainLight() {
        MaterialTheme(colorScheme = lightDefaultScheme) {
            Surface {
                SharedContentPreview { sharedTransitionScope, animatedContentScope ->
                    Surface {
                        SharedContentPreview { sharedTransitionScope, animatedContentScope ->
                            GameScreen(
                                gameUiState = Constant.getDefaultGameState().toLudoUiState(),
                            )
                        }
                    }
                }
            }
        }
    }

    @OptIn(ExperimentalSharedTransitionApi::class)
    @DevicePreviews
    @Composable
    fun MainDark() {
        MaterialTheme(colorScheme = darkDefaultScheme) {
            Surface {
                SharedContentPreview { sharedTransitionScope, animatedContentScope ->
                    Surface {
                        SharedContentPreview { sharedTransitionScope, animatedContentScope ->
                            GameScreen(
                                gameUiState = Constant.getDefaultGameState().toLudoUiState(),
                            )
                        }
                    }
                }
            }
        }
    }
}
