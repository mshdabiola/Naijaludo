package com.mshdabiola.designsystem.component

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.mshdabiola.designsystem.R

@SuppressLint("MissingPermission", "ResourceType")
@Composable
internal fun BannerAdmob(
    modifier: Modifier = Modifier,
    appUnitId: Int = 0,
) {
    val isInEditMode = LocalInspectionMode.current
    val context = LocalContext.current
    val unitId = remember {
        val packagename = context.applicationContext.packageName

        val p = "com.mshdabiola.ludo.debug"
        if (packagename == p) {
            R.string.ad_test_id
        } else {
            appUnitId
        }
    }
    Column(modifier) {
        if (isInEditMode) {
            Text(
                text = "Advert is here",
                modifier = Modifier
                    .background(Color.Red)
                    .padding(8.dp),
                textAlign = TextAlign.Center,
                color = Color.White,

            )
        } else {
            AndroidView(factory = {
                AdView(it).apply {
                    setAdSize(AdSize.BANNER)
                    adUnitId = context.getString(unitId)
                    loadAd(AdRequest.Builder().build())
                }
            })
        }
    }
}

@Composable
fun GameAd(modifier: Modifier) {
    BannerAdmob(modifier, R.string.game_ad_banner)
}

@Composable
fun MainAd(modifier: Modifier) {
    BannerAdmob(modifier, R.string.main_ad_banner)
}

@Preview
@Composable
fun AdmobPrev() {
    BannerAdmob()
}
