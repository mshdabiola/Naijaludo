package com.mshdabiola.designsystem.theme

import android.os.Build
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext

@Composable
fun LudoAppTheme(
    useDarkTheme: Boolean = false, // isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit,
) {
    val context = LocalContext.current
    val isPaid = remember {
        context.packageName.contains("paid")
    }
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {

            if (useDarkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }


        useDarkTheme -> getDarkColor(isPaid)
        else -> getLightColor(isPaid)
    }
//    val view = LocalView.current
//    if (!view.isInEditMode) {
//        SideEffect {
//            val activity = view.context as Activity
    //   WindowCompat.setDecorFitsSystemWindows(activity.window, false)
//            activity.window.apply {
//                statusBarColor = Color.Transparent.toArgb()
//                navigationBarColor = Color.Transparent.toArgb()
//            }
//
//            WindowCompat.getInsetsController(activity.window, view).apply {
//                isAppearanceLightStatusBars = !useDarkTheme
//                isAppearanceLightNavigationBars = !useDarkTheme
//            }
//        }
//    }
    MaterialTheme(
        colorScheme = colorScheme,
        typography = LudoTypography,
        content = content,
    )
}

fun getDarkColor(isPaid:Boolean):ColorScheme{
    return if (isPaid)
        darkColorScheme(
            primary = com.mshdabiola.designsystem.theme2.md_theme_dark_primary,
            onPrimary = com.mshdabiola.designsystem.theme2.md_theme_dark_onPrimary,
            primaryContainer = com.mshdabiola.designsystem.theme2.md_theme_dark_primaryContainer,
            onPrimaryContainer = com.mshdabiola.designsystem.theme2.md_theme_dark_onPrimaryContainer,
            secondary = com.mshdabiola.designsystem.theme2.md_theme_dark_secondary,
            onSecondary = com.mshdabiola.designsystem.theme2.md_theme_dark_onSecondary,
            secondaryContainer = com.mshdabiola.designsystem.theme2.md_theme_dark_secondaryContainer,
            onSecondaryContainer = com.mshdabiola.designsystem.theme2.md_theme_dark_onSecondaryContainer,
            tertiary = com.mshdabiola.designsystem.theme2.md_theme_dark_tertiary,
            onTertiary = com.mshdabiola.designsystem.theme2.md_theme_dark_onTertiary,
            tertiaryContainer = com.mshdabiola.designsystem.theme2.md_theme_dark_tertiaryContainer,
            onTertiaryContainer = com.mshdabiola.designsystem.theme2.md_theme_dark_onTertiaryContainer,
            error = com.mshdabiola.designsystem.theme2.md_theme_dark_error,
            errorContainer = com.mshdabiola.designsystem.theme2.md_theme_dark_errorContainer,
            onError = com.mshdabiola.designsystem.theme2.md_theme_dark_onError,
            onErrorContainer = com.mshdabiola.designsystem.theme2.md_theme_dark_onErrorContainer,
            background = com.mshdabiola.designsystem.theme2.md_theme_dark_background,
            onBackground = com.mshdabiola.designsystem.theme2.md_theme_dark_onBackground,
            surface = com.mshdabiola.designsystem.theme2.md_theme_dark_surface,
            onSurface = com.mshdabiola.designsystem.theme2.md_theme_dark_onSurface,
            surfaceVariant = com.mshdabiola.designsystem.theme2.md_theme_dark_surfaceVariant,
            onSurfaceVariant = com.mshdabiola.designsystem.theme2.md_theme_dark_onSurfaceVariant,
            outline = com.mshdabiola.designsystem.theme2.md_theme_dark_outline,
            inverseOnSurface = com.mshdabiola.designsystem.theme2.md_theme_dark_inverseOnSurface,
            inverseSurface = com.mshdabiola.designsystem.theme2.md_theme_dark_inverseSurface,
            inversePrimary = com.mshdabiola.designsystem.theme2.md_theme_dark_inversePrimary,
            surfaceTint = com.mshdabiola.designsystem.theme2.md_theme_dark_surfaceTint,
        )
    else
        darkColorScheme(
            primary = md_theme_dark_primary,
            onPrimary = md_theme_dark_onPrimary,
            primaryContainer = md_theme_dark_primaryContainer,
            onPrimaryContainer = md_theme_dark_onPrimaryContainer,
            secondary = md_theme_dark_secondary,
            onSecondary = md_theme_dark_onSecondary,
            secondaryContainer = md_theme_dark_secondaryContainer,
            onSecondaryContainer = md_theme_dark_onSecondaryContainer,
            tertiary = md_theme_dark_tertiary,
            onTertiary = md_theme_dark_onTertiary,
            tertiaryContainer = md_theme_dark_tertiaryContainer,
            onTertiaryContainer = md_theme_dark_onTertiaryContainer,
            error = md_theme_dark_error,
            errorContainer = md_theme_dark_errorContainer,
            onError = md_theme_dark_onError,
            onErrorContainer = md_theme_dark_onErrorContainer,
            background = md_theme_dark_background,
            onBackground = md_theme_dark_onBackground,
            surface = md_theme_dark_surface,
            onSurface = md_theme_dark_onSurface,
            surfaceVariant = md_theme_dark_surfaceVariant,
            onSurfaceVariant = md_theme_dark_onSurfaceVariant,
            outline = md_theme_dark_outline,
            inverseOnSurface = md_theme_dark_inverseOnSurface,
            inverseSurface = md_theme_dark_inverseSurface,
            inversePrimary = md_theme_dark_inversePrimary,
            surfaceTint = md_theme_dark_surfaceTint,
        )
}
fun getLightColor(isPaid:Boolean):ColorScheme{
    return if (!isPaid)
        lightColorScheme(
            primary = md_theme_light_primary,
            onPrimary = md_theme_light_onPrimary,
            primaryContainer = md_theme_light_primaryContainer,
            onPrimaryContainer = md_theme_light_onPrimaryContainer,
            secondary = md_theme_light_secondary,
            onSecondary = md_theme_light_onSecondary,
            secondaryContainer = md_theme_light_secondaryContainer,
            onSecondaryContainer = md_theme_light_onSecondaryContainer,
            tertiary = md_theme_light_tertiary,
            onTertiary = md_theme_light_onTertiary,
            tertiaryContainer = md_theme_light_tertiaryContainer,
            onTertiaryContainer = md_theme_light_onTertiaryContainer,
            error = md_theme_light_error,
            errorContainer = md_theme_light_errorContainer,
            onError = md_theme_light_onError,
            onErrorContainer = md_theme_light_onErrorContainer,
            background = md_theme_light_background,
            onBackground = md_theme_light_onBackground,
            surface = md_theme_light_surface,
            onSurface = md_theme_light_onSurface,
            surfaceVariant = md_theme_light_surfaceVariant,
            onSurfaceVariant = md_theme_light_onSurfaceVariant,
            outline = md_theme_light_outline,
            inverseOnSurface = md_theme_light_inverseOnSurface,
            inverseSurface = md_theme_light_inverseSurface,
            inversePrimary = md_theme_light_inversePrimary,
            surfaceTint = md_theme_light_surfaceTint,
        )
    else
        lightColorScheme(
            primary = com.mshdabiola.designsystem.theme2.md_theme_light_primary,
            onPrimary = com.mshdabiola.designsystem.theme2.md_theme_light_onPrimary,
            primaryContainer = com.mshdabiola.designsystem.theme2.md_theme_light_primaryContainer,
            onPrimaryContainer = com.mshdabiola.designsystem.theme2.md_theme_light_onPrimaryContainer,
            secondary = com.mshdabiola.designsystem.theme2.md_theme_light_secondary,
            onSecondary = com.mshdabiola.designsystem.theme2.md_theme_light_onSecondary,
            secondaryContainer = com.mshdabiola.designsystem.theme2.md_theme_light_secondaryContainer,
            onSecondaryContainer = com.mshdabiola.designsystem.theme2.md_theme_light_onSecondaryContainer,
            tertiary = com.mshdabiola.designsystem.theme2.md_theme_light_tertiary,
            onTertiary = com.mshdabiola.designsystem.theme2.md_theme_light_onTertiary,
            tertiaryContainer = com.mshdabiola.designsystem.theme2.md_theme_light_tertiaryContainer,
            onTertiaryContainer = com.mshdabiola.designsystem.theme2.md_theme_light_onTertiaryContainer,
            error = com.mshdabiola.designsystem.theme2.md_theme_light_error,
            errorContainer = com.mshdabiola.designsystem.theme2.md_theme_light_errorContainer,
            onError = com.mshdabiola.designsystem.theme2.md_theme_light_onError,
            onErrorContainer = com.mshdabiola.designsystem.theme2.md_theme_light_onErrorContainer,
            background = com.mshdabiola.designsystem.theme2.md_theme_light_background,
            onBackground = com.mshdabiola.designsystem.theme2.md_theme_light_onBackground,
            surface = com.mshdabiola.designsystem.theme2.md_theme_light_surface,
            onSurface = com.mshdabiola.designsystem.theme2.md_theme_light_onSurface,
            surfaceVariant = com.mshdabiola.designsystem.theme2.md_theme_light_surfaceVariant,
            onSurfaceVariant = com.mshdabiola.designsystem.theme2.md_theme_light_onSurfaceVariant,
            outline = com.mshdabiola.designsystem.theme2.md_theme_light_outline,
            inverseOnSurface = com.mshdabiola.designsystem.theme2.md_theme_light_inverseOnSurface,
            inverseSurface = com.mshdabiola.designsystem.theme2.md_theme_light_inverseSurface,
            inversePrimary = com.mshdabiola.designsystem.theme2.md_theme_light_inversePrimary,
            surfaceTint = com.mshdabiola.designsystem.theme2.md_theme_light_surfaceTint,
        )
}