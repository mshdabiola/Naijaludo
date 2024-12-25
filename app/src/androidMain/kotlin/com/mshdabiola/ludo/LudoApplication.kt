/*
 *abiola 2024
 */

package com.mshdabiola.ludo

import android.app.Application
import co.touchlab.kermit.Logger
import co.touchlab.kermit.koin.KermitKoinLogger
import co.touchlab.kermit.loggerConfigInit
import co.touchlab.kermit.platformLogWriter
import com.mshdabiola.ludo.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class LudoApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val logger = Logger(
            loggerConfigInit(platformLogWriter()),
            "AndroidLogger",
        )
        val logModule = module {
            single {
                logger
            }
        }

        startKoin {
            logger(
                KermitKoinLogger(Logger.withTag("koin")),
            )
            androidContext(this@LudoApplication)
            modules(appModule, logModule)
        }

//        if (packageName.contains("debug")) {
//            Timber.plant(Timber.DebugTree())
//            Timber.e("log on app create")
//        }
    }
}
