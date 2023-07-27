package com.mshdabiola.ludo.screen.game.component

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


fun getDiceOne(color: Color): ImageVector
{
  val white = Color.White
  val colW = Color(
    (color.red * 0.5f + white.red * 0.5f),
    (color.green * 0.5f + white.red * 0.5f),
    (color.blue * 0.5f + white.blue * 0.5f)
  )
  val colors= generateColor(color)
  if (_dice1 != null) {
    return _dice1!!
  }
  _dice1 = ImageVector.Builder(
    name = "Dice1", defaultWidth = 56.69.dp, defaultHeight = 56.75.dp,
    viewportWidth = 56.69f, viewportHeight = 56.75f
  ).apply {
    path(fill = SolidColor(colW), stroke = SolidColor(Color(0xFF1d1d1b)),
      strokeLineWidth = 0.5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter,
      strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(6.59f, 0.25f)
      lineTo(50.1f, 0.25f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 56.44f, 6.59f)
      lineTo(56.44f, 50.16f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 50.1f, 56.5f)
      lineTo(6.59f, 56.5f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 0.25f, 50.16f)
      lineTo(0.25f, 6.59f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 6.59f, 0.25f)
      close()
    }
    path(fill = Brush.linearGradient(
      *colors,
      start =
      Offset(32.35f, 32.35f),
      end = Offset(24.35f, 24.35f)
    ), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(28.35f, 28.38f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
  }
    .build()
  return _dice1!!
}

private var _dice1: ImageVector? = null


fun getDiceTwo(color: Color): ImageVector
{
  val white = Color.White
  val colW = Color(
    (color.red * 0.5f + white.red * 0.5f),
    (color.green * 0.5f + white.red * 0.5f),
    (color.blue * 0.5f + white.blue * 0.5f)
  )
  val colors= generateColor(color)



  if (_dice2 != null) {
    return _dice2!!
  }
  _dice2 = ImageVector.Builder(
    name = "Dice2", defaultWidth = 56.69.dp, defaultHeight = 56.75.dp,
    viewportWidth = 56.69f, viewportHeight = 56.75f
  ).apply {
    path(
      fill = SolidColor(colW), stroke = SolidColor(Color(0xFF1d1d1b)),
      strokeLineWidth = 0.5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter,
      strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(6.59f, 0.25f)
      lineTo(50.1f, 0.25f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 56.44f, 6.59f)
      lineTo(56.44f, 50.16f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 50.1f, 56.5f)
      lineTo(6.59f, 56.5f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 0.25f, 50.16f)
      lineTo(0.25f, 6.59f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 6.59f, 0.25f)
      close()
    }
    path(
      fill = Brush.linearGradient(
        *colors,
        start =
        Offset(42.02f, 17.63f),
        end = Offset(34.02f, 9.63f)
      ), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(38.02f, 13.63f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
    path(
      fill = Brush.linearGradient(
        *colors,
        start = Offset(22.67f, 47.12f),
        end = Offset(14.67f, 39.12f)),
      stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(18.67f, 43.12f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
  }
    .build()
  return _dice2!!
}

private var _dice2: ImageVector? = null


fun getDiceThree(color: Color): ImageVector
{
  val white = Color.White
  val colW = Color(
    (color.red * 0.5f + white.red * 0.5f),
    (color.green * 0.5f + white.red * 0.5f),
    (color.blue * 0.5f + white.blue * 0.5f)
  )
  val colors= generateColor(color)

  if (_dice3 != null) {
    return _dice3!!
  }
  _dice3 = ImageVector.Builder(
    name = "Dice3", defaultWidth = 56.69.dp, defaultHeight = 56.75.dp,
    viewportWidth = 56.69f, viewportHeight = 56.75f
  ).apply {
    path(fill = SolidColor(colW), stroke = SolidColor(Color(0xFF1d1d1b)),
      strokeLineWidth = 0.5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter,
      strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(6.59f, 0.25f)
      lineTo(50.1f, 0.25f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 56.44f, 6.59f)
      lineTo(56.44f, 50.16f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 50.1f, 56.5f)
      lineTo(6.59f, 56.5f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 0.25f, 50.16f)
      lineTo(0.25f, 6.59f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 6.59f, 0.25f)
      close()
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(42.02f, 17.63f),
      end = Offset(34.02f, 9.63f)
    )
      , stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(38.02f, 13.63f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(32.35f, 32.38f),
      end = Offset(24.35f, 24.38f)),
      stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(28.35f, 28.38f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(22.67f, 47.12f),
      end = Offset(14.67f, 39.12f)),
      stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(18.67f, 43.12f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
  }
    .build()
  return _dice3!!
}
private var _dice3: ImageVector? = null


fun getDiceFour(color: Color): ImageVector
{

  val white = Color.White
  val colW = Color(
    (color.red * 0.5f + white.red * 0.5f),
    (color.green * 0.5f + white.red * 0.5f),
    (color.blue * 0.5f + white.blue * 0.5f)
  )
  val colors= generateColor(color)

  if (_dice4 != null) {
    return _dice4!!
  }
  _dice4 = ImageVector.Builder(
    name = "Dice4", defaultWidth = 56.69.dp, defaultHeight = 56.75.dp,
    viewportWidth = 56.69f, viewportHeight = 56.75f
  ).apply {
    path(fill = SolidColor(colW), stroke = SolidColor(Color(0xFF1d1d1b)),
      strokeLineWidth = 0.5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter,
      strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(6.59f, 0.25f)
      lineTo(50.1f, 0.25f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 56.44f, 6.59f)
      lineTo(56.44f, 50.16f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 50.1f, 56.5f)
      lineTo(6.59f, 56.5f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 0.25f, 50.16f)
      lineTo(0.25f, 6.59f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 6.59f, 0.25f)
      close()
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(22.67f, 17.63f),
      end = Offset(14.67f, 9.63f)
    ), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(18.67f, 13.63f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(42.02f, 17.63f),
      end = Offset(34.02f, 9.63f)), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(38.02f, 13.63f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(22.67f, 47.12f),
      end = Offset(14.67f, 39.12f)), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(18.67f, 43.12f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(42.02f, 47.12f),
      end = Offset(34.02f, 39.12f)), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(38.02f, 43.12f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
  }
    .build()
  return _dice4!!
}

private var _dice4: ImageVector? = null

fun getDiceFive(color: Color): ImageVector
{
  val white = Color.White
  val colW = Color(
    (color.red * 0.5f + white.red * 0.5f),
    (color.green * 0.5f + white.red * 0.5f),
    (color.blue * 0.5f + white.blue * 0.5f)
  )
  val colors= generateColor(color)
  if (_dice5 != null) {
    return _dice5!!
  }
  _dice5 = ImageVector.Builder(
    name = "Dice5", defaultWidth = 56.69.dp, defaultHeight = 56.75.dp,
    viewportWidth = 56.69f, viewportHeight = 56.75f
  ).apply {
    path(fill = SolidColor(colW), stroke = SolidColor(Color(0xFF1d1d1b)),
      strokeLineWidth = 0.5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter,
      strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(6.59f, 0.25f)
      lineTo(50.1f, 0.25f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 56.44f, 6.59f)
      lineTo(56.44f, 50.16f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 50.1f, 56.5f)
      lineTo(6.59f, 56.5f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 0.25f, 50.16f)
      lineTo(0.25f, 6.59f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 6.59f, 0.25f)
      close()
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(22.67f, 17.63f),
      end = Offset(14.67f, 9.63f)
    ), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(18.67f, 13.63f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
    path(fill =  Brush.linearGradient(
      *colors,
      start = Offset(42.02f, 17.63f),
      end = Offset(34.02f, 9.63f)), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(38.02f, 13.63f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(32.35f, 32.38f),
      end = Offset(24.35f, 24.38f)), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(28.35f, 28.38f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(22.67f, 47.12f),
      end = Offset(14.67f, 39.12f)), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(18.67f, 43.12f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(42.02f, 47.12f),
      end = Offset(34.02f, 39.12f)), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(38.02f, 43.12f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
  }
    .build()
  return _dice5!!
}

private var _dice5: ImageVector? = null


fun getDiceSix(color: Color): ImageVector
{
  val white = Color.White
  val colW = Color(
    (color.red * 0.5f + white.red * 0.5f),
    (color.green * 0.5f + white.red * 0.5f),
    (color.blue * 0.5f + white.blue * 0.5f)
  )
  val colors= generateColor(color)
  if (_dice6 != null) {
    return _dice6!!
  }
  _dice6 = ImageVector.Builder(
    name = "Dice6", defaultWidth = 56.69.dp, defaultHeight = 56.75.dp,
    viewportWidth = 56.69f, viewportHeight = 56.75f
  ).apply {
    path(fill = SolidColor(colW), stroke = SolidColor(Color(0xFF1d1d1b)),
      strokeLineWidth = 0.5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter,
      strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(6.59f, 0.25f)
      lineTo(50.1f, 0.25f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 56.44f, 6.59f)
      lineTo(56.44f, 50.16f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 50.1f, 56.5f)
      lineTo(6.59f, 56.5f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 0.25f, 50.16f)
      lineTo(0.25f, 6.59f)
      arcTo(6.34f, 6.34f, 0.0f, false, true, 6.59f, 0.25f)
      close()
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(22.67f, 17.63f),
      end = Offset(14.67f, 9.63f)
    ), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(18.67f, 13.63f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(42.02f, 17.63f),
      end = Offset(34.02f, 9.63f)), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(38.02f, 13.63f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
    path(fill =Brush.linearGradient(
      *colors,
      start = Offset(22.67f, 32.38f),
      end = Offset(14.67f, 24.38f)), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(18.67f, 28.38f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(42.02f, 32.38f),
      end = Offset(34.02f, 24.38f)), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(38.02f, 28.38f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(22.67f, 47.12f),
      end = Offset(14.67f, 39.12f)), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(18.67f, 43.12f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(42.02f, 47.12f),
      end = Offset(34.02f, 39.12f)), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(38.02f, 43.12f)
      moveToRelative(-5.63f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, 11.26f, 0.0f)
      arcToRelative(5.63f, 5.63f, 0.0f, true, true, -11.26f, 0.0f)
    }
  }
    .build()
  return _dice6!!
}

private var _dice6: ImageVector? = null


fun getDiceRoll(color: Color): ImageVector
{
  val dark = Color.Black
  val white = Color.White
  val colW2 = Color(
    (color.red * 0.4f + white.red * 0.6f),
    (color.green * 0.4f + white.red * 0.6f),
    (color.blue * 0.4f + white.blue * 0.6f)
  )
  val colW = Color(
    (color.red * 0.6f + white.red * 0.4f),
    (color.green * 0.6f + white.red * 0.4f),
    (color.blue * 0.6f + white.blue * 0.4f)
  )
  val colD = Color(
    (color.red * 0.8f + white.red * 0.2f),
    (color.green * 0.8f + white.red * 0.2f),
    (color.blue * 0.8f + white.blue * 0.2f)
  )
  val colors= generateColorRoll(color)

  if (_diceRoll != null) {
    return _diceRoll!!
  }
  _diceRoll = ImageVector.Builder(
    name = "DiceRoll1", defaultWidth = 61.54.dp, defaultHeight = 61.21.dp,
    viewportWidth = 61.54f, viewportHeight = 61.21f
  ).apply {
    path(fill = SolidColor(colW), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(36.73f, 61.22f)
      lineToRelative(-26.44f, -7.92f)
      lineToRelative(-10.29f, -32.75f)
      lineToRelative(26.44f, 7.91f)
      lineToRelative(10.29f, 32.76f)
      close()
    }
    path(fill = SolidColor(colW2), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(26.44f, 28.46f)
      lineToRelative(-26.44f, -7.91f)
      lineToRelative(26.98f, -20.55f)
      lineToRelative(26.44f, 7.91f)
      lineToRelative(-26.98f, 20.55f)
      close()
    }
    path(fill = SolidColor(colD), stroke = null, strokeLineWidth = 0.0f,
      strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f,
      pathFillType = PathFillType.NonZero
    ) {
      moveTo(36.73f, 61.22f)
      lineToRelative(24.81f, -21.92f)
      lineToRelative(-8.12f, -31.39f)
      lineToRelative(-26.98f, 20.55f)
      lineToRelative(10.29f, 32.76f)
      close()
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(48.922035f, 17.076965f),
      end = Offset(48.922035f, 25.566965f)
    )
      ,
      stroke =
      null, strokeLineWidth = 0.0f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter,
      strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(48.524f, 25.5645f)
      arcToRelative(4.25f, 3.42f, 95.42f, true, false, 0.8029f, -8.462f)
      arcToRelative(4.25f, 3.42f, 95.42f, true, false, -0.8029f, 8.462f)
      close()
    }
    path(fill =
    Brush.linearGradient(
      *colors,
      start = Offset(43.992f, 29.135f),
      end = Offset(43.992f, 37.625f)
    )
      , stroke = null, strokeLineWidth = 0.0f, strokeLineCap = StrokeCap.Butt,
      strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(43.5845f, 37.6097f)
      arcToRelative(4.25f, 3.42f, 95.42f, true, false, 0.8029f, -8.462f)
      arcToRelative(4.25f, 3.42f, 95.42f, true, false, -0.8029f, 8.462f)
      close()
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(39.062f, 41.163f),
      end = Offset(39.062f, 49.663f)
    ), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = StrokeCap.Butt,
      strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(38.6549f, 49.6458f)
      arcToRelative(4.25f, 3.42f, 95.42f, true, false, 0.8029f, -8.462f)
      arcToRelative(4.25f, 3.42f, 95.42f, true, false, -0.8029f, 8.462f)
      close()
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(28.044f, 3.266f),
      end = Offset(28.044f, 8.426f)
    ), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = StrokeCap.Butt,
      strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(24.8993f, 7.1233f)
      arcToRelative(2.42f, 3.4f, 67.8f, true, false, 6.2959f, -2.5693f)
      arcToRelative(2.42f, 3.4f, 67.8f, true, false, -6.2959f, 2.5693f)
      close()
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(36.37f, 7.507f),
      end = Offset(36.37f, 12.667f)
    ), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = StrokeCap.Butt,
      strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(33.2246f, 11.3654f)
      arcToRelative(2.42f, 3.4f, 67.8f, true, false, 6.2959f, -2.5693f)
      arcToRelative(2.42f, 3.4f, 67.8f, true, false, -6.2959f, 2.5693f)
      close()
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(22.289f, 9.184f),
      end = Offset(22.289f, 14.344f)
    ), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = StrokeCap.Butt,
      strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(19.1338f, 13.0446f)
      arcToRelative(2.42f, 3.4f, 67.8f, true, false, 6.2959f, -2.5693f)
      arcToRelative(2.42f, 3.4f, 67.8f, true, false, -6.2959f, 2.5693f)
      close()
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(30.605f, 13.435f),
      end = Offset(30.605f, 18.595f)
    ), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = StrokeCap.Butt,
      strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(27.4529f, 17.2959f)
      arcToRelative(2.42f, 3.4f, 67.8f, true, false, 6.2959f, -2.5693f)
      arcToRelative(2.42f, 3.4f, 67.8f, true, false, -6.2959f, 2.5693f)
      close()
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(16.511f, 15.107f),
      end = Offset(16.511f, 20.267f)
    ), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = StrokeCap.Butt,
      strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(13.3622f, 18.9752f)
      arcToRelative(2.42f, 3.4f, 67.8f, true, false, 6.2959f, -2.5693f)
      arcToRelative(2.42f, 3.4f, 67.8f, true, false, -6.2959f, 2.5693f)
      close()
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(27.831f, 19.357f),
      end = Offset(27.831f, 24.517f)
    ), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = StrokeCap.Butt,
      strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(21.6775f, 23.2172f)
      arcToRelative(2.42f, 3.4f, 67.8f, true, false, 6.2959f, -2.5693f)
      arcToRelative(2.42f, 3.4f, 67.8f, true, false, -6.2959f, 2.5693f)
      close()
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(20.865f, 31.507f),
      end = Offset(20.865f, 37.077f)
    ), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = StrokeCap.Butt,
      strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(19.6857f, 36.391f)
      arcToRelative(2.41f, 3.73f, 119.32f, true, false, 2.3603f, -4.2026f)
      arcToRelative(2.41f, 3.73f, 119.32f, true, false, -2.3603f, 4.2026f)
      close()
    }
    path(fill = Brush.linearGradient(
      *colors,
      start = Offset(16.508f, 46.208f),
      end = Offset(16.508f, 51.788f)
    ), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = StrokeCap.Butt,
      strokeLineJoin = StrokeJoin.Miter, strokeLineMiter = 4.0f, pathFillType = PathFillType.NonZero
    ) {
      moveTo(15.3276f, 51.1009f)
      arcToRelative(2.41f, 3.73f, 119.32f, true, false, 2.3603f, -4.2026f)
      arcToRelative(2.41f, 3.73f, 119.32f, true, false, -2.3603f, 4.2026f)
      close()
    }
  }
    .build()
  return _diceRoll!!
}

private var _diceRoll: ImageVector? = null






var colors:Array<Pair<Float, Color>>? = null
fun generateColor(color:Color):Array<Pair<Float,Color>>{

  if (colors!=null)
    return colors!!

  val white = Color.White
  val colW = Color(
    (color.red * 0.5f + white.red * 0.5f),
    (color.green * 0.5f + white.red * 0.5f),
    (color.blue * 0.5f + white.blue * 0.5f)
  )
  val dark = Color.Black
  val cold3 = Color(
    (color.red * 0.1f + dark.red * 0.9f),
    (color.green * 0.1f + dark.red * 0.9f),
    (color.blue * 0.1f + dark.red * 0.9f)
  )
  val cold2 = Color(
    (color.red * 0.3f + dark.red * 0.6f),
    (color.green * 0.3f + dark.red * 0.6f),
    (color.blue * 0.3f + dark.red * 0.6f)
  )
  val cold1 = Color(
    (color.red * 0.6f + dark.red * 0.3f),
    (color.green * 0.6f + dark.red * 0.3f),
    (color.blue * 0.6f + dark.red * 0.3f)
  )
  val colw3 = Color(
    (color.red * 0.1f + white.red * 0.9f),
    (color.green * 0.1f + white.red * 0.9f),
    (color.blue * 0.1f + white.red * 0.9f)
  )
  val colw2 = Color(
    (color.red * 0.3f + white.red * 0.6f),
    (color.green * 0.3f + white.red * 0.6f),
    (color.blue * 0.3f + white.red * 0.6f)
  )
  val colw1 = Color(
    (color.red * 0.6f + white.red * 0.3f),
    (color.green * 0.6f + white.red * 0.3f),
    (color.blue * 0.6f + white.red * 0.3f)
  )
 colors=  arrayOf(
    0.36f to cold3,
    0.42f to cold2,
    0.5f to cold1,
    0.61f to colw1,
    0.73f to colw2,
    0.86f to colw3,
    1.0f to Color(0xFFFFFFFF)
  )

  return colors!!
}

var colorsRoll:Array<Pair<Float,Color>>? = null
fun generateColorRoll(color:Color):Array<Pair<Float,Color>>{

  if (colorsRoll!=null)
    return colorsRoll!!

  val white = Color.White
  val colW = Color(
    (color.red * 0.5f + white.red * 0.5f),
    (color.green * 0.5f + white.red * 0.5f),
    (color.blue * 0.5f + white.blue * 0.5f)
  )
  val dark = Color.Black
  val cold3 = Color(
    (color.red * 0.1f + dark.red * 0.9f),
    (color.green * 0.1f + dark.red * 0.9f),
    (color.blue * 0.1f + dark.red * 0.9f)
  )
  val cold2 = Color(
    (color.red * 0.3f + dark.red * 0.6f),
    (color.green * 0.3f + dark.red * 0.6f),
    (color.blue * 0.3f + dark.red * 0.6f)
  )
  val cold1 = Color(
    (color.red * 0.6f + dark.red * 0.3f),
    (color.green * 0.6f + dark.red * 0.3f),
    (color.blue * 0.6f + dark.red * 0.3f)
  )
  val colw3 = Color(
    (color.red * 0.1f + white.red * 0.9f),
    (color.green * 0.1f + white.red * 0.9f),
    (color.blue * 0.1f + white.red * 0.9f)
  )
  val colw2 = Color(
    (color.red * 0.3f + white.red * 0.6f),
    (color.green * 0.3f + white.red * 0.6f),
    (color.blue * 0.3f + white.red * 0.6f)
  )
  val colw1 = Color(
    (color.red * 0.6f + white.red * 0.3f),
    (color.green * 0.6f + white.red * 0.3f),
    (color.blue * 0.6f + white.red * 0.3f)
  )
  colorsRoll=  arrayOf(
    0.0f to Color(0xFFFFFFFF),
    0.14f to colw3,
    0.27f to colw2,
    0.39f to colw1,
    0.5f to cold1,
    0.58f to cold2,
    0.64f to cold3
  )

  return colorsRoll!!
}
