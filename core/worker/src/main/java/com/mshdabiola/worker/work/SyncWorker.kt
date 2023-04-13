package com.mshdabiola.worker.work

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.hilt.work.HiltWorker
import androidx.work.Constraints
import androidx.work.CoroutineWorker
import androidx.work.ForegroundInfo
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.OutOfQuotaPolicy
import androidx.work.WorkerParameters
import com.mshdabiola.database.LudoStateDomain
import com.mshdabiola.database.dao.LudoDao
import com.mshdabiola.database.dao.PawnDao
import com.mshdabiola.database.dao.PlayerDao
import com.mshdabiola.database.model.LudoEntity
import com.mshdabiola.worker.PawnSer
import com.mshdabiola.worker.PlayerSer
import com.mshdabiola.worker.toPawnEntity
import com.mshdabiola.worker.toPlayerEntity
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


private const val NotificationId = 0
private const val NotificationChannelID = "NotificationChannel"

val UpdaterConstraints
    get() = Constraints.Builder()
        .build()

fun Context.syncForegroundInfo() = ForegroundInfo(
    NotificationId,
    syncWorkNotification(),
)

/**
 * Notification displayed on lower API levels when sync workers are being
 * run with a foreground service
 */
private fun Context.syncWorkNotification(): Notification {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val channel = NotificationChannel(
            NotificationChannelID,
            "updater",
            NotificationManager.IMPORTANCE_DEFAULT,
        ).apply {
            description = "for updating data"
        }
        // Register the channel with the system
        val notificationManager: NotificationManager? =
            getSystemService(Context.NOTIFICATION_SERVICE) as? NotificationManager

        notificationManager?.createNotificationChannel(channel)
    }

    return NotificationCompat.Builder(
        this,
        NotificationChannelID,
    )
        .setSmallIcon(
            android.R.drawable.sym_def_app_icon,
        )
        .setContentTitle("Updater")
        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
        .build()
}
