package com.mshdabiola.ludo.screen.market


import android.app.Activity
import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
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
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.android.billingclient.api.BillingClient
import com.android.billingclient.api.BillingClient.BillingResponseCode
import com.android.billingclient.api.BillingClientStateListener
import com.android.billingclient.api.BillingFlowParams
import com.android.billingclient.api.BillingResult
import com.android.billingclient.api.ProductDetails
import com.android.billingclient.api.Purchase
import com.android.billingclient.api.Purchase.PurchaseState
import com.android.billingclient.api.QueryProductDetailsParams
import com.android.billingclient.api.QueryPurchasesParams
import com.android.billingclient.api.queryProductDetails
import com.android.billingclient.api.queryPurchasesAsync
import com.mshdabiola.designsystem.icon.Drawable
import com.mshdabiola.designsystem.icon.drawable.BgL
import com.mshdabiola.designsystem.icon.drawable.BgP
import com.mshdabiola.ludo.screen.DEVICE_TYPE
import com.mshdabiola.ludo.screen.game.component.BoardUi
import com.mshdabiola.ludo.screen.game.component.DiceUi
import com.mshdabiola.ludo.screen.game.component.LocalBoard
import com.mshdabiola.ludo.screen.game.component.board.DefaultBoard
import com.mshdabiola.ludo.screen.game.component.board.UBoard
import com.mshdabiola.ludo.screen.game.component.board.UDice
import com.mshdabiola.ludo.screen.game.component.board.UItem
import com.mshdabiola.ludo.screen.game.component.board.getAllItem
import com.mshdabiola.ludo.screen.game.state.BoardUiState
import com.mshdabiola.ludo.screen.game.state.DiceUiState
import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.setting.MultiplatformSettings
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber


@Composable
internal fun MarketScreen(
    settings: MultiplatformSettings,
    deviceType: DEVICE_TYPE,
    onBack: () -> Unit
) {
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current


    val allboard = getAllItem()
    val currentBoard =
        settings.getCurrentBoard().collectAsStateWithLifecycle(initialValue = "default_board")
    val currentDice =
        settings.getCurrentDice().collectAsStateWithLifecycle(initialValue = "default_dice")

    var allPurchaseItemsId by remember {
        mutableStateOf(listOf<String>().toImmutableList())
    }

    val allPurchaseItems = remember(allPurchaseItemsId) {
        allPurchaseItemsId
            .mapNotNull {
                val item = allboard[it]
                if (item == null)
                    null
                else
                    BuyItem(
                        id = it,
                        price = "",
                        item = item,
                        isPurchase = true,
                    )
            }.toImmutableList()
    }

    var productDetails by remember {
        mutableStateOf<ImmutableList<ProductDetails>?>(null)
    }
    val allUnPurchaseItems = remember(productDetails) {
        productDetails
            ?.mapNotNull {
                val item = allboard[it.productId]
                if (item == null)
                    null
                else
                    BuyItem(
                        id = it.productId,
                        price = it.oneTimePurchaseOfferDetails?.formattedPrice ?: "10",
                        item = item,
                        isPurchase = false
                    )
            }?.toImmutableList()
            ?: emptyList<BuyItem>().toImmutableList()
    }

    var billingClient by remember {
        mutableStateOf<BillingClient?>(null)
    }
    val handlePurchase: (Purchase) -> Unit = { purchase ->
        coroutineScope.launch(Dispatchers.IO) {
            Timber.e("buy this $purchase")
            if (purchase.purchaseState == PurchaseState.PURCHASED) {
                if (purchase.isAcknowledged.not()) {
//                    val acknowledgePurchaseParams = AcknowledgePurchaseParams.newBuilder()
//                        .setPurchaseToken(it.purchaseToken)
//                    val ackPurchaseResult =  billingClient
//                        ?.acknowledgePurchase(acknowledgePurchaseParams.build()) {
//
//                        }
                    val id = purchase.products[0]!!
                    val newProductDetails = productDetails?.toMutableList()
                    newProductDetails?.removeIf { it.productId == id }
                    productDetails = newProductDetails?.toImmutableList()

                    val newAllPurchaseItems = allPurchaseItemsId.toMutableList()
                    newAllPurchaseItems.add(id)
                    allPurchaseItemsId = newAllPurchaseItems.toImmutableList()
                    settings.setPurchaseItems(allPurchaseItemsId)


                }

            }
        }

    }

    val purchaseFlow: (String) -> Unit = { id ->
        val productDetailsParamsList = listOf(
            BillingFlowParams.ProductDetailsParams.newBuilder()
                // retrieve a value for "productDetails" by calling queryProductDetailsAsync()
                .setProductDetails(productDetails?.single { it.productId == id }!!)
                // to get an offer token, call ProductDetails.subscriptionOfferDetails()
                // for a list of offers that are available to the user
                //.setOfferToken(selectedOfferToken)
                .build()
        )

        val billingFlowParams = BillingFlowParams.newBuilder()
            .setProductDetailsParamsList(productDetailsParamsList)
            .build()

// Launch the billing flow
        val billingResult = billingClient?.launchBillingFlow(context as Activity, billingFlowParams)
    }


    LaunchedEffect(key1 = Unit, block = {
        allPurchaseItemsId = settings.getPurchaseItems().toImmutableList()
    })

    LaunchedEffect(key1 = Unit, block = {
        billingClient = BillingClient
            .newBuilder(context)
            .setListener { billingResult, purchases ->
                purchases?.forEach {
                    handlePurchase(it)
                }

            }
            .enablePendingPurchases()
            .build()
        billingClient
            ?.startConnection(object : BillingClientStateListener {
                override fun onBillingServiceDisconnected() {
                    Timber.e("disconnect")
                }

                override fun onBillingSetupFinished(billingResult: BillingResult) {
                    Timber.e("connected ${billingResult.responseCode == BillingResponseCode.OK}")
                    if (billingResult.responseCode == BillingResponseCode.OK) {
                        coroutineScope.launch {
                            withContext(Dispatchers.IO) {
                                val params2 = QueryPurchasesParams.newBuilder()
                                    .setProductType(BillingClient.ProductType.INAPP)
                                val purchasesResult =
                                    billingClient?.queryPurchasesAsync(params2.build())

                                val purchaseList = purchasesResult
                                    ?.purchasesList
                                    ?.mapNotNull {
                                        it.products[0]
                                    } ?: emptyList()
                                Timber.e("purchase $purchaseList")
                                if (purchaseList.isNotEmpty()) {
                                    settings.setPurchaseItems(purchaseList)
                                    allPurchaseItemsId = purchaseList.toImmutableList()
                                }
                                Timber.e("purchase result ${purchasesResult?.billingResult}")


                                val productList = allboard
                                    .keys
                                    .filter { it !in purchaseList }
                                    .map {
                                        QueryProductDetailsParams.Product.newBuilder()
                                            .setProductId(it)
                                            .setProductType(BillingClient.ProductType.INAPP)
                                            .build()
                                    }


                                val params = QueryProductDetailsParams
                                    .newBuilder()
                                    .setProductList(productList)


                                val productDetailsResult =
                                    billingClient?.queryProductDetails(params.build())
                                Timber.e("productDetail ${productDetailsResult?.productDetailsList}")
                                productDetails =
                                    productDetailsResult
                                        ?.productDetailsList
                                        ?.toImmutableList()
                            }
                        }

                    }
                }
            })

    })


    MarketScreen(
        back = onBack,
        currentBoard = currentBoard.value,
        currentDice = currentDice.value,
        unPurchaseItems = allUnPurchaseItems,
        purchaseItems = allPurchaseItems,
        onBuy = purchaseFlow,
        onSelect = { id,isBoard->
            coroutineScope.launch (Dispatchers.IO){
                if (isBoard)
                    settings.setCurrentBoard(id)
                else
                    settings.setCurrentDice(id)
            }
        }
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun MarketScreen(
    back: () -> Unit = {},
    onBuy: (String) -> Unit = {},
    onSelect: (String, Boolean) -> Unit = { _, _ -> },
    currentDice:String="",
    currentBoard:String="",
    unPurchaseItems: ImmutableList<BuyItem> = emptyList<BuyItem>().toImmutableList(),
    purchaseItems: ImmutableList<BuyItem> = emptyList<BuyItem>().toImmutableList()
) {
    val pagerState = rememberPagerState {
        2
    }
    val coroutineScope = rememberCoroutineScope()
    val configuration = LocalConfiguration.current

    val vector = if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT)
        Drawable.BgP
    else
        Drawable.BgL

    val painter = rememberVectorPainter(image = vector)
    Scaffold(
        containerColor = Color.Transparent,
        modifier = Modifier
            .drawBehind {
                with(painter) {
                    draw(size, 0.5f)
                }
            }
    ) { paddingValues ->

        Box(Modifier.padding(paddingValues)) {


            HorizontalPager(
                modifier = Modifier.fillMaxSize(),
                state = pagerState
            ) { index ->
                when (index) {
                    0 -> {
                        LazyVerticalGrid(
                            modifier = Modifier.fillMaxSize(),
                            columns = GridCells.Fixed(2),
                            contentPadding = PaddingValues(
                                bottom = 8.dp,
                                start = 16.dp,
                                end = 16.dp
                            ),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            item(span = { GridItemSpan(2) }) {
                                Spacer(modifier = Modifier.height(64.dp))
                            }

                            items(unPurchaseItems, key = { it.id }) {
                                BuyBoardUi(
                                    modifier = Modifier.fillMaxWidth(),
                                    buyItem = it,
                                    onBuy = onBuy
                                )
                            }
                        }


                    }

                    else -> {
                        LazyVerticalGrid(
                            modifier = Modifier.fillMaxSize(),
                            columns = GridCells.Fixed(2),
                            contentPadding = PaddingValues(
                                bottom = 8.dp,
                                start = 16.dp,
                                end = 16.dp
                            ),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            item(span = { GridItemSpan(2) }) {
                                Spacer(modifier = Modifier.height(64.dp))
                            }
                            item {
                                BuyBoardUi(buyItem =
                                BuyItem(
                                    id = "default_board",
                                    price = "",
                                    item = DefaultBoard,
                                    isPurchase = true
                                ),
                                    onSelect = onSelect,
                                    isSelect = currentBoard=="default_board"
                                )

                            }
                            item {
                                BuyBoardUi(buyItem =
                                BuyItem(
                                    id = "default_dice",
                                    price = "",
                                    item = UDice(0xFF888888),
                                    isPurchase = true,
                                ),
                                    onSelect = onSelect,
                                    isSelect = currentDice=="default_dice"
                                )
                            }

                            items(purchaseItems, key = { it.id }) { item ->
                                BuyBoardUi(
                                    modifier = Modifier.fillMaxWidth(),
                                    buyItem = item,
                                    onBuy = onBuy,
                                    onSelect = onSelect,
                                    isSelect = currentBoard==item.id || currentDice==item.id
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
                            0.7f to MaterialTheme.colorScheme.primaryContainer
                        )
                    )
                    .align(Alignment.TopCenter)
            ) {
                IconButton(onClick = back) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back")
                }
                TabRow(
                    modifier = Modifier.weight(1f),
                    selectedTabIndex = pagerState.currentPage,
                    containerColor = Color.Transparent
                ) {
                    Tab(selected = pagerState.currentPage == 0,
                        onClick = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(0)
                            }
                        },
                        text = {
                            Text(text = "Market")
                        }
                    )
                    Tab(selected = pagerState.currentPage == 1, onClick = {
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(1)
                        }
                    },
                        text = {
                            Text(text = "My UItem")
                        })
                }
            }
        }
    }
}

@Preview
@Composable
fun MarketScreenPreview() {
    val b = getAllItem()
        .map {
            BuyItem(it.key, "N 1,610.00", it.value)
        }
    MarketScreen(
        purchaseItems = b.toImmutableList()
    )
}

@Composable
fun BuyBoardUi(
    modifier: Modifier = Modifier,
    buyItem: BuyItem,
    onBuy: (String) -> Unit = {},
    onSelect: (String, Boolean) -> Unit = { _, _ -> },
    isSelect  :Boolean=false

    ) {


    OutlinedCard(
        modifier = modifier,
        border = if (isSelect) BorderStroke(4.dp,Color.Blue) else BorderStroke(0.dp, Color.Transparent)
    ) {
        Column {

            when (buyItem.item) {
                is UBoard -> {
                    CompositionLocalProvider(LocalBoard provides buyItem.item) {
                        BoardUi(
                            modifier = Modifier.fillMaxWidth(),
                            boardUiStateProvider = { BoardUiState(colors = GameColor.entries.toImmutableList()) },
                            content = {})
                    }
                }

                is UDice -> {
                    BoxWithConstraints(
                        modifier = Modifier
                            .background(Color(buyItem.item.color).copy(alpha = 0.3f))
                            .fillMaxWidth()
                            .aspectRatio(1f),
                        contentAlignment = Alignment.Center
                    ) {

                        DiceUi(modifier = Modifier
                            .size(this.maxWidth.times(0.5f))
                            .offset(this.maxWidth.times(0.2f)),
                            diceUiState = DiceUiState(animate = true, color = buyItem.item.color),
                            rotate = { 90f }

                        )
                        DiceUi(modifier = Modifier
                            .size(this.maxWidth.times(0.5f))
                            .offset(this.maxWidth.times(-0.2f)),
                            diceUiState = DiceUiState(
                                animate = true,
                                color = buyItem.item.color
                            ),
                            rotate = { -90f }

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
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (buyItem.isPurchase) {
                        Button(onClick = { onSelect(buyItem.id, buyItem.item is UBoard) }) {
                            Text(text = "Select")
                        }
                    } else {
                        Text(
                            text = buyItem.price,
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.primary
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

@Preview
@Composable
fun BuyBoardUiPreview() {
    BuyBoardUi(
        buyItem = BuyItem(
            "default",
            "N 1,610.00",
            UDice(0xFF008a00),
            false,
        )
    )
}

data class BuyItem(
    val id: String,
    val price: String,
    val item: UItem,
    val isPurchase: Boolean = false,
)