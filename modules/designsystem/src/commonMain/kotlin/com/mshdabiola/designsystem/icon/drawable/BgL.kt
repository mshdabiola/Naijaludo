package com.mshdabiola.designsystem.icon.drawable

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.icon.Drawable

public val Drawable.BgL: ImageVector
    get() {
        if (_bgL != null) {
            return _bgL!!
        }
        _bgL = Builder(
            name = "BgL",
            defaultWidth = 1600.0.dp,
            defaultHeight = 720.0.dp,
            viewportWidth = 1600.0f,
            viewportHeight = 720.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFFa2d2da)), stroke = null, fillAlpha = 0.7f,
                strokeAlpha =
                0.7f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero,
            ) {
                moveTo(0.0f, 720.0f)
                lineToRelative(0.0f, -720.0f)
                lineToRelative(1600.0f, -0.0f)
                lineToRelative(0.0f, 720.0f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFA1D5F4),
                    0.99f to Color(0xFFDAEFFD),
                    start =
                    Offset(486.5446f, 193.40413f),
                    end = Offset(438.8349f, 114.54763f),
                ),
                stroke =
                null,
                fillAlpha = 0.7f, strokeAlpha = 0.7f, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(372.87f, 169.42f)
                quadToRelative(3.17f, 0.0f, 6.8f, 0.18f)
                curveToRelative(-4.84f, -2.6f, -7.89f, -6.87f, -7.38f, -11.11f)
                curveToRelative(0.54f, -4.44f, 4.83f, -7.58f, 10.47f, -8.23f)
                arcTo(11.07f, 11.07f, 0.0f, false, true, 382.0f, 145.0f)
                curveToRelative(1.0f, -8.54f, 12.67f, -13.58f, 26.0f, -11.26f)
                arcToRelative(36.88f, 36.88f, 0.0f, false, true, 10.42f, 3.42f)
                curveToRelative(3.0f, -2.51f, 7.72f, -3.76f, 13.0f, -3.13f)
                arcToRelative(12.62f, 12.62f, 0.0f, false, true, -0.08f, -3.58f)
                curveToRelative(0.94f, -7.8f, 9.07f, -12.85f, 18.17f, -11.27f)
                curveToRelative(0.38f, 0.07f, 0.77f, 0.15f, 1.15f, 0.24f)
                arcToRelative(22.17f, 22.17f, 0.0f, false, true, 26.0f, -18.38f)
                arcToRelative(25.2f, 25.2f, 0.0f, false, true, 20.56f, 26.45f)
                arcToRelative(13.14f, 13.14f, 0.0f, false, true, 8.17f, 5.33f)
                curveToRelative(2.3f, -10.0f, 13.49f, -16.26f, 25.95f, -14.09f)
                curveToRelative(13.17f, 2.29f, 22.77f, 13.1f, 21.44f, 24.14f)
                arcToRelative(16.85f, 16.85f, 0.0f, false, true, -5.33f, 10.38f)
                curveToRelative(12.51f, 3.0f, 21.61f, 8.46f, 21.06f, 13.0f)
                curveToRelative(-0.42f, 3.51f, -6.38f, 5.59f, -14.83f, 5.74f)
                arcToRelative(7.71f, 7.71f, 0.0f, false, true, 0.86f, 4.35f)
                curveToRelative(-0.8f, 6.6f, -11.72f, 10.67f, -27.91f, 11.57f)
                curveToRelative(-3.37f, 6.35f, -18.13f, 9.67f, -38.17f, 9.24f)
                curveToRelative(-5.37f, 1.12f, -13.18f, 1.47f, -22.51f, 1.0f)
                curveToRelative(-1.83f, 0.06f, -3.83f, 0.06f, -6.0f, 0.0f)
                arcToRelative(3.15f, 3.15f, 0.0f, false, true, 1.19f, 2.46f)
                curveToRelative(-0.53f, 4.42f, -17.75f, 5.07f, -38.44f, 1.47f)
                reflectiveCurveToRelative(-37.05f, -10.1f, -36.51f, -14.52f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, true, 0.23f, -0.67f)
                curveToRelative(-5.0f, -1.33f, -9.57f, -2.69f, -13.54f, -4.0f)
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF9FD4F5),
                    0.98f to Color(0xFFEFF8FB),
                    start =
                    Offset(1512.04f, 144.0f),
                    end = Offset(1472.89f, 19.9f),
                ),
                stroke = null,
                fillAlpha = 0.7f, strokeAlpha = 0.7f, strokeLineWidth = 0.0f,
                strokeLineCap =
                Butt,
                strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd,
            ) {
                moveTo(1593.24f, 29.72f)
                arcToRelative(18.86f, 18.86f, 0.0f, false, false, -9.74f, 2.59f)
                curveToRelative(-1.0f, -4.21f, -4.12f, -7.29f, -7.81f, -7.29f)
                curveToRelative(-3.37f, 0.0f, -6.26f, 2.56f, -7.5f, 6.2f)
                arcToRelative(19.09f, 19.09f, 0.0f, false, false, -6.5f, -1.11f)
                arcToRelative(19.73f, 19.73f, 0.0f, false, false, -4.64f, 0.55f)
                arcToRelative(11.84f, 11.84f, 0.0f, false, false, 2.56f, -7.21f)
                curveToRelative(0.0f, -8.23f, -9.17f, -14.91f, -20.47f, -14.91f)
                reflectiveCurveToRelative(-20.48f, 6.68f, -20.48f, 14.91f)
                arcToRelative(12.47f, 12.47f, 0.0f, false, false, 4.1f, 8.94f)
                lineToRelative(-0.26f, 0.28f)
                arcToRelative(10.55f, 10.55f, 0.0f, false, false, -6.55f, -2.16f)
                curveToRelative(-4.85f, 0.0f, -8.85f, 3.0f, -9.35f, 6.83f)
                arcToRelative(26.08f, 26.08f, 0.0f, false, false, -9.45f, -1.74f)
                curveToRelative(-11.88f, 0.0f, -21.51f, 7.65f, -21.51f, 17.07f)
                curveToRelative(0.0f, 5.51f, 3.29f, 10.41f, 8.41f, 13.53f)
                lineTo(1484.0f, 66.2f)
                arcToRelative(6.28f, 6.28f, 0.0f, false, false, -6.0f, 3.55f)
                arcToRelative(12.37f, 12.37f, 0.0f, false, false, -6.14f, -1.59f)
                curveToRelative(-6.0f, 0.0f, -10.87f, 4.0f, -10.87f, 9.0f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, 0.07f, 1.0f)
                arcToRelative(11.56f, 11.56f, 0.0f, false, false, -2.16f, -0.2f)
                arcToRelative(11.32f, 11.32f, 0.0f, false, false, -3.0f, 0.41f)
                arcToRelative(17.3f, 17.3f, 0.0f, false, false, -12.84f, -5.51f)
                curveToRelative(-9.23f, 0.0f, -16.71f, 6.85f, -16.71f, 15.3f)
                arcToRelative(14.53f, 14.53f, 0.0f, false, false, 4.16f, 10.1f)
                arcToRelative(5.53f, 5.53f, 0.0f, false, false, -2.75f, 3.51f)
                arcToRelative(4.82f, 4.82f, 0.0f, false, false, -2.45f, -0.67f)
                arcToRelative(5.27f, 5.27f, 0.0f, false, false, -4.89f, 3.68f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -5.35f, -1.33f)
                curveToRelative(-4.75f, 0.0f, -8.65f, 2.77f, -9.14f, 6.31f)
                curveToRelative(-0.29f, 0.0f, -0.59f, 0.0f, -0.89f, 0.0f)
                curveToRelative(-5.53f, 0.0f, -10.0f, 3.87f, -10.0f, 8.63f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, false, 3.66f, 6.67f)
                curveToRelative(-3.0f, 0.0f, -5.33f, 2.0f, -5.33f, 4.51f)
                reflectiveCurveToRelative(2.43f, 4.51f, 5.43f, 4.51f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, false, 3.89f, -1.37f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, false, 1.22f, 0.77f)
                curveToRelative(-8.68f, 1.27f, -14.62f, 2.87f, -16.55f, 4.63f)
                verticalLineToRelative(2.52f)
                curveToRelative(4.67f, 4.28f, 32.79f, 7.57f, 66.79f, 7.57f)
                curveToRelative(30.49f, 0.0f, 56.25f, -2.65f, 64.61f, -6.28f)
                horizontalLineToRelative(2.86f)
                curveToRelative(42.0f, 0.0f, 64.88f, -1.53f, 78.41f, -3.73f)
                lineTo(1600.03f, 30.89f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 1593.24f, 29.72f)
                close()
                moveTo(1404.24f, 129.81f)
                curveToRelative(0.0f, -0.09f, 0.0f, -0.17f, 0.0f, -0.26f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, 0.0f, -0.15f)
                lineToRelative(0.47f, 0.21f)
                arcTo(5.11f, 5.11f, 0.0f, false, false, 1404.19f, 129.81f)
                close()
            }
            path(
                fill = null, stroke = null, fillAlpha = 0.7f, strokeAlpha = 0.7f,
                strokeLineWidth =
                0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(1029.15f, 46.63f)
                arcToRelative(13.62f, 13.62f, 0.0f, false, true, 11.52f, 5.84f)
                arcToRelative(4.62f, 4.62f, 0.0f, false, true, 1.0f, -0.1f)
                arcToRelative(5.39f, 5.39f, 0.0f, false, true, 4.73f, 3.23f)
                arcToRelative(16.37f, 16.37f, 0.0f, false, true, 12.75f, -5.74f)
                curveToRelative(8.6f, 0.0f, 15.57f, 6.0f, 15.57f, 13.44f)
                arcToRelative(11.28f, 11.28f, 0.0f, false, true, -0.12f, 1.66f)
                curveToRelative(6.17f, 0.58f, 11.0f, 6.44f, 11.0f, 13.58f)
                arcToRelative(15.33f, 15.33f, 0.0f, false, true, -0.86f, 5.07f)
                arcToRelative(8.82f, 8.82f, 0.0f, false, true, 8.24f, 8.56f)
                arcToRelative(7.42f, 7.42f, 0.0f, false, true, -0.12f, 1.34f)
                arcToRelative(9.73f, 9.73f, 0.0f, false, true, 4.29f, -1.0f)
                arcToRelative(9.05f, 9.05f, 0.0f, false, true, 9.3f, 8.78f)
                curveToRelative(0.0f, 0.22f, 0.0f, 0.43f, 0.0f, 0.64f)
                curveToRelative(4.78f, 0.66f, 8.0f, 2.0f, 8.0f, 3.49f)
                curveToRelative(0.0f, 2.0f, -6.0f, 3.73f, -13.59f, 3.92f)
                arcToRelative(9.85f, 9.85f, 0.0f, false, true, -3.73f, 0.74f)
                arcToRelative(9.65f, 9.65f, 0.0f, false, true, -4.6f, -1.15f)
                curveToRelative(-3.49f, -0.46f, -6.2f, -1.27f, -7.46f, -2.26f)
                curveToRelative(-1.22f, 0.12f, -2.51f, 0.18f, -3.83f, 0.18f)
                curveToRelative(-8.0f, 0.0f, -14.62f, -2.27f, -15.72f, -5.23f)
                arcToRelative(76.15f, 76.15f, 0.0f, false, true, -12.19f, 0.93f)
                curveToRelative(-12.33f, 0.0f, -22.52f, -2.59f, -24.0f, -5.95f)
                quadToRelative(-3.28f, 0.21f, -6.77f, 0.21f)
                curveToRelative(-18.34f, 0.0f, -33.21f, -4.5f, -33.21f, -10.0f)
                curveToRelative(0.0f, -4.0f, 7.57f, -7.38f, 18.56f, -9.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -2.84f, -7.0f)
                curveToRelative(0.0f, -5.73f, 5.0f, -10.4f, 11.19f, -10.57f)
                arcToRelative(10.06f, 10.06f, 0.0f, false, true, -0.28f, -2.34f)
                curveToRelative(0.0f, -6.23f, 5.89f, -11.29f, 13.16f, -11.29f)
                close()
                moveTo(1028.64f, 69.21f)
                lineTo(1028.04f, 69.21f)
                curveToRelative(0.0f, 0.17f, 0.0f, 0.35f, 0.07f, 0.52f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFBAE3F7),
                    1.0f to Color(0xFFFFFFFF),
                    start =
                    Offset(1116.87f, 201.32f),
                    end = Offset(1099.81f, 139.9f),
                ),
                stroke = null,
                fillAlpha = 0.7f, strokeAlpha = 0.7f, strokeLineWidth = 0.0f,
                strokeLineCap =
                Butt,
                strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd,
            ) {
                moveTo(1136.1f, 144.3f)
                curveToRelative(-4.89f, 0.0f, -9.15f, 2.17f, -11.36f, 5.37f)
                arcToRelative(4.59f, 4.59f, 0.0f, false, false, -1.0f, -0.1f)
                arcToRelative(5.32f, 5.32f, 0.0f, false, false, -4.67f, 3.0f)
                arcToRelative(16.62f, 16.62f, 0.0f, false, false, -12.58f, -5.29f)
                curveToRelative(-8.47f, 0.0f, -15.35f, 5.54f, -15.35f, 12.37f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 0.12f, 1.52f)
                arcToRelative(12.28f, 12.28f, 0.0f, false, false, -10.87f, 12.49f)
                arcToRelative(13.23f, 13.23f, 0.0f, false, false, 0.84f, 4.65f)
                curveToRelative(-4.56f, 0.39f, -8.12f, 3.77f, -8.12f, 7.87f)
                arcToRelative(7.33f, 7.33f, 0.0f, false, false, 0.11f, 1.24f)
                arcToRelative(10.15f, 10.15f, 0.0f, false, false, -4.23f, -0.91f)
                curveToRelative(-5.06f, 0.0f, -9.17f, 3.62f, -9.17f, 8.08f)
                curveToRelative(0.0f, 0.19f, 0.0f, 0.39f, 0.0f, 0.58f)
                curveToRelative(-4.72f, 0.61f, -7.93f, 1.82f, -7.93f, 3.21f)
                curveToRelative(0.0f, 1.88f, 5.88f, 3.43f, 13.4f, 3.61f)
                arcToRelative(10.32f, 10.32f, 0.0f, false, false, 3.68f, 0.67f)
                arcToRelative(10.15f, 10.15f, 0.0f, false, false, 4.54f, -1.0f)
                curveToRelative(3.44f, -0.43f, 6.11f, -1.17f, 7.35f, -2.08f)
                curveToRelative(1.21f, 0.11f, 2.48f, 0.17f, 3.78f, 0.17f)
                curveToRelative(7.89f, 0.0f, 14.42f, -2.09f, 15.5f, -4.81f)
                arcToRelative(80.9f, 80.9f, 0.0f, false, false, 12.0f, 0.85f)
                curveToRelative(12.16f, 0.0f, 22.21f, -2.38f, 23.7f, -5.47f)
                quadToRelative(3.24f, 0.19f, 6.68f, 0.2f)
                curveToRelative(18.08f, 0.0f, 32.75f, -4.14f, 32.75f, -9.23f)
                curveToRelative(0.0f, -3.64f, -7.46f, -6.78f, -18.3f, -8.29f)
                arcToRelative(8.9f, 8.9f, 0.0f, false, false, 2.79f, -6.38f)
                curveToRelative(0.0f, -5.27f, -4.9f, -9.56f, -11.0f, -9.72f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.27f, -2.15f)
                curveToRelative(0.0f, -5.73f, -5.8f, -10.38f, -13.0f, -10.38f)
                close()
                moveTo(1136.6f, 165.06f)
                lineTo(1137.19f, 165.06f)
                curveToRelative(0.0f, 0.16f, 0.0f, 0.32f, -0.07f, 0.48f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFB1DFF9),
                    1.0f to Color(0xFFFFFFFF),
                    start =
                    Offset(840.87f, 132.48f),
                    end = Offset(829.05f, 53.42f),
                ),
                stroke = null,
                fillAlpha =
                0.7f,
                strokeAlpha = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd,
            ) {
                moveTo(853.69f, 50.24f)
                curveToRelative(-12.24f, 0.0f, -22.17f, 11.18f, -22.17f, 25.0f)
                curveToRelative(0.0f, 0.83f, 0.0f, 1.65f, 0.11f, 2.47f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -5.0f, 5.14f)
                arcToRelative(31.66f, 31.66f, 0.0f, false, false, -15.77f, -3.93f)
                curveToRelative(-13.1f, 0.0f, -23.72f, 7.0f, -23.72f, 15.55f)
                arcToRelative(10.61f, 10.61f, 0.0f, false, false, 0.75f, 3.9f)
                curveToRelative(-8.67f, 2.79f, -14.75f, 9.34f, -14.75f, 17.0f)
                arcToRelative(15.27f, 15.27f, 0.0f, false, false, 3.47f, 9.52f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, false, -1.92f, 4.0f)
                arcToRelative(4.63f, 4.63f, 0.0f, false, false, 0.22f, 1.38f)
                curveToRelative(-11.57f, -6.07f, -19.66f, 3.11f, -19.66f, 5.58f)
                curveToRelative(-8.44f, -3.0f, -21.25f, 15.26f, -2.57f, 15.26f)
                curveToRelative(10.23f, 0.0f, 54.52f, -0.42f, 60.73f, -1.72f)
                curveToRelative(9.95f, 1.33f, 23.82f, -7.4f, 37.52f, -7.4f)
                curveToRelative(32.21f, 0.0f, 58.33f, -4.4f, 58.33f, -9.82f)
                arcToRelative(2.08f, 2.08f, 0.0f, false, false, -0.45f, -1.24f)
                curveToRelative(18.08f, -0.8f, 30.79f, -2.69f, 30.79f, -4.9f)
                curveToRelative(0.0f, -1.94f, -9.79f, -3.64f, -24.42f, -4.57f)
                arcToRelative(16.16f, 16.16f, 0.0f, false, false, 4.2f, -10.58f)
                curveToRelative(0.0f, -11.0f, -12.46f, -20.0f, -28.06f, -20.44f)
                curveToRelative(-0.61f, -7.7f, -7.0f, -14.0f, -15.51f, -15.86f)
                curveTo(875.52f, 61.05f, 865.72f, 50.24f, 853.69f, 50.24f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFBEE2F9),
                    1.0f to Color(0xFFFFFFFF),
                    start =
                    Offset(146.6f, 114.33f),
                    end = Offset(131.18f, 44.59f),
                ),
                stroke = null,
                fillAlpha =
                0.7f,
                strokeAlpha = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd,
            ) {
                moveTo(0.59f, 81.84f)
                arcToRelative(21.53f, 21.53f, 0.0f, false, true, 16.92f, -0.66f)
                curveToRelative(0.42f, -9.5f, 7.28f, -17.06f, 15.68f, -17.06f)
                curveToRelative(7.74f, 0.0f, 14.17f, 6.42f, 15.46f, 14.87f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, 3.86f, 0.86f)
                arcToRelative(21.76f, 21.76f, 0.0f, false, true, -0.14f, -2.44f)
                curveToRelative(0.0f, -12.09f, 9.53f, -21.89f, 21.29f, -21.89f)
                arcToRelative(20.71f, 20.71f, 0.0f, false, true, 10.92f, 3.1f)
                curveToRelative(-0.07f, -0.76f, -0.11f, -1.54f, -0.11f, -2.32f)
                curveToRelative(0.0f, -14.25f, 11.88f, -25.8f, 26.52f, -25.8f)
                arcToRelative(26.79f, 26.79f, 0.0f, false, true, 19.36f, 8.18f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 3.0f, -0.36f)
                curveToRelative(6.27f, 0.0f, 11.53f, 4.76f, 12.9f, 11.15f)
                arcToRelative(25.21f, 25.21f, 0.0f, false, true, 11.17f, -2.55f)
                curveToRelative(9.78f, 0.0f, 18.07f, 5.34f, 20.92f, 12.73f)
                arcToRelative(24.54f, 24.54f, 0.0f, false, true, 7.0f, -1.0f)
                arcToRelative(24.86f, 24.86f, 0.0f, false, true, 3.14f, 0.19f)
                arcTo(21.84f, 21.84f, 0.0f, false, true, 209.72f, 43.0f)
                curveToRelative(10.75f, 0.0f, 19.7f, 7.41f, 21.61f, 17.21f)
                arcToRelative(13.3f, 13.3f, 0.0f, false, true, 8.75f, 12.5f)
                arcToRelative(13.88f, 13.88f, 0.0f, false, true, -0.14f, 2.0f)
                curveToRelative(4.21f, 2.61f, 7.14f, 5.57f, 8.45f, 8.76f)
                arcToRelative(25.7f, 25.7f, 0.0f, false, true, 5.29f, -0.54f)
                curveToRelative(6.89f, 0.0f, 12.78f, 2.63f, 15.21f, 6.35f)
                curveToRelative(14.18f, 2.6f, 23.52f, 7.0f, 23.52f, 12.0f)
                curveToRelative(0.0f, 8.0f, -23.75f, 14.47f, -53.0f, 14.47f)
                arcTo(174.76f, 174.76f, 0.0f, false, true, 213.89f, 114.0f)
                curveToRelative(-3.91f, 7.14f, -38.49f, 12.73f, -80.57f, 12.73f)
                curveToRelative(-22.8f, 0.0f, -43.39f, -1.64f, -58.1f, -4.28f)
                curveTo(67.0f, 126.32f, 49.53f, 129.0f, 29.35f, 129.0f)
                arcTo(187.68f, 187.68f, 0.0f, false, true, 0.59f, 127.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF94c124)), stroke = null, fillAlpha = 0.7f,
                strokeAlpha =
                0.7f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero,
            ) {
                moveTo(0.0f, 396.96f)
                horizontalLineToRelative(1600.0f)
                verticalLineToRelative(323.04f)
                horizontalLineToRelative(-1600.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF86a32d)), stroke = null, fillAlpha = 0.7f,
                strokeAlpha =
                0.7f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero,
            ) {
                moveTo(0.0f, 397.94f)
                lineToRelative(132.07f, -0.06f)
                curveToRelative(22.05f, -25.05f, 43.64f, -50.52f, 66.81f, -74.57f)
                curveToRelative(2.2f, -2.29f, 5.09f, -4.92f, 2.3f, -8.77f)
                curveToRelative(-29.34f, -26.0f, -60.0f, -50.33f, -93.41f, -70.84f)
                curveToRelative(-26.0f, -16.0f, -33.0f, -14.94f, -57.0f, 4.0f)
                curveTo(32.73f, 261.9f, 17.15f, 278.79f, 0.0f, 294.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF90af2c)), stroke = null, fillAlpha = 0.7f,
                strokeAlpha =
                0.7f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero,
            ) {
                moveTo(201.18f, 314.54f)
                curveToRelative(-0.2f, 4.68f, -4.14f, 6.75f, -6.78f, 9.69f)
                quadToRelative(-29.06f, 32.31f, -58.15f, 64.58f)
                arcToRelative(16.19f, 16.19f, 0.0f, false, false, -4.18f, 9.07f)
                curveToRelative(68.0f, 0.69f, 136.0f, 1.6f, 204.0f, 2.0f)
                curveToRelative(53.5f, 0.34f, 107.0f, 0.65f, 160.5f, -0.18f)
                curveToRelative(25.31f, -0.4f, 50.61f, -2.18f, 76.0f, -1.72f)
                curveToRelative(3.62f, 0.07f, 7.5f, -1.06f, 10.78f, 1.58f)
                curveToRelative(2.67f, 2.94f, 6.18f, 2.0f, 9.47f, 2.07f)
                curveToRelative(29.27f, 0.22f, 58.53f, -0.2f, 87.8f, -0.78f)
                arcToRelative(44.92f, 44.92f, 0.0f, false, true, 15.0f, 1.74f)
                curveToRelative(37.15f, 1.89f, 74.31f, 0.62f, 111.46f, 0.73f)
                arcToRelative(8.82f, 8.82f, 0.0f, false, false, 8.23f, -2.95f)
                curveToRelative(-1.14f, -7.11f, -7.0f, -5.25f, -11.16f, -5.33f)
                quadToRelative(-31.39f, -0.57f, -62.8f, -0.06f)
                curveToRelative(-8.6f, 0.13f, -15.23f, -2.42f, -21.88f, -8.21f)
                curveToRelative(-20.08f, -17.53f, -39.65f, -35.68f, -60.85f, -51.9f)
                curveToRelative(-4.65f, 3.0f, -6.56f, -1.54f, -9.15f, -3.6f)
                curveToRelative(-26.19f, -20.78f, -51.94f, -42.09f, -80.66f, -59.49f)
                curveToRelative(-12.26f, -7.42f, -22.26f, -6.21f, -33.19f, 2.27f)
                curveToRelative(-17.7f, 13.73f, -33.78f, 29.13f, -49.0f, 45.45f)
                curveToRelative(-4.72f, 5.05f, -8.12f, 6.71f, -14.11f, 1.53f)
                reflectiveCurveToRelative(-13.5f, -8.91f, -20.13f, -13.54f)
                curveToRelative(-9.0f, -6.3f, -17.21f, -5.73f, -25.75f, 1.26f)
                curveToRelative(-3.45f, 2.83f, -6.31f, 7.28f, -11.67f, 7.27f)
                curveToRelative(-9.59f, 4.24f, -15.06f, 13.17f, -22.35f, 20.0f)
                curveToRelative(-9.5f, 8.89f, -9.32f, 9.2f, -19.47f, 0.69f)
                curveToRelative(-11.6f, -9.73f, -23.15f, -19.51f, -35.23f, -28.65f)
                arcToRelative(23.93f, 23.93f, 0.0f, false, false, -8.86f, -4.68f)
                curveToRelative(-13.7f, -9.24f, -27.11f, -18.95f, -41.17f, -27.61f)
                curveToRelative(-22.0f, -13.59f, -25.52f, -13.38f, -45.57f, 3.26f)
                curveToRelative(-11.7f, 9.71f, -22.47f, 20.56f, -33.65f, 30.9f)
                curveTo(206.35f, 311.94f, 205.0f, 315.14f, 201.18f, 314.54f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF86a32d)), stroke = null, fillAlpha = 0.7f,
                strokeAlpha =
                0.7f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero,
            ) {
                moveTo(658.48f, 334.89f)
                curveToRelative(3.26f, 10.66f, 13.77f, 14.31f, 20.89f, 21.12f)
                curveToRelative(13.1f, 12.51f, 27.51f, 23.63f, 40.89f, 35.87f)
                curveToRelative(4.57f, 4.18f, 8.92f, 6.27f, 15.15f, 6.19f)
                curveToRelative(22.92f, -0.32f, 45.85f, -0.17f, 68.78f, -0.08f)
                curveToRelative(3.61f, 0.0f, 7.47f, -1.07f, 10.74f, 1.55f)
                curveToRelative(1.52f, 2.95f, 4.34f, 3.68f, 7.24f, 4.29f)
                curveToRelative(9.76f, -0.64f, 19.58f, -0.22f, 29.32f, -1.54f)
                curveToRelative(7.93f, -2.52f, 16.09f, -1.31f, 24.15f, -1.4f)
                curveToRelative(16.89f, -0.18f, 33.78f, -0.21f, 50.66f, 0.0f)
                curveToRelative(7.0f, 0.09f, 12.31f, -2.14f, 16.81f, -7.5f)
                curveToRelative(9.34f, -11.15f, 18.69f, -22.29f, 28.39f, -33.13f)
                curveToRelative(3.07f, -3.43f, 5.11f, -7.27f, 2.3f, -11.94f)
                curveToRelative(-48.4f, -43.45f, -97.72f, -85.69f, -153.48f, -119.64f)
                curveToRelative(-2.59f, -1.57f, -5.47f, -2.66f, -8.05f, -4.26f)
                curveToRelative(-15.6f, -9.63f, -29.89f, -7.0f, -44.15f, 3.51f)
                curveToRelative(-28.22f, 20.85f, -52.57f, 45.83f, -76.82f, 70.94f)
                curveTo(680.0f, 310.56f, 669.4f, 322.87f, 658.48f, 334.89f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF86a32d)), stroke = null, fillAlpha = 0.7f,
                strokeAlpha =
                0.7f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero,
            ) {
                moveTo(328.9f, 303.39f)
                curveToRelative(10.53f, 8.86f, 21.0f, 17.76f, 31.61f, 26.54f)
                curveToRelative(5.71f, 4.73f, 12.0f, 8.86f, 17.25f, 14.0f)
                curveToRelative(4.0f, 3.95f, 6.55f, 4.57f, 10.5f, 0.06f)
                curveToRelative(8.46f, -9.68f, 18.82f, -17.57f, 26.55f, -28.0f)
                curveToRelative(-12.3f, -9.93f, -25.83f, -17.88f, -39.71f, -25.36f)
                curveToRelative(-12.06f, -6.5f, -23.06f, -5.43f, -33.68f, 2.7f)
                curveTo(337.18f, 296.63f, 333.07f, 300.05f, 328.9f, 303.39f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF90af2c)), stroke = null, fillAlpha = 0.7f,
                strokeAlpha =
                0.7f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero,
            ) {
                moveTo(1596.35f, 267.74f)
                curveToRelative(1.24f, -0.75f, 2.46f, -1.41f, 3.65f, -2.0f)
                verticalLineTo(393.87f)
                curveToRelative(-2.48f, 0.0f, -5.0f, 0.0f, -7.45f, 0.07f)
                curveToRelative(-3.63f, 0.07f, -7.5f, -1.06f, -10.79f, 1.57f)
                curveToRelative(-2.67f, 2.94f, -6.18f, 2.05f, -9.47f, 2.08f)
                curveToRelative(-29.27f, 0.22f, -58.54f, -0.2f, -87.8f, -0.78f)
                arcToRelative(45.0f, 45.0f, 0.0f, false, false, -15.0f, 1.74f)
                curveToRelative(-37.13f, 1.88f, -74.29f, 0.61f, -111.45f, 0.73f)
                arcToRelative(8.77f, 8.77f, 0.0f, false, true, -8.22f, -3.0f)
                arcToRelative(5.67f, 5.67f, 0.0f, false, true, 0.12f, -0.62f)
                curveToRelative(1.36f, -6.38f, 7.0f, -4.63f, 11.0f, -4.7f)
                quadToRelative(31.39f, -0.57f, 62.8f, -0.07f)
                curveToRelative(8.61f, 0.13f, 15.25f, -2.41f, 21.89f, -8.21f)
                curveToRelative(20.08f, -17.52f, 39.65f, -35.68f, 60.84f, -51.89f)
                curveToRelative(4.66f, 3.0f, 6.57f, -1.54f, 9.17f, -3.6f)
                curveTo(1541.87f, 306.44f, 1567.63f, 285.14f, 1596.35f, 267.74f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF86a32d)), stroke = null, fillAlpha = 0.7f,
                strokeAlpha =
                0.7f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero,
            ) {
                moveTo(1506.54f, 330.83f)
                curveToRelative(-3.26f, 10.66f, -13.77f, 14.31f, -20.89f, 21.12f)
                curveToRelative(-13.1f, 12.51f, -27.51f, 23.63f, -40.89f, 35.87f)
                curveToRelative(-4.57f, 4.18f, -8.92f, 6.27f, -15.15f, 6.19f)
                curveToRelative(-22.92f, -0.32f, -45.85f, -0.17f, -68.78f, -0.08f)
                curveToRelative(-3.61f, 0.0f, -7.47f, -1.07f, -10.74f, 1.55f)
                curveToRelative(-1.52f, 2.95f, -4.34f, 3.68f, -7.24f, 4.29f)
                curveToRelative(-9.76f, -0.64f, -19.58f, -0.22f, -29.32f, -1.54f)
                curveToRelative(-7.93f, -2.52f, -16.09f, -1.31f, -24.15f, -1.4f)
                curveToRelative(-16.89f, -0.18f, -33.78f, -0.21f, -50.66f, 0.0f)
                curveToRelative(-7.0f, 0.09f, -12.31f, -2.14f, -16.81f, -7.5f)
                curveToRelative(-9.34f, -11.15f, -18.69f, -22.29f, -28.39f, -33.13f)
                curveToRelative(-3.07f, -3.43f, -5.11f, -7.27f, -2.3f, -11.94f)
                curveToRelative(48.4f, -43.45f, 97.72f, -85.69f, 153.48f, -119.64f)
                curveToRelative(2.59f, -1.57f, 5.47f, -2.66f, 8.0f, -4.26f)
                curveToRelative(15.6f, -9.63f, 29.89f, -7.0f, 44.15f, 3.51f)
                curveToRelative(28.22f, 20.85f, 52.58f, 45.83f, 76.82f, 70.94f)
                curveTo(1485.0f, 306.5f, 1495.62f, 318.81f, 1506.54f, 330.83f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF90af2c)), stroke = null, fillAlpha = 0.7f,
                strokeAlpha =
                0.7f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero,
            ) {
                moveTo(1302.94f, 393.93f)
                curveToRelative(-19.54f, -0.1f, -39.16f, -1.1f, -58.6f, 0.34f)
                curveToRelative(-12.0f, 0.89f, -18.95f, -4.49f, -25.06f, -12.74f)
                curveToRelative(-2.83f, -3.82f, -6.7f, -6.9f, -9.0f, -10.85f)
                curveToRelative(-5.44f, -9.54f, -17.62f, -14.1f, -19.1f, -26.4f)
                curveToRelative(-3.25f, 1.58f, -4.92f, -0.7f, -6.79f, -2.7f)
                curveToRelative(-18.0f, -19.35f, -35.56f, -39.11f, -54.16f, -57.85f)
                curveToRelative(-15.16f, -15.28f, -29.56f, -31.63f, -48.35f, -42.87f)
                verticalLineToRelative(4.79f)
                curveToRelative(-18.22f, 11.22f, -32.34f, 27.18f, -47.18f, 42.14f)
                curveToRelative(-18.6f, 18.74f, -36.17f, 38.5f, -54.16f, 57.85f)
                curveToRelative(-1.87f, 2.0f, -3.54f, 4.28f, -6.79f, 2.7f)
                curveToRelative(-1.48f, 12.3f, -13.66f, 16.86f, -19.1f, 26.4f)
                curveToRelative(-2.26f, 3.95f, -6.13f, 7.0f, -9.0f, 10.85f)
                curveToRelative(-6.11f, 8.25f, -13.09f, 13.63f, -25.06f, 12.74f)
                curveToRelative(-19.44f, -1.44f, -39.06f, -0.44f, -58.6f, -0.34f)
                curveToRelative(-3.57f, 0.0f, -7.49f, -1.19f, -10.55f, 1.93f)
                curveToRelative(3.65f, 4.0f, 8.58f, 3.57f, 13.25f, 3.63f)
                curveToRelative(68.93f, 0.9f, 137.82f, -3.4f, 206.76f, -2.09f)
                curveToRelative(4.0f, 0.08f, 8.2f, -0.12f, 11.28f, -3.47f)
                curveToRelative(0.0f, -1.14f, 0.0f, -2.29f, 0.0f, -3.43f)
                curveToRelative(3.0f, 2.74f, 6.89f, 2.91f, 10.65f, 2.84f)
                curveToRelative(68.94f, -1.31f, 137.83f, 3.0f, 206.76f, 2.09f)
                curveToRelative(4.67f, -0.06f, 9.6f, 0.35f, 13.25f, -3.63f)
                curveTo(1310.43f, 392.74f, 1306.51f, 394.0f, 1302.94f, 393.93f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1d1d1b)), stroke = null, fillAlpha = 0.7f,
                strokeAlpha =
                0.7f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero,
            ) {
                moveTo(1499.69f, 661.42f)
                lineTo(1506.27f, 662.49f)
            }
        }
            .build()
        return _bgL!!
    }

private var _bgL: ImageVector? = null
