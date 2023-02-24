package com.example.ytmusiccompose.screens.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.ytmusiccompose.R
import com.example.ytmusiccompose.data.caratulas
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun WorkInProgress(navController:NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .zIndex(2f),
        color = MaterialTheme.colorScheme.primary
        //color = Color.Transparent
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            Image(
                painter =  painterResource(id = R.drawable.workinimage),
                contentDescription = "wip",
                modifier = Modifier.width(300.dp).height(300.dp)
                    .weight(0.5f)
                    .padding(start=20.dp)
                    .align(Alignment.CenterHorizontally)
                , alignment = Alignment.Center

            )
            Text(
                text="HAS LLEGADO A UNA FUNCION SIN TERMINAR\n \n👽",
                modifier = Modifier
                    .weight(0.1f)
                    .align(Alignment.CenterHorizontally),
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primaryContainer
                , textAlign = TextAlign.Center
            )
            Button(
                modifier = Modifier.fillMaxWidth(1f)
                    .weight(0.1f)
                    .padding(start=20.dp,end=20.dp, bottom = 10.dp,top=10.dp),
                onClick = { navController.navigateUp()},
                border = BorderStroke(3.dp, MaterialTheme.colorScheme.primaryContainer),
            ) {
                Icon(
                    imageVector= Icons.Filled.ArrowBackIos,
                    contentDescription = "back",
                    tint = MaterialTheme.colorScheme.primaryContainer,
                    modifier=Modifier.
                    weight(0.2f),
                )
                Text("Volver a anterior pantalla", fontWeight = FontWeight.Bold, fontSize = 20.sp,

                        modifier=Modifier.
                        weight(0.8f)
                )

            }
        }

    }
}