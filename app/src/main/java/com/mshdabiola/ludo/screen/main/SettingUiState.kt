package com.mshdabiola.ludo.screen.main

import com.mshdabiola.naijaludo.model.Setting

data class SettingUiState(
    val language: Int = 1,
    val gameLevel: Int = 1,
    val assistant: Boolean = false,

    val boardType: Int = 1,
    val boardStyle: Int = 1,
    val pawnNumber: Int = 4,
    val rotate: Boolean = true,

    val sound: Boolean = false,
    val music: Boolean = false,
    val musicType: Int = 0,

    val playerName: List<String> = listOf(
        "Human",
        "Amaka",
        "Hammed",
        "Alabi",
    )
)


fun SettingUiState.toSetting() = Setting(
    language = language,
    gameLevel = gameLevel,
    assistant = assistant,
    boardType = boardType,
    boardStyle = boardStyle,
    pawnNumber = pawnNumber,
    rotate = rotate,
    sound = sound,
    music = music,
    musicType = musicType

)

fun Setting.toUi() = SettingUiState(
    language = language,
    gameLevel = gameLevel,
    assistant = assistant,
    boardType = boardType,
    boardStyle = boardStyle,
    pawnNumber = pawnNumber,
    rotate = rotate,
    sound = sound,
    music = music,
    musicType = musicType

)
