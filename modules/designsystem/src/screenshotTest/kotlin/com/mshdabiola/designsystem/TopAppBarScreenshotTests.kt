/*
 *abiola 2024
 */

package com.mshdabiola.designsystem

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mshdabiola.designsystem.component.LudoTopAppBar
import com.mshdabiola.designsystem.icon.LudoIcons
import com.mshdabiola.testing.util.CaptureMultiTheme

class TopAppBarScreenshotTests() {

    @Preview
    @Composable
    fun TopAppBar() {
        CaptureMultiTheme {
            NiaTopAppBarExample()
        }
    }

    @Preview(fontScale = 2.0f)
    @Composable
    fun TopAppBarHumFontScale2() {
        CaptureMultiTheme {
            NiaTopAppBarExample()
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun NiaTopAppBarExample() {
        LudoTopAppBar(
            titleRes = "untitled",
            navigationIcon = LudoIcons.Search,
            navigationIconContentDescription = "Navigation icon",
            actionIcon = LudoIcons.MoreVert,
            actionIconContentDescription = "Action icon",
        )
    }
}
