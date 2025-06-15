/*
 *abiola 2024
 */

package com.mshdabiola.designsystem

import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mshdabiola.designsystem.component.LudoButton
import com.mshdabiola.designsystem.icon.LudoIcons
import com.mshdabiola.testing.util.CaptureMultiTheme

class ButtonScreenshotTests {

    @Preview
    @Composable
    fun Button() {
        CaptureMultiTheme {
            LudoButton(onClick = {}, text = { Text(" Button") })
        }
    }

    @Preview
    @Composable
    fun ButtonWithLeadIcon() {
        CaptureMultiTheme {
            LudoButton(
                onClick = {},
                text = { Text("Icon Button") },
                leadingIcon = { Icon(imageVector = LudoIcons.Add, contentDescription = null) },
            )
        }
    }
}
