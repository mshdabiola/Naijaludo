package com.mshdabiola.data.di

import com.mshabiola.database.di.databaseModule
import com.mshdabiola.data.repository.IModelRepository
import com.mshdabiola.data.repository.INetworkRepository
import com.mshdabiola.data.repository.ISettingRepository
import com.mshdabiola.data.repository.RealINetworkRepository
import com.mshdabiola.data.repository.RealModelRepository
import com.mshdabiola.data.repository.SettingRepository
import com.mshdabiola.network.di.networkModule
import com.mshdabiola.setting.di.settingModule
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module


val dataModule= module {
    includes(settingModule,databaseModule, networkModule)
    singleOf(::SettingRepository) bind ISettingRepository::class
    singleOf(::RealINetworkRepository) bind INetworkRepository::class
    singleOf(::RealModelRepository) bind IModelRepository::class
}
