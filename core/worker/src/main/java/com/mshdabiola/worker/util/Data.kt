package com.mshdabiola.worker.util

import androidx.work.CoroutineWorker
import androidx.work.Data
import kotlin.reflect.KClass

internal const val WORKER_CLASS_NAME = "RouterWorkerDelegateClassName"
internal fun KClass<out CoroutineWorker>.delegatedData(players:String, pawns:String, id:Long) =
    Data.Builder()
        .putString(WORKER_CLASS_NAME, qualifiedName)
        .putString("Players",players)
        .putString("Pawns",pawns)
        .putLong("id",id)
        .build()