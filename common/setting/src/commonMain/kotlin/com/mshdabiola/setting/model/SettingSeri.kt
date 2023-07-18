package com.mshdabiola.setting.model

import com.mshdabiola.naijaludo.model.Setting
import kotlinx.serialization.Serializable

@Serializable
internal data class SettingSeri(
    val language: Int,
    val gameLevel: Int,
    val assistant: Boolean,

    val boardType: Int,
    val boardStyle: Int,
    val pawnNumber: Int,
    val rotate: Boolean,

    val sound: Boolean,
    val music: Boolean,
    val musicType: Int

)

internal fun SettingSeri.toSetting() = Setting(
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

internal fun Setting.toSettingSeri() = SettingSeri(
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

