package com.mshdabiola.naijaludo.model

import kotlinx.serialization.Serializable

@Serializable
data class Pawn(
    val colorNumber: Int = 0,
    val currentPos: Int = 0,
    val color: GameColor = GameColor.RED,
    val isEnable: Boolean = false,
    val zIndex: Float = 1f,
    val pawnId: Int = color.ordinal * 4 + colorNumber - 1,
) {

    fun isOut() = currentPos >= 56
    fun isOnPath() = currentPos in 0..50

    fun isHome() = currentPos < 0

    fun isInSavePath() = currentPos in 51..55
    override fun toString(): String {
        return " color-$color - index $colorNumber - id $pawnId pos $currentPos"
    }
}

fun Pawn.showText() = zIndex.toInt() > 1 && currentPos < 56
