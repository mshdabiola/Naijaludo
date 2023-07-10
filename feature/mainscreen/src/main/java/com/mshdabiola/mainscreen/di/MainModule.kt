package com.mshdabiola.mainscreen.di


import com.mshdabiola.data.di.dataModule
import com.mshdabiola.mainscreen.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val mainModule= module{

    includes(dataModule)
    viewModelOf(::MainViewModel)
}
