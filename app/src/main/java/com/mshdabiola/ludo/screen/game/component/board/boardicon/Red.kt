package com.mshdabiola.ludo.screen.game.component.board.boardicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.mshdabiola.ludo.screen.game.component.board.Default

fun Default.getRed(iconColor:Color,accentColor:Color): ImageVector
    {
   return Builder(name = "Red", defaultWidth = 115.42.dp, defaultHeight = 133.0.dp,
                viewportWidth = 115.42f, viewportHeight = 133.0f).apply {
            path(fill = SolidColor(accentColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 79.76f)
                curveTo(0.13f, 87.4f, 0.7f, 87.9f, 8.3f, 87.57f)
                lineToRelative(4.08f, 0.26f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 4.15f, 0.07f, 8.31f, 0.16f, 12.47f)
                curveToRelative(0.26f, 11.82f, 4.73f, 21.21f, 15.6f, 26.89f)
                curveToRelative(2.23f, -1.14f, 2.57f, -3.38f, 3.0f, -5.47f)
                curveToRelative(1.1f, -5.53f, 2.46f, -11.0f, 3.48f, -16.56f)
                curveTo(36.12f, 96.88f, 39.94f, 93.44f, 48.43f, 93.0f)
                curveToRelative(4.47f, -0.22f, 9.0f, -0.06f, 13.44f, -0.07f)
                curveToRelative(15.49f, 0.0f, 17.53f, 1.8f, 20.3f, 16.91f)
                curveToRelative(0.61f, 3.33f, 0.42f, 7.13f, 3.44f, 9.63f)
                lineToRelative(-0.39f, 0.12f)
                curveToRelative(0.0f, 2.76f, -0.42f, 5.66f, 2.24f, 7.65f)
                curveToRelative(9.94f, -5.0f, 14.73f, -13.39f, 15.59f, -24.15f)
                curveToRelative(0.4f, -5.1f, 0.2f, -10.25f, 0.28f, -15.37f)
                horizontalLineToRelative(0.0f)
                lineToRelative(4.0f, -0.18f)
                horizontalLineToRelative(0.0f)
                curveToRelative(7.35f, 0.25f, 8.13f, -0.48f, 8.08f, -7.51f)
                curveToRelative(0.0f, -4.12f, -0.16f, -8.24f, 0.0f, -12.35f)
                curveToRelative(0.15f, -3.74f, -1.18f, -6.0f, -5.12f, -6.27f)
                lineToRelative(-3.91f, 0.29f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-3.0f, -0.38f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.36f, -3.2f, -0.73f, -6.39f, -1.09f, -9.59f)
                curveToRelative(-3.64f, -4.93f, -8.09f, -8.09f, -14.62f, -6.7f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, false, -0.36f, 0.34f)
                arcToRelative(10.15f, 10.15f, 0.0f, false, false, -6.88f, 2.89f)
                curveToRelative(-2.72f, 2.43f, -5.7f, 4.57f, -8.35f, 7.1f)
                arcToRelative(12.8f, 12.8f, 0.0f, false, true, -7.92f, 3.81f)
                curveToRelative(-9.7f, 0.76f, -19.0f, 0.56f, -25.48f, -8.52f)
                curveToRelative(-1.75f, -2.45f, -4.56f, -3.82f, -7.39f, -4.92f)
                curveTo(24.3f, 43.0f, 17.51f, 45.43f, 13.32f, 52.07f)
                quadToRelative(-0.5f, 4.65f, -1.0f, 9.31f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-4.05f, 0.33f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-3.93f, -0.29f)
                curveTo(1.26f, 62.0f, 0.0f, 63.91f, 0.06f, 66.9f)
                curveTo(0.08f, 71.19f, 0.0f, 75.48f, 0.0f, 79.76f)
                close()
                moveTo(74.82f, 65.56f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 88.0f, 66.45f)
                arcToRelative(29.94f, 29.94f, 0.0f, false, true, 2.48f, 3.09f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.78f, 2.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.11f, 0.12f, 0.22f, 0.18f, 0.33f)
                lineToRelative(-0.19f, 0.08f)
                curveToRelative(-0.15f, 6.52f, -2.5f, 10.29f, -7.29f, 11.68f)
                arcToRelative(10.16f, 10.16f, 0.0f, false, true, -12.17f, -5.19f)
                arcTo(10.56f, 10.56f, 0.0f, false, true, 74.84f, 65.56f)
                close()
                moveTo(33.14f, 63.56f)
                arcToRelative(10.32f, 10.32f, 0.0f, true, true, -9.94f, 10.32f)
                arcTo(10.26f, 10.26f, 0.0f, false, true, 33.16f, 63.53f)
                close()
            }
            path(fill = SolidColor(iconColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(62.36f, 132.67f)
                arcToRelative(52.43f, 52.43f, 0.0f, false, false, 25.1f, -5.41f)
                curveToRelative(-0.76f, -2.26f, -0.71f, -4.76f, -1.82f, -6.92f)
                lineToRelative(0.0f, -0.11f)
                curveToRelative(0.0f, -0.25f, 0.0f, -0.51f, 0.0f, -0.76f)
                curveToRelative(-1.09f, -5.2f, -2.34f, -10.36f, -3.24f, -15.58f)
                curveTo(81.0f, 95.71f, 76.58f, 91.71f, 68.21f, 91.61f)
                curveToRelative(-6.65f, -0.07f, -13.31f, -0.06f, -20.0f, 0.0f)
                curveToRelative(-8.79f, 0.06f, -13.33f, 4.22f, -15.0f, 12.83f)
                curveToRelative(-1.45f, 7.64f, -3.42f, 15.18f, -5.15f, 22.77f)
                curveTo(39.0f, 132.47f, 50.49f, 133.7f, 62.36f, 132.67f)
                close()
                moveTo(37.0f, 106.0f)
                curveToRelative(1.64f, -0.15f, 1.26f, 1.48f, 1.38f, 2.57f)
                curveToRelative(-0.25f, 1.14f, 0.24f, 2.86f, -1.79f, 2.75f)
                curveToRelative(-1.3f, -0.07f, -1.24f, -1.28f, -1.26f, -2.23f)
                curveTo(35.31f, 107.74f, 35.45f, 106.14f, 37.0f, 106.0f)
                close()
                moveTo(35.53f, 115.8f)
                curveToRelative(2.26f, -0.09f, 1.71f, 1.93f, 1.77f, 3.28f)
                curveToRelative(0.08f, 1.78f, -0.58f, 3.66f, -2.35f, 3.78f)
                curveToRelative(-2.11f, 0.14f, -1.46f, -2.0f, -1.66f, -3.28f)
                curveTo(33.37f, 117.84f, 33.32f, 115.88f, 35.53f, 115.79f)
                close()
            }
            path(fill = SolidColor(iconColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.32f, 52.07f)
                curveToRelative(14.31f, -9.0f, 15.0f, -8.89f, 27.85f, 3.1f)
                curveToRelative(0.12f, 0.11f, 0.28f, 0.19f, 0.4f, 0.3f)
                curveToRelative(8.36f, 7.77f, 24.65f, 7.39f, 33.11f, -0.38f)
                curveToRelative(3.69f, -3.38f, 6.58f, -8.15f, 12.32f, -8.71f)
                curveToRelative(0.11f, -0.27f, 0.22f, -0.54f, 0.32f, -0.81f)
                curveToRelative(6.07f, -0.58f, 10.34f, 3.16f, 14.92f, 6.18f)
                curveToRelative(2.48f, -0.56f, 3.0f, -1.93f, 2.32f, -4.38f)
                curveToRelative(-4.37f, -15.25f, -13.78f, -26.0f, -28.41f, -32.07f)
                horizontalLineToRelative(0.0f)
                curveToRelative(2.27f, -3.6f, 4.25f, -7.27f, 2.7f, -11.74f)
                arcToRelative(64.68f, 64.68f, 0.0f, false, false, -42.23f, 0.0f)
                curveTo(35.4f, 8.0f, 37.0f, 11.77f, 39.55f, 15.29f)
                horizontalLineToRelative(0.0f)
                curveTo(24.86f, 21.39f, 15.76f, 32.4f, 11.13f, 47.43f)
                curveTo(10.36f, 49.94f, 11.23f, 51.16f, 13.32f, 52.07f)
                close()
                moveTo(71.56f, 39.41f)
                curveToRelative(-0.37f, 3.49f, -2.59f, 5.22f, -6.08f, 5.28f)
                curveToRelative(-2.65f, 0.0f, -5.31f, 0.0f, -8.0f, 0.0f)
                verticalLineToRelative(-0.08f)
                curveToRelative(-2.82f, 0.0f, -5.65f, 0.12f, -8.46f, 0.0f)
                curveToRelative(-3.45f, -0.18f, -5.0f, -2.51f, -5.17f, -5.62f)
                curveToRelative(-0.15f, -2.94f, 1.29f, -5.28f, 4.39f, -5.76f)
                arcToRelative(71.87f, 71.87f, 0.0f, false, true, 18.36f, -0.15f)
                curveTo(69.94f, 33.39f, 71.94f, 35.87f, 71.56f, 39.41f)
                close()
            }
            path(fill = SolidColor(iconColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(74.28f, 77.48f)
                curveToRelative(0.28f, -2.18f, 1.3f, -3.53f, 3.14f, -3.68f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 81.0f, 77.12f)
                arcToRelative(3.17f, 3.17f, 0.0f, false, true, -3.55f, 3.33f)
                curveTo(75.58f, 80.39f, 74.73f, 78.91f, 74.28f, 77.48f)
                close()
            }
            path(fill = SolidColor(iconColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.41f, 77.09f)
                curveToRelative(0.49f, -2.0f, 1.63f, -3.45f, 3.76f, -3.27f)
                arcToRelative(3.19f, 3.19f, 0.0f, false, true, 3.0f, 3.37f)
                arcToRelative(3.06f, 3.06f, 0.0f, false, true, -3.11f, 3.24f)
                curveTo(27.87f, 80.61f, 26.93f, 79.0f, 26.41f, 77.09f)
                close()
            }
        }
        .build()
    }
