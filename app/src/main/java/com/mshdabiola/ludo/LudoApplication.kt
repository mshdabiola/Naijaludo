package com.mshdabiola.ludo

import android.app.Application
import com.google.android.gms.games.PlayGamesSdk
import com.mshdabiola.ludo.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class LudoApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        try {
            PlayGamesSdk.initialize(this)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        startKoin {
            androidContext(this@LudoApplication)
            modules(appModule)
        }


        if (packageName.contains("debug")) {
            Timber.plant(Timber.DebugTree())
            Timber.e("log on app create")
        }
    }
}
