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

public val Drawable.Icon1: ImageVector
    get() {
        if (_icon1 != null) {
            return _icon1!!
        }
        _icon1 = Builder(name = "Icon1", defaultWidth = 136.22.dp, defaultHeight = 130.5.dp,
                viewportWidth = 136.22f, viewportHeight = 130.5f).apply {
            path(fill = SolidColor(Color(0xFFd7d7d7)), stroke = null, strokeLineWidth = 0.0f,
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.0f, 84.44f)
                curveTo(30.63f, 81.68f, 23.16f, 76.0f, 16.34f, 69.24f)
                curveToRelative(-0.85f, -2.53f, -2.69f, -4.43f, -4.16f, -6.56f)
                curveToRelative(-4.25f, -6.0f, -4.31f, -13.2f, -0.16f, -19.56f)
                curveTo(15.0f, 38.73f, 17.25f, 33.8f, 22.12f, 31.0f)
                curveToRelative(2.35f, 0.07f, 2.21f, 2.11f, 2.69f, 3.54f)
                curveToRelative(0.77f, 2.34f, 1.22f, 4.78f, 1.87f, 7.17f)
                curveToRelative(1.36f, 5.0f, 3.72f, 9.16f, 9.06f, 10.82f)
                arcToRelative(3.33f, 3.33f, 0.0f, false, true, 2.55f, 2.71f)
                curveToRelative(0.4f, 2.1f, 0.0f, 4.26f, 0.42f, 6.36f)
                reflectiveCurveToRelative(1.61f, 3.65f, 3.93f, 3.69f)
                curveToRelative(2.11f, 0.0f, 3.18f, -1.43f, 3.83f, -3.25f)
                curveToRelative(0.81f, -2.28f, 0.0f, -5.0f, 1.79f, -7.0f)
                curveToRelative(1.9f, -1.35f, 4.1f, -1.22f, 6.25f, -1.25f)
                curveToRelative(9.79f, -0.13f, 19.59f, 0.18f, 29.39f, -0.19f)
                curveToRelative(1.33f, -0.05f, 2.68f, -0.11f, 3.68f, 1.0f)
                curveToRelative(1.16f, 1.76f, 0.74f, 3.82f, 1.0f, 5.75f)
                curveToRelative(0.37f, 2.63f, 1.25f, 5.13f, 4.4f, 5.0f)
                curveToRelative(3.43f, -0.2f, 3.84f, -2.92f, 4.0f, -5.77f)
                curveToRelative(0.19f, -3.63f, -2.38f, -5.18f, -4.77f, -6.94f)
                curveToRelative(-0.81f, -2.51f, 1.35f, -3.53f, 2.5f, -5.07f)
                curveToRelative(4.94f, -3.09f, 7.51f, -7.57f, 8.59f, -13.3f)
                curveToRelative(0.56f, -3.0f, 0.88f, -6.25f, 3.08f, -8.74f)
                arcToRelative(45.91f, 45.91f, 0.0f, false, true, 17.54f, 18.05f)
                curveToRelative(3.86f, 5.7f, 3.66f, 13.14f, -0.5f, 18.1f)
                lineToRelative(-4.31f, 7.57f)
                curveToRelative(-6.68f, 7.0f, -14.34f, 12.48f, -23.78f, 15.18f)
                arcToRelative(32.46f, 32.46f, 0.0f, false, true, -10.28f, 3.0f)
                curveTo(78.88f, 92.0f, 56.31f, 92.0f, 50.17f, 87.31f)
                arcTo(21.52f, 21.52f, 0.0f, false, true, 40.0f, 84.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFFe94980)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.13f, 15.15f)
                curveTo(39.5f, 5.88f, 45.31f, 0.14f, 54.57f, 0.05f)
                curveTo(63.35f, 0.0f, 72.13f, 0.0f, 80.91f, 0.05f)
                curveTo(90.13f, 0.11f, 95.82f, 5.63f, 96.42f, 15.0f)
                curveToRelative(2.48f, 8.78f, -2.0f, 22.83f, -14.79f, 23.44f)
                curveToRelative(-10.67f, 0.5f, -21.48f, 1.81f, -32.1f, -1.32f)
                arcToRelative(14.72f, 14.72f, 0.0f, false, true, -10.59f, -13.0f)
                arcTo(45.87f, 45.87f, 0.0f, false, true, 39.13f, 15.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFFe8386a)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.13f, 15.15f)
                curveToRelative(0.94f, 1.67f, 2.11f, 3.0f, 1.28f, 5.42f)
                curveToRelative(-1.92f, 5.62f, 2.0f, 10.25f, 4.9f, 13.82f)
                curveToRelative(1.53f, 1.9f, 7.0f, 2.79f, 10.89f, 2.86f)
                curveToRelative(8.0f, 0.15f, 16.0f, 0.14f, 24.0f, 0.0f)
                arcTo(15.27f, 15.27f, 0.0f, false, false, 95.25f, 23.33f)
                curveToRelative(0.27f, -2.8f, 0.77f, -5.57f, 1.17f, -8.36f)
                curveToRelative(4.33f, 2.56f, 8.19f, 5.55f, 10.0f, 10.52f)
                curveToRelative(-0.42f, 5.5f, -2.34f, 10.63f, -3.89f, 15.85f)
                curveToRelative(-1.1f, 3.71f, -4.59f, 5.0f, -7.33f, 7.0f)
                curveToRelative(-3.46f, 2.69f, -7.53f, 3.33f, -11.74f, 3.36f)
                curveToRelative(-10.46f, 0.07f, -20.91f, 0.0f, -31.37f, 0.0f)
                arcToRelative(47.52f, 47.52f, 0.0f, false, true, -9.33f, -1.43f)
                curveTo(31.94f, 48.12f, 27.44f, 35.0f, 29.31f, 25.47f)
                curveTo(31.07f, 20.59f, 34.58f, 17.37f, 39.13f, 15.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd8d8d8)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.31f, 25.47f)
                curveToRelative(0.32f, 5.71f, 2.05f, 11.11f, 4.05f, 16.39f)
                curveToRelative(1.8f, 4.73f, 6.29f, 7.0f, 10.63f, 7.31f)
                curveToRelative(17.06f, 1.39f, 34.17f, 2.36f, 51.18f, -0.79f)
                lineToRelative(-2.91f, 3.75f)
                curveToRelative(-1.37f, 1.76f, -2.39f, 3.93f, -5.0f, 4.23f)
                curveToRelative(-0.28f, -0.72f, -0.21f, -1.83f, -1.37f, -1.69f)
                curveToRelative(-11.32f, 1.42f, -22.68f, 0.25f, -34.0f, 0.64f)
                curveToRelative(-1.29f, 0.0f, -2.68f, -0.28f, -3.65f, 1.0f)
                curveToRelative(-3.5f, -2.11f, -7.07f, -3.37f, -10.95f, -0.88f)
                curveToRelative(0.0f, -2.26f, -1.89f, -1.13f, -2.87f, -1.6f)
                curveToRelative(-5.35f, -2.53f, -7.9f, -7.0f, -9.24f, -12.54f)
                curveToRelative(-0.84f, -3.44f, -1.08f, -7.11f, -3.05f, -10.23f)
                curveTo(23.74f, 28.17f, 27.11f, 27.57f, 29.31f, 25.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFFe83a6b)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(123.43f, 61.64f)
                curveToRelative(2.57f, -6.0f, 1.79f, -12.0f, 0.5f, -18.1f)
                arcToRelative(39.0f, 39.0f, 0.0f, false, true, 4.34f, -1.14f)
                curveToRelative(3.95f, -0.6f, 7.0f, 0.5f, 7.45f, 5.0f)
                arcToRelative(57.37f, 57.37f, 0.0f, false, true, 0.36f, 10.95f)
                curveTo(135.51f, 64.26f, 129.7f, 65.68f, 123.43f, 61.64f)
                close()
            }
            path(fill = SolidColor(Color(0xFFe8386c)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 43.12f)
                curveToRelative(-2.23f, 6.54f, -1.71f, 13.06f, 0.16f, 19.57f)
                curveToRelative(-1.8f, 0.33f, -3.58f, 0.72f, -5.39f, 1.0f)
                curveToRelative(-3.87f, 0.6f, -6.41f, -1.35f, -6.63f, -5.25f)
                curveTo(0.0f, 55.61f, 0.25f, 52.76f, 0.0f, 50.0f)
                curveToRelative(-0.39f, -5.35f, 1.79f, -8.78f, 9.0f, -7.22f)
                curveTo(10.0f, 42.94f, 11.0f, 43.0f, 12.0f, 43.12f)
                close()
            }
            path(fill = SolidColor(Color(0xFFe43568)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.17f, 87.31f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 34.89f, 0.0f)
                curveToRelative(0.3f, 1.46f, 0.62f, 2.92f, 0.89f, 4.39f)
                curveToRelative(1.35f, 7.24f, -2.69f, 12.34f, -10.14f, 12.6f)
                curveToRelative(-4.15f, 0.14f, -8.31f, 0.0f, -12.47f, 0.0f)
                curveTo(50.3f, 104.34f, 46.92f, 100.0f, 50.17f, 87.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFF303142)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.91f, 69.15f)
                curveToRelative(9.09f, -1.4f, 18.23f, -0.71f, 27.34f, -0.38f)
                curveToRelative(2.81f, 0.1f, 4.6f, 2.37f, 4.91f, 5.38f)
                curveToRelative(-2.59f, 0.26f, -5.18f, 0.73f, -7.76f, 0.0f)
                curveToRelative(-0.78f, -2.18f, -1.19f, 0.41f, -1.82f, 0.15f)
                curveToRelative(-1.74f, 0.64f, -2.88f, 3.0f, -5.25f, 1.9f)
                arcToRelative(25.23f, 25.23f, 0.0f, false, true, -3.0f, -1.28f)
                curveToRelative(-2.34f, -0.48f, -5.56f, 2.33f, -6.93f, -2.0f)
                curveToRelative(-0.33f, -1.06f, -0.69f, 0.41f, -0.94f, 0.7f)
                curveToRelative(-1.85f, 2.1f, -3.83f, 2.23f, -6.0f, 0.58f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -0.49f, -1.2f)
                curveTo(55.29f, 71.67f, 55.18f, 70.4f, 53.91f, 69.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF28283b)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(37.28f, 55.4f)
                curveToRelative(4.32f, -4.59f, 7.0f, -4.37f, 10.95f, 0.88f)
                arcToRelative(32.89f, 32.89f, 0.0f, false, true, -0.07f, 6.0f)
                arcToRelative(5.35f, 5.35f, 0.0f, false, true, -6.0f, 4.73f)
                curveToRelative(-2.86f, -0.23f, -5.0f, -1.92f, -5.07f, -5.11f)
                curveTo(37.0f, 59.71f, 37.21f, 57.56f, 37.28f, 55.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF28283b)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(87.26f, 56.36f)
                curveToRelative(1.24f, -1.92f, 2.59f, -3.69f, 5.0f, -4.23f)
                curveToRelative(5.62f, 1.28f, 8.42f, 7.29f, 5.5f, 12.06f)
                curveToRelative(-1.28f, 2.09f, -3.29f, 3.34f, -5.88f, 2.75f)
                curveToRelative(-2.44f, -0.55f, -4.23f, -2.0f, -4.56f, -4.62f)
                arcTo(49.33f, 49.33f, 0.0f, false, true, 87.26f, 56.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2c2d40)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.55f, 73.35f)
                curveToRelative(0.51f, -0.31f, 0.94f, -0.89f, 1.66f, -0.48f)
                curveToRelative(0.4f, 1.14f, 1.07f, 2.34f, 2.37f, 1.82f)
                curveToRelative(3.5f, -1.41f, 4.16f, 0.87f, 4.79f, 3.36f)
                arcTo(4.93f, 4.93f, 0.0f, false, true, 81.0f, 80.91f)
                curveToRelative(-9.0f, 0.18f, -18.1f, 1.15f, -27.11f, -0.44f)
                curveToRelative(2.0f, -2.24f, 4.9f, -1.2f, 7.34f, -1.82f)
                curveToRelative(1.78f, -0.06f, 2.17f, -1.84f, 3.3f, -2.63f)
                curveToRelative(1.32f, -0.91f, 2.43f, -3.66f, 4.71f, -1.26f)
                lineToRelative(1.94f, 0.35f)
                curveToRelative(0.75f, 1.14f, 1.36f, 2.56f, 2.79f, 0.5f)
                arcTo(15.73f, 15.73f, 0.0f, false, true, 76.55f, 73.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF25243b)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(62.37f, 79.0f)
                curveToRelative(-2.49f, 2.5f, -5.72f, 0.63f, -8.49f, 1.44f)
                curveToRelative(-3.42f, -0.66f, -4.43f, -3.0f, -4.37f, -6.14f)
                curveToRelative(1.41f, -1.0f, 2.71f, -2.39f, 4.65f, -1.08f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(1.0f, 1.74f, 2.28f, 2.62f, 4.39f, 1.65f)
                curveToRelative(1.19f, -0.55f, 2.58f, -2.09f, 3.84f, -0.36f)
                arcTo(3.34f, 3.34f, 0.0f, false, true, 62.37f, 79.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF252838)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(54.16f, 73.25f)
                lineToRelative(-4.65f, 1.08f)
                curveToRelative(0.3f, -2.73f, 1.46f, -4.71f, 4.4f, -5.18f)
                curveToRelative(1.3f, 0.34f, 3.09f, -0.13f, 3.27f, 2.06f)
                curveTo(57.39f, 73.75f, 54.55f, 71.67f, 54.16f, 73.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF92a271)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(85.37f, 78.05f)
                curveToRelative(-1.82f, -1.4f, -3.1f, -3.7f, -6.13f, -2.93f)
                curveToRelative(-1.0f, 0.25f, -1.31f, -1.18f, -1.0f, -2.25f)
                lineTo(79.83f, 74.0f)
                curveToRelative(2.27f, -5.0f, 4.2f, 0.92f, 6.33f, 0.19f)
                curveTo(86.45f, 75.56f, 86.85f, 77.0f, 85.37f, 78.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF97ac65)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(62.37f, 79.0f)
                curveToRelative(0.12f, -4.0f, -0.81f, -5.87f, -4.83f, -2.7f)
                curveToRelative(-1.57f, 1.24f, -1.75f, 1.0f, -3.36f, -3.06f)
                curveToRelative(2.25f, 0.49f, 5.31f, 3.09f, 5.43f, -2.0f)
                curveToRelative(0.0f, -1.27f, 1.0f, -1.17f, 1.69f, -1.34f)
                curveToRelative(1.0f, -0.25f, 0.89f, 0.72f, 1.0f, 1.29f)
                curveToRelative(0.43f, 4.42f, 2.09f, 3.93f, 5.0f, 1.64f)
                curveToRelative(1.62f, -1.28f, 2.0f, 0.46f, 2.0f, 1.91f)
                curveToRelative(-2.72f, -0.53f, -4.23f, 0.86f, -4.8f, 3.31f)
                curveTo(64.1f, 79.5f, 63.77f, 80.22f, 62.37f, 79.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFa5b77a)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.55f, 73.35f)
                curveToRelative(0.0f, 1.69f, -1.79f, 1.75f, -2.45f, 2.82f)
                curveToRelative(-2.69f, 4.36f, -2.4f, 0.53f, -2.93f, -1.06f)
                curveTo(73.6f, 76.47f, 74.42f, 72.91f, 76.55f, 73.35f)
                close()
            }
        }
        .build()
        return _icon1!!
    }

private var _icon1: ImageVector? = null
