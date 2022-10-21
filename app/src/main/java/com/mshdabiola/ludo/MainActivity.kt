package com.mshdabiola.ludo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import com.mshdabiola.ludo.ui.LudoApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
     //   val gameViewModel = viewModels<GameViewModel>().value
        super.onCreate(savedInstanceState)
        setContent {
//            NaijaLudoTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
                    //WindowCompat.setDecorFitsSystemWindows(window,false)
                    LudoApp(windowSizeClass = calculateWindowSizeClass(activity = this))
                   // MyNavigationGraph(gameScreenViewModel = gameViewModel)
//                }
//            }
        }
    }
}
