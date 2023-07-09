package com.mshdabiola.naijaludo.model

import kotlinx.serialization.Serializable

@Serializable
data class Setting(
    val language: Int = 1,
    val gameLevel: Int = 1,
    val assistant: Boolean = true,

    val boardType: Int = 0,
    val boardStyle: Int = 0,
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
