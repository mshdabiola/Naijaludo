package com.mshdabiola.setting

import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.naijaludo.model.Pawn
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.naijaludo.model.player.Player
import com.mshdabiola.setting.model.GameSaver
import com.mshdabiola.setting.model.SettingSeri
import com.mshdabiola.setting.model.User
import com.mshdabiola.setting.model.toPair
import com.mshdabiola.setting.model.toPawnSeri
import com.mshdabiola.setting.model.toSaver
import com.mshdabiola.setting.model.toSetting
import com.mshdabiola.setting.model.toSettingSeri
import com.russhwolf.settings.ExperimentalSettingsApi
import com.russhwolf.settings.coroutines.FlowSettings
import com.russhwolf.settings.coroutines.toBlockingSettings
import com.russhwolf.settings.serialization.decodeValueOrNull
import com.russhwolf.settings.serialization.encodeValue
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi

@OptIn(ExperimentalSettingsApi::class)
internal class MultiplatformSettingsImpl(
    private val settings: FlowSettings,
    private val coroutineDispatcher: CoroutineDispatcher
) : MultiplatformSettings {

    private val _setting = MutableStateFlow(
        getGameSetting()
    )
    override val setting: Flow<Setting>
        get() = _setting.asStateFlow()



    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun setGameSetting(setting: Setting) {
        _setting.update {
            setting
        }
        withContext(coroutineDispatcher) {
            settings.toBlockingSettings().encodeValue(SettingSeri.serializer(), Keys.setting, setting.toSettingSeri())
        }


    }

    @OptIn(ExperimentalSerializationApi::class)
     fun getGameSetting(): Setting {
        return settings.toBlockingSettings()
            .decodeValueOrNull(
                SettingSeri.serializer(), Keys.setting
            )?.toSetting() ?:Setting.default
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun setGame(players: List<Player>, pawns: List<Pawn>) {
        withContext(coroutineDispatcher) {
            val key = "type_${players.size}"
            val saver = GameSaver(players = players.map { it.toSaver() }, pawns = pawns.map { it.toPawnSeri() })
            settings.toBlockingSettings().encodeValue(GameSaver.serializer(), key, saver)
        }
    }


    @OptIn(ExperimentalSerializationApi::class)
    override fun getGame(type: Int,name: String): Pair<List<Player>,List<Pawn>> {
        val key = "type_$type"


        return settings.toBlockingSettings()
            .decodeValueOrNull(GameSaver.serializer(), key)
            ?.toPair() ?: getDefaultPlayer(type,name)

    }

    override fun getName(): Flow<String> {
       return settings.getStringFlow("name","Human")
    }

    override suspend fun setName(name: String) {
        withContext(coroutineDispatcher){
            settings.putString("name",name)
        }
    }

    @OptIn(ExperimentalSerializationApi::class)
    override fun getUser(): User? {
       return settings.toBlockingSettings()
            .decodeValueOrNull(User.serializer(),"user")
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun setUser(user: User) {
        withContext(coroutineDispatcher){
            settings.toBlockingSettings()
                .encodeValue(User.serializer(),"user",user)
        }
    }

    private fun getDefaultPlayer(type: Int,name: String):Pair<List<Player>,List<Pawn>>{
       val player= Constant.getDefaultPlayers(type,name)
        val pawns=Constant.getDefaultPawns(4)
        return Pair(player,pawns)
    }

}
