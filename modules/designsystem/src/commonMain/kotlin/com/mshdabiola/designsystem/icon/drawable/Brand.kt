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

public val Drawable.Brand: ImageVector
    get() {
        if (_brand != null) {
            return _brand!!
        }
        _brand = Builder(
            name = "Brand",
            defaultWidth = 258.9.dp,
            defaultHeight = 103.56.dp,
            viewportWidth = 258.9f,
            viewportHeight = 103.56f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(35.64f, 63.84f)
                horizontalLineTo(26.25f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -6.61f, -2.77f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -2.78f, -6.62f)
                verticalLineTo(49.11f)
                arcToRelative(9.46f, 9.46f, 0.0f, false, true, 9.39f, -9.39f)
                horizontalLineToRelative(5.37f)
                arcTo(9.42f, 9.42f, 0.0f, false, true, 41.0f, 49.11f)
                verticalLineTo(55.8f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, -0.77f, 1.88f)
                arcToRelative(2.54f, 2.54f, 0.0f, false, true, -1.9f, 0.79f)
                horizontalLineTo(32.94f)
                quadToRelative(-2.34f, 0.0f, -2.67f, -2.67f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, true, -0.9f, 2.0f)
                arcToRelative(3.36f, 3.36f, 0.0f, false, true, -2.25f, 0.66f)
                arcToRelative(4.72f, 4.72f, 0.0f, false, true, -3.3f, -1.56f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, -1.59f, -3.78f)
                verticalLineToRelative(-2.7f)
                arcToRelative(5.41f, 5.41f, 0.0f, false, true, 5.37f, -5.34f)
                horizontalLineToRelative(5.34f)
                verticalLineToRelative(9.36f)
                arcToRelative(1.19f, 1.19f, 0.0f, false, false, 1.35f, 1.35f)
                horizontalLineTo(37.0f)
                arcToRelative(1.19f, 1.19f, 0.0f, false, false, 1.35f, -1.35f)
                verticalLineTo(49.11f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, false, -2.0f, -4.71f)
                arcToRelative(6.37f, 6.37f, 0.0f, false, false, -4.73f, -2.0f)
                horizontalLineTo(26.25f)
                arcToRelative(6.74f, 6.74f, 0.0f, false, false, -6.69f, 6.72f)
                verticalLineToRelative(5.34f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, false, 2.0f, 4.71f)
                arcToRelative(6.38f, 6.38f, 0.0f, false, false, 4.73f, 2.0f)
                horizontalLineToRelative(9.39f)
                close()
                moveTo(30.27f, 47.76f)
                horizontalLineTo(27.6f)
                arcToRelative(2.62f, 2.62f, 0.0f, false, false, -1.9f, 0.79f)
                arcToRelative(2.55f, 2.55f, 0.0f, false, false, -0.8f, 1.88f)
                verticalLineToRelative(2.7f)
                arcTo(2.54f, 2.54f, 0.0f, false, false, 25.69f, 55.0f)
                arcToRelative(2.57f, 2.57f, 0.0f, false, false, 1.91f, 0.79f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, 2.67f, -2.67f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(62.44f, 63.84f)
                horizontalLineTo(57.1f)
                verticalLineTo(50.43f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, -0.79f, -1.88f)
                arcToRelative(2.61f, 2.61f, 0.0f, false, false, -1.92f, -0.79f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, -2.67f, 2.67f)
                verticalLineTo(63.84f)
                horizontalLineTo(46.35f)
                verticalLineTo(45.09f)
                horizontalLineToRelative(5.37f)
                verticalLineToRelative(2.67f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, true, 0.84f, -2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.83f, -0.66f)
                horizontalLineTo(57.1f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, true, 4.0f, 1.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.64f, -1.44f)
                arcToRelative(5.55f, 5.55f, 0.0f, false, true, 2.38f, -0.46f)
                horizontalLineToRelative(2.67f)
                arcToRelative(5.19f, 5.19f, 0.0f, false, true, 3.78f, 1.58f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, 1.59f, 3.76f)
                verticalLineTo(63.84f)
                horizontalLineTo(67.81f)
                verticalLineTo(50.43f)
                arcTo(2.62f, 2.62f, 0.0f, false, false, 67.0f, 48.56f)
                arcToRelative(2.56f, 2.56f, 0.0f, false, false, -1.88f, -0.8f)
                arcToRelative(2.62f, 2.62f, 0.0f, false, false, -1.9f, 0.79f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, false, -0.8f, 1.88f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(91.93f, 50.43f)
                horizontalLineTo(89.26f)
                curveToRelative(-0.24f, -1.78f, -1.08f, -2.67f, -2.54f, -2.67f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -2.12f, 0.56f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 83.89f, 50.0f)
                quadToRelative(0.0f, 1.16f, 3.89f, 3.25f)
                curveToRelative(2.12f, 1.13f, 3.35f, 2.08f, 3.67f, 2.83f)
                arcToRelative(6.06f, 6.06f, 0.0f, false, true, 0.48f, 2.41f)
                arcToRelative(5.39f, 5.39f, 0.0f, false, true, -5.37f, 5.37f)
                horizontalLineTo(83.89f)
                quadToRelative(-5.37f, 0.0f, -5.37f, -5.37f)
                horizontalLineToRelative(2.7f)
                curveToRelative(0.21f, 1.8f, 1.0f, 2.7f, 2.51f, 2.7f)
                arcToRelative(3.45f, 3.45f, 0.0f, false, false, 2.15f, -0.56f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.71f, -1.69f)
                quadToRelative(0.0f, -1.12f, -3.89f, -3.22f)
                curveToRelative(-2.12f, -1.13f, -3.35f, -2.08f, -3.68f, -2.83f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -0.5f, -2.41f)
                arcToRelative(5.41f, 5.41f, 0.0f, false, true, 5.37f, -5.37f)
                horizontalLineToRelative(2.67f)
                curveTo(89.92f, 45.09f, 91.72f, 46.87f, 91.93f, 50.43f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(97.27f, 63.84f)
                verticalLineTo(39.72f)
                horizontalLineToRelative(5.37f)
                verticalLineToRelative(8.0f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, true, 0.84f, -2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.83f, -0.66f)
                horizontalLineTo(108.0f)
                arcToRelative(5.38f, 5.38f, 0.0f, false, true, 5.34f, 5.34f)
                verticalLineTo(63.84f)
                horizontalLineTo(108.0f)
                verticalLineTo(50.43f)
                arcToRelative(2.54f, 2.54f, 0.0f, false, false, -0.79f, -1.88f)
                arcToRelative(2.57f, 2.57f, 0.0f, false, false, -1.91f, -0.79f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, -2.67f, 2.67f)
                verticalLineTo(63.84f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(134.8f, 63.84f)
                horizontalLineToRelative(-5.33f)
                lineTo(129.47f, 61.17f)
                curveToRelative(-0.22f, 1.78f, -1.12f, 2.67f, -2.71f, 2.67f)
                horizontalLineToRelative(-2.67f)
                arcToRelative(5.41f, 5.41f, 0.0f, false, true, -5.37f, -5.37f)
                verticalLineToRelative(-8.0f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, 1.59f, -3.76f)
                arcToRelative(5.19f, 5.19f, 0.0f, false, true, 3.78f, -1.58f)
                horizontalLineToRelative(5.38f)
                lineTo(129.47f, 39.72f)
                horizontalLineToRelative(5.33f)
                close()
                moveTo(129.47f, 47.76f)
                horizontalLineToRelative(-2.71f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, -2.67f, 2.67f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.66f, 2.66f, 0.0f, false, false, 0.79f, 1.9f)
                arcToRelative(2.56f, 2.56f, 0.0f, false, false, 1.88f, 0.8f)
                arcToRelative(2.62f, 2.62f, 0.0f, false, false, 1.92f, -0.8f)
                arcToRelative(2.66f, 2.66f, 0.0f, false, false, 0.79f, -1.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(150.92f, 53.13f)
                verticalLineToRelative(-2.7f)
                arcToRelative(2.54f, 2.54f, 0.0f, false, false, -0.79f, -1.88f)
                arcToRelative(2.57f, 2.57f, 0.0f, false, false, -1.91f, -0.79f)
                horizontalLineToRelative(-2.67f)
                quadToRelative(-2.38f, 0.0f, -2.67f, 2.67f)
                horizontalLineToRelative(-2.7f)
                curveToRelative(0.42f, -3.56f, 2.22f, -5.34f, 5.37f, -5.34f)
                horizontalLineToRelative(5.37f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 5.34f, 5.34f)
                lineTo(156.26f, 63.84f)
                horizontalLineToRelative(-5.34f)
                lineTo(150.92f, 61.17f)
                quadToRelative(-0.33f, 2.67f, -2.7f, 2.67f)
                horizontalLineToRelative(-2.67f)
                arcToRelative(5.36f, 5.36f, 0.0f, false, true, 0.0f, -10.71f)
                close()
                moveTo(150.92f, 55.8f)
                horizontalLineToRelative(-2.7f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, -2.67f, 2.67f)
                arcToRelative(2.62f, 2.62f, 0.0f, false, false, 0.79f, 1.9f)
                arcToRelative(2.55f, 2.55f, 0.0f, false, false, 1.88f, 0.8f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, 1.91f, -0.8f)
                arcToRelative(2.62f, 2.62f, 0.0f, false, false, 0.79f, -1.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(161.63f, 63.84f)
                verticalLineTo(39.72f)
                horizontalLineTo(167.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, true, 0.84f, -2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.83f, -0.66f)
                horizontalLineToRelative(2.7f)
                arcToRelative(5.38f, 5.38f, 0.0f, false, true, 5.34f, 5.34f)
                verticalLineToRelative(8.0f)
                arcToRelative(5.39f, 5.39f, 0.0f, false, true, -5.34f, 5.37f)
                close()
                moveTo(167.0f, 61.17f)
                horizontalLineToRelative(2.67f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, 1.91f, -0.8f)
                arcToRelative(2.62f, 2.62f, 0.0f, false, false, 0.79f, -1.9f)
                verticalLineToRelative(-8.0f)
                arcToRelative(2.54f, 2.54f, 0.0f, false, false, -0.79f, -1.88f)
                arcToRelative(2.57f, 2.57f, 0.0f, false, false, -1.91f, -0.79f)
                arcTo(2.7f, 2.7f, 0.0f, false, false, 167.0f, 50.43f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(183.08f, 42.39f)
                lineTo(183.08f, 39.72f)
                horizontalLineToRelative(5.37f)
                verticalLineToRelative(2.67f)
                close()
                moveTo(183.08f, 63.84f)
                lineTo(183.08f, 45.09f)
                horizontalLineToRelative(5.37f)
                lineTo(188.45f, 63.84f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(199.16f, 45.09f)
                horizontalLineToRelative(5.38f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 5.34f, 5.34f)
                verticalLineToRelative(8.0f)
                arcToRelative(5.19f, 5.19f, 0.0f, false, true, -1.58f, 3.78f)
                arcToRelative(5.12f, 5.12f, 0.0f, false, true, -3.76f, 1.59f)
                horizontalLineToRelative(-5.38f)
                arcToRelative(5.43f, 5.43f, 0.0f, false, true, -5.37f, -5.37f)
                verticalLineToRelative(-8.0f)
                arcToRelative(5.08f, 5.08f, 0.0f, false, true, 1.6f, -3.76f)
                arcTo(5.15f, 5.15f, 0.0f, false, true, 199.16f, 45.09f)
                close()
                moveTo(199.16f, 50.43f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.66f, 2.66f, 0.0f, false, false, 0.79f, 1.9f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, 1.88f, 0.8f)
                arcToRelative(2.62f, 2.62f, 0.0f, false, false, 1.92f, -0.8f)
                arcToRelative(2.66f, 2.66f, 0.0f, false, false, 0.79f, -1.9f)
                verticalLineToRelative(-8.0f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, -0.79f, -1.88f)
                arcToRelative(2.61f, 2.61f, 0.0f, false, false, -1.92f, -0.79f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, -2.67f, 2.67f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(215.25f, 63.84f)
                verticalLineTo(39.72f)
                horizontalLineToRelative(5.37f)
                verticalLineTo(63.84f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(236.7f, 53.13f)
                verticalLineToRelative(-2.7f)
                arcToRelative(2.54f, 2.54f, 0.0f, false, false, -0.79f, -1.88f)
                arcToRelative(2.57f, 2.57f, 0.0f, false, false, -1.91f, -0.79f)
                horizontalLineToRelative(-2.67f)
                quadToRelative(-2.39f, 0.0f, -2.67f, 2.67f)
                lineTo(226.0f, 50.43f)
                quadToRelative(0.64f, -5.34f, 5.37f, -5.34f)
                horizontalLineToRelative(5.37f)
                arcTo(5.4f, 5.4f, 0.0f, false, true, 242.0f, 50.43f)
                lineTo(242.0f, 63.84f)
                lineTo(236.7f, 63.84f)
                lineTo(236.7f, 61.17f)
                quadToRelative(-0.33f, 2.67f, -2.7f, 2.67f)
                horizontalLineToRelative(-2.67f)
                arcToRelative(5.36f, 5.36f, 0.0f, false, true, 0.0f, -10.71f)
                close()
                moveTo(236.7f, 55.8f)
                lineTo(234.0f, 55.8f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, -2.67f, 2.67f)
                arcToRelative(2.62f, 2.62f, 0.0f, false, false, 0.79f, 1.9f)
                arcToRelative(2.55f, 2.55f, 0.0f, false, false, 1.88f, 0.8f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, 1.91f, -0.8f)
                arcToRelative(2.62f, 2.62f, 0.0f, false, false, 0.79f, -1.9f)
                close()
            }
        }
            .build()
        return _brand!!
    }

private var _brand: ImageVector? = null
