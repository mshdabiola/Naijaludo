package com.mshdabiola.desktop.ui.feature.main

import com.mshdabiola.data.repository.IModelRepository
import com.mshdabiola.data.repository.INetworkRepository
import com.mshdabiola.data.repository.ISettingRepository
import com.mshdabiola.desktop.ViewModel
import com.mshdabiola.model.DummySetting
import com.mshdabiola.model.Model
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class MainViewModel(
    private val settingRepository: ISettingRepository,
    private val modelRepository: IModelRepository,
    private val networkRepository: INetworkRepository
): ViewModel()  {
    companion object {
        const val INIT_WELCOME_MSG = "Hello World! Skeleton"
    }

    private val _welcomeText = MutableStateFlow(INIT_WELCOME_MSG)
    val welcomeText: StateFlow<String> = _welcomeText

    val models = modelRepository
        .getAllModel()
        .stateIn(viewModelScope, started = SharingStarted.WhileSubscribed(5000), emptyList())

   init{


        viewModelScope.launch {
            modelRepository
                .getAllModel()
                .collect{
                    print(it)
                }
        }
        viewModelScope.launch {
//            multiplatformSettings.name.collectLatest {
//                print(it)
//            }
        }
        viewModelScope.launch {
//            settingRepository.setName("Ademola")
        }
        viewModelScope.launch(Dispatchers.IO){
            try {
                networkRepository.gotoGoogle()
            }catch (e:Exception){
                e.printStackTrace()
            }

        }
        viewModelScope.launch(Dispatchers.IO){
           settingRepository.setDummy(DummySetting("abiola","female"))
        }
    }

    fun onClickMeClicked() {
        val platform="Clicking"
        _welcomeText.value ="abiola $platform"// myRepo.getClickedWelcomeText()
    }

    fun insertModel(name :String){
        viewModelScope.launch {
            modelRepository.insert(Model(4,name))
        }
    }
}
