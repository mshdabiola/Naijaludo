package com.mshdabiola.naijaludo.model

import kotlinx.serialization.Serializable

@Serializable
data class Pawn(
    val colorNumber: Int = 0,//1-4
    val currentPos: Int = colorNumber * -1,
    val color: GameColor = GameColor.RED,
    val isEnable: Boolean = false,
    val zIndex: Float = 1f,
) {

    fun isOut() = currentPos >= 56
    fun isOnPath() = currentPos in 0..50

    fun isHome() = currentPos < 0
    val pawnId
        get() = color.ordinal * 4 + colorNumber - 1

    fun isInSavePath() = currentPos in 51..55
    override fun toString(): String {
        return " color-$color - index $colorNumber - id $pawnId pos $currentPos"
    }
}
