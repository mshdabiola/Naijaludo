package com.mshdabiola.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.mshdabiola.naijaludo.model.GameColor

@Composable
fun GameColor.toHomeColor(): Color {
    return when (this) {
        GameColor.RED -> redBoard
        GameColor.YELLOW -> yellowBoard
        GameColor.BLUE -> blueBoard
        GameColor.GREEN -> greenBoard
    }
}

@Composable
fun GameColor.toPawnColor(): Color {
    val isDarkMode = isSystemInDarkTheme()
    return when (this) {
        GameColor.RED -> red
        GameColor.YELLOW -> yellow
        GameColor.BLUE -> blue
        GameColor.GREEN -> green
    }
}

@Composable
fun GameColor.toPawnTextColor(): Color {
    return Color.White
//    when (this) {
//        GameColor.RED -> if (isDarkMode) dark_red else light_onred
//        GameColor.YELLOW -> if (isDarkMode) dark_yellow else light_onyellow
//        GameColor.BLUE -> if (isDarkMode) dark_blue else light_onblue
//        GameColor.GREEN -> if (isDarkMode) dark_green else light_ongreen
//    }
}
