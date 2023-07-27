package com.mshdabiola.ludo.screen.market


import android.content.res.Configuration
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.android.billingclient.api.BillingClient
import com.android.billingclient.api.BillingClient.BillingResponseCode
import com.android.billingclient.api.BillingClientStateListener
import com.android.billingclient.api.BillingResult
import com.android.billingclient.api.QueryProductDetailsParams
import com.android.billingclient.api.queryProductDetails
import com.mshdabiola.designsystem.icon.Drawable
import com.mshdabiola.designsystem.icon.drawable.BgL
import com.mshdabiola.designsystem.icon.drawable.BgP
import com.mshdabiola.ludo.screen.DEVICE_TYPE
import com.mshdabiola.ludo.screen.GeneralViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber


@Composable
internal fun MarketScreen(
    viewModel: GeneralViewModel,
    deviceType: DEVICE_TYPE,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val billingClient = remember {
        BillingClient
            .newBuilder(context)
            .setListener { billingResult, purchases ->

            }
            .enablePendingPurchases()
            .build()
    }
    val coroutineScope = rememberCoroutineScope()
    LaunchedEffect(key1 = Unit, block = {
        Timber.e("Launch Billing")
        billingClient.startConnection(object : BillingClientStateListener {
            override fun onBillingServiceDisconnected() {
                Timber.e("disconnect")
            }

            override fun onBillingSetupFinished(billingResult: BillingResult) {
                Timber.e("connected ${billingResult.responseCode== BillingResponseCode.OK}")
                if (billingResult.responseCode == BillingResponseCode.OK) {
                    val productList = ArrayList<QueryProductDetailsParams.Product>()
                    productList.add(
                        QueryProductDetailsParams.Product.newBuilder()
                            .setProductId("board_1")
                            .setProductType(BillingClient.ProductType.INAPP)
                            .build()
                    )
                    productList.add(
                        QueryProductDetailsParams.Product.newBuilder()
                            .setProductId("board_2")
                            .setProductType(BillingClient.ProductType.INAPP)
                            .build()
                    )

                    val params = QueryProductDetailsParams.newBuilder()
                    params.setProductList(productList)

                    coroutineScope.launch {
                        val productDetailsResult = withContext(Dispatchers.IO) {
                            billingClient.queryProductDetails(params.build())
                        }
                        productDetailsResult.productDetailsList?.forEach {
                            Timber.tag("Product")
                                .e(
                                    """
                                name   ${it.name}
                                desc    ${it.description}
                                 type    ${it.productType}
                                  title    ${it.title}
                                    price   ${it.oneTimePurchaseOfferDetails?.formattedPrice}
                              
                                """.trimIndent()
                                )
                        }
                    }
                    // leverage queryProductDetails Kotlin extension function

                }
            }
        })
    })
    val purchase = {

    }
    MarketScreen(back = onBack)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun MarketScreen(
    back: () -> Unit = {}
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
                        Column(Modifier.fillMaxSize()) {
                            Text(text = "Market")
                            Button(onClick = {

                            }) {
                                Text(text = "Start")
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
    MarketScreen()

}