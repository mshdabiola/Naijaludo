package com.mshdabiola.setting.model

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id:String,
    val photoUri:String,
    val name:String
)
