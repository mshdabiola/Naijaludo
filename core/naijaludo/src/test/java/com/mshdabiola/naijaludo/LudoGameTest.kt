package com.mshdabiola.naijaludo



import app.cash.turbine.test
import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.naijaludo.model.LudoSetting
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
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
        stateLudo()
        ludoGame.gameState.test {
           val ludoGameState= awaitItem()
            assertTrue { ludoGameState.listOfPawn.all { it.isHome() } }
            this.cancelAndIgnoreRemainingEvents()
        }

    }

    @Test
    fun stop() {
    }

    fun stateLudo()= runTest{
        ludoGame.start(Constant.getDefaultGameState(), ludoSetting =ludoSetting, onGameFinish = {} )
        ludoGame.resume()
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
    fun onDice() = runTest{
        stateLudo()
        ludoGame.onDice(intArrayOf(6,12,6))
        ludoGame.gameState
            .test{
                var ludoGameState=awaitItem()
                print(ludoGameState.toString())
                assertEquals(6, ludoGameState.listOfCounter[0].number)
                assertEquals(12, ludoGameState.listOfCounter[1].number)
                assertEquals(6, ludoGameState.listOfCounter[2].number)
                cancelAndIgnoreRemainingEvents()
            }
    }

    private fun count()= runTest{
        stateLudo()
        ludoGame.onDice(intArrayOf(6,12,6))
        ludoGame.onCounter(0)

    }
    @Test
    fun onCounter() = runTest{
        count()
        ludoGame.gameState
            .test {
                val ludoGameState=awaitItem()

                assertTrue(ludoGameState.listOfPawn.count { it.isEnable }==8)
                cancelAndIgnoreRemainingEvents()
            }

    }

    private fun pawn(){
        count()
        ludoGame.onPawn(0,isDrawer = false)
    }
    @Test
    fun onPawn()= runTest {
        pawn()
        ludoGame.gameState
            .test {
                val ludoGameState=awaitItem()

                val pawn=ludoGameState.listOfPawn.single { it.idx==0 }
                print(ludoGameState)
                assertEquals(0,pawn.currentPos)
                cancelAndIgnoreRemainingEvents()
            }
    }

    @Test
    fun getPositionIntOffset() {
    }
}