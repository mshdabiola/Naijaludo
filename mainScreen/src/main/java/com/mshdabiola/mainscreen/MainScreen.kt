package com.mshdabiola.mainscreen

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
import com.mshdabiola.designsystem.icon.LudoIcon
import com.mshdabiola.gamescreen.component.GameButton
import com.mshdabiola.ludo.model.navigation.LudoNavDestination

@Composable
fun MainScreen(navigateTo: (String) -> Unit) {
    val activity = LocalContext.current as Activity

    MainScreen(
        onPlay = {
            // navController.popBackStack()
            //  navController.navigate("game")
            navigateTo(LudoNavDestination.GameNavDestination.route)
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
        }
    ) {
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
                    imageVector = ImageVector.vectorResource(id = LudoIcon.PlayIcon),
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
