package com.mshdabiola.data.di

import com.mshdabiola.analytics.di.analyticsModule
import com.mshdabiola.datastore.di.datastoreModule
import kotlinx.coroutines.CoroutineDispatcher
import org.koin.core.module.Module
import org.koin.dsl.bind
import org.koin.dsl.module

expect val dataModule: Module
val dataCommonModule = module {
//    module {
//    includes(datastoreModule, databaseModule, networkModule, analyticsModule)
    single { dispatcher } bind CoroutineDispatcher::class
    includes(datastoreModule, analyticsModule)
}

expect val dispatcher: CoroutineDispatcher
