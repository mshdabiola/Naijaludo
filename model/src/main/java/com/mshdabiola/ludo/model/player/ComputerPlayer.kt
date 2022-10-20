package com.mshdabiola.ludo.model.player

import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.LudoGameState


sealed class ComputerPlayer(
    override val name : String = "Computer",
    override val win : Int =0,
    override val isCurrent: Boolean = false,
    override val colors: List<GameColor>
) : Player(name, win, isCurrent, colors) {

    abstract fun chooseCounter(
        gameState: LudoGameState,
    ): Int

    //check kill
    //check if any can move out
    //move pawn -- danger pawn first
    /*
    movable pawn map
    Map<Pawn, list<Pair<PawnOut,Distance>> -distance for under attack
    sort by distance remain
     */

    abstract fun choosePawn(gameState: LudoGameState): Int

}
