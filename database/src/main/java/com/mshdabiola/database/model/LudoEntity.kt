package com.mshdabiola.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "ludo_table")
data class LudoEntity(
    @PrimaryKey(autoGenerate = true)
    val id : Int?=null,
    val date: Long=Date().time ,
    )
