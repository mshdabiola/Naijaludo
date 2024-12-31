package com.mshdabiola.data.di

import com.mshdabiola.data.P2pManager
import com.mshdabiola.data.Sound
import com.mshdabiola.naijaludo.model.IP2pManager
import com.mshdabiola.naijaludo.model.SoundInterface
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

actual val dataModule: Module
    get() = module {
        includes(dataCommonModule)
        singleOf(::Sound) bind SoundInterface::class
        singleOf(::P2pManager) bind IP2pManager::class
    }
