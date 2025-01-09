package com.mshdabiola.designsystem.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
fun GameButton(
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = CircleShape,
    colors: Color = MaterialTheme.colorScheme.primary,
    elevation: Dp = 2.dp,
    border: BorderStroke? = null,
    contentPadding: PaddingValues = PaddingValues(8.dp),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable BoxScope.() -> Unit,
) {
    var contentColor = contentColorFor(backgroundColor = colors)
    var startColor = colors.copy(alpha = 0.7f)
    var endColor = colors
    if (!enabled) {
        endColor = startColor
        startColor = colors.copy(alpha = 0.4f)
        contentColor = contentColor.copy(alpha = 0.8f)
    }

    Surface(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        color = Color.Transparent,
        contentColor = contentColor,
        tonalElevation = elevation,
        shadowElevation = elevation,
        border = border,
        interactionSource = interactionSource,
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            Box(
                Modifier
                    .defaultMinSize(
                        minWidth = ButtonDefaults.MinHeight,
                        minHeight = ButtonDefaults.MinHeight,
                    )
                    .drawBehind {
                        drawRect(Color.White)
                        drawRect(
                            Brush.radialGradient(
                                0.0f to startColor,
                                0.6f to endColor,
                                center = Offset(size.width * 0.5f, size.height * 0.3f),
                                radius = if(size.width==0f) 1f else size.width*0.8f,
                            ),
                        )
                    }
                    .padding(contentPadding),
                contentAlignment = Alignment.Center,
                content = content,
            )
        }
    }
}

@Preview
@Composable
fun GameButtonPreview() {
    GameButton(
        shape = RoundedCornerShape(8.dp),
        onClick = {},
        enabled = false,

        ) {
        Icon(
            imageVector = Icons.Default.Place,
            contentDescription = "Place",
        )
    }
}
