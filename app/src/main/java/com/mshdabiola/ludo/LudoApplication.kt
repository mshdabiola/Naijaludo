package com.mshdabiola.ludo

import android.app.Application
import com.google.android.gms.games.PlayGamesSdk
import com.mshdabiola.worker.Saver
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class LudoApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        PlayGamesSdk.initialize(this)
        Saver.initialize(context = this.applicationContext)
        if (packageName.contains("debug")){
            Timber.plant(Timber.DebugTree())
        }
    }
}
