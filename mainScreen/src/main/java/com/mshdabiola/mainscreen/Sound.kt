package com.mshdabiola.mainscreen

import com.mshdabiola.datastore.SoundPref

data class Sound(
    val sound: Boolean = false,
    val music: Boolean = false,
    val musicType: Int = 0
)

fun SoundPref.toSound() = Sound(sound, music, musicType)
fun Sound.toSoundPref() = SoundPref(sound, music, musicType)
