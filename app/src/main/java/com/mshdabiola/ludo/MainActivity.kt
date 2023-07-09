package com.mshdabiola.ludo

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import com.arkivanov.decompose.defaultComponentContext
import com.google.android.gms.games.AuthenticationResult
import com.google.android.gms.games.PlayGames
import com.google.android.gms.tasks.Task
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.install.model.AppUpdateType
import com.google.android.play.core.install.model.UpdateAvailability
import com.mshdabiola.ludo.database.FirebaseUtil
import com.mshdabiola.ludo.ui.LudoApp
import com.mshdabiola.navigation.RootComponent
import com.mshdabiola.setting.MultiplatformSettings
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import timber.log.Timber


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        //   val gameViewModel = viewModels<GameViewModel>().value

        super.onCreate(savedInstanceState)
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

        val gamesSignInClient = PlayGames.getGamesSignInClient(this)


        gamesSignInClient.isAuthenticated()
            .addOnCompleteListener { isAuthenticatedTask: Task<AuthenticationResult> ->
                val isAuthenticated = isAuthenticatedTask.isSuccessful &&
                        isAuthenticatedTask.result.isAuthenticated
                if (isAuthenticated) {
                    // Continue with Play Games Services
                    Timber.e("login")
                    updateScore()
                } else {
                    // Disable your integration with Play Games Services or show a
                    // login button to ask  players to sign-in. Clicking it should
                    gamesSignInClient.signIn().addOnSuccessListener {
                        updateScore()
                    }
                }
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
            LudoApp(
                windowSizeClass = calculateWindowSizeClass(activity = this),
                iRootComponent = root
            )
            // MyNavigationGraph(gameScreenViewModel = gameViewModel)
//                }
//            }
        }
    }

//    override fun attachBaseContext(base: Context) {
//        super.attachBaseContext(updateBaseContextLocale(base))
//    }

//    private fun updateBaseContextLocale(context: Context): Context? {
////        val language: String =
////            SharedPrefUtils.getSavedLanguage() // Helper method to get saved language from SharedPreferences
//        val locale = Locale(ShareUtil.getLand(context))
//        Locale.setDefault(locale)
//        return if (Build.VERSION.SDK_INT > Build.VERSION_CODES.N) {
//            updateResourcesLocale(context, locale)
//        } else {
//            updateResourcesLocaleLegacy(context, locale)
//        }
//    }

//    @TargetApi(Build.VERSION_CODES.N_MR1)
//    private fun updateResourcesLocale(context: Context, locale: Locale): Context? {
//        val configuration = Configuration(context.resources.configuration)
//        configuration.setLocale(locale)
//        return context.createConfigurationContext(configuration)
//    }

//    private fun updateResourcesLocaleLegacy(context: Context, locale: Locale): Context? {
//        val resources: Resources = context.resources
//        val configuration: Configuration = resources.configuration
//        configuration.locale = locale
//        resources.updateConfiguration(configuration, resources.displayMetrics)
//        return context
//    }

    override fun onStart() {
        super.onStart()
        val appUpdateInfoManager = AppUpdateManagerFactory.create(this)
        val appUpdateInfoTask = appUpdateInfoManager.appUpdateInfo

        appUpdateInfoTask.addOnSuccessListener { appUpdateInfo ->
            if (appUpdateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE &&
                appUpdateInfo.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE)
            ) {
                appUpdateInfoManager.startUpdateFlowForResult(
                    appUpdateInfo,
                    AppUpdateType.IMMEDIATE,
                    this,
                    343
                )
            }
            //  log("update ${appUpdateInfo.packageName()} ${appUpdateInfo.availableVersionCode()}",)
        }.addOnFailureListener {
            it.printStackTrace()
        }
    }

    private fun updateScore() {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                val settingUiState by inject<MultiplatformSettings>()

                val leaderboardScore = FirebaseUtil.rank(
                    resources.getString(com.mshdabiola.designsystem.R.string.leaderboard_single_player),
                    this@MainActivity
                )!!
                settingUiState.getGame(2)?.let {
                    val players = it.getSaverPlayer().toMutableList()
                    var player = players[1]
                    if (leaderboardScore.rawScore > player.win) {
                        player = player.copy(win = leaderboardScore.rawScore.toInt())
                        players[1] = player
                    }
                    val settings = settingUiState.getGameSetting()
                    val playersName = settings.playerName.toMutableList()
                    if (playersName[0] == "Human") {
                        playersName[0] = leaderboardScore.scoreHolderDisplayName
                        settingUiState.setGameSetting(settings.copy(playerName = playersName))
                    }

                    settingUiState.setGame(players.map { it.toOriginal() }, it.pawns)
                }

                val leaderboardScore2 = FirebaseUtil.rank(
                    resources.getString(com.mshdabiola.designsystem.R.string.leaderboard_multiplayer),
                    this@MainActivity
                )!!
                settingUiState.getGame(2)?.let {
                    val players = it.getSaverPlayer().toMutableList()
                    var player = players[1]
                    if (leaderboardScore2.rawScore > player.win) {
                        player = player.copy(win = leaderboardScore2.rawScore.toInt())
                        players[3] = player
                    }

                    settingUiState.setGame(players.map { it.toOriginal() }, it.pawns)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
    }

}
