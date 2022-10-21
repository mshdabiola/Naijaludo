package com.mshdabiola.ludo.model.navigation

sealed class LudoNavDestination(val route : String) {

   object GameNavDestination :LudoNavDestination("game_route")
    object MainNavDestination :LudoNavDestination("main_route")
}

