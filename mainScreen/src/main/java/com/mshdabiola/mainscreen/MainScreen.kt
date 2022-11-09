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
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
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
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mshdabiola.designsystem.component.GameButton
import com.mshdabiola.designsystem.icon.LudoIcon
import com.mshdabiola.designsystem.theme.LudoAppTheme
import com.mshdabiola.ludo.model.navigation.DEVICE_TYPE
import com.mshdabiola.ludo.model.navigation.LudoNavDestination

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun MainScreen(
    mainViewModel: MainViewModel = hiltViewModel(),
    navigateTo: (String) -> Unit,
    deviceType: DEVICE_TYPE = DEVICE_TYPE.DEFAULT
) {
    val activity = LocalContext.current as Activity

    val basic by mainViewModel.basic.collectAsStateWithLifecycle()
    val sound by mainViewModel.sound.collectAsStateWithLifecycle()
    val board by mainViewModel.board.collectAsStateWithLifecycle()
    val profile =
        mainViewModel.profileState.value // by mainViewModel.profile.collectAsStateWithLifecycle()

    LaunchedEffect(
        key1 = profile,
        block = {
            mainViewModel.uploadProfile()
        }
    )

    MainScreen(
        onPlay = {
            // navController.popBackStack()
            //  navController.navigate("game")
            navigateTo(LudoNavDestination.GameNavDestination.route)
        },
        onCloseApp = {
            activity.finish()
        },
        basic = basic,
        sound = sound,
        board = board,
        profile = profile,
        basicSettingChange = mainViewModel::setBasic,
        soundSettingChange = mainViewModel::setSound,
        boardSettingChange = mainViewModel::setBoard,
        profileSettingChange = mainViewModel::setProfile
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    onPlay: () -> Unit = {},
    onCloseApp: () -> Unit = {},
    basic: Basic = Basic(),
    sound: Sound = Sound(),
    profile: Profile = Profile(),
    board: Board = Board(),
    basicSettingChange: (Basic) -> Unit = {},
    soundSettingChange: (Sound) -> Unit = {},
    profileSettingChange: (Profile) -> Unit = {},
    boardSettingChange: (Board) -> Unit = {}
) {

    var showDialog by rememberSaveable {
        mutableStateOf(true)
    }

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
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Transparent),
                actions = {
                    IconButton(onClick = { showDialog = true }) {
                        Icon(imageVector = Icons.Default.Settings, contentDescription = "setting")
                    }
                }
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
        SettingDialog(
            show = showDialog,
            basic = basic,
            sound = sound,
            profile = profile,
            board = board,
            onDismissRequest = { showDialog = false },
            basicSettingChange, soundSettingChange, profileSettingChange, boardSettingChange
        )
    }
}

@Preview()
@Composable
fun MainScreenPreview() {
    LudoAppTheme() {
        MainScreen()
    }
}
