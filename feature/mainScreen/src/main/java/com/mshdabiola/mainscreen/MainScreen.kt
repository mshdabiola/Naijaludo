package com.mshdabiola.mainscreen

import android.app.Activity
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
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
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mshdabiola.designsystem.R
import com.mshdabiola.designsystem.component.GameButton
import com.mshdabiola.designsystem.component.MainAd
import com.mshdabiola.designsystem.icon.LudoIcon
import com.mshdabiola.designsystem.theme.LudoAppTheme
import com.mshdabiola.common.navigation.DEVICE_TYPE
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@Composable
fun MainScreen(
    mainViewModel: MainViewModel = hiltViewModel(),
    navigateTo: () -> Unit,
    deviceType: DEVICE_TYPE = DEVICE_TYPE.DEFAULT,
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
        },
    )
    LaunchedEffect(key1 = Unit, block = {
        mainViewModel.logScreen("mainscreen")
    })

    val lifecycle = LocalLifecycleOwner.current.lifecycle

    val listener = object : DefaultLifecycleObserver {
        override fun onPause(owner: LifecycleOwner) {
            super.onPause(owner)
            mainViewModel.onPause()
        }

        override fun onResume(owner: LifecycleOwner) {
            super.onResume(owner)
            mainViewModel.onResume()
        }
    }
    DisposableEffect(key1 = lifecycle, effect = {
        lifecycle.addObserver(listener)
        onDispose {
            lifecycle.removeObserver(listener)
        }
    })

    MainScreen(
        onPlay = {
            // navController.popBackStack()
            //  navController.navigate("game")
            navigateTo()
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
        profileSettingChange = mainViewModel::setProfile,
        deviceType = deviceType,
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
    boardSettingChange: (Board) -> Unit = {},
    deviceType: DEVICE_TYPE = DEVICE_TYPE.PHONE_PORT,
) {
    var showDialog by rememberSaveable {
        mutableStateOf(false)
    }

    val vector = ImageVector.vectorResource(id = LudoIcon.bg)

    val painter = rememberVectorPainter(image = vector)
    val configuration = LocalConfiguration.current
    val context = LocalContext.current
    val coroutine = rememberCoroutineScope()

    Scaffold(
        containerColor = Color.Transparent,
        modifier = Modifier
            .drawBehind {
                with(painter) {
                    draw(size)
                }
            },

    ) { paddingValues ->
        Box(
            Modifier
                .fillMaxSize()
                .padding(paddingValues),
        ) {
            IconButton(
                modifier = Modifier.align(Alignment.TopStart),
                onClick = onCloseApp,
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = stringResource(id = R.string.close),
                    Modifier.rotate(45f),
                )
            }
//            IconButton(
//                modifier = Modifier.align(Alignment.TopCenter),
//                onClick = {
//                    val actvity=context as Activity
//                          PlayGames.getGamesSignInClient(actvity)
//                              .signIn()
//                              .addOnSuccessListener {
//                                  if(it.isAuthenticated){
//                                      Log.e("is Authentication","")
//                                  }
//                                  Log.e("succefull","loging")
//                              }
//                              .addOnFailureListener {
//                                  it.printStackTrace()
//                              }
//                    PlayGames.getLeaderboardsClient(actvity)
//                        .submitScoreImmediate("CgkIsvWJ65EFEAIQAA",3)
//                    PlayGames.getLeaderboardsClient(actvity)
//                        .loadCurrentPlayerLeaderboardScore("CgkIsvWJ65EFEAIQAA",LeaderboardVariant.TIME_SPAN_ALL_TIME,LeaderboardVariant.COLLECTION_PUBLIC)
//                        .addOnSuccessListener {
//                           val rand= it.get()?.rank
//                            Log.e("rank","rank $rand")
//                        }
//                    PlayGames.getLeaderboardsClient(actvity)
//                        .getLeaderboardIntent("CgkIsvWJ65EFEAIQAA")
//                        .addOnSuccessListener{
//                            context.startActivityForResult(it,34)
//                        }
//
//                },
//            ) {
//                Icon(
//                    imageVector = Icons.Default.Add,
//                    contentDescription = stringResource(id = R.string.close),
//                    Modifier.rotate(45f),
//                )
//            }
            IconButton(
                modifier = Modifier.align(Alignment.TopEnd),
                onClick = { showDialog = true },
            ) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = stringResource(id = R.string.setting),
                )
            }
            if (deviceType == DEVICE_TYPE.PHONE_PORT || deviceType == DEVICE_TYPE.TABLET_PORT) {
                Column(Modifier.align(Alignment.TopCenter)) {
                    Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.base_4)))
                    Image(
                        modifier = Modifier
                            .width(dimensionResource(id = R.dimen.logo_size)),
                        painter = painterResource(id = LudoIcon.logo),
                        contentDescription = stringResource(id = R.string.logo),
                    )
                }
                RankCard(
                    Modifier.width(70.dp).align(Alignment.CenterEnd),
                    leadRes = R.string.leaderboard_general_rank,
                )

                GameButton(
                    onClick = onPlay,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(dimensionResource(id = R.dimen.play_button_size)),
                    shape = RoundedCornerShape(dimensionResource(id = R.dimen.base_2)),
                    elevation = dimensionResource(id = R.dimen.base),

                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = LudoIcon.PlayIcon),
                        contentDescription = stringResource(id = R.string.play),
                        modifier = Modifier.size(dimensionResource(id = R.dimen.base_4)),
                    )
                }
                MainAd(Modifier.align(Alignment.BottomCenter))
            } else {
                Row(
                    modifier = Modifier.align(Alignment.Center),
                    verticalAlignment = Alignment.CenterVertically,

                ) {
                    Image(
                        modifier = Modifier.width(dimensionResource(id = R.dimen.logo_size)),
                        painter = painterResource(id = LudoIcon.logo),
                        contentDescription = stringResource(id = R.string.logo),
                    )
                    Spacer(
                        modifier = Modifier
                            .width(dimensionResource(id = R.dimen.logo_button_space)),
                    )
                    GameButton(
                        onClick = onPlay,
                        modifier = Modifier
                            .size(dimensionResource(id = R.dimen.play_button_size)),
                        shape = RoundedCornerShape(dimensionResource(id = R.dimen.base_2)),
                        elevation = dimensionResource(id = R.dimen.base),

                    ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = LudoIcon.PlayIcon),
                            contentDescription = stringResource(id = R.string.play),
                            modifier = Modifier.size(dimensionResource(id = R.dimen.base_4)),
                        )
                    }
                    Spacer(
                        modifier = Modifier
                            .width(dimensionResource(id = R.dimen.base_4)),
                    )
                    RankCard(
                        Modifier.width(70.dp),
                        leadRes = R.string.leaderboard_general_rank,
                    )
                }
                MainAd(Modifier.align(Alignment.BottomEnd))
            }
        }
        SettingDialog(
            show = showDialog,
            basic = basic,
            sound = sound,
            profile = profile,
            board = board,
            onDismissRequest = { showDialog = false },
            basicSettingChange, soundSettingChange, profileSettingChange, boardSettingChange,
            setLanguage = {
                coroutine.launch(Dispatchers.IO) {
                    ShareUtil.setLanguage(context, it)
                    withContext(Dispatchers.Main) {
                        (context as Activity).recreate()
                    }
                }
            },
        )
    }
}

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Preview()
@Composable
fun MainScreenPreview() {
//    val config= LocalConfiguration.current
//    val size = DpSize(config.screenWidthDp.dp,config.screenHeightDp.dp)
//    val windowSize =WindowSizeClass.calculateFromSize(size)

    LudoAppTheme() {
        MainScreen()
    }
}
