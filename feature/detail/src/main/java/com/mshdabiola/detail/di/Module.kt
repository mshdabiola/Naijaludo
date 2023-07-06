package com.mshdabiola.detail.di

import com.mshdabiola.detail.DetailViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val detailModule= module {
    viewModelOf(::DetailViewModel)
}