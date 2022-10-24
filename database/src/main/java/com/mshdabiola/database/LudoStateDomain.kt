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
    suspend fun insertLudo(ludoGameState: LudoGameState, id: Long ){



            val ludoEntity = LudoEntity(id = id)
            ludoDao.upsert(ludoEntity)



        val playerList = ludoGameState.listOfPlayer
        val listPawnEntity = ludoGameState.listOfPawn.map { pawn ->
            val playerId = playerList.indexOfFirst { pawn.color in it.colors }

            pawn.toPawnEntity(playerId = playerId, gameId = id)
        }
        val playerEntity =
            playerList.mapIndexed { index, player ->
                player.toPlayerEntity(
                    index,
                    id,
                    player is HumanPlayer
                )
            }


        pawnDao.upsertMany(listPawnEntity)
        playerDao.upsertMany(playerEntity)

    }

    fun getLatestLudoAndOther() =
        ludoDao.getLudoAndOther()


   // fun getLatestGameId() = ludoDao.getLatestGameId()
}