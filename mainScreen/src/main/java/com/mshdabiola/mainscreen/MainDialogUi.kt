package com.mshdabiola.mainscreen

import androidx.annotation.ArrayRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
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
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import androidx.constraintlayout.compose.ConstraintLayout
import com.mshdabiola.designsystem.R
import com.mshdabiola.designsystem.component.DialogUi
import com.mshdabiola.designsystem.theme.LudoAppTheme

@Composable
fun SettingDialog(
    show: Boolean = false,
    basic: Basic,
    sound: Sound,
    profile: Profile,
    board: Board,
    onDismissRequest: () -> Unit = {},
    basicSettingChange: (Basic) -> Unit = {},
    soundSettingChange: (Sound) -> Unit = {},
    profileSettingChange: (Profile) -> Unit = {},
    boardSettingChange: (Board) -> Unit = {},
    setLanguage: (Int) -> Unit = {}
) {
    AnimatedVisibility(visible = show) {
        DialogUi(
            modifier = Modifier.padding(vertical = 16.dp),
            onDismissRequest = onDismissRequest,
            title = { Text(text = "Settings") },
            cancelIcon = {
                IconButton(onClick = onDismissRequest) {
                    Icon(imageVector = Icons.Default.Clear, contentDescription = "cancel")
                }
            },
            content = {
                Title(title = "Basic")
                SettingContainer {
                    SettingItem(title = R.string.language) { modi ->
                        ExposeBox(
                            modifier = modi, current = basic.language,
                            onValueChange = {
                                basicSettingChange(basic.copy(language = it))
                                setLanguage(it)
                            },
                            stringArrayRes = R.array.language
                        )
                    }
                    SettingItem(title = R.string.level) { modifier ->
                        ExposeBox(
                            modifier = modifier,
                            current = basic.gameLevel,
                            onValueChange = {

                                basicSettingChange(basic.copy(gameLevel = it))
                            },
                            stringArrayRes = R.array.level
                        )
                    }
//            SettingItem(title = R.string.count) { modifier ->
//                Switch(modifier = modifier, checked = basic.directCount, onCheckedChange = {
//                    basicSettingChange(basic.copy(directCount = it))
//                })
//            }
                    SettingItem(title = R.string.assistant) { modifier ->
                        Switch(modifier = modifier, checked = basic.assistant, onCheckedChange = {
                            basicSettingChange(basic.copy(assistant = it))
                        })
                    }
                }
                Title(title = "Sound")
                SettingContainer {
                    SettingItem(title = R.string.sound) { modifier ->
                        Switch(modifier = modifier, checked = sound.sound, onCheckedChange = {
                            soundSettingChange(sound.copy(sound = it))
                        })
                    }
                    SettingItem(title = R.string.music) { modifier ->
                        Switch(modifier = modifier, checked = sound.music, onCheckedChange = {
                            soundSettingChange(sound.copy(music = it))
                        })
                    }
                }
                Title(title = "Profile")
                SettingContainer {
                    SettingItem(title = R.string.player_name) { modifier ->
                        MyTextField(
                            modifier = modifier,
                            current = profile.playerName,
                            onValueChange = {
                                profileSettingChange(profile.copy(playerName = it))
                            }
                        )
                    }
                    SettingItem(title = R.string.robot_one) { modifier ->
                        MyTextField(
                            modifier = modifier,
                            current = profile.computer1,
                            onValueChange = {
                                profileSettingChange(profile.copy(computer1 = it))
                            }
                        )
                    }
                    SettingItem(title = R.string.robot_two) { modifier ->
                        MyTextField(
                            modifier = modifier,
                            current = profile.computer2,
                            onValueChange = {
                                profileSettingChange(profile.copy(computer2 = it))
                            }
                        )
                    }
                    SettingItem(title = R.string.robot_three) { modifier ->
                        MyTextField(
                            modifier = modifier,
                            current = profile.computer3,
                            onValueChange = {
                                profileSettingChange(profile.copy(computer3 = it))
                            }
                        )
                    }
                }
                Title(title = "Board")
                SettingContainer {
                    SettingItem(title = R.string.style) { modi ->
                        ExposeBox(
                            modifier = modi, current = board.boardStyle,
                            onValueChange = {

                                boardSettingChange(board.copy(boardStyle = it))
                            },
                            stringArrayRes = R.array.board_style
                        )
                    }
                    SettingItem(title = R.string.type) { modi ->
                        ExposeBox(
                            modifier = modi, current = board.boardType,
                            onValueChange = {

                                boardSettingChange(board.copy(boardType = it))
                            },
                            stringArrayRes = R.array.board_type
                        )
                    }
                    SettingItem(title = R.string.pawn_num) { modi ->

                        Slider(
                            value = board.pawnNumber.toFloat(),
                            onValueChange = {
                                boardSettingChange(board.copy(pawnNumber = it.toInt()))
                            },
                            modifier = modi.widthIn(50.dp, 120.dp),
                            valueRange = 2f..4f,
                            steps = 1
                        )
//
                    }
                    SettingItem(title = R.string.rotate) { modifier ->
                        Switch(modifier = modifier, checked = board.rotate, onCheckedChange = {
                            boardSettingChange(board.copy(rotate = it))
                        })
                    }
                }
            },
            properties = DialogProperties()
        )
    }
}

@Preview()
@Composable
fun DialogSettingPreview() {
    LudoAppTheme {

        Column(Modifier.fillMaxSize()) {
            SettingDialog(
                show = true,
                basic = Basic(),
                sound = Sound(),
                profile = Profile(),
                board = Board()
            )
        }
    }
}

@Composable
fun Title(title: String) {

    Text(
        text = title,
        style = MaterialTheme.typography.titleMedium,
        color = MaterialTheme.colorScheme.primary
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
        Column(Modifier.padding(16.dp)) {
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
fun SettingItem(title: Int, content: @Composable (Modifier) -> Unit) {
    ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
        val (titleRef, contentRef) = createRefs()

        Text(
            modifier = Modifier.constrainAs(titleRef) {
                linkTo(parent.top, parent.bottom)
                start.linkTo(parent.start)
            },
            text = stringResource(id = title)
        )

        content(
            Modifier.constrainAs(contentRef) {
                linkTo(parent.top, parent.bottom)
                end.linkTo(parent.end)
            }
        )
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
    @ArrayRes stringArrayRes: Int
) {

    var expanded by remember {
        mutableStateOf(false)
    }
    val options = stringArrayResource(id = stringArrayRes)
    val curr = if (current >= options.size) options.lastIndex else current

    ExposedDropdownMenuBox(
        modifier = modifier.widthIn(50.dp, 130.dp),
        expanded = expanded,
        onExpandedChange = { expanded = !expanded }
    ) {
        TextField(
            modifier = Modifier.menuAnchor(),
            readOnly = true,
            value = options[curr],
            onValueChange = {},
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
            colors = ExposedDropdownMenuDefaults.textFieldColors(),
            singleLine = true

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
                    }
                )
            }
        }
    }
}

@Preview
@Composable
fun ExposeBoxPreview() {
// Column(modifier=Modifier.fillMaxSize()) {
    val options = (1..6).map { " Item $it" }
    var curr by remember {
        mutableStateOf(1)
    }
    ExposeBox(current = curr, onValueChange = { curr = 0 }, stringArrayRes = R.array.language)
// }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField(
    modifier: Modifier = Modifier,
    current: String,
    onValueChange: (String) -> Unit,
) {

    TextField(
        modifier = modifier.widthIn(50.dp, 120.dp),
        value = current,
        onValueChange = onValueChange,
        singleLine = true
    )
}

@Preview
@Composable
fun MyTextFieldPreview() {
    MyTextField(current = "Abiola slsldi sldi", onValueChange = {})
}
