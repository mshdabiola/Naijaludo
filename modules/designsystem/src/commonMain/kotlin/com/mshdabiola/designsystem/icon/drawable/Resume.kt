package com.mshdabiola.designsystem.icon.drawable

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.icon.Drawable

public val Drawable.Resume: ImageVector
    get() {
        if (_resume != null) {
            return _resume!!
        }
        _resume = Builder(
            name = "Resume",
            defaultWidth = 60.67.dp,
            defaultHeight = 56.69.dp,
            viewportWidth = 60.67f,
            viewportHeight = 56.69f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1d1d1b)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(59.41f, 30.7f)
                lineToRelative(-37.12f, 25.0f)
                arcToRelative(2.83f, 2.83f, 0.0f, false, true, -4.42f, -2.35f)
                verticalLineTo(3.4f)
                arcTo(2.84f, 2.84f, 0.0f, false, true, 22.29f, 1.0f)
                lineTo(59.41f, 26.0f)
                arcTo(2.83f, 2.83f, 0.0f, false, true, 59.41f, 30.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1d1d1b)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(8.9f, 56.69f)
                lineTo(2.83f, 56.69f)
                arcTo(2.83f, 2.83f, 0.0f, false, true, 0.0f, 53.86f)
                lineTo(0.0f, 2.83f)
                arcTo(2.83f, 2.83f, 0.0f, false, true, 2.83f, 0.0f)
                lineTo(8.9f, 0.0f)
                arcTo(2.83f, 2.83f, 0.0f, false, true, 11.73f, 2.83f)
                lineTo(11.73f, 53.86f)
                arcTo(2.83f, 2.83f, 0.0f, false, true, 8.9f, 56.69f)
                close()
            }
        }
            .build()
        return _resume!!
    }

private var _resume: ImageVector? = null
