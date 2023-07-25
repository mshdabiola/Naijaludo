package com.mshdabiola.naijaludo

import com.mshdabiola.naijaludo.model.Board
import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.naijaludo.model.Dice
import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.naijaludo.model.GameType
import com.mshdabiola.naijaludo.model.LudoGameState
import com.mshdabiola.naijaludo.model.Pawn
import com.mshdabiola.naijaludo.model.Point
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.naijaludo.model.SoundInterface
import com.mshdabiola.naijaludo.model.log
import com.mshdabiola.naijaludo.model.player.HumanPlayer
import com.mshdabiola.naijaludo.model.player.RandomComputerPlayer
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import java.util.Collections

open class LudoGame2(private val soundInterface: SoundInterface? = null) {
    private val numberOfDice = 3
    private val totalIndex = 1
    private lateinit var defaultState: LudoGameState

    private lateinit var isGameFinish: (List<Pawn>) -> Boolean

    private lateinit var onGameFinish: () -> Unit

    private var onPlayerFinishPlaying: () -> Unit = {}

    private val _gameState = MutableStateFlow(LudoGameState(board = Board(colors = emptyList())))
    private var randList = listOf(1, 2, 3, 4, 5, 6)

    val gameState = _gameState.asStateFlow()

    private val computerDelay = 500L

    protected var lastDices: List<Dice>? = null

    private var ludoSetting: Setting = Setting.default

    private fun setGameState(gameState: LudoGameState) {
        log("update game state ${gameState.listOfPawn}")
        _gameState.update {
            gameState
        }
    }

    protected fun getGameState() = gameState.value

    // start  game function
    open suspend fun start(
        ludoGameState: LudoGameState,
        ludoSetting: Setting,
        isGameFinish: (List<Pawn>) -> Boolean = { currentPlayerPawn ->

            currentPlayerPawn.all { it.isOut() }
        },
        onGameFinish: () -> Unit,
        onPlayerFinishPlaying: () -> Unit = {},
        // gameType: GameType = GameType.COMPUTER
    ) {
        log("start")

        defaultState = ludoGameState // ?: getDefaultGameState()
        this.onGameFinish = onGameFinish
        this.isGameFinish = isGameFinish
        this.onPlayerFinishPlaying = onPlayerFinishPlaying

        this.ludoSetting = ludoSetting

        randList = (1..7).map { numb ->
            when (numb) {
                in 1..5 -> List(9) { numb }
                6 -> List((3 - ludoSetting.gameLevel) * 2) { 6 }
                else -> List(Constant.difficulty) { 6 }
            }
        }
            .flatten()
            .shuffled()

        val isHumanPlayer = defaultState.listOfPlayer.lastOrNull()?.isCurrent ?: false
        val colors = defaultState.listOfPlayer.map { it.colors }.flatten().toMutableList()
        if (defaultState.listOfPlayer.size == 2) {
            if (ludoSetting.boardStyle == 2) {
                Collections.swap(colors, 1, 2)
            }

            if (ludoSetting.boardStyle == 1) {
                Collections.swap(colors, 1, 3)
            }
        }

        val pawnss = getGameState().listOfPawn.ifEmpty { Constant.getDefaultOutPawns() }
//        var players = defaultState.listOfPlayer
//        players = players.mapIndexed { index, player ->
//            if (index == players.lastIndex) {
//                player.copyPlayer(name = "Abiola")
//            } else {
//                player
//            }
//
//        }

        setGameState(
            getGameState().copy(
                listOfPlayer = defaultState.listOfPlayer.toMutableList(),
                listOfCounter = defaultState.listOfCounter.toMutableList(),
                listOfPawn = pawnss.toMutableList(),
                listOfDice = defaultState.listOfDice.toMutableList(),
                rotate = ludoSetting.rotate,
                isHumanPlayer = isHumanPlayer,
                board = Board(colors = colors, boardType = ludoSetting.boardType),
                gameType = defaultState.gameType,

                ),
        )

        defaultState.listOfPawn.forEachIndexed { index, pawn ->

            val pawns = getGameState().listOfPawn.toMutableList()
            pawns[index] = pawn
            delay(200)
            setGameState(getGameState().copy(listOfPawn = pawns))
        }
        delay(1000)
        setGameState(getGameState().copy(start = true, rotate = false))
    }


    fun stop() {
        log("stop")
        setGameState(getGameState().copy(start = false))
    }

    suspend open fun restart() {
        log("restart")
        // swap color
        val players = getGameState().listOfPlayer
        val size = players.size
        val mutableList = players.toMutableList()
        players.forEachIndexed { index, player ->
            val next = (index + 1) % size
            val nextPlayer = mutableList[next]
            mutableList[next] = nextPlayer.copyPlayer(colors = player.colors)
        }

        val pawns = Constant.getDefaultPawns(ludoSetting.pawnNumber)
//        if (pawns.all { it.isOut() }) {
//            (0 until pawns.size).forEach {
//                val pawn = pawns[it]
//                pawns[it] = pawn.copy(currentPos = pawn.id * -1)
//            }
//        }

        val state = defaultState.copy(listOfPlayer = mutableList, listOfPawn = pawns)
        start(state, ludoSetting, isGameFinish, onGameFinish)
    }

    // disable for remote game
    suspend fun resign() {
        log("resign")
        // swap color
        val players = getGameState().listOfPlayer

        val mutableList = players.toMutableList()
        players.forEachIndexed { index, player ->

            val noOfWin = if (player is HumanPlayer) player.win else player.win.inc()
            mutableList[index] = player.copyPlayer(win = noOfWin)

            // player.copyPlayer(win = noOfWin)
        }

        val pawns = Constant.getDefaultPawns(ludoSetting.pawnNumber)

        val state = defaultState.copy(listOfPlayer = mutableList, listOfPawn = pawns)
        start(state, ludoSetting, isGameFinish, onGameFinish)
    }

    open suspend fun onDice(dices: IntArray? = null): IntArray? {
        if (getGameState().isOnResume && getGameState().start) {

            val dice1 = dices?.getOrNull(0) ?: randList.random()
            val dice2 = dices?.getOrNull(1) ?: randList.random()

            val rolledDice = intArrayOf(dice1, (dice1 + dice2), dice2)
            val listOfDice = getGameState().listOfDice.toMutableList()

            var newList = listOfDice
                .mapIndexed { index, dice ->
                    dice.copy(isEnable = false, number = rolledDice[index], animate = true)
                }

            soundInterface?.onToss()
            setGameState(getGameState().copy(listOfDice = newList))

            delay(700)

            newList = newList.map {
                it.copy(animate = false)
            }
            setGameState(getGameState().copy(listOfDice = newList))

            val movableDices =
                newList.map { dice ->
                    val canMove = getAllThePawnMovable(dice.number, dice.isTotal).isNotEmpty()
                    Pair(canMove, dice.number)
                }

            if (movableDices.any { it.first }) {
                val listOfCounter =
                    getGameState()
                        .listOfCounter
                        .mapIndexed { index, counter ->
                            counter.copy(
                                isEnable = movableDices[index].first,
                                number = movableDices[index].second
                            )
                        }
                setGameState(getGameState().copy(listOfCounter = listOfCounter))

            } else {
                changePlayer()
            }

            return intArrayOf(dice1, dice2)
        }
        return null
    }

    open fun onCounter(counterId: Int) {

        if (getGameState().isOnResume && getGameState().start) {
            if (getGameState().isHumanPlayer) {
                soundInterface?.onSelect()
            }

            val listOfCounter = getGameState().listOfCounter.toMutableList()
            val isTotal = listOfCounter[counterId].isTotal
            val counterNumber = listOfCounter[counterId].number

            val disableCounters = listOfCounter.map { counter ->

                val number = when {
                    isTotal || counter.isTotal || counter.id == counterId -> 0
                    else -> counter.number
                }

                counter.copy(
                    isEnable = false,
                    number = number
                )
            }
            // get movable pawn and enable

            val movable = getAllThePawnMovable(counterNumber, isTotal)


            if (ludoSetting.assistant && movable.count { it.isEnable } == 1) {
                setGameState(
                    getGameState().copy(
                        listOfCounter = disableCounters,
                        pressedCounterId = counterId
                    )
                )

                onPawn(movable.first().pawnId, false)

            } else {
                val enabledPawn = getGameState()
                    .listOfPawn
                    .map {
                        if (it in movable)
                            it.copy(isEnable = true)
                        else
                            it.copy(isEnable = false)
                    }

                setGameState(
                    getGameState().copy(
                        listOfCounter = disableCounters,
                        pressedCounterId = counterId,
                        listOfPawn = enabledPawn
                    )
                )
            }
        }
    }

    open fun onPawn(id: Int, isDrawer: Boolean) {
        if (getGameState().isOnResume && getGameState().start) {

            var index = getGameState().listOfPawn.indexOfFirst { id == it.pawnId }
            var pawn2 = getGameState().listOfPawn[index]

            val pawnOnSamePos = getCurrentPlayerPawns()
                .filter { getPawnBox(it) == getPawnBox(pawn2) }
            val sameColor = pawnOnSamePos
                .distinctBy { it.color }

            if (getGameState().listOfPawnDrawer != null) {
                setGameState(getGameState().copy(listOfPawnDrawer = null))
            }

            if (pawnOnSamePos.size > 1 && isDrawer.not()) {
                when {
                    sameColor.size > 1 && getGameState().isHumanPlayer -> {
                        // show drawer
                        val drawerPawns = sameColor
                            .map { it.copy(isEnable = true, zIndex = 1f) }

                        setGameState(getGameState().copy(listOfPawnDrawer = drawerPawns))
                        return
                    }

                    sameColor.size > 1 &&
                            getGameState().listOfPlayer.single { it.isCurrent } is OfflinePlayer -> {
                        // it is online player same color
                        log("it is offline do noting")
                        return
                    }

                    else -> {
                        // same color, select upper pawn
                        pawn2 = pawnOnSamePos.filter { it.color == pawn2.color }.maxBy { it.zIndex }

                    }
                }


            }


// disable pawn and set old pawn position z index
            var listPawn = getGameState()
                .listOfPawn
                .toMutableList()
            val listOfEnable = listPawn
                .filter { it.isEnable }
            val pawnInSamePos = listOfEnable
                .filter {getPawnBox(it) == getPawnBox(pawn2) && it != pawn2 }
                .sortedByDescending { it.zIndex }

            val disablePawn = listPawn
                .map {
                    if (it in pawnInSamePos) {
                        val zIndex = pawnInSamePos.indexOf(it) + 1f
                        it.copy(isEnable = false, zIndex = zIndex)
                    } else {
                        it.copy(isEnable = false)
                    }
                }
            listPawn = disablePawn.toMutableList()
            setGameState(getGameState().copy(listOfPawn = disablePawn))


            //move pawn

            if (pawn2.isHome()) {
                soundInterface?.onMoveOut()
                pawn2 = pawn2.copy(currentPos = 0, zIndex = 9f)
                listPawn[index] = pawn2

                setGameState(getGameState().copy(listOfPawn = listPawn))

            } else {
                val numberOnDice = getGameState().currentDiceNumber
                soundInterface?.onMoving()
                pawn2 = pawn2.copy(currentPos = pawn2.currentPos + numberOnDice, zIndex = 9f)
                listPawn[index] = pawn2

                setGameState(getGameState().copy(listOfPawn = listPawn))

            }


            // set new  z index
            val zIndex =
                listPawn
                    .count { getPawnBox(it) == getPawnBox(pawn2) }
            pawn2 = pawn2.copy(zIndex = zIndex.toFloat())
            listPawn[index] = pawn2

            setGameState(getGameState().copy(listOfPawn = listPawn))
            //finished

            // check pawn kill

            val opponentPawns = getOpponentOnPath()

            for (oppoPawn in opponentPawns) {
                if (checkKill(pawn2, oppoPawn)) {
                    val indexOfCounterNotUsed =
                        getGameState().listOfCounter.indexOfFirst { it.number > 0 }
                    // val countFinish = getGameState().listOfCounter.all { it.number==0 }
                    // count finish if index is -1
                    if (indexOfCounterNotUsed == -1) {
                        // kill
                        kill(killer = pawn2, kill = oppoPawn)
                        break
                    } else {
                        val counter = getGameState().listOfCounter[indexOfCounterNotUsed]
                        val secondDiceCanMoveAnyOtherPawn =
                            getAllThePawnMovable(counter.number, counter.isTotal)
                                .any { it != pawn2 }

                        if (secondDiceCanMoveAnyOtherPawn) {
                            // kill
                            kill(killer = pawn2, kill = oppoPawn)
                            break
                        }
                    }
                }
            }


            // check one player win
            val currentPlayerPawn = getCurrentPlayerPawns()

            // val isAllOut = allPlayerPawn.all { it.isOut() }
            if (isGameFinish(currentPlayerPawn)) {
                // increase player win
                val players = getGameState().listOfPlayer.toMutableList()
                val indexOfPlayer = players.indexOfFirst { it.isCurrent }
                // if (players[indexOfPlayer] is HumanPlayer) {
                val p = players[indexOfPlayer]
                players[indexOfPlayer] = p.copyPlayer(win = p.win + 1)

                // p.copyPlayer(win = p.win + 1)
                if (p is HumanPlayer) soundInterface?.onWin() else soundInterface?.onLost()

                setGameState(
                    getGameState().copy(
                        listOfPlayer = players,
                        listOfPawn = Constant.getDefaultOutPawns(),
                    ),
                )
//            }
//            else {
//              val p=  players[indexOfPlayer] as RandomComputerPlayer
//                players[indexOfPlayer]=p.copy(win = p.win+1)
//
//                setGameState(getGameState().copy(listOfPlayer = players,
//                listOfPawn = getInitGameState().listOfPawn))
//            }

                onGameFinish()
            } else {
                val index2 = getGameState().listOfCounter.indexOfFirst { it.number != 0 }

                // check if player has count finish
                if (index2 == -1) {
                    // finish counting
                    // counter change player

                    changePlayer()
                } else {
                    // enable second counter

                    val counter = getGameState().listOfCounter[index2]
                    val isSecondCanMoveAnyPawn =
                        getAllThePawnMovable(counter.number, counter.isTotal).isNotEmpty()
                    // if second can move any pawn
                    if (isSecondCanMoveAnyPawn) {
                        val listOfCounter = getGameState().listOfCounter.toMutableList()
                        listOfCounter[index2] = counter.copy(isEnable = true)
                        setGameState(getGameState().copy(listOfCounter = listOfCounter))
                    } else {
                        changePlayer()
                    }
                }
            }

        }
    }

    private fun getPawnBox(pawn: Pawn): Point {
        return getGameState().board.getBoxByIndex(pawn.currentPos, pawn.color)
    }


    private fun checkKill(originalPawn: Pawn, pawn: Pawn): Boolean {
        return getPawnBox(originalPawn) == getPawnBox(pawn)
    }

    protected open fun kill(killer: Pawn, kill: Pawn) {
        log("kill $killer, with $kill")
        soundInterface?.onKill()
        val pawnList = getGameState().listOfPawn.toMutableList()

        val originalIndex = pawnList.indexOf(killer)
        val index = pawnList.indexOf(kill)

        // change to search by box position
        val zIndex = getGameState().listOfPawn.count { it.isOut() }

        println("zindex is $zIndex")

        pawnList[originalIndex] =
            killer.copy(currentPos = 56, zIndex = zIndex.toFloat())
        pawnList[index] = kill.copy(currentPos = kill.colorNumber * -1, zIndex = 1f)

        setGameState(getGameState().copy(listOfPawn = pawnList))
    }

    protected open fun changePlayer() {
        // set new current player
        val size = getGameState().listOfPlayer.size
        val indexOfCurrentPlayer = getGameState().listOfPlayer.indexOfFirst { it.isCurrent }

        // having double six
        val isHavingDoubleSix =
            getGameState().listOfDice.filter { !it.isTotal }.all { it.number == 6 }

        val nextPlayer = if (isHavingDoubleSix) indexOfCurrentPlayer else indexOfCurrentPlayer + 1

        val newCurrent = nextPlayer % size

        log("change Player: new player index $newCurrent")
        val listOfPlayer = getGameState().listOfPlayer.toMutableList()

        repeat(listOfPlayer.size) {
            val player = listOfPlayer[it]
            listOfPlayer[it] = player.copyPlayer(isCurrent = false)
        }

        val isHuman = listOfPlayer[newCurrent] is HumanPlayer
        val player = listOfPlayer[newCurrent]
        listOfPlayer[newCurrent] = player.copyPlayer(isCurrent = true)

        // enable dice

        val listOfDice = getGameState().listOfDice.toMutableList()

        repeat(listOfDice.size) {
            listOfDice[it] = listOfDice[it].copy(isEnable = true)
        }

        setGameState(
            getGameState().copy(
                listOfPlayer = listOfPlayer,
                listOfDice = listOfDice,
                isHumanPlayer = isHuman,
            ),
        )

        onPlayerFinishPlaying()
    }


    private fun canPawnMove(pawn: Pawn, diceNum: Int, isTotal: Boolean): Boolean {

        return when {
            //home logic
            pawn.isHome() -> {
                !isTotal && diceNum == 6
            }

            !pawn.isOut() -> {
                (pawn.currentPos + diceNum) <= 56
            }

            else -> false
        }

    }

    private fun getAllThePawnMovable(currentNumberSelected: Int, isTotal: Boolean): List<Pawn> {
        val pairOfPairDiceCanMoveAndOnPath =
            getCurrentPlayerPawns()
        return pairOfPairDiceCanMoveAndOnPath
            .filter { canPawnMove(it, currentNumberSelected, isTotal) }
    }


    private fun getOpponentOnPath(): List<Pawn> {
        val currentPlayerPawn = getCurrentPlayerPawns()

        return getGameState().listOfPawn
            .filter { it !in currentPlayerPawn && it.isOnPath() }
            .sortedByDescending { it.zIndex }
    }

    private fun getCurrentPlayerPawns(): List<Pawn> {
        val colorOfCurrentPlayer =
            getGameState().listOfPlayer.find { it.isCurrent }!!.colors
        return getGameState().listOfPawn.filter { colorOfCurrentPlayer.contains(it.color) }
            .distinct()
    }


    fun getPositionIntOffset(id: Int, gameColor: GameColor): Point {
        return getGameState().board.getBoxByIndex(id, gameColor)
    }

    open fun resume() {
        log("resume")
        setGameState(getGameState().copy(isOnResume = true))
    }

    open fun pause() {
        log("pause")
        setGameState(getGameState().copy(isOnResume = false))
    }

    // on Computer player

    suspend fun onStateChange() {
        gameState
            .distinctUntilChanged { old, new -> old == new }
            .onEach { delay(computerDelay) }
            .buffer()
            .collect {
                log("state changed $it")
                when (getGameState().gameType) {
                    GameType.COMPUTER -> onComputer(it)
                    else -> {}
                }
            }
    }

    // Computer logic
    private suspend fun onComputer(ludoGameState: LudoGameState) {
        log("onGameStateChange $ludoGameState")

//        val isHuman = gameUiState.ludoGameState.listOfPlayer.single { it.isCurrent } is HumanPlayer
        if (ludoGameState.isOnResume && ludoGameState.start) {
            when {
                ludoGameState.listOfDice.first().isEnable -> {
                    onComputerRoll(ludoGameState)
                }

                ludoGameState.listOfCounter.any { it.isEnable } -> {
                    onComputerCounter(ludoGameState)
                }

                ludoGameState.listOfPawn.any { it.isEnable } -> {
                    onComputerPawn(ludoGameState)
                }
            }
        }
    }

    private suspend fun onComputerRoll(ludoGameState: LudoGameState) {
        val currentPlayer = ludoGameState.listOfPlayer.single { it.isCurrent }

        if (currentPlayer is RandomComputerPlayer) {
            log("OnComputerRoll $currentPlayer $ludoGameState")

            onDice()
        }
    }

    private fun onComputerCounter(ludoGameState: LudoGameState) {
        val currentPlayer = ludoGameState.listOfPlayer.single { it.isCurrent }

        if (currentPlayer is RandomComputerPlayer) {
            log("onComputerCounter $currentPlayer $ludoGameState")
            val counter = currentPlayer.chooseCounter(ludoGameState)

            onCounter(counter)
        }
    }

    private fun onComputerPawn(ludoGameState: LudoGameState) {
        val currentPlayer = ludoGameState.listOfPlayer.single { it.isCurrent }

        if (currentPlayer is RandomComputerPlayer) {
            val pawnId = currentPlayer.choosePawn(ludoGameState)

            log("onComputerPawn $currentPlayer $pawnId")
            onPawn(pawnId, false)
        }
    }


}
