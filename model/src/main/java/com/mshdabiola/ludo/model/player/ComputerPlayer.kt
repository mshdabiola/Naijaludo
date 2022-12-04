package com.mshdabiola.ludo.model.player

import com.mshdabiola.ludo.model.LudoGameState

interface ComputerPlayer : Player {

    fun chooseCounter(
        gameState: LudoGameState,
    ): Int

    fun choosePawn(gameState: LudoGameState): Int
}
