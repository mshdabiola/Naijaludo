package com.mshdabiola.naijaludo.model

import kotlin.math.abs

class Board(val colors: List<GameColor> = GameColor.values().toList(), val boardType: Int = 0) {


    fun getBoxByIndex(index: Int, gameColor:GameColor): Point {
        // home -1 to -4

        // start point 0

        // path 1 to 50

        // safe path 51 to 55

        // out 56
        val color = colors.indexOf(gameColor)
        return when (index) {
            0 -> Constant.getStartBox(color)
            in 1..50 -> {
                val generalIndex = specificToGeneral(index, gameColor)

                Constant.getBoxByIndex(generalIndex)
            }

            in 51..55 -> {
                val safeIndex = index - 51
                Constant.getSafeBox(safeIndex, color)
            }

            56 -> Constant.getLastBox()
            else -> Constant.getHomeBox(abs(index + 1), color) // because home is -1 to -4
        }
    }

    fun specificToGeneral(index: Int, gameColor: GameColor): Int {
        val colorIndex=colors.indexOf(gameColor)
        val homeOfColor = Constant.getCurrentIndex(Constant.getStartBox(colorIndex))

        return if (index > (51 - homeOfColor)) homeOfColor + index - 52 else index + homeOfColor
    }
}
