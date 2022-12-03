package com.mshdabiola.ludo.model.player

import com.mshdabiola.ludo.model.GameColor
import java.io.InputStream
import java.io.OutputStream

interface RemotePlayer : Player {
    val inputStream: InputStream
    val outputStream: OutputStream

    suspend fun sendDice(dice1: Int, dice2: Int)

    suspend fun getDice(): Pair<Int, Int>
    suspend fun sendCounter(counterId: Int)

    suspend fun getCounter(): Int
    suspend fun sendPawn(pawnId: Int)

    suspend fun getPawn(): Int

    fun copyPlayer(
        inputStream: InputStream = this.inputStream,
        outputStream: OutputStream = this.outputStream,
        name: String = this.name,
        win: Int = this.win,
        isCurrent: Boolean = this.isCurrent,
        colors: List<GameColor> = this.colors
    ): RemotePlayer
}
