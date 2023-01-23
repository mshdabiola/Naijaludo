package com.mshdabiola.mainscreen

import com.mshdabiola.datastore.ProfilePref

data class Profile(
    val playerName: String = "Human",
    val computer1: String = "Amaka",
    val computer2: String = "Hammed",
    val computer3: String = "Alabi",
)

fun ProfilePref.toProfile() = Profile(playerName, computer1, computer2, computer3)
fun Profile.toProfilePref() = ProfilePref(playerName, computer1, computer2, computer3)
