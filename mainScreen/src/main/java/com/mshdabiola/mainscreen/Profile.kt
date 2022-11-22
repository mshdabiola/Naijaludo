package com.mshdabiola.mainscreen

import com.mshdabiola.datastore.ProfilePref

data class Profile(
    val playerName: String = "Human",
    val computer1: String = "C_Player_1",
    val computer2: String = "C_Player_2",
    val computer3: String = "C_Player_3"
)

fun ProfilePref.toProfile() = Profile(playerName, computer1, computer2, computer3)
fun Profile.toProfilePref() = ProfilePref(playerName, computer1, computer2, computer3)
