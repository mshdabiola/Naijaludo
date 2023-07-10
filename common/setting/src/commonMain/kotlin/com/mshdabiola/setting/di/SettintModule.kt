package com.mshdabiola.setting.di

import com.mshdabiola.setting.MultiplatformSettings
import com.mshdabiola.setting.MultiplatformSettingsImpl
import com.russhwolf.settings.ExperimentalSettingsApi
import kotlinx.coroutines.Dispatchers
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

@OptIn(ExperimentalSettingsApi::class)
internal val commonModule = module {
    single { Dispatchers.IO }

    singleOf(::MultiplatformSettingsImpl) bind MultiplatformSettings::class
}