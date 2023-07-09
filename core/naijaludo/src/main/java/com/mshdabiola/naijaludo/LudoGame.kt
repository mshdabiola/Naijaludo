package com.mshdabiola.naijaludo

import com.mshdabiola.naijaludo.model.Board
import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.naijaludo.model.Constant.getDiceBox
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

class LudoGame(private val soundInterface: SoundInterface? = null) {
    private val numberOfDice = 3
    private val totalIndex = numberOfDice / 2
    private lateinit var defaultState: LudoGameState

    private lateinit var isGameFinish: (List<Pawn>) -> Boolean

    private lateinit var onGameFinish: () -> Unit

    private var onPlayerFinishPlaying: () -> Unit = {}

    private val _gameState = MutableStateFlow(LudoGameState(board = Board(colors = emptyList())))

    val gameState = _gameState.asStateFlow()

    private val computerDelay = 500L

    private var ludoSetting: Setting = Setting()

    private fun setGameState(gameState: LudoGameState) {
        log("update game state ${gameState.listOfPawn}")
        _gameState.update {
            gameState
        }
    }

    private fun getGameState() = gameState.value

    // start  game function
    suspend fun start(
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
        var players = defaultState.listOfPlayer
        players = players.mapIndexed { index, player ->
            if (index == players.lastIndex) {
                player.copyPlayer(name = ludoSetting.playerName[0])
            } else {
                player.copyPlayer(name = ludoSetting.playerName[index + 1])
            }

        }

        setGameState(
            getGameState().copy(
                listOfPlayer = players,
                listOfCounter = defaultState.listOfCounter,
                listOfPawn = pawnss,
                listOfDice = defaultState.listOfDice,
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

//    fun setGameToDefault() {
//        val ludo=LudoGameState(board = Board(colors = emptyList()))
//        _gameState.value =gameState.value.copy(
//            listOfPlayer = ludo.listOfPlayer,
//            listOfCounter = ludo.listOfCounter,
//            listOfPawn = ludo.listOfPawn,
//            listOfDice = ludo.listOfDice
//        )
//
//    }

    fun stop() {
        log("stop")
        setGameState(getGameState().copy(start = false))
    }

    suspend fun restart() {
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

    fun resume() {
        log("resume")
        setGameState(getGameState().copy(isOnResume = true))
    }

    fun pause() {
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

    suspend fun onDice(dices: IntArray? = null): IntArray? {
        if (getGameState().isOnResume && getGameState().start) {
            log("on dice")
            soundInterface?.onToss()
            // disable dice and set toss number
            val listDice = gameState.value.listOfDice.toMutableList()
            repeat(listDice.size) {
                val dice = listDice[it]
                if (dice.isTotal) {
                    // for total dice
                    listDice[it] = dice.copy(isEnable = false, number = 0)
                } else {
                    // set toss for all dices
                    listDice[it] = dice.copy(isEnable = false, animate = true, number = 0)
                }
            }
            // set total dice with total dice

            setGameState(gameState = gameState.value.copy(listOfDice = listDice))

            delay(700)
            return onDiceFinish(dices = dices)
        } else {
            log("on dice pause")
        }
        return null
    }

    private fun onDiceFinish(dices: IntArray? = null): IntArray? {
        var intArray: IntArray = IntArray(3)
        // disable animate
        log("on dice finish")
        val diceList = getGameState().listOfDice.toMutableList()
        repeat(diceList.size) {
            val dice = diceList[it]
            if (!dice.isTotal) {
                diceList[it] = diceList[it].copy(
                    animate = false,
                    number = if (dices == null) {
                        val diceRoll = getDiceNumber()
                        intArray[it] = diceRoll
                        diceRoll
                    } else {
                        dices[it]
                    },
                )
            } else {
                diceList[it] = diceList[it].copy(animate = false, number = 0)
            }
        }
        diceList[totalIndex] = diceList[totalIndex].copy(number = diceList.sumOf { it.number })

        setGameState(getGameState().copy(listOfDice = diceList))

        // get dice value that can move pawn
        val useableDice = getGameState().listOfDice
            .map {
                val canMove = getAllThePawnMovable(it.number, it.isTotal).isNotEmpty()
//                val canMove = if (!it.isTotal) {
//                    getAllThePawnMovable(it.number)
//                        .isNotEmpty()
//                } else {
//                    val all = getAllThePawnMovable(it.number).filter { !it.isHome() }
//                    all.isNotEmpty()
//                }
                Pair(it, canMove)
            }

        val isAnyOneMovable = useableDice.any {
            it.second
        }

        // player cannot move any  pawn
        if (isAnyOneMovable) {
            // enable counter and set number
            val listCounter = gameState.value.listOfCounter.toMutableList()

            useableDice.forEachIndexed { index, (dice, canMove) ->

                listCounter[index] = listCounter[index].copy(
                    isEnable = canMove,
                    number = dice.number,
                )
            }

            setGameState(gameState = gameState.value.copy(listOfCounter = listCounter))
        } else {
            // nextPlayer and toss

            changePlayer()
        }
        return intArray
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

    fun onCounter(counterId: Int) {
        if (getGameState().isOnResume && getGameState().start) {
            if (getGameState().isHumanPlayer) {
                soundInterface?.onSelect()
            }
            // disable all counter
            val listOfCounterMutable = getGameState().listOfCounter.toMutableList()
            val counter = listOfCounterMutable[counterId]
            log("Counter $counter")
            repeat(listOfCounterMutable.size) {
                listOfCounterMutable[it] =
                    listOfCounterMutable[it].copy(isEnable = false)
            }

            if (counter.isTotal) {
                // if is middle index total change all to 0
                repeat(listOfCounterMutable.size) {
                    listOfCounterMutable[it] =
                        listOfCounterMutable[it].copy(number = 0)
                }
            } else {
                // else change the index to 0 and total

                val index = getGameState().listOfCounter.indexOfFirst { it === counter }
                listOfCounterMutable[totalIndex] =
                    listOfCounterMutable[totalIndex].copy(number = 0)
                listOfCounterMutable[index] =
                    listOfCounterMutable[index].copy(number = 0)
            }

            // get movable pawn and enable

            val allMovablePawns = getAllThePawnMovable(counter.number, counter.isTotal)
//                if (counter.number == 6 && counter.isTotal) {
//                val filterHome = getAllThePawnMovable(counter.number).filter { !it.isHome() }
//                filterHome
//            } else {
//                getAllThePawnMovable(counter.number)
//            }

            val allPawnsMutableList = getGameState().listOfPawn.toMutableList()

            if (ludoSetting.assistant && allMovablePawns.size == 1) {
                setGameState(
                    getGameState().copy(
                        listOfCounter = listOfCounterMutable,
                        pressedCounterId = counterId,
                    ),
                )
                val pawn = allPawnsMutableList.first { it == allMovablePawns.first() }
                log("assist $pawn ${pawn.indexx}")
                val pawnIndex = getGameState().listOfPawn.indexOfFirst { it.idx == pawn.idx }
                onPawnNormal(pawnIndex)
            } else {
                repeat(allPawnsMutableList.size) {
                    val pawn = allPawnsMutableList[it]
                    if (pawn in allMovablePawns) {
                        allPawnsMutableList[it] = pawn.copy(isEnable = true)
                    } else {
                        allPawnsMutableList[it] = pawn.copy(isEnable = false)
                    }
                }

                setGameState(
                    getGameState().copy(
                        listOfCounter = listOfCounterMutable,
                        listOfPawn = allPawnsMutableList,
                        pressedCounterId = counterId,
                    ),
                )
            }
        } else {
            log("Counter $counterId pause")
        }
    }

    // on pawn 2
    private fun onPawnDrawer(pawwnIndx: Int) {
        log("colorId is $pawwnIndx ${getGameState().listOfPawnDrawer}")
        val pawn = getGameState().listOfPawn[pawwnIndx]
        // listOfPawnDrawer!!.single { it.idx == idx }
        val selectedPawn = getCurrentPlayerPawns()
            .filter {
                getPawnBox(it) == getPawnBox(pawn) &&

                        it.color == pawn.color
            }
            .maxBy { it.zIndex }

        setGameState(getGameState().copy(listOfPawnDrawer = null))
        val pawnIndex = getGameState().listOfPawn.indexOfFirst { it.idx == selectedPawn.idx }
        onPawnLogic(pawnIndex)
    }

    // on pawn 1
    fun onPawn(id: Int, isDrawer: Boolean) {
        val pawnIndex = getGameState().listOfPawn.indexOfFirst { it.idx == id }
        if (isDrawer) {
            onPawnDrawer(id)
        } else {
            if (getGameState().listOfPawnDrawer != null) {
                setGameState(getGameState().copy(listOfPawnDrawer = null))
            }

            onPawnNormal(pawnIndex)
        }
    }

    // on pawn 2
    private fun onPawnNormal(pawnIndex: Int) {
        val pawn = getGameState().listOfPawn[pawnIndex]
        val pawnOnSamePos = getCurrentPlayerPawns()
            .filter { getPawnBox(it) == getPawnBox(pawn) }

        if (pawnOnSamePos.size > 1) {
            val sameColor = pawnOnSamePos
                .distinctBy { it.color }

            // different color
            if (sameColor.size > 1 && getGameState().isHumanPlayer) {
                // show drawer
                val drawerPawns = sameColor
                    .map { it.copy(isEnable = true, zIndex = 1f) }

                setGameState(getGameState().copy(listOfPawnDrawer = drawerPawns))
            } else if (sameColor.size > 1 &&
                getGameState().listOfPlayer.single { it.isCurrent } is OfflinePlayer
            ) {
                log("it is offline do noting")
            } else {
                // same color, select upper pawn
                val upperPawn = pawnOnSamePos.filter { it.color == pawn.color }.maxBy { it.zIndex }
                val upperIndex = getGameState().listOfPawn.indexOfFirst { it.idx == upperPawn.idx }
                onPawnLogic(upperIndex)
            }
        } else {
            onPawnLogic(pawnIndex)
        }
    }

    // on pawn 3
    private fun onPawnLogic(pawnIndex: Int) {
        if (getGameState().isOnResume && getGameState().start) {
            var pawn = getGameState().listOfPawn[pawnIndex]
            log("on pawn logic $pawn")

            // disable pawn and set old pawn position z index
            val listPawn = getGameState()
                .listOfPawn
                .toMutableList()

            val listOfEnable = listPawn
                .filter { it.isEnable }

            val pawnInSamePos = listOfEnable
                .filter { getPawnBox(it) == getPawnBox(pawn) && it != pawn }
                .sortedByDescending { it.zIndex }

            repeat(listPawn.size) { index ->
                when (
                    val onePawn = listPawn[index]
                ) {
                    in pawnInSamePos -> {
                        val zIndex = pawnInSamePos.indexOf(onePawn) + 1f
                        listPawn[index] = onePawn.copy(isEnable = false, zIndex = zIndex)
                    }

                    in listOfEnable -> {
                        listPawn[index] = onePawn.copy(isEnable = false)
                    }
                }
            }
            setGameState(getGameState().copy(listOfPawn = listPawn))

            // move pawn
            pawn = getGameState().listOfPawn[pawnIndex]
            val numberOnDice = getGameState().currentDiceNumber

            if (pawn.isHome()) {
                soundInterface?.onMoveOut()

                pawn = pawn.copy(currentPos = 0, zIndex = 9f)

                listPawn[pawnIndex] = pawn
                setGameState(getGameState().copy(listOfPawn = listPawn))
            } else {
                // repeat(numberOnDice) {

                soundInterface?.onMoving()
                pawn = pawn.copy(currentPos = pawn.currentPos + numberOnDice, zIndex = 9f)

                listPawn[pawnIndex] = pawn

                setGameState(getGameState().copy(listOfPawn = listPawn))
                // }
            }

            onPawnFinish(pawnIndex)
        }
    }

    // on pawn 4
    private fun onPawnFinish(pawnIndex: Int) {
        val mutableListOfPawns = getGameState().listOfPawn.toMutableList()
        val pawn = mutableListOfPawns[pawnIndex]
        log("on Pawn finish $pawn")

        // set new  z index
        val zIndex =
            mutableListOfPawns
                .count { getPawnBox(it) == getPawnBox(pawn) }

        val pawnCopy = pawn.copy(zIndex = zIndex.toFloat())

        mutableListOfPawns[pawnIndex] = pawnCopy

        log("sent ${mutableListOfPawns.joinToString()}")
        setGameState(getGameState().copy(listOfPawn = mutableListOfPawns)) // finish

        // check pawn kill

        val opponentPawns = getOpponentOnPath()

        for (oppoPawn in opponentPawns) {
            if (checkKill(pawnCopy, oppoPawn)) {
                val indexOfCounterNotUsed =
                    getGameState().listOfCounter.indexOfFirst { it.number > 0 }
                // val countFinish = getGameState().listOfCounter.all { it.number==0 }
                // count finish if index is -1
                if (indexOfCounterNotUsed == -1) {
                    // kill
                    kill(pawnCopy, oppoPawn)
                    break
                } else {
                    val counter = getGameState().listOfCounter[indexOfCounterNotUsed]
                    val secondDiceCanMoveAnyOtherPawn =
                        getAllThePawnMovable(counter.number, counter.isTotal).any { it != pawnCopy }

                    if (secondDiceCanMoveAnyOtherPawn) {
                        // kill
                        kill(pawnCopy, oppoPawn)
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
            val index = getGameState().listOfCounter.indexOfFirst { it.number != 0 }

            // check if player has count finish
            if (index == -1) {
                // finish counting
                // counter change player

                changePlayer()
            } else {
                // enable second counter

                val counter = getGameState().listOfCounter[index]
                val isSecondCanMoveAnyPawn =
                    getAllThePawnMovable(counter.number, counter.isTotal).isNotEmpty()
                // if second can move any pawn
                if (isSecondCanMoveAnyPawn) {
                    val listOfCounter = getGameState().listOfCounter.toMutableList()
                    listOfCounter[index] = counter.copy(isEnable = true)
                    setGameState(getGameState().copy(listOfCounter = listOfCounter))
                } else {
                    changePlayer()
                }
            }
        }
        log("finish on pawn finish")
    }

    private fun changePlayer() {
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

    private fun checkKill(originalPawn: Pawn, pawn: Pawn): Boolean {
        return getPawnBox(originalPawn) == getPawnBox(pawn)
    }

    private fun kill(originalPawn: Pawn, pawn: Pawn) {
        log("kill $originalPawn, with $pawn")
        soundInterface?.onKill()
        val pawnList = getGameState().listOfPawn.toMutableList()

        val originalIndex = pawnList.indexOf(originalPawn)
        val index = pawnList.indexOf(pawn)

        // change to search by box position
        val zIndex = getGameState().listOfPawn.count { it.isOut() }

        println("zindex is $zIndex")

        pawnList[originalIndex] =
            originalPawn.copy(currentPos = 56, zIndex = zIndex.toFloat())
        pawnList[index] = pawn.copy(currentPos = pawn.indexx * -1, zIndex = 1f)

        setGameState(getGameState().copy(listOfPawn = pawnList))
    }

    private fun getOpponentOnPath(): List<Pawn> {
        val currentPlayerPawn = getCurrentPlayerPawns()

        return getGameState().listOfPawn
            .filter { it !in currentPlayerPawn && it.isOnPath() }
            .sortedByDescending { it.zIndex }
    }

    private fun getAllThePawnMovable(currentNumberSelected: Int, isTotal: Boolean): List<Pawn> {
        val pairOfPairDiceCanMoveAndOnPath =
            getCurrentPlayerPawns()
        return pairOfPairDiceCanMoveAndOnPath
            .filter { canPawnMove(it, currentNumberSelected, isTotal) }
//            // get pawn that is out
//            // get pawn that is in range of counter distance
//            .filter { !it.isHome() && currentNumberSelected in 1..it.getDistanceRemain() }
//            .toMutableList()
//
//        if (currentNumberSelected == 6 && getCurrentPlayerPawns().any { it.isHome() }) {
//            val list2 = getCurrentPlayerPawns()
//                .filter { it.isHome() }
//
//            pairOfPairDiceCanMoveAndOnPath.addAll(list2)
//        }
//
//        return pairOfPairDiceCanMoveAndOnPath.distinct()
    }

    private fun getDiceNumber(): Int {
        return getDiceBox(ludoSetting.gameLevel).random()
    }

    private fun getCurrentPlayerPawns(): List<Pawn> {
        val colorOfCurrentPlayer =
            getGameState().listOfPlayer.find { it.isCurrent }!!.colors
        return getGameState().listOfPawn.filter { colorOfCurrentPlayer.contains(it.color) }
            .distinct()
    }

    private fun getPawnBox(pawn: Pawn) =
        getGameState().board.getBoxByIndex(pawn.currentPos, pawn.color)

    fun getPositionIntOffset(id: Int, gameColor: GameColor): Point {
        return getGameState().board.getPositionIntPoint(id, gameColor)
    }


}
