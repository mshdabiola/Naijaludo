package com.mshdabiola.gamescreen

import android.content.Context
import android.media.AudioAttributes
import android.media.SoundPool
import com.mshdabiola.naijaludo.SoundInterface
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class SoundSystem
@Inject constructor(
    @ApplicationContext context: Context

) : SoundInterface {
    private var soundPool: SoundPool? = null
    private val soundIds = IntArray(5)

    init {
        val audioAttributes = AudioAttributes
            .Builder()
            .setUsage(AudioAttributes.USAGE_GAME)
            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
            .build()
        soundPool = SoundPool
            .Builder()
            .setAudioAttributes(audioAttributes)
            .setMaxStreams(1)
            .build()

        soundIds[0] = soundPool?.load(context, R.raw.dice, 1)!!
        soundIds[1] = soundPool?.load(context, R.raw.kill, 2)!!
        soundIds[2] = soundPool?.load(context, R.raw.moving, 1)!!
        soundIds[3] = soundPool?.load(context, R.raw.moveout, 1)!!
        soundIds[4] = soundPool?.load(context, R.raw.select, 1)!!

        // context setVolumeControlSystem
    }

    private fun play(res: Int) {
        soundPool?.play(soundIds[res], 1f, 1f, 1, 0, 1f)
    }

    override fun onToss() {
        play(0)
    }

    override fun onMoving() {
        play(2)
    }

    override fun onMoveOut() {
        play(3)
    }

    override fun onKill() {
        play(1)
    }

    override fun onSelect() {
        play(4)
    }

    fun close() {
        soundPool?.release()
        soundPool = null
    }
}
