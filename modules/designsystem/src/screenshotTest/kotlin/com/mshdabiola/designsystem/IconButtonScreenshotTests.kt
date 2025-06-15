/*
 *abiola 2023
 */

package com.mshdabiola.designsystem

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mshdabiola.designsystem.component.LudoIconToggleButton
import com.mshdabiola.designsystem.icon.LudoIcons
import com.mshdabiola.testing.util.CaptureMultiTheme

class IconButtonScreenshotTests {

    @Preview
    @Composable
    fun ToggleButton() {
        CaptureMultiTheme {
            LudoIconToggleButton(
                checked = true,
                onCheckedChange = { },
                icon = {
                    Icon(
                        imageVector = LudoIcons.BookmarkBorder,
                        contentDescription = null,
                    )
                },
                checkedIcon = {
                    Icon(
                        imageVector = LudoIcons.Bookmark,
                        contentDescription = null,
                    )
                },
            )
        }
    }

    @Preview
    @Composable
    fun UnToggleButton() {
        CaptureMultiTheme {
            LudoIconToggleButton(
                checked = false,
                onCheckedChange = { },
                icon = {
                    Icon(
                        imageVector = LudoIcons.BookmarkBorder,
                        contentDescription = null,
                    )
                },
                checkedIcon = {
                    Icon(
                        imageVector = LudoIcons.Bookmark,
                        contentDescription = null,
                    )
                },
            )
        }
    }
}
