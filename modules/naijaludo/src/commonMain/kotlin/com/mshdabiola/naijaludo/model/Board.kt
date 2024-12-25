package com.mshdabiola.naijaludo.model

import kotlin.math.abs

class Board(val colors: List<GameColor> = GameColor.values().toList(), val boardType: Int = 0) {

    fun getBoxByIndex(index: Int, gameColor: GameColor): Point {
        // home -1 to -4

        // start point 0

        // path 1 to 50

        // safe path 51 to 55

        // out 56
        val color = colors.indexOfFirst { gameColor == it }
        return when (index) {
            0 -> getStartBox(color)
            in 1..50 -> {
                val generalIndex = specificToGeneral(index, gameColor)

                getBoxByIndex(generalIndex)
            }

            in 51..55 -> {
                val safeIndex = index - 51
                getSafeBox(safeIndex, color)
            }

            in -1 downTo -4 -> getHomeBox(abs(index + 1), color) // because home is -1 to -4
            else -> getLastBox()
        }
    }

    fun specificToGeneral(index: Int, gameColor: GameColor): Int {
        val colorIndex = colors.indexOf(gameColor)
        val homeOfColor = getCurrentIndex(getStartBox(colorIndex))

        return if (index > (51 - homeOfColor)) homeOfColor + index - 52 else index + homeOfColor
    }

    private fun getBoxByIndex(index: Int): Point {
        val x = Constant.pathX[index]
        val y = Constant.pathY[index]
        return Point(x, y)
    }

    private fun getSafeBox(index: Int, colorIndex: Int): Point {
        val x = Constant.safeX[colorIndex][index]
        val y = Constant.safeY[colorIndex][index]
        return Point(x, y)
    }

    private fun getLastBox() = Point(7, 7)
    private fun getStartBox(colorIndex: Int): Point {
        val x = Constant.startX[colorIndex]
        val y = Constant.startY[colorIndex]
        return Point(x, y)
    }

    private fun getHomeBox(index: Int, colorIndex: Int): Point {
        return try {
            val x = Constant.homeX[colorIndex][index]
            val y = Constant.homeY[colorIndex][index]
            Point(x, y)
        } catch (e: Exception) {
            e.printStackTrace()
            val x = Constant.homeX[colorIndex][0]
            val y = Constant.homeY[colorIndex][0]
            Point(x, y)
        }
    }

    private fun getCurrentIndex(point: Point): Int {
        return Constant.pathX.zip(Constant.pathY).indexOfFirst {
            it.first == point.x && it.second == point.y
        }
    }
}
