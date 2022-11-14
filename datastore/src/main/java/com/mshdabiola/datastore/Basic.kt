package com.mshdabiola.datastore

data class BasicPref(
    val language: Int = 1,
    val gameLevel: Int = 1,
    val directCount: Boolean = false,
    val assistant: Boolean = false,
)

fun UserPreferences.toBasicPref() = BasicPref(language, gameLevel, directCount, assistant)

data class SoundPref(
    val sound: Boolean = false,
    val music: Boolean = false

)

fun UserPreferences.toSoundPref() = SoundPref(sound, music)

data class BoardPref(
    val boardType: Int = 1,
    val boardStyle: Int = 1,
    val pawnNumber: Int = 4,
    val rotate: Boolean = true
)

fun UserPreferences.toBoardPref() =
    BoardPref(
        boardType, boardStyle, pawnNumber, rotate
    )

data class ProfilePref(
    val playerName: String = "Human",
    val computer1: String = "Comp1",
    val computer2: String = "Comp2",
    val computer3: String = "Comp3"
)

fun ProfilePref.toList() = arrayOf(playerName, computer1, computer2, computer3)
fun UserPreferences.toProfilePref() = ProfilePref(playerName, comName1, comName2, comName3)
