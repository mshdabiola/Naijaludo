package com.mshdabiola.naijaludo.model

data class Pawn(
    val indexx: Int = 0,
    val currentPos: Int = indexx * -1,
    val color: GameColor = GameColor.RED,
    val isEnable: Boolean = false,
    val zIndex: Float = 1f,
) {

    fun isOut() = currentPos >=56
    fun isOnPath() = currentPos in 0..50

    fun isHome() = currentPos < 0
    val idx
        get() = color.ordinal * 4 + indexx - 1

    fun isInSavePath() = currentPos in 51..55
    override fun toString(): String {
        return " color-$color - index $indexx - id $idx pos $currentPos"
    }
}
