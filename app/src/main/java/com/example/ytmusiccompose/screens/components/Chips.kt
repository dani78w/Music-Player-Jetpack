package com.example.ytmusiccompose.screens.components

import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ytmusiccompose.data.userName

class Chips {
    @SuppressLint("NotConstructor")
    @OptIn(ExperimentalMaterial3Api::class)

    @Composable
    fun Generos(navController: NavController) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            lineHeight = 40.sp,
            text = "Inicio",
            fontSize = 33.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraBold,
            modifier = Modifier.padding(15.dp, 0.dp)
        )

        Text(
            text = ("Bienvenido "+ userName.value),
            fontSize = 14.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Light,
            modifier = Modifier.padding(15.dp, 1.dp,0.dp,20.dp)
        )

        Row(
            modifier = Modifier
                .wrapContentWidth()
                .horizontalScroll(state = ScrollState(220), enabled = true)
        ) {
            Spacer(modifier =Modifier.width(10.dp))


            var listaDeGeneros = listOf("Rock","Pop","Jazz","Metal","Clasica","Electronica","Hip-Hop","Reggaeton","Salsa","Cumbia","Bachata","Baladas","Rancheras","Tropical","Folklore","Indie","Romantica","Alternativa","Blues","Country","Funk","Gospel","Musica Urbana","Punk","Reggae","Soul","Tango","Tecnocumbia","Tecnoranchera","Tropical","Trap","Vallenato","Zouk")

            for(i in 0..listaDeGeneros.size-1) {

                Row(
                    modifier = Modifier

                        .aspectRatio(1f)
                        .height(50.dp)
                        .border(
                            BorderStroke(4.dp, MaterialTheme.colorScheme.onPrimary),
                            shape = RoundedCornerShape(100.dp)
                        )
                        .clickable { navController.navigate("WorkInProgress") }
                        .background(
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            shape = RoundedCornerShape(100.dp)


                        )
                        .clip(shape = MaterialTheme.shapes.small),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center


                ) {

                    Text(fontWeight = FontWeight.ExtraBold,text =listaDeGeneros[i].toUpperCase(), color = MaterialTheme.colorScheme.inversePrimary, fontSize = 20.sp, modifier = Modifier.padding(start=30.dp,end=30.dp))
                }
                Spacer(modifier = Modifier
                    .width(25.dp)
                    .height(50.dp))
            }




        }

    }
    @Composable
    fun Emogis(navController: NavController) {

        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .wrapContentWidth()
                .horizontalScroll(state = ScrollState(220), enabled = true)
        ) {
            Spacer(modifier =Modifier.width(10.dp))


            var listaDeEmogis = listOf("👽","😇","👾","🧸","🗿","🥰","😡")

            for(i in 0..listaDeEmogis.size-1) {

                Row(
                    modifier = Modifier


                        .width(40.dp)
                        .height(40.dp)
                        .border(
                            BorderStroke(4.dp, MaterialTheme.colorScheme.onPrimary),
                            shape = RoundedCornerShape(100.dp)
                        )
                        .clickable { navController.navigate("WorkInProgress") }
                        .background(
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            shape = RoundedCornerShape(100.dp)


                        )
                        .clip(shape = MaterialTheme.shapes.small),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center


                ) {

                    Text(fontWeight = FontWeight.ExtraBold,text =listaDeEmogis[i], color = MaterialTheme.colorScheme.inversePrimary, fontSize = 20.sp)
                }
                Spacer(modifier = Modifier
                    .width(25.dp)
                    .height(50.dp))
            }




        }

    }
    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Chips()
    }
}