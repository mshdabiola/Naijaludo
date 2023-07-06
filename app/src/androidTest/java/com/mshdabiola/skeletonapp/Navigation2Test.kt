package com.mshdabiola.skeletonapp

import android.content.Context
import com.mshdabiola.testing.KoinTestRule
import org.junit.Rule
import org.junit.Test
import org.koin.core.component.inject
import org.koin.test.KoinTest
import kotlin.test.assertEquals

class Navigation2Test : KoinTest {

    @get:Rule
    val hiltRule = KoinTestRule(emptyList())

    @Test
    fun buttonClick() {
        val context by inject<Context>()
        assertEquals("",context.packageName)
    }

}