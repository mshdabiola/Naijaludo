package com.mshdabiola.market

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mshdabiola.designsystem.icon.Drawable
import com.mshdabiola.designsystem.icon.drawable.BgL
import com.mshdabiola.designsystem.icon.drawable.BgP
import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.ui.BoardUi
import com.mshdabiola.ui.DiceUi
import com.mshdabiola.ui.LocalBoard
import com.mshdabiola.ui.UBoard
import com.mshdabiola.ui.UDice
import com.mshdabiola.ui.UItem
import com.mshdabiola.ui.getAllItem
import com.mshdabiola.ui.issPortrait
import com.mshdabiola.ui.state.BoardUiState
import com.mshdabiola.ui.state.DiceUiState
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.launch

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
internal fun MarketRoute(
    modifier: Modifier = Modifier,
    sharedTransitionScope: SharedTransitionScope,
    animatedContentScope: AnimatedContentScope,
    onShowSnackbar: suspend (String, String?) -> Boolean,
    gameScreenViewModel: GeneralViewModel,
    onBack: () -> Unit,
) {
    val coroutineScope = rememberCoroutineScope()
    var msg by remember {
        mutableStateOf<Notify?>(null)
    }
    val allItems = getAllItem()
    val freeITemId = arrayOf("cat_1", "man_2", "default_dice")
    val freeItems = remember(freeITemId) {
        freeITemId
            .mapNotNull {
                val item = allItems[it]
                if (item == null) {
                    null
                } else {
                    BuyItem(
                        id = it,
                        price = "",
                        item = item,
                        isPurchase = true,
                    )
                }
            }.toImmutableList()
    }

    val currentBoard = gameScreenViewModel.currentBoard
        .collectAsStateWithLifecycle(initialValue = "man_2")
    val currentDice = gameScreenViewModel.currentDice
        .collectAsStateWithLifecycle(initialValue = "default_dice")

    var allPurchaseItemsId by remember {
        mutableStateOf(listOf<String>().toImmutableList())
    }

    val allPurchaseItems = remember(allPurchaseItemsId) {
        allPurchaseItemsId
            .mapNotNull {
                val item = allItems[it]
                if (item == null) {
                    null
                } else {
                    BuyItem(
                        id = it,
                        price = "",
                        item = item,
                        isPurchase = true,
                    )
                }
            }.toImmutableList()
    }

    val purchaseFlow: (String) -> Unit = { id ->
//
    }

    LaunchedEffect(key1 = Unit, block = {
        allPurchaseItemsId = gameScreenViewModel.getPurchaseItems().toImmutableList()
    })

    MarketScreen(

        back = onBack,
        currentBoard = currentBoard.value,
        currentDice = currentDice.value,
        //  unPurchaseItems = allUnPurchaseItems,
        purchaseItems = allPurchaseItems,
        freeItems = freeItems,
        message = msg,
        onBuy = purchaseFlow,
        onSelect = { id, isBoard ->
            coroutineScope.launch {
                if (isBoard) {
                    gameScreenViewModel.setCurrentBoard(id)
                } else {
                    gameScreenViewModel.setCurrentDice(id)
                }
            }
        },
    )
}

@Composable
internal fun MarketScreen(
    back: () -> Unit = {},
    onBuy: (String) -> Unit = {},
    onSelect: (String, Boolean) -> Unit = { _, _ -> },
    currentDice: String = "",
    currentBoard: String = "",
    message: Notify? = null,
    unPurchaseItems: ImmutableList<BuyItem> = emptyList<BuyItem>().toImmutableList(),
    purchaseItems: ImmutableList<BuyItem> = emptyList<BuyItem>().toImmutableList(),
    freeItems: ImmutableList<BuyItem> = emptyList<BuyItem>().toImmutableList(),
) {
    val pagerState = rememberPagerState {
        2
    }
    val coroutineScope = rememberCoroutineScope()

    val vector = if (issPortrait()) {
        Drawable.BgP
    } else {
        Drawable.BgL
    }
    val snackbarHostState = remember {
        SnackbarHostState()
    }
    NotifySnacker(snackHostState = snackbarHostState, notifys = message)

    val painter = rememberVectorPainter(image = vector)
    Scaffold(
        containerColor = Color.Transparent,
        modifier = Modifier
            .drawBehind {
                with(painter) {
                    draw(size, 0.5f)
                }
            },
        snackbarHost = { SnackbarHost(snackbarHostState) },
    ) { paddingValues ->

        Box(Modifier.padding(paddingValues)) {
            HorizontalPager(
                modifier = Modifier.fillMaxSize(),
                state = pagerState,
            ) { index ->
                when (index) {
                    0 -> {
                        LazyVerticalGrid(
                            modifier = Modifier.fillMaxSize(),
                            columns = GridCells.Fixed(2),
                            contentPadding = PaddingValues(
                                bottom = 8.dp,
                                start = 16.dp,
                                end = 16.dp,
                            ),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                        ) {
                            item(span = { GridItemSpan(2) }) {
                                Spacer(modifier = Modifier.height(64.dp))
                            }

                            items(unPurchaseItems, key = { it.id }) {
                                BuyBoardUi(
                                    modifier = Modifier.fillMaxWidth(),
                                    buyItem = it,
                                    onBuy = onBuy,
                                )
                            }
                        }
                    }

                    else -> {
                        LazyVerticalStaggeredGrid(
                            modifier = Modifier.fillMaxSize(),
                            columns = StaggeredGridCells.Fixed(2),
                            contentPadding = PaddingValues(
                                bottom = 8.dp,
                                start = 16.dp,
                                end = 16.dp,
                            ),
                            verticalItemSpacing = 8.dp,
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                        ) {
                            item(span = StaggeredGridItemSpan.FullLine) {
                                Spacer(modifier = Modifier.height(64.dp))
                            }
                            items(freeItems, key = { it.id }) { item ->
                                BuyBoardUi(
                                    modifier = Modifier.fillMaxWidth(),
                                    buyItem = item,
                                    onBuy = onBuy,
                                    onSelect = onSelect,
                                    isSelect = currentBoard == item.id || currentDice == item.id,
                                )
                            }

                            items(purchaseItems, key = { it.id }) { item ->
                                BuyBoardUi(
                                    modifier = Modifier.fillMaxWidth(),
                                    buyItem = item,
                                    onBuy = onBuy,
                                    onSelect = onSelect,
                                    isSelect = currentBoard == item.id || currentDice == item.id,
                                )
                            }
                        }
                    }
                }
            }

            Row(
                modifier = Modifier
                    .background(
                        Brush.verticalGradient(
                            0f to Color.Transparent,
                            0.7f to MaterialTheme.colorScheme.primaryContainer,
                        ),
                    )
                    .align(Alignment.TopCenter),
            ) {
                IconButton(onClick = back) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back")
                }
                TabRow(
                    modifier = Modifier.weight(1f),
                    selectedTabIndex = pagerState.currentPage,
                    containerColor = Color.Transparent,
                ) {
                    Tab(
                        selected = pagerState.currentPage == 0,
                        onClick = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(0)
                            }
                        },
                        text = {
                            Text(text = "Market")
                        },
                    )
                    Tab(
                        selected = pagerState.currentPage == 1,
                        onClick = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(1)
                            }
                        },
                        text = {
                            Text(text = "My Items")
                        },
                    )
                }
            }
        }
    }
}

// @Preview
// @Composable
// fun MarketScreenPreview() {
//    val b = getAllItem()
//        .map {
//            BuyItem(it.key, "N 1,610.00", it.value)
//        }
//    MarketScreen(
//        unPurchaseItems = b.toImmutableList()
//    )
// }

@Composable
fun BuyBoardUi(
    modifier: Modifier = Modifier,
    buyItem: BuyItem,
    onBuy: (String) -> Unit = {},
    onSelect: (String, Boolean) -> Unit = { _, _ -> },
    isSelect: Boolean = false,

) {
    OutlinedCard(
        modifier = modifier,
        border = if (isSelect) {
            BorderStroke(4.dp, Color.Blue)
        } else {
            BorderStroke(
                0.dp,
                Color.Transparent,
            )
        },
    ) {
        Column {
            when (buyItem.item) {
                is UBoard -> {
                    CompositionLocalProvider(LocalBoard provides buyItem.item) {
                        BoardUi(
                            modifier = Modifier.fillMaxWidth(),
                            boardUiStateProvider = { BoardUiState(colors = GameColor.entries.toImmutableList()) },
                            content = {},
                        )
                    }
                }

                is UDice -> {
                    BoxWithConstraints(
                        modifier = Modifier
                            .background(Color(buyItem.item.color).copy(alpha = 0.3f))
                            .fillMaxWidth()
                            .aspectRatio(1f),
                        contentAlignment = Alignment.Center,
                    ) {
                        DiceUi(
                            modifier = Modifier
                                .size(this.maxWidth.times(0.5f))
                                .offset(this.maxWidth.times(0.2f)),
                            diceUiState = DiceUiState(animate = true, color = buyItem.item.color),
                            rotate = { 90f },

                        )
                        DiceUi(
                            modifier = Modifier
                                .size(this.maxWidth.times(0.5f))
                                .offset(this.maxWidth.times(-0.2f)),
                            diceUiState = DiceUiState(
                                animate = true,
                                color = buyItem.item.color,
                            ),
                            rotate = { -90f },

                        )
                    }
                }
            }

            if (!isSelect) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    horizontalArrangement = if (buyItem.isPurchase) Arrangement.Center else Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    if (buyItem.isPurchase) {
                        Button(onClick = { onSelect(buyItem.id, buyItem.item is UBoard) }) {
                            Text(text = "Select")
                        }
                    } else {
                        Text(
                            text = buyItem.price,
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.primary,
                        )
                        Button(onClick = { onBuy(buyItem.id) }) {
                            Text(text = "Buy")
                        }
                    }
                }
            }
        }
    }
}
//
// @Preview
// @Composable
// fun BuyBoardUiPreview() {
//    BuyBoardUi(
//        buyItem = BuyItem(
//            "default",
//            "N 1,610.00",
//            DragonBoard2,
//            false,
//        )
//    )
// }

data class BuyItem(
    val id: String,
    val price: String,
    val item: UItem,
    val isPurchase: Boolean = false,
)
