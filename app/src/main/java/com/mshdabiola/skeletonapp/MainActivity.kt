package com.mshdabiola.skeletonapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.arkivanov.decompose.defaultComponentContext
import com.mshdabiola.navigation.RootComponent
import com.mshdabiola.skeletonapp.ui.SkeletonApp2

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()

        val root =
            RootComponent(
                componentContext = defaultComponentContext()
            )

        setContent {
            WindowCompat.setDecorFitsSystemWindows(window, false)

            // A surface container using the 'background' color from the theme
           // SkeletonApp(windowSizeClass = calculateWindowSizeClass(activity = this))
            SkeletonApp2(IRootComponent = root)
        }
    }
}
