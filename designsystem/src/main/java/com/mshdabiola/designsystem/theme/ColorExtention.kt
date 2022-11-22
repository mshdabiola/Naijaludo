package com.mshdabiola.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.mshdabiola.ludo.model.GameColor

@Composable
fun GameColor.toHomeColor(): Color {

    val isDarkMode = isSystemInDarkTheme()
    return when (this) {
        GameColor.RED -> if (isDarkMode) dark_redContainer else red
        GameColor.YELLOW -> if (isDarkMode) dark_yellowContainer else yellow
        GameColor.BLUE -> if (isDarkMode) dark_blueContainer else blue
        GameColor.GREEN -> if (isDarkMode) dark_greenContainer else green
    }
}

@Composable
fun GameColor.toPawnColor(): Color {

    val isDarkMode = isSystemInDarkTheme()
    return when (this) {
        GameColor.RED -> if (isDarkMode) dark_onred else light_red
        GameColor.YELLOW -> if (isDarkMode) dark_onyellow else light_yellow
        GameColor.BLUE -> if (isDarkMode) dark_onblue else light_blue
        GameColor.GREEN -> if (isDarkMode) dark_ongreen else light_green
    }
}

@Composable
fun GameColor.toPawnTextColor(): Color {

    val isDarkMode = isSystemInDarkTheme()
    return when (this) {
        GameColor.RED -> if (isDarkMode) dark_red else light_onred
        GameColor.YELLOW -> if (isDarkMode) dark_yellow else light_onyellow
        GameColor.BLUE -> if (isDarkMode) dark_blue else light_onblue
        GameColor.GREEN -> if (isDarkMode) dark_green else light_ongreen
    }
}
