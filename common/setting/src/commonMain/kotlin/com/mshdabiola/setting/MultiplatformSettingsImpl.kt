package com.mshdabiola.setting

import com.mshdabiola.naijaludo.model.GameSaver
import com.mshdabiola.naijaludo.model.Pawn
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.naijaludo.model.player.Player
import com.mshdabiola.naijaludo.model.player.toSaver
import com.russhwolf.settings.ExperimentalSettingsApi
import com.russhwolf.settings.coroutines.FlowSettings
import com.russhwolf.settings.coroutines.toBlockingSettings
import com.russhwolf.settings.serialization.decodeValue
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
            settings.toBlockingSettings().encodeValue(Setting.serializer(), Keys.setting, setting)
        }


    }

    @OptIn(ExperimentalSerializationApi::class)
     fun getGameSetting(): Setting {
        return settings.toBlockingSettings()
            .decodeValue(
                Setting.serializer(), Keys.setting,
                Setting(
                    playerName = listOf(
                        "Human",
                        "Amaka",
                        "Hammed",
                        "Alabi",
                    )
                )
            )
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun setGame(players: List<Player>, pawns: List<Pawn>) {
        withContext(coroutineDispatcher) {
            val key = "type_${players.size}"
            val saver = GameSaver(players = players.map { it.toSaver() }, pawns = pawns)
            settings.toBlockingSettings().encodeValue(GameSaver.serializer(), key, saver)
        }
    }


    @OptIn(ExperimentalSerializationApi::class)
    override fun getGame(type: Int): GameSaver? {
        val key = "type_$type"
        return settings.toBlockingSettings()
            .decodeValueOrNull(GameSaver.serializer(), key)
    }

}
