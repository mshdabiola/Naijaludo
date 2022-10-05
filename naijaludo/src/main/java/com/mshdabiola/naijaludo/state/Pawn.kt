package com.mshdabiola.naijaludo.state

data class Pawn(
    val id: Int = 0,
    val currentPos: Int =id * -1,
    val color: GameColor = GameColor.RED,
    val isEnable: Boolean = false,
    val zIndex: Float = 1f
) {


    fun getDistanceRemain() = 56 - currentPos

    fun isOut() = getDistanceRemain() == 0
    fun isOnPath() = currentPos in 0..50

    fun isHome() = currentPos < 0
    val index
    get() = color.ordinal*4 + id-1


}