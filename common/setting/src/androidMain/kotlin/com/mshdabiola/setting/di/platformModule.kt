package com.mshdabiola.setting.di

import android.content.Context
import com.russhwolf.settings.ExperimentalSettingsApi
import com.russhwolf.settings.ExperimentalSettingsImplementation
import com.russhwolf.settings.coroutines.FlowSettings
import com.russhwolf.settings.datastore.DataStoreSettings
import org.koin.core.module.Module
import org.koin.dsl.module

@OptIn(ExperimentalSettingsImplementation::class, ExperimentalSettingsApi::class)
actual val settingModule: Module
    get() = module {
        includes(commonModule)
        single {
            // At the top level of your kotlin file:
            val context: Context = get()
            val settings: FlowSettings = DataStoreSettings(context.dataStore)
            settings
        }

    }