package com.mshdabiola.ludo.ui.component

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.zIndex
import com.mshdabiola.ludo.R
import com.mshdabiola.ludo.getInitOfDice
import com.mshdabiola.ludo.randDiceOffSet
import com.mshdabiola.ludo.ui.gamescreen.state.DiceUiState
import com.mshdabiola.ludo.ui.gamescreen.state.toBoardUiState
import com.mshdabiola.ludo.ui.gamescreen.state.toDiceUiState
import com.mshdabiola.naijaludo.LudoGame
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.launch


@Composable
fun DiceUi(
    modifier: Modifier = Modifier,
    diceUiState: DiceUiState,
    isEnableForPlayer: Boolean = true,
    rotate:()-> Float = { 0f },
    offset: ()->Offset = { Offset.Zero },
    onDiceClick: () -> Unit = {}
) {

    val unitDp = LocalUnitDP.current
    val diceRes = remember{
        intArrayOf(
            R.drawable.dice,
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6,
        )
    }
    val res= remember(diceUiState.number) { if (diceUiState.animate) R.drawable.dice_roll else diceRes[diceUiState.number] }
    Image(
        modifier = modifier

            .size(unitDp.times(1.5f))
            .offset {
                IntOffset((unitDp * offset().x).roundToPx(), (unitDp * offset().y).roundToPx())
            }
            .graphicsLayer {
                rotationZ = rotate()
            }

            .clickable(enabled = diceUiState.isEnable && isEnableForPlayer) {
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
    val board =ludoGameState.board.toBoardUiState()


    BoardUi(boardUiState=board) {
        DicesUi(diceUiStateList = ludoGameState.listOfDice.map { it.toDiceUiState() }.toImmutableList())
    }
}

@Composable
fun DicesUi(diceUiStateList: ImmutableList<DiceUiState>,
            isHuman: Boolean = true,
            onClick: () -> Unit = {}) {
    //val oneDp = LocalUnitDP.current
    Box(modifier = Modifier.fillMaxSize()){
        diceUiStateList.forEach {
           // if (!it.isTotal) {

                AnimateDiceUi(
                    diceUiState = it,
                    isHuman = isHuman,
                    onClick = onClick,
                    numberOfDice = diceUiStateList.size

                )
          //  }

        }
    }
}


@Composable
fun AnimateDiceUi(
    modifier: Modifier = Modifier,
    diceUiState: DiceUiState,
    isHuman: Boolean = true,
    numberOfDice: Int,
    onClick: () -> Unit = {}
) {


    val iniOff = remember {
        getInitOfDice(diceUiState.id, numberOfDice)
    }

    val off = remember {
        Animatable(iniOff, Offset.VectorConverter)
    }
    val rot = remember {
        Animatable(0f)
    }


    LaunchedEffect(key1 = diceUiState.animate) {


        if (diceUiState.animate) {
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

    LaunchedEffect(key1 = diceUiState.isEnable, key2 = isHuman, block = {
        if(diceUiState.isEnable&&isHuman){
            launch {
                rot.animateTo(360f,
                    animationSpec = infiniteRepeatable(repeatMode = RepeatMode.Reverse, animation =  keyframes {
                        durationMillis=2000

//                        180f atFraction 0.5f
//                        359f atFraction 0.999f
//                        0f atFraction 1f

                    })
                )
            }
        }

    })




    DiceUi(
        modifier = modifier.zIndex(40f),
        diceUiState = diceUiState,
        isEnableForPlayer = isHuman,
        rotate = { rot.value },
        offset = { off.value },
        onDiceClick = onClick
    )

}