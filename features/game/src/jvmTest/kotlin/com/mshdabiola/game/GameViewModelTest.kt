/*
 *abiola 2022
 */

package com.mshdabiola.game

import androidx.lifecycle.SavedStateHandle
import app.cash.turbine.test
import com.mshdabiola.datastore.Store
import com.mshdabiola.naijaludo.model.IP2pManager
import com.mshdabiola.naijaludo.model.SoundInterface
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

class GameViewModelTest : KoinTest {

    @get:Rule(order = 1)
    val tmpFolder: TemporaryFolder = TemporaryFolder.builder().assureDeletion().build()

    @get:Rule(order = 2)
    val mainDispatcherRule = MainDispatcherRule()

    @get:Rule(order = 3)
    val koinTestRule = KoinTestRule.create {
        this.modules(testDataModule)
    }

    // private val noteRepository by inject<NoteRepository>()
    private val saveStateHandle = SavedStateHandle(mapOf())
    private val store by inject<Store>()
    private val sound by inject<SoundInterface>()
    private val p2p by inject<IP2pManager>()

    @Test
    fun init() = runTest(mainDispatcherRule.testDispatcher) {
        val viewModel = GameViewModel(
            savedStateHandle = saveStateHandle,
            soundSystem = sound,
            blueManager = p2p,
            setting = store,
            dispatcher = mainDispatcherRule.testDispatcher,
        )

        viewModel
            .gameUiState
            .test {
                var state = awaitItem()

                assertTrue(state.isStartDialogOpen)

                cancelAndIgnoreRemainingEvents()
            }
    }
}
