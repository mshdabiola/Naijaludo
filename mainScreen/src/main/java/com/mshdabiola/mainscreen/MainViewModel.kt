package com.mshdabiola.mainscreen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.datastore.UserPreferenceDataSource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

@HiltViewModel
class MainViewModel @Inject constructor(
    private val userPreferenceDataSource: UserPreferenceDataSource
) : ViewModel() {

    val basic = userPreferenceDataSource
        .getBasicSetting()
        .map { it.toBasic() }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = Basic()
        )
    val sound = userPreferenceDataSource
        .getSoundSetting()
        .map { it.toSound() }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = Sound()
        )
    val board = userPreferenceDataSource
        .getBoardSetting()
        .map { it.toBoard() }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = Board()
        )
    val profile = userPreferenceDataSource
        .getProfileSetting()
        .map { it.toProfile() }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = Profile()
        )

    private val _profileState = mutableStateOf(Profile())
    val profileState: State<Profile> = _profileState

    init {
        viewModelScope.launch {
            val p = userPreferenceDataSource.getProfileSetting().first()
            _profileState.value = p.toProfile()
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

    fun setBoard(board: Board) {
        viewModelScope.launch {
            userPreferenceDataSource.setBoardSetting(board.toBoardPref())
        }
    }
}
