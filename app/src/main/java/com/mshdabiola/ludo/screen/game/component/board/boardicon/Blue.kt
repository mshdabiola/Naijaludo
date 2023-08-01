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


fun Default.getBlue(iconColor:Color, accentColor:Color): ImageVector
    {
       return Builder(name = "Blue", defaultWidth = 114.53.dp, defaultHeight = 140.99.dp,
                viewportWidth = 114.53f, viewportHeight = 140.99f).apply {
            path(fill = SolidColor(iconColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.56f, 117.26f)
                curveTo(7.55f, 107.12f, 2.73f, 95.0f, 0.84f, 81.81f)
                curveTo(-2.27f, 60.16f, 3.31f, 40.63f, 16.89f, 23.44f)
                arcToRelative(22.47f, 22.47f, 0.0f, false, true, 2.53f, -2.33f)
                curveToRelative(3.46f, -1.5f, 6.07f, 0.76f, 8.72f, 2.2f)
                curveToRelative(5.58f, 3.0f, 9.21f, 8.0f, 12.15f, 13.49f)
                curveToRelative(0.84f, 1.55f, 1.77f, 3.34f, -0.08f, 5.0f)
                curveTo(34.53f, 43.51f, 32.83f, 47.52f, 33.0f, 53.2f)
                curveToRelative(0.26f, 10.77f, 0.22f, 21.55f, 0.0f, 32.32f)
                curveToRelative(-0.1f, 5.5f, 1.62f, 9.36f, 7.22f, 10.88f)
                curveToRelative(1.33f, 1.0f, 1.2f, 2.29f, 0.7f, 3.54f)
                curveToRelative(-3.64f, 9.12f, -9.92f, 15.38f, -19.56f, 18.0f)
                arcTo(6.85f, 6.85f, 0.0f, false, true, 16.56f, 117.26f)
                close()
            }
            path(fill = SolidColor(iconColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(89.42f, 128.14f)
                horizontalLineToRelative(0.0f)
                arcToRelative(34.68f, 34.68f, 0.0f, false, false, 6.25f, -4.64f)
                curveToRelative(12.07f, -12.28f, 17.14f, -27.38f, 18.06f, -44.2f)
                arcToRelative(5.56f, 5.56f, 0.0f, false, false, 0.75f, -1.76f)
                curveToRelative(0.27f, -13.48f, -0.47f, -26.78f, -5.61f, -39.54f)
                curveToRelative(-4.24f, -10.53f, -9.7f, -19.95f, -20.17f, -25.49f)
                curveToRelative(2.48f, -3.64f, 0.0f, -6.39f, -2.08f, -8.72f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 75.37f, 0.36f)
                curveToRelative(-6.21f, 1.46f, -9.65f, 7.0f, -7.65f, 12.12f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-3.12f, 1.27f, -5.54f, 3.53f, -8.0f, 5.69f)
                curveTo(52.85f, 24.84f, 49.38f, 33.47f, 45.76f, 42.0f)
                arcToRelative(3.39f, 3.39f, 0.0f, false, false, -1.58f, 1.86f)
                arcToRelative(88.88f, 88.88f, 0.0f, false, false, -3.79f, 32.41f)
                arcToRelative(3.06f, 3.06f, 0.0f, false, false, 1.0f, 2.42f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.49f, -0.13f, 0.74f)
                curveToRelative(0.09f, 6.19f, 0.42f, 12.32f, 4.22f, 17.62f)
                curveToRelative(3.25f, 9.46f, 7.31f, 18.45f, 14.36f, 25.79f)
                lineToRelative(7.05f, 5.27f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.27f, 7.77f, 4.6f, 13.0f, 12.0f, 12.87f)
                curveTo(85.27f, 140.87f, 89.83f, 135.35f, 89.42f, 128.14f)
                close()
                moveTo(72.49f, 118.38f)
                curveToRelative(-4.0f, -3.57f, -6.06f, -8.25f, -7.66f, -13.21f)
                curveToRelative(-6.63f, -20.5f, -6.2f, -41.24f, -2.25f, -62.11f)
                curveToRelative(0.42f, -2.24f, 1.6f, -4.46f, 0.37f, -6.79f)
                lineToRelative(-0.32f, 0.0f)
                lineToRelative(0.2f, -0.14f)
                curveToRelative(1.85f, -0.12f, 1.91f, -1.85f, 2.64f, -3.0f)
                arcToRelative(29.27f, 29.27f, 0.0f, false, true, 5.89f, -9.75f)
                curveToRelative(4.8f, -5.16f, 9.75f, -5.16f, 14.37f, 0.28f)
                arcToRelative(26.29f, 26.29f, 0.0f, false, true, 5.19f, 9.58f)
                curveToRelative(1.3f, 2.15f, 1.34f, 5.0f, 3.58f, 6.6f)
                arcToRelative(4.83f, 4.83f, 0.0f, false, false, -0.38f, 0.4f)
                curveToRelative(-0.74f, 1.64f, -0.3f, 3.27f, 0.08f, 4.89f)
                curveToRelative(4.37f, 18.53f, 3.5f, 37.0f, -1.06f, 55.31f)
                curveToRelative(-1.65f, 6.66f, -4.1f, 13.0f, -9.32f, 17.89f)
                curveTo(79.75f, 122.13f, 76.7f, 122.15f, 72.49f, 118.38f)
                close()
            }
            path(fill = SolidColor(accentColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(45.76f, 42.0f)
                curveTo(43.0f, 52.94f, 41.27f, 64.0f, 41.91f, 75.3f)
                curveToRelative(0.07f, 1.27f, -0.41f, 2.67f, 0.66f, 3.78f)
                curveToRelative(-0.27f, 6.18f, 1.84f, 12.0f, 2.86f, 18.0f)
                lineToRelative(-4.93f, 0.29f)
                curveToRelative(-6.6f, -0.53f, -8.83f, -2.8f, -8.86f, -9.29f)
                quadToRelative(-0.08f, -18.86f, 0.0f, -37.72f)
                curveToRelative(0.0f, -6.4f, 2.3f, -8.8f, 8.78f, -9.5f)
                curveTo(42.16f, 41.37f, 44.25f, 40.38f, 45.76f, 42.0f)
                close()
            }
            path(fill = SolidColor(accentColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(89.67f, 113.13f)
                curveToRelative(6.49f, -12.0f, 7.84f, -25.26f, 8.56f, -38.55f)
                curveToRelative(0.63f, -11.66f, -1.0f, -23.17f, -3.49f, -34.57f)
                quadToRelative(-1.41f, -3.52f, -2.84f, -7.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.67f, -3.86f, -2.77f, -7.08f, -5.15f, -10.0f)
                curveToRelative(-5.49f, -6.6f, -11.47f, -6.49f, -16.92f, 0.1f)
                curveToRelative(-2.41f, 2.91f, -4.66f, 6.0f, -5.19f, 9.92f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.6f, 1.0f, -1.21f, 2.0f, -1.81f, 3.07f)
                curveToRelative(-4.35f, 15.21f, -5.21f, 30.77f, -4.09f, 46.44f)
                curveToRelative(0.76f, 10.47f, 2.92f, 20.72f, 7.75f, 30.18f)
                curveToRelative(2.54f, 5.0f, 5.66f, 10.07f, 12.0f, 10.0f)
                curveTo(84.25f, 122.59f, 87.18f, 117.74f, 89.67f, 113.13f)
                close()
                moveTo(70.51f, 50.13f)
                arcTo(11.3f, 11.3f, 0.0f, false, true, 68.8f, 34.86f)
                arcTo(32.63f, 32.63f, 0.0f, false, true, 72.6f, 31.0f)
                lineToRelative(7.05f, -1.16f)
                curveToRelative(5.25f, 1.0f, 8.7f, 4.13f, 9.86f, 9.28f)
                arcToRelative(10.92f, 10.92f, 0.0f, false, true, -3.6f, 10.77f)
                arcTo(11.51f, 11.51f, 0.0f, false, true, 70.51f, 50.12f)
                close()
                moveTo(66.83f, 77.84f)
                curveToRelative(-2.18f, -2.58f, -3.66f, -5.45f, -3.32f, -8.49f)
                arcToRelative(11.65f, 11.65f, 0.0f, false, true, 3.42f, -8.92f)
                arcToRelative(1.55f, 1.55f, 0.0f, false, true, 2.21f, -0.27f)
                curveToRelative(0.89f, 0.73f, 0.4f, 1.46f, -0.12f, 2.1f)
                curveToRelative(-3.78f, 4.66f, -3.58f, 9.29f, 0.08f, 13.9f)
                curveToRelative(0.6f, 0.74f, 0.73f, 1.41f, -0.12f, 2.07f)
                arcTo(1.46f, 1.46f, 0.0f, false, true, 66.83f, 77.84f)
                close()
                moveTo(66.61f, 97.61f)
                arcToRelative(11.54f, 11.54f, 0.0f, false, true, 23.07f, -0.26f)
                arcToRelative(11.54f, 11.54f, 0.0f, true, true, -23.07f, 0.26f)
                close()
            }
            path(fill = SolidColor(iconColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(78.0f, 45.07f)
                curveToRelative(-2.3f, -0.32f, -3.61f, -1.51f, -3.49f, -3.93f)
                reflectiveCurveToRelative(1.8f, -3.49f, 4.0f, -3.31f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, 3.22f, 3.63f)
                curveTo(81.69f, 43.87f, 80.4f, 45.0f, 78.0f, 45.07f)
                close()
            }
            path(fill = SolidColor(iconColor), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(74.59f, 98.32f)
                curveToRelative(-0.19f, -3.16f, 1.22f, -4.41f, 3.48f, -4.47f)
                curveToRelative(2.0f, -0.06f, 3.52f, 0.88f, 3.67f, 3.15f)
                reflectiveCurveToRelative(-0.8f, 3.89f, -3.25f, 4.0f)
                reflectiveCurveTo(74.75f, 100.09f, 74.59f, 98.32f)
                close()
            }
        }
        .build()

    }
