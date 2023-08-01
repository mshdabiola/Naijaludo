package com.mshdabiola.ludo.screen.game.component.car

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Car.getYellow(iconColor:Long, accentColor:Long): ImageVector
{
    return Builder(name = "Yelow", defaultWidth = 200.0.dp, defaultHeight = 200.0.dp,
                viewportWidth = 200.0f, viewportHeight = 200.0f).apply {
            path(fill = SolidColor(Color(iconColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(91.89f, 191.15f)
                curveToRelative(6.75f, 1.57f, 13.63f, 3.45f, 19.0f, 8.85f)
                lineToRelative(1.43f, -2.41f)
                curveToRelative(6.12f, -11.27f, 8.71f, -24.14f, 9.52f, -37.37f)
                arcTo(54.74f, 54.74f, 0.0f, false, false, 135.5f, 146.1f)
                curveToRelative(5.54f, -6.84f, 4.56f, -15.11f, 5.77f, -23.69f)
                curveToRelative(-0.32f, -12.47f, -1.17f, -38.62f, -1.75f, -39.24f)
                curveToRelative(-1.25f, -10.0f, -10.14f, -18.73f, -19.79f, -20.92f)
                lineToRelative(-2.28f, -20.43f)
                curveToRelative(0.0f, -11.44f, -3.44f, -21.77f, -6.0f, -32.36f)
                curveToRelative(-0.8f, -2.0f, -1.74f, -5.05f, -4.51f, -5.14f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, -3.66f, 3.22f)
                curveToRelative(-1.39f, 3.0f, -4.74f, 1.56f, -6.93f, 1.92f)
                arcToRelative(3.46f, 3.46f, 0.0f, false, false, -2.1f, 2.28f)
                curveToRelative(-1.29f, 4.74f, 2.33f, 8.45f, 5.63f, 10.91f)
                curveToRelative(5.0f, 0.8f, 11.08f, 3.48f, 12.25f, 8.84f)
                curveToRelative(-1.08f, -1.07f, -1.88f, -3.12f, -3.4f, -3.53f)
                curveToRelative(2.5f, 3.94f, 3.44f, 8.59f, 5.0f, 12.88f)
                horizontalLineToRelative(0.32f)
                arcToRelative(108.92f, 108.92f, 0.0f, false, true, 3.71f, 23.51f)
                curveToRelative(1.47f, 8.71f, 0.58f, 18.59f, 0.13f, 27.35f)
                curveToRelative(-1.39f, -8.76f, -3.71f, -17.3f, -4.16f, -26.23f)
                arcToRelative(23.84f, 23.84f, 0.0f, false, true, 2.73f, 2.59f)
                curveToRelative(0.13f, -3.0f, -0.22f, -6.13f, -0.31f, -9.21f)
                curveToRelative(-3.18f, -0.85f, -7.0f, -3.47f, -8.35f, -6.5f)
                arcToRelative(1.36f, 1.36f, 0.0f, false, false, -0.86f, 0.06f)
                curveToRelative(1.61f, 2.6f, 3.44f, 5.23f, 3.89f, 8.05f)
                lineToRelative(-0.8f, -0.63f)
                curveToRelative(-4.47f, -0.49f, -4.11f, 5.54f, -8.23f, 6.44f)
                curveToRelative(-2.14f, 1.0f, -3.3f, -1.88f, -5.63f, -0.63f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -2.54f, 3.67f)
                arcTo(12.92f, 12.92f, 0.0f, false, false, 97.0f, 81.06f)
                arcToRelative(6.24f, 6.24f, 0.0f, false, false, 4.51f, 1.12f)
                curveToRelative(5.68f, -1.92f, 7.69f, -7.91f, 8.67f, -13.0f)
                arcToRelative(139.62f, 139.62f, 0.0f, false, true, 4.51f, 18.0f)
                curveToRelative(3.53f, 11.84f, 1.52f, 25.61f, 0.49f, 38.0f)
                lineToRelative(-0.31f, 0.62f)
                curveToRelative(-0.44f, -0.35f, -0.67f, 4.83f, -1.79f, 6.93f)
                curveToRelative(0.67f, 1.12f, 0.46f, 0.91f, 0.67f, 1.12f)
                lineToRelative(-0.49f, 3.53f)
                curveToRelative(-0.67f, 1.83f, -0.8f, 4.74f, -3.08f, 5.0f)
                arcToRelative(126.0f, 126.0f, 0.0f, false, false, 0.49f, -13.68f)
                curveToRelative(2.1f, -1.61f, 2.51f, -4.2f, 3.4f, -6.44f)
                curveToRelative(-1.48f, 0.59f, -1.88f, 3.0f, -3.53f, 3.0f)
                lineToRelative(-2.0f, -16.58f)
                curveToRelative(-1.83f, -7.29f, -1.7f, -15.73f, -6.43f, -22.0f)
                curveToRelative(-1.18f, 2.31f, 2.0f, 6.44f, 2.0f, 9.84f)
                curveToRelative(2.0f, 9.92f, 4.0f, 20.24f, 3.85f, 30.71f)
                curveToRelative(-10.0f, 4.06f, -22.17f, 6.25f, -32.8f, 3.88f)
                curveToRelative(-1.16f, 0.49f, -2.91f, 1.08f, -4.0f, 0.14f)
                arcTo(46.57f, 46.57f, 0.0f, false, true, 67.0f, 118.07f)
                curveToRelative(8.81f, -3.08f, 18.28f, -4.91f, 24.94f, -12.87f)
                curveTo(95.0f, 102.0f, 95.73f, 97.33f, 94.61f, 93.0f)
                curveToRelative(-0.84f, -4.7f, -5.94f, -7.29f, -10.0f, -8.4f)
                curveToRelative(-1.38f, -3.27f, -3.0f, -6.58f, -2.73f, -10.29f)
                horizontalLineToRelative(1.93f)
                curveToRelative(2.57f, -0.81f, 3.62f, -2.9f, 4.64f, -4.64f)
                curveToRelative(6.44f, -13.91f, 6.57f, -31.38f, 5.5f, -47.34f)
                curveToRelative(-0.67f, -5.27f, -0.81f, -10.77f, -4.83f, -14.62f)
                curveToRelative(-2.63f, -1.2f, -1.61f, -4.82f, -4.2f, -6.43f)
                curveTo(82.68f, -0.46f, 79.0f, -0.33f, 76.6f, 1.1f)
                arcToRelative(10.81f, 10.81f, 0.0f, false, false, -4.33f, 7.73f)
                curveToRelative(-6.21f, 8.41f, -7.82f, 18.69f, -9.16f, 29.1f)
                curveTo(61.9f, 50.31f, 63.56f, 62.25f, 66.0f, 73.51f)
                curveToRelative(-2.41f, 4.2f, -3.26f, 9.0f, -4.15f, 13.86f)
                curveToRelative(-0.09f, 8.0f, -0.36f, 17.7f, 7.73f, 21.23f)
                curveToRelative(-1.3f, 0.31f, -2.2f, 1.43f, -3.4f, 1.92f)
                curveToRelative(-9.79f, 8.0f, -4.07f, 20.47f, -1.79f, 30.08f)
                curveToRelative(0.59f, 1.21f, -1.16f, 1.3f, -1.74f, 1.92f)
                curveToRelative(-3.0f, 4.07f, -3.53f, 9.57f, -3.89f, 14.35f)
                curveToRelative(0.18f, 9.34f, 0.36f, 18.46f, 3.22f, 26.68f)
                curveToRelative(0.67f, 1.34f, 2.15f, 2.51f, 3.71f, 1.79f)
                curveToRelative(1.52f, -3.44f, 3.49f, 0.49f, 5.63f, -0.31f)
                curveToRelative(9.07f, 0.85f, 15.73f, -4.16f, 21.89f, -10.32f)
                curveToRelative(3.27f, -3.8f, 6.0f, -9.26f, 3.22f, -14.13f)
                curveToRelative(-4.29f, -6.35f, -12.15f, -5.94f, -18.81f, -6.0f)
                curveToRelative(0.45f, -8.41f, -3.62f, -15.06f, -5.81f, -22.17f)
                arcToRelative(52.51f, 52.51f, 0.0f, false, false, 27.35f, 0.45f)
                curveToRelative(3.0f, -0.67f, 6.08f, -1.75f, 9.0f, -2.24f)
                curveToRelative(-0.59f, 18.19f, -5.23f, 34.51f, -11.94f, 50.38f)
                lineTo(94.0f, 180.34f)
                lineToRelative(-2.41f, 2.0f)
                curveToRelative(-1.34f, 0.39f, -2.33f, -1.0f, -3.4f, -1.8f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -4.0f, 3.4f)
                curveToRelative(1.2f, 2.0f, 0.54f, 4.74f, 2.1f, 6.57f)
                curveToRelative(1.47f, 1.16f, 3.75f, 0.45f, 5.63f, 0.67f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.57f, 18.31f)
                curveToRelative(-0.85f, -1.34f, -2.19f, -2.46f, -2.55f, -4.0f)
                arcTo(5.59f, 5.59f, 0.0f, false, true, 104.36f, 13.0f)
                curveToRelative(0.13f, -0.14f, 0.53f, -0.45f, 0.13f, -0.63f)
                curveToRelative(-1.0f, -0.94f, -3.41f, -0.06f, -4.0f, -0.62f)
                arcToRelative(6.15f, 6.15f, 0.0f, false, true, 5.18f, 0.0f)
                curveToRelative(2.26f, 2.59f, -1.16f, 7.0f, -3.08f, 6.57f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.91f, 20.9f)
                curveToRelative(2.28f, 0.14f, 9.09f, -0.43f, 9.17f, -7.24f)
                arcToRelative(95.29f, 95.29f, 0.0f, false, true, 4.33f, 16.4f)
                curveToRelative(-3.5f, -9.09f, -11.63f, -7.48f, -13.5f, -9.16f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.94f, 76.73f)
                curveToRelative(-1.57f, 0.18f, -3.0f, -0.18f, -3.22f, -1.79f)
                lineToRelative(-0.36f, -2.41f)
                arcToRelative(8.62f, 8.62f, 0.0f, false, true, 4.83f, -1.43f)
                arcToRelative(1.12f, 1.12f, 0.0f, false, false, -0.45f, -1.3f)
                curveToRelative(-1.29f, 0.0f, -2.72f, -0.67f, -3.89f, 0.0f)
                curveToRelative(0.18f, -0.94f, 0.23f, -1.79f, 1.3f, -2.1f)
                arcToRelative(8.71f, 8.71f, 0.0f, false, true, 4.51f, 0.67f)
                curveToRelative(0.27f, 2.91f, -0.13f, 6.52f, -2.72f, 8.36f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(83.22f, 70.47f)
                lineToRelative(-1.0f, 0.31f)
                curveToRelative(2.19f, -2.14f, 3.0f, -4.82f, 3.71f, -7.55f)
                curveToRelative(1.0f, -1.65f, 2.5f, -3.17f, 3.0f, -5.0f)
                curveToRelative(-1.51f, 4.2f, -2.23f, 8.81f, -5.76f, 12.25f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(75.49f, 62.42f)
                curveTo(76.2f, 60.9f, 73.66f, 61.48f, 74.0f, 60.0f)
                curveToRelative(-0.1f, -1.34f, 1.0f, -2.5f, -0.32f, -3.4f)
                curveToRelative(0.5f, -1.07f, 0.54f, -2.72f, 2.28f, -3.39f)
                curveToRelative(4.78f, 0.17f, 6.93f, 5.23f, 8.18f, 9.0f)
                arcToRelative(7.43f, 7.43f, 0.0f, false, true, -1.3f, 5.0f)
                curveToRelative(-0.62f, -2.37f, -2.59f, -5.0f, -5.14f, -5.5f)
                arcToRelative(12.86f, 12.86f, 0.0f, false, false, -2.23f, 0.67f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.07f, 22.65f)
                arcTo(121.18f, 121.18f, 0.0f, false, true, 89.48f, 56.3f)
                curveToRelative(-3.15f, -1.63f, 1.83f, -14.26f, 0.17f, -20.92f)
                curveToRelative(-0.22f, -2.19f, -3.17f, -4.2f, -1.16f, -6.3f)
                curveToRelative(2.0f, -4.91f, 3.44f, -12.47f, -0.62f, -16.89f)
                verticalLineTo(9.77f)
                curveToRelative(3.71f, 3.35f, 3.35f, 8.4f, 4.2f, 12.88f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.9f, 33.85f)
                arcToRelative(70.47f, 70.47f, 0.0f, false, false, -0.07f, -12.58f)
                horizontalLineToRelative(0.38f)
                arcToRelative(71.76f, 71.76f, 0.0f, false, true, 0.0f, 12.61f)
                curveToRelative(-0.49f, 4.18f, -1.11f, 8.24f, -1.75f, 12.34f)
                lineToRelative(-0.37f, 0.0f)
                curveToRelative(0.64f, -4.1f, 1.28f, -8.14f, 1.77f, -12.32f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(73.0f, 43.74f)
                lineToRelative(-0.37f, 0.0f)
                curveToRelative(0.19f, -6.59f, 2.09f, -13.12f, 1.46f, -19.71f)
                lineTo(74.5f, 24.0f)
                curveToRelative(0.63f, 6.62f, -1.27f, 13.18f, -1.46f, 19.79f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 14.28f)
                curveToRelative(1.34f, 1.35f, 1.25f, 3.54f, 1.92f, 5.32f)
                curveToRelative(0.54f, 10.69f, 0.0f, 22.58f, -2.41f, 32.81f)
                lineTo(78.0f, 52.0f)
                arcToRelative(122.34f, 122.34f, 0.0f, false, false, 2.0f, -37.69f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.36f, 47.89f)
                lineToRelative(-0.37f, 0.0f)
                arcToRelative(132.0f, 132.0f, 0.0f, false, false, 0.81f, -29.2f)
                lineToRelative(0.36f, -0.06f)
                arcToRelative(132.94f, 132.94f, 0.0f, false, true, -0.8f, 29.3f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(87.65f, 37.69f)
                horizontalLineTo(88.0f)
                curveToRelative(0.37f, 4.89f, -0.83f, 9.63f, -1.69f, 14.4f)
                lineTo(86.0f, 52.0f)
                curveToRelative(0.86f, -4.75f, 2.05f, -9.48f, 1.69f, -14.35f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(87.65f, 24.52f)
                verticalLineTo(17.93f)
                horizontalLineTo(88.0f)
                verticalLineToRelative(6.59f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(77.77f, 5.25f)
                horizontalLineToRelative(-0.41f)
                curveToRelative(-0.19f, 0.07f, -0.33f, 0.74f, -0.51f, 1.2f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, -0.65f, 0.09f)
                arcToRelative(7.24f, 7.24f, 0.0f, false, true, 0.72f, -2.22f)
                arcToRelative(3.21f, 3.21f, 0.0f, false, true, 2.73f, -1.61f)
                curveToRelative(2.0f, 0.4f, 4.2f, 1.0f, 5.0f, 3.0f)
                curveToRelative(1.43f, 2.77f, 0.22f, 6.0f, -1.43f, 8.22f)
                curveToRelative(-1.3f, -1.21f, -2.46f, -2.37f, -4.51f, -2.1f)
                curveToRelative(-1.21f, -4.5f, -1.12f, -5.37f, -0.94f, -6.62f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(71.47f, 81.37f)
                arcToRelative(124.0f, 124.0f, 0.0f, false, true, -5.81f, -27.0f)
                curveToRelative(-1.25f, -14.21f, -0.09f, -30.21f, 7.1f, -42.33f)
                curveToRelative(0.54f, 0.85f, 0.14f, 1.48f, 0.94f, 2.23f)
                curveToRelative(-4.0f, 13.37f, -8.0f, 29.28f, -3.35f, 43.63f)
                curveToRelative(-0.45f, 3.57f, -0.94f, 8.0f, 2.24f, 10.46f)
                curveToRelative(0.08f, 5.0f, 0.17f, 10.14f, 2.41f, 14.3f)
                curveToRelative(-1.39f, 0.09f, -2.41f, -0.67f, -3.53f, -1.3f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(79.33f, 82.54f)
                curveToRelative(-2.0f, -5.23f, -3.3f, -11.76f, -1.61f, -17.57f)
                arcToRelative(7.72f, 7.72f, 0.0f, false, true, 2.91f, 2.73f)
                curveToRelative(-1.7f, 6.75f, 0.71f, 12.51f, 2.9f, 18.06f)
                curveToRelative(-1.92f, 1.74f, -3.13f, -2.0f, -4.2f, -3.22f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.57f, 90.72f)
                arcToRelative(10.25f, 10.25f, 0.0f, false, true, -3.0f, 1.78f)
                lineToRelative(-0.8f, -2.27f)
                arcToRelative(13.09f, 13.09f, 0.0f, false, true, 3.84f, 0.49f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.92f, 90.64f)
                curveToRelative(1.0f, -1.68f, 2.0f, -0.55f, 2.75f, -0.39f)
                lineToRelative(-1.23f, 1.63f)
                curveToRelative(-0.49f, -0.42f, -0.88f, -1.14f, -1.52f, -1.24f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(71.47f, 93.0f)
                curveToRelative(1.12f, -0.94f, 2.81f, -2.42f, 4.33f, -1.0f)
                lineTo(74.2f, 93.8f)
                curveToRelative(-0.72f, -0.31f, -2.2f, 0.0f, -2.73f, -0.8f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(77.59f, 94.43f)
                curveToRelative(-0.09f, -0.9f, 0.85f, -1.12f, 1.43f, -1.43f)
                curveToRelative(0.49f, 0.58f, 1.88f, 0.0f, 1.79f, 1.12f)
                curveToRelative(-0.9f, 0.57f, -2.64f, 1.65f, -3.22f, 0.31f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(81.25f, 96.66f)
                curveToRelative(0.72f, -0.27f, 1.0f, -1.0f, 1.3f, -1.61f)
                curveToRelative(0.67f, -1.0f, 2.32f, 0.0f, 3.22f, -0.8f)
                curveToRelative(0.53f, 0.62f, -1.3f, 1.61f, -1.3f, 1.61f)
                reflectiveCurveToRelative(-2.0f, 1.14f, -3.22f, 0.8f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(67.76f, 103.0f)
                curveToRelative(-0.18f, -2.0f, 0.8f, -3.58f, 1.3f, -5.32f)
                curveToRelative(2.68f, 0.67f, 4.42f, -0.54f, 6.92f, -0.81f)
                lineToRelative(0.45f, 0.49f)
                curveToRelative(-1.16f, 1.88f, -3.31f, 1.08f, -5.14f, 1.3f)
                curveToRelative(-1.12f, 1.0f, 0.8f, 1.43f, 1.3f, 1.92f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, false, 10.0f, -0.49f)
                curveToRelative(1.92f, -1.43f, 4.33f, -3.08f, 5.32f, -5.32f)
                curveToRelative(-0.36f, 3.22f, -3.43f, 6.1f, -7.26f, 7.31f)
                curveToRelative(-4.16f, 1.32f, -8.21f, 0.6f, -10.93f, -2.48f)
                curveToRelative(-1.61f, 0.35f, -0.62f, 2.77f, -1.61f, 3.71f)
                lineToRelative(-0.31f, -0.31f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(65.35f, 181.32f)
                curveToRelative(-0.23f, -0.85f, 0.7f, -1.27f, 0.0f, -2.17f)
                curveToRelative(-0.85f, -0.49f, 0.06f, -1.27f, 0.2f, -2.0f)
                curveToRelative(-0.32f, -0.09f, -0.45f, -0.45f, -0.81f, -0.32f)
                lineToRelative(0.14f, -1.11f)
                curveToRelative(0.84f, -0.23f, 1.16f, 1.07f, 1.78f, 1.61f)
                curveToRelative(0.4f, 1.7f, -0.76f, 2.67f, -1.29f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(71.15f, 177.48f)
                curveToRelative(2.87f, -0.41f, 6.17f, -0.36f, 8.67f, -2.0f)
                curveToRelative(-0.37f, 1.72f, -7.0f, 2.79f, -8.67f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(70.49f, 156.87f)
                arcToRelative(4.59f, 4.59f, 0.0f, false, true, -1.93f, 0.31f)
                curveToRelative(0.7f, -1.32f, 1.57f, -2.72f, 1.43f, -2.86f)
                horizontalLineToRelative(0.81f)
                curveToRelative(1.25f, 1.52f, 5.64f, 6.08f, 2.93f, 8.52f)
                lineToRelative(-0.83f, 0.33f)
                curveToRelative(1.88f, -3.6f, -1.0f, -5.45f, -2.41f, -6.3f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(78.71f, 162.0f)
                curveToRelative(2.37f, -1.3f, 6.55f, 0.29f, 7.73f, 2.41f)
                arcTo(15.69f, 15.69f, 0.0f, false, false, 78.71f, 162.0f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(73.21f, 167.46f)
                curveToRelative(0.81f, -0.31f, 1.92f, -0.71f, 2.59f, -0.31f)
                curveToRelative(-0.53f, 0.0f, -2.37f, 1.56f, -2.59f, 0.31f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.59f, 170.37f)
                arcToRelative(1.79f, 1.79f, 0.0f, false, false, 2.23f, -0.49f)
                curveToRelative(0.72f, 0.22f, 0.81f, 2.0f, 0.81f, 2.0f)
                curveToRelative(-0.58f, 0.54f, -1.59f, 0.54f, -2.55f, 0.81f)
                curveToRelative(-1.12f, -0.4f, -0.23f, -1.39f, -0.49f, -2.28f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.31f, 172.16f)
                arcToRelative(11.84f, 11.84f, 0.0f, false, true, -11.93f, 1.43f)
                curveToRelative(-0.26f, -0.94f, 0.45f, -1.79f, 0.68f, -2.73f)
                curveToRelative(0.44f, 0.67f, -0.32f, 2.1f, -0.32f, 2.1f)
                curveToRelative(-0.13f, 0.89f, 8.43f, 2.74f, 13.81f, -4.2f)
                curveToRelative(-0.09f, 1.2f, -1.16f, 2.41f, -2.24f, 3.4f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(79.0f, 169.25f)
                curveToRelative(-2.58f, -1.2f, -1.79f, -2.59f, -1.79f, -2.59f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, true, 3.4f, 0.8f)
                curveToRelative(0.13f, 0.72f, -1.0f, 1.25f, -1.61f, 1.79f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(89.64f, 160.78f)
                curveToRelative(0.32f, 1.88f, 0.89f, 7.0f, 0.0f, 6.68f)
                arcToRelative(53.82f, 53.82f, 0.0f, false, false, -1.47f, -9.16f)
                curveToRelative(0.51f, 1.0f, 1.26f, 1.32f, 1.46f, 2.48f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(75.49f, 156.07f)
                curveToRelative(-1.47f, -3.23f, -4.74f, -5.64f, -5.32f, -9.17f)
                curveToRelative(-2.37f, -7.1f, -4.6f, -14.21f, -5.45f, -21.9f)
                lineToRelative(0.31f, -0.31f)
                curveToRelative(4.52f, 10.0f, 10.86f, 19.49f, 10.46f, 31.38f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.53f, 114.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.56f, -0.55f)
                curveToRelative(0.11f, -1.91f, -0.72f, -3.88f, 1.07f, -5.26f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, 1.3f, -3.22f)
                curveToRelative(0.67f, 0.72f, 0.4f, 2.33f, 1.61f, 2.41f)
                curveToRelative(0.53f, -1.25f, 0.17f, -2.86f, 0.93f, -4.0f)
                curveToRelative(0.58f, 0.9f, 0.54f, 3.27f, 2.28f, 3.85f)
                lineToRelative(0.49f, -0.45f)
                arcToRelative(23.45f, 23.45f, 0.0f, false, true, 0.14f, -4.2f)
                curveToRelative(1.0f, 1.56f, 2.5f, 3.75f, 2.9f, 2.9f)
                curveToRelative(0.36f, 0.58f, 1.3f, 2.91f, 1.3f, 2.91f)
                curveToRelative(-0.22f, 2.77f, -0.54f, 5.94f, -2.91f, 8.0f)
                curveToRelative(-0.35f, -0.94f, -7.55f, -2.41f, -7.55f, -2.41f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.3f, 134.12f)
                lineToRelative(-0.38f, -1.2f)
                curveToRelative(-0.22f, -0.66f, -0.35f, -1.35f, -0.57f, -2.0f)
                lineToRelative(-1.0f, -0.25f)
                curveToRelative(0.06f, -0.27f, 0.13f, -0.54f, 0.2f, -0.81f)
                lineToRelative(0.06f, -0.29f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, true, 0.21f, -0.33f)
                lineToRelative(0.2f, -0.15f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, 0.78f, 0.11f)
                lineToRelative(0.06f, 0.1f)
                lineToRelative(0.23f, 0.4f)
                curveToRelative(0.0f, 0.11f, 0.09f, 0.21f, 0.13f, 0.32f)
                curveToRelative(0.0f, -0.36f, 0.0f, -0.72f, -0.07f, -1.08f)
                horizontalLineToRelative(1.11f)
                curveToRelative(0.12f, 1.53f, 0.12f, 3.07f, 0.12f, 4.6f)
                verticalLineToRelative(0.34f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.55f, 0.56f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, -0.49f, -0.3f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(135.5f, 136.76f)
                arcToRelative(81.47f, 81.47f, 0.0f, false, false, 1.43f, -18.82f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.11f, -0.49f)
                curveToRelative(-2.37f, 3.17f, -6.23f, 6.37f, -9.34f, 7.24f)
                curveToRelative(-3.0f, 0.71f, -6.0f, 1.07f, -8.36f, -1.12f)
                lineToRelative(0.13f, -0.49f)
                curveToRelative(2.15f, 1.83f, 8.27f, 1.41f, 11.44f, -1.61f)
                arcToRelative(24.94f, 24.94f, 0.0f, false, false, 5.95f, -7.55f)
                curveToRelative(2.46f, -13.32f, -0.68f, -26.29f, -3.36f, -38.49f)
                curveToRelative(-2.1f, -3.71f, -8.48f, -7.92f, -9.0f, -9.47f)
                curveToRelative(6.34f, 2.46f, 12.33f, 8.84f, 13.0f, 15.77f)
                curveToRelative(3.49f, 14.62f, 2.0f, 53.57f, -0.1f, 57.87f)
                curveToRelative(-0.74f, 1.49f, -9.23f, 13.38f, -13.93f, 13.87f)
                lineToRelative(-0.31f, -0.31f)
                curveToRelative(-0.09f, -0.27f, 0.18f, -0.45f, 0.31f, -0.63f)
                curveToRelative(0.0f, -0.62f, 1.3f, -0.8f, 2.0f, -1.16f)
                curveToRelative(5.18f, -3.39f, 10.0f, -8.58f, 11.26f, -14.61f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(107.48f, 160.89f)
                curveToRelative(1.0f, -5.63f, 1.43f, -11.53f, 2.6f, -17.07f)
                curveToRelative(3.08f, 0.13f, 6.79f, 1.79f, 7.86f, 5.14f)
                curveToRelative(3.0f, 6.79f, 0.45f, 14.84f, 0.31f, 22.08f)
                curveToRelative(-1.61f, 8.4f, -4.0f, 16.9f, -8.49f, 24.27f)
                curveToRelative(-1.52f, -0.85f, 0.67f, -2.37f, 0.63f, -3.71f)
                curveToRelative(2.0f, -9.0f, 6.0f, -20.83f, 0.31f, -29.41f)
                arcToRelative(3.38f, 3.38f, 0.0f, false, false, -3.22f, -1.3f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.18f, 187.58f)
                arcToRelative(7.07f, 7.07f, 0.0f, false, true, -0.63f, -2.55f)
                curveToRelative(1.84f, 0.71f, 4.52f, 1.48f, 6.26f, -0.31f)
                arcToRelative(11.46f, 11.46f, 0.0f, false, true, 0.67f, 3.0f)
                curveToRelative(-1.7f, 0.45f, -4.6f, 1.35f, -6.3f, -0.17f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(99.31f, 190.17f)
                arcToRelative(92.18f, 92.18f, 0.0f, false, false, 7.23f, -24.45f)
                curveToRelative(1.17f, -0.36f, 1.84f, 1.07f, 2.42f, 1.92f)
                curveToRelative(1.74f, 2.69f, 0.63f, 6.21f, 0.94f, 9.35f)
                curveToRelative(-1.0f, 5.32f, -1.61f, 10.9f, -3.85f, 15.77f)
                arcToRelative(65.29f, 65.29f, 0.0f, false, false, -6.74f, -2.59f)
            }
        }
        .build()
    }

