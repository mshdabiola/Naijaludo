package com.mshdabiola.ludo

import com.mshdabiola.naijaludo.LudoGame
import com.mshdabiola.naijaludo.model.GameType
import com.mshdabiola.naijaludo.model.LudoGameState
import com.mshdabiola.naijaludo.model.Pawn
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.naijaludo.model.SoundInterface
import com.mshdabiola.naijaludo.model.log

class LogLudo(soundInterface: SoundInterface) :
    LudoGame(soundInterface = soundInterface) {

    var firebaseLog: (event: String, block: com.google.firebase.analytics.ktx.ParametersBuilder.() -> Unit) -> Unit =
        {_,_->}
    var unLockAchievement: (Int) -> Unit = {}
    var increaseAchievement: (Int) -> Unit = {}

    private var startTime: Long = 0
    private var finishTime: Long = Long.MAX_VALUE

    private var notKill = true
    private var firstHumanPlayer = false
    private var noOfKill = 0

    override suspend fun start(
        ludoGameState: LudoGameState,
        ludoSetting: Setting,
        isGameFinish: (List<Pawn>) -> Boolean,
        onGameFinish: () -> Unit,
        onPlayerFinishPlaying: () -> Unit
    ) {
        val newOnGameFinish = {
            onGameFinish()
            val totalTime = finishTime - startTime
            //FastFinisher
            if (totalTime < 600) {
                unLockAchievement(R.string.achievement_fast_finisher)
            }
            //Defencive master and Flawless victory
            if (notKill) {
                unLockAchievement(R.string.achievement_defensive_master)
                unLockAchievement(R.string.achievement_flawless_victory)
            }
            //no mercy
            if (noOfKill > 3) {
                unLockAchievement(R.string.achievement_no_mercy)
            }

            increaseGame()
            finishTime = System.currentTimeMillis() * 1000
        }
        notKill = true
        firstHumanPlayer = false

        firebaseLog("GameType"){
            param("type",ludoGameState.gameType.name)
        }

        super.start(
            ludoGameState,
            ludoSetting,
            isGameFinish,
            newOnGameFinish,
            onPlayerFinishPlaying
        )

        startTime = System.currentTimeMillis() * 1000
        //social ludo
        if (ludoGameState.gameType == GameType.FRIEND) {
            unLockAchievement(R.string.achievement_social_ludo)
        }
        // Ludo master
        increaseAchievement(R.string.achievement_ludo_master)
    }

    private fun increaseGame() {
        if (isHumanPlaying().not())
            return

        if (getGameState().gameType == GameType.COMPUTER) {
            if (getGameState().listOfPlayer.size == 2) {
                //solo
                increaseAchievement(R.string.achievement_king_of_solo)
                increaseAchievement(R.string.achievement_legend_of_solo)
                increaseAchievement(R.string.achievement_master_of_solo)
                increaseAchievement(R.string.achievement_amateur_of_solo)
            } else {
                //trio
                increaseAchievement(R.string.achievement_king_of_trio)
                increaseAchievement(R.string.achievement_legend_of_trio)
                increaseAchievement(R.string.achievement_master_of_trio)
                increaseAchievement(R.string.achievement_amateur_of_trio)
            }
            //ludo
            increaseAchievement(R.string.achievement_king_of_naija_ludo)
            increaseAchievement(R.string.achievement_legend_of_naija_ludo)
            increaseAchievement(R.string.achievement_master_of_naija_ludo)
            increaseAchievement(R.string.achievement_amateur_of_naija_ludo)
        }
    }


    override fun pause() {
        super.pause()
        firebaseLog = { _, _ -> }
        unLockAchievement = {}
        increaseAchievement = {}
    }

    override suspend fun onDice(dices: IntArray?): IntArray? {
        return super.onDice(dices)
    }

    override fun onDiceFinish(dices: IntArray?): IntArray {
        val intArray = super.onDiceFinish(dices)
        //perfect start
        if (
            !firstHumanPlayer
            && isHumanPlaying()
            && intArray.contains(6)
        ) {
            unLockAchievement(R.string.achievement_perfect_start)
        }
        firstHumanPlayer = true
        //double six
        log("log dice ${intArray.joinToString()}")
        if (isHumanPlaying() && intArray.sum() == 12) {
            increaseAchievement(R.string.achievement_amateur_of_dice)
            increaseAchievement(R.string.achievement_elite_of_dice)
            increaseAchievement(R.string.achievement_epic_of_dice)
            increaseAchievement(R.string.achievement_hero_of_dice)
            increaseAchievement(R.string.achievement_grandmaster_of_dice)
            increaseAchievement(R.string.achievement_legend_of_dice)
            increaseAchievement(R.string.achievement_master_of_dice)
            increaseAchievement(R.string.achievement_semipro_of_dice)
            increaseAchievement(R.string.achievement_warrior_of_dice)
            increaseAchievement(R.string.achievement_pro_of_dice)
        }
        return intArray
    }


    override fun onPawnFinish(pawnIndex: Int) {
        super.onPawnFinish(pawnIndex)

        //early bird
        if (isHumanPlaying() && getHumanPawn().all {
                it.isHome().not()
            } && getOppPawn().all { it.isHome() }) {
            unLockAchievement(R.string.achievement_early_bird)
        }
        //king court
        if (isHumanPlaying() && getHumanPawn().count { it.isInSavePath() } > 3) {
            unLockAchievement(R.string.achievement_kings_court)
        }
    }

    override fun kill(killer: Pawn, kill: Pawn) {
        super.kill(killer, kill)
        if (isHumanPlaying() && getHumanPawn().contains(kill)) {
            notKill = false
        }
        if (isHumanPlaying() && getHumanPawn().contains(killer)) {
            noOfKill += 1
        }
        //lucky combo
        if (isHumanPlaying() && getHumanPawn().all { it.isOut() }) {
            unLockAchievement(R.string.achievement_lucky_combo)
        }
        //ambush
        if (isHumanPlaying() && getHumanPawn().contains(killer) && kill.currentPos in 43..54) {
            unLockAchievement(R.string.achievement_ambush)
        }
    }


    private fun getHumanPawn(): List<Pawn> {
        val colors = getGameState().listOfPlayer.last().colors
        return getGameState().listOfPawn.filter {
            colors.contains(it.color)
        }
    }

    private fun getOppPawn(): List<Pawn> {
        val colors = getGameState().listOfPlayer.last().colors
        return getGameState().listOfPawn.filter {
            colors.contains(it.color).not()
        }
    }

    private fun isHumanPlaying() = getGameState().isHumanPlayer

}