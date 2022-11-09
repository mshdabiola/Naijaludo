package com.mshdabiola.mainscreen

import com.mshdabiola.datastore.BasicPref

data class Basic(
    val language: Int = 1,
    val gameLevel: Int = 1,
    val directCount: Boolean = false,
    val assistant: Boolean = false,
) {

    val languageOptions = listOf("English", "Yoruba", "Hausa", "Igbo")
    val currentLanguage = languageOptions[language]

    val gameLevelOptions = listOf("Easy", "Normal", "Hard", "Advanced")
    val currentLevel = gameLevelOptions[gameLevel]
}

fun BasicPref.toBasic() = Basic(language, gameLevel, directCount, assistant)
fun Basic.toBasicPref() = BasicPref(language, gameLevel, directCount, assistant)
