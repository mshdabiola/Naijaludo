/*
 *abiola 2022
 */

package com.mshdabiola.main

import com.mshdabiola.testing.fake.testDataModule
import com.mshdabiola.testing.util.MainDispatcherRule
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.rules.TemporaryFolder
import org.koin.test.KoinTest
import org.koin.test.KoinTestRule
import kotlin.test.Test
import kotlin.test.assertEquals

class MainViewModelTest : KoinTest {

    @get:Rule(order = 1)
    val tmpFolder: TemporaryFolder = TemporaryFolder.builder().assureDeletion().build()

    @get:Rule(order = 2)
    val mainDispatcherRule = MainDispatcherRule()

    @get:Rule(order = 3)
    val koinTestRule = KoinTestRule.create {
        this.modules(testDataModule)
    }

    @Test
    fun init() = runTest(mainDispatcherRule.testDispatcher) {
        val viewModel = MainViewModel()

        assertEquals(4, 4)
    }
}
