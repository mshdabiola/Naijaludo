package com.mshdabiola.gamescreen.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
import com.mshdabiola.designsystem.theme.toHomeColor
import com.mshdabiola.gamescreen.state.PlayerUiState
import com.mshdabiola.ludo.model.GameColor
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

@Composable
fun PlayerUi(
    player: PlayerUiState,
    isEven: Boolean = true,
    topStart: Int = 0,
    topEnd: Int = 0,
    bottomStart: Int = 0,
    bottomEnd: Int = 0
) {

    val colorBrush = if (player.colors.size == 1)
        (1..2).map { player.colors[0].toHomeColor().copy(alpha = 0.9f) }
    else
        player.colors.map { it.toHomeColor().copy(alpha = 0.9f) }

    val image = @Composable {
        Box(
            modifier = Modifier
                .border(
                    1.dp,
                    Brush.verticalGradient(0f to colorBrush[0], 1f to colorBrush[1]),
                    CircleShape
                )
                .padding(2.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Person, contentDescription = ""
            )
        }
    }

    val currentColor = MaterialTheme.colorScheme.secondary
    val notCurrentColor = MaterialTheme.colorScheme.secondaryContainer
    val color = remember(player.isCurrent) {
        if (player.isCurrent) currentColor else notCurrentColor
    }

    val score = @Composable {
        val contentColor = LocalContentColor.current
        Box(
            Modifier
                .background(contentColor)
                .padding(4.dp)
        ) {
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
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            if (isEven) {
                image()
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    modifier = Modifier.weight(1f),
                    text = player.name,
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    overflow = TextOverflow.Clip
                )
                Spacer(modifier = Modifier.width(4.dp))
                score()
            } else {
                score()
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    modifier = Modifier.weight(1f),
                    text = player.name,
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    overflow = TextOverflow.Clip
                )
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
fun PlayersUi(modifier: Modifier = Modifier, player: ImmutableList<PlayerUiState>) {
    AnimatedVisibility(modifier=modifier,visible = player.isNotEmpty()) {
        Column( horizontalAlignment = Alignment.CenterHorizontally) {
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
                        PlayerUi(
                            player = player[2],
                            isEven = true,
                            bottomStart = 50,
                            bottomEnd = 50
                        )
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
}

@Composable
fun PlayersUiVertical(modifier: Modifier=Modifier,player: ImmutableList<PlayerUiState>) {
    AnimatedVisibility(modifier=modifier,visible = player.isNotEmpty()) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            when (player.size) {
                2 -> {

                    PlayerUi(player = player[0], isEven = true, topStart = 50)
                    Spacer(modifier = Modifier.height(4.dp))
                    PlayerUi(player = player[1], isEven = true, bottomStart = 50)
                }

                3 -> {

                    PlayerUi(player = player[0], isEven = true, topStart = 50)
                    Spacer(modifier = Modifier.height(4.dp))
                    PlayerUi(player = player[1], isEven = true)

                    Spacer(modifier = Modifier.height(4.dp))

                    PlayerUi(player = player[2], isEven = true, bottomStart = 50)
                }

                else -> {

                    PlayerUi(player = player[0], isEven = true, topStart = 50)
                    Spacer(modifier = Modifier.height(4.dp))
                    PlayerUi(player = player[1], isEven = true)

                    Spacer(modifier = Modifier.height(4.dp))

                    PlayerUi(player = player[2], isEven = true)
                    Spacer(modifier = Modifier.height(4.dp))
                    PlayerUi(player = player[3], isEven = true, bottomStart = 50)
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

            PlayerUiState(colors = listOf(GameColor.GREEN), name = "abiola moshood"),
            PlayerUiState(
                colors = listOf(GameColor.BLUE, GameColor.YELLOW),
                name = "abiola Moshood"
            )
        ).toImmutableList()
    )
}

@Preview
@Composable
fun PlayersVerticalPreview() {
    PlayersUiVertical(
        player = listOf(
            PlayerUiState(
                isCurrent = true,
                name = "abiolalawal moshood",
                colors = listOf(GameColor.GREEN, GameColor.RED)
            ),
            PlayerUiState(colors = listOf(GameColor.GREEN), name = "abiola moshood"),
            PlayerUiState(colors = listOf(GameColor.GREEN), name = "abiola moshood"),
            PlayerUiState(colors = listOf(GameColor.GREEN), name = "abiola moshood")

        ).toImmutableList()
    )
}
