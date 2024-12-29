package com.mshdabiola.data.di

import com.mshdabiola.analytics.di.analyticsModule
import com.mshdabiola.data.P2pManager
import com.mshdabiola.data.Sound
import com.mshdabiola.datastore.di.datastoreModule
import com.mshdabiola.naijaludo.model.IP2pManager
import com.mshdabiola.naijaludo.model.SoundInterface
import kotlinx.coroutines.CoroutineDispatcher
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val dataModule = module {
//    module {
//    includes(datastoreModule, databaseModule, networkModule, analyticsModule)
    single { dispatcher } bind CoroutineDispatcher::class
    includes(datastoreModule, analyticsModule)
    singleOf(::Sound) bind SoundInterface::class
    singleOf(::P2pManager) bind IP2pManager::class
}

expect val dispatcher: CoroutineDispatcher
