package com.mshdabiola.worker

import android.content.Context
import androidx.startup.Initializer
import androidx.work.WorkManager
import androidx.work.WorkManagerInitializer

class UpdateInitializer : Initializer<Updater> {
    override fun create(context: Context): Updater {
        val updater=Updater
        updater.workManager=  WorkManager.getInstance(context)

        return updater
    }

    override fun dependencies() =
        listOf(WorkManagerInitializer::class.java)

}