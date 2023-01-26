package com.mshdabiola.mainscreen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.datastore.UserPreferenceDataSource
import com.mshdabiola.soundsystem.SoundSystem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val userPreferenceDataSource: UserPreferenceDataSource,
    private val soundSystem: SoundSystem,
) : ViewModel() {

    val basic = userPreferenceDataSource
        .getBasicSetting()
        .map { it.toBasic() }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = Basic(),
        )
    val sound = userPreferenceDataSource
        .getSoundSetting()
        .map { it.toSound() }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = Sound(),
        )
    val board = userPreferenceDataSource
        .getBoardSetting()
        .map { it.toBoard() }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = Board(),
        )
    val profile = userPreferenceDataSource
        .getProfileSetting()
        .map { it.toProfile() }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = Profile(),
        )

    private val _profileState = mutableStateOf(Profile())
    val profileState: State<Profile> = _profileState

    init {
        viewModelScope.launch {
            val p = userPreferenceDataSource.getProfileSetting().first()
            _profileState.value = p.toProfile()
        }
        viewModelScope.launch(Dispatchers.IO) {
            userPreferenceDataSource
                .getSoundSetting().collectLatest {
                    soundSystem.playSound = it.sound
                    soundSystem.setPlayMusic(it.music)
                }
        }
        viewModelScope.launch {
            delay(6000)
            soundSystem.play()
        }

        viewModelScope.launch {
            if (!userPreferenceDataSource.isFirstTime()) {
                userPreferenceDataSource.setBasicSetting(
                    basic.value
                        .copy(assistant = true).toBasicPref(),
                )
                userPreferenceDataSource.setBoardSetting(
                    board.value
                        .copy(pawnNumber = 4, rotate = true).toBoardPref(),
                )
                userPreferenceDataSource.setSoundSetting(
                    sound.value
                        .copy(sound = true).toSoundPref(),
                )
                userPreferenceDataSource.setIsFirstTime()
            }
        }
    }

    fun setBasic(basic: Basic) {
        viewModelScope.launch {
            userPreferenceDataSource.setBasicSetting(basic.toBasicPref())
        }
    }

    fun setSound(sound: Sound) {
        viewModelScope.launch {
            userPreferenceDataSource.setSoundSetting(sound.toSoundPref())
        }
    }

    fun uploadProfile() {
        viewModelScope.launch {
            userPreferenceDataSource.setProfileSetting(profileState.value.toProfilePref())
        }
    }

    fun setProfile(profile: Profile) {
        _profileState.value = profile
    }

    fun onPause() {
        soundSystem.pause()
    }
    fun onResume() {
        soundSystem.resume()
    }

    fun setBoard(board: Board) {
        viewModelScope.launch {
            userPreferenceDataSource.setBoardSetting(board.toBoardPref())
        }
    }
    override fun onCleared() {
        super.onCleared()

        soundSystem.close()
    }
}
