package com.mshdabiola.setting

import com.mshdabiola.naijaludo.model.Pawn
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.naijaludo.model.player.Player
import com.mshdabiola.setting.model.User
import kotlinx.coroutines.flow.Flow

interface MultiplatformSettings {

    val setting:Flow<Setting>
    suspend fun setGameSetting(setting: Setting)
   // fun getGameSetting(): Setting

   suspend fun setGame(
       players:List<Player>,
       pawns:List<Pawn>
   )
    fun getGame(type: Int,name: String):Pair<List<Player>,List<Pawn>>

    fun getName():Flow<String>
    suspend fun setName(name:String)

     fun getUser():User?
    suspend fun setUser(user:User)

}
