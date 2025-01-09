package com.mshdabiola.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

@Composable
fun DialogUi(
    modifier: Modifier = Modifier,
    onDismissRequest: () -> Unit,
    buttons: (@Composable RowScope.() -> Unit)? = null,
    cancelIcon: (@Composable () -> Unit)? = null,
    title: @Composable (RowScope.() -> Unit)? = null,
    content: (@Composable ColumnScope.() -> Unit)? = null,
    shape: Shape = AlertDialogDefaults.shape,
    containerColor: Color = MaterialTheme.colorScheme.inversePrimary,
    tonalElevation: Dp = AlertDialogDefaults.TonalElevation,
    properties: DialogProperties = DialogProperties(),
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = properties,
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

@Composable
fun DialogUi(
    modifier: Modifier = Modifier,
    buttons: (@Composable RowScope.() -> Unit)? = null,
    cancelIcon: (@Composable () -> Unit)? = null,
    title: @Composable (RowScope.() -> Unit)? = null,
    content: (@Composable ColumnScope.() -> Unit)? = null,
    shape: Shape = AlertDialogDefaults.shape,
    containerColor: Color = MaterialTheme.colorScheme.inversePrimary,
    tonalElevation: Dp = AlertDialogDefaults.TonalElevation,
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
//
// @Preview
// @Composable
// fun DialogUiPreview() {
//    DialogUi(
//        onDismissRequest = { },
//        title = { Text(text = "Title", color = MaterialTheme.colorScheme.onPrimary) },
//        cancelIcon = {
//            FilledIconButton(onClick = { }) {
//                Icon(
//                    imageVector = Icons.Default.Add,
//                    contentDescription = "add",
//                    modifier = Modifier.rotate(45f),
//                )
//            }
//        },
//        content = {
//            Button(onClick = { }) {
//                Text(text = "Button1")
//            }
//            Button(onClick = { }) {
//                Text(text = "Button1")
//            }
//            Button(onClick = { }) {
//                Text(text = "Button1")
//            }
//        },
//        buttons = {
//            Button(onClick = { }) {
//                Text(text = "Buttons")
//            }
//            Button(onClick = { }) {
//                Text(text = "Buttons")
//            }
//        },
//        //containerColor = Color.Blue,
//
//        )
// }

@Composable
fun DialogUi2(
    modifier: Modifier = Modifier,
    onDismissRequest: () -> Unit,
    buttons: (@Composable RowScope.() -> Unit)? = null,
    cancelIcon: (@Composable () -> Unit)? = null,
    title: @Composable (RowScope.() -> Unit)? = null,
    content: (@Composable ColumnScope.() -> Unit)? = null,
    shape: Shape = AlertDialogDefaults.shape,
    containerColor: Color = AlertDialogDefaults.containerColor,
    tonalElevation: Dp = AlertDialogDefaults.TonalElevation,
    properties: DialogProperties = DialogProperties(),
    enableScroll: Boolean = true,
) {
//    Dialog(
//        onDismissRequest = onDismissRequest,
//        properties = properties
//    ) {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        DialogContent2(
            buttons = buttons,
            modifier = modifier,
            cancelIcon = cancelIcon,
            title = title,
            content = content,
            shape = shape,
            containerColor = containerColor,
            tonalElevation = tonalElevation,
            enableScroll = enableScroll,
        )
    }

//    }
}

@Composable
fun DialogContent2(
    buttons: (@Composable RowScope.() -> Unit)?,
    modifier: Modifier = Modifier,
    cancelIcon: (@Composable () -> Unit)?,
    title: (@Composable RowScope.() -> Unit)?,
    content: (@Composable ColumnScope.() -> Unit)?,
    shape: Shape,
    containerColor: Color,
    tonalElevation: Dp,
    enableScroll: Boolean,
) {
    Surface(
        modifier = modifier
            .sizeIn(
                minWidth = MinWidth,
                maxWidth = MaxWidth,
                maxHeight = MaxWidth,
            )
            .drawBehind {
                drawRect(Color.White)
                drawRect(
                    Brush.verticalGradient(
                        0.0f to containerColor,
                        size.height * 0.5f to containerColor.copy(alpha = 0.6f),
                        tileMode = TileMode.Mirror,

                    ),
                )
            },
        shape = shape,
        color = Color.Transparent,
        tonalElevation = tonalElevation,
    ) {
        Column(
            modifier = Modifier
                .padding(DialogPadding),
        ) {
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                title?.let {
                    val textStyle = MaterialTheme.typography.headlineSmall
                    ProvideTextStyle(textStyle) {
                        Row(
                            // Align the title to the center when an icon is present.
                            Modifier
                                .padding(TitlePadding)
                                .weight(1f, fill = true),
                            horizontalArrangement = Arrangement.Center,
                        ) {
                            title()
                        }
                    }
                }

                cancelIcon?.let {
                    Box(
                        modifier = Modifier
                            .padding(IconPadding)
                            .align(Alignment.CenterVertically),
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
                        .verticalScroll(state = rememberScrollState(), enabled = enableScroll)
                        // /  .padding(TextPadding)
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,

                ) {
                    content()
                }
            }

            buttons?.let {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally),
                    horizontalArrangement = Arrangement.SpaceAround,

                ) {
                    buttons()
                }
            }
        }
    }
}
//
// @Preview
// @Composable
// fun DialogUiPreview2() {
//    DialogUi2(
//        onDismissRequest = { },
//        title = { Text(text = "Title", color = MaterialTheme.colorScheme.onPrimary) },
//        cancelIcon = {
//            FilledIconButton(onClick = { }) {
//                Icon(
//                    imageVector = Icons.Default.Add,
//                    contentDescription = "add",
//                    modifier = Modifier.rotate(45f),
//                )
//            }
//        },
//        content = {
//            Button(onClick = { }) {
//                Text(text = "Button1")
//            }
//            Button(onClick = { }) {
//                Text(text = "Button1")
//            }
//            Button(onClick = { }) {
//                Text(text = "Button1")
//            }
//        },
//        buttons = {
//            Button(onClick = { }) {
//                Text(text = "Buttons")
//            }
//            Button(onClick = { }) {
//                Text(text = "Buttons")
//            }
//        },
//      //  containerColor = Color.Blue,
//
//        )
// }

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
        tonalElevation = tonalElevation,
    ) {
        Column(
            modifier = Modifier
                .drawBehind {
                    drawRect(Color.White)
                    drawRect(
                        Brush.verticalGradient(
                            0.0f to containerColor,
                            size.height * 0.5f to containerColor.copy(alpha = 0.6f),
                            tileMode = TileMode.Mirror,

                        ),
                    )
                }
                .sizeIn(
                    minWidth = MinWidth,
                    maxWidth = MaxWidth,
                    maxHeight = MaxWidth,
                )
                .padding(DialogPadding),
        ) {
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                title?.let {
                    val textStyle = MaterialTheme
                        .typography
                        .headlineSmall
                        .copy(color = MaterialTheme.colorScheme.primary)
                    ProvideTextStyle(textStyle) {
                        Row(
                            // Align the title to the center when an icon is present.
                            Modifier
                                .padding(TitlePadding)
                                .weight(1f, fill = true),
                            horizontalArrangement = Arrangement.Center,
                        ) {
                            title()
                        }
                    }
                }

                cancelIcon?.let {
                    Box(
                        modifier = Modifier
                            .padding(IconPadding)
                            .align(Alignment.CenterVertically),
                    ) {
                        cancelIcon()
                    }
                }
            }

            content?.let {
                Column(
                    Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .weight(1f, fill = true)
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                ) {
                    content()
                }
            }

            buttons?.let {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally),
                    horizontalArrangement = Arrangement.SpaceAround,

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
// private val TextPadding = PaddingValues(all = 24.dp)

private val MinWidth = 280.dp
private val MaxWidth = 560.dp
