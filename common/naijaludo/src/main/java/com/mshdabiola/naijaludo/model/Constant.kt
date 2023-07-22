package com.mshdabiola.naijaludo.model


import com.mshdabiola.naijaludo.model.player.HumanPlayer
import com.mshdabiola.naijaludo.model.player.Player
import com.mshdabiola.naijaludo.model.player.RandomComputerPlayer
import java.util.logging.Logger
import kotlin.math.abs

fun log(msg: String) {
    Logger.getLogger("Ludo game ").severe(msg)
//     Log.d(, msg)
}

object Constant {
    private const val numberOfDice = 3
    private const val totalIndex = numberOfDice / 2
    var difficulty = 6
    var colors =GameColor.entries.toList()

    var photoUri: String? = null
    fun getDefaultGameState(
        numberOfPlayer: Int = 2,
        numberOfPawn: Int = 4,
        playerName: String = "Ade",
    ) = LudoGameState(
        listOfPlayer = getDefaultPlayers(numberOfPlayer, playerName),
        listOfDice = geDefaultDice(),
        listOfPawn = getDefaultPawns(numberOfPawn),
        listOfCounter = getDefaultCounter(),
    )

    fun getDefaultPawns(numberOfPawn: Int): List<Pawn> {
        val listPawns = ArrayList<Pawn>()
        val numberOfPawn2 = if (numberOfPawn < 2) 4 else numberOfPawn

        GameColor.values().forEach { gameColor ->
            (1..4).map { colorNumber ->
                val pawn = if (colorNumber <= numberOfPawn2) {
                    Pawn(colorNumber = colorNumber, color = gameColor)
                } else {
                    Pawn(colorNumber = colorNumber, color = gameColor, currentPos = 56)
                }
                listPawns.add(pawn)
            }
        }
        return listPawns
    }

    fun getDefaultOutPawns(numberOfPawn: Int = 4): List<Pawn> {
        return getDefaultPawns(numberOfPawn)
            .map { it.copy(currentPos = 56) }
    }

    fun getDefaultPlayers(numberOfPlayer: Int, name: String): List<Player> {
        val icon = IntArray(6) { it }
        icon.shuffle()
        return if (numberOfPlayer == 2) {
            listOf(
                RandomComputerPlayer(
                    name = "Robot 1",
                    colors = listOf(GameColor.values()[0], GameColor.values()[1]),
                    iconIndex = icon[0],
                ),
                HumanPlayer(
                    name = name,
                    isCurrent = true,
                    colors = listOf(GameColor.values()[2], GameColor.values()[3]),
                    iconIndex = icon[1],
                ),
            )
        } else {
            listOf(
                RandomComputerPlayer(
                    name = "Robot 1",
                    colors = listOf(GameColor.values()[0]),
                    iconIndex = icon[0],
                ),
                RandomComputerPlayer(
                    name = "Robot 2",
                    colors = listOf(GameColor.values()[1]),
                    iconIndex = icon[1],
                ),
                RandomComputerPlayer(
                    name = "Robot 3",
                    colors = listOf(GameColor.values()[2]),
                    iconIndex = icon[2],
                ),
                HumanPlayer(
                    name = name,
                    isCurrent = true,
                    colors = listOf(GameColor.values()[3]),
                    iconIndex = icon[3],
                ),
            )
        }
    }

    fun getDefaultCounter(): List<Counter> {
        return (0 until numberOfDice).map {
            if (it == totalIndex) {
                Counter(
                    isTotal = true,
                    id = it,
                )
            } else {
                Counter(id = it)
            }
        }
    }

    fun geDefaultDice(): List<Dice> {
        return (0 until numberOfDice).map {
            if (it == totalIndex) {
                Dice(isTotal = true, id = it)
            } else {
                Dice(
                    isEnable = true,
                    id = it,
                )
            }
        }
    }


    //first box property
    private val safeX=
        listOf(
            intArrayOf(1,2,3,4,5),
            intArrayOf(7,7,7,7,7),
            intArrayOf(13,12,11,10,9),
            intArrayOf(7,7,7,7,7)
        )

    private val safeY=
        listOf(
            intArrayOf(7,7,7,7,7),
            intArrayOf(1,2,3,4,5),
            intArrayOf(7,7,7,7,7),
            intArrayOf(13,12,11,10,9)
        )

    // 11   41
    // 14   44
    private val homeX= listOf(
        intArrayOf(1,4,1,4),
        intArrayOf(10,13,10,13),
        intArrayOf(10,13,10,13),
        intArrayOf(1,4,1,4)
    )
    private val homeY= listOf(
        intArrayOf(1,1,4,4),
        intArrayOf(1,1,4,4),
        intArrayOf(10,10,13,13),
        intArrayOf(10,10,13,13)
    )

    val startX= intArrayOf(1,8,13,6)
    val startY= intArrayOf(6,1,8,13)

    private val pathX=
        intArrayOf(
            0,1,2,3,4,5,
            6,6,6,6,6,6,
            7,
            8,8,8,8,8,8,
            9,10,11,12,13,14,
            14,
            14,13,12,11,10,9,
            8,8,8,8,8,8,
            7,
            6,6,6,6,6,6,
            5,4,3,2,1,0,
            0
        )
    private val pathY=
        intArrayOf(
            6,6,6,6,6,6,
            5,4,3,2,1,0,
            0,
            0,1,2,3,4,5,
            6,6,6,6,6,6,
            7,
            8,8,8,8,8,8,
            9,10,11,12,13,14,
            14,
            14,13,12,11,10,9,
            8,8,8,8,8,8,
            7
        )





    fun getBoxByIndex(index: Int, gameColor: GameColor): Point {
        // home -1 to -4

        // start point 0

        // path 1 to 50

        // safe path 51 to 55

        // out 56
        val color= colors.indexOf(gameColor)
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

            56 -> getLastBox()
            else -> getHomeBox(abs(index + 1), color) // because home is -1 to -4
        }
    }



    private fun getBoxByIndex(index: Int) :Point{
        val x=pathX[index]
        val y=pathY[index]
        return Point(x.toFloat(),y.toFloat())
    }

    private fun getSafeBox(index: Int,colorIndex:Int): Point {


        val x=safeX[colorIndex][index]
        val y=safeY[colorIndex][index]
        return Point(x.toFloat(),y.toFloat())

    }

    private fun getLastBox() = Point(7f, 7f)
    private fun getStartBox(colorIndex:Int): Point {


        val x=startX[colorIndex]
        val y=startY[colorIndex]
        return Point(x.toFloat(),y.toFloat())
    }

    private fun getHomeBox(index: Int, colorIndex:Int): Point {

        val x=homeX[colorIndex][index]
        val y=homeY[colorIndex][index]
        return Point(x.toFloat(),y.toFloat())
    }

    fun specificToGeneral(index: Int, color:GameColor): Int {
        val colorIndex= colors.indexOf(color)
        val homeOfColor = getCurrentIndex(getStartBox(colorIndex))

        return if (index > (51 - homeOfColor)) homeOfColor + index - 52 else index + homeOfColor
    }

    private fun getCurrentIndex(point: Point): Int {
        return pathX.zip(pathY).indexOfFirst {
            it.first==point.x.toInt() && it.second==point.y.toInt()
        }
    }
}
