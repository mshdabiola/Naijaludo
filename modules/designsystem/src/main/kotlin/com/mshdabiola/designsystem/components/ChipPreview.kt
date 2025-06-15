/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.component.LudoBackground
import com.mshdabiola.designsystem.component.LudoFilterChip
import com.mshdabiola.designsystem.theme.LudoTheme

@ThemePreviews
@Composable
fun ChipPreview() {
    LudoTheme {
        LudoBackground(modifier = Modifier.size(80.dp, 20.dp)) {
            LudoFilterChip(selected = true, onSelectedChange = {}) {
                Text("Chip")
            }
        }
    }
}
