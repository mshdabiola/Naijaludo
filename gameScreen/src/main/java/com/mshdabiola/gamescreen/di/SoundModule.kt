package com.mshdabiola.gamescreen.di

import com.mshdabiola.gamescreen.SoundSystem
import com.mshdabiola.naijaludo.SoundInterface
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
        soundSystem: SoundSystem
    ): SoundInterface
}
