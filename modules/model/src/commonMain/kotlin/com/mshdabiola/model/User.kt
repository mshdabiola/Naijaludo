package com.mshdabiola.model

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: String = "",
    val photoUri: String = "",
    val name: String = "Human",
)
