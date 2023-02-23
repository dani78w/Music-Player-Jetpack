package com.example.ytmusiccompose.navigation

sealed class AppScreens(val route: String) {
    object LoginScreen : AppScreens("LoginScreen")
    object FirstScreen : AppScreens("FirstScreen")
    object SecondScreen : AppScreens("SecondScreen")
    object ThirdScreen : AppScreens("ThirdScreen")
    object PlayerScreen : AppScreens("PlayerScreen")
    object PlayerVideoScreen : AppScreens("PlayerVideoScreen")
    object WorkInProgress : AppScreens("WorkInProgress")
}
