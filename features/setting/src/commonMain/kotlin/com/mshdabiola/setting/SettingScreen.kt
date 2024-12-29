/*
 *abiola 2022
 */

package com.mshdabiola.setting

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mshdabiola.designsystem.component.DialogUi
import com.mshdabiola.designsystem.string.Dimensions.Base2
import com.mshdabiola.model.DarkThemeConfig
import com.mshdabiola.ui.state.SettingUiState
import naijaludo.features.setting.generated.resources.Res
import naijaludo.features.setting.generated.resources.assistant
import naijaludo.features.setting.generated.resources.basic_setting
import naijaludo.features.setting.generated.resources.board_setting
import naijaludo.features.setting.generated.resources.board_style
import naijaludo.features.setting.generated.resources.board_type
import naijaludo.features.setting.generated.resources.close
import naijaludo.features.setting.generated.resources.daynight
import naijaludo.features.setting.generated.resources.game_setting
import naijaludo.features.setting.generated.resources.level
import naijaludo.features.setting.generated.resources.mode
import naijaludo.features.setting.generated.resources.music
import naijaludo.features.setting.generated.resources.pawn_num
import naijaludo.features.setting.generated.resources.pawn_number
import naijaludo.features.setting.generated.resources.rotate
import naijaludo.features.setting.generated.resources.sound
import naijaludo.features.setting.generated.resources.sound_setting
import naijaludo.features.setting.generated.resources.style
import naijaludo.features.setting.generated.resources.type
import org.jetbrains.compose.resources.stringArrayResource
import org.jetbrains.compose.resources.stringResource

@Composable
internal fun SettingRoute(
    modifier: Modifier = Modifier,
    onShowSnack: suspend (String, String?) -> Boolean,
    onBack: () -> Unit,
    viewModel: SettingViewModel,
) {
    val settingUiState = viewModel.settingUiState.collectAsStateWithLifecycle()

    SettingScreen(
        modifier = modifier.heightIn(min = 300.dp),
        onDismissRequest = onBack,
        setSetting = viewModel::setSetting,
        settingUiState = settingUiState.value,
    )
}

@Composable
internal fun SettingScreen(
    modifier: Modifier = Modifier,
    settingUiState: SettingUiState,
    setSetting: (SettingUiState) -> Unit = {},
    onDismissRequest: () -> Unit = {},
) {
    DialogUi(
        modifier = modifier.padding(vertical = Base2),
        title = { Text(text = stringResource(Res.string.game_setting)) },
        cancelIcon = {
            IconButton(onClick = onDismissRequest) {
                Icon(
                    imageVector = Icons.Default.Clear,
                    contentDescription = stringResource(Res.string.close),
                )
            }
        },
        content = {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally,

            ) {
                Title(title = stringResource(Res.string.basic_setting))
                SettingContainer {
                    SettingItem2(title = Res.string.level) { modifier ->
                        ExposeBox(
                            modifier = modifier,
                            current = settingUiState.gameLevel,
                            onValueChange = {
                                setSetting(settingUiState.copy(gameLevel = it))
                            },
                            stringArrayRes = Res.array.level,
                        )
                    }
                    SettingItem2(title = Res.string.mode) { modifier ->
                        ExposeBox(
                            modifier = modifier,
                            current = settingUiState.darkThemeConfig.ordinal,
                            onValueChange = {
                                setSetting(settingUiState.copy(darkThemeConfig = DarkThemeConfig.entries[it]))
                            },
                            stringArrayRes = Res.array.daynight,
                        )
                    }
                    SettingItem(title = Res.string.assistant) { modifier ->
                        Switch(
                            modifier = modifier,
                            checked = settingUiState.assistant,
                            onCheckedChange = {
                                setSetting(settingUiState.copy(assistant = it))
                            },
                        )
                    }
                }
                Title(title = stringResource(Res.string.sound_setting))
                SettingContainer {
                    SettingItem(title = Res.string.sound) { modifier ->
                        Switch(
                            modifier = modifier,
                            checked = settingUiState.sound,
                            onCheckedChange = {
                                setSetting(settingUiState.copy(sound = it))
                            },
                        )
                    }
                    SettingItem(title = Res.string.music) { modifier ->
                        Switch(
                            modifier = modifier,
                            checked = settingUiState.music,
                            onCheckedChange = {
                                setSetting(settingUiState.copy(music = it))
                            },
                        )
                    }
                }

                Title(title = stringResource(Res.string.board_setting))
                SettingContainer {
                    SettingItem2(Res.string.style) { modi ->
                        ExposeBox(
                            modifier = modi,
                            current = settingUiState.boardStyle,
                            onValueChange = {
                                setSetting(settingUiState.copy(boardStyle = it))
                            },
                            stringArrayRes = Res.array.board_style,
                        )
                    }
                    SettingItem2(Res.string.type) { modi ->
                        ExposeBox(
                            modifier = modi,
                            current = settingUiState.boardType,
                            onValueChange = {
                                setSetting(settingUiState.copy(boardType = it))
                            },
                            stringArrayRes = Res.array.board_type,
                        )
                    }
                    SettingItem(Res.string.pawn_num) { modi ->
                        val value = stringArrayResource(Res.array.pawn_number)
                        ExposeBox(
                            modifier = modi.weight(0.5f),
                            current = value.indexOfFirst { it == "${settingUiState.pawnNumber}" },
                            onValueChange = {
                                setSetting(settingUiState.copy(pawnNumber = value[it].toInt()))
                            },
                            stringArrayRes = Res.array.pawn_number,
                        )

                        //
                    }
                    SettingItem(Res.string.rotate) { modifier ->
                        Switch(
                            modifier = modifier,
                            checked = settingUiState.rotate,
                            onCheckedChange = {
                                setSetting(settingUiState.copy(rotate = it))
                            },
                        )
                    }
                }
            }
        },
    )
}
