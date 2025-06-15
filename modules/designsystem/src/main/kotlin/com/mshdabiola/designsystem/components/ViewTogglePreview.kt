/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mshdabiola.designsystem.component.SkViewToggleButton
import com.mshdabiola.designsystem.theme.LudoTheme

@ThemePreviews
@Composable
fun ViewTogglePreviewExpanded() {
    LudoTheme {
        Surface {
            SkViewToggleButton(
                expanded = true,
                onExpandedChange = { },
                compactText = { Text(text = "Compact view") },
                expandedText = { Text(text = "Expanded view") },
            )
        }
    }
}

@Preview
@Composable
fun ViewTogglePreviewCompact() {
    LudoTheme {
        Surface {
            SkViewToggleButton(
                expanded = false,
                onExpandedChange = { },
                compactText = { Text(text = "Compact view") },
                expandedText = { Text(text = "Expanded view") },
            )
        }
    }
}
