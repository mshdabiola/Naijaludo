package com.mshdabiola.gamescreen.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.MarqueeAnimationMode
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.icon.LudoIcon
import com.mshdabiola.designsystem.theme.toPawnColor
import com.mshdabiola.gamescreen.state.PlayerUiState
import com.mshdabiola.naijaludo.model.GameColor
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PlayerUi(
    player: PlayerUiState,
    isEven: Boolean = true,
    topStart: Int = 0,
    topEnd: Int = 0,
    bottomStart: Int = 0,
    bottomEnd: Int = 0,
) {
    val colorBrush = if (player.colors.size == 1) {
        (1..2).map { player.colors[0].toPawnColor() }
    } else {
        player.colors.map { it.toPawnColor() }
    }

    val image = @Composable {
        Box(
            modifier = Modifier
                .border(
                    1.dp,
                    Brush.verticalGradient(0f to colorBrush[0], 1f to colorBrush[1]),
                    CircleShape,
                )
                .padding(2.dp),
        ) {
            Image(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = LudoIcon.robotIcon[player.iconIndex]),
                contentDescription = "player Icon",
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
                .padding(4.dp),
        ) {
            Text(modifier = Modifier
                .widthIn(max=24.dp)
                .basicMarquee(iterations = 1, animationMode = MarqueeAnimationMode.WhileFocused)
                ,
                text = "${player.win}", color = color,
                fontWeight = FontWeight.Bold,
                maxLines = 1,

            )
        }
    }

    Surface(
        color = color,
        shape = RoundedCornerShape(
            topEndPercent = topEnd,
            bottomEndPercent = bottomEnd,
            topStartPercent = topStart,
            bottomStartPercent = bottomStart,
        ),
    ) {
        Row(
            Modifier
                .width(150.dp)
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (isEven) {
                image()
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    modifier = Modifier.weight(1f),
                    text = player.name,
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    overflow = TextOverflow.Clip,
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
                    overflow = TextOverflow.Clip,
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
fun PlayersUi(modifier: Modifier = Modifier, playerProvider: () -> ImmutableList<PlayerUiState>) {
    // Todo("fix index  error")
    val player = playerProvider()
    AnimatedVisibility(modifier = modifier, visible = player.isNotEmpty()) {
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
                        PlayerUi(
                            player = player[2],
                            isEven = true,
                            bottomStart = 50,
                            bottomEnd = 50,
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
fun PlayersUiVertical(
    modifier: Modifier = Modifier,
    playerProvider: () -> ImmutableList<PlayerUiState>,
    isFold: Boolean = false,
) {
    val player = playerProvider()
    AnimatedVisibility(modifier = modifier, visible = player.isNotEmpty()) {
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
                    if (isFold) {
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
                    } else {
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
}

@Preview
@Composable
fun PlayersPreview() {
    PlayersUi(
        playerProvider = {
            listOf(

                PlayerUiState(colors = listOf(GameColor.GREEN), name = "abiola moshood"),
                PlayerUiState(
                    colors = listOf(GameColor.BLUE, GameColor.YELLOW),
                    name = "abiola Moshood",
                ),
            ).toImmutableList()
        },
    )
}

@Preview
@Composable
fun PlayersVerticalPreview() {
    PlayersUiVertical(
        playerProvider = {
            listOf(
                PlayerUiState(
                    isCurrent = true,
                    name = "abiolalawal moshood",
                    colors = listOf(GameColor.GREEN, GameColor.RED),
                ),
                PlayerUiState(win = 100000000, colors = listOf(GameColor.GREEN), name = "abiola moshood"),
                PlayerUiState(colors = listOf(GameColor.GREEN), name = "abiola moshood"),
                PlayerUiState(colors = listOf(GameColor.GREEN), name = "abiola moshood"),

            ).toImmutableList()
        },
        isFold = true,
    )
}
