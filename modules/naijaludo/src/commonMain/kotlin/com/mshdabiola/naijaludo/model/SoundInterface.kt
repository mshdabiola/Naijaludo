package com.mshdabiola.naijaludo.model

interface SoundInterface {

    fun onToss()
    fun onMoving()
    fun onMoveOut()
    fun onKill()
    fun onSelect()

    fun onLost()

    fun onWin()
    fun setPlayMusic(value: Boolean)
    fun play()
    fun resume()
    fun pause()
    fun close()
    fun setPlaySound2(value: Boolean)
}
