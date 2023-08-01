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
import com.mshdabiola.ludo.screen.game.component.board.DragonBoard2
import com.mshdabiola.ludo.screen.game.component.board.ManBoard
import com.mshdabiola.ludo.screen.game.component.board.ManBoard2
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
    var msg by remember {
        mutableStateOf<String?>(null)
    }

    val errorHandle: (BillingResult, String, () -> Unit) -> Unit = { result, from, action ->
        Timber.e("msg ${result.debugMessage} from  $from")
        when (result.responseCode) {
            BillingResponseCode.OK -> {
                action()
            }

            BillingResponseCode.FEATURE_NOT_SUPPORTED -> {
                Timber.e("error : feature not supported")
                msg= "Feature not supported"


            }

            BillingResponseCode.SERVICE_DISCONNECTED -> {
                Timber.e("error : service disconnected")
                msg= "Service disconnected"
            }

            BillingResponseCode.USER_CANCELED -> {
                Timber.e("error : user canceled")
                msg= "User canceled"
            }

            BillingResponseCode.SERVICE_UNAVAILABLE -> {
                Timber.e("error : service unavailable")
                msg= "Service unavailable"
            }

            BillingResponseCode.BILLING_UNAVAILABLE -> {
                Timber.e("error : billing unavailable")
                msg= "Billing unavailable"
            }

            BillingResponseCode.ITEM_UNAVAILABLE -> {
                Timber.e("error : item unavailable")
                msg= "Item unavailable"
            }

            BillingResponseCode.DEVELOPER_ERROR -> {
                Timber.e("error : developer error")
            }

            BillingResponseCode.ERROR -> {
                Timber.e("error : errors")
                msg= "Error occur"
            }

            BillingResponseCode.ITEM_ALREADY_OWNED -> {
                Timber.e("error :item alread owned")
                msg= "Item already owned"
            }

            BillingResponseCode.ITEM_NOT_OWNED -> {
                Timber.e("error : item not owned")
                msg= "Item not owned"
            }

            BillingResponseCode.NETWORK_ERROR -> {
                Timber.e("error : network error")
                msg= "Network  Error"
            }
            else->{
                Timber.e("error : uncatch error code ${result.responseCode}")
            }
        }
    }

    val allItems = getAllItem()
    val currentBoard =
        settings
            .getCurrentBoard()
            .collectAsStateWithLifecycle(initialValue = "man_2")
    val currentDice =
        settings
            .getCurrentDice()
            .collectAsStateWithLifecycle(initialValue = "default_dice")

    var allPurchaseItemsId by remember {
        mutableStateOf(listOf<String>().toImmutableList())
    }

    val allPurchaseItems = remember(allPurchaseItemsId) {
        allPurchaseItemsId
            .mapNotNull {
                val item = allItems[it]
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
                val item = allItems[it.productId]
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
        billingResult?.let {
            errorHandle(it,"Start Flow"){

            }
        }
    }


    LaunchedEffect(key1 = Unit, block = {
        allPurchaseItemsId = settings.getPurchaseItems().toImmutableList()
    })

    LaunchedEffect(key1 = Unit, block = {
        billingClient = BillingClient
            .newBuilder(context)
            .setListener { billingResult, purchases ->
                errorHandle(billingResult,"setListener"){
                    purchases?.forEach {
                        handlePurchase(it)
                    }
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
                    errorHandle(billingResult,"start connection"){
                        coroutineScope.launch {
                            withContext(Dispatchers.IO) {


                                val params2 = QueryPurchasesParams.newBuilder()
                                    .setProductType(BillingClient.ProductType.INAPP)


                                val purchasesResult = billingClient
                                        ?.queryPurchasesAsync(params2.build())

                                purchasesResult?.let { result ->
                                    errorHandle(result.billingResult,"purchase result"){
                                        val purchaseList = purchasesResult
                                            .purchasesList
                                            .mapNotNull {
                                                it.products[0]
                                            }
                                        Timber.e("purchase $purchaseList")
                                        if (purchaseList.isNotEmpty()) {
                                            this.launch {
                                                settings.setPurchaseItems(purchaseList)
                                            }
                                            allPurchaseItemsId = purchaseList.toImmutableList()
                                        }
                                        Timber.e("purchase result ${purchasesResult?.billingResult}")
                                    }
                                }


                                val productList = allItems
                                    .keys
                                    .filter { it !in allPurchaseItemsId }
                                    .map {
                                        QueryProductDetailsParams.Product.newBuilder()
                                            .setProductId(it)
                                            .setProductType(BillingClient.ProductType.INAPP)
                                            .build()
                                    }

                                val params = QueryProductDetailsParams
                                    .newBuilder()
                                    .setProductList(productList)


                                val productDetailsResult = billingClient
                                        ?.queryProductDetails(params.build())

                                productDetailsResult?.let {
                                    errorHandle(it.billingResult,"product detail"){
                                        Timber.e("productDetail ${productDetailsResult?.productDetailsList}")
                                        productDetails =
                                            productDetailsResult
                                                .productDetailsList
                                                ?.toImmutableList()
                                    }
                                }

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
        message = msg,
        onBuy = purchaseFlow,
        onSelect = { id, isBoard ->
            coroutineScope.launch(Dispatchers.IO) {
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
    currentDice: String = "",
    currentBoard: String = "",
    message:String?=null,
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
    val snackbarHostState = remember {
        SnackbarHostState()
    }
    LaunchedEffect(key1 = message, block = {
        if (message!=null){
            snackbarHostState.showSnackbar(message=message)

        }
    })

    val painter = rememberVectorPainter(image = vector)
    Scaffold(
        containerColor = Color.Transparent,
        modifier = Modifier
            .drawBehind {
                with(painter) {
                    draw(size, 0.5f)
                }
            },
        snackbarHost = { SnackbarHost(snackbarHostState)}
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
                        LazyVerticalStaggeredGrid(
                            modifier = Modifier.fillMaxSize(),
                            columns = StaggeredGridCells.Fixed(2),
                            contentPadding = PaddingValues(
                                bottom = 8.dp,
                                start = 16.dp,
                                end = 16.dp
                            ),
                            verticalItemSpacing = 8.dp,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            item(span =  StaggeredGridItemSpan.FullLine) {
                                Spacer(modifier = Modifier.height(64.dp))
                            }
                            item {
                                BuyBoardUi(
                                    buyItem =
                                    BuyItem(
                                        id = "man_2",
                                        price = "",
                                        item = ManBoard2,
                                        isPurchase = true
                                    ),
                                    onSelect = onSelect,
                                    isSelect = currentBoard == "man_2"
                                )

                            }
                            item {
                                BuyBoardUi(
                                    buyItem =
                                    BuyItem(
                                        id = "man_1",
                                        price = "",
                                        item = ManBoard,
                                        isPurchase = true
                                    ),
                                    onSelect = onSelect,
                                    isSelect = currentBoard == "man_1"
                                )

                            }
                            item {
                                BuyBoardUi(
                                    buyItem =
                                    BuyItem(
                                        id = "default_dice",
                                        price = "",
                                        item = UDice(0xFF888888),
                                        isPurchase = true,
                                    ),
                                    onSelect = onSelect,
                                    isSelect = currentDice == "default_dice"
                                )
                            }

                            items(purchaseItems, key = { it.id }) { item ->
                                BuyBoardUi(
                                    modifier = Modifier.fillMaxWidth(),
                                    buyItem = item,
                                    onBuy = onBuy,
                                    onSelect = onSelect,
                                    isSelect = currentBoard == item.id || currentDice == item.id
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
                            Text(text = "My Items")
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
        unPurchaseItems = b.toImmutableList()
    )
}

@Composable
fun BuyBoardUi(
    modifier: Modifier = Modifier,
    buyItem: BuyItem,
    onBuy: (String) -> Unit = {},
    onSelect: (String, Boolean) -> Unit = { _, _ -> },
    isSelect: Boolean = false

) {


    OutlinedCard(
        modifier = modifier,
        border = if (isSelect) BorderStroke(4.dp, Color.Blue) else BorderStroke(
            0.dp,
            Color.Transparent
        )
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
            DragonBoard2,
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