package com.mshdabiola.gamescreen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

@Composable
fun UnCancelableDialog(
    modifier: Modifier = Modifier,
    title: String,
    containerColor: Color = MaterialTheme.colorScheme.primary,
    properties: DialogProperties = DialogProperties(
        dismissOnBackPress = false,
        dismissOnClickOutside = true
    ),
    content: @Composable ColumnScope.() -> Unit
) {
    DialogUi(
        modifier = modifier,
        onDismissRequest = { },
        title = { Text(text = title) },
        content = content,
        containerColor = containerColor,
        properties = properties
    )
}

@Composable
fun DialogUi(
    onDismissRequest: () -> Unit,
    buttons: (@Composable RowScope.() -> Unit)? = null,
    modifier: Modifier = Modifier,
    cancelIcon: (@Composable () -> Unit)? = null,
    title: @Composable (RowScope.() -> Unit)? = null,
    content: (@Composable ColumnScope.() -> Unit)? = null,
    shape: Shape = AlertDialogDefaults.shape,
    containerColor: Color = AlertDialogDefaults.containerColor,
    tonalElevation: Dp = AlertDialogDefaults.TonalElevation,
    properties: DialogProperties = DialogProperties()
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = properties
    ) {
        DialogContent(
            buttons = buttons,
            modifier = modifier,
            cancelIcon = cancelIcon,
            title = title,
            content = content,
            shape = shape,
            containerColor = containerColor,
            tonalElevation = tonalElevation,
        )
    }
}

@Preview
@Composable
fun DialogUiPreview() {
    DialogUi(
        onDismissRequest = { /*TODO*/ },
        title = { Text(text = "Title") },
        cancelIcon = {
            FilledIconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "add",
                    modifier = Modifier.rotate(45f)
                )
            }
        },
        content = {
            Button(onClick = { }) {
                Text(text = "Button1")
            }
            Button(onClick = { }) {
                Text(text = "Button1")
            }
            Button(onClick = { }) {
                Text(text = "Button1")
            }
        },
        buttons = {
            Button(onClick = { }) {
                Text(text = "Buttons")
            }
            Button(onClick = { }) {
                Text(text = "Buttons")
            }
        },
        containerColor = Color.Blue

    )
}

@Composable
fun DialogContent(
    buttons: (@Composable RowScope.() -> Unit)?,
    modifier: Modifier = Modifier,
    cancelIcon: (@Composable () -> Unit)?,
    title: (@Composable RowScope.() -> Unit)?,
    content: (@Composable ColumnScope.() -> Unit)?,
    shape: Shape,
    containerColor: Color,
    tonalElevation: Dp,
) {

    Surface(
        modifier = modifier,
        shape = shape,
        color = Color.Transparent,
        tonalElevation = tonalElevation
    ) {
        Column(
            modifier = Modifier
                .drawBehind {
                    drawRect(Color.White)
                    drawRect(
                        Brush.verticalGradient(
                            0.0f to containerColor.copy(alpha = 0.6f),
                            size.height * 0.5f to containerColor,
                            tileMode = TileMode.Mirror

                        )
                    )
                }
                .sizeIn(minWidth = MinWidth, maxWidth = MaxWidth)
                .padding(DialogPadding)
        ) {
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                title?.let {

                    val textStyle = MaterialTheme.typography.headlineSmall
                    ProvideTextStyle(textStyle) {
                        Row(
                            // Align the title to the center when an icon is present.
                            Modifier
                                .padding(TitlePadding)
                                .weight(1f, fill = true),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            title()
                        }
                    }
                }

                cancelIcon?.let {
                    Box(
                        modifier = Modifier
                            .padding(IconPadding)
                            .align(Alignment.CenterVertically)
                    ) {
                        cancelIcon()
                    }
                }
            }

            content?.let {
                Column(
                    Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(MaterialTheme.colorScheme.background)
                        .weight(1f, fill = false)
                        .padding(TextPadding)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    content()
                }
            }

            buttons?.let {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally),
                    horizontalArrangement = Arrangement.SpaceAround

                ) {
                    buttons()
                }
            }
        }
    }
}

private val DialogPadding = PaddingValues(all = 24.dp)
private val IconPadding = PaddingValues(bottom = 16.dp)
private val TitlePadding = PaddingValues(bottom = 16.dp)
private val TextPadding = PaddingValues(all = 24.dp)

private val MinWidth = 280.dp
private val MaxWidth = 560.dp
