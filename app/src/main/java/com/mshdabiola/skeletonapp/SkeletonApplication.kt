package com.mshdabiola.skeletonapp

import android.app.Application
import com.mshdabiola.skeletonapp.di.appModule
import com.mshdabiola.worker.Saver
import com.mshdabiola.worker.di.workModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber


class SkeletonApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@SkeletonApplication)
            modules(appModule, workModule)
        }

        Saver.initialize(applicationContext)
        Saver.saveGame(89L)
        if (packageName.contains("debug")) {
            Timber.plant(Timber.DebugTree())
            Timber.e("log on app create")
        }
    }
}
