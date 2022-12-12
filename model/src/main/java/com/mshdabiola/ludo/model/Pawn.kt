package com.mshdabiola.ludo.model

data class Pawn(
    val indexx: Int = 0,
    val currentPos: Int = indexx * -1,
    val color: GameColor = GameColor.RED,
    val isEnable: Boolean = false,
    val zIndex: Float = 1f
) {

    fun getDistanceRemain() = 56 - currentPos

    fun isOut() = getDistanceRemain() == 0
    fun isOnPath() = currentPos in 0..50

    fun isHome() = currentPos < 0
    val idx
        get() = color.ordinal * 4 + indexx - 1

    fun isInSavePath() = currentPos > 50
    override fun toString(): String {
        return "\n$color - $indexx - $idx"
    }
}
