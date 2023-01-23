package com.mshdabiola.ludo.model

interface SoundInterface {

    fun onToss()
    fun onMoving()
    fun onMoveOut()
    fun onKill()
    fun onSelect()

    fun onLost()

    fun onWin()
}
