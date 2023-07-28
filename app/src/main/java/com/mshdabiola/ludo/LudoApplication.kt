package com.mshdabiola.ludo

import android.app.Application
import com.google.android.gms.games.PlayGamesSdk
import com.mshdabiola.ludo.di.appModule
import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.naijaludo.model.isDebug
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class LudoApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        try {
            PlayGamesSdk.initialize(this)
        } catch (e: Exception) {
            Timber.e(e)
        }
        startKoin {
            androidContext(this@LudoApplication)
            modules(appModule)
        }
        Timber.plant(Timber.DebugTree())
        Timber.e("package name $packageName")

        if (packageName.contains("debug")) {
            Timber.e("package name $packageName")
            Timber.e("log on app create")
            isDebug=true
        }else{
            isDebug=false
        }
    }
}
