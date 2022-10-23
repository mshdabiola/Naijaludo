package com.mshdabiola.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Upsert
import com.mshdabiola.database.model.LudoAndOthers
import com.mshdabiola.database.model.LudoEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LudoDao {

    @Upsert
    suspend fun upsert(ludoEntity: LudoEntity) : Long

    @Delete
    suspend fun delete(ludoEntity: LudoEntity) :Int

    @Query("DELETE FROM ludo_table WHERE id = :id")
    suspend fun deleteById(id: Int)

    @Query("SELECT * FROM ludo_table WHERE id = :id")
    fun getOne(id : Int):Flow<LudoEntity>

    @Query("SELECT * FROM ludo_table")
    fun getAll(): Flow<List<LudoEntity>>

    @Query("SELECT * FROM ludo_table ORDER BY date DESC LIMIT 1 ")
    fun getLatest():Flow<LudoEntity>

    @Transaction
    @Query("SELECT * FROM ludo_table WHERE id = :id")
    fun getLudoAndOther(id: Long):Flow<LudoAndOthers>

}