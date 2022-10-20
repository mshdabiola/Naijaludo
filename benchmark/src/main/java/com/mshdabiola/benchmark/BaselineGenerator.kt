package com.mshdabiola.benchmark

import androidx.benchmark.macro.ExperimentalBaselineProfilesApi
import androidx.benchmark.macro.junit4.BaselineProfileRule
import org.junit.Rule
import org.junit.Test

@OptIn(ExperimentalBaselineProfilesApi::class)
class BaselineGenerator {

    @get:Rule
    val baselineProfileRule = BaselineProfileRule()

    @Test
    fun startUp()=baselineProfileRule.collectBaselineProfile(
        packageName = "com.mshdabiola.ludo",
        profileBlock = {
            startActivityAndWait()
        }
    )
}