package com.mshdabiola.database

import com.mshdabiola.database.dao.LudoDao
import com.mshdabiola.database.dao.PawnDao
import com.mshdabiola.database.dao.PlayerDao
import com.mshdabiola.database.model.LudoEntity
import com.mshdabiola.database.model.toPawnEntity
import com.mshdabiola.database.model.toPlayerEntity
import com.mshdabiola.ludo.model.LudoGameState
import javax.inject.Inject

class LudoStateDomain @Inject constructor(
    private val ludoDao: LudoDao,
    private val pawnDao: PawnDao,
    private val playerDao: PlayerDao
) {
    suspend fun insertLudo(ludoGameState: LudoGameState, id: Int?=null) {
        val ludoEntity = LudoEntity(id)

        val gameId = ludoDao.upsert(ludoEntity)
        val playerList = ludoGameState.listOfPlayer
        val listPawnEntity = ludoGameState.listOfPawn.map { pawn ->
            val playerId = playerList.indexOfFirst { pawn.color in it.colors }

            pawn.toPawnEntity(playerId = playerId, gameId = gameId)
        }
        val playerEntity= playerList.mapIndexed{ index, player ->  player.toPlayerEntity(index,gameId) }


        pawnDao.upsertMany(listPawnEntity)
        playerDao.upsertMany(playerEntity)
    }
}