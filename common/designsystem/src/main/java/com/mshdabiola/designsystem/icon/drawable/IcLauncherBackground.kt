package com.mshdabiola.designsystem.icon.drawable

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.icon.Drawable

public val Drawable.IcLauncherBackground: ImageVector
    get() {
        if (_icLauncherBackground != null) {
            return _icLauncherBackground!!
        }
        _icLauncherBackground = Builder(name = "IcLauncherBackground", defaultWidth = 108.0.dp,
                defaultHeight = 108.0.dp, viewportWidth = 292.02f, viewportHeight = 292.02f).apply {
            path(fill = SolidColor(Color(0xFF67b86a)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(146.01f, 0.0f)
                horizontalLineToRelative(146.01f)
                verticalLineToRelative(146.01f)
                horizontalLineToRelative(-146.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFFea5351)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(146.01f)
                verticalLineToRelative(146.01f)
                horizontalLineToRelative(-146.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffee5a)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(143.5f, 146.01f)
                horizontalLineToRelative(146.01f)
                verticalLineToRelative(146.01f)
                horizontalLineToRelative(-146.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF559fd7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 146.01f)
                horizontalLineToRelative(146.01f)
                verticalLineToRelative(146.01f)
                horizontalLineToRelative(-146.01f)
                close()
            }
        }
        .build()
        return _icLauncherBackground!!
    }

private var _icLauncherBackground: ImageVector? = null
