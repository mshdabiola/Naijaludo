package com.mshdabiola.ludo

import android.content.Context
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.net.Uri
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
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.ImageBitmapConfig
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import com.arkivanov.decompose.defaultComponentContext
import com.google.android.gms.common.images.ImageManager
import com.google.android.gms.games.AchievementsClient
import com.google.android.gms.games.PlayGames
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.install.InstallStateUpdatedListener
import com.google.android.play.core.install.model.AppUpdateType
import com.google.android.play.core.install.model.InstallStatus
import com.google.android.play.core.install.model.UpdateAvailability
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings
import com.mshdabiola.designsystem.theme.LudoAppTheme
import com.mshdabiola.ludo.database.FirebaseUtil
import com.mshdabiola.ludo.screen.game.state.ArchievementData
import com.mshdabiola.ludo.screen.game.state.PlayerUiState
import com.mshdabiola.ludo.ui.LudoApp
import com.mshdabiola.navigation.RootComponent
import com.mshdabiola.setting.MultiplatformSettings
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import timber.log.Timber


class MainActivity : ComponentActivity() {
    private val settingUiState by inject<MultiplatformSettings>()
    private var show by mutableStateOf(false)
    private val appUpdateInfoManager by lazy { AppUpdateManagerFactory.create(this) }
    private var listener: InstallStateUpdatedListener? = null
    var achievement: AchievementsClient? = null
    var analytics: FirebaseAnalytics? = null
    var remoteConfig: FirebaseRemoteConfig? = null

    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()

        lifecycleScope.launch(Dispatchers.IO) {
            try {
                FirebaseUtil.login(this@MainActivity) {
                    if (it) {
                        setUp()
                    }

                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }


//        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
//            if (!task.isSuccessful) {
//               // Timber.e("Fetching FCM registration token failed", task.exception)
//                return@OnCompleteListener
//            }
//
//            // Get new FCM registration token
//            val token = task.result
//
//            analytics?.setUserProperty("messageToken",token)
//            // Log and toast
//            Timber.e(token)
//        })


        // MobileAds.initialize(this)
//       val config= RequestConfiguration
//           .Builder()
//           .setTestDeviceIds(listOf("F88052080148517BFFEBAE8E7F15692B"))
//           .build()
//        MobileAds.setRequestConfiguration(config)

        val root = RootComponent(componentContext = defaultComponentContext())
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        setContent {
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

    private fun setUp() {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                val oldUser = settingUiState.getUser()
                achievement = PlayGames.getAchievementsClient(this@MainActivity)
                remoteConfig = Firebase.remoteConfig
                analytics = FirebaseAnalytics.getInstance(this@MainActivity)

                remoteConfig?.setDefaultsAsync(R.xml.remote_config_defaults)
                remoteConfig?.setConfigSettingsAsync(remoteConfigSettings {
                    minimumFetchIntervalInSeconds = 3600
                })
                remoteConfig?.fetchAndActivate()

                analytics?.setUserId(oldUser.id)

                logScoreToFirebase()
                val user = FirebaseUtil.getName(this@MainActivity)
                Timber.e("name :$user old $oldUser")
                settingUiState.setUser(oldUser.copy(name = user.name, photoUri = user.photoUri))


                val game2 = settingUiState.getGame(2, user.name)
                val score2 = FirebaseUtil.getSaveScore(2, this@MainActivity)
                if (score2.sum() > game2.first.sumOf { it.win }) {
                    val newPlay2 = game2.first.mapIndexed { index, player ->
                        player.copyPlayer(win = score2[index])
                    }
                    settingUiState.setGame(newPlay2, game2.second)
                }

                val game4 = settingUiState.getGame(4, user.name)
                val score4 = FirebaseUtil.getSaveScore(4, this@MainActivity)
                if (score4.sum() > game4.first.sumOf { it.win }) {
                    val newPlay4 = game4.first.mapIndexed { index, player ->
                        player.copyPlayer(win = score4[index])
                    }
                    settingUiState.setGame(newPlay4, game4.second)
                }


                FirebaseUtil.loginForFirebase(this@MainActivity, getString(R.string.authe_id)) {
                    if (it.uid != oldUser.id) {
                        launch { firebaseSetUp(it.uid) }
                    }

                }

            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

    }

    private suspend fun firebaseSetUp(id: String) {

        val user = settingUiState.getUser()
        settingUiState.setUser(user.copy(id = id))
        analytics?.setUserId(id)

    }


    private fun logScoreToFirebase() {
        lifecycleScope.launch(Dispatchers.IO) {
            val name = FirebaseUtil.getName(this@MainActivity)
            val game = settingUiState.getGame(2, name.name)
            game.let {
                val players = it.first
                analytics?.setUserProperty("soloHuman", players[1].win.toString())
                analytics?.setUserProperty("soloComputer", players[0].win.toString())
            }
            val game4 = settingUiState.getGame(4, name.name)
            game4.let {
                val players = it.first
                analytics?.setUserProperty("trioHuman", players[3].win.toString())
                analytics?.setUserProperty("trioComputer1", players[0].win.toString())
                analytics?.setUserProperty("trioComputer2", players[1].win.toString())
                analytics?.setUserProperty("trioComputer3", players[2].win.toString())
            }
        }

    }


    fun updateLeaderboard(players: List<PlayerUiState>) {
        if (players.isNotEmpty()) {
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
    }

    private fun saveGame(compScore: IntArray, num: Int) {
        lifecycleScope.launch(Dispatchers.IO) {

            FirebaseUtil.saveGame(
                compScore.joinToString(),
                compScore.sum().toLong(),
                num,
                this@MainActivity
            )

        }
    }

    fun loadImage(getImage: (ImageBitmap) -> Unit) {

        val user = settingUiState.getUser().photoUri
        val image = ImageManager.create(this)
        image.loadImage({ _: Uri, drawable: Drawable?, isRequestDrawable: Boolean ->

            if (isRequestDrawable && drawable != null) {
                val image2 = ImageBitmap(100, 100, ImageBitmapConfig.Argb8888)
                val canvas = Canvas(image2)

                drawable.bounds = Rect(0, 0, image2.width, image2.height)

                drawable.draw(canvas.nativeCanvas)

                Timber.e("load image")

                getImage(image2)

            }
        }, Uri.parse(user))
    }

    suspend fun getArchi(): ArchievementData? {
        return FirebaseUtil.getRandAchievement(achievement)
    }

    fun acheveUi() {
        achievement
            ?.achievementsIntent
            ?.addOnSuccessListener {
                startActivityForResult(it, 48)
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
//                    registerForActivityResult(ActivityResultContracts.StartActivityForResult()){result->
//
//                     //   result.resultCode== RESULT_OK
//                    }
//                }
            }
            ?.addOnFailureListener {
                it.printStackTrace()
            }
    }

}

fun Context.asMainActivity() = this as MainActivity
