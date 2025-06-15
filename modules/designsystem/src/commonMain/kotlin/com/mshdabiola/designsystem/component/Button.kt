/*
 *abiola 2024
 */

package com.mshdabiola.designsystem.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.icon.LudoIcons
import com.mshdabiola.designsystem.theme.LudoTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun LudoButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    content: @Composable RowScope.() -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors =
            ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.onBackground,
            ),
        contentPadding = contentPadding,
        content = content,
    )
}

/**
 * Now in Android filled button with text and icon content slots.
 *
 * @param onClick Will be called when the user clicks the button.
 * @param modifier Modifier to be applied to the button.
 * @param enabled Controls the enabled state of the button. When `false`, this button will not be
 * clickable and will appear disabled to accessibility services.
 * @param text The button text label content.
 * @param leadingIcon The button leading icon content. Pass `null` here for no leading icon.
 */
@Composable
fun LudoButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    text: @Composable () -> Unit,
    leadingIcon: @Composable (() -> Unit)? = null,
) {
    LudoButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        contentPadding =
            if (leadingIcon != null) {
                ButtonDefaults.ButtonWithIconContentPadding
            } else {
                ButtonDefaults.ContentPadding
            },
    ) {
        LudoButtonContent(
            text = text,
            leadingIcon = leadingIcon,
        )
    }
}

/**
 * Now in Android outlined button with generic content slot. Wraps Material 3 [OutlinedButton].
 *
 * @param onClick Will be called when the user clicks the button.
 * @param modifier Modifier to be applied to the button.
 * @param enabled Controls the enabled state of the button. When `false`, this button will not be
 * clickable and will appear disabled to accessibility services.
 * @param contentPadding The spacing values to apply internally between the container and the
 * content.
 * @param content The button content.
 */
@Composable
fun LudoOutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    content: @Composable RowScope.() -> Unit,
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors =
            ButtonDefaults.outlinedButtonColors(
                contentColor = MaterialTheme.colorScheme.onBackground,
            ),
        border =
            BorderStroke(
                width = LudoButtonDefaults.OutlinedButtonBorderWidth,
                color =
                    if (enabled) {
                        MaterialTheme.colorScheme.outline
                    } else {
                        MaterialTheme.colorScheme.onSurface.copy(
                            alpha = LudoButtonDefaults.DISABLED_OUTLINED_BUTTON_BORDER_ALPHA,
                        )
                    },
            ),
        contentPadding = contentPadding,
        content = content,
    )
}

/**
 * Now in Android outlined button with text and icon content slots.
 *
 * @param onClick Will be called when the user clicks the button.
 * @param modifier Modifier to be applied to the button.
 * @param enabled Controls the enabled state of the button. When `false`, this button will not be
 * clickable and will appear disabled to accessibility services.
 * @param text The button text label content.
 * @param leadingIcon The button leading icon content. Pass `null` here for no leading icon.
 */
@Composable
fun LudoOutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    text: @Composable () -> Unit,
    leadingIcon: @Composable (() -> Unit)? = null,
) {
    LudoOutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        contentPadding =
            if (leadingIcon != null) {
                ButtonDefaults.ButtonWithIconContentPadding
            } else {
                ButtonDefaults.ContentPadding
            },
    ) {
        LudoButtonContent(
            text = text,
            leadingIcon = leadingIcon,
        )
    }
}

/**
 * Now in Android text button with generic content slot. Wraps Material 3 [TextButton].
 *
 * @param onClick Will be called when the user clicks the button.
 * @param modifier Modifier to be applied to the button.
 * @param enabled Controls the enabled state of the button. When `false`, this button will not be
 * clickable and will appear disabled to accessibility services.
 * @param content The button content.
 */
@Composable
fun LudoTextButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    content: @Composable RowScope.() -> Unit,
) {
    TextButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors =
            ButtonDefaults.textButtonColors(
                contentColor = MaterialTheme.colorScheme.onBackground,
            ),
        content = content,
    )
}

/**
 * Now in Android text button with text and icon content slots.
 *
 * @param onClick Will be called when the user clicks the button.
 * @param modifier Modifier to be applied to the button.
 * @param enabled Controls the enabled state of the button. When `false`, this button will not be
 * clickable and will appear disabled to accessibility services.
 * @param text The button text label content.
 * @param leadingIcon The button leading icon content. Pass `null` here for no leading icon.
 */
@Composable
fun LudoTextButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    text: @Composable () -> Unit,
    leadingIcon: @Composable (() -> Unit)? = null,
) {
    LudoTextButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
    ) {
        LudoButtonContent(
            text = text,
            leadingIcon = leadingIcon,
        )
    }
}

/**
 * Internal Now in Android button content layout for arranging the text label and leading icon.
 *
 * @param text The button text label content.
 * @param leadingIcon The button leading icon content. Default is `null` for no leading icon.Ï
 */
@Composable
private fun LudoButtonContent(
    text: @Composable () -> Unit,
    leadingIcon: @Composable (() -> Unit)? = null,
) {
    if (leadingIcon != null) {
        Box(Modifier.sizeIn(maxHeight = ButtonDefaults.IconSize)) {
            leadingIcon()
        }
    }
    Box(
        Modifier
            .padding(
                start =
                    if (leadingIcon != null) {
                        ButtonDefaults.IconSpacing
                    } else {
                        0.dp
                    },
            ),
    ) {
        text()
    }
}

@Preview
@Composable
fun LudoButtonPreview() {
    LudoTheme {
        LudoBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            LudoButton(onClick = {}, text = { Text("Test button") })
        }
    }
}

@Preview
@Composable
fun LudoOutlinedButtonPreview() {
    LudoTheme {
        LudoBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            LudoOutlinedButton(onClick = {}, text = { Text("Test button") })
        }
    }
}

@Preview
@Composable
fun LudoButtonLeadingIconPreview() {
    LudoTheme {
        LudoBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            LudoButton(
                onClick = {},
                text = { Text("Test button") },
                leadingIcon = { Icon(imageVector = LudoIcons.Add, contentDescription = null) },
            )
        }
    }
}

/**
 * Now in Android button default values.
 */
object LudoButtonDefaults {
    // OutlinedButton border color doesn't respect disabled state by default
    const val DISABLED_OUTLINED_BUTTON_BORDER_ALPHA = 0.12f

    // OutlinedButton default border width isn't exposed via ButtonDefaults
    val OutlinedButtonBorderWidth = 1.dp
}
