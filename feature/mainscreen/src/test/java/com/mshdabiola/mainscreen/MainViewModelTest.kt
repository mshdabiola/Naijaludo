package com.mshdabiola.mainscreen

import androidx.lifecycle.SavedStateHandle
import app.cash.turbine.test
import com.mshdabiola.data.repository.ModelRepository
import com.mshdabiola.model.Model
import com.mshdabiola.testing.MainDispatcherRule
import com.mshdabiola.testing.repository.TestIModelRepository
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {

    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    lateinit var modelRepository: ModelRepository
    lateinit var mainViewModel: MainViewModel

    @Before
    fun setUp() {
        modelRepository = TestIModelRepository()

        mainViewModel = MainViewModel(
            savedStateHandle = SavedStateHandle(initialState = mapOf()),
            modelRepository = modelRepository,
        )
    }

    @Test
    fun getMainState() {
    }

    @Test
    fun insert() = runTest {
        mainViewModel.insert(Model(1, "old"))
        mainViewModel
            .mainState
            .test {
                //  assertEquals(2, awaitItem().first().id)
            }
    }
}
