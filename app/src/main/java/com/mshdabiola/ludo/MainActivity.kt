package com.mshdabiola.ludo

import android.annotation.TargetApi
import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.google.android.gms.ads.MobileAds
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.install.model.AppUpdateType
import com.google.android.play.core.install.model.UpdateAvailability
import com.mshdabiola.ludo.ui.LudoApp
import com.mshdabiola.mainscreen.ShareUtil
import dagger.hilt.android.AndroidEntryPoint
import java.util.Locale

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        //   val gameViewModel = viewModels<GameViewModel>().value

        super.onCreate(savedInstanceState)
        installSplashScreen()
        MobileAds.initialize(this)
//       val config= RequestConfiguration
//           .Builder()
//           .setTestDeviceIds(listOf("F88052080148517BFFEBAE8E7F15692B"))
//           .build()
//        MobileAds.setRequestConfiguration(config)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        setContent {
//            NaijaLudoTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
            WindowCompat.setDecorFitsSystemWindows(window, false)
            LudoApp(windowSizeClass = calculateWindowSizeClass(activity = this))
            // MyNavigationGraph(gameScreenViewModel = gameViewModel)
//                }
//            }
        }
    }
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(updateBaseContextLocale(base))
    }

    private fun updateBaseContextLocale(context: Context): Context? {
//        val language: String =
//            SharedPrefUtils.getSavedLanguage() // Helper method to get saved language from SharedPreferences
        val locale = Locale(ShareUtil.getLand(context))
        Locale.setDefault(locale)
        return if (Build.VERSION.SDK_INT > Build.VERSION_CODES.N) {
            updateResourcesLocale(context, locale)
        } else {
            updateResourcesLocaleLegacy(context, locale)
        }
    }

    @TargetApi(Build.VERSION_CODES.N_MR1)
    private fun updateResourcesLocale(context: Context, locale: Locale): Context? {
        val configuration = Configuration(context.resources.configuration)
        configuration.setLocale(locale)
        return context.createConfigurationContext(configuration)
    }

    private fun updateResourcesLocaleLegacy(context: Context, locale: Locale): Context? {
        val resources: Resources = context.resources
        val configuration: Configuration = resources.configuration
        configuration.locale = locale
        resources.updateConfiguration(configuration, resources.displayMetrics)
        return context
    }

    override fun onStart() {
        super.onStart()
        val appUpdateInfoManager = AppUpdateManagerFactory.create(this)
        val appUpdateInfoTask = appUpdateInfoManager.appUpdateInfo

        appUpdateInfoTask.addOnSuccessListener { appUpdateInfo ->
            if (appUpdateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE &&
                appUpdateInfo.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE)
            ) {
                appUpdateInfoManager.startUpdateFlowForResult(appUpdateInfo, AppUpdateType.IMMEDIATE, this, 343)
            }
            //  log("update ${appUpdateInfo.packageName()} ${appUpdateInfo.availableVersionCode()}",)
        }.addOnFailureListener {
            it.printStackTrace()
        }
    }
}
