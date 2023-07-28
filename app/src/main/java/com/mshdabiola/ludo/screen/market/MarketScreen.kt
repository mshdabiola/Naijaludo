package com.mshdabiola.ludo.screen.market


import android.app.Activity
import android.content.res.Configuration
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.android.billingclient.api.AcknowledgePurchaseParams
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
import com.mshdabiola.ludo.screen.game.component.board.DefaultBoard
import com.mshdabiola.ludo.screen.game.component.board.UBoard
import com.mshdabiola.ludo.screen.game.component.getAllBoards
import com.mshdabiola.ludo.screen.game.state.BoardUiState
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

    var isEnable by remember {
        mutableStateOf(false)
    }
    val allboard = getAllBoards()
    val currentBoard =
        settings.getCurrentBoard().collectAsStateWithLifecycle(initialValue = "default")
    val currentDice =
        settings.getCurrentDice().collectAsStateWithLifecycle(initialValue = "default")
    var purchaseDice by remember {
        mutableStateOf(listOf<String>().toImmutableList())
    }
    var purchaseBoard by remember {
        mutableStateOf(listOf<String>().toImmutableList())
    }

    var billingClient by remember {
        mutableStateOf<BillingClient?>(null)
    }
    val handlePurchase: (Purchase) -> Unit = {
        Timber.e("buy this $it")
        if (it.purchaseState == PurchaseState.PURCHASED) {
            if (it.isAcknowledged.not()) {
                val acknowledgePurchaseParams = AcknowledgePurchaseParams.newBuilder()
                    .setPurchaseToken(it.purchaseToken)
                val ackPurchaseResult = coroutineScope.launch {
                    withContext(Dispatchers.IO) {
                        billingClient?.acknowledgePurchase(acknowledgePurchaseParams.build()) {

                        }
                    }
                }
            }

        }
    }

    var product by remember {
        mutableStateOf<ImmutableList<ProductDetails>?>(null)
    }
    val productUi = remember(product) {
        product
            ?.map {
                BuyBoard(
                    id = it.productId,
                    price = it.oneTimePurchaseOfferDetails?.formattedPrice ?: "10",
                    board = allboard[it.productId] ?: DefaultBoard,
                    isPurchase = false
                )
            }?.toImmutableList()
            ?: emptyList<BuyBoard>().toImmutableList()
    }
    val purchase = {
        val productDetailsParamsList = listOf(
            BillingFlowParams.ProductDetailsParams.newBuilder()
                // retrieve a value for "productDetails" by calling queryProductDetailsAsync()
                .setProductDetails(product?.get(0)!!)
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
        purchaseBoard = settings.getPurchaseBoards().toImmutableList()
        purchaseDice = settings.getPurchaseDices().toImmutableList()
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
                                    settings.setPurchaseBoards(purchaseList)
                                    purchaseBoard = purchaseList.toImmutableList()
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
                                product =
                                    productDetailsResult
                                        ?.productDetailsList
                                        ?.toImmutableList()
                            }
                        }

                    }
                }
            })

    })


    MarketScreen(back = onBack, purchaseBoard = productUi,click = { purchase() })
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun MarketScreen(
    back: () -> Unit = {},
    click: (Int) -> Unit = {},
    purchaseBoard: ImmutableList<BuyBoard> = emptyList<BuyBoard>().toImmutableList()
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

        Column(Modifier.padding(paddingValues)) {
            Row {
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
                            Text(text = "My Item")
                        })
                }
            }
            HorizontalPager(
                modifier = Modifier.weight(1f),
                state = pagerState
            ) {
                when (it) {
                    0 -> {
                        LazyColumn(Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            items(purchaseBoard,key = {it.id}){
                                BuyBoardUi(buyBoard = it)
                            }
                        }

                    }

                    else -> {
                        Column(Modifier.fillMaxSize()) {
                            Text(text = "Items")
                        }
                    }
                }

            }
        }
    }
}

@Preview
@Composable
fun MarketScreenPreview() {
    MarketScreen(
        purchaseBoard = listOf(

            BuyBoard("board_2", "50", DefaultBoard),
            BuyBoard("default", "50", DefaultBoard, isPurchase = false,isSelect = false),
            BuyBoard("board_1", "50", DefaultBoard),
        ).toImmutableList()
    )
}

@Composable
fun BuyBoardUi(buyBoard: BuyBoard,onBuy:(String)->Unit={}) {
   
    OutlinedCard(
        modifier = Modifier.width(300.dp),
        border = CardDefaults.outlinedCardBorder(buyBoard.isSelect)
    ) {
        Column {

                BoardUi(
                    modifier = Modifier.fillMaxWidth(),
                    boardUiStateProvider = { BoardUiState(colors = GameColor.entries.toImmutableList()) },
                    content = {})

            if (!buyBoard.isSelect) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    horizontalArrangement = if (buyBoard.isPurchase) Arrangement.Center else Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                   if (buyBoard.isPurchase)
                   {
                       Button(onClick = { onBuy(buyBoard.id) }) {
                           Text(text = "Select")
                       }
                   }else{
                       Text(
                           text = "Prize ${buyBoard.price}",
                           style = MaterialTheme.typography.headlineMedium,
                           color = MaterialTheme.colorScheme.primary
                       )
                       Button(onClick = { onBuy(buyBoard.id) }) {
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
    BuyBoardUi(buyBoard = BuyBoard("default", "50", DefaultBoard, false,isSelect = false))
}

data class BuyBoard(
    val id: String,
    val price: String,
    val board: UBoard,
    val isPurchase: Boolean=false,
    val isSelect : Boolean=false
)