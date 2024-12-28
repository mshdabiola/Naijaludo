package com.mshdabiola.game

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val gameModule = module {
    viewModelOf(::GameViewModel)
}
