package com.mshdabiola.setting

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.DialogProperties
import com.mshdabiola.designsystem.component.DialogUi
import com.mshdabiola.designsystem.string.Dimensions.Base2
import com.mshdabiola.ui.state.SettingUiState
import naijaludo.features.setting.generated.resources.Res
import naijaludo.features.setting.generated.resources.assistant
import naijaludo.features.setting.generated.resources.basic_setting
import naijaludo.features.setting.generated.resources.board_setting
import naijaludo.features.setting.generated.resources.board_style
import naijaludo.features.setting.generated.resources.board_type
import naijaludo.features.setting.generated.resources.close
import naijaludo.features.setting.generated.resources.game_setting
import naijaludo.features.setting.generated.resources.level
import naijaludo.features.setting.generated.resources.music
import naijaludo.features.setting.generated.resources.pawn_num
import naijaludo.features.setting.generated.resources.pawn_number
import naijaludo.features.setting.generated.resources.rotate
import naijaludo.features.setting.generated.resources.sound
import naijaludo.features.setting.generated.resources.sound_setting
import naijaludo.features.setting.generated.resources.style
import naijaludo.features.setting.generated.resources.type
import org.jetbrains.compose.resources.StringArrayResource
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringArrayResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun SettingDialog(
    show: Boolean = false,
    settingUiState: SettingUiState,
    setSetting: (SettingUiState) -> Unit = {},
    onDismissRequest: () -> Unit = {},
    //  setLanguage: (Int) -> Unit = {},
) {
    AnimatedVisibility(visible = show) {
        DialogUi(
            modifier = Modifier.padding(vertical = Base2),
            onDismissRequest = onDismissRequest,
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
//                        SettingItem2(title = R.string.language) { modi ->
//                            ExposeBox(
//                                modifier = modi,
//                                current = basic.language,
//                                onValueChange = {
//                                    basicSettingChange(basic.copy(language = it))
//                                    setLanguage(it)
//                                },
//                                stringArrayRes = R.array.language,
//                            )
//                        }
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
                        //            SettingItem(title = R.string.count) { modifier ->
                        //                Switch(modifier = modifier, checked = basic.directCount, onCheckedChange = {
                        //                    basicSettingChange(basic.copy(directCount = it))
                        //                })
                        //            }
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
            properties = DialogProperties(),
        )
    }
}
//
// @Preview(device = "spec:width=1280dp,height=800dp,dpi=480")
// @Composable
// fun DialogSettingPreview() {
//    LudoAppTheme {
//        Column(Modifier.fillMaxSize()) {
//            SettingDialog(
//                show = true,
//                settingUiState = SettingUiState(
//                    language = 0,
//                    gameLevel = 0,
//                    assistant = false,
//                    boardType = 0,
//                    boardStyle = 0,
//                    pawnNumber = 0,
//                    rotate = false,
//                    sound = false,
//                    music = false,
//                    musicType = 0,
//                )
//
//            )
//        }
//    }
// }

@Composable
fun Title(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.titleMedium,
        color = MaterialTheme.colorScheme.primary,
    )
}
//
// @Preview
// @Composable
// fun TitlePreview() {
//    Title(title = "Basic Setting")
// }

@Composable
fun SettingContainer(modifier: Modifier = Modifier, content: @Composable ColumnScope.() -> Unit) {
    OutlinedCard(modifier.fillMaxWidth()) {
        Column(Modifier.padding(Base2)) {
            content()
        }
    }
}

// @Preview
// @Composable
// fun SettingContainerPreview() {
//    SettingContainer {
//        SettingItem(title = R.string.player_name) {
//            OutlinedTextField(value = "", onValueChange = {})
//        }
//        Title(title = "second")
//    }
// }

@Composable
fun SettingItem(title: StringResource, content: @Composable RowScope.(Modifier) -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            modifier = Modifier.weight(1f),
            text = stringResource(title),
        )

        content(
            Modifier,
        )
    }
}

@Composable
fun SettingItem2(title: StringResource, content: @Composable RowScope.(Modifier) -> Unit) {
    SettingItem(title = title) {
        content(Modifier.weight(0.9f))
    }
}
//
// @Preview(showBackground = true)
// @Composable
// fun SettingItemPreview() {
//    SettingItem(title = R.string.assistant) {
//        Switch(checked = true, onCheckedChange = {})
//    }
// }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExposeBox(
    modifier: Modifier = Modifier,
    current: Int,
    onValueChange: (Int) -> Unit,
    stringArrayRes: StringArrayResource,
) {
    var expanded by remember {
        mutableStateOf(false)
    }
    val options = stringArrayResource(stringArrayRes)
    val curr = if (current >= options.size) options.lastIndex else current

    ExposedDropdownMenuBox(
        modifier = modifier,
        expanded = expanded,
        onExpandedChange = { expanded = !expanded },
    ) {
        TextField(
            modifier = Modifier.menuAnchor(),
            readOnly = true,
            value = options[curr],
            onValueChange = {},
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
            colors = ExposedDropdownMenuDefaults.textFieldColors(),
            singleLine = true,

        )
        ExposedDropdownMenu(expanded = expanded, onDismissRequest = {
            expanded = false
        }) {
            options.forEachIndexed { index, string ->
                DropdownMenuItem(
                    text = { Text(text = string) },
                    onClick = {
                        onValueChange(index)
                        expanded = false
                    },
                )
            }
        }
    }
}
