package com.mshdabiola.ludo

import android.content.Context
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import com.arkivanov.decompose.defaultComponentContext
import com.google.android.gms.games.AchievementsClient
import com.google.android.gms.games.AuthenticationResult
import com.google.android.gms.games.PlayGames
import com.google.android.gms.tasks.Task
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.install.InstallStateUpdatedListener
import com.google.android.play.core.install.model.AppUpdateType
import com.google.android.play.core.install.model.InstallStatus
import com.google.android.play.core.install.model.UpdateAvailability
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.PlayGamesAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings
import com.mshdabiola.designsystem.theme.LudoAppTheme
import com.mshdabiola.ludo.database.FirebaseUtil
import com.mshdabiola.ludo.screen.game.state.PlayerUiState
import com.mshdabiola.ludo.ui.LudoApp
import com.mshdabiola.navigation.RootComponent
import com.mshdabiola.setting.MultiplatformSettings
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import timber.log.Timber
import java.io.File
import java.io.FileOutputStream
import java.net.URL


class MainActivity : ComponentActivity() {
    private val settingUiState by inject<MultiplatformSettings>()
    private var show by mutableStateOf(false)
    private val appUpdateInfoManager by lazy { AppUpdateManagerFactory.create(this) }
    private var listener: InstallStateUpdatedListener? = null
    var achievement: AchievementsClient? = null
    var analytics: FirebaseAnalytics? = null

    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val remoteConfig = Firebase.remoteConfig
        remoteConfig.setConfigSettingsAsync(remoteConfigSettings {
            minimumFetchIntervalInSeconds = 3600
        })
        remoteConfig.setDefaultsAsync(R.xml.remote_config_defaults)
        remoteConfig.fetchAndActivate()

        analytics = FirebaseAnalytics.getInstance(this)
        val gamesSignInClient = PlayGames.getGamesSignInClient(this)
        gamesSignInClient.requestServerSideAccess(
            "176586652338-cf42nu8etp6d72hocvsd49rebcihhk97.apps.googleusercontent.com",
            true
        )
            .addOnSuccessListener {
                firebaseAuthWithPlayGames(it)
            }
            .addOnFailureListener {
                it.printStackTrace()
            }



//        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
//            if (!task.isSuccessful) {
//                Timber.e("Fetching FCM registration token failed", task.exception)
//                return@OnCompleteListener
//            }
//
//            // Get new FCM registration token
//            val token = task.result
//
//            // Log and toast
//            Timber.e(token)
//        })


        installSplashScreen()
        // MobileAds.initialize(this)
//       val config= RequestConfiguration
//           .Builder()
//           .setTestDeviceIds(listOf("F88052080148517BFFEBAE8E7F15692B"))
//           .build()
//        MobileAds.setRequestConfiguration(config)
        val root =
            RootComponent(
                componentContext = defaultComponentContext()
            )






        gamesSignInClient.isAuthenticated()
            .addOnCompleteListener { isAuthenticatedTask: Task<AuthenticationResult> ->

                val isAuthenticated = isAuthenticatedTask.isSuccessful &&
                        isAuthenticatedTask.result.isAuthenticated
                if (isAuthenticated) {
                    // Continue with Play Games Services
                    Timber.e("login")
                    println("Login1 ${isAuthenticatedTask.result.isAuthenticated}")
                    updateScore()
                } else {
                    // Disable your integration with Play Games Services or show a
                    // login button to ask  players to sign-in. Clicking it should
                    gamesSignInClient.signIn().addOnSuccessListener {
                        updateScore()
                        println("Login2 ${it.isAuthenticated}")
                    }.addOnFailureListener {
                        it.printStackTrace()
                        println("====== it.message1")
                    }
                }
            }.addOnFailureListener {
                it.printStackTrace()
                println("====== it.message2")
            }

//        val sing=PlayGames.getGamesSignInClient(this)
//        sing.signIn()
//
//            .addOnFailureListener { it.printStackTrace() }
//            .addOnSuccessListener {
//                Timber.e("successful")
//            }
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        setContent {
//            NaijaLudoTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
            WindowCompat.setDecorFitsSystemWindows(window, false)
            LudoAppTheme {
                Box {
                    LudoApp(
                        windowSizeClass = calculateWindowSizeClass(activity = this@MainActivity),
                        iRootComponent = root
                    )
                    if (show) {
                        Snackbar(
                            modifier = Modifier
                                .navigationBarsPadding()
                                .padding(horizontal = 4.dp)
                                .align(Alignment.BottomCenter),
                            action = {
                                Button(onClick = {
                                    appUpdateInfoManager.completeUpdate()
                                    show = false
                                }) {
                                    Text(text = "Reload")
                                }
                            }
                        ) {
                            Text(text = "NaijaLudo+ just download an update")
                        }
                    }

                }
            }

        }
    }

    override fun onResume() {
        super.onResume()

        appUpdateInfoManager
            .appUpdateInfo
            .addOnSuccessListener { appUpdateInfo ->
                if (appUpdateInfo.installStatus() == InstallStatus.DOWNLOADED) {
                    show = true
                }
                if (appUpdateInfo.installStatus() == InstallStatus.INSTALLED) {
                    listener?.let { appUpdateInfoManager.unregisterListener(it) }
                }
            }
    }

    override fun onStart() {
        super.onStart()

        val appUpdateInfoTask = appUpdateInfoManager.appUpdateInfo
        appUpdateInfoTask.addOnSuccessListener { appUpdateInfo ->
            if (appUpdateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE &&
                appUpdateInfo.isUpdateTypeAllowed(AppUpdateType.FLEXIBLE)
            ) {

                listener = InstallStateUpdatedListener { state ->

//                    if (state.installStatus() == InstallStatus.DOWNLOADING) {
//                        val bytesDownloaded = state.bytesDownloaded()
//                        val totalBytesToDownload = state.totalBytesToDownload()
//                        // Show update progress bar.
//                    }
                    if (state.installStatus() == InstallStatus.DOWNLOADED) {
                        show = true
                    }
                }

                listener?.let { appUpdateInfoManager.registerListener(it) }

                appUpdateInfoManager.startUpdateFlowForResult(
                    appUpdateInfo,
                    AppUpdateType.FLEXIBLE,
                    this,
                    343
                )

            }
            //  log("update ${appUpdateInfo.packageName()} ${appUpdateInfo.availableVersionCode()}",)
        }.addOnFailureListener {
            it.printStackTrace()
        }

    }

    override fun onPause() {
        super.onPause()
    }

    private fun updateScore() {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                achievement = PlayGames.getAchievementsClient(this@MainActivity)


                val leaderboardScore = FirebaseUtil.rank(
                    resources.getString(R.string.leaderboard_solo_player_rank),
                    this@MainActivity
                )!!
                settingUiState.getGame(2)?.let { gameSaver ->
                    val players = gameSaver.getSaverPlayer().toMutableList()

                    var player = players[1]
                    if (leaderboardScore.rawScore > player.win) {
                        val compScore = FirebaseUtil
                            .get2Game(this@MainActivity, 2)
                            ?.split(", ")
                            ?.map {
                                it.toInt()
                            }
                            ?.toIntArray()
                        compScore?.let {
                            players[0] = players[0].copy(win = it[0])
                        }
                        player = player.copy(win = leaderboardScore.rawScore.toInt())
                        players[1] = player
                    }

                    val settings = settingUiState.setting.first()
                    val playersName = settings.playerName.toMutableList()
                    Timber.e("name :${playersName[0]} ")
                    if (playersName[0] == "Human") {
                        Timber.e("set name :${playersName[0]} ")
                        playersName[0] = leaderboardScore.scoreHolderDisplayName
                        settingUiState.setGameSetting(settings.copy(playerName = playersName))
                    }

                    settingUiState.setGame(players.map { it.toOriginal() }, gameSaver.pawns)
                }

                val leaderboardScore2 = FirebaseUtil.rank(
                    resources.getString(R.string.leaderboard_trio_player_rank),
                    this@MainActivity
                )!!
                settingUiState.getGame(4)?.let { gameSaver ->
                    val players = gameSaver.getSaverPlayer().toMutableList()


                    var player = players[3]
                    if (leaderboardScore2.rawScore > player.win) {
                        val compScore = FirebaseUtil
                            .get2Game(this@MainActivity, 4)
                            ?.split(", ")
                            ?.map { it.toInt() }
                            ?.toIntArray()
                        compScore?.let {
                            players[0] = players[0].copy(win = it[0])
                            players[1] = players[1].copy(win = it[1])
                            players[2] = players[2].copy(win = it[2])
                        }


                        player = player.copy(win = leaderboardScore2.rawScore.toInt())
                        players[3] = player
                    }

                    val settings = settingUiState.setting.first()
                    val playersName = settings.playerName.toMutableList()
                    Timber.e("name :${playersName[0]} ")
                    if (playersName[0] == "Human") {
                        Timber.e("set name :${playersName[0]} ")
                        playersName[0] = leaderboardScore.scoreHolderDisplayName
                        settingUiState.setGameSetting(settings.copy(playerName = playersName))
                    }

                    settingUiState.setGame(players.map { it.toOriginal() }, gameSaver.pawns)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
    }


    fun saveGame(compScore: IntArray, num: Int) {
        lifecycleScope.launch(Dispatchers.IO) {

            FirebaseUtil.saveGame(
                compScore.joinToString(),
                compScore.sum().toLong(),
                num,
                this@MainActivity
            )

        }
    }

    fun onGameFinish(players: List<PlayerUiState>) {
        lifecycleScope.launch {

            val single = resources.getString(R.string.leaderboard_solo_player_rank)
            val multi = resources.getString(R.string.leaderboard_trio_player_rank)

            val num = players.size
            val score = players.last().win
            if (num == 2) {
                PlayGames.getLeaderboardsClient(this@MainActivity)
                    .submitScoreImmediate(single, score.toLong())
                saveGame(players.map { it.win }.toIntArray(), 2)
            } else {
                PlayGames.getLeaderboardsClient(this@MainActivity)
                    .submitScoreImmediate(multi, score.toLong())
                saveGame(players.map { it.win }.toIntArray(), 4)
            }


        }

    }


    // Call this both in the silent sign-in task's OnCompleteListener and in the
// Activity's onActivityResult handler.
    private fun firebaseAuthWithPlayGames(code: String) {

        Timber.e("code $code")
        val auth = Firebase.auth
        val credential = PlayGamesAuthProvider.getCredential(code)
        auth.signInWithCredential(credential)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Timber.e("signInWithCredential:success")
                    val user = auth.currentUser
                    Timber.e(
                        """
                        name ${user?.displayName},
                         phoneNo ${user?.phoneNumber}
                          email ${user?.email}
                           photoUri ${user?.photoUrl}
                            proID ${user?.providerId}
                             uid ${user?.uid}
                              isEmail ${user?.isEmailVerified}
                    """.trimIndent()
                    )
                    user?.let {
                        analytics?.setUserId(it.uid)
                        it.photoUrl?.let { it1 -> downloadImage(it1.toString()) }
                    }

                } else {
                    // If sign in fails, display a message to the user.
                    Timber.e("signInWithCredential:failure")
                    task.exception?.printStackTrace()

                }

                // ...
            }
    }

    private fun downloadImage(uri:String){
        lifecycleScope.launch(Dispatchers.IO) {
            val dir=File(applicationContext.dataDir,"image")
            if (dir.exists().not()){
                dir.mkdirs()
            }
            val file=File(dir,"profile.png")
            if (file.exists())
                return@launch
            val input= URL(uri).openStream()

            val outputStream= FileOutputStream(file)
            input.copyTo(outputStream)
            outputStream.close()
            input.close()
            Timber.e("download")

        }

    }


}

fun Context.asMainActivity() = this as MainActivity
