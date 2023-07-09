package com.mshdabiola.setting

import com.mshdabiola.naijaludo.model.GameSaver
import com.mshdabiola.naijaludo.model.Pawn
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.naijaludo.model.player.Player
import kotlinx.coroutines.flow.Flow

interface MultiplatformSettings {

    val setting:Flow<Setting>
    suspend fun setGameSetting(setting: Setting)
   // fun getGameSetting(): Setting

   suspend fun setGame(
       players:List<Player>,
       pawns:List<Pawn>
   )
    fun getGame(type: Int):GameSaver?

}
