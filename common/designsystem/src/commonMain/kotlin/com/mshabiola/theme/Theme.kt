package com.mshabiola.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DarkMode
import androidx.compose.material.icons.outlined.LightMode
import androidx.compose.material.icons.outlined.SettingsSuggest
import androidx.compose.material.icons.outlined.Wallpaper
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.mshabiola.theme.util.canShowDynamic
import com.mshabiola.theme.util.dynamicDarkScheme
import com.mshabiola.theme.util.dynamicLightScheme

private val AppLightColorScheme = lightColorScheme(
    primary = PrimaryColor,
    onPrimary = PrimaryTextColor,
    secondary = SecondaryColor,
    onSecondary = SecondaryTextColor,
    tertiary = PrimaryLightColor,
    onTertiary = PrimaryTextColor,
    background = BackgroundLightColor,
    onBackground = Color.Black,
    surface = SurfaceLight,
    onSurface = Color.Black,
    surfaceVariant = SurfaceLight,
    onSurfaceVariant = Color.Black,
    secondaryContainer = PrimaryColor,
    onSecondaryContainer = Color.White,
    error = ErrorColor,
    onError = OnErrorColor
)

private val AppDarkColorScheme = darkColorScheme(
    primary = PrimaryColor,
    onPrimary = PrimaryTextColor,
    secondary = SecondaryLightColor,
    onSecondary = SecondaryTextColor,
    tertiary = PrimaryLightColor,
    onTertiary = PrimaryTextColor,
    background = BackgroundDarkColor,
    onBackground = Color.White,
    surface = SurfaceDark,
    onSurface = Color.White,
    surfaceVariant = SurfaceDark,
    onSurfaceVariant = Color.White,
    secondaryContainer = PrimaryColor,
    onSecondaryContainer = Color.White,
    error = ErrorColor,
    onError = OnErrorColor
)

@Composable
fun AppTheme(
    theme: Int = Theme.FOLLOW_SYSTEM.themeValue,
    content: @Composable () -> Unit,
) {
    val autoColors = if (isSystemInDarkTheme()) AppDarkColorScheme else AppLightColorScheme

    val dynamicColors = if (canShowDynamic()) {
        if (isSystemInDarkTheme()) dynamicDarkScheme() else dynamicLightScheme()
    } else {
        autoColors
    }

    val colors = when (theme) {
        Theme.LIGHT_THEME.themeValue -> AppLightColorScheme
        Theme.DARK_THEME.themeValue -> AppDarkColorScheme
        Theme.MATERIAL_YOU.themeValue -> dynamicColors
        else -> autoColors
    }

    MaterialTheme(
        colorScheme = colors,
        typography = customTypography(),
        shapes = Shapes,
        content = content
    )
}

// To be used to set the preferred theme inside settings
enum class Theme(
    val themeName: String,
    val icon: ImageVector,
    val themeValue: Int
) {
    MATERIAL_YOU(
        themeName = "Material You",
        icon = Icons.Outlined.Wallpaper,
        themeValue = 12
    ),
    FOLLOW_SYSTEM(
        themeName = "Follow System Settings",
        icon = Icons.Outlined.SettingsSuggest,
        themeValue = -1
    ),
    LIGHT_THEME(
        themeName = "Light Theme",
        icon = Icons.Outlined.LightMode,
        themeValue = 1
    ),
    DARK_THEME(
        themeName = "Dark Theme",
        icon = Icons.Outlined.DarkMode,
        themeValue = 2
    );
}
