package com.mshdabiola.naijaludo.model


import com.mshdabiola.naijaludo.model.player.HumanPlayer
import com.mshdabiola.naijaludo.model.player.Player
import com.mshdabiola.naijaludo.model.player.RandomComputerPlayer
import java.util.logging.Logger

fun log(msg: String) {
    Logger.getLogger("Ludo game ").severe(msg)
//     Log.d(, msg)
}

object Constant {
    private const val numberOfDice = 3
    private const val totalIndex = numberOfDice / 2
    var difficulty=6
    fun getDefaultGameState(
        numberOfPlayer: Int = 2,
        numberOfPawn: Int = 4,
        playerName : String="Ade",
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

    fun getDefaultPlayers(numberOfPlayer: Int,name:String): List<Player> {
        val icon =IntArray(6){it}
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

    //Todo("new dice")

}
