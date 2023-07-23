package com.mshdabiola.ludo.screen.game.component.board.default

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
import com.mshdabiola.ludo.screen.game.component.board.Default

public val Default.Yellow: ImageVector
    get() {
        if (_yellow != null) {
            return _yellow!!
        }
        _yellow = Builder(name = "Yellow", defaultWidth = 136.22.dp, defaultHeight = 130.5.dp,
                viewportWidth = 136.22f, viewportHeight = 130.5f).apply {
            path(fill = SolidColor(Color(0xFFc6bb01)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 105.16f)
                curveToRelative(-13.22f, 14.27f, -29.48f, 22.74f, -48.79f, 24.92f)
                arcToRelative(70.45f, 70.45f, 0.0f, false, true, -32.74f, -4.27f)
                arcToRelative(76.94f, 76.94f, 0.0f, false, true, -30.24f, -20.3f)
                curveToRelative(5.84f, -9.87f, 14.74f, -16.0f, 25.09f, -20.22f)
                arcToRelative(28.12f, 28.12f, 0.0f, false, true, 3.2f, -1.35f)
                curveToRelative(3.39f, 1.0f, 7.0f, 1.29f, 10.0f, 3.51f)
                curveToRelative(0.53f, 2.0f, 0.0f, 4.0f, 0.05f, 5.94f)
                curveToRelative(0.07f, 5.79f, 2.44f, 8.82f, 8.0f, 9.32f)
                arcToRelative(98.76f, 98.76f, 0.0f, false, false, 17.87f, 0.0f)
                curveToRelative(5.84f, -0.54f, 8.61f, -4.37f, 8.0f, -10.31f)
                curveToRelative(-0.17f, -1.64f, -0.63f, -3.27f, 0.18f, -4.87f)
                curveTo(87.57f, 85.0f, 91.26f, 84.65f, 94.8f, 83.9f)
                curveTo(106.39f, 88.44f, 116.56f, 95.0f, 124.0f, 105.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffec2d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(135.72f, 47.38f)
                curveToRelative(-0.44f, -4.48f, -3.5f, -5.58f, -7.45f, -5.0f)
                arcToRelative(39.0f, 39.0f, 0.0f, false, false, -4.34f, 1.14f)
                horizontalLineToRelative(0.0f)
                arcToRelative(45.91f, 45.91f, 0.0f, false, false, -17.54f, -18.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.78f, -5.0f, -5.64f, -8.0f, -10.0f, -10.52f)
                horizontalLineToRelative(0.0f)
                curveTo(95.82f, 5.63f, 90.13f, 0.11f, 80.91f, 0.05f)
                curveTo(72.13f, 0.0f, 63.35f, 0.0f, 54.57f, 0.05f)
                curveTo(45.31f, 0.14f, 39.5f, 5.88f, 39.13f, 15.15f)
                curveToRelative(-4.55f, 2.22f, -8.06f, 5.44f, -9.82f, 10.32f)
                curveToRelative(-2.2f, 2.1f, -5.57f, 2.7f, -7.19f, 5.56f)
                horizontalLineToRelative(0.0f)
                curveTo(17.25f, 33.8f, 15.0f, 38.73f, 12.0f, 43.12f)
                curveToRelative(-1.0f, -0.13f, -2.0f, -0.18f, -2.94f, -0.39f)
                curveTo(1.83f, 41.17f, -0.35f, 44.6f, 0.0f, 50.0f)
                curveToRelative(0.21f, 2.81f, 0.0f, 5.66f, 0.12f, 8.48f)
                curveToRelative(0.22f, 3.9f, 2.76f, 5.85f, 6.63f, 5.25f)
                curveToRelative(1.81f, -0.27f, 3.59f, -0.66f, 5.39f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.47f, 2.13f, 3.31f, 4.0f, 4.16f, 6.56f)
                curveTo(23.16f, 76.0f, 30.63f, 81.68f, 40.0f, 84.44f)
                arcToRelative(21.52f, 21.52f, 0.0f, false, false, 10.17f, 2.87f)
                curveToRelative(-3.25f, 12.66f, 0.13f, 17.0f, 13.17f, 17.06f)
                curveToRelative(4.16f, 0.0f, 8.32f, 0.12f, 12.47f, 0.0f)
                curveTo(83.26f, 104.09f, 87.3f, 99.0f, 86.0f, 91.75f)
                curveToRelative(-0.27f, -1.47f, -0.59f, -2.93f, -0.89f, -4.39f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.46f, 32.46f, 0.0f, false, false, 10.28f, -3.0f)
                curveToRelative(9.44f, -2.7f, 17.1f, -8.17f, 23.78f, -15.18f)
                lineToRelative(4.31f, -7.57f)
                curveToRelative(6.27f, 4.0f, 12.08f, 2.62f, 12.65f, -3.31f)
                arcTo(57.37f, 57.37f, 0.0f, false, false, 135.72f, 47.38f)
                close()
                moveTo(48.16f, 62.24f)
                arcToRelative(5.35f, 5.35f, 0.0f, false, true, -6.0f, 4.73f)
                curveToRelative(-2.86f, -0.23f, -5.0f, -1.92f, -5.07f, -5.11f)
                curveToRelative(-0.07f, -2.15f, 0.12f, -4.3f, 0.19f, -6.46f)
                curveToRelative(4.32f, -4.59f, 7.0f, -4.37f, 10.95f, 0.88f)
                arcTo(32.89f, 32.89f, 0.0f, false, true, 48.16f, 62.24f)
                close()
                moveTo(97.76f, 64.19f)
                curveToRelative(-1.28f, 2.09f, -3.29f, 3.34f, -5.88f, 2.75f)
                curveToRelative(-2.44f, -0.55f, -4.23f, -2.0f, -4.56f, -4.62f)
                arcToRelative(49.33f, 49.33f, 0.0f, false, true, -0.06f, -6.0f)
                curveToRelative(1.24f, -1.92f, 2.59f, -3.69f, 5.0f, -4.23f)
                curveTo(97.88f, 53.41f, 100.68f, 59.42f, 97.76f, 64.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf3e600)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(79.24f, 75.12f)
                curveToRelative(-1.0f, 0.25f, -1.31f, -1.18f, -1.0f, -2.25f)
                lineTo(79.83f, 74.0f)
                curveToRelative(2.08f, -4.61f, 3.89f, 0.0f, 5.82f, 0.25f)
                lineToRelative(0.51f, -0.06f)
                curveToRelative(-0.31f, -3.0f, -2.1f, -5.28f, -4.91f, -5.38f)
                curveToRelative(-9.11f, -0.33f, -18.25f, -1.0f, -27.34f, 0.38f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-2.94f, 0.47f, -4.1f, 2.45f, -4.4f, 5.18f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.06f, 3.12f, 1.0f, 5.48f, 4.37f, 6.14f)
                curveToRelative(9.0f, 1.59f, 18.07f, 0.62f, 27.11f, 0.44f)
                arcToRelative(4.93f, 4.93f, 0.0f, false, false, 4.38f, -2.86f)
                curveTo(83.55f, 76.65f, 82.27f, 74.35f, 79.24f, 75.12f)
                close()
                moveTo(69.24f, 74.76f)
                curveToRelative(-2.72f, -0.53f, -4.23f, 0.86f, -4.8f, 3.31f)
                curveToRelative(-0.33f, 1.43f, -0.66f, 2.15f, -2.06f, 1.0f)
                curveToRelative(0.12f, -4.0f, -0.81f, -5.87f, -4.83f, -2.7f)
                curveToRelative(-1.57f, 1.24f, -1.75f, 1.0f, -3.36f, -3.06f)
                curveToRelative(2.25f, 0.49f, 5.31f, 3.09f, 5.43f, -2.0f)
                curveToRelative(0.0f, -1.27f, 1.0f, -1.17f, 1.69f, -1.34f)
                curveToRelative(1.0f, -0.25f, 0.89f, 0.72f, 1.0f, 1.29f)
                curveToRelative(0.43f, 4.42f, 2.09f, 3.93f, 5.0f, 1.64f)
                curveTo(68.87f, 71.57f, 69.3f, 73.31f, 69.23f, 74.76f)
                close()
                moveTo(74.11f, 76.17f)
                curveToRelative(-2.69f, 4.36f, -2.4f, 0.53f, -2.93f, -1.06f)
                curveToRelative(2.43f, 1.36f, 3.25f, -2.2f, 5.38f, -1.76f)
                curveTo(76.59f, 75.0f, 74.76f, 75.1f, 74.1f, 76.17f)
                close()
            }
        }
        .build()
        return _yellow!!
    }

private var _yellow: ImageVector? = null
