package com.mshdabiola.naijaludo

import com.mshdabiola.naijaludo.state.Board
import com.mshdabiola.naijaludo.state.Counter
import com.mshdabiola.naijaludo.state.Dice
import com.mshdabiola.naijaludo.state.Drawer
import com.mshdabiola.naijaludo.state.GameColor
import com.mshdabiola.naijaludo.state.LudoGameState
import com.mshdabiola.naijaludo.state.Pawn
import com.mshdabiola.naijaludo.state.player.ComputerPlayer
import com.mshdabiola.naijaludo.state.player.HumanPlayer
import com.mshdabiola.naijaludo.state.player.RandomComputerPlayer
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.onEach

class LudoGame {

    private lateinit var defaultState: LudoGameState

    private lateinit var isGameFinish: (List<Pawn>) -> Boolean

    private lateinit var onGameFinish: () -> Unit

    private val _gameState = MutableStateFlow(LudoGameState())

    val gameState = _gameState.asStateFlow()

    val computerDelay =500L

    private fun setGameState(gameState: LudoGameState) {
        _gameState.value = gameState
    }

    private fun getGameState() = gameState.value


    // start  game function
    suspend fun start(
        ludoGameState: LudoGameState? = null,
        isGameFinish: (List<Pawn>) -> Boolean = { currentPlayerPawn ->

            currentPlayerPawn.all { it.isOut() }
        },
        onGameFinish: () -> Unit
    ) {

        log("start")

        defaultState = ludoGameState ?: getDefaultGameState()
        this.onGameFinish = onGameFinish
        this.isGameFinish = isGameFinish

        val isHumanPlayer = defaultState.listOfPlayer.single { it.isCurrent } is HumanPlayer
        val colors = defaultState.listOfPlayer.map { it.colors }.flatten()

        val pawnss= getGameState().listOfPawn.ifEmpty { getInitGameState().listOfPawn }

        setGameState(
            getGameState().copy(
                listOfPlayer = defaultState.listOfPlayer,
                listOfCounter = defaultState.listOfCounter,
                listOfPawn = pawnss,
                listOfDice = defaultState.listOfDice,
                rotate = true,
                isHumanPlayer = isHumanPlayer,
                board = Board(colors = colors)

            )
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

    suspend fun restart() {
        log("restart")
        //swap color
        val players = getGameState().listOfPlayer
        val size = players.size
        val mutableList = players.toMutableList()
        players.forEachIndexed { index, player ->
            val next = (index + 1) % size
            val newNextPlayer = when (val nextPlayer = mutableList[next]) {
                is HumanPlayer -> nextPlayer.copy(colors = player.colors)
                is RandomComputerPlayer -> nextPlayer.copy(colors = player.colors)
            }
            mutableList[next] = newNextPlayer

        }




        val state = defaultState.copy(listOfPlayer = mutableList)
        start(state, isGameFinish, onGameFinish)

    }

    fun resume() {
        log("resume")
        setGameState(getGameState().copy(isOnResume = true))
    }

    fun pause() {
        log("pause")
        setGameState(getGameState().copy(isOnResume = false))
    }

    private fun getInitGameState(): LudoGameState {

        val listPawns = ArrayList<Pawn>()

        GameColor.values().forEach { gameColor ->
            (1..4).forEach { id ->
                listPawns.add(Pawn(id = id, color = gameColor, currentPos = 56))
            }
        }

        val listOfPlayers = listOf(
            HumanPlayer(
                isCurrent = true,
                colors = listOf(GameColor.values()[0], GameColor.values()[1])
            ),
            RandomComputerPlayer(colors = listOf(GameColor.values()[2], GameColor.values()[3]))
        )

        val listOfCounter =
            (0 until numberOfDice).map { if (it == totalIndex) Counter(isTotal = true, id = it) else Counter(id = it) }
        val listOfDices =
            (0 until numberOfDice).map {
                if (it == totalIndex) Dice(isTotal = true, id = it) else Dice(
                    isEnable = true,
                    id = it
                )
            }

        return LudoGameState(
            listOfPlayer = listOfPlayers,
            listOfDice = listOfDices,
            listOfPawn = listPawns,
            listOfCounter = listOfCounter
        )
    }

    //on Computer player

    suspend fun onStateChange() {
        gameState
            .distinctUntilChanged { old, new -> old == new }
            .onEach { delay(computerDelay) }
            .buffer()
            .collect {

                onComputer(it)

            }
    }

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

        if (currentPlayer is ComputerPlayer) {

            log("OnComputerRoll $currentPlayer $ludoGameState")

            onDice()
        }


    }

    private fun onComputerCounter(ludoGameState: LudoGameState) {
        val currentPlayer = ludoGameState.listOfPlayer.single { it.isCurrent }

        if (currentPlayer is ComputerPlayer) {

            log("onComputerCounter $currentPlayer $ludoGameState")
            val counter = currentPlayer.chooseCounter(ludoGameState)

            onCounter(counter)
        }

    }


    private fun onComputerPawn(ludoGameState: LudoGameState) {
        val currentPlayer = ludoGameState.listOfPlayer.single { it.isCurrent }

        if (currentPlayer is ComputerPlayer) {


            val pawn = currentPlayer.choosePawn(ludoGameState)

            log("onComputerPawn $currentPlayer $pawn")
            onPawn(pawn.index, false)
        }

    }


    // on ludo click function

    suspend fun onDice() {
        if (getGameState().isOnResume && getGameState().start) {
            log("on dice")
            //disable dice and set toss number
            val listDice = gameState.value.listOfDice.toMutableList()
            repeat(listDice.size) {
                val dice = listDice[it]
                if (dice.isTotal) {
                    //for total dice
                    listDice[it] = dice.copy(isEnable = false, number = 0)
                } else {
                    //set toss for all dices
                    listDice[it] = dice.copy(isEnable = false, animate = true, number = 0)
                }

            }
            //set total dice with total dice


            setGameState(gameState = gameState.value.copy(listOfDice = listDice))

            delay(700)
            onDiceFinish()

        } else {
            log("on dice pause")
        }
    }

    private fun onDiceFinish() {

        //disable animate
        log("on dice finish")
        val diceList = getGameState().listOfDice.toMutableList()
        repeat(diceList.size) {
            val dice = diceList[it]
            if (!dice.isTotal) {
                diceList[it] = diceList[it].copy(animate = false, number = getDiceNumber())
            } else {
                diceList[it] = diceList[it].copy(animate = false, number = 0)
            }

        }
        diceList[totalIndex] = diceList[totalIndex].copy(number = diceList.sumOf { it.number })

        setGameState(getGameState().copy(listOfDice = diceList))

        // get dice value that can move pawn
        val useableDice = getGameState().listOfDice
            .map {
                val canMove = if (!it.isTotal) {
                    getAllThePawnMovable(it.number)
                        .isNotEmpty()
                } else {
                    val all = getAllThePawnMovable(it.number).filter { !it.isHome() }
                    all.isNotEmpty()
                }
                Pair(it, canMove)
            }


        val isAnyOneMovable = useableDice.any {
            it.second
        }

        //player cannot move any  pawn
        if (isAnyOneMovable) {
            //enable counter and set number
            val listCounter = gameState.value.listOfCounter.toMutableList()

            useableDice.forEachIndexed { index, (dice, canMove) ->

                listCounter[index] = listCounter[index].copy(
                    isEnable = canMove,
                    number = dice.number
                )

            }


            setGameState(gameState = gameState.value.copy(listOfCounter = listCounter))
        } else {
            //nextPlayer and toss

            changePlayer()

        }

    }


    fun onCounter(counterId: Int) {
        if (getGameState().isOnResume && getGameState().start) {

            //disable all counter
            val listOfCounterMutable = getGameState().listOfCounter.toMutableList()
            val counter = listOfCounterMutable[counterId]
            log("Counter $counter")
            repeat(listOfCounterMutable.size) {
                listOfCounterMutable[it] =
                    listOfCounterMutable[it].copy(isEnable = false)
            }

            if (counter.isTotal) {
                //if is middle index total change all to 0
                repeat(listOfCounterMutable.size) {
                    listOfCounterMutable[it] =
                        listOfCounterMutable[it].copy(number = 0)
                }
            } else {
                //else change the index to 0 and total


                val index = getGameState().listOfCounter.indexOfFirst { it === counter }
                listOfCounterMutable[totalIndex] =
                    listOfCounterMutable[totalIndex].copy(number = 0)
                listOfCounterMutable[index] =
                    listOfCounterMutable[index].copy(number = 0)
            }

            //get movable pawn and enable

            val allMovablePawns = if (counter.number == 6 && counter.isTotal) {
                val filterHome = getAllThePawnMovable(counter.number).filter { !it.isHome() }
                filterHome

            } else {
                getAllThePawnMovable(counter.number)

            }


            val allPawnsMutableList = getGameState().listOfPawn.toMutableList()


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
                    pressedCounterId = counterId
                )
            )
        } else {
            log("Counter $counterId pause")
        }
    }

    //on pawn 2
    private fun onPawnDrawer(index: Int) {
        val pawn = getGameState().drawer!!.pawns[index]
        val selectedPawn = getCurrentPlayerPawns()
            .filter {
                getPawnBox(it) == getPawnBox(pawn)

                        && it.color == pawn.color
            }
            .maxBy { it.zIndex }

        setGameState(getGameState().copy(drawer = null))
        onPawnLogic(selectedPawn.index)

    }

    //on pawn 1
    fun onPawn(index: Int, isDrawer: Boolean) {
        if (isDrawer) {
            onPawnDrawer(index)
        } else {
            onPawnNormal(index)
        }
    }

    //on pawn 2
    private fun onPawnNormal(pawnIndex: Int) {

        val pawn = getGameState().listOfPawn[pawnIndex]
        val pawnOnSamePos = getCurrentPlayerPawns()
            .filter { getPawnBox(it) == getPawnBox(pawn) }


        if (pawnOnSamePos.size > 1) {
            val sameColor = pawnOnSamePos
                .distinctBy { it.color }

            //different color
            if (sameColor.size > 1 && getGameState().isHumanPlayer) {
                //show drawer
                val pawns = sameColor
                    .map { it.copy(isEnable = true, zIndex = 1f) }

                val drawer = Drawer(pawns)

                setGameState(getGameState().copy(drawer = drawer))

            } else {
                //same color, select upper pawn
                val upperPawn = pawnOnSamePos.filter { it.color == pawn.color }.maxBy { it.zIndex }
                onPawnLogic(upperPawn.index)
            }
        } else {
            onPawnLogic(pawnIndex)
        }


    }

    //on pawn 3
    private fun onPawnLogic(pawnIndex: Int) {


        if (getGameState().isOnResume && getGameState().start) {
            var pawn = getGameState().listOfPawn[pawnIndex]
            log("on pawn $pawn")

            //disable pawn and set old pawn position z index
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
                    val onePawn = listPawn[index]) {
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

            //move pawn
            pawn = getGameState().listOfPawn[pawnIndex]
            val numberOnDice = getGameState().currentDiceNumber

            if (pawn.isHome()) {
                pawn = pawn.copy(currentPos = 0, zIndex = 9f)

                listPawn[pawnIndex] = pawn
                setGameState(getGameState().copy(listOfPawn = listPawn))
            } else {
                repeat(numberOnDice) {

                    pawn = pawn.copy(currentPos = pawn.currentPos + 1, zIndex = 9f)

                    listPawn[pawnIndex] = pawn

                    setGameState(getGameState().copy(listOfPawn = listPawn))
                }
            }


            onPawnFinish(pawnIndex)

        }
    }

    //on pawn 4
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

        setGameState(getGameState().copy(listOfPawn = mutableListOfPawns)) //finish

        //check pawn kill

        val opponentPawns = getOpponentOnPath()

        for (oppoPawn in opponentPawns) {
            if (checkKill(pawnCopy, oppoPawn)) {
                val indexOfCounterNotUsed =
                    getGameState().listOfCounter.indexOfFirst { it.number > 0 }
                //val countFinish = getGameState().listOfCounter.all { it.number==0 }
                //count finish if index is -1
                if (indexOfCounterNotUsed == -1) {
                    //kill
                    kill(pawnCopy, oppoPawn)
                    break

                } else {
                    val number = getGameState().listOfCounter[indexOfCounterNotUsed].number
                    val secondDiceCanMoveAnyOtherPawn =
                        getAllThePawnMovable(number).any { it != pawnCopy }

                    if (secondDiceCanMoveAnyOtherPawn) {
                        //kill
                        kill(pawnCopy, oppoPawn)
                        break
                    }
                }

            }

        }

        //check one player win
        val currentPlayerPawn = getCurrentPlayerPawns()

        // val isAllOut = allPlayerPawn.all { it.isOut() }
        if (isGameFinish(currentPlayerPawn)) {

            //increase player win
            val players = getGameState().listOfPlayer.toMutableList()
            val indexOfPlayer = players.indexOfFirst { it.isCurrent }
            if (players[indexOfPlayer] is HumanPlayer) {
                val p = players[indexOfPlayer] as HumanPlayer
                players[indexOfPlayer]=p.copy(win = p.win+1)

                setGameState(getGameState().copy(listOfPlayer = players, listOfPawn = getInitGameState().listOfPawn))
            }
            else {
              val p=  players[indexOfPlayer] as RandomComputerPlayer
                players[indexOfPlayer]=p.copy(win = p.win+1)

                setGameState(getGameState().copy(listOfPlayer = players, listOfPawn = getInitGameState().listOfPawn))
            }


            onGameFinish()
        } else {

            val index = getGameState().listOfCounter.indexOfFirst { it.number != 0 }


            // check if player has count finish
            if (index == -1) {
                //finish counting
                //counter change player

                changePlayer()

            } else {
                //enable second counter

                val counter = getGameState().listOfCounter[index]
                val isSecondCanMoveAnyPawn = getAllThePawnMovable(counter.number).isNotEmpty()
                //if second can move any pawn
                if (isSecondCanMoveAnyPawn) {
                    val listOfCounter = getGameState().listOfCounter.toMutableList()
                    listOfCounter[index] = counter.copy(isEnable = true)
                    setGameState(getGameState().copy(listOfCounter = listOfCounter))
                } else {
                    changePlayer()
                }

            }


        }

    }

    private fun changePlayer() {

        //set new current player
        val size = getGameState().listOfPlayer.size
        val indexOfCurrentPlayer = getGameState().listOfPlayer.indexOfFirst { it.isCurrent }

        //having double six
        val isHavingDoubleSix =
            getGameState().listOfDice.filter { !it.isTotal }.all { it.number == 6 }

        val nextPlayer = if (isHavingDoubleSix) indexOfCurrentPlayer else indexOfCurrentPlayer + 1

        val newCurrent = nextPlayer % size

        log("change Player: new player index $newCurrent")
        val listOfPlayer = getGameState().listOfPlayer.toMutableList()

        repeat(listOfPlayer.size) {


            when (val player = listOfPlayer[it]) {
                is HumanPlayer -> {
                    listOfPlayer[it] =
                        player.copy(isCurrent = false)
                }
                is RandomComputerPlayer -> {
                    listOfPlayer[it] =
                        player.copy(isCurrent = false)
                }
            }

        }

        val isHuman = listOfPlayer[newCurrent] is HumanPlayer
        when (val player = listOfPlayer[newCurrent]) {
            is HumanPlayer -> {
                listOfPlayer[newCurrent] =
                    player.copy(isCurrent = true)
            }
            is RandomComputerPlayer -> {
                listOfPlayer[newCurrent] =
                    player.copy(isCurrent = true)
            }
        }

        // listOfPlayer[newCurrent] = listOfPlayer[newCurrent].copy(isCurrent = true)

        //enable dice

        val listOfDice = getGameState().listOfDice.toMutableList()

        repeat(listOfDice.size) {

            listOfDice[it] = listOfDice[it].copy(isEnable = true)
        }


        setGameState(
            getGameState().copy(
                listOfPlayer = listOfPlayer,
                listOfDice = listOfDice,
                isHumanPlayer = isHuman
            )
        )


    }

    private fun checkKill(originalPawn: Pawn, pawn: Pawn): Boolean {
        return getPawnBox(originalPawn) == getPawnBox(pawn)
    }

    private fun kill(originalPawn: Pawn, pawn: Pawn) {
        val pawnList = getGameState().listOfPawn.toMutableList()

        val originalIndex = pawnList.indexOf(originalPawn)
        val index = pawnList.indexOf(pawn)

        //change to search by box position
        val zIndex = getGameState().listOfPawn.count { it.isOut() }

        println("zindex is $zIndex")

        pawnList[originalIndex] =
            originalPawn.copy(currentPos = 56, zIndex = zIndex.toFloat())
        pawnList[index] = pawn.copy(currentPos = pawn.id * -1, zIndex = 1f)

        setGameState(getGameState().copy(listOfPawn = pawnList))
    }

    private fun getOpponentOnPath(): List<Pawn> {

        val currentPlayerPawn = getCurrentPlayerPawns()

        return getGameState().listOfPawn
            .filter { it !in currentPlayerPawn && it.isOnPath() }
            .sortedByDescending { it.zIndex }

    }

    private fun getAllThePawnMovable(currentNumberSelected: Int): List<Pawn> {


        val pairOfPairDiceCanMoveAndOnPath = getCurrentPlayerPawns()
            //get pawn that is out
            //get pawn that is in range of counter distance
            .filter { !it.isHome() && currentNumberSelected in 1..it.getDistanceRemain() }
            .toMutableList()

        if (currentNumberSelected == 6 && getCurrentPlayerPawns().any { it.isHome() }) {

            val list2 = getCurrentPlayerPawns()
                .filter { it.isHome() }

            pairOfPairDiceCanMoveAndOnPath.addAll(list2)

        }


        return pairOfPairDiceCanMoveAndOnPath.distinct()

    }

    private fun getDiceNumber(): Int {

        return intArrayOf(1, 2, 6, 6, 6, 6, 4, 5, 3).random()
    }

    private fun getCurrentPlayerPawns(): List<Pawn> {
        val colorOfCurrentPlayer =
            getGameState().listOfPlayer.find { it.isCurrent }!!.colors
        return getGameState().listOfPawn.filter { colorOfCurrentPlayer.contains(it.color) }
            .distinct()
    }


    private fun getPawnBox(pawn: Pawn) =
        getGameState().board.getBoxByIndex(pawn.currentPos, pawn.color)

    companion object {
        private const val numberOfDice = 3
        private const val totalIndex = numberOfDice / 2

        fun getDefaultGameState(): LudoGameState {

            val listPawns = ArrayList<Pawn>()

            GameColor.values().forEach { gameColor ->
                (1..4).forEach { id ->
                    listPawns.add(Pawn(id = id, color = gameColor))
                }
            }

            val listOfPlayers = listOf(
                RandomComputerPlayer(
                    isCurrent = true,
                    colors = listOf(GameColor.values()[0], GameColor.values()[1])
                ),
                HumanPlayer(colors = listOf(GameColor.values()[2], GameColor.values()[3]))
            )

            val listOfCounter =
                (0 until numberOfDice).map { if (it == totalIndex) Counter(isTotal = true, id = it) else Counter(id=it) }
            val listOfDices =
                (0 until numberOfDice).map {
                    if (it == totalIndex) Dice(isTotal = true, id = it) else Dice(
                        isEnable = true,
                        id = it
                    )
                }

            return LudoGameState(
                listOfPlayer = listOfPlayers,
                listOfDice = listOfDices,
                listOfPawn = listPawns,
                listOfCounter = listOfCounter
            )
        }
    }
}