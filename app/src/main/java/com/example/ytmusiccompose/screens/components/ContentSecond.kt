package com.example.ytmusiccompose.screens.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ytmusiccompose.R
import com.example.ytmusiccompose.data.*

class ContentSecond {

    @Composable
    fun content(navController: NavController) {
        Column(
            modifier = Modifier

                .wrapContentHeight()
                .wrapContentWidth()
        ) {
            VuelveAescuchar()

            Divider(thickness = 1.dp,
                color = MaterialTheme.colorScheme.primaryContainer,
                modifier = Modifier.padding(start=120.dp,end = 120.dp, top = 40.dp,bottom = 40.dp))
            ButtonList(navController)
        }


    }


    @Composable
    fun VuelveAescuchar() {
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Artistas recientes",
            fontSize = 33.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraBold,
            modifier = Modifier.padding(15.dp, 0.dp)
        )
        Spacer(modifier = Modifier.height(25.dp))

        Row(
            modifier = Modifier
                .wrapContentWidth()
                .horizontalScroll(state = ScrollState(220), enabled = true)
        ) {
            for(i in 0..canciones.size-1) {
                Spacer(modifier = Modifier.width(30.dp))
                Column(
                    modifier = Modifier
                        .width(150.dp)
                        .clickable {
                            actual.value = i;
                        },
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = caratulas[i]),
                        contentDescription = "Song Image",
                        modifier = Modifier
                            .padding(1.dp)
                            .size(150.dp)
                            .clip(RoundedCornerShape(100.dp))
                    )
                    Text(
                        textAlign = TextAlign.Center,
                        text = artistas[i],
                        fontSize = 16.sp,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                        color = MaterialTheme.colorScheme.inverseOnSurface,
                    )
                }
            }


        }
    }
    
    @Composable
    fun ButtonList(navController: NavController){
        var listoficons = listOf(Icons.Filled.Home, Icons.Filled.Search, Icons.Filled.MusicNote, Icons.Filled.List, Icons.Filled.DiscFull, Icons.Filled.YoutubeSearchedFor, Icons.Filled.Home)
        var listofStrings = listOf("Inicio", "Buscar", "Tu música", "Tu lista", "Tu disco", "YouTube", "Más tarde")
        for(i in 0..6){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(start=10.dp, end=10.dp)
                    .clickable {
                        navController.navigate("WorkInProgress")
                    }

            ) {
                Icon(
                    listoficons[i], tint = MaterialTheme.colorScheme.inverseOnSurface, contentDescription = "Home", modifier = Modifier
                        .padding(5.dp)
                        .size(30.dp)
                        .weight(0.2f)
                        .clickable {
                            navController.navigate("home")
                        })
                Text(
                    text = listofStrings[i],
                    fontSize = 18.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    modifier = Modifier
                        .padding(6.dp)
                        .weight(1f)

                )
                Icon(Icons.Filled.ArrowBackIos,
                    tint = MaterialTheme.colorScheme.inverseOnSurface,
                    contentDescription = "Divider",
                    modifier = Modifier
                        .weight(0.2f)
                        .padding(top=15.dp)
                        .size(20.dp)
                        .rotate(180f)
                        .height(1.dp))


            }
            Spacer(modifier =Modifier.height(5.dp))

        }




    }


}



