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
import com.mshdabiola.designsystem.component.SkBackground
import com.mshdabiola.designsystem.component.SkButton
import com.mshdabiola.designsystem.icon.LudoIcons
import com.mshdabiola.designsystem.theme.LudoTheme

@ThemePreviews
@Composable
fun ButtonPreview() {
    LudoTheme {
        SkBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            SkButton(onClick = {}, text = { Text("Test button") })
        }
    }
}

@ThemePreviews
@Composable
fun ButtonPreview2() {
    LudoTheme {
        SkBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            SkButton(onClick = {}, text = { Text("Test button") })
        }
    }
}

@ThemePreviews
@Composable
fun ButtonLeadingIconPreview() {
    LudoTheme {
        SkBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            SkButton(
                onClick = {},
                text = { Text("Test button") },
                leadingIcon = { Icon(imageVector = LudoIcons.Add, contentDescription = null) },
            )
        }
    }
}
