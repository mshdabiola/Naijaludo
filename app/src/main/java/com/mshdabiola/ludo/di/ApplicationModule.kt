package com.mshdabiola.ludo.di

import com.mshdabiola.ludo.database.GameSaver
import com.mshdabiola.ludo.database.IGameSaver
import com.mshdabiola.ludo.screen.GeneralViewModel
import com.mshdabiola.ludo.screen.game.GameViewModel
import com.mshdabiola.ludo.screen.main.MainViewModel
import com.mshdabiola.setting.di.settingModule
import com.mshdabiola.util.di.utilModule
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    includes(utilModule, settingModule)
    viewModelOf(::MainViewModel)
    viewModelOf(::GameViewModel)
    viewModelOf(::GeneralViewModel)
    singleOf(::GameSaver) bind IGameSaver::class
}