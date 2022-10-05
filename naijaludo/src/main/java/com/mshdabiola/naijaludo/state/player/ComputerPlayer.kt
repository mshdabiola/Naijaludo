package com.mshdabiola.naijaludo.state.player

import com.mshdabiola.naijaludo.state.Counter
import com.mshdabiola.naijaludo.state.GameColor
import com.mshdabiola.naijaludo.state.LudoGameState
import com.mshdabiola.naijaludo.state.Pawn


sealed class ComputerPlayer(
    override val name : String = "Computer",
    override val win : Int =0,
    override val isCurrent: Boolean = false,
    override val colors: List<GameColor>
) : Player(name, win, isCurrent, colors) {

    abstract fun chooseCounter(
        gameState: LudoGameState,
    ): Counter

    //check kill
    //check if any can move out
    //move pawn -- danger pawn first
    /*
    movable pawn map
    Map<Pawn, list<Pair<PawnOut,Distance>> -distance for under attack
    sort by distance remain
     */

    abstract fun choosePawn(gameState: LudoGameState): Pawn

}
