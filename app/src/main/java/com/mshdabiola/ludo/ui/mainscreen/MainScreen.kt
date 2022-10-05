package com.mshdabiola.ludo.ui.mainscreen

import android.app.Activity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mshdabiola.ludo.R
import com.mshdabiola.ludo.ui.component.GameButton

@Composable
fun MainScreen(navController: NavController) {
    val activity = LocalContext.current as Activity

    MainScreen(onPlay = {
        navController.popBackStack()
        navController.navigate("game"){

        }
    },
        onCloseApp = {
            activity.finish()
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    onPlay: () -> Unit = {},
    onCloseApp: () -> Unit = {}

) {


    Scaffold(

        topBar = {
            TopAppBar(navigationIcon = {
                GameButton(
                    onClick = onCloseApp,
                    colors = MaterialTheme.colorScheme.secondaryContainer,

                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "cancel",
                        Modifier.rotate(45f)
                    )

                }
            }, title = {})
        }) {
        Box(
            Modifier
                .fillMaxSize()
                .padding(it)
        ) {

            GameButton(
                onClick = onPlay,
                modifier = Modifier
                    .size(96.dp)
                    .align(Alignment.Center),
                shape = RoundedCornerShape(16.dp)

            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_baseline_play_arrow_24),
                    contentDescription = "Play",
                    modifier = Modifier.size(64.dp)
                )
            }


        }
    }


}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}