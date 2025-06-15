/*
 *abiola 2023
 */

package com.mshdabiola.setting

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mshdabiola.designsystem.DevicePreviews
import com.mshdabiola.designsystem.theme.darkDefaultScheme
import com.mshdabiola.designsystem.theme.lightDefaultScheme
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.ui.state.SettingUiState
import com.mshdabiola.ui.state.toUi

class ScreenScreenshotTests {

    @DevicePreviews
    @Composable
    fun LoadingLight() {
        MaterialTheme(colorScheme = lightDefaultScheme) {
            SettingScreen(
                modifier = Modifier.fillMaxSize(),

                settingUiState = Setting.default.toUi(),
            )
        }
    }

    @OptIn(ExperimentalSharedTransitionApi::class)
    @DevicePreviews
    @Composable
    fun LoadingDark() {
        MaterialTheme(colorScheme = darkDefaultScheme) {
            Surface {

                SettingScreen(
                    modifier = Modifier.fillMaxSize(),
                    settingUiState = Setting.default.toUi(),
                )
            }
        }
    }

}
