package com.mshdabiola.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.mshdabiola.database.model.PlayerEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PlayerDao {

    @Upsert
    suspend fun upsert(playerEntity: PlayerEntity)

    @Upsert
    suspend fun upsertMany(players: List< PlayerEntity>)

    @Delete
    suspend fun delete(playerEntity: PlayerEntity)

    @Delete
    suspend fun deleteMany(vararg playerEntity: PlayerEntity)

    @Query("DELETE FROM player_table WHERE id = :id AND gameId = :gameId")
    suspend fun deleteManyByIdAndGameId(id : Int , gameId : Int)

    @Query("SELECT * FROM player_table WHERE id = :id AND gameId = :gameId")
    fun get(id: Int,gameId: Int):Flow<PlayerEntity>

    @Query("SELECT * FROM player_table")
    fun getAll():Flow<List<PlayerEntity>>
}