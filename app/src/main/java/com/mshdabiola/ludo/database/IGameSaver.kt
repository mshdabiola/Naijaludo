package com.mshdabiola.ludo.database

import android.app.Activity

interface IGameSaver {

    fun get2Game(activity: Activity)

    fun get4Game()

    suspend fun saveGame(byte: ByteArray, numb: Int, activity: Activity)
}