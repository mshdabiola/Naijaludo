package com.mshdabiola.main

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
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
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mshdabiola.designsystem.component.GameButton
import com.mshdabiola.designsystem.icon.Drawable
import com.mshdabiola.designsystem.icon.drawable.Bg
import com.mshdabiola.designsystem.icon.drawable.Bg2
import com.mshdabiola.designsystem.icon.drawable.Logo
import com.mshdabiola.designsystem.string.Dimensions.Base
import com.mshdabiola.designsystem.string.Dimensions.Base2
import com.mshdabiola.designsystem.string.Dimensions.Base4
import com.mshdabiola.designsystem.string.Dimensions.LogoButtonSpace
import com.mshdabiola.designsystem.string.Dimensions.LogoSize
import com.mshdabiola.designsystem.string.Dimensions.PlayButtonSize
import com.mshdabiola.model.DEVICE_TYPE
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.ui.MarketButton
import com.mshdabiola.ui.issPortrait
import com.mshdabiola.ui.state.SettingUiState
import com.mshdabiola.ui.state.toUi
import naijaludo.features.main.generated.resources.Res
import naijaludo.features.main.generated.resources.close
import naijaludo.features.main.generated.resources.logo
import naijaludo.features.main.generated.resources.play
import naijaludo.features.main.generated.resources.setting
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun MainRoute(
    modifier: Modifier = Modifier,
    sharedTransitionScope: SharedTransitionScope,
    animatedContentScope: AnimatedVisibilityScope,
    mainViewModel: MainViewModel,
    navigateToGame: () -> Unit,
    navigateToMarket: () -> Unit,
    deviceType: DEVICE_TYPE = DEVICE_TYPE.DEFAULT,
) {
    val settingUiState = mainViewModel.settingUiState.collectAsStateWithLifecycle()
    MainScreen(
        modifier = modifier,
        sharedTransitionScope = sharedTransitionScope,
        animatedContentScope = animatedContentScope,
        onPlay = {
            // navController.popBackStack()
            //  navController.navigate("game")
            navigateToGame()
            mainViewModel.onPlayGame()
        },
        onMarket = navigateToMarket,
        onCloseApp = {
            // activity.finish()
        },
        settingUiState = settingUiState.value,
        setSetting = mainViewModel::setSetting,
        deviceType = deviceType,
    )
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    sharedTransitionScope: SharedTransitionScope,
    animatedContentScope: AnimatedVisibilityScope,
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

    val vector = if (issPortrait()) {
        Drawable.Bg
    } else {
        Drawable.Bg2
    }

    val painter = rememberVectorPainter(image = vector)

    Scaffold(
        containerColor = Color.Transparent,
        modifier = modifier
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
                    contentDescription = stringResource(Res.string.close),
                    Modifier.rotate(45f),
                )
            }

            Column(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(end = 8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                IconButton(
                    onClick = { showDialog = true },
                ) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = stringResource(Res.string.setting),
                    )
                }

                MarketButton(onClick = onMarket)
            }

            if (deviceType == DEVICE_TYPE.PHONE_PORT || deviceType == DEVICE_TYPE.TABLET_PORT) {
                Column(Modifier.align(Alignment.TopCenter)) {
                    Spacer(modifier = Modifier.height(Base4))
                    Image(
                        modifier = Modifier
                            .width(LogoSize),
                        imageVector = Drawable.Logo,
                        contentDescription = stringResource(Res.string.logo),
                    )
                }

                GameButton(
                    onClick = onPlay,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(PlayButtonSize),
                    shape = RoundedCornerShape(Base2),
                    elevation = Base,

                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = stringResource(Res.string.play),
                        modifier = Modifier.size(Base4),
                    )
                }
            } else {
                Row(
                    modifier = Modifier.align(Alignment.Center),
                    verticalAlignment = Alignment.CenterVertically,

                ) {
                    Image(
                        modifier = Modifier.width(LogoSize),
                        imageVector = Drawable.Logo,
                        contentDescription = stringResource(Res.string.logo),
                    )
                    Spacer(
                        modifier = Modifier
                            .width(LogoButtonSpace),
                    )
                    GameButton(
                        onClick = onPlay,
                        modifier = Modifier
                            .size(PlayButtonSize),
                        shape = RoundedCornerShape(Base2),
                        elevation = Base,

                    ) {
                        Icon(
                            imageVector = Icons.Rounded.PlayArrow,
                            contentDescription = stringResource(Res.string.play),
                            modifier = Modifier.size(Base4),
                        )
                    }
                    Spacer(
                        modifier = Modifier
                            .width(Base4),
                    )
                }
            }
        }
        SettingDialog(
            show = showDialog,
            settingUiState,
            setSetting,
            onDismissRequest = { showDialog = false },
        )
    }
}
//
// @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
// @Preview(device = "spec:parent=pixel_5,orientation=landscape")
// @Preview()
// @Composable
// fun MainScreenPreview() {
// //    val config= LocalConfiguration.current
// //    val size = DpSize(config.screenWidthDp.dp,config.screenHeightDp.dp)
// //    val windowSize =WindowSizeClass.calculateFromSize(size)
//
//    LudoAppTheme() {
//        MainScreen()
//    }
// }
