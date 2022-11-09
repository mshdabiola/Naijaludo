package com.mshdabiola.mainscreen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import androidx.constraintlayout.compose.ConstraintLayout
import com.mshdabiola.designsystem.component.DialogUi
import com.mshdabiola.designsystem.theme.LudoAppTheme
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingScreen(
    basic: Basic,
    sound: Sound,
    profile: Profile,
    board: Board,
    basicSettingChange: (Basic) -> Unit = {},
    soundSettingChange: (Sound) -> Unit = {},
    profileSettingChange: (Profile) -> Unit = {},
    boardSettingChange: (Board) -> Unit = {}
) {
    val scroll = rememberScrollState()

    Column(
        modifier = Modifier
            .verticalScroll(scroll)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Title(title = "Basic Setting")
        SettingContainer {
            SettingItem(title = "Language") { modi ->
                ExposeBox(
                    modifier = modi, current = basic.currentLanguage,
                    onValueChane = {
                        val index = basic.languageOptions.indexOf(it)
                        basicSettingChange(basic.copy(language = index))
                    },
                    options = basic.languageOptions.toImmutableList()
                )
            }
            SettingItem(title = "Game Level") { modifier ->
                ExposeBox(
                    modifier = modifier,
                    current = basic.currentLevel,
                    onValueChane = {
                        val index = basic.gameLevelOptions.indexOf(it)
                        basicSettingChange(basic.copy(gameLevel = index))
                    },
                    options = basic.gameLevelOptions.toImmutableList()
                )
            }
            SettingItem(title = "Direct Count") { modifier ->
                Switch(modifier = modifier, checked = basic.directCount, onCheckedChange = {
                    basicSettingChange(basic.copy(directCount = it))
                })
            }
            SettingItem(title = "Assistant") { modifier ->
                Switch(modifier = modifier, checked = basic.assistant, onCheckedChange = {
                    basicSettingChange(basic.copy(assistant = it))
                })
            }
        }
        Title(title = "Sound Setting")
        SettingContainer {
            SettingItem(title = "Sound") { modifier ->
                Switch(modifier = modifier, checked = sound.sound, onCheckedChange = {
                    soundSettingChange(sound.copy(sound = it))
                })
            }
            SettingItem(title = "Music") { modifier ->
                Switch(modifier = modifier, checked = sound.music, onCheckedChange = {
                    soundSettingChange(sound.copy(music = it))
                })
            }
        }
        Title(title = "Profile Setting")
        SettingContainer {
            SettingItem(title = "Player name") { modifier ->
                MyTextField(
                    modifier = modifier,
                    current = profile.playerName,
                    onValueChange = {
                        profileSettingChange(profile.copy(playerName = it))
                    }
                )
            }
            SettingItem(title = "Robot one") { modifier ->
                MyTextField(
                    modifier = modifier,
                    current = profile.computer1,
                    onValueChange = {
                        profileSettingChange(profile.copy(computer1 = it))
                    }
                )
            }
            SettingItem(title = "Robot two") { modifier ->
                MyTextField(
                    modifier = modifier,
                    current = profile.computer2,
                    onValueChange = {
                        profileSettingChange(profile.copy(computer2 = it))
                    }
                )
            }
            SettingItem(title = "Robot three") { modifier ->
                MyTextField(
                    modifier = modifier,
                    current = profile.computer3,
                    onValueChange = {
                        profileSettingChange(profile.copy(computer3 = it))
                    }
                )
            }
        }
        Title(title = "Board Setting")
        SettingContainer {
            SettingItem(title = "Board Style") { modi ->
                ExposeBox(
                    modifier = modi, current = board.currentStyle,
                    onValueChane = {
                        val index = board.styleOptions.indexOf(it)
                        boardSettingChange(board.copy(boardStyle = index))
                    },
                    options = board.styleOptions.toImmutableList()
                )
            }
            SettingItem(title = "Board Type") { modi ->
                ExposeBox(
                    modifier = modi, current = board.currentType,
                    onValueChane = {
                        val index = board.typeOptions.indexOf(it)
                        boardSettingChange(board.copy(boardType = index))
                    },
                    options = board.typeOptions.toImmutableList()
                )
            }
            SettingItem(title = "Pawn Number") { modi ->

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
            SettingItem(title = "Rotate") { modifier ->
                Switch(modifier = modifier, checked = board.rotate, onCheckedChange = {
                    boardSettingChange(board.copy(rotate = it))
                })
            }
        }
    }
}

@Composable
fun SettingDialog(
    show: Boolean = true,
    basic: Basic,
    sound: Sound,
    profile: Profile,
    board: Board,
    onDismissRequest: () -> Unit = {},
    basicSettingChange: (Basic) -> Unit = {},
    soundSettingChange: (Sound) -> Unit = {},
    profileSettingChange: (Profile) -> Unit = {},
    boardSettingChange: (Board) -> Unit = {}
) {
    AnimatedVisibility(visible = show) {
        DialogUi(
            modifier = Modifier.padding(vertical = 16.dp),
            onDismissRequest = onDismissRequest,
            content = {
                SettingScreen(
                    basic = basic,
                    sound = sound,
                    profile = profile,
                    board = board,
                    basicSettingChange = basicSettingChange,
                    soundSettingChange = soundSettingChange,
                    profileSettingChange = profileSettingChange,
                    boardSettingChange = boardSettingChange
                )
            },
            properties = DialogProperties()
        )
    }
}

@Preview()
@Composable
fun SettScreenPreview() {
    SettingScreen(
        basic = Basic(),
        sound = Sound(),
        profile = Profile(),
        board = Board()
    )
}

@Preview()
@Composable
fun DialogSettingPreview() {
    LudoAppTheme {

        Column(Modifier.fillMaxSize()) {
            SettingDialog(
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
        style = MaterialTheme.typography.headlineMedium,
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
        SettingItem(title = "Player name") {
            OutlinedTextField(value = "", onValueChange = {})
        }
        Title(title = "second")
    }
}

@Composable
fun SettingItem(title: String, content: @Composable (Modifier) -> Unit) {
    ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
        val (titleRef, contentRef) = createRefs()

        Text(
            modifier = Modifier.constrainAs(titleRef) {
                linkTo(parent.top, parent.bottom)
                start.linkTo(parent.start)
            },
            text = title
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
    SettingItem(title = "Assistant") {
        Switch(checked = true, onCheckedChange = {})
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExposeBox(
    modifier: Modifier = Modifier,
    current: String,
    onValueChane: (String) -> Unit,
    options: ImmutableList<String>
) {

    var expanded by remember {
        mutableStateOf(false)
    }

    ExposedDropdownMenuBox(
        modifier = modifier.widthIn(50.dp, 130.dp),
        expanded = expanded,
        onExpandedChange = { expanded = !expanded }
    ) {
        TextField(
            modifier = Modifier.menuAnchor(),
            readOnly = true,
            value = current,
            onValueChange = {},
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
            colors = ExposedDropdownMenuDefaults.textFieldColors(),
            singleLine = true

        )
        ExposedDropdownMenu(expanded = expanded, onDismissRequest = {
            expanded = false
        }) {
            options.forEach {
                DropdownMenuItem(
                    text = { Text(text = it) },
                    onClick = {
                        onValueChane(it)
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
        mutableStateOf(options[3])
    }
    ExposeBox(current = curr, onValueChane = { curr = it }, options = options.toImmutableList())
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
        onValueChange = onValueChange
    )
}

@Preview
@Composable
fun MyTextFieldPreview() {
    MyTextField(current = "Abiola", onValueChange = {})
}
