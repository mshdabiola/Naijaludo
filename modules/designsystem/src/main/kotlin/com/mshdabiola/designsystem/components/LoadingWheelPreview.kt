/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.mshdabiola.designsystem.component.LudoLoadingWheel
import com.mshdabiola.designsystem.component.LudoOverlayLoadingWheel
import com.mshdabiola.designsystem.theme.LudoTheme

@ThemePreviews
@Composable
fun NiaLoadingWheelPreview() {
    LudoTheme {
        Surface {
            LudoLoadingWheel(contentDesc = "LoadingWheel")
        }
    }
}

@ThemePreviews
@Composable
fun NiaOverlayLoadingWheelPreview() {
    LudoTheme {
        Surface {
            LudoOverlayLoadingWheel(contentDesc = "LoadingWheel")
        }
    }
}

private const val ROTATION_TIME = 12000
private const val NUM_OF_LINES = 12
