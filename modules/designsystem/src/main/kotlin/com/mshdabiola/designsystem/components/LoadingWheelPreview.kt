/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.mshdabiola.designsystem.component.SkLoadingWheel
import com.mshdabiola.designsystem.component.SkOverlayLoadingWheel
import com.mshdabiola.designsystem.theme.LudoTheme

@ThemePreviews
@Composable
fun NiaLoadingWheelPreview() {
    LudoTheme {
        Surface {
            SkLoadingWheel(contentDesc = "LoadingWheel")
        }
    }
}

@ThemePreviews
@Composable
fun NiaOverlayLoadingWheelPreview() {
    LudoTheme {
        Surface {
            SkOverlayLoadingWheel(contentDesc = "LoadingWheel")
        }
    }
}

private const val ROTATION_TIME = 12000
private const val NUM_OF_LINES = 12
