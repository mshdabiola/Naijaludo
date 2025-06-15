/*
 *abiola 2024
 */

package com.mshdabiola.designsystem.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.component.LudoBackground
import com.mshdabiola.designsystem.component.LudoButton
import com.mshdabiola.designsystem.icon.LudoIcons
import com.mshdabiola.designsystem.theme.LudoTheme

@ThemePreviews
@Composable
fun ButtonPreview() {
    LudoTheme {
        LudoBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            LudoButton(onClick = {}, text = { Text("Test button") })
        }
    }
}

@ThemePreviews
@Composable
fun ButtonPreview2() {
    LudoTheme {
        LudoBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            LudoButton(onClick = {}, text = { Text("Test button") })
        }
    }
}

@ThemePreviews
@Composable
fun ButtonLeadingIconPreview() {
    LudoTheme {
        LudoBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            LudoButton(
                onClick = {},
                text = { Text("Test button") },
                leadingIcon = { Icon(imageVector = LudoIcons.Add, contentDescription = null) },
            )
        }
    }
}
