package com.mshdabiola.setting

import com.mshdabiola.naijaludo.model.Setting
import com.russhwolf.settings.ExperimentalSettingsApi
import com.russhwolf.settings.coroutines.FlowSettings
import com.russhwolf.settings.coroutines.toBlockingSettings
import com.russhwolf.settings.serialization.decodeValue
import com.russhwolf.settings.serialization.encodeValue
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi

@OptIn(ExperimentalSettingsApi::class)
internal class MultiplatformSettingsImpl(
    private val settings: FlowSettings,
    private val coroutineDispatcher: CoroutineDispatcher
) : MultiplatformSettings {


    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun setGameSetting(setting: Setting) {
        withContext(coroutineDispatcher){
            settings.toBlockingSettings().encodeValue(Setting.serializer(), Keys.setting, setting)
        }


    }

    @OptIn(ExperimentalSerializationApi::class)
    override fun getGameSetting(): Setting {
       return settings.toBlockingSettings()
            .decodeValue(Setting.serializer(),Keys.setting, Setting())
    }

}
