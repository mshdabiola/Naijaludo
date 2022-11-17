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
    override val colors: List<GameColor>
) : Player {

    override fun chooseCounter(
        gameState: LudoGameState,
    ): Int {
//        val clickableCounter = gameState.listOfCounter.filter { it.isEnable }
//        //Todo(bug is here)
//        return clickableCounter.random()
        return counterLogic(gameState)
    }

    override fun choosePawn(gameState: LudoGameState): Int {
        // val listOfPawn = gameState.listOfPawn.filter { it.isEnable && it.color in colors }
        // return listOfPawn.random()
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

        val oppPawn = allOppPawns
            .filter { it.isOnPath() }
            .map { ludoGameState.board.specificToGeneral(it.currentPos, it.color) }
            .toIntArray()

        val number = ludoGameState.currentDiceNumber
        val totalDiceNumber = ludoGameState.listOfDice[1].number

        val oppPawn2 = allOppPawns
            .filter { it.isOnPath() }

        val oppColorAtHome = allOppPawns
            .filter { it.isHome() }
            .map { it.color }
            .distinctBy { it }

        // kill

        enablePawn.forEach {

            val pos = if (it.isHome() && number == 6) ludoGameState.board.specificToGeneral(
                0,
                it.color
            ) else ludoGameState.board.specificToGeneral(it.currentPos + number, it.color)

            if (pos in oppPawn) {
                return it.index
            }
        }

        // come out
        if (number == 6 && enablePawn.any { it.isHome() }) {
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
                            newPos = number + it.currentPos,
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
                        newPos = number + it.currentPos,
                        totalDiceNumber
                    )
                )
            }
            .sortedBy { -it.second }
        log(
            "sorted by risk ${sortedMap.joinToString {
                "${it.first.id}-${it.first.color}" +
                    "  ${it.second}"
            }}"
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
        pawn: Pawn,
        oppPawnOnPath: List<Pawn>,
        oppColorPawnAtHome: List<GameColor>,
        board: Board,
        newPos: Int,
        totalDiceNumber: Int
    ): Float {

        return when {
            pawn.currentPos > 51 -> -100f
            newPos > 51 -> 100f
            else -> {
                var point = 0f
                val generalNewPos = board.specificToGeneral(newPos, pawn.color)

                oppPawnOnPath.forEach {
                    val generalOppoPawnPos = board.specificToGeneral(it.currentPos, it.color)
                    log("pos of pawn is $generalNewPos opp pos $generalOppoPawnPos")
                    var distanceBtwPawnAndOpp = generalOppoPawnPos - generalNewPos

                    if (distanceBtwPawnAndOpp < 0) {
                        distanceBtwPawnAndOpp += 52
                    }

                    val distanceBtwOppAndPawn = 52 - distanceBtwPawnAndOpp

                    log(
                        "distance from ${pawn.color} ${pawn.id} and ${it.color} ${it.id}" +
                            " $distanceBtwPawnAndOpp "
                    )

                    point += getPoint(distanceBtwPawnAndOpp)

                    if ((it.getDistanceRemain() - 6) > distanceBtwOppAndPawn) {
                        log(
                            "distance from ${it.color} ${it.id} and" +
                                " ${pawn.color} ${pawn.id} $distanceBtwOppAndPawn "
                        )
                        point -= getPoint(distanceBtwOppAndPawn)
                    }
                }
                oppColorPawnAtHome.forEach {
                    val homePos = board.specificToGeneral(0, it)

                    val position = board.specificToGeneral(pawn.currentPos, pawn.color)

                    when {
                        getRiskyArea(position, homePos) -> {
                            log("is in risk area $pawn")
                            point += 100f
                        }

                        getRiskyArea(generalNewPos, homePos) -> {
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
