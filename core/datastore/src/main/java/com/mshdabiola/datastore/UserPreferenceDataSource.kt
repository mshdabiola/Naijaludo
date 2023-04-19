package com.mshdabiola.datastore

import androidx.datastore.core.DataStore
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class UserPreferenceDataSource
@Inject constructor(
    private val userPreferences: DataStore<UserPreferences>,
) {

    fun getBasicSetting() =
        userPreferences
            .data
            .map { it.toBasicPref() }

    suspend fun setBasicSetting(basic: BasicPref) {
        userPreferences.updateData {
            it.copy {
                language = basic.language
                gameLevel = basic.gameLevel

                assistant = basic.assistant
            }
        }
    }

    fun getSoundSetting() =
        userPreferences
            .data
            .map { it.toSoundPref() }

    suspend fun setSoundSetting(sound: SoundPref) {
        userPreferences.updateData {
            it.copy {
                this.sound = sound.sound
                music = sound.music
                musicType = sound.musicType
            }
        }
    }

    fun getBoardSetting() =
        userPreferences
            .data
            .map { it.toBoardPref() }

    suspend fun setBoardSetting(board: BoardPref) {
        userPreferences.updateData {
            it.copy {
                boardType = board.boardType
                boardStyle = board.boardStyle
                pawnNumber = board.pawnNumber
                rotate = board.rotate
            }
        }
    }

    fun getProfileSetting() =
        userPreferences
            .data
            .map { it.toProfilePref() }

    suspend fun setProfileSetting(profile: ProfilePref) {
        userPreferences.updateData {
            it.copy {
                playerName = profile.playerName
                comName1 = profile.computer1
                comName2 = profile.computer2
                comName3 = profile.computer3
            }
        }
    }

    suspend fun isFirstTime() =
        userPreferences
            .data
            .map {
                it.isFirstTime
            }
            .first()

    suspend fun setIsFirstTime() {
        userPreferences.updateData {
            it.copy {
                this.isFirstTime = true
            }
        }
    }
}
