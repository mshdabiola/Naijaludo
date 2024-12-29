package com.mshdabiola.naijaludo.model

import kotlinx.serialization.Serializable

@Serializable
data class Setting(
    val language: Int,
    val gameLevel: Int,
    val assistant: Boolean,

    val boardType: Int,
    val boardStyle: Int,
    val pawnNumber: Int,
    val rotate: Boolean,

    val sound: Boolean,
    val music: Boolean,
    val musicType: Int,

    val themeBrand: Int,
    val darkThemeConfig: Int,
    val useDynamicColor: Boolean,
    val shouldHideOnboarding: Boolean,

) {
    companion object {
        val default = Setting(
            language = 1,
            gameLevel = 0,
            assistant = true,
            boardType = 0,
            boardStyle = 0,
            pawnNumber = 4,
            rotate = true,
            sound = false,
            music = false,
            musicType = 0,
            darkThemeConfig = 1,
            useDynamicColor = true,
            shouldHideOnboarding = false,
            themeBrand = 0,
        )
    }
}
