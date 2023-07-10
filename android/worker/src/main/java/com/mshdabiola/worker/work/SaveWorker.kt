package com.mshdabiola.worker.work

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.work.Constraints
import androidx.work.CoroutineWorker
import androidx.work.Data
import androidx.work.ForegroundInfo
import androidx.work.OneTimeWorkRequest
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.OutOfQuotaPolicy
import androidx.work.WorkerParameters
import com.mshdabiola.data.repository.IModelRepository
import com.mshdabiola.model.Model
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import timber.log.Timber

internal const val ID = "id"
class SaveWorker constructor(
    private val appContext: Context,
    private val workerParams: WorkerParameters
) : CoroutineWorker(appContext, workerParams), KoinComponent {

    val modelRepository by inject<IModelRepository>()
    override suspend fun getForegroundInfo(): ForegroundInfo =
        appContext.syncForegroundInfo()


    override suspend fun doWork(): Result = withContext(Dispatchers.IO) {

        Timber.e("worker id" + workerParams.inputData.getLong(ID, -1L))
        repeat(100) {
            Timber.e("count $it")
            modelRepository.insert(Model(it + 78L, "number $it"))
        }


        Result.success()
    }


    companion object {
        fun startUpSaveWork(id: Long): OneTimeWorkRequest {
            val data = Data.Builder()
                .putLong(ID, id)
                .build()
            val saverConstraints = Constraints.Builder()
                .build()


            return OneTimeWorkRequestBuilder<SaveWorker>()
                .setExpedited(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST)
                .setConstraints(saverConstraints)
                .setInputData(data)
                .build()
        }
    }
}



private const val NotificationId = 0
private const val NotificationChannelID = "NotificationChannel"

fun Context.syncForegroundInfo() = ForegroundInfo(
    NotificationId,
    saveWorkNotification(),
)

private fun Context.saveWorkNotification(): Notification {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val channel = NotificationChannel(
            NotificationChannelID,
            "game saver",
            NotificationManager.IMPORTANCE_DEFAULT,
        ).apply {
            description = "for saving games"
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
            android.R.drawable.ic_menu_save,
        )
        .setContentTitle("Saving current game")
        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
        .build()
}

