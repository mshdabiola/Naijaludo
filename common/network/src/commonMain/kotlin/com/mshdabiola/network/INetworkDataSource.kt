package com.mshdabiola.network


interface INetworkDataSource {
    suspend fun getRecommendation(): List<String>

    suspend fun goToGoogle():String
}


