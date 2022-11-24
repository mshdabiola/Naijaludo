package com.mshdabiola.ludo.model.player

import com.mshdabiola.ludo.model.Board
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.LudoGameState
import com.mshdabiola.ludo.model.Pawn
import com.mshdabiola.ludo.model.log
import kotlin.math.pow

data class RandomComputerPlayer(
    override val name: String = "C. Player",
    override val win: Int = 0,
    override val isCurrent: Boolean = false,
    override val colors: List<GameColor>,
    override val iconIndex: Int
) : Player {

    override fun chooseCounter(
        gameState: LudoGameState,
    ): Int {

        return counterLogic(gameState)
    }

    override fun choosePawn(gameState: LudoGameState): Int {

        return pawnLogic(gameState)
    }

    override fun copyPlayer(
        name: String,
        win: Int,
        isCurrent: Boolean,
        colors: List<GameColor>
    ): Player {
        return copy(
            name = name,
            win = win,
            isCurrent = isCurrent,
            colors = colors
        )
    }

    private fun counterLogic(ludoGameState: LudoGameState): Int {
        val enableCounter =
            ludoGameState.listOfCounter.filter { it.isEnable }.sortedBy { it.id }

        val oppPawn = getOpponentPawns(ludoGameState)
            .filter { it.isOnPath() }
            .map { ludoGameState.board.specificToGeneral(it.currentPos, it.color) }
            .toIntArray()

        val playerPawn = ludoGameState.listOfPawn
            .filter { it.color in colors && !it.isOut() }

        // kill
        enableCounter.forEach { counter ->
            playerPawn
                .map {
                    // is home and have six
                    if (it.isHome() && counter.number == 6)
                        ludoGameState.board.specificToGeneral(0, it.color)
                    else
                    // is move
                        ludoGameState.board.specificToGeneral(
                            it.currentPos + counter.number,
                            it.color
                        )
                }
                .forEach {
                    if (it in oppPawn) {
                        return counter.id
                    }
                }
        }

        // move out

        enableCounter.forEach {
            if (it.number == 6) {
                return it.id
            }
        }

        // random

        return enableCounter.first().id
    }

    private fun pawnLogic(ludoGameState: LudoGameState): Int {

        val enablePawn = ludoGameState.listOfPawn.filter { it.isEnable && it.color in colors }
        val allOppPawns = getOpponentPawns(ludoGameState)

        val oppPawnOnPath = allOppPawns
            .filter { it.isOnPath() }
            .map { ludoGameState.board.specificToGeneral(it.currentPos, it.color) }
            .toIntArray()

        val currentDiceNumber = ludoGameState.currentDiceNumber
        val totalDiceNumber = ludoGameState.listOfDice[1].number

        val oppPawn2 = allOppPawns
            .filter { it.isOnPath() }

        val oppColorAtHome = allOppPawns
            .filter { it.isHome() }
            .map { it.color }
            .distinctBy { it }

        // kill

        enablePawn.forEach {

            val currentPawnPoss =
                if (it.isHome() && currentDiceNumber == 6)
                    ludoGameState.board.specificToGeneral(0, it.color)
                else
                    ludoGameState.board.specificToGeneral(
                        it.currentPos + currentDiceNumber,
                        it.color
                    )

            if (currentPawnPoss in oppPawnOnPath) {
                return it.index
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
                            oppPawn2,
                            oppColorAtHome,
                            ludoGameState.board,
                            newPos = currentDiceNumber + it.currentPos,
                            totalDiceNumber
                        )
                    )
                }
                .sortedBy { -it.second }

            return sortedHomePawn.first().first.index
        }

        // test point
        val sortedMap = enablePawn
            .shuffled()
            .map {

                Pair(
                    it,
                    getPawnPoint(
                        it,
                        oppPawn2,
                        oppColorAtHome,
                        ludoGameState.board,
                        newPos = currentDiceNumber + it.currentPos,
                        totalDiceNumber
                    )
                )
            }
            .sortedBy { -it.second }
        log(
            "sorted by risk ${
            sortedMap.joinToString {
                "${it.first.id}-${it.first.color}" +
                    "  ${it.second}"
            }
            }"
        )

        // move
        return sortedMap.first().first.index
    }

    private fun getOpponentPawns(ludoGameState: LudoGameState): List<Pawn> {

        return ludoGameState.listOfPawn.filter { it.color !in colors }
    }

    private fun getPoint(distance: Int): Float {
        log("get point on distance $distance")
        return when (distance) {
            in 1..12 -> getProbability(distance)
            in 13..24 -> getProbability(12) * getProbability(distance - 12)
            in 25..36 ->
                getProbability(12, 2) * getProbability(distance - 24)

            else -> getProbability(12, 3) * getProbability(distance - 36)
        }
    }

    private fun getProbability(number: Int, pow: Int = 1): Float {
        val result = if (number < 7) (number + 1) / 36f
        else (12 - number + 1) / 36f
        // log("number $number probability $result2")
        return result.toDouble().pow(pow.toDouble()).toFloat()
    }

    private fun getPawnPoint(
        currentPawn: Pawn,
        oppPawnOnPath: List<Pawn>,
        oppColorPawnAtHome: List<GameColor>,
        board: Board,
        newPos: Int,
        totalDiceNumber: Int
    ): Float {

        return when {
            currentPawn.currentPos > 51 -> -100f // is inside home
            newPos > 51 -> 100f // about to go inside
            else -> {
                var point = 0f
                val posThatPawnWillGo = board.specificToGeneral(newPos, currentPawn.color)

                // from pawn on track
                oppPawnOnPath.forEach { oppoPawn ->
                    val generalCurrentPosOfOppoPawn = board
                        .specificToGeneral(oppoPawn.currentPos, oppoPawn.color)
                    log(
                        "pos of pawn is $posThatPawnWillGo opp pos" +
                            " $generalCurrentPosOfOppoPawn"
                    )
                    var distanceBtwPawnAndOpp = generalCurrentPosOfOppoPawn - posThatPawnWillGo

                    if (distanceBtwPawnAndOpp < 0) {
                        distanceBtwPawnAndOpp += 52
                    }

                    val distanceBtwOppAndPawn = 52 - distanceBtwPawnAndOpp

                    log(
                        "distance from ${currentPawn.color} ${currentPawn.id} and " +
                            "${oppoPawn.color} ${oppoPawn.id}" +
                            " $distanceBtwPawnAndOpp "
                    )

                    point += getPoint(distanceBtwPawnAndOpp)

                    if ((oppoPawn.getDistanceRemain() - 6) > distanceBtwOppAndPawn) {
                        // is going inside the home i dont undstand this line
                        log(
                            "distance from ${oppoPawn.color} ${oppoPawn.id} and" +
                                " ${currentPawn.color} ${currentPawn.id} " +
                                "$distanceBtwOppAndPawn "
                        )
                        point -= getPoint(distanceBtwOppAndPawn)
                    }
                }
                // end for each pawn
                // from home attack
                oppColorPawnAtHome.forEach {
                    val homePos = board.specificToGeneral(0, it)

                    val position = board
                        .specificToGeneral(currentPawn.currentPos, currentPawn.color)

                    when {
                        getRiskyArea(position, homePos) -> {
                            log("is in risk area $currentPawn")
                            point += 100f
                        }

                        getRiskyArea(posThatPawnWillGo, homePos) -> {
                            log("total number is $totalDiceNumber")
                            if (totalDiceNumber > 10 && getSafeArea(position, homePos)) {
                                point = 0f
                            } else {
                                point -= 100f
                            }
                        }
                    }
                }

                point
            }
        }
    }

    private fun getRiskyArea(pos: Int, homeId: Int): Boolean {

        return pos in homeId..(homeId + 5)
    }

    private fun getSafeArea(pos: Int, homeId: Int): Boolean {
        return if (homeId == 1) {
            pos == 0 || pos in 51 downTo (51 - 2)
        } else {
            pos in (homeId - 1) downTo (homeId - 3)
        }
    }
}
