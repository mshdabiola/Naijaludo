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
import com.mshdabiola.ludo.screen.game.component.bigcat.Bigcat

fun Car.getBlue(iconColor:Long, accentColor:Long): ImageVector
{
    return Builder(name = "Blue8", defaultWidth = 200.0.dp, defaultHeight = 200.0.dp,
                viewportWidth = 200.0f, viewportHeight = 200.0f).apply {
            path(fill = SolidColor(Color(iconColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.26f, 91.72f)
                curveToRelative(-0.73f, 1.9f, -0.36f, 4.28f, -0.89f, 6.26f)
                curveToRelative(-0.89f, 8.54f, -5.63f, 18.0f, -14.57f, 20.68f)
                curveToRelative(-12.26f, 5.74f, -24.84f, 10.84f, -39.0f, 11.93f)
                lineToRelative(-1.46f, 2.91f)
                curveToRelative(-3.28f, 5.1f, -10.36f, 3.0f, -15.58f, 3.08f)
                arcToRelative(94.12f, 94.12f, 0.0f, false, true, -12.38f, 14.12f)
                curveToRelative(-1.62f, 1.82f, -5.4f, 5.31f, -16.47f, 7.0f)
                curveTo(79.62f, 159.0f, 61.47f, 156.0f, 48.5f, 146.33f)
                curveToRelative(-30.83f, 2.1f, -44.77f, -3.0f, -45.51f, -6.22f)
                curveToRelative(-0.24f, -6.24f, 14.07f, -3.86f, 15.2f, -10.25f)
                arcToRelative(24.58f, 24.58f, 0.0f, false, true, -5.26f, -3.47f)
                curveToRelative(-5.14f, -3.53f, -5.83f, -9.11f, -6.56f, -14.28f)
                arcToRelative(80.26f, 80.26f, 0.0f, false, true, -4.49f, -10.32f)
                curveToRelative(-1.49f, -6.0f, -3.68f, -14.89f, 0.73f, -20.27f)
                curveToRelative(9.55f, -7.89f, 22.5f, -1.78f, 33.22f, -0.73f)
                curveToRelative(2.31f, 0.77f, 5.1f, 0.93f, 6.56f, 3.2f)
                arcToRelative(20.75f, 20.75f, 0.0f, false, false, 6.23f, -7.56f)
                curveToRelative(-0.32f, -5.0f, 1.46f, -9.84f, 2.91f, -14.41f)
                curveToRelative(1.66f, -3.15f, 2.47f, -6.75f, 5.83f, -9.0f)
                curveToRelative(5.75f, -3.8f, 13.47f, -1.0f, 19.38f, 0.41f)
                curveToRelative(14.37f, -8.78f, 31.4f, -11.94f, 49.25f, -11.33f)
                arcToRelative(136.13f, 136.13f, 0.0f, false, true, 63.37f, 14.24f)
                curveTo(193.53f, 59.0f, 200.0f, 61.9f, 200.0f, 67.85f)
                curveToRelative(-1.0f, 7.77f, -4.89f, 16.0f, -1.74f, 23.87f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.9f, 116.35f)
                curveToRelative(-2.23f, -3.23f, -2.43f, -7.6f, -2.0f, -11.53f)
                curveToRelative(-8.5f, 9.59f, -18.62f, 17.6f, -29.58f, 22.46f)
                curveToRelative(11.33f, -1.78f, 21.65f, -5.83f, 31.6f, -10.93f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.84f, 131.64f)
                arcToRelative(81.12f, 81.12f, 0.0f, false, true, -11.65f, 1.3f)
                lineToRelative(-0.85f, 1.45f)
                curveToRelative(4.37f, -0.48f, 10.19f, 2.07f, 12.5f, -2.75f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.81f, 139.94f)
                curveToRelative(2.07f, 2.92f, 23.35f, 6.23f, 36.0f, 5.09f)
                lineToRelative(3.52f, -0.28f)
                lineToRelative(-2.18f, -1.45f)
                curveToRelative(-8.95f, 0.93f, -18.33f, 0.44f, -26.23f, -2.35f)
                arcToRelative(5.87f, 5.87f, 0.0f, false, true, -2.18f, -1.9f)
                curveToRelative(-0.22f, -0.66f, 0.15f, -1.39f, 1.47f, -1.82f)
                curveToRelative(4.31f, 0.31f, 10.91f, -1.58f, 16.42f, -2.39f)
                lineToRelative(-2.0f, -1.34f)
                curveTo(22.0f, 135.0f, 7.88f, 136.62f, 5.81f, 139.94f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.89f, 88.0f)
                arcToRelative(1.47f, 1.47f, 0.0f, false, true, -1.55f, -0.25f)
                curveToRelative(-4.86f, 4.15f, -0.27f, 21.0f, 5.2f, 25.82f)
                arcToRelative(1.64f, 1.64f, 0.0f, false, true, 1.1f, -1.85f)
                curveToRelative(0.36f, 0.13f, 0.64f, 0.69f, 1.11f, 0.35f)
                curveToRelative(-5.37f, -6.0f, -9.33f, -16.31f, -4.53f, -23.44f)
                lineToRelative(1.0f, -1.58f)
                lineTo(9.89f, 88.0f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.74f, 92.89f)
                curveToRelative(-0.6f, -2.06f, -2.33f, 3.37f, -3.63f, -1.62f)
                curveToRelative(-0.72f, 1.32f, -1.46f, 1.0f, -2.0f, 0.45f)
                curveToRelative(-1.62f, 4.72f, 1.37f, 12.38f, 4.37f, 17.63f)
                curveToRelative(0.8f, -2.45f, 1.82f, -0.44f, 2.92f, -0.89f)
                curveToRelative(-0.48f, -2.3f, 0.8f, -0.56f, 1.29f, -0.72f)
                arcToRelative(23.8f, 23.8f, 0.0f, false, true, -2.92f, -14.85f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.92f, 100.62f)
                lineToRelative(0.32f, -0.29f)
                curveToRelative(-7.81f, -10.84f, -11.58f, -22.79f, -1.78f, -39.2f)
                curveToRelative(-13.0f, 4.25f, -7.59f, 36.78f, 1.46f, 39.49f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(68.0f, 65.0f)
                curveToRelative(-0.28f, 0.65f, -1.37f, -0.08f, -1.74f, 0.73f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, true, -1.45f, -0.56f)
                curveToRelative(-5.17f, 7.44f, -3.68f, 19.41f, -1.74f, 25.0f)
                curveToRelative(0.81f, 0.28f, 0.44f, 1.45f, 1.45f, 1.29f)
                arcTo(1.62f, 1.62f, 0.0f, false, true, 66.0f, 89.9f)
                curveToRelative(0.32f, 0.21f, 0.49f, 0.81f, 1.0f, 0.57f)
                curveToRelative(-4.0f, -7.0f, -5.0f, -15.68f, 0.45f, -23.87f)
                lineToRelative(1.29f, -1.33f)
                lineTo(68.0f, 65.0f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(195.91f, 64.65f)
                lineToRelative(-4.65f, -3.23f)
                curveToRelative(-15.29f, -9.0f, -32.7f, -12.87f, -50.54f, -15.7f)
                curveToRelative(-12.71f, -1.21f, -26.0f, -1.74f, -38.32f, 1.0f)
                curveTo(92.12f, 48.8f, 82.17f, 51.71f, 74.0f, 58.82f)
                curveToRelative(3.44f, 11.9f, 3.8f, 27.47f, -0.73f, 39.0f)
                curveToRelative(-2.0f, 5.18f, -6.91f, 10.12f, -12.66f, 10.52f)
                curveToRelative(-0.57f, -0.32f, -1.5f, -0.6f, -1.34f, -1.45f)
                curveToRelative(-5.22f, -4.49f, -6.51f, -11.13f, -8.45f, -17.2f)
                lineToRelative(-1.46f, -6.0f)
                curveToRelative(-1.22f, 9.34f, 2.34f, 19.83f, 10.2f, 25.92f)
                curveToRelative(5.59f, 4.06f, 11.81f, 1.0f, 15.17f, 6.72f)
                arcToRelative(2.32f, 2.32f, 0.0f, false, true, -0.61f, 2.59f)
                curveToRelative(-1.66f, -0.36f, -2.0f, -2.32f, -3.59f, -3.0f)
                curveToRelative(-2.69f, -1.71f, -11.13f, -1.1f, -17.53f, -8.72f)
                arcToRelative(34.54f, 34.54f, 0.0f, false, true, -4.65f, -7.56f)
                curveToRelative(-0.13f, -0.29f, -0.73f, 0.4f, -0.85f, 0.56f)
                curveToRelative(0.72f, 0.61f, 1.55f, 5.3f, -2.66f, 7.4f)
                curveToRelative(-2.75f, 0.25f, -9.56f, 1.83f, -11.79f, 0.33f)
                curveToRelative(1.05f, -4.74f, -0.89f, -9.14f, 0.61f, -13.72f)
                curveToRelative(0.36f, -0.64f, 0.36f, -1.41f, 1.13f, -1.86f)
                curveToRelative(3.84f, 1.34f, 8.7f, 1.34f, 12.26f, -0.6f)
                arcToRelative(25.12f, 25.12f, 0.0f, false, true, 0.13f, -9.0f)
                curveToRelative(-1.46f, 2.0f, -3.53f, 3.64f, -4.38f, 5.83f)
                curveToRelative(-2.91f, -0.69f, -5.54f, -2.0f, -8.74f, -2.0f)
                reflectiveCurveToRelative(-6.27f, 0.61f, -7.69f, 3.76f)
                curveTo(21.63f, 97.38f, 28.55f, 104.0f, 26.0f, 111.82f)
                curveToRelative(-0.81f, 5.0f, -1.64f, 8.17f, -6.62f, 10.68f)
                curveToRelative(-2.75f, 0.49f, -8.63f, -3.56f, -10.25f, -6.0f)
                curveToRelative(1.53f, 4.0f, 5.66f, 9.1f, 10.2f, 11.08f)
                curveToRelative(8.0f, 0.44f, 14.6f, 4.13f, 20.67f, 9.18f)
                curveToRelative(8.54f, 8.45f, 19.12f, 13.47f, 29.56f, 17.48f)
                curveToRelative(4.48f, 1.54f, 16.13f, 2.0f, 19.75f, 2.26f)
                curveToRelative(4.23f, 0.35f, 9.38f, -1.61f, 13.91f, -1.61f)
                curveToRelative(-5.5f, -0.09f, -21.18f, -0.21f, -26.52f, -1.83f)
                arcToRelative(164.87f, 164.87f, 0.0f, false, true, -12.95f, -24.47f)
                curveToRelative(-0.08f, -0.2f, 0.17f, -0.28f, 0.29f, -0.44f)
                curveToRelative(5.54f, 2.1f, 11.77f, 2.46f, 17.93f, 3.07f)
                lineToRelative(24.0f, 0.73f)
                curveToRelative(7.12f, -0.45f, 14.81f, 0.44f, 21.41f, -1.34f)
                curveToRelative(10.6f, -2.43f, 21.65f, -3.84f, 30.43f, -10.6f)
                curveToRelative(10.52f, -7.28f, 20.92f, -17.31f, 29.46f, -26.94f)
                curveToRelative(0.92f, 1.86f, 2.42f, -0.2f, 3.64f, -0.32f)
                curveToRelative(1.05f, 0.0f, 2.14f, -0.61f, 3.0f, 0.16f)
                arcToRelative(4.15f, 4.15f, 0.0f, false, true, 1.34f, 2.75f)
                curveToRelative(-0.9f, 1.46f, -1.3f, -0.81f, -2.19f, -0.57f)
                curveToRelative(-3.32f, 0.0f, -6.0f, 3.0f, -7.16f, 5.83f)
                curveToRelative(-1.58f, 3.68f, -2.71f, 9.35f, -0.12f, 12.94f)
                curveToRelative(3.76f, -1.09f, 5.91f, -5.13f, 7.28f, -8.41f)
                arcToRelative(36.51f, 36.51f, 0.0f, false, false, 2.47f, -14.56f)
                curveToRelative(-3.11f, -5.06f, 0.16f, -10.8f, 0.57f, -16.0f)
                curveToRelative(0.28f, -3.24f, 3.31f, -7.53f, -0.29f, -10.2f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(37.0f, 102.0f)
                arcToRelative(12.09f, 12.09f, 0.0f, false, false, 8.69f, -2.0f)
                lineToRelative(-0.37f, -1.1f)
                curveToRelative(-4.22f, 2.2f, -6.24f, 2.0f, -8.44f, 1.4f)
                arcToRelative(18.11f, 18.11f, 0.0f, false, true, 0.09f, -3.1f)
                reflectiveCurveToRelative(3.0f, 1.33f, 9.0f, -0.93f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, 0.0f, -1.1f)
                curveToRelative(-4.64f, 1.71f, -9.52f, -0.32f, -10.52f, -0.49f)
                curveToRelative(-0.44f, 0.48f, -0.54f, 12.07f, -0.54f, 12.07f)
                curveToRelative(7.33f, 1.14f, 12.77f, -2.28f, 10.27f, -2.35f)
                arcToRelative(14.09f, 14.09f, 0.0f, false, true, -8.8f, 1.54f)
                arcTo(11.73f, 11.73f, 0.0f, false, true, 37.0f, 102.0f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.29f, 141.68f)
                curveToRelative(2.0f, -0.21f, 3.12f, -2.87f, 4.65f, -3.93f)
                arcToRelative(104.82f, 104.82f, 0.0f, false, true, -24.76f, -1.61f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.0f, 2.79f)
                curveToRelative(0.08f, 0.92f, -1.38f, 1.21f, -0.45f, 2.18f)
                curveToRelative(1.58f, 1.49f, 5.0f, 8.0f, 4.38f, 8.29f)
                horizontalLineToRelative(-0.29f)
                curveToRelative(0.77f, 1.0f, 2.55f, 0.29f, 2.91f, 1.74f)
                lineToRelative(9.0f, 0.89f)
                curveToRelative(-0.33f, -1.41f, 1.33f, -1.17f, 2.06f, -1.61f)
                curveToRelative(2.55f, -0.29f, 4.69f, -1.63f, 7.0f, -2.47f)
                curveToRelative(-1.62f, -1.29f, -4.73f, -0.85f, -5.5f, -3.2f)
                curveToRelative(0.0f, -1.05f, -0.69f, -2.15f, 0.0f, -3.07f)
            }
        }
        .build()
    }

