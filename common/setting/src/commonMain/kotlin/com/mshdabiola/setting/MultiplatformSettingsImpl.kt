package com.mshdabiola.setting

import com.mshdabiola.model.DummySetting
import com.mshdabiola.setting.model.Dummy
import com.mshdabiola.setting.model.toDummy
import com.mshdabiola.setting.model.toDummySetting
import com.russhwolf.settings.ExperimentalSettingsApi
import com.russhwolf.settings.coroutines.FlowSettings
import com.russhwolf.settings.coroutines.toBlockingSettings
import com.russhwolf.settings.serialization.decodeValue
import com.russhwolf.settings.serialization.encodeValue
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi

@OptIn(ExperimentalSettingsApi::class)
internal class MultiplatformSettingsImpl(
    private val settings: FlowSettings,
    private val coroutineDispatcher: CoroutineDispatcher
) : MultiplatformSettings {


    override val name =settings.getStringFlow("NAME","Jamiu")
    override val dummy: Flow<DummySetting>
        get() = MutableStateFlow(Keys.Defaults.defaultDummy.toDummySetting())

    override suspend fun setName(name:String){
        settings.putString("NAME",name)
    }
    @OptIn(ExperimentalSerializationApi::class)
    suspend fun init(){
        withContext(coroutineDispatcher){
          val dummy=  settings.toBlockingSettings().encodeValue(Dummy.serializer(),Keys.setting, value = Keys.Defaults.defaultDummy)

        }
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun setDummy(dummy: DummySetting) {
// Store values for the properties of someClass in settings
        settings.toBlockingSettings().encodeValue(Dummy.serializer(),Keys.setting,dummy.toDummy())

       val dummy2= settings.toBlockingSettings().decodeValue(Dummy.serializer(),key=Keys.setting, defaultValue = Dummy(
            name = "Serena",
            sex = "Lyle"
        ))

        println("dummy $dummy")
        println("dummy2 $dummy2")
    }

}
