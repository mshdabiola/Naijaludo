package com.mshabiola.theme.util

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable

internal expect fun canShowDynamic(): Boolean

@Composable
internal expect fun dynamicLightScheme(): ColorScheme

@Composable
internal expect fun dynamicDarkScheme(): ColorScheme
