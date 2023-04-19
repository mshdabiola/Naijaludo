package com.mshdabiola.ludo.model.player

import com.mshdabiola.ludo.model.Constant
import com.mshdabiola.ludo.model.Counter
import com.mshdabiola.ludo.model.Dice
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.LudoGameState
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ExpeRandomComputerPlayerTest {

    lateinit var expeRandomComputerPlayer: RandomComputerPlayer
    lateinit var ludoGameState: LudoGameState

    @BeforeEach
    fun setUp() {
        expeRandomComputerPlayer = RandomComputerPlayer(
            colors = listOf(GameColor.values()[0], GameColor.values()[1]),
            iconIndex = 1,
        )
        val humanPlayer = HumanPlayer(
            colors = listOf(GameColor.values()[3], GameColor.values()[2]),
            iconIndex = 1,
        )

        ludoGameState = Constant
            .getDefaultGameState()
            .copy(
                listOfPlayer = listOf(expeRandomComputerPlayer, humanPlayer),
            )
    }

    @Test
    fun counterLogic() {
        val counters = Constant.getDefaultCounter().toMutableList()
        counters[0] = Counter(id = 0, isEnable = true, number = 6)
        counters[1] = Counter(id = 1, isEnable = true, number = 6)
        counters[2] = Counter(id = 2, isEnable = true, number = 6)
        var index = expeRandomComputerPlayer
            .counterLogic(ludoGameState.copy(listOfCounter = counters))

        assertEquals(index, 0)

        counters[0] = Counter(id = 0, isEnable = false, number = 0)
        counters[1] = Counter(id = 1, isEnable = false, number = 6)
        counters[2] = Counter(id = 2, isEnable = true, number = 6)
        index = expeRandomComputerPlayer
            .counterLogic(ludoGameState.copy(listOfCounter = counters))
        assertEquals(index, 2)
    }

    @Test
    fun when_it_is_2_4() {
        val counters = Constant.getDefaultCounter().toMutableList()
        counters[0] = Counter(id = 0, isEnable = true, number = 2)
        counters[1] = Counter(id = 1, isEnable = true, number = 6)
        counters[2] = Counter(id = 2, isEnable = true, number = 4)
        var index = expeRandomComputerPlayer
            .counterLogic(ludoGameState.copy(listOfCounter = counters))

        assertEquals(index, 0)

        counters[0] = Counter(id = 0, isEnable = false, number = 0)
        counters[1] = Counter(id = 1, isEnable = false, number = 0)
        counters[2] = Counter(id = 2, isEnable = true, number = 4)
        index = expeRandomComputerPlayer
            .counterLogic(ludoGameState.copy(listOfCounter = counters))
        assertEquals(index, 2)
    }

    @Test
    fun when_it_is_3_2() {
        val counters = Constant.getDefaultCounter().toMutableList()
        counters[0] = Counter(id = 0, isEnable = true, number = 3)
        counters[1] = Counter(id = 1, isEnable = true, number = 5)
        counters[2] = Counter(id = 2, isEnable = true, number = 2)
        var index = expeRandomComputerPlayer
            .counterLogic(ludoGameState.copy(listOfCounter = counters))

        assertEquals(index, 0)

        counters[0] = Counter(id = 0, isEnable = false, number = 0)
        counters[1] = Counter(id = 1, isEnable = false, number = 0)
        counters[2] = Counter(id = 2, isEnable = true, number = 2)
        index = expeRandomComputerPlayer
            .counterLogic(ludoGameState.copy(listOfCounter = counters))
        assertEquals(index, 2)
    }

    @Test
    fun pawnLogic() {
        val counters = Constant.getDefaultCounter().toMutableList()
        counters[0] = Counter(id = 1, isEnable = true, number = 6)

        var pawn = Constant.getDefaultPawns(4)
            .toMutableList()
        val dice = Constant.geDefaultDice().toMutableList()
        dice[0] = Dice(id = 0, number = 5)

        pawn[10] = pawn[10].copy(currentPos = 35)
        pawn[0] = pawn[0].copy(currentPos = 53, isEnable = true)
        val newPawns = pawn
//            .map {
//            if (it.color in expeRandomComputerPlayer.colors)
//                it.copy(isEnable = true) else it
//        }

        val index = expeRandomComputerPlayer
            .pawnLogic(
                ludoGameState.copy(
                    listOfCounter = counters,
                    listOfPawn = newPawns,
                    pressedCounterId = 0,
                    listOfDice = dice,

                    ),
            )

        assertEquals(index, 1)
    }

    @Test
    fun printAllPath() {
        repeat(52) {
            println("$it is ${ludoGameState.board.getBoxByIndex(it, GameColor.RED)}")
        }
    }
}
