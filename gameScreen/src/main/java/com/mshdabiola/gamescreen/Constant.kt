package com.mshdabiola.gamescreen

import android.util.Log
import androidx.compose.ui.geometry.Offset

fun getInitOfDice(diceId: Int, numberOfDice: Int): Offset {
    val index = if (diceId > (numberOfDice / 2)) diceId - 1 else diceId
    return when (index) {
        0 -> Offset(6f, 6.75f)
        1 -> Offset(7.5f, 6.75f)
        2 -> Offset(7f, 6f)
        3 -> Offset(7f, 8f)
        else -> Offset(6f, 6f)
    }
}

fun randDiceOffSet() = Offset(randNum(), randNum())

fun randNum() = ((0..5) + (9..14)).random().toFloat()

fun isHorizontal(x: Int) = x in 0..5 || x in 9..14

fun log(msg: String) {
    Log.d("Ludo game ", msg)
}
