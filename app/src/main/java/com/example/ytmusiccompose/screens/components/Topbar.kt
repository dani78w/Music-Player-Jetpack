package com.example.ytmusiccompose.screens.components

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType.Companion.Uri
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.ytmusiccompose.R

class Topbar {
    @Composable
    fun topbar(navController:NavController){

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(45.dp)
                    .padding(start = 11.dp, end = 0.1.dp, top = 10.dp)

            ) {
                Image(
                    alignment = Alignment.Center,
                    contentScale = ContentScale.FillBounds,
                    painter = painterResource(id = R.drawable.group_8),
                    contentDescription = stringResource(id = R.string.rectangle_13),
                    modifier = Modifier
                        .zIndex(1f)
                        .aspectRatio(1f)
                        .weight(0.25f)


                )
                Text(
                    text = "Music",
                    color = androidx.compose.material3.MaterialTheme.colorScheme.surface,
                    fontSize = 25.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    textAlign = TextAlign.Left,
                    modifier = Modifier
                        .zIndex(1f)
                        .padding(start = 4.dp, end = 0.1.dp, top = 0.dp)
                        .weight(2f)
                )

                IconButton(onClick = { ;navController.navigate("WorkInProgress") }){
                    Icon(Icons.Filled.Search, contentDescription = "Play", tint = androidx.compose.material3.MaterialTheme.colorScheme.surface)
                }
                IconButton(onClick = { navController.navigate("LoginScreen") }) {
                    Icon(Icons.Filled.AccountBox, contentDescription = "Play", tint = androidx.compose.material3.MaterialTheme.colorScheme.surface)
                }

            }





    }

}