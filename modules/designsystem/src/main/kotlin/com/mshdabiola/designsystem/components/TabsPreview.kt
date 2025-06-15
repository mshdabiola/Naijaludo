/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.component.LudoTab
import com.mshdabiola.designsystem.component.LudoTabRow
import com.mshdabiola.designsystem.theme.LudoTheme

@ThemePreviews
@Composable
fun TabsPreview() {
    LudoTheme {
        val titles = listOf("Topics", "People")
        LudoTabRow(selectedTabIndex = 0) {
            titles.forEachIndexed { index, title ->
                LudoTab(
                    selected = index == 0,
                    onClick = { },
                    text = { Text(text = title) },
                )
            }
        }
    }
}

object LudoTabDefaults {
    val TabTopPadding = 7.dp
}
