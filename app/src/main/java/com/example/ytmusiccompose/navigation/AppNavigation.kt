package com.example.ytmusiccompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ytmusiccompose.screens.FirstScreen
import com.example.ytmusiccompose.screens.components.*

@Composable
fun AppNavigation() {

    var navController = rememberNavController()
    var currentSong = 0
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route) {
        composable(AppScreens.LoginScreen.route) {
            LoginScreen(navController)
        }
        composable(AppScreens.FirstScreen.route) {
            FirstScreen(navController)
        }
        composable(AppScreens.SecondScreen.route) {
            SecondScreen(navController)
        }
        composable(AppScreens.ThirdScreen.route) {
            ThirdScreen(navController)
        }
        composable(AppScreens.PlayerScreen.route) {
            PlayerScreen(navController)
        }
        composable(AppScreens.PlayerVideoScreen.route) {
            PlayerVideoScreen(navController)
        }
        composable(AppScreens.WorkInProgress.route) {
            WorkInProgress(navController)
        }

    }
}