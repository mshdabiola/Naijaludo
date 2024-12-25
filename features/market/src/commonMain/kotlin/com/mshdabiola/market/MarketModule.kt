package com.mshdabiola.market

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val marketModule = module {
    viewModelOf(::GeneralViewModel)
}
