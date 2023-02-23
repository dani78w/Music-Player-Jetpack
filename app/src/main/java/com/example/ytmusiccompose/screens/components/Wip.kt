package com.example.ytmusiccompose.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.zIndex
import androidx.navigation.NavController

@Composable
fun WorkInProgress(navController:NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .zIndex(2f),
        color = MaterialTheme.colorScheme.primary
        //color = Color.Transparent
    ) {

        Button(onClick = { navController.navigate("LoginScreen") }) {
            Text("Work in progress")
        }
    }
}