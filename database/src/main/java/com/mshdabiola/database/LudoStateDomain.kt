package com.mshdabiola.database

import com.mshdabiola.database.dao.LudoDao
import com.mshdabiola.database.dao.PawnDao
import com.mshdabiola.database.dao.PlayerDao
import com.mshdabiola.database.model.LudoEntity
import com.mshdabiola.database.model.toPawn
import com.mshdabiola.database.model.toPawnEntity
import com.mshdabiola.database.model.toPlayer
import com.mshdabiola.database.model.toPlayerEntity
import com.mshdabiola.ludo.model.LudoGameState
import com.mshdabiola.ludo.model.log
import com.mshdabiola.ludo.model.player.HumanPlayer
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class LudoStateDomain @Inject constructor(
    private val ludoDao: LudoDao,
    private val pawnDao: PawnDao,
    private val playerDao: PlayerDao
) {
    suspend fun insertLudo(ludoGameState: LudoGameState, id: Long? = null): Long {

        var realId: Long? = id

        if (realId == null) {
            val ludoEntity = LudoEntity()
            ludoDao.upsert(ludoEntity)
            realId = ludoDao.getLatestGameId().first()
        }


        val playerList = ludoGameState.listOfPlayer
        val listPawnEntity = ludoGameState.listOfPawn.map { pawn ->
            val playerId = playerList.indexOfFirst { pawn.color in it.colors }

            pawn.toPawnEntity(playerId = playerId, gameId = realId)
        }
        val playerEntity =
            playerList.mapIndexed { index, player ->
                player.toPlayerEntity(
                    index,
                    realId,
                    player is HumanPlayer
                )
            }


        pawnDao.upsertMany(listPawnEntity)
        playerDao.upsertMany(playerEntity)


        log("game id $realId")
        return realId
    }

    fun getLudoAndOther(id: Long) =
        ludoDao.getLudoAndOther(id)
            .map { ludoAndOthers ->

                val pawns = ludoAndOthers.pawnEntity.map { it.toPawn() }
                val playerColorsMap = ludoAndOthers.pawnEntity.groupBy(
                    keySelector = { it.playerId },
                    valueTransform = { it.toPawn().color })
                val players = ludoAndOthers.playerEntity.mapIndexed { index, playerEntity ->
                    playerEntity.toPlayer(playerColorsMap[index]!!.distinct())
                }

                Pair(players, pawns)
            }

    fun getLatestGameId() = ludoDao.getLatestGameId()
}