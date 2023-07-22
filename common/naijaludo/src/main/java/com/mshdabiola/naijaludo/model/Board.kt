package com.mshdabiola.naijaludo.model

import kotlin.math.abs

class Board2(val colors: List<GameColor> = GameColor.values().toList(), val boardType: Int = 0) {


    //first box property
    val safeX=
        listOf(
            intArrayOf(1,2,3,4,5),
            intArrayOf(7,7,7,7,7),
            intArrayOf(13,12,11,10,9),
            intArrayOf(7,7,7,7,7)
        )

    val safeY=
        listOf(
            intArrayOf(7,7,7,7,7),
            intArrayOf(1,2,3,4,5),
            intArrayOf(7,7,7,7,7),
            intArrayOf(13,12,11,10,9)
        )

    // 11   41
    // 14   44
    val homeX= listOf(
            intArrayOf(1,4,1,4),
            intArrayOf(10,13,10,13),
            intArrayOf(10,13,10,13),
            intArrayOf(1,4,1,4)
        )
    val homeY= listOf(
            intArrayOf(1,1,4,4),
            intArrayOf(1,1,4,4),
            intArrayOf(10,10,13,13),
            intArrayOf(10,10,13,13)
        )

    val startX= intArrayOf(1,8,13,6)
    val startY= intArrayOf(6,1,8,13)





    // Starting point <col,row>, and number of box
    val homeStartPoint = listOf(Point(0f, 0f), Point(9f, 0f), Point(9f, 9f), Point(0f, 9f))
    val paths = if (colors.isNotEmpty()) initPathBox() else emptyList()
    val safePath = if (colors.isNotEmpty()) initSafePath() else emptyList()
    private val smallHomeBoxes = if (colors.isNotEmpty()) initSmallBoxes() else emptyList()

    val bigHomeBoxes = if (colors.isNotEmpty()) {
        homeStartPoint.mapIndexed { index, Point ->
            Box(
                Point,
                color = colors[index],
                showColor = true,
            )
        }
    } else {
        emptyList()
    }

    private fun initPathBox(): List<Box> {
        val list = ArrayList<Box>(52)

        //
        var boxs = (0..5).map { Box(Point(it.toFloat(), 6f)) }
        list.addAll(boxs)
        boxs = (5 downTo 0).map { Box(Point(6f, it.toFloat())) }
        list.addAll(boxs)
        list.add(Box(Point(7f, 0f)))

        boxs = (0..5).map { Box(Point(8f, it.toFloat())) }
        list.addAll(boxs)
        boxs = (9..14).map { Box(Point(it.toFloat(), 6f)) }
        list.addAll(boxs)
        list.add(Box(Point(14f, 7f)))

        boxs = (14 downTo 9).map { Box(Point(it.toFloat(), 8f)) }
        list.addAll(boxs)
        boxs = (9..14).map { Box(Point(8f, it.toFloat())) }
        list.addAll(boxs)
        list.add(Box(Point(7f, 14f)))

        boxs = (14 downTo 9).map { Box(Point(6f, it.toFloat())) }
        list.addAll(boxs)
        boxs = (5 downTo 0).map { Box(Point(it.toFloat(), 8f)) }
        list.addAll(boxs)
        list.add(Box(Point(0f, 7f)))

        // setHome

        list[1] = list[1].copy(isHome = true, showColor = true, color = colors[0])
        list[14] = list[14].copy(isHome = true, showColor = true, color = colors[1])
        list[27] = list[27].copy(isHome = true, showColor = true, color = colors[2])
        list[40] = list[40].copy(isHome = true, showColor = true, color = colors[3])

        return list
    }

    private fun initSafePath(): List<Box> {
        val list = ArrayList<Box>()

        var boxs = (1..5).map {
            Box(
                Point(it.toFloat(), 7f),
                colors[0],
                showColor = true,
                isSafeArea = true,
            )
        }
        list.addAll(boxs)

        boxs = (1..5).map {
            Box(
                Point(7f, it.toFloat()),
                colors[1],
                showColor = true,
                isSafeArea = true,
            )
        }
        list.addAll(boxs)

        boxs = (13 downTo 9).map {
            Box(
                Point(it.toFloat(), 7f),
                colors[2],
                showColor = true,
                isSafeArea = true,
            )
        }
        list.addAll(boxs)

        boxs = (13 downTo 9).map {
            Box(
                Point(7f, it.toFloat()),
                colors[3],
                showColor = true,
                isSafeArea = true,
            )
        }
        list.addAll(boxs)

        return list
    }

    private fun initSmallBoxes(): List<Box> {
        val listOfPath = ArrayList<Box>()

        val numOfPawn = 4

        homeStartPoint.forEachIndexed { index, Point ->

            val color = colors[index]
            listOfPath.add(Box(Point + Point(1f, 1f), color = color))
            listOfPath.add(Box(Point + Point(4f, 1f), color = color))
            listOfPath.add(Box(Point + Point(1f, 4f), color = color))
            listOfPath.add(Box(Point + Point(4f, 4f), color = color))
            if (numOfPawn == 5) {
                listOfPath.add(Box(Point + Point(2.5f, 2.5f), color = color))
            }
            if (numOfPawn == 6) {
                listOfPath.add(Box(Point + Point(1f, 2.5f), color = color))
                listOfPath.add(Box(Point + Point(4f, 2.5f), color = color))
            }
        }
        return listOfPath
    }

    fun getBoxByIndex(index: Int, color: GameColor): Box {
        // home -1 to -4

        // start point 0

        // path 1 to 50

        // safe path 51 to 55

        // out 56
        return when (index) {
            0 -> getStartBox(color)
            in 1..50 -> {
                val generalIndex = specificToGeneral(index, color)

                getBoxByIndex(generalIndex)
            }

            in 51..55 -> {
                val safeIndex = index - 51
                getSafeBox(safeIndex, color)
            }

            56 -> getLastBox()
            else -> getHomeBox(abs(index + 1), color) // because home is -1 to -4
        }
    }

    public fun getPositionIntPoint(currentPos: Int, color: GameColor): Point {
        val box = getBoxByIndex(currentPos, color)

        return box.point
    }

    private fun getBoxByIndex(index: Int) = paths[index]

    private fun getSafeBox(index: Int, color: GameColor): Box {
        return safePath.filter { it.color == color }[index]
    }

    private fun getLastBox() = Box(point = Point(7f, 7f))
    private fun getStartBox(color: GameColor): Box {
        return paths.first { it.isHome && color == it.color }
    }

    private fun getHomeBox(index: Int, color: GameColor): Box {
        return smallHomeBoxes.filter { color == it.color }[abs(index)]
    }

    fun specificToGeneral(index: Int, color: GameColor): Int {
        val homeOfColor = getCurrentIndex(getStartBox(color))

        return if (index > (51 - homeOfColor)) homeOfColor + index - 52 else index + homeOfColor
    }

    private fun getCurrentIndex(box: Box): Int {
        return paths.indexOfFirst { it == box }
    }
}
