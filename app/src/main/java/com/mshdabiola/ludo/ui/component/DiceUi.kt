package com.mshdabiola.ludo.ui.component

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.mshdabiola.ludo.R
import com.mshdabiola.ludo.getInitOfDice
import com.mshdabiola.ludo.randDiceOffSet
import com.mshdabiola.naijaludo.LudoGame
import com.mshdabiola.naijaludo.state.Dice
import com.mshdabiola.naijaludo.state.LudoGameState
import kotlinx.coroutines.launch


@Composable
fun DiceUi(
    modifier: Modifier = Modifier,
    dice: Dice,
    isEnableForPlayer: Boolean = true,
    rotate: Float = 0f,
    offset: Offset = Offset.Zero,
    onDiceClick: () -> Unit = {}
) {

    val unitDp = LocalUnitDP.current
    val diceRes = intArrayOf(
        R.drawable.dice,
        R.drawable.dice_1,
        R.drawable.dice_2,
        R.drawable.dice_3,
        R.drawable.dice_4,
        R.drawable.dice_5,
        R.drawable.dice_6,
        )
    val res=if(dice.animate)R.drawable.dice_roll else diceRes[dice.number]
    Image(
        modifier = modifier

            .size(unitDp.times(1.5f))

            .offset(unitDp * offset.x, unitDp * offset.y)
            .rotate(rotate)

            .clickable(enabled = dice.isEnable && isEnableForPlayer) {
                onDiceClick()
            },
        painter = painterResource(id =res ),
        contentDescription = ""



    )
}

@Preview
@Composable
fun DiceUiPreview() {



    val ludoGameState=LudoGame.getDefaultGameState()
    val board =ludoGameState.board


    BoardUi(board=board) {
        DicesUi(dices = ludoGameState.listOfDice)
    }
}

@Composable
fun DicesUi(dices: List<Dice>,
            isHuman: Boolean = true,
            onClick: () -> Unit = {}) {
    //val oneDp = LocalUnitDP.current
    Box(modifier = Modifier.fillMaxSize()){
        dices.forEach {
            if (!it.isTotal) {

                AnimateDiceUi(
                    dice = it,
                    isHuman = isHuman,
                    onClick = onClick,
                    numberOfDice = dices.size

                )
            }

        }
    }
}


@Composable
fun AnimateDiceUi(
    modifier: Modifier = Modifier,
    dice: Dice,
    isHuman: Boolean = true,
    numberOfDice: Int,
    onClick: () -> Unit = {}
) {


    val iniOff = remember {
        getInitOfDice(dice.id, numberOfDice)
    }

    val off = remember {
        Animatable(iniOff, Offset.VectorConverter)
    }
    val rot = remember {
        Animatable(0f)
    }


    LaunchedEffect(key1 = dice.animate) {


        if (dice.animate) {
            launch {
                off.animateTo(randDiceOffSet(), animationSpec = tween(600, easing = LinearEasing))
            }

            launch {
                rot.animateTo(360f, animationSpec = repeatable(12, keyframes {
                    durationMillis = 50
                    0f at 0
                    180f at 25
                    360f at 50
                }))
            }
        } else {

            launch {
                rot.snapTo(0f)
                off.animateTo(
                    iniOff,
                    animationSpec = spring(
                        Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessMedium
                    )
                )

            }

        }


    }




    DiceUi(
        modifier = modifier.zIndex(40f),
        dice = dice,
        isEnableForPlayer = isHuman,
        rotate = rot.value,
        offset = off.value,
        onDiceClick = onClick
    )

}