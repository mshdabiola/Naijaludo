package com.mshdabiola.setting.model

import com.mshdabiola.model.DummySetting
import kotlinx.serialization.Serializable

@Serializable
 data class Dummy(val name:String,val sex:String)


fun Dummy.toDummySetting()=DummySetting(name, sex)
fun DummySetting.toDummy()=Dummy(name, sex)