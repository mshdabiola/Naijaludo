/*
 *abiola 2024
 */

package com.mshdabiola.testing.fake

import com.mshdabiola.analytics.di.analyticsModule
import com.mshdabiola.datastore.Store
import com.mshdabiola.naijaludo.model.IP2pManager
import com.mshdabiola.naijaludo.model.SoundInterface
import com.mshdabiola.testing.datastore.FakeStore
import com.mshdabiola.testing.di.testDispatcherModule
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val testDataModule = module {
    includes(testDispatcherModule, analyticsModule)
    singleOf(::FakeSound) bind SoundInterface::class
    singleOf(::FakeP2pManager) bind IP2pManager::class
    single {
        FakeStore()
    } bind Store::class
}
