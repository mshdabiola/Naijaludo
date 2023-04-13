package com.mshdabiola.naijaludo



import app.cash.turbine.test
import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.naijaludo.model.LudoSetting
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

@OptIn(ExperimentalCoroutinesApi::class)
class LudoGameTest {

    private lateinit var ludoGame: LudoGame
    private lateinit var ludoSetting: LudoSetting
    @BeforeEach
    fun setUp() {
        ludoGame=LudoGame()
        ludoSetting= LudoSetting()
    }

    @Test
    fun getGameState() {
        ludoGame.gameState
    }

    @Test
    fun start()= runTest {
        ludoGame.start(Constant.getDefaultGameState(), ludoSetting =ludoSetting, onGameFinish = {} )

        ludoGame.gameState.test {
           val ludoGameState= awaitItem()
            assertTrue { ludoGameState.listOfPawn.all { it.isHome() } }
            this.cancelAndIgnoreRemainingEvents()
        }

    }

    @Test
    fun stop() {
    }

    @Test
    fun restart() {
    }

    @Test
    fun resign() {
    }

    @Test
    fun resume() {
    }

    @Test
    fun pause() {
    }

    @Test
    fun onStateChange() {
    }

    @Test
    fun onDice() {
    }

    @Test
    fun onCounter() {
    }

    @Test
    fun onPawn() {
    }

    @Test
    fun getPositionIntOffset() {
    }
}