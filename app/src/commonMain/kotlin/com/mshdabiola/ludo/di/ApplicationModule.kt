package com.mshdabiola.ludo.di

import com.mshdabiola.data.di.dataModule
import com.mshdabiola.game.gameModule
import com.mshdabiola.ludo.MainAppViewModel
import com.mshdabiola.main.mainModule
import com.mshdabiola.market.marketModule
import com.mshdabiola.setting.settingModule
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    includes(dataModule, gameModule, mainModule, settingModule, marketModule)
    viewModel { MainAppViewModel(get()) }
}
