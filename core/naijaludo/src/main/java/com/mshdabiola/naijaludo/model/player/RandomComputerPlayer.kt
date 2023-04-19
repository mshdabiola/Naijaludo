package com.mshdabiola.naijaludo.model.player

import com.mshdabiola.naijaludo.model.Board
import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.naijaludo.model.LudoGameState
import com.mshdabiola.naijaludo.model.Pawn
import com.mshdabiola.naijaludo.model.log
import kotlin.math.pow

data class RandomComputerPlayer(
    override val name: String = "C. Player",
    override val win: Int = 0,
    override val isCurrent: Boolean = false,
    override val colors: List<GameColor>,
    override val iconIndex: Int,
) : ComputerPlayer {

    override fun chooseCounter(
        gameState: LudoGameState,
    ): Int {
        val selected = counterLogic(gameState)
        log("selected is counter id $selected")
        return selected
    }

    override fun choosePawn(gameState: LudoGameState): Int {
        return pawnLogic(gameState)
    }

    override fun copyPlayer(
        name: String,
        win: Int,
        isCurrent: Boolean,
        colors: List<GameColor>,
    ): ComputerPlayer {
        return copy(
            name = name,
            win = win,
            isCurrent = isCurrent,
            colors = colors,
        )
    }

    fun counterLogic(ludoGameState: LudoGameState): Int {
        val enableCounter =
            ludoGameState
                .listOfCounter
                .filter { it.isEnable }
                .sortedBy { it.id }
        log("enabled counter is $enableCounter")

        val oppPawn = getOpponentPawns(ludoGameState)
            .filter { it.isOnPath() }
            .map { ludoGameState.board.specificToGeneral(it.currentPos, it.color) }
            .toIntArray()

        val playerPawn = ludoGameState.listOfPawn
            .filter { it.color in colors && !it.isOut() && !it.isInSavePath() }

        // kill //bug
        enableCounter.forEach { counter ->
            playerPawn
                .map {
                    // is home and have six
                    if (it.isHome() && counter.number == 6 && counter.id != 1) {
                        ludoGameState.board.specificToGeneral(0, it.color)
                    } else {
                        // is move
                        ludoGameState.board.specificToGeneral(
                            it.currentPos + counter.number,
                            it.color,
                        )
                    }
                }
                .forEach {
                    if (it in oppPawn) {
                        return counter.id
                    }
                }
        }

        // move out

        // Todo("bug total ")
        enableCounter.forEach { counter ->
            if (counter.number == 6 && counter.id != 1) {
                return counter.id
            }
        }

        // random

        return enableCounter.first().id
    }

    fun pawnLogic(ludoGameState: LudoGameState): Int {
        val enablePawn = ludoGameState
            .listOfPawn
            .filter {
                it.isEnable // && it.color in colors
            }
        val allOppPawns = getOpponentPawns(ludoGameState)

        val pawnIntArray = allOppPawns
            .filter { it.isOnPath() }
            .map { ludoGameState.board.specificToGeneral(it.currentPos, it.color) }
            .toIntArray()

        val currentDiceNumber = ludoGameState.currentDiceNumber
        val totalDiceNumber = ludoGameState.listOfDice[1].number

        val oppPawnOnPath = allOppPawns
            .filter { it.isOnPath() }

        val oppColorAtHome = allOppPawns
            .filter { it.isHome() }
            .map { it.color }
            .distinctBy { it }

        enablePawn.forEach {
            val currentPawnPoss =
                if (it.isHome() && currentDiceNumber == 6) {
                    ludoGameState.board.specificToGeneral(0, it.color)
                } else {
                    ludoGameState.board.specificToGeneral(
                        it.currentPos + currentDiceNumber,
                        it.color,
                    )
                }

            if (currentPawnPoss in pawnIntArray) {
                return it.idx
            }
        }

        // come out
        if (currentDiceNumber == 6 && enablePawn.any { it.isHome() }) {
            val sortedHomePawn = enablePawn
                .filter { it.isHome() }
                .shuffled()
                .map {
                    Pair(
                        it,
                        getPawnPoint(
                            it,
                            oppPawnOnPath,
                            oppColorAtHome,
                            ludoGameState.board,
                            currentDiceNumb = currentDiceNumber,
                            totalDiceNumber,
                        ),
                    )
                }
                .sortedBy { -it.second }

            return sortedHomePawn.first().first.idx
        }

        val sortedMap = enablePawn
            .shuffled()
            .map {
                Pair(
                    it,
                    getPawnPoint(
                        it,
                        oppPawnOnPath,
                        oppColorAtHome,
                        ludoGameState.board,
                        currentDiceNumb = currentDiceNumber,
                        totalDiceNumber,
                    ),
                )
            }
            .sortedBy { -it.second }
        log(
            "sorted by risk ${
                sortedMap.joinToString {
                    "${it.first.idx}-${it.first.color}" +
                            "  ${it.second}"
                }
            }",
        )

        // move
        return sortedMap.first().first.idx
    }

    private fun getPawnPoint(
        currentPawn: Pawn,
        oppPawnOnPath: List<Pawn>,
        oppColorPawnAtHome: List<GameColor>,
        board: Board,
        currentDiceNumb: Int,
        totalDiceNumber: Int,
    ): Float {
        val newPosition = if (currentPawn.isHome()) 0 else currentPawn.currentPos + currentDiceNumb
        val projectPawn = currentPawn.copy(currentPos = newPosition)
        val oppHome = oppColorPawnAtHome
            .map { board.specificToGeneral(0, it) }
            .toIntArray()
        val actualProjectPos = board.specificToGeneral(projectPawn.currentPos, projectPawn.color)
        val actualCurrentPos = board.specificToGeneral(currentPawn.currentPos, currentPawn.color)

        return when {
            currentPawn.isInSavePath() -> getPoint(50)
            projectPawn.isInSavePath() -> getPoint(6) // about to go inside
            isAtRisk(actualCurrentPos, oppHome) -> 1f // at danger area
            isAtRisk(actualProjectPos, oppHome) -> {
                if (isAtSafeArea(actualCurrentPos, oppHome) && totalDiceNumber > 10) {
                    getPoint(4)
                } else {
                    -1f
                }
            }

            else -> {
                var tThreat = 0f
                oppPawnOnPath.forEach { oppoPawn ->
                    val dist = distanceTo(projectPawn, oppoPawn, board)

                    // if the project distance is not moving over the pawn
                    // increase the chance of move
                    if (dist > 0) {
                        tThreat += getPoint(dist)
                    } else {
                        // else reduce it

                        tThreat -= getPoint(6)
                    }
                }
                tThreat
            }
        }
    }

    private fun getOpponentPawns(ludoGameState: LudoGameState): List<Pawn> {
        return ludoGameState.listOfPawn.filter { it.color !in colors }
    }

    private fun getPoint(distance: Int): Float {
        return when (distance) {
            0 -> 0f
            in 1..12 -> getProbability(distance)
            in 13..24 -> getProbability(12) * getProbability(distance - 12)
            in 25..36 ->
                getProbability(12, 2) * getProbability(distance - 24)

            in 37..48 ->
                getProbability(12, 3) * getProbability(distance - 36)

            else -> getProbability(12, 4) * getProbability(distance - 48)
        }
    }

    private fun getProbability(number: Int, pow: Int = 1): Float {
        val result = if (number < 7) {
            (number + 1) / 36f
        } else {
            (12 - number + 1) / 36f
        }
        //  log("number $number probability $result")
        return result.toDouble().pow(pow.toDouble()).toFloat()
    }

    // pawn1 moving toward pawn2
    private fun distanceTo(pawn1: Pawn, pawn2: Pawn, board: Board): Int {
        // check is over pawn1 home
        if (!pawn1.isOnPath() || !pawn2.isOnPath()) {
            return -1
        }

        val distance1 = board.specificToGeneral(pawn1.currentPos, pawn1.color)
        val distance2 = board.specificToGeneral(pawn2.currentPos, pawn2.color)

        val distance = distance2 - distance1
        return if (distance < 0) -1 else distance
    }

    private fun isAtRisk(pos: Int, oppHomePos: IntArray): Boolean {
        oppHomePos.forEach {
            if (pos in it..(it + 5)) {
                return true
            }
        }

        return false
    }

    private fun isAtSafeArea(pos: Int, oppHomePos: IntArray): Boolean {
        oppHomePos.forEach {
            if (getSafeArea(pos, it)) {
                return true
            }
        }

        return false
    }

    private fun getSafeArea(pos: Int, homeId: Int): Boolean {
        return if (homeId == 1) {
            pos == 0 || pos in 51 downTo (51 - 2)
        } else {
            pos in (homeId - 1) downTo (homeId - 3)
        }
    }
}
