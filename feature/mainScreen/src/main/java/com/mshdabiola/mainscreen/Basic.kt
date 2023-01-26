package com.mshdabiola.mainscreen

import com.mshdabiola.datastore.BasicPref

data class Basic(
    val language: Int = 1,
    val gameLevel: Int = 1,
    val assistant: Boolean = false,
)

fun BasicPref.toBasic() = Basic(language, gameLevel, assistant)
fun Basic.toBasicPref() = BasicPref(language, gameLevel, assistant)
