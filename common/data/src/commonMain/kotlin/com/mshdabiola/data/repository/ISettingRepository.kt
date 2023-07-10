package com.mshdabiola.data.repository

import com.mshdabiola.model.DummySetting
import com.mshdabiola.setting.model.Dummy

interface ISettingRepository {
    suspend fun setDummy(dummy: DummySetting)
}