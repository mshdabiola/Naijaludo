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

fun Default.getGreen(iconColor:Color,accentColor:Color): ImageVector
    {
       return Builder(name = "Green", defaultWidth = 139.4.dp, defaultHeight = 140.89.dp,
                viewportWidth = 139.4f, viewportHeight = 140.89f).apply {
            path(fill = SolidColor(iconColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.12f, 16.39f)
                curveTo(22.74f, 20.65f, 4.8f, 37.57f, 1.06f, 60.79f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-3.0f, 15.16f, 0.56f, 28.88f, 9.36f, 41.32f)
                curveToRelative(9.23f, 13.0f, 22.31f, 19.69f, 37.75f, 22.27f)
                curveToRelative(0.83f, 10.63f, 7.13f, 16.55f, 17.0f, 16.51f)
                curveToRelative(6.54f, 0.0f, 15.82f, -7.17f, 14.84f, -16.07f)
                horizontalLineToRelative(0.0f)
                lineToRelative(2.87f, 0.0f)
                curveToRelative(3.3f, -0.08f, 6.61f, -0.09f, 9.91f, -0.25f)
                curveToRelative(6.35f, -0.31f, 10.0f, -4.08f, 10.08f, -10.42f)
                curveToRelative(0.07f, -4.47f, 0.07f, -8.94f, 0.09f, -13.41f)
                lineToRelative(0.0f, -1.0f)
                curveToRelative(1.37f, -2.0f, 1.74f, -3.9f, 0.62f, -5.78f)
                curveToRelative(0.18f, -0.58f, 0.36f, -1.19f, 0.54f, -1.86f)
                curveToRelative(0.86f, -15.72f, 0.27f, -31.46f, 0.31f, -47.19f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, false, -1.37f, -4.16f)
                curveToRelative(-0.07f, -4.49f, -0.18f, -9.0f, -0.18f, -13.46f)
                curveToRelative(0.0f, -7.2f, -3.21f, -10.75f, -10.4f, -11.15f)
                curveToRelative(-4.14f, -0.23f, -8.3f, -0.22f, -12.45f, -0.31f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.36f, 0.07f, -0.72f, 0.11f, -1.07f)
                curveTo(78.78f, 5.89f, 71.82f, -0.33f, 63.6f, 0.0f)
                curveTo(55.1f, 0.36f, 48.71f, 7.12f, 48.12f, 16.39f)
                close()
                moveTo(58.22f, 34.09f)
                curveTo(75.82f, 37.15f, 89.91f, 55.41f, 88.0f, 73.17f)
                curveToRelative(-1.0f, 9.0f, -4.14f, 16.62f, -10.59f, 23.0f)
                curveToRelative(-1.19f, 1.18f, -3.66f, 2.52f, -2.16f, 4.68f)
                horizontalLineToRelative(-0.27f)
                curveToRelative(-1.65f, -0.75f, -2.75f, 0.62f, -4.09f, 1.08f)
                curveToRelative(-1.93f, 0.95f, -3.89f, 1.82f, -5.87f, 2.66f)
                curveToRelative(-16.75f, 7.08f, -34.6f, -0.72f, -42.05f, -11.0f)
                curveToRelative(-2.81f, -2.53f, -3.56f, -6.71f, -7.0f, -8.74f)
                arcToRelative(2.38f, 2.38f, 0.0f, false, false, 0.3f, -0.18f)
                curveToRelative(0.82f, -1.69f, -0.09f, -3.23f, -0.37f, -4.84f)
                arcTo(51.31f, 51.31f, 0.0f, false, true, 14.77f, 68.0f)
                curveTo(16.0f, 47.05f, 35.6f, 30.16f, 58.22f, 34.09f)
                close()
            }
            path(fill = SolidColor(accentColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(119.47f, 26.76f)
                curveToRelative(-0.15f, 4.64f, -0.17f, 9.28f, 0.0f, 13.93f)
                verticalLineToRelative(0.07f)
                lineToRelative(-8.65f, 0.21f)
                lineToRelative(-7.76f, -0.19f)
                lineToRelative(-0.36f, 52.0f)
                curveToRelative(0.08f, 2.24f, 0.17f, 4.48f, 0.25f, 6.72f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, false, 0.29f, 1.64f)
                curveToRelative(2.27f, 1.4f, 4.81f, 1.05f, 7.26f, 1.05f)
                curveToRelative(9.56f, 0.0f, 8.91f, -0.29f, 9.05f, 8.92f)
                curveToRelative(0.0f, 2.42f, -1.0f, 5.45f, 2.42f, 6.79f)
                curveToRelative(1.21f, -1.55f, 2.47f, -3.06f, 3.61f, -4.66f)
                curveToRelative(19.86f, -28.0f, 18.23f, -66.24f, -3.89f, -91.63f)
                curveTo(119.25f, 22.64f, 119.54f, 24.86f, 119.47f, 26.76f)
                close()
            }
            path(fill = SolidColor(iconColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(67.63f, 69.38f)
                curveToRelative(0.0f, -2.0f, 0.0f, -4.0f, 0.0f, -6.0f)
                curveToRelative(0.13f, -5.15f, 1.87f, -6.56f, 6.76f, -5.54f)
                curveToRelative(5.12f, 1.07f, 9.85f, 7.33f, 9.44f, 12.5f)
                curveToRelative(-0.44f, 5.65f, -5.37f, 11.0f, -10.7f, 11.47f)
                curveToRelative(-3.28f, 0.32f, -5.58f, -0.5f, -5.38f, -4.48f)
                curveToRelative(0.13f, -2.65f, 0.0f, -5.31f, 0.0f, -8.0f)
                close()
            }
            path(fill = SolidColor(accentColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.29f, 51.57f)
                curveToRelative(-6.17f, 10.56f, -6.0f, 21.84f, -2.45f, 33.24f)
                curveToRelative(1.95f, 3.12f, 3.0f, 6.82f, 5.94f, 9.3f)
                curveToRelative(11.57f, 15.33f, 33.0f, 18.93f, 50.13f, 8.42f)
                lineToRelative(3.0f, -1.68f)
                curveToRelative(1.61f, -1.68f, 3.29f, -3.29f, 4.8f, -5.0f)
                curveToRelative(10.11f, -11.8f, 12.72f, -25.2f, 7.0f, -39.54f)
                curveToRelative(-6.0f, -15.19f, -17.91f, -23.39f, -34.19f, -24.0f)
                curveTo(37.53f, 31.77f, 25.89f, 38.59f, 18.29f, 51.57f)
                close()
                moveTo(56.55f, 90.2f)
                arcToRelative(8.58f, 8.58f, 0.0f, false, true, -17.15f, 0.08f)
                arcToRelative(8.58f, 8.58f, 0.0f, false, true, 17.15f, -0.08f)
                close()
                moveTo(56.44f, 48.93f)
                arcToRelative(8.79f, 8.79f, 0.0f, false, true, -8.5f, 8.67f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -8.32f, -8.23f)
                arcToRelative(8.08f, 8.08f, 0.0f, false, true, 8.14f, -8.68f)
                arcTo(8.25f, 8.25f, 0.0f, false, true, 56.44f, 48.93f)
                close()
            }
            path(fill = SolidColor(iconColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.24f, 88.9f)
                curveToRelative(0.46f, -1.85f, 1.07f, -3.18f, 2.95f, -3.14f)
                curveTo(47.27f, 85.8f, 48.13f, 87.0f, 48.0f, 89.0f)
                curveToRelative(-0.13f, 1.76f, -1.07f, 2.78f, -2.9f, 2.6f)
                reflectiveCurveTo(42.71f, 90.09f, 42.24f, 88.9f)
                close()
            }
            path(fill = SolidColor(iconColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.07f, 45.73f)
                curveToRelative(0.0f, 1.87f, -0.47f, 3.13f, -2.44f, 3.07f)
                reflectiveCurveToRelative(-3.19f, -1.0f, -3.32f, -2.88f)
                arcTo(2.77f, 2.77f, 0.0f, false, true, 45.0f, 43.0f)
                curveTo(47.0f, 42.76f, 47.88f, 44.06f, 48.07f, 45.73f)
                close()
            }
        }
        .build()
    }
