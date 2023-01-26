package com.mshdabiola.soundsystem.di

import com.mshdabiola.ludo.model.SoundInterface
import com.mshdabiola.soundsystem.SoundSystem
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
interface SoundModule {

    @Singleton
    @Binds
    fun bindSoundInterface(
        soundSystem: SoundSystem,
    ): SoundInterface
}
