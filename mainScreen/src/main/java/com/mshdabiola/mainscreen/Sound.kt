package com.mshdabiola.mainscreen

import com.mshdabiola.datastore.SoundPref

data class Sound(
    val sound: Boolean = false,
    val music: Boolean = false

)

fun SoundPref.toSound() = Sound(sound, music)
fun Sound.toSoundPref() = SoundPref(sound, music)
