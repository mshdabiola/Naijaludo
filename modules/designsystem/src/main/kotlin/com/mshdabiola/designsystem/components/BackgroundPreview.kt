/*
 *abiola 2024
 */

package com.mshdabiola.designsystem.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.component.LudoBackground
import com.mshdabiola.designsystem.component.LudoGradientBackground
import com.mshdabiola.designsystem.theme.LudoTheme

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, name = "Light theme")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Dark theme")
annotation class ThemePreviews

@ThemePreviews
@Composable
fun BackgroundDefault() {
    LudoTheme(disableDynamicTheming = true) {
        LudoBackground(Modifier.size(100.dp), content = {})
    }
}

@ThemePreviews
@Composable
fun BackgroundDynamic() {
    LudoTheme(disableDynamicTheming = false) {
        LudoBackground(Modifier.size(100.dp), content = {})
    }
}

@ThemePreviews
@Composable
fun BackgroundAndroid() {
    LudoTheme {
        LudoBackground(Modifier.size(100.dp), content = {})
    }
}

@ThemePreviews
@Composable
fun GradientBackgroundDefault() {
    LudoTheme(disableDynamicTheming = true) {
        LudoGradientBackground(Modifier.size(100.dp), content = {})
    }
}

@ThemePreviews
@Composable
fun GradientBackgroundDynamic() {
    LudoTheme(disableDynamicTheming = false) {
        LudoGradientBackground(Modifier.size(100.dp), content = {})
    }
}

@ThemePreviews
@Composable
fun GradientBackgroundAndroid() {
    LudoTheme {
        LudoGradientBackground(Modifier.size(100.dp), content = {})
    }
}
