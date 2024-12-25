package com.mshdabiola.ui.state

import com.mshdabiola.naijaludo.model.Setting

data class SettingUiState(
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
    musicType = musicType,

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
    musicType = musicType,
)
