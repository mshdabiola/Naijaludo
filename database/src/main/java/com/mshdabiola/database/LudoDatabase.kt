package com.mshdabiola.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mshdabiola.database.dao.LudoDao
import com.mshdabiola.database.dao.PawnDao
import com.mshdabiola.database.dao.PlayerDao
import com.mshdabiola.database.model.LudoEntity
import com.mshdabiola.database.model.PawnEntity
import com.mshdabiola.database.model.PlayerEntity

@Database(
    entities = [LudoEntity::class,PawnEntity::class,PlayerEntity::class],
    version = 1
)
abstract class LudoDatabase : RoomDatabase() {

    abstract fun getLudoDao():LudoDao

    abstract fun getPlayerDao():PlayerDao

    abstract fun getPawnDao():PawnDao
}