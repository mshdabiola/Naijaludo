package com.mshdabiola.naijaludo.model.player

import com.mshdabiola.naijaludo.model.LudoGameState

interface ComputerPlayer : Player {

    fun chooseCounter(
        gameState: LudoGameState,
    ): Int

    fun choosePawn(gameState: LudoGameState): Int
}
