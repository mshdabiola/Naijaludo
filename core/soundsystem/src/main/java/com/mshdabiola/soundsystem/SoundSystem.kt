package com.mshdabiola.soundsystem

import android.content.Context
import android.media.AudioAttributes
import android.media.SoundPool
import com.mshdabiola.ludo.model.SoundInterface
import com.mshdabiola.ludo.model.log
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SoundSystem
@Inject constructor(
    @ApplicationContext context: Context,
) : SoundInterface {
    private var soundPool: SoundPool? = null
    private val soundIds = IntArray(8)
    var playSound: Boolean = true
    private var playMusic: Boolean = false

    private var streamId: Int? = null

    init {
        val audioAttributes = AudioAttributes
            .Builder()
            .setUsage(AudioAttributes.USAGE_GAME)
            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
            .build()
        soundPool = SoundPool
            .Builder()
            .setAudioAttributes(audioAttributes)
            .setMaxStreams(3)
            .build()

        soundIds[0] = soundPool?.load(context, R.raw.sound_1, 1)!!
        soundIds[1] = soundPool?.load(context, R.raw.dice, 1)!!
        soundIds[2] = soundPool?.load(context, R.raw.kill, 2)!!
        soundIds[3] = soundPool?.load(context, R.raw.moving, 1)!!
        soundIds[4] = soundPool?.load(context, R.raw.moveout, 1)!!
        soundIds[5] = soundPool?.load(context, R.raw.select, 1)!!
        soundIds[6] = soundPool?.load(context, R.raw.win, 1)!!
        soundIds[7] = soundPool?.load(context, R.raw.lost, 1)!!
        // context setVolumeControlSystem
    }

    private fun play(res: Int) {
        if (playSound) {
            soundPool?.play(soundIds[res], 1f, 1f, 1, 0, 1f)
        }
    }

    override fun onToss() {
        play(1)
    }

    override fun onKill() {
        play(2)
    }

    override fun onMoving() {
        play(3)
    }

    override fun onMoveOut() {
        play(4)
    }

    override fun onSelect() {
        play(5)
    }

    override fun onLost() {
        play(7)
    }

    override fun onWin() {
        play(6)
    }

    fun setPlayMusic(value: Boolean) {
        playMusic = value
        if (value) resume() else pause()
    }

    fun play() {
        if (streamId == null || streamId == 0) {
            streamId = soundPool?.play(soundIds[0], 1f, 1f, 2, -1, 1f)

            log("Play music id $streamId")
            if (!playMusic) {
                streamId?.let { soundPool?.pause(it) }
            }
        }
    }

    fun resume() {
        if (playMusic) {
            streamId?.let {
                log("resume music")
                soundPool?.resume(it)
            }
        }
    }

    fun pause() {
        streamId?.let {
            log("pause music")
            soundPool?.pause(it)
        }
    }

    fun close() {
        streamId?.let {
            log("Stop music")
            soundPool?.pause(it)
            streamId = null
        }
        soundPool?.release()
        soundPool = null
    }
}
