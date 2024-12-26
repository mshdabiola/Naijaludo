/*
 *abiola 2022
 */

package com.mshdabiola.main

import org.koin.test.KoinTest

class MainViewModelTest : KoinTest {

//    @get:Rule(order = 1)
//    val tmpFolder: TemporaryFolder = TemporaryFolder.builder().assureDeletion().build()
//
//    @get:Rule(order = 2)
//    val mainDispatcherRule = MainDispatcherRule()
//
//    @get:Rule(order = 3)
//    val koinTestRule = KoinTestRule.create {
//        this.modules(testDataModule)
//    }
//    private val noteRepository by inject<NoteRepository>()
//
//    @Test
//    fun init() = runTest(mainDispatcherRule.testDispatcher) {
//        val viewModel = MainViewModel(
//            noteRepository,
//        )
//
//        viewModel
//            .notes
//            .test {
//                var state = awaitItem()
//
//                assertTrue(state is Result.Loading)
//
//                state = awaitItem()
//
//                assertTrue(state is Result.Success)
//
//                assertEquals(
//                    10,
//                    state.data.size,
//
//                )
//
//                cancelAndIgnoreRemainingEvents()
//            }
//    }
}
