package com.mshdabiola.ludo.screen.game.firework


import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.repeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun FireworkView(firstAppear: Boolean = true) {

    val fireworkUiState = remember {
        FireworkUiState()
    }
    val animated = remember { mutableStateOf(0) }
    //val firstAppear = remember { mutableStateOf(true) }
    val repeatInterval = fireworkUiState.repetitionInterval
    val repeatCount = fireworkUiState.repetitions

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
        for (i in 0 until animated.value) {
            FireworkContainer(fireworkUiState)
        }
    }

    LaunchedEffect(firstAppear) {
        if (firstAppear) {
            for (i in 0..repeatCount) {
                launch {
                    delay((repeatInterval * i).toLong())
                    animated.value += 1
                }
            }
        }
        // firstAppear.value = true
    }
}

@Composable
fun FireworkContainer(fireworkUiState: FireworkUiState) {

    val scope = rememberCoroutineScope()
    val piecesNumber = remember { mutableStateOf(fireworkUiState.pieceCount) }
    val animateY = remember { Animatable(0.0f) }
    val animateX = remember { Animatable(0.0f) }
    val randomX = remember { (-100..100).random() }
    val randomY = remember { (150..650).random() }
    val colors = remember {
        listOf(
            "#f88f22".color,
            "#9c1d08".color,
            "#ce7117".color,
            "#f24d24".color,
            "#113bc6".color,
            "#c54a85".color,
            "#92af96".color,
            "#d23508".color,
        )
    }

    Box(
        modifier = Modifier
            .offset(
                x = animateX.value.dp,
                y = animateY.value.dp
            )
    ) {
        for (i in 0 until piecesNumber.value) {
            FireworkFrame(
                fireworkUiState,
                i,
                launchHeight = randomY.toFloat(),
                color = colors.random()
            )
        }
    }

    LaunchedEffect(Unit) {
        scope.launch {
            animateY.animateTo(
                targetValue = -randomY.toFloat(),
                animationSpec = repeatable(
                    iterations = 1,
                    animation = tween(
                        durationMillis = fireworkUiState.launchAnimDuration.toInt(),
                        easing = CubicBezierEasing(0.075f, 0.690f, 0.330f, 0.870f)
                    )
                )
            )
        }
        scope.launch {
            animateX.animateTo(
                targetValue = randomX.toFloat(),
                animationSpec = repeatable(
                    iterations = 1,
                    animation = tween(
                        durationMillis = fireworkUiState.launchAnimDuration.toInt(),
                        easing = CubicBezierEasing(0.075f, 0.690f, 0.330f, 0.870f)
                    )
                )
            )
        }
        delay(fireworkUiState.getAnimDuration().toLong())
        //Clear animated
        piecesNumber.value = 0
    }
}

@Composable
fun FireworkFrame(viewModel: FireworkUiState, i: Int, launchHeight: Float, color: Color) {

    val scope = rememberCoroutineScope()

    //  val type = remember { viewModel.pieceType.random() }


    val animateY = remember { Animatable(0.0f) }
    val animateX = remember { Animatable(0.0f) }
    val opacity = remember { Animatable(1.0f) }
    val strokeAnimate = remember { Animatable(2.0f) }

    val radius = viewModel.radius + (launchHeight / 10)

    fun getRandomExplosionTimeVariation(): Float {
        return ((0..999).random().toFloat() * 0.0005).toFloat()
    }

    fun getAnimationDuration(): Double {
        return viewModel.explosionAnimDuration + getRandomExplosionTimeVariation()
    }

    fun getRandomAngle(): Float {
        return (360 / viewModel.pieceCount * (i)).toFloat()
    }

    fun getDistance(): Float {
        return radius
    }

    fun deg2rad(number: Float): Float {
        return (number * PI / 180).toFloat()
    }

    val randomAngle = remember {
        getRandomAngle()
    }

    val path = remember {
        Path()
    }

    Box(modifier = Modifier, contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .offset(
                    x = animateX.value.dp,
                    y = animateY.value.dp
                ),
        ) {
            FireworkItem(
                color = color,
                alpha = opacity.value,
                size = viewModel.pieceSize,
                //type = type,
                viewModel = viewModel
            )
        }
        Canvas(modifier = Modifier) {
            path.lineTo((animateX.value * 2.6).toFloat(), (animateY.value * 2.6).toFloat())
            drawPath(
                color = color,
                path = path,
                style = Stroke(
                    width = strokeAnimate.value.dp.toPx(),
                    cap = StrokeCap.Round,
                    join = StrokeJoin.Round
                ),
                alpha = opacity.value
            )
        }
    }

    LaunchedEffect(Unit) {
        delay(viewModel.launchAnimDuration.toLong())
        scope.launch {
            animateX.animateTo(
                targetValue = getDistance() * cos(deg2rad(randomAngle)),
                animationSpec = repeatable(
                    iterations = 1,
                    animation = tween(
                        durationMillis = getAnimationDuration().toInt(),
                        easing =
                        LinearEasing
                    )
                )
            )
        }
        scope.launch {
            opacity.animateTo(
                targetValue = 0.0f,
                animationSpec = repeatable(
                    iterations = 1,
                    animation = tween(
                        durationMillis = getAnimationDuration().toInt(),
                        easing = CubicBezierEasing(0.8f, 0.2f, 1.0f, 1.0f)
                    )
                )
            )
        }
        scope.launch {
            animateY.animateTo(
                targetValue = -getDistance() * sin(deg2rad(randomAngle)),
                animationSpec = repeatable(
                    iterations = 1,
                    animation = tween(
                        durationMillis = getAnimationDuration().toInt(),
                        easing = if (randomAngle < 180)
                            CubicBezierEasing(0.0f, 1.0f, 1.0f, 1.0f)
                        else
                            CubicBezierEasing(
                                1f - ((650 - launchHeight) / 1000),
                                (650 - launchHeight) / 1000,
                                1.0f,
                                1.0f
                            )
                    )
                )
            )
        }
        scope.launch {
            strokeAnimate.animateTo(
                targetValue = 1.0f,
                animationSpec = repeatable(
                    iterations = 1,
                    animation = tween(
                        durationMillis = getAnimationDuration().toInt(),
                        easing = LinearEasing
                    )
                )
            )
        }
    }
}

@Composable
fun FireworkItem(
    alpha: Float,
    color: Color,
    size: Float,
    //type: FireworkTypes,
    viewModel: FireworkUiState
) {
    val scope = rememberCoroutineScope()
    val animateSize = remember { Animatable(size) }

//    when (type) {
//        is FireworkTypes.Shape ->
    Box(
        modifier = Modifier
            .size(animateSize.value.dp)
            .alpha(alpha)
            .clip(CircleShape)
            .background(color)
    )
//        is FireworkTypes.Image ->
//            Image(
//                painter = painterResource(id = type.value), "",
//                modifier = Modifier
//                    .size(animateSize.value.dp)
//                    .alpha(alpha)
//            )
//        is FireworkTypes.Text ->
//            Text(
//                text = type.value,
//                color = color,
//                modifier = Modifier
//                    .alpha(alpha),
//                fontSize = animateSize.value.sp,
//            )
//    }

    LaunchedEffect(Unit) {
        scope.launch {
            animateSize.animateTo(
                targetValue = 0.0f,
                animationSpec = repeatable(
                    iterations = 1,
                    animation = tween(
                        durationMillis = viewModel.explosionAnimDuration.toInt(),
                        delayMillis = viewModel.launchAnimDuration.toInt(),
                        easing = LinearEasing
                    )
                )
            )
        }
    }
}

@Preview
@Composable
fun ConfePrev() {
    val ui = remember {
        mutableStateOf(FireworkUiState(repetitions = 100))
    }
    //Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter){
    FireworkView()
    //}

}

val String.color
    get() = Color(android.graphics.Color.parseColor(this))