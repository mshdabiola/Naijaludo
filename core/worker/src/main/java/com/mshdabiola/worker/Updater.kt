package com.mshdabiola.worker

import android.content.Context
import androidx.startup.AppInitializer
import androidx.startup.Initializer
import androidx.work.ExistingWorkPolicy
import androidx.work.WorkManager
import androidx.work.WorkManagerInitializer
import com.mshdabiola.naijaludo.model.LudoGameState
import com.mshdabiola.worker.work.SyncWorker
import timber.log.Timber

object Updater {
    lateinit var workManager: WorkManager
    fun initialize(context: Context) {
      val updater=  AppInitializer.getInstance(context)
            .initializeComponent(UpdateInitializer::class.java)
        workManager=updater.workManager
    }

   private fun update(workName:String,players:String,pawns:String,id:Long){
        workManager
            .
            enqueueUniqueWork(
                workName,
                ExistingWorkPolicy.REPLACE,
                SyncWorker.startUpSyncWork(players, pawns,id)
            )

    }
    fun savegame(ludoGameState: LudoGameState, id: Long){
        val pair = FileConverter.playerToString(
            ludoGameState.listOfPlayer,
            ludoGameState.listOfPawn,
            id
        )
       update("updater", pawns = pair.first, players = pair.second, id = id)
    }
}

class UpdateInitializer : Initializer<Updater> {
    override fun create(context: Context): Updater {
        val updater=Updater
      updater.workManager=  WorkManager.getInstance(context)

        return updater
    }

    override fun dependencies() =
        listOf(WorkManagerInitializer::class.java)

}