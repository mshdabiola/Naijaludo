/*
 *abiola 2024
 */

package com.mshdabiola.testing.fake

import com.mshdabiola.analytics.di.analyticsModule
import com.mshdabiola.data.repository.UserDataRepository
import com.mshdabiola.testing.di.testDispatcherModule
import com.mshdabiola.testing.fake.repository.FakeUserDataRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val testDataModule = module {
    includes(testDispatcherModule, analyticsModule)
    singleOf(::FakeUserDataRepository) bind UserDataRepository::class
}
