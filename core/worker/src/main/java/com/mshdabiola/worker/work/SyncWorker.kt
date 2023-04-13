package com.mshdabiola.worker.work

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.ForegroundInfo
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.OutOfQuotaPolicy
import androidx.work.WorkerParameters
import com.mshdabiola.database.dao.LudoDao
import com.mshdabiola.database.dao.PawnDao
import com.mshdabiola.database.dao.PlayerDao
import com.mshdabiola.database.model.LudoEntity
import com.mshdabiola.worker.util.PawnSer
import com.mshdabiola.worker.util.PlayerSer
import com.mshdabiola.worker.util.toPawnEntity
import com.mshdabiola.worker.util.toPlayerEntity
import com.mshdabiola.worker.util.UpdaterConstraints
import com.mshdabiola.worker.util.delegatedData
import com.mshdabiola.worker.util.syncForegroundInfo
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import timber.log.Timber

@HiltWorker
class SyncWorker @AssistedInject constructor(
    @Assisted private val appContext: Context,
    @Assisted val workerParams: WorkerParameters,
    private val ludoDao: LudoDao,
    private val pawnDao: PawnDao,
    private val playerDao: PlayerDao,
) : CoroutineWorker(appContext, workerParams) {

    override suspend fun getForegroundInfo(): ForegroundInfo =
        appContext.syncForegroundInfo()


    override suspend fun doWork(): Result = withContext(Dispatchers.IO) {

        val players = workerParams.inputData.getString("Players")
        val pawns = workerParams.inputData.getString("Pawns")
        val id=workerParams.inputData.getLong("id",6)

        val playerss= players?.let { Json.decodeFromString<List<PlayerSer>>(it) }
        val pawnss=pawns?.let { Json.decodeFromString<List<PawnSer>>(pawns) }
        Timber.e(playerss?.toString())
        Timber.e(pawnss?.toString())
        Timber.e("$id")

        ludoDao.upsert(LudoEntity(id))

        if (pawnss != null) {
            pawnDao.upsertMany(pawnss.map { it.toPawnEntity() })
        }
        if (playerss != null) {
            playerDao.upsertMany(playerss.map { it.toPlayerEntity() })
        }

        Result.success()
    }


    companion object {
        fun startUpSyncWork(players: String, pawns: String,id:Long) =
            OneTimeWorkRequestBuilder<DelegatingWorker>()
                .setExpedited(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST)
                .setConstraints(UpdaterConstraints)
                .setInputData(SyncWorker::class.delegatedData(players, pawns,id))
                .build()
    }
}

