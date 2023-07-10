package com.mshdabiola.ludo.screen.main

import androidx.annotation.ArrayRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.window.DialogProperties
import com.mshdabiola.designsystem.R
import com.mshdabiola.designsystem.component.DialogUi
import com.mshdabiola.designsystem.theme.LudoAppTheme
import kotlinx.collections.immutable.toImmutableList

@Composable
fun SettingDialog(
    show: Boolean = false,
    settingUiState: SettingUiState= SettingUiState(),
    setSetting:(SettingUiState)->Unit={},
    onDismissRequest: () -> Unit = {},
    //  setLanguage: (Int) -> Unit = {},
) {
    AnimatedVisibility(visible = show) {
        DialogUi(
            modifier = Modifier.padding(vertical = dimensionResource(id = R.dimen.base_2)),
            onDismissRequest = onDismissRequest,
            title = { Text(text = stringResource(id = R.string.game_setting)) },
            cancelIcon = {
                IconButton(onClick = onDismissRequest) {
                    Icon(
                        imageVector = Icons.Default.Clear,
                        contentDescription = stringResource(id = R.string.close),
                    )
                }
            },
            content = {
                Column(
                    modifier = Modifier.verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally,

                    ) {
                    Title(title = stringResource(id = R.string.basic_setting))
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
                        SettingItem2(title = R.string.level) { modifier ->
                            ExposeBox(
                                modifier = modifier,
                                current = settingUiState.gameLevel,
                                onValueChange = {
                                   setSetting(settingUiState.copy(gameLevel = it))
                                },
                                stringArrayRes = R.array.level,
                            )
                        }
                        //            SettingItem(title = R.string.count) { modifier ->
                        //                Switch(modifier = modifier, checked = basic.directCount, onCheckedChange = {
                        //                    basicSettingChange(basic.copy(directCount = it))
                        //                })
                        //            }
                        SettingItem(title = R.string.assistant) { modifier ->
                            Switch(
                                modifier = modifier,
                                checked = settingUiState.assistant,
                                onCheckedChange = {
                                    setSetting(settingUiState.copy(assistant = it))
                                },
                            )
                        }
                    }
                    Title(title = stringResource(id = R.string.sound_setting))
                    SettingContainer {
                        SettingItem(title = R.string.sound) { modifier ->
                            Switch(modifier = modifier, checked = settingUiState.sound, onCheckedChange = {
                                setSetting(settingUiState.copy(sound = it))
                            })
                        }
                        SettingItem(title = R.string.music) { modifier ->
                            Switch(modifier = modifier, checked = settingUiState.music, onCheckedChange = {
                                setSetting(settingUiState.copy(music = it))
                            })
                        }
                    }
                    Title(title = stringResource(id = R.string.profile_setting))
                    SettingContainer {
                        SettingItem2(title = R.string.player_name) { modifier ->
                            MyTextField(
                                modifier = modifier,
                                current = settingUiState.playerName[0],
                                onValueChange = {
                                    val players=settingUiState.playerName.toMutableList()
                                    players[0]=it
                                    setSetting(settingUiState.copy(playerName = players.toImmutableList()))
                                },
                            )
                        }
                        SettingItem2(title = R.string.robot_one) { modifier ->
                            MyTextField(
                                modifier = modifier,
                                current = settingUiState.playerName[1],
                                onValueChange = {
                                    val players=settingUiState.playerName.toMutableList()
                                    players[1]=it
                                    setSetting(settingUiState.copy(playerName = players.toImmutableList()))
                                },
                            )
                        }
                        SettingItem2(title = R.string.robot_two) { modifier ->
                            MyTextField(
                                modifier = modifier,
                                current = settingUiState.playerName[2],
                                onValueChange = {
                                    val players=settingUiState.playerName.toMutableList()
                                    players[2]=it
                                    setSetting(settingUiState.copy(playerName = players.toImmutableList()))
                                },
                            )
                        }
                        SettingItem2(title = R.string.robot_three) { modifier ->
                            MyTextField(
                                modifier = modifier,
                                current = settingUiState.playerName[3],
                                onValueChange = {
                                    val players=settingUiState.playerName.toMutableList()
                                    players[3]=it
                                    setSetting(settingUiState.copy(playerName = players.toImmutableList()))
                                },
                            )
                        }
                    }
                    Title(title = stringResource(id = R.string.board_setting))
                    SettingContainer {
                        SettingItem2(title = R.string.style) { modi ->
                            ExposeBox(
                                modifier = modi,
                                current = settingUiState.boardStyle,
                                onValueChange = {
                                    setSetting(settingUiState.copy(boardStyle = it))
                                },
                                stringArrayRes = R.array.board_style,
                            )
                        }
                        SettingItem2(title = R.string.type) { modi ->
                            ExposeBox(
                                modifier = modi,
                                current = settingUiState.boardType,
                                onValueChange = {
                                    setSetting(settingUiState.copy(boardType = it))
                                },
                                stringArrayRes = R.array.board_type,
                            )
                        }
                        SettingItem(title = R.string.pawn_num) { modi ->
                            val value = stringArrayResource(id = R.array.pawn_number)
                            ExposeBox(
                                modifier = modi.weight(0.5f),
                                current = value.indexOfFirst { it == "${settingUiState.pawnNumber}" },
                                onValueChange = {
                                    setSetting(settingUiState.copy(pawnNumber = value[it].toInt()))
                                },
                                stringArrayRes = R.array.pawn_number,
                            )

                            //
                        }
                        SettingItem(title = R.string.rotate) { modifier ->
                            Switch(modifier = modifier, checked = settingUiState.rotate, onCheckedChange = {
                                setSetting(settingUiState.copy(rotate = it))
                            })
                        }
                    }
                }
            },
            properties = DialogProperties(),
        )
    }
}

@Preview(device = "spec:width=1280dp,height=800dp,dpi=480")
@Composable
fun DialogSettingPreview() {
    LudoAppTheme {
        Column(Modifier.fillMaxSize()) {
            SettingDialog(
                show = true,

            )
        }
    }
}

@Composable
fun Title(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.titleMedium,
        color = MaterialTheme.colorScheme.primary,
    )
}

@Preview
@Composable
fun TitlePreview() {
    Title(title = "Basic Setting")
}

@Composable
fun SettingContainer(modifier: Modifier = Modifier, content: @Composable ColumnScope.() -> Unit) {
    OutlinedCard(modifier.fillMaxWidth()) {
        Column(Modifier.padding(dimensionResource(id = R.dimen.base_2))) {
            content()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun SettingContainerPreview() {
    SettingContainer {
        SettingItem(title = R.string.player_name) {
            OutlinedTextField(value = "", onValueChange = {})
        }
        Title(title = "second")
    }
}

@Composable
fun SettingItem(title: Int, content: @Composable RowScope.(Modifier) -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            modifier = Modifier.weight(1f),
            text = stringResource(id = title),
        )

        content(
            Modifier,
        )
    }
}

@Composable
fun SettingItem2(title: Int, content: @Composable RowScope.(Modifier) -> Unit) {
    SettingItem(title = title) {
        content(Modifier.weight(0.9f))
    }
}

@Preview(showBackground = true)
@Composable
fun SettingItemPreview() {
    SettingItem(title = R.string.assistant) {
        Switch(checked = true, onCheckedChange = {})
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExposeBox(
    modifier: Modifier = Modifier,
    current: Int,
    onValueChange: (Int) -> Unit,
    @ArrayRes stringArrayRes: Int,
) {
    var expanded by remember {
        mutableStateOf(false)
    }
    val options = stringArrayResource(id = stringArrayRes)
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

//@Preview
//@Composable
//fun ExposeBoxPreview() {
//// Column(modifier=Modifier.fillMaxSize()) {
//    // val options = (1..6).map { " Item $it" }
//
//    var curr by remember {
//        mutableStateOf(1)
//    }
//    ExposeBox(current = curr, onValueChange = { curr = 0 }, stringArrayRes = R.array.language)
//// }
//}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField(
    modifier: Modifier = Modifier,
    current: String,
    onValueChange: (String) -> Unit,
) {
    TextField(
        modifier = modifier,
        value = current,
        onValueChange = onValueChange,
        singleLine = true,
    )
}

@Preview
@Composable
fun MyTextFieldPreview() {
    MyTextField(current = "Abiola slsldi sldi", onValueChange = {})
}
