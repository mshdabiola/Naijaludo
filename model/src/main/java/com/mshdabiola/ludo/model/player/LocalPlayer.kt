package com.mshdabiola.ludo.model.player

import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.LudoGameState

interface LocalPlayer : Player {

    fun chooseCounter(
        gameState: LudoGameState,
    ): Int

    fun choosePawn(gameState: LudoGameState): Int

    fun copyPlayer(
        name: String = this.name,
        win: Int = this.win,
        isCurrent: Boolean = this.isCurrent,
        colors: List<GameColor> = this.colors
    ): LocalPlayer
}
