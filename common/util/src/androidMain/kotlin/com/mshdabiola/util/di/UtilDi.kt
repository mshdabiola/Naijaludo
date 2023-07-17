package com.mshdabiola.util.di

import com.mshdabiola.util.multiplayer.Manager
import com.mshdabiola.util.multiplayer.P2pManager
import com.mshdabiola.util.sound.SoundSystem
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val utilModule = module {
    singleOf(::Manager)
    singleOf(::P2pManager)
    singleOf(::SoundSystem)

}