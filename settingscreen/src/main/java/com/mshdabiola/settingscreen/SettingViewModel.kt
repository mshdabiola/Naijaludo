package com.mshdabiola.settingscreen

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.datastore.Basic
import com.mshdabiola.datastore.Board
import com.mshdabiola.datastore.Profile
import com.mshdabiola.datastore.Sound
import com.mshdabiola.datastore.UserPreferenceDataSource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class SettingViewModel
@Inject constructor(
    savedStateHandle: SavedStateHandle,
    userPreferenceDataSource: UserPreferenceDataSource
) : ViewModel()
{
//    val basic=userPreferenceDataSource
//        .getBasicSetting().stateIn(scope = viewModelScope, started = SharingStarted.WhileSubscribed(5000), initialValue = Basic())
//    val sound=userPreferenceDataSource
//        .getSoundSetting()
//        .stateIn(scope = viewModelScope, started = SharingStarted.WhileSubscribed(5000), initialValue = Sound())
//    val board=userPreferenceDataSource
//        .getBoardSetting()
//        .stateIn(scope = viewModelScope, started = SharingStarted.WhileSubscribed(5000), initialValue = Board())
//    val profile=userPreferenceDataSource
//        .getProfileSetting()
//        .stateIn(scope = viewModelScope, started = SharingStarted.WhileSubscribed(5000), initialValue = Profile())

}