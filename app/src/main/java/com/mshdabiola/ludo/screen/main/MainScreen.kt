package com.mshdabiola.ludo.screen.main

import android.app.Activity
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
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
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mshdabiola.designsystem.R
import com.mshdabiola.designsystem.component.GameButton
import com.mshdabiola.designsystem.icon.Drawable
import com.mshdabiola.designsystem.icon.drawable.Bg
import com.mshdabiola.designsystem.icon.drawable.Bg2
import com.mshdabiola.designsystem.icon.drawable.Logo
import com.mshdabiola.designsystem.theme.LudoAppTheme
import com.mshdabiola.ludo.screen.DEVICE_TYPE
import com.mshdabiola.ludo.screen.GeneralViewModel
import com.mshdabiola.ludo.screen.game.LogScreen
import com.mshdabiola.naijaludo.model.Setting

@Composable
fun MainScreen(
    mainViewModel: GeneralViewModel,
    navigateToGame: () -> Unit,
    navigateToMarket: () -> Unit,
    deviceType: DEVICE_TYPE = DEVICE_TYPE.DEFAULT,
) {
    val activity = LocalContext.current as Activity

    val settingUiState by mainViewModel.settingUiState.collectAsStateWithLifecycle()

//    LaunchedEffect(
//        key1 = profile,
//        block = {
//            mainViewModel.uploadProfile()
//        },
//    )
    LogScreen(screenName = "MainScreen")

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
            navigateToGame()
            mainViewModel.onPlayGame()
        },
        onMarket = navigateToMarket,
        onCloseApp = {
            activity.finish()
        },
        settingUiState = settingUiState,
        setSetting = mainViewModel::setSetting,
        deviceType = deviceType,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    onPlay: () -> Unit = {},
    onMarket: () -> Unit = {},
    onCloseApp: () -> Unit = {},
    settingUiState: SettingUiState = Setting.default.toUi(),
    setSetting: (SettingUiState) -> Unit = {},
    deviceType: DEVICE_TYPE = DEVICE_TYPE.PHONE_PORT,
) {
    var showDialog by rememberSaveable {
        mutableStateOf(false)
    }
    val configuration = LocalConfiguration.current

    val vector = if (configuration.orientation==Configuration.ORIENTATION_PORTRAIT)
        Drawable.Bg
    else
        Drawable.Bg2

    val painter = rememberVectorPainter(image = vector)


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

            Column(modifier = Modifier
                .align(Alignment.TopEnd),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                IconButton(
                    onClick = { showDialog = true },
                ) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = stringResource(id = R.string.setting),
                    )
                }

                MarketButton(onClick = onMarket)
            }

            if (deviceType == DEVICE_TYPE.PHONE_PORT || deviceType == DEVICE_TYPE.TABLET_PORT) {
                Column(Modifier.align(Alignment.TopCenter)) {
                    Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.base_4)))
                    Image(
                        modifier = Modifier
                            .width(dimensionResource(id = R.dimen.logo_size)),
                        imageVector = Drawable.Logo,
                        contentDescription = stringResource(id = R.string.logo),
                    )
                }


                GameButton(
                    onClick = onPlay,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(dimensionResource(id = R.dimen.play_button_size)),
                    shape = RoundedCornerShape(dimensionResource(id = R.dimen.base_2)),
                    elevation = dimensionResource(id = R.dimen.base),

                    ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = stringResource(id = R.string.play),
                        modifier = Modifier.size(dimensionResource(id = R.dimen.base_4)),
                    )
                }
            } else {
                Row(
                    modifier = Modifier.align(Alignment.Center),
                    verticalAlignment = Alignment.CenterVertically,

                    ) {
                    Image(
                        modifier = Modifier.width(dimensionResource(id = R.dimen.logo_size)),
                        imageVector = Drawable.Logo,
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
                            imageVector = Icons.Rounded.PlayArrow,
                            contentDescription = stringResource(id = R.string.play),
                            modifier = Modifier.size(dimensionResource(id = R.dimen.base_4)),
                        )
                    }
                    Spacer(
                        modifier = Modifier
                            .width(dimensionResource(id = R.dimen.base_4)),
                    )

                }
            }
        }
        SettingDialog(
            show = showDialog,
            settingUiState, setSetting,
            onDismissRequest = { showDialog = false }
        )
    }
}

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Preview(device = "spec:parent=pixel_5,orientation=landscape")
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
