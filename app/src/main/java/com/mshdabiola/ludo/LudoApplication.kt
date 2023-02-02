package com.mshdabiola.ludo

import android.app.Application
import com.google.android.gms.games.PlayGames
import com.google.android.gms.games.PlayGamesSdk
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class LudoApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        PlayGamesSdk.initialize(this)
    }
}
