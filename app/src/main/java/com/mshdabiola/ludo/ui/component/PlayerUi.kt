package com.mshdabiola.ludo.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mshdabiola.ludo.ui.gamescreen.state.PlayerUiState
import com.mshdabiola.naijaludo.state.GameColor
import com.mshdabiola.naijaludo.state.player.HumanPlayer
import com.mshdabiola.naijaludo.state.player.Player


@Composable
fun PlayerUi(
    player: PlayerUiState,
    isEven: Boolean = true,
    topStart: Int = 0,
    topEnd: Int = 0,
    bottomStart: Int = 0,
    bottomEnd: Int = 0
) {

    val colorBrush = remember(player.colors) {
        if (player.colors.size==1) (1..2).map { player.colors[0].toColor().copy(alpha = 0.5f)}  else player.colors.map { it.toColor().copy(alpha = 0.5f) }
    }
    val image = @Composable {
       Box(modifier = Modifier
           .border(1.dp, Brush.verticalGradient(0f to colorBrush[0],1f to colorBrush[1]), CircleShape)
           .padding(2.dp)
       ) {
            Icon(
                imageVector = Icons.Default.Person, contentDescription = ""
            )
        }


    }

    val currentColor =MaterialTheme.colorScheme.secondary
    val notCurrentColor =MaterialTheme.colorScheme.secondaryContainer
    val color = remember(player.isCurrent) {
        if (player.isCurrent) currentColor  else notCurrentColor
    }

    val score = @Composable {
        val contentColor = LocalContentColor.current
       Box(
           Modifier
               .background(contentColor)
               .padding(4.dp)) {
            Text(text = "${player.win}", color = color, fontWeight = FontWeight.Bold)
        }
    }



    Surface(
        color = color,
        shape = RoundedCornerShape(
            topEndPercent = topEnd,
            bottomEndPercent = bottomEnd,
            topStartPercent = topStart,
            bottomStartPercent = bottomStart
        )
    ) {
        Row(
            Modifier
                .width(150.dp)
                .padding(8.dp), verticalAlignment = Alignment.CenterVertically) {


            if (isEven) {
                image()
                Spacer(modifier = Modifier.width(4.dp))
                Text(modifier = Modifier.weight(1f),text = player.name, textAlign = TextAlign.Center, maxLines = 1, overflow = TextOverflow.Clip)
                Spacer(modifier = Modifier.width(4.dp))
                score()

            } else {
                score()
                Spacer(modifier = Modifier.width(4.dp))
                Text(modifier = Modifier.weight(1f),text = player.name, textAlign = TextAlign.Center, maxLines = 1, overflow = TextOverflow.Clip)
                Spacer(modifier = Modifier.width(4.dp))
                image()

            }
        }


    }


}

@Preview
@Composable
fun PlayerUiPreview() {
    PlayerUi(player = PlayerUiState())
}

@Composable
fun PlayersUi(player: List<PlayerUiState>) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        when (player.size) {
            2 -> {
                Row {
                    PlayerUi(player = player[0], isEven = true, topStart = 50, bottomStart = 50)
                    Spacer(modifier = Modifier.width(4.dp))
                    PlayerUi(player = player[1], isEven = false, topEnd = 50, bottomEnd = 50)
                }
            }
            3 -> {
                Row() {
                    PlayerUi(player = player[0], isEven = true, topStart = 50)
                    Spacer(modifier = Modifier.width(4.dp))
                    PlayerUi(player = player[1], isEven = false, topEnd = 50)
                }
                Spacer(modifier = Modifier.height(4.dp))
                Row() {
                    PlayerUi(player = player[2], isEven = true, bottomStart = 50, bottomEnd = 50)
                }
            }
            else -> {
                Row {
                    PlayerUi(player = player[0], isEven = true, topStart = 50)
                    Spacer(modifier = Modifier.width(4.dp))
                    PlayerUi(player = player[1], isEven = false, topEnd = 50)
                }
                Spacer(modifier = Modifier.height(4.dp))
                Row {
                    PlayerUi(player = player[3], isEven = true, bottomStart = 50)
                    Spacer(modifier = Modifier.width(4.dp))
                    PlayerUi(player = player[2], isEven = false, bottomEnd = 50)
                }
            }
        }
    }

}


@Preview
@Composable
fun PlayersPreview() {
    PlayersUi(
        player = listOf(
            PlayerUiState(isCurrent = true, name = "abiolalawal moshood",colors = listOf(GameColor.GREEN,GameColor.RED)),
            PlayerUiState(colors = listOf(GameColor.GREEN), name = "abiola moshood"),
            PlayerUiState(colors = listOf(GameColor.BLUE,GameColor.YELLOW), name = "abiola Moshood")
        )
    )
}