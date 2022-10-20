package com.mshdabiola.ludo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.mshdabiola.ludo.ui.LudoApp
import com.mshdabiola.ludo.ui.gamescreen.GameViewModel
import com.mshdabiola.ludo.ui.theme.NaijaLudoTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
     //   val gameViewModel = viewModels<GameViewModel>().value
        super.onCreate(savedInstanceState)
        setContent {
            NaijaLudoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //WindowCompat.setDecorFitsSystemWindows(window,false)
                    LudoApp(windowSizeClass = calculateWindowSizeClass(activity = this))
                   // MyNavigationGraph(gameScreenViewModel = gameViewModel)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
    Button(onClick = { /*TODO*/ }) {

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NaijaLudoTheme {
        Greeting("Android")
    }
}