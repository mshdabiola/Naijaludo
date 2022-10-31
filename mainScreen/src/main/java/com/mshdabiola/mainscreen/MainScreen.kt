package com.mshdabiola.mainscreen

import android.app.Activity
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.icon.LudoIcon
import com.mshdabiola.designsystem.theme.LudoAppTheme
import com.mshdabiola.gamescreen.component.GameButton
import com.mshdabiola.ludo.model.navigation.DEVICE_TYPE
import com.mshdabiola.ludo.model.navigation.LudoNavDestination

@Composable
fun MainScreen(navigateTo: (String) -> Unit, deviceType: DEVICE_TYPE = DEVICE_TYPE.PHONE) {
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

    val vector = ImageVector.vectorResource(id = LudoIcon.bg)

    val painter = rememberVectorPainter(image = vector)
    val configuration = LocalConfiguration.current
    val isPortrait by remember(configuration) {
        derivedStateOf { configuration.orientation == Configuration.ORIENTATION_PORTRAIT }
    }

    Scaffold(
        containerColor = Color.Transparent,
        modifier = Modifier
            .drawBehind {
                with(painter) {

                    draw(size)
                }
            },
        topBar = {

            TopAppBar(
                navigationIcon = {
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
                },
                title = {},
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Transparent)
            )
        }
    ) {
        Box(
            Modifier
                .fillMaxSize()
                .padding(it)
        ) {

            if (isPortrait) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(64.dp))
                    Image(
                        modifier = Modifier.width(200.dp),
                        painter = painterResource(id = LudoIcon.logo),
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.height(64.dp))
                    GameButton(
                        onClick = onPlay,
                        modifier = Modifier
                            .size(96.dp),
                        shape = RoundedCornerShape(16.dp)

                    ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = LudoIcon.PlayIcon),
                            contentDescription = "Play",
                            modifier = Modifier.size(64.dp)
                        )
                    }
                }
            } else {
                Row(
                    modifier = Modifier.align(Alignment.Center),
                    verticalAlignment = Alignment.CenterVertically

                ) {

                    Image(
                        modifier = Modifier.width(200.dp),
                        painter = painterResource(id = LudoIcon.logo),
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.width(128.dp))
                    GameButton(
                        onClick = onPlay,
                        modifier = Modifier
                            .size(96.dp),
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
    }
}

@Preview(device = "spec:parent=pixel_5,orientation=landscape")
@Composable
fun MainScreenPreview() {
    LudoAppTheme() {
        MainScreen()
    }
}
