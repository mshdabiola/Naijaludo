package com.mshdabiola.naijaludo.model

import com.mshdabiola.naijaludo.model.player.SavePlayer
import kotlinx.serialization.Serializable

@Serializable
class GameSaver(
    private val players : List<SavePlayer>,
    val pawns : List<Pawn>,
    val time:Long=System.currentTimeMillis()
){
    fun getPlayer()=players.map { it.toOriginal() }
    fun getSaverPlayer()=players
}