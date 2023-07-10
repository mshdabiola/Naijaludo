package com.mshdabiola.setting.di

import com.russhwolf.settings.ExperimentalSettingsApi
import com.russhwolf.settings.PreferencesSettings
import com.russhwolf.settings.coroutines.toFlowSettings
import org.koin.core.module.Module
import org.koin.dsl.module
import java.util.prefs.Preferences

@OptIn(ExperimentalSettingsApi::class)
actual val settingModule: Module
    get() = module {
        includes(commonModule)
        single { PreferencesSettings(Preferences.userRoot()).toFlowSettings(get()) }
    }