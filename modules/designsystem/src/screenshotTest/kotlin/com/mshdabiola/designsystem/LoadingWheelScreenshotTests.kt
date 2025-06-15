/*
 *abiola 2023
 */

package com.mshdabiola.designsystem

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mshdabiola.designsystem.component.LudoLoadingWheel
import com.mshdabiola.designsystem.component.LudoOverlayLoadingWheel
import com.mshdabiola.testing.util.CaptureMultiTheme

class LoadingWheelScreenshotTests {

    @Preview
    @Composable
    fun LoadingWheel() {
        CaptureMultiTheme {
            LudoLoadingWheel(contentDesc = "test")
        }
    }

    @Preview
    @Composable
    fun OverlayLoadingWheel() {
        CaptureMultiTheme {
            LudoOverlayLoadingWheel(contentDesc = "test")
        }
    }
}
