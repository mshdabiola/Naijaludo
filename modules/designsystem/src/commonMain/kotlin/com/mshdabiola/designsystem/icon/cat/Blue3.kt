package com.mshdabiola.ludo.screen.game.component.cat

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Cat.getBlue(iconColor: Long, accentColor: Long): ImageVector {
    return Builder(
        name = "Blue3",
        defaultWidth = 200.0.dp,
        defaultHeight = 200.0.dp,
        viewportWidth = 200.0f,
        viewportHeight = 200.0f,
    ).apply {
        path(
            fill = SolidColor(Color(iconColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(14.0f, 2.58f)
            curveToRelative(0.69f, 0.86f, 1.09f, 2.0f, 2.06f, 2.23f)
            curveToRelative(0.68f, 0.23f, 0.8f, 1.0f, 1.09f, 1.49f)
            curveToRelative(0.23f, 0.69f, 1.0f, 1.55f, 1.77f, 1.0f)
            arcToRelative(1.06f, 1.06f, 0.0f, false, true, 0.86f, 1.37f)
            curveToRelative(1.32f, 3.09f, 4.0f, 5.61f, 4.53f, 9.0f)
            curveToRelative(2.12f, 3.27f, 2.12f, 7.33f, 3.15f, 11.0f)
            curveToRelative(0.23f, 0.35f, 0.57f, 0.4f, 0.86f, 0.57f)
            curveToRelative(0.06f, 0.8f, -0.52f, 2.81f, 0.4f, 4.0f)
            curveToRelative(0.69f, 1.32f, 0.63f, 2.75f, 1.2f, 3.84f)
            curveToRelative(-1.0f, 1.83f, -0.22f, 4.12f, -0.68f, 6.0f)
            curveToRelative(1.43f, 1.77f, 0.91f, 4.24f, 0.68f, 6.47f)
            curveToRelative(1.38f, 2.0f, 0.86f, 5.33f, 1.0f, 7.56f)
            arcToRelative(4.87f, 4.87f, 0.0f, false, true, -0.29f, 4.53f)
            curveToRelative(0.17f, 1.2f, -1.0f, 3.2f, 0.57f, 3.61f)
            curveToRelative(0.75f, 1.83f, 3.21f, 2.23f, 5.22f, 1.77f)
            curveToRelative(1.95f, -1.83f, 4.53f, -1.49f, 7.0f, -2.34f)
            curveToRelative(0.75f, -0.81f, 1.61f, -1.84f, 3.0f, -1.78f)
            arcTo(30.79f, 30.79f, 0.0f, false, true, 56.0f, 59.41f)
            curveToRelative(0.8f, -1.55f, 3.5f, -0.78f, 4.7f, -2.0f)
            curveToRelative(3.89f, 0.35f, 7.79f, -1.79f, 11.57f, -0.25f)
            curveToRelative(1.78f, -1.37f, 3.67f, 0.92f, 5.5f, 0.18f)
            curveToRelative(2.81f, 0.68f, 4.29f, 2.8f, 6.87f, 4.12f)
            curveToRelative(3.5f, 0.17f, 4.87f, 5.84f, 8.37f, 4.93f)
            curveToRelative(3.72f, 4.35f, 10.43f, 3.72f, 15.41f, 5.9f)
            curveToRelative(2.12f, 1.37f, 4.47f, -0.35f, 6.59f, 1.0f)
            curveToRelative(0.4f, -0.4f, 1.0f, -0.4f, 1.49f, -0.57f)
            curveToRelative(2.18f, 1.2f, 4.92f, 1.0f, 7.0f, 2.35f)
            arcToRelative(64.5f, 64.5f, 0.0f, false, true, 12.0f, 5.21f)
            curveToRelative(3.0f, 2.69f, 6.93f, 4.53f, 9.34f, 8.0f)
            curveToRelative(3.26f, 5.1f, 7.5f, 9.63f, 8.54f, 15.93f)
            curveToRelative(2.4f, 3.09f, 1.13f, 9.91f, 2.29f, 11.68f)
            arcToRelative(54.5f, 54.5f, 0.0f, false, true, 5.95f, 7.17f)
            curveToRelative(0.17f, 1.43f, 1.27f, 2.63f, 1.09f, 4.12f)
            curveToRelative(0.75f, 1.0f, 0.0f, 3.26f, 1.78f, 3.55f)
            curveToRelative(4.0f, 1.72f, 4.58f, 6.82f, 8.82f, 8.14f)
            arcToRelative(2.61f, 2.61f, 0.0f, false, true, 2.06f, 1.0f)
            curveToRelative(2.0f, 0.12f, 3.0f, 1.95f, 4.13f, 3.27f)
            curveToRelative(1.31f, 0.57f, 2.0f, 1.94f, 3.55f, 1.94f)
            curveToRelative(0.92f, 1.09f, 2.64f, 0.12f, 3.72f, 0.81f)
            curveToRelative(2.75f, 2.11f, 6.76f, 2.63f, 7.0f, 6.87f)
            curveToRelative(-0.58f, 1.21f, -1.44f, 1.83f, -1.78f, 3.0f)
            curveToRelative(-1.15f, 2.69f, -4.7f, 3.0f, -6.59f, 5.1f)
            arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.69f, 4.4f)
            curveToRelative(-1.09f, 3.27f, 1.72f, 6.14f, -1.0f, 8.77f)
            curveToRelative(1.38f, 2.63f, 0.4f, 5.5f, -0.12f, 8.25f)
            curveToRelative(-1.0f, 1.26f, 0.69f, 2.86f, -0.28f, 3.72f)
            curveToRelative(1.72f, 4.19f, 1.54f, 9.17f, 3.26f, 13.35f)
            curveToRelative(0.53f, 0.69f, -0.6f, 0.95f, -1.89f, 0.11f)
            curveToRelative(-2.52f, -1.71f, -4.87f, -3.77f, -7.56f, -5.49f)
            curveToRelative(-1.83f, -0.69f, -3.1f, -2.87f, -5.5f, -2.07f)
            curveToRelative(-1.43f, 0.23f, -0.63f, 2.76f, -1.26f, 2.76f)
            arcToRelative(2.27f, 2.27f, 0.0f, false, true, -0.4f, -1.78f)
            arcToRelative(1.22f, 1.22f, 0.0f, false, false, 0.0f, -0.65f)
            curveToRelative(-0.69f, 0.15f, -2.23f, 0.0f, -2.26f, 0.3f)
            curveToRelative(-0.08f, 0.74f, 0.34f, 1.54f, -0.58f, 2.41f)
            curveToRelative(-0.62f, -0.57f, 0.06f, -1.66f, -0.68f, -2.17f)
            curveToRelative(-2.47f, 0.57f, -4.93f, 1.08f, -7.16f, -0.29f)
            curveToRelative(-5.85f, 0.0f, -7.11f, -7.28f, -13.35f, -6.36f)
            curveToRelative(-0.13f, 2.44f, -4.0f, 9.73f, -6.3f, 11.29f)
            curveToRelative(-0.34f, 0.25f, -0.7f, 0.0f, -0.45f, -0.17f)
            curveToRelative(3.15f, -2.46f, 6.52f, -9.88f, 6.15f, -11.25f)
            arcToRelative(4.17f, 4.17f, 0.0f, false, false, -2.0f, -1.65f)
            curveToRelative(-1.17f, 3.07f, -4.25f, 5.45f, -5.64f, 6.35f)
            curveToRelative(-0.5f, 0.23f, -0.66f, -0.2f, -0.3f, -0.47f)
            arcToRelative(13.0f, 13.0f, 0.0f, false, false, 5.55f, -6.29f)
            curveToRelative(0.06f, -0.1f, -1.42f, -1.33f, -1.85f, -2.0f)
            arcToRelative(25.64f, 25.64f, 0.0f, false, true, -6.44f, 3.92f)
            curveToRelative(-0.6f, 0.15f, -0.63f, -0.33f, -0.16f, -0.5f)
            curveToRelative(1.95f, -0.68f, 6.0f, -3.11f, 6.35f, -4.09f)
            arcToRelative(11.0f, 11.0f, 0.0f, false, true, -1.35f, -3.24f)
            curveToRelative(-1.0f, -0.86f, -2.29f, -1.49f, -2.86f, -2.75f)
            curveToRelative(-0.18f, -1.66f, -1.21f, -2.75f, -1.78f, -4.13f)
            curveToRelative(-1.89f, -0.57f, -4.0f, -2.4f, -6.19f, -1.08f)
            curveToRelative(-1.0f, 0.51f, -1.83f, -0.4f, -2.75f, -0.57f)
            curveToRelative(-5.55f, -0.81f, -10.71f, -3.21f, -16.27f, -1.09f)
            curveToRelative(-2.46f, -0.58f, -5.36f, 1.0f, -7.88f, 0.32f)
            arcTo(10.28f, 10.28f, 0.0f, false, true, 98.26f, 167.0f)
            curveToRelative(-2.82f, 0.62f, -8.62f, -0.86f, -10.84f, -1.28f)
            curveToRelative(-2.29f, 0.0f, -4.23f, -0.69f, -6.64f, -0.41f)
            arcToRelative(13.11f, 13.11f, 0.0f, false, false, -8.0f, -1.25f)
            curveToRelative(-4.13f, 0.74f, -6.82f, -2.81f, -10.6f, -3.33f)
            arcToRelative(6.06f, 6.06f, 0.0f, false, true, -3.0f, -0.4f)
            curveToRelative(-2.18f, 0.34f, -3.0f, -2.46f, -5.1f, -0.69f)
            arcToRelative(6.85f, 6.85f, 0.0f, false, true, -4.0f, -1.37f)
            curveToRelative(-1.38f, -0.8f, -2.29f, 1.0f, -3.56f, 0.0f)
            curveToRelative(-2.0f, 0.06f, -3.0f, -1.37f, -5.0f, -1.37f)
            curveToRelative(-0.23f, 0.74f, 0.0f, 1.77f, -0.4f, 2.46f)
            curveToRelative(-1.61f, 3.4f, -4.3f, 4.81f, -7.85f, 4.12f)
            curveToRelative(-0.7f, -0.19f, -1.15f, -1.14f, -1.61f, -1.89f)
            curveToRelative(-0.62f, -0.8f, 0.18f, -2.52f, -1.25f, -2.64f)
            curveToRelative(-0.75f, -1.14f, -0.12f, -2.57f, -1.26f, -3.72f)
            curveToRelative(-0.81f, -3.26f, 1.89f, -5.78f, 0.17f, -8.76f)
            curveToRelative(0.34f, -1.49f, 1.09f, -2.29f, 0.4f, -3.84f)
            curveToRelative(-0.63f, 0.11f, -1.26f, 0.57f, -1.95f, 0.23f)
            arcToRelative(4.18f, 4.18f, 0.0f, false, true, -1.77f, -2.18f)
            curveToRelative(-1.89f, -0.11f, -2.24f, -1.95f, -2.58f, -3.43f)
            arcToRelative(6.32f, 6.32f, 0.0f, false, true, -1.26f, -4.82f)
            curveToRelative(-1.44f, -0.46f, -1.66f, -2.17f, -2.07f, -3.43f)
            reflectiveCurveToRelative(1.32f, -2.29f, 0.12f, -3.44f)
            curveToRelative(-1.0f, -1.49f, -0.35f, -3.73f, 0.17f, -4.93f)
            curveToRelative(-1.38f, -2.29f, 1.72f, -4.07f, 0.29f, -6.07f)
            curveToRelative(-0.81f, 0.4f, -1.6f, 0.8f, -1.67f, 1.66f)
            curveToRelative(-1.08f, 0.29f, -0.17f, -1.66f, -0.85f, -2.23f)
            curveToRelative(0.0f, -1.09f, 0.85f, -2.41f, 0.17f, -3.16f)
            curveToRelative(-0.69f, 0.52f, -1.55f, 1.32f, -2.35f, 1.09f)
            arcToRelative(31.0f, 31.0f, 0.0f, false, true, 0.8f, -6.0f)
            curveToRelative(-0.8f, -1.32f, -2.58f, 0.86f, -2.75f, -0.86f)
            curveToRelative(1.55f, -1.43f, -2.29f, -2.0f, -0.8f, -3.67f)
            curveToRelative(-3.32f, -1.49f, 0.52f, -5.0f, -2.47f, -6.64f)
            curveToRelative(0.92f, -1.21f, -1.89f, -3.0f, 0.29f, -2.87f)
            arcTo(11.7f, 11.7f, 0.0f, false, false, 10.0f, 89.2f)
            curveToRelative(1.0f, -3.5f, -1.44f, -6.94f, -0.41f, -10.14f)
            curveToRelative(-0.17f, -0.52f, -1.08f, -0.92f, -0.51f, -1.55f)
            curveToRelative(-2.0f, -4.0f, -0.12f, -8.54f, -1.83f, -12.61f)
            curveToRelative(-0.06f, -1.0f, -1.44f, -1.6f, -0.92f, -2.92f)
            arcToRelative(10.88f, 10.88f, 0.0f, false, false, 0.4f, -9.45f)
            curveToRelative(0.57f, -0.68f, 0.52f, -1.77f, 1.09f, -2.35f)
            curveToRelative(-0.4f, -3.38f, -1.0f, -7.33f, 0.0f, -10.59f)
            arcToRelative(26.58f, 26.58f, 0.0f, false, true, -0.29f, -6.76f)
            curveToRelative(0.65f, -1.92f, -0.57f, -4.0f, 0.4f, -4.36f)
            arcToRelative(5.66f, 5.66f, 0.0f, false, false, 0.0f, -3.89f)
            curveToRelative(1.55f, -1.61f, 0.58f, -4.64f, 0.87f, -6.71f)
            reflectiveCurveTo(7.16f, 9.62f, 8.59f, 9.22f)
            curveToRelative(-0.69f, -2.86f, 0.63f, -5.1f, 1.55f, -7.56f)
            curveTo(11.46f, 2.0f, 10.42f, 0.17f, 11.34f, 0.0f)
            curveToRelative(0.86f, 0.86f, 1.2f, 2.4f, 2.64f, 2.58f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(168.8f, 139.57f)
            curveToRelative(0.0f, -1.09f, -1.38f, -0.75f, -2.24f, -0.81f)
            curveToRelative(-1.37f, -0.74f, -2.86f, 0.17f, -4.24f, 0.23f)
            verticalLineToRelative(0.46f)
            curveToRelative(2.18f, 0.4f, 4.3f, -0.34f, 6.48f, 0.12f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(181.57f, 147.24f)
            curveToRelative(-0.22f, -1.0f, -1.66f, -0.23f, -2.35f, -0.69f)
            curveToRelative(0.29f, 1.49f, -2.51f, 0.35f, -1.26f, 1.26f)
            curveToRelative(1.21f, 0.63f, 2.41f, -0.4f, 3.61f, -0.57f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(173.84f, 144.0f)
            arcToRelative(3.38f, 3.38f, 0.0f, false, false, -1.78f, -2.34f)
            curveToRelative(-0.68f, -0.4f, -2.29f, -0.58f, -1.08f, 0.69f)
            curveToRelative(0.4f, 0.63f, 1.83f, 0.4f, 1.77f, 1.48f)
            curveToRelative(-0.69f, 2.18f, 1.83f, 3.56f, 1.55f, 5.5f)
            arcToRelative(0.8f, 0.8f, 0.0f, false, false, 1.09f, 0.17f)
            curveToRelative(0.8f, -2.51f, -2.47f, -3.26f, -1.55f, -5.5f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(187.84f, 152.34f)
            curveToRelative(-0.2f, -0.65f, 0.44f, -1.26f, 0.0f, -1.89f)
            curveToRelative(-0.74f, -0.17f, -0.42f, 0.66f, -0.4f, 1.38f)
            curveToRelative(-0.57f, 0.34f, -0.11f, 1.0f, -0.8f, 1.29f)
            curveToRelative(-0.46f, -0.29f, -1.14f, -0.15f, -1.26f, -0.78f)
            arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.0f, -2.75f)
            curveToRelative(-0.34f, 0.0f, -0.86f, 0.4f, -0.69f, 0.86f)
            curveToRelative(-0.29f, 1.38f, 0.52f, 2.29f, 0.4f, 3.55f)
            curveToRelative(1.21f, -0.57f, 3.29f, 0.06f, 3.69f, -1.66f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(183.64f, 154.4f)
            curveToRelative(-0.56f, -0.6f, -0.4f, -2.0f, -0.8f, -2.43f)
            curveToRelative(-0.06f, -0.06f, -0.19f, 0.0f, -0.2f, 0.15f)
            curveToRelative(-0.07f, 1.23f, -1.22f, 4.07f, 1.0f, 2.28f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(170.35f, 163.93f)
            curveToRelative(1.67f, -0.37f, 4.28f, -0.59f, 4.64f, -2.65f)
            arcToRelative(3.63f, 3.63f, 0.0f, false, false, -1.55f, 0.69f)
            curveToRelative(-0.76f, 0.61f, -2.4f, 1.26f, -3.26f, 1.79f)
            curveToRelative(-0.18f, 0.11f, -0.06f, 0.22f, 0.17f, 0.17f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(164.9f, 161.57f)
            curveToRelative(-1.72f, -1.21f, -0.07f, 0.87f, -0.13f, 1.33f)
            curveToRelative(0.29f, 0.52f, -0.15f, 1.3f, 0.13f, 1.82f)
            arcToRelative(1.78f, 1.78f, 0.0f, false, false, 0.0f, -3.15f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(158.59f, 164.89f)
            curveToRelative(1.0f, -0.75f, 3.15f, -1.0f, 4.52f, -1.14f)
            curveToRelative(0.74f, -0.75f, 0.25f, -1.05f, 0.0f, -1.69f)
            arcToRelative(2.67f, 2.67f, 0.0f, false, false, -2.0f, 0.14f)
            arcToRelative(4.78f, 4.78f, 0.0f, false, false, -2.66f, 2.54f)
            curveToRelative(0.0f, 0.12f, 0.09f, 0.22f, 0.16f, 0.15f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(158.55f, 166.0f)
            curveToRelative(-0.43f, -0.31f, -0.53f, 1.0f, -0.44f, 1.49f)
            arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.81f, 1.59f)
            arcToRelative(3.74f, 3.74f, 0.0f, false, false, 2.79f, -2.59f)
            curveToRelative(-1.48f, 1.58f, -4.05f, -0.41f, -4.16f, -0.49f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(157.51f, 167.75f)
            curveToRelative(-1.26f, -1.47f, -0.67f, -2.81f, -0.28f, -4.13f)
            curveToRelative(0.11f, -0.4f, 1.66f, -2.0f, 0.11f, -1.0f)
            curveToRelative(-1.43f, 1.78f, -1.32f, 4.36f, -0.69f, 6.48f)
            curveToRelative(0.75f, -0.06f, 1.32f, -0.69f, 0.86f, -1.38f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(176.72f, 165.4f)
            curveToRelative(0.1f, 0.0f, 0.12f, -0.09f, 0.0f, -0.13f)
            arcToRelative(7.41f, 7.41f, 0.0f, false, false, -3.11f, 0.0f)
            curveToRelative(-1.41f, 0.78f, -3.39f, 0.57f, -5.05f, 0.74f)
            curveToRelative(-0.15f, 0.0f, -0.1f, 0.09f, 0.0f, 0.23f)
            curveToRelative(0.43f, 0.67f, 5.5f, 0.37f, 8.17f, -0.86f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(176.59f, 169.41f)
            curveToRelative(1.0f, -0.06f, -0.17f, -0.57f, -0.4f, -0.57f)
            curveToRelative(-2.18f, -0.8f, -4.24f, 0.34f, -6.48f, 0.17f)
            curveToRelative(-1.26f, 0.23f, 0.69f, 0.63f, 1.15f, 0.69f)
            curveToRelative(2.24f, -0.18f, 3.84f, 0.4f, 5.73f, -0.29f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(164.21f, 169.52f)
            curveToRelative(-1.2f, -1.54f, 1.44f, -1.08f, 0.69f, -2.74f)
            curveToRelative(0.06f, -1.49f, -0.52f, 0.8f, -1.09f, 1.26f)
            arcToRelative(34.55f, 34.55f, 0.0f, false, true, -4.52f, 2.58f)
            curveToRelative(0.86f, 0.62f, 2.17f, 0.11f, 3.32f, 0.17f)
            arcToRelative(2.09f, 2.09f, 0.0f, false, false, 1.6f, -1.27f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(171.09f, 171.07f)
            arcToRelative(15.75f, 15.75f, 0.0f, false, true, -3.0f, -1.0f)
            curveToRelative(0.52f, 1.72f, 2.92f, 1.49f, 4.24f, 2.06f)
            curveToRelative(0.86f, -0.17f, -0.8f, -0.74f, -1.26f, -1.09f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(158.72f, 180.92f)
            curveToRelative(-0.44f, -0.22f, -2.0f, -0.22f, -2.3f, 0.87f)
            curveToRelative(-0.09f, 0.46f, 0.0f, 1.8f, 0.44f, 1.48f)
            curveToRelative(0.1f, -0.07f, 2.21f, -1.57f, 3.69f, 0.0f)
            arcToRelative(3.62f, 3.62f, 0.0f, false, false, -1.83f, -2.36f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(170.17f, 190.55f)
            curveToRelative(0.86f, -1.0f, -0.4f, -2.58f, -0.57f, -3.84f)
            reflectiveCurveToRelative(-1.32f, -1.54f, -1.26f, -2.86f)
            curveToRelative(-0.75f, -0.8f, -1.21f, -1.83f, -2.18f, -2.06f)
            curveToRelative(1.78f, 2.52f, 2.64f, 5.84f, 4.0f, 8.76f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(171.26f, 183.45f)
            arcToRelative(4.92f, 4.92f, 0.0f, false, false, -2.62f, -1.69f)
            curveToRelative(-0.18f, 0.0f, -0.22f, 0.09f, -0.07f, 0.2f)
            curveToRelative(2.9f, 2.38f, 3.89f, 6.1f, 6.0f, 8.88f)
            curveToRelative(0.29f, -2.92f, -2.0f, -5.16f, -3.27f, -7.39f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(179.34f, 185.63f)
            curveToRelative(-0.52f, 0.05f, -0.86f, 0.62f, -1.38f, 0.8f)
            arcToRelative(6.28f, 6.28f, 0.0f, false, false, 2.35f, 1.66f)
            arcToRelative(4.25f, 4.25f, 0.0f, false, false, -1.0f, -2.46f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(179.15f, 192.16f)
            curveToRelative(0.82f, 0.0f, 1.65f, 0.73f, 2.0f, 0.0f)
            curveToRelative(0.36f, -0.36f, 0.75f, 0.05f, 1.18f, 0.07f)
            curveToRelative(0.32f, 0.5f, -0.28f, 0.73f, -0.06f, 1.22f)
            curveToRelative(-0.34f, 0.45f, -0.94f, 0.86f, -0.37f, 1.08f)
            curveToRelative(0.56f, -0.23f, 0.42f, -0.92f, 0.85f, -1.25f)
            curveToRelative(1.2f, -2.72f, -0.92f, -2.19f, -1.66f, -2.78f)
            curveToRelative(-1.0f, -0.21f, -2.3f, -0.74f, -2.75f, 0.29f)
            curveToRelative(-0.32f, 0.22f, -0.07f, 1.21f, 0.83f, 1.36f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(164.79f, 185.34f)
            curveToRelative(0.91f, 1.77f, 0.86f, 4.0f, 2.17f, 5.67f)
            curveToRelative(0.46f, -2.06f, -0.28f, -4.76f, -2.17f, -5.67f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(160.6f, 189.55f)
            curveToRelative(-0.21f, 0.17f, -0.38f, 0.43f, -0.62f, 0.6f)
            curveToRelative(1.0f, 0.52f, 1.66f, -0.74f, 2.17f, -1.37f)
            curveToRelative(0.52f, -1.09f, 0.8f, -2.29f, 1.26f, -3.44f)
            curveToRelative(0.0f, -0.35f, -0.46f, -1.0f, -0.68f, -0.29f)
            curveToRelative(0.44f, 1.58f, -0.95f, 2.36f, -1.49f, 3.64f)
            curveToRelative(0.0f, 0.62f, -0.51f, 0.74f, -0.64f, 0.86f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(160.77f, 187.28f)
            curveToRelative(0.4f, -0.61f, 0.92f, -0.91f, 0.18f, -1.65f)
            arcToRelative(7.54f, 7.54f, 0.0f, false, true, -3.82f, -1.41f)
            curveToRelative(-0.08f, -0.07f, -0.2f, 0.0f, -0.17f, 0.14f)
            arcToRelative(4.71f, 4.71f, 0.0f, false, false, 2.44f, 2.75f)
            arcToRelative(1.44f, 1.44f, 0.0f, false, false, 1.37f, 0.17f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(156.9f, 187.22f)
            curveToRelative(0.1f, 0.06f, 0.23f, 0.0f, 0.18f, 0.0f)
            arcToRelative(10.23f, 10.23f, 0.0f, false, true, -1.63f, -7.07f)
            curveToRelative(-1.0f, 0.57f, -0.68f, 2.14f, -0.85f, 3.11f)
            curveToRelative(0.15f, 0.76f, 1.0f, 3.13f, 2.3f, 4.0f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(141.82f, 178.75f)
            curveToRelative(0.22f, 0.57f, 0.17f, 1.26f, 0.68f, 1.66f)
            curveToRelative(0.86f, -0.28f, 0.32f, -2.81f, 1.46f, -1.66f)
            curveToRelative(0.46f, 1.49f, -2.49f, 2.35f, -0.2f, 3.44f)
            curveToRelative(0.11f, -0.29f, 1.0f, -1.38f, 0.29f, -2.06f)
            curveToRelative(0.06f, -0.29f, 0.26f, -0.72f, 0.51f, -0.69f)
            curveToRelative(0.75f, 0.34f, 0.4f, 1.55f, 0.29f, 2.18f)
            curveToRelative(-0.4f, 0.68f, -0.52f, 1.48f, 0.11f, 1.94f)
            curveToRelative(0.8f, 1.0f, 1.32f, -0.05f, 0.69f, -0.8f)
            curveToRelative(-0.11f, -0.17f, -0.34f, -0.34f, -0.22f, -0.57f)
            curveToRelative(0.22f, -0.06f, 0.39f, -0.52f, 0.68f, -0.12f)
            curveToRelative(1.15f, 1.15f, -0.17f, 3.21f, 1.89f, 3.56f)
            curveToRelative(0.92f, -0.29f, 2.05f, -0.45f, 3.0f, -0.81f)
            curveToRelative(2.12f, -1.54f, 1.32f, -4.69f, 3.84f, -5.78f)
            arcToRelative(5.61f, 5.61f, 0.0f, false, true, 2.64f, -0.43f)
            arcToRelative(16.41f, 16.41f, 0.0f, false, true, 3.43f, 0.0f)
            curveToRelative(0.57f, -0.74f, 2.52f, 0.35f, 2.58f, -1.0f)
            curveToRelative(1.09f, -0.68f, 2.46f, -0.57f, 3.43f, -1.09f)
            curveToRelative(-0.34f, -1.89f, -3.55f, -0.62f, -3.15f, -3.2f)
            curveToRelative(-2.12f, -1.0f, -4.81f, -1.21f, -7.0f, -2.47f)
            curveToRelative(-1.44f, 0.34f, -2.18f, -1.38f, -3.0f, -2.17f)
            curveToRelative(-0.92f, -1.67f, -0.23f, -4.76f, -2.87f, -4.82f)
            curveToRelative(-0.4f, -1.43f, -1.55f, -2.29f, -1.83f, -3.61f)
            curveToRelative(0.23f, -1.08f, 2.58f, -1.6f, 1.14f, -3.15f)
            curveToRelative(-0.28f, -0.28f, -0.91f, -0.68f, -0.68f, -1.37f)
            curveToRelative(1.66f, -1.09f, 0.23f, -3.38f, 0.68f, -4.93f)
            curveToRelative(-1.14f, -0.17f, -1.0f, -1.55f, -1.37f, -2.35f)
            curveToRelative(0.06f, -1.09f, 1.43f, -0.63f, 0.92f, -1.78f)
            arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.46f)
            curveToRelative(-0.92f, -0.29f, -1.0f, 0.57f, -1.49f, 1.09f)
            curveToRelative(0.17f, 0.86f, 0.4f, 2.58f, -0.69f, 2.58f)
            curveToRelative(-1.26f, 0.23f, 0.34f, 2.35f, -1.66f, 1.95f)
            arcToRelative(2.69f, 2.69f, 0.0f, false, false, -1.38f, 2.0f)
            curveToRelative(2.92f, 4.69f, 5.39f, 10.71f, 3.73f, 16.61f)
            curveToRelative(-0.35f, 0.43f, -0.85f, 0.08f, -0.81f, -0.4f)
            curveToRelative(2.47f, -4.69f, -1.0f, -12.85f, -3.4f, -15.43f)
            curveToRelative(-0.34f, 1.32f, -0.43f, 2.88f, -1.58f, 3.74f)
            curveToRelative(-0.09f, 0.26f, -0.25f, 0.43f, -0.23f, 0.65f)
            curveToRelative(0.4f, 0.78f, 1.37f, 1.68f, 1.6f, 2.62f)
            curveToRelative(0.81f, 0.4f, 0.63f, -1.26f, 1.56f, -0.69f)
            arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.87f, 2.06f)
            arcToRelative(14.55f, 14.55f, 0.0f, false, true, 1.66f, 8.53f)
            curveToRelative(-0.07f, 0.35f, -0.4f, 0.41f, -0.68f, 0.29f)
            arcToRelative(15.6f, 15.6f, 0.0f, false, false, -1.38f, -8.0f)
            curveToRelative(-1.09f, 0.68f, -1.43f, 1.93f, -1.66f, 3.31f)
            arcToRelative(26.26f, 26.26f, 0.0f, false, true, 1.66f, 6.07f)
            arcToRelative(0.44f, 0.44f, 0.0f, false, true, -0.69f, 0.11f)
            arcToRelative(12.35f, 12.35f, 0.0f, false, false, -0.95f, -4.19f)
            curveToRelative(-0.05f, -0.11f, -0.2f, -0.07f, -0.23f, 0.07f)
            curveToRelative(-0.44f, 2.13f, -0.12f, 5.2f, 1.76f, 6.76f)
            arcToRelative(4.48f, 4.48f, 0.0f, false, false, 4.12f, 1.0f)
            curveToRelative(1.09f, -0.63f, 1.0f, -3.32f, 2.75f, -2.46f)
            curveToRelative(0.45f, 1.94f, 1.1f, 4.0f, 0.12f, 6.3f)
            curveToRelative(-0.92f, -0.05f, -2.07f, 0.8f, -2.75f, -0.29f)
            curveToRelative(-0.22f, -0.89f, -0.33f, -2.0f, -1.0f, -2.5f)
            arcToRelative(10.13f, 10.13f, 0.0f, false, false, -3.29f, -0.6f)
            arcToRelative(1.47f, 1.47f, 0.0f, false, false, -0.91f, 0.52f)
            arcToRelative(3.79f, 3.79f, 0.0f, false, false, -1.25f, 2.87f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(140.72f, 158.13f)
            curveToRelative(-0.51f, 1.14f, -1.83f, 2.0f, -1.48f, 3.44f)
            curveToRelative(0.86f, 0.74f, 2.13f, 1.43f, 2.53f, 2.52f)
            curveToRelative(0.55f, -1.34f, 1.22f, -2.2f, 1.84f, -3.57f)
            curveToRelative(-0.45f, -0.94f, -1.09f, -2.58f, -1.91f, -2.79f)
            curveToRelative(-0.27f, -0.08f, -0.59f, 0.0f, -1.0f, 0.4f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(137.3f, 173.15f)
            curveToRelative(0.0f, 1.89f, 1.0f, 2.8f, 2.34f, 3.94f)
            curveToRelative(1.14f, 0.78f, 1.83f, -0.61f, 1.49f, -1.49f)
            arcToRelative(2.53f, 2.53f, 0.0f, false, true, 0.17f, -2.75f)
            arcToRelative(3.19f, 3.19f, 0.0f, false, false, -0.08f, -2.49f)
            curveToRelative(-0.66f, -1.7f, -0.09f, -2.77f, 0.5f, -4.43f)
            curveToRelative(0.7f, -0.93f, -1.74f, -3.0f, -2.6f, -3.66f)
            curveToRelative(-0.63f, 0.22f, -0.46f, 1.13f, -0.69f, 1.64f)
            curveToRelative(-2.89f, 3.82f, -3.38f, 5.49f, -1.13f, 9.24f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(21.68f, 119.74f)
            curveToRelative(-0.07f, 1.89f, -1.15f, 4.47f, 0.22f, 6.19f)
            curveToRelative(0.11f, 0.8f, -0.74f, 1.72f, 0.17f, 2.35f)
            curveToRelative(-0.46f, 1.61f, 0.64f, 3.0f, 1.78f, 4.12f)
            curveToRelative(-0.06f, 1.55f, -0.74f, 4.0f, 1.09f, 4.7f)
            arcToRelative(2.7f, 2.7f, 0.0f, false, false, 1.66f, 2.75f)
            arcToRelative(1.07f, 1.07f, 0.0f, false, true, 1.0f, 0.4f)
            curveToRelative(-0.29f, 0.92f, 0.51f, 1.26f, 1.08f, 1.66f)
            curveToRelative(0.52f, -0.34f, 1.26f, -0.4f, 1.49f, -1.09f)
            curveToRelative(-0.06f, -0.91f, 0.58f, -1.83f, 1.55f, -1.25f)
            curveToRelative(0.34f, 0.91f, 2.0f, -0.23f, 1.66f, 1.08f)
            arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.38f, 0.86f)
            curveToRelative(-0.28f, 0.75f, 2.36f, 0.69f, 0.69f, 1.49f)
            curveToRelative(-0.8f, -0.28f, -2.23f, -0.23f, -1.66f, 1.0f)
            curveToRelative(0.17f, 0.58f, 0.75f, 1.0f, 0.52f, 1.78f)
            curveToRelative(-0.75f, 0.23f, -1.0f, 1.32f, -0.69f, 2.06f)
            curveToRelative(1.54f, 2.41f, -1.0f, 4.88f, -0.4f, 7.56f)
            curveToRelative(2.81f, 0.58f, -0.46f, 3.73f, 2.35f, 4.25f)
            curveToRelative(1.08f, 1.0f, -0.06f, 4.47f, 2.63f, 3.32f)
            curveToRelative(0.23f, -0.63f, 0.86f, -0.35f, 1.38f, -0.4f)
            curveToRelative(1.38f, -0.91f, 1.51f, -2.26f, 0.91f, -4.0f)
            curveToRelative(1.09f, -0.12f, 0.69f, 1.09f, 1.0f, 1.66f)
            curveToRelative(1.15f, -0.17f, 1.6f, -1.15f, 2.06f, -2.06f)
            curveToRelative(0.69f, -2.18f, -2.18f, -0.75f, -2.18f, -2.35f)
            curveToRelative(1.67f, -0.69f, 3.38f, 0.8f, 4.93f, 0.28f)
            curveToRelative(1.43f, 0.75f, 3.44f, 1.67f, 5.1f, 1.27f)
            curveToRelative(1.89f, -0.58f, 2.52f, 1.0f, 4.12f, 1.08f)
            curveToRelative(1.55f, 0.35f, 3.9f, -0.91f, 4.82f, 0.81f)
            arcToRelative(28.92f, 28.92f, 0.0f, false, false, 5.78f, 0.86f)
            curveToRelative(2.58f, 0.74f, 4.87f, 2.29f, 7.57f, 2.86f)
            curveToRelative(3.32f, 1.15f, 7.67f, -1.37f, 10.31f, 1.66f)
            curveToRelative(1.78f, -0.8f, 3.09f, 0.29f, 4.93f, 0.12f)
            arcToRelative(21.55f, 21.55f, 0.0f, false, false, 2.23f, 0.4f)
            curveToRelative(2.18f, 0.57f, 4.81f, 0.51f, 6.88f, 0.86f)
            curveToRelative(1.72f, 0.22f, 3.83f, -0.24f, 4.92f, 1.48f)
            curveToRelative(4.09f, 1.64f, 5.38f, 0.0f, 9.34f, 0.0f)
            curveToRelative(1.88f, 0.0f, 6.0f, -1.37f, 7.73f, -1.08f)
            curveToRelative(1.44f, 1.08f, 3.67f, 0.63f, 5.0f, 1.66f)
            curveToRelative(1.54f, 0.63f, 3.55f, 0.29f, 4.81f, 1.48f)
            curveToRelative(1.72f, 0.0f, 3.0f, -1.37f, 4.81f, -0.68f)
            arcToRelative(12.8f, 12.8f, 0.0f, false, false, 2.92f, 1.09f)
            curveToRelative(0.17f, -3.0f, 2.12f, -5.56f, 3.44f, -8.25f)
            curveToRelative(-0.86f, -1.32f, -2.23f, -1.78f, -3.72f, -2.75f)
            curveToRelative(-1.56f, -0.8f, -1.52f, -1.18f, 0.0f, -0.58f)
            arcToRelative(12.72f, 12.72f, 0.0f, false, true, 3.41f, 2.0f)
            curveToRelative(-0.28f, -1.42f, 2.49f, -2.34f, 2.66f, -3.63f)
            curveToRelative(0.08f, -0.63f, -3.24f, -2.77f, -3.63f, -3.11f)
            curveToRelative(-0.94f, -0.79f, -0.71f, -1.06f, 0.31f, -0.55f)
            arcToRelative(17.72f, 17.72f, 0.0f, false, true, 3.81f, 2.94f)
            curveToRelative(1.71f, -0.86f, 0.57f, -3.5f, 2.06f, -4.58f)
            curveToRelative(0.0f, -0.69f, -2.12f, -3.27f, -2.75f, -4.82f)
            curveToRelative(-0.16f, -0.35f, 0.38f, -0.34f, 0.57f, 0.0f)
            curveToRelative(0.81f, 1.21f, 1.66f, 2.53f, 2.46f, 3.61f)
            curveToRelative(1.0f, -0.45f, 1.44f, -1.94f, 2.64f, -2.23f)
            curveToRelative(-1.0f, -1.83f, 1.72f, -1.89f, 1.37f, -3.55f)
            curveToRelative(0.46f, -2.18f, 3.44f, -1.84f, 4.24f, -4.0f)
            curveToRelative(0.92f, 0.12f, 0.92f, -1.14f, 1.78f, -1.2f)
            curveToRelative(1.26f, -0.74f, 3.09f, -0.34f, 4.3f, -0.85f)
            horizontalLineToRelative(0.68f)
            curveToRelative(0.75f, -1.55f, 3.44f, -2.0f, 3.0f, -4.13f)
            curveToRelative(0.81f, -1.0f, -0.17f, -2.12f, -0.69f, -2.86f)
            curveToRelative(-0.11f, -0.46f, 1.0f, -1.54f, 0.18f, -1.26f)
            curveToRelative(-2.64f, 0.11f, 0.74f, -3.27f, -1.95f, -2.75f)
            curveToRelative(-0.63f, -1.09f, 0.34f, -3.1f, -1.38f, -3.16f)
            curveToRelative(-0.62f, -0.74f, -0.45f, -1.89f, -0.51f, -2.74f)
            curveToRelative(-0.8f, -0.69f, -1.55f, -1.84f, -2.64f, -1.21f)
            curveToRelative(-1.25f, 3.0f, -3.0f, 5.56f, -4.4f, 8.48f)
            curveToRelative(-3.73f, 2.52f, -7.51f, 3.61f, -10.0f, 7.56f)
            curveToRelative(-2.81f, 2.07f, -5.44f, 3.1f, -7.85f, 5.5f)
            curveToRelative(-3.44f, 1.21f, -6.0f, 4.36f, -10.43f, 3.33f)
            curveToRelative(-2.23f, 1.2f, -5.0f, -1.32f, -6.59f, 1.08f)
            curveToRelative(-1.32f, 0.23f, -2.41f, 1.15f, -3.61f, 1.38f)
            curveToRelative(-4.52f, 1.94f, -10.14f, 1.83f, -14.84f, 3.72f)
            curveToRelative(-3.15f, 0.52f, -6.47f, 1.89f, -9.73f, 1.0f)
            curveToRelative(-1.84f, 0.29f, -3.79f, 1.67f, -5.5f, 1.0f)
            curveToRelative(-1.32f, 0.0f, -1.95f, 1.2f, -3.44f, 0.92f)
            arcToRelative(15.21f, 15.21f, 0.0f, false, true, -6.36f, 1.25f)
            curveToRelative(-1.32f, -2.46f, -3.84f, 0.0f, -5.79f, 0.0f)
            curveToRelative(-1.2f, -0.33f, 0.86f, -1.65f, -0.8f, -1.37f)
            curveToRelative(-1.26f, -0.63f, -3.61f, 2.0f, -3.32f, -0.68f)
            curveToRelative(0.17f, -0.18f, 0.0f, -0.52f, -0.23f, -0.69f)
            curveToRelative(-0.8f, -0.06f, -1.2f, 0.63f, -1.83f, 1.0f)
            curveToRelative(-0.58f, -0.4f, -1.55f, -1.2f, -1.09f, -1.77f)
            curveToRelative(0.11f, -2.64f, -2.7f, -0.46f, -3.16f, -2.53f)
            curveToRelative(-3.09f, -1.08f, -4.52f, -5.0f, -8.24f, -4.81f)
            curveToRelative(-0.81f, -0.63f, -3.1f, 1.09f, -2.64f, -1.09f)
            curveToRelative(-0.46f, -0.51f, -2.75f, 0.06f, -2.29f, -1.49f)
            curveToRelative(-0.75f, -0.4f, -2.69f, 0.29f, -3.0f, -1.09f)
            curveToRelative(0.23f, -0.34f, 0.12f, -0.85f, 0.12f, -1.25f)
            arcToRelative(2.43f, 2.43f, 0.0f, false, true, -1.9f, -0.58f)
            curveToRelative(0.58f, -1.09f, -1.31f, -2.4f, -1.83f, -3.67f)
            curveToRelative(1.37f, -0.79f, -0.85f, -1.83f, 0.29f, -2.63f)
            curveToRelative(-1.52f, -0.62f, 0.29f, -3.27f, -1.78f, -2.46f)
            curveToRelative(-0.63f, 0.28f, -0.74f, 2.17f, -1.78f, 1.2f)
            curveToRelative(-0.34f, -0.92f, 0.52f, -1.72f, 0.81f, -2.75f)
            curveToRelative(0.68f, -0.86f, -0.11f, -1.49f, -0.4f, -2.18f)
            curveToRelative(-1.55f, 0.57f, -0.86f, -2.0f, -2.18f, -2.06f)
            arcToRelative(9.35f, 9.35f, 0.0f, false, false, -4.41f, 2.06f)
            arcToRelative(0.73f, 0.73f, 0.0f, false, true, -0.86f, -0.4f)
            curveToRelative(0.28f, -1.0f, 1.66f, -1.6f, 1.15f, -2.92f)
            curveToRelative(-0.35f, -0.34f, -1.15f, -0.4f, -1.0f, -1.09f)
            curveToRelative(0.92f, -1.26f, -1.2f, -1.37f, -0.4f, -2.57f)
            curveToRelative(-0.8f, -0.75f, -1.39f, -1.76f, -2.42f, -1.87f)
            curveToRelative(-0.58f, 0.0f, -1.23f, 0.95f, -1.0f, 2.09f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(11.88f, 2.47f)
            curveToRelative(1.26f, 2.41f, -2.24f, 0.63f, -1.21f, 2.93f)
            arcToRelative(4.59f, 4.59f, 0.0f, false, false, -1.18f, 3.0f)
            curveToRelative(0.0f, 1.55f, 0.89f, 3.68f, 0.42f, 4.5f)
            curveToRelative(0.86f, 0.92f, 0.52f, -1.31f, 1.55f, -1.25f)
            reflectiveCurveToRelative(0.77f, 1.2f, 1.91f, 1.37f)
            curveToRelative(1.3f, -1.08f, 0.42f, -2.46f, 0.94f, -3.33f)
            arcTo(2.31f, 2.31f, 0.0f, false, true, 17.1f, 8.54f)
            curveToRelative(-1.38f, -2.3f, -3.28f, -4.8f, -3.45f, -4.52f)
            curveToRelative(-1.0f, -0.11f, -0.74f, -1.72f, -1.77f, -1.55f)
        }
    }
        .build()
}
