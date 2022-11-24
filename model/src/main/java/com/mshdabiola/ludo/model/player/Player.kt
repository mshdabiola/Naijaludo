package com.mshdabiola.ludo.model.player

import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.LudoGameState

interface Player {
    val name: String
    val win: Int
    val isCurrent: Boolean
    val colors: List<GameColor>
    val iconIndex: Int

    fun chooseCounter(
        gameState: LudoGameState,
    ): Int

    // check kill
    // check if any can move out
    // move pawn -- danger pawn first
    /*
    movable pawn map
    Map<Pawn, list<Pair<PawnOut,Distance>> -distance for under attack
    sort by distance remain
     */

    fun choosePawn(gameState: LudoGameState): Int

    fun copyPlayer(
        name: String = this.name,
        win: Int = this.win,
        isCurrent: Boolean = this.isCurrent,
        colors: List<GameColor> = this.colors
    ): Player
}
