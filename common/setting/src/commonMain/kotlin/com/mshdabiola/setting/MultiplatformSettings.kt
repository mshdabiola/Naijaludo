package com.mshdabiola.setting

import com.mshdabiola.naijaludo.model.Setting

interface MultiplatformSettings {

    suspend fun setGameSetting(setting: Setting)
    fun getGameSetting(): Setting

}
