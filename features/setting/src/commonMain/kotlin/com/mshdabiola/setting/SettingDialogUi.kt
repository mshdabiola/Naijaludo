package com.mshdabiola.setting

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.mshdabiola.designsystem.string.Dimensions.Base2
import naijaludo.features.setting.generated.resources.style
import org.jetbrains.compose.resources.StringArrayResource
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringArrayResource
import org.jetbrains.compose.resources.stringResource

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
