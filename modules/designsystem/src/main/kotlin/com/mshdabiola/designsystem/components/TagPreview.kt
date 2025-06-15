/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.mshdabiola.designsystem.component.LudoTopicTag
import com.mshdabiola.designsystem.theme.LudoTheme

@ThemePreviews
@Composable
fun TagPreview() {
    LudoTheme {
        LudoTopicTag(followed = true, onClick = {}) {
            Text("Topic".uppercase())
        }
    }
}
