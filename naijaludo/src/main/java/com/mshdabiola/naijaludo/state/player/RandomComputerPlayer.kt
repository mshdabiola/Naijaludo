package com.mshdabiola.naijaludo.state.player

import com.mshdabiola.naijaludo.log
import com.mshdabiola.naijaludo.state.Board
import com.mshdabiola.naijaludo.state.Counter
import com.mshdabiola.naijaludo.state.GameColor
import com.mshdabiola.naijaludo.state.LudoGameState
import com.mshdabiola.naijaludo.state.Pawn
import kotlin.math.pow

data class RandomComputerPlayer(
    override val name: String = "C. Player",
    override val win: Int = 0,
    override val isCurrent: Boolean = false,
    override val colors: List<GameColor>
) : ComputerPlayer(name, win, isCurrent, colors) {
    override fun chooseCounter(
        gameState: LudoGameState,
    ): Counter {
//        val clickableCounter = gameState.listOfCounter.filter { it.isEnable }
//        //Todo(bug is here)
//        return clickableCounter.random()
        return counterLogic(gameState)
    }

    override fun choosePawn(gameState: LudoGameState): Pawn {
        // val listOfPawn = gameState.listOfPawn.filter { it.isEnable && it.color in colors }
        // return listOfPawn.random()
        return pawnLogic(gameState)
    }

    private fun counterLogic(ludoGameState: LudoGameState): Counter {
        val enableCounter =
            ludoGameState.listOfCounter.filter { it.isEnable }.sortedBy { it.number }
        val oppPawn = getOpponentPawns(ludoGameState)
            .filter { it.isOnPath() }
            .map { ludoGameState.board.specificToGeneral(it.currentPos, it.color) }
            .toIntArray()

        val playerPawn = ludoGameState.listOfPawn
            .filter { it.color in colors }


        //kill
        enableCounter.forEach { counter ->
            playerPawn
                .map {
                    //is home and have six
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
                        return counter
                    }
                }
        }

        //move out

        enableCounter.forEach {
            if (it.number == 6) {
                return it
            }
        }

        //random

        return enableCounter.random()

    }

    private fun pawnLogic(ludoGameState: LudoGameState): Pawn {

        val enablePawn = ludoGameState.listOfPawn.filter { it.isEnable && it.color in colors }
        val oppPawn = getOpponentPawns(ludoGameState)
            .filter { it.isOnPath() }
            .map { ludoGameState.board.specificToGeneral(it.currentPos, it.color) }
            .toIntArray()
        val number = ludoGameState.currentDice

        val oppPawn2 = getOpponentPawns(ludoGameState)
            .filter { it.isOnPath() }

        //kill

        enablePawn.forEach {

            val pos = if (it.isHome() && number == 6) ludoGameState.board.specificToGeneral(
                0,
                it.color
            ) else ludoGameState.board.specificToGeneral(it.currentPos, it.color) + number

            if (pos in oppPawn) {
                return it
            }
        }

        //come out
        if (number == 6 && enablePawn.any { it.isHome() }) {
           val sortedHomePawn = enablePawn
                .filter { it.isHome() }
                .shuffled()
                .associateBy {
                    getPawnPoint(
                        ludoGameState.board.specificToGeneral(
                            0,
                            it.color
                        ), oppPawn
                    )
                }.toSortedMap()

            return sortedHomePawn[sortedHomePawn.firstKey()]!!
        }
        //test

//        enablePawn.forEach {
//            log("Point is ${getPointNew(it,oppPawn2,ludoGameState.board,ludoGameState.currentDice)}")
//        }

        //test point
       val sortedMap= enablePawn
           .shuffled()
            .associateBy {
                getPointNew(it,oppPawn2,ludoGameState.board,ludoGameState.currentDice)
            }.toSortedMap(compareBy { -it })
           log("sorted by risk $sortedMap")

        //val mean = sortedMap.keys.toFloatArray().average().toFloat()
        //log("Mean is $mean and smallest is $ ${1/36f}")
        //move
        return sortedMap[sortedMap.firstKey()]!!
        //return if(mean<(1/36f)) sortedMap[sortedMap.lastKey()]!!else sortedMap[sortedMap.firstKey()]!!
    }

    private fun getOpponentPawns(ludoGameState: LudoGameState): List<Pawn> {

        return ludoGameState.listOfPawn.filter { it.color !in colors }
    }

    private fun getPawnPoint(pawnPos: Int, oppPawns: IntArray): Float {

        return oppPawns.map {
            val dis = if (pawnPos > it) pawnPos - it else 52 - (it - pawnPos)
            getPoint(dis)
        }.sum()

    }

    private fun getPoint(distance: Int): Float {
        log("get point on distance $distance")
        return when (distance) {
            in 1..12 -> getProbability(distance)
            in 13..24 -> getProbability(12) * getProbability(distance-12)
            in 25..36 -> getProbability(12,2) * getProbability(distance-24)
            else -> getProbability(12,3) * getProbability(distance-36)
        }

    }

    private fun getProbability(number: Int, pow: Int = 1): Float {
        val result = if (number < 7) (number + 1) / 36f
        else (12 - number + 1) / 36f
        //log("number $number probability $result2")
        return result.toDouble().pow(pow.toDouble()).toFloat()
    }

    private fun getPointNew(pawn : Pawn, oppPawn:List<Pawn>, board: Board, num : Int):Float{
        var point =0f

        val gpp = board.specificToGeneral(pawn.currentPos+num,pawn.color)

        oppPawn.forEach {
            val gop = board.specificToGeneral(it.currentPos,it.color)

            val projectDistance = if(gpp>gop) gpp-gop else 52-(gop-gpp)

            val oppToPawn =52-projectDistance

//            log("btw ${pawn.id}-${pawn.color} and ${it.id}-${it.color} from Pawn $projectDistance to Pawn $oppToPawn")

            if ((pawn.getDistanceRemain()-6)>projectDistance) {
                log("subtract point")
                point -= getPoint(projectDistance)
            }

            if ((it.getDistanceRemain()-6)>oppToPawn) {
                log("add point")
                point += getPoint(oppToPawn)
            }
        }

        return point
    }



}
