package com.mshdabiola.naijaludo.model

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class BoardTest {

    private lateinit var board: Board

    @BeforeEach
    fun setUp() {
        board = Board()
    }

    @Test
    fun getPaths() {
        val path = board.paths

        assertEquals(52, path.size)
    }

    @Test
    fun getSafePath() {
    }

    @Test
    fun getBigHomeBoxes() {
    }

    @Test
    fun getBoxByIndex() {
        val box = board.getBoxByIndex(0, GameColor.GREEN)
        assertTrue { box.isHome }
    }

    @Test
    fun getPositionIntPoint() {
    }

    @Test
    fun specificToGeneral() {
    }

    @Test
    fun getColors() {
    }

    @Test
    fun getBoardType() {
    }
}
