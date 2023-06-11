package com.example.fitx

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@ExperimentalAnimationApi
@Composable
fun RootNavigationGraph(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = startDestination
    ) {
        composable(route =  Graph.PERSONAL_SCREEN){
            PersonalScreen(navController)
        }
        composable(route =  Graph.PERSONAL_PROFILE_SCREEN){
            PersonalPerfilScreen(navController)
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val PERSONAL_SCREEN = "PERSONAL_SCREEN"
    const val PERSONAL_PROFILE_SCREEN = "PERSONAL_PROFILE_SCREEN"
}