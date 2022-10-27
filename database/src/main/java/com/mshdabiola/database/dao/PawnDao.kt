package com.mshdabiola.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.mshdabiola.database.model.PawnEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PawnDao {

    @Upsert
    suspend fun upsert(pawnEntity: PawnEntity): Long

    @Upsert
    suspend fun upsertMany(pawns: List<PawnEntity>)

    @Delete
    suspend fun delete(pawnEntity: PawnEntity)

    @Delete
    suspend fun deleteMany(vararg pawnEntity: PawnEntity)

    @Query("SELECT * FROM pawn_table WHERE id = :id AND gameId = :gameId")
    fun getOne(id: Int, gameId: Int): Flow<PawnEntity>

    @Query("SELECT * FROM pawn_table")
    fun getAll(): Flow<List<PawnEntity>>
}
