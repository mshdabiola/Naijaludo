package com.mshdabiola.worker

import com.mshdabiola.naijaludo.model.Pawn
import com.mshdabiola.naijaludo.model.player.HumanPlayer
import com.mshdabiola.naijaludo.model.player.Player
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

object FileConverter {
    fun playerToString(players: List<Player>, pawns: List<Pawn>, id: Long): Pair<String, String> {
        val playerList = players
        val listPawnEntity = pawns.map { pawn ->
            val playerId = playerList.indexOfFirst { pawn.color in it.colors }

            pawn.toPawnSer(playerId = playerId, gameId = id)
        }
        val playerEntity =
            playerList.mapIndexed { index, player ->
                player.toPlayerSer(
                    index,
                    id,
                    player is HumanPlayer,
                )
            }

        val playerString = Json.encodeToString(playerEntity)
        val pawnString = Json.encodeToString(listPawnEntity)
        return Pair(pawnString, playerString)
    }
}