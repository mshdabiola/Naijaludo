package com.mshdabiola.common.firebase

import android.annotation.SuppressLint
import android.content.Context
import com.google.firebase.analytics.FirebaseAnalytics
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

//<application> manifest
//<meta-data
//android:name="google_analytics_automatics_screen_reporting_enabled"
//android:value="false" />
@SuppressLint("MissingPermission")
class FireAnalyticsLog @Inject constructor(
    @ApplicationContext val context: Context
) {

    fun logScreen(name: String) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)

        firebaseAnalytics.logEvent(
            FirebaseAnalytics.Event.SCREEN_VIEW,
            bundleOf(
                FirebaseAnalytics.Param.SCREEN_CLASS to name,
                FirebaseAnalytics.Param.SCREEN_NAME to name
            )
        )
    }

    fun log(name: String, vararg params: Pair<String, Any>) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)

        firebaseAnalytics.logEvent(
            name, bundleOf(*params)
        )
    }
}