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
    fun getDefaultGameState(
        numberOfPlayer: Int = 2,
        numberOfPawn: Int = 4,
        playerNames: Array<String> = arrayOf("Human", "Comp1", "Comp2", "Comp3"),
    ) = LudoGameState(
        listOfPlayer = getDefaultPlayers(numberOfPlayer, playerNames),
        listOfDice = geDefaultDice(),
        listOfPawn = getDefaultPawns(numberOfPawn),
        listOfCounter = getDefaultCounter(),
    )

    fun getDefaultPawns(numberOfPawn: Int): List<Pawn> {
        val listPawns = ArrayList<Pawn>()
        val numberOfPawn2 = if (numberOfPawn < 2) 4 else numberOfPawn

        GameColor.values().forEach { gameColor ->
            (1..4).map { id ->
                val pawn = if (id <= numberOfPawn2) {
                    Pawn(indexx = id, color = gameColor)
                } else {
                    Pawn(indexx = id, color = gameColor, currentPos = 56)
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

    fun getDefaultPlayers(numberOfPlayer: Int, playerNames: Array<String>): List<Player> {
        return if (numberOfPlayer == 2) {
            listOf(
                RandomComputerPlayer(
                    name = playerNames[1],
                    colors = listOf(GameColor.values()[0], GameColor.values()[1]),
                    iconIndex = 0,
                ),
                HumanPlayer(
                    name = playerNames[0],
                    isCurrent = true,
                    colors = listOf(GameColor.values()[2], GameColor.values()[3]),
                    iconIndex = 6,
                ),
            )
        } else {
            listOf(
                RandomComputerPlayer(
                    name = playerNames[1],
                    colors = listOf(GameColor.values()[0]),
                    iconIndex = 0,
                ),
                RandomComputerPlayer(
                    name = playerNames[2],
                    colors = listOf(GameColor.values()[1]),
                    iconIndex = 1,
                ),
                RandomComputerPlayer(
                    name = playerNames[3],
                    colors = listOf(GameColor.values()[2]),
                    iconIndex = 2,
                ),
                HumanPlayer(
                    name = playerNames[0],
                    isCurrent = true,
                    colors = listOf(GameColor.values()[3]),
                    iconIndex = 6,
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
    fun getDiceBox(level: Int) = when (level) {
        0 -> intArrayOf(1, 2, 3, 4, 5, 6)
        1 -> intArrayOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6)
        else -> intArrayOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6)
    }
}
