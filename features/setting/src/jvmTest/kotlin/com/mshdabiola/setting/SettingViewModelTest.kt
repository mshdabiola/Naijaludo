/*
 *abiola 2022
 */

package com.mshdabiola.setting

import app.cash.turbine.test
import com.mshdabiola.datastore.Store
import com.mshdabiola.testing.fake.testDataModule
import com.mshdabiola.testing.util.MainDispatcherRule
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.rules.TemporaryFolder
import org.koin.test.KoinTest
import org.koin.test.KoinTestRule
import org.koin.test.inject
import kotlin.test.Test
import kotlin.test.assertTrue

class SettingViewModelTest : KoinTest {

    @get:Rule(order = 1)
    val tmpFolder: TemporaryFolder = TemporaryFolder.builder().assureDeletion().build()

    @get:Rule(order = 2)
    val mainDispatcherRule = MainDispatcherRule()

    @get:Rule(order = 3)
    val koinTestRule = KoinTestRule.create {
        this.modules(testDataModule)
    }
    private val store by inject<Store>()

    @Test
    fun init() = runTest(mainDispatcherRule.testDispatcher) {
        val viewModel = SettingViewModel(
            setting = store,
        )

        viewModel
            .settingUiState
            .test {
                var state = awaitItem()

                assertTrue(state.rotate)
                cancelAndIgnoreRemainingEvents()
            }
    }
}
