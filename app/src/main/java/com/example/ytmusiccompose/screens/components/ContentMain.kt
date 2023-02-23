package com.example.ytmusiccompose.screens.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ytmusiccompose.R
import com.example.ytmusiccompose.data.actual
import com.example.ytmusiccompose.data.artistas
import com.example.ytmusiccompose.data.caratulas
import com.example.ytmusiccompose.data.nombres

class ContentMain {

    @Composable
    fun content(navController: NavController) {
        Column(
            modifier = Modifier

                .wrapContentHeight()
                .wrapContentWidth()
        ) {
            SeleccionesRapidas()
            VuelveAescuchar()
            VideosMusicalesRecomendados(navController)
        }


    }

   @Composable
   fun SeleccionesRapidas(){
       Spacer(modifier = Modifier.height(10.dp))
       Text(text ="Inicia una radio a partir de una cancion", fontSize = 15.sp,fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, modifier = Modifier.padding(10.dp, 0.dp))
       Text(text ="Selecciones rapidas", fontSize = 33.sp , fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraBold, modifier = Modifier.padding(10.dp, 0.dp))
       Row(
           modifier = Modifier
               .wrapContentHeight()
               .wrapContentWidth()
               .padding(10.dp, 0.dp)
       ) {
           Column(modifier = Modifier
               .wrapContentHeight()
               .wrapContentWidth()
               ) {

               songContent(0)
               songContent(1)
               songContent(0)
               songContent(1)
               songContent(0)
           }


       }

   }
    @Composable
    fun VuelveAescuchar() {
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Vuelve a escucharlo",
            fontSize = 33.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraBold,
            modifier = Modifier.padding(10.dp, 0.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))

        Row(
            modifier = Modifier
                .wrapContentWidth()
                .horizontalScroll(state = ScrollState(0), enabled = true)
        ) {
            Spacer(modifier =Modifier.width(30.dp))
            Column(
                modifier = Modifier.width(150.dp)
                    .clickable {
                        actual.value = 0;
                               }
                ,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = caratulas[0]),
                    contentDescription = "Song Image",
                    modifier = Modifier
                        .padding(1.dp)
                        .size(150.dp)
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "Sing me to sleep",
                    fontSize = 16.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = MaterialTheme.colorScheme.inverseOnSurface,
                )
            }

            Column(
                modifier = Modifier.width(150.dp)
                    .clickable {  actual.value = 1}
                ,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = caratulas[1]),
                    contentDescription = "Song Image",
                    modifier = Modifier
                        .padding(1.dp)
                        .size(150.dp)
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "Sing me to sleep",
                    fontSize = 16.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = MaterialTheme.colorScheme.inverseOnSurface,
                )
            }
            Column(
                modifier = Modifier.width(150.dp)
                    .clickable {  actual.value = 0}
                ,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = caratulas[0]),
                    contentDescription = "Song Image",
                    modifier = Modifier
                        .padding(1.dp)
                        .size(150.dp)
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "Sing me to sleep",
                    fontSize = 16.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = MaterialTheme.colorScheme.inverseOnSurface,
                )
            }



        }
    }
    @Composable
    fun VideosMusicalesRecomendados(navController: NavController) {
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Videos Musicales \nRecomendados",
            fontSize = 33.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraBold,
            lineHeight = 34.sp,
            modifier = Modifier.padding(10.dp, 0.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .wrapContentWidth()
                .horizontalScroll(state = ScrollState(0), enabled = true)
        ) {
            Spacer(modifier = Modifier.width(30.dp))
            Column(
                modifier = Modifier.width(350.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id =caratulas[0]),
                    contentDescription = "Song Image",
                    modifier = Modifier
                        .padding(1.dp)
                        .width(500.dp)
                        .height(200.dp)
                        .background(Color.Black)
                        .clickable {
                            actual.value = 0;
                            navController.navigate("PlayerVideoScreen")
                        }
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "Sing me to sleep",
                    fontSize = 16.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = MaterialTheme.colorScheme.inverseOnSurface,
                )
            }
            Column(
                modifier = Modifier.width(350.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id =caratulas[1] ),
                    contentDescription = "Song Image",
                    modifier = Modifier
                        .padding(1.dp)
                        .width(500.dp)
                        .height(200.dp)
                        .background(Color.Black)
                        .clickable {
                            actual.value = 1;
                            navController.navigate("PlayerVideoScreen")
                        }
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "Sing me to sleep",
                    fontSize = 16.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = MaterialTheme.colorScheme.inverseOnSurface,
                )
            }
        }
    }
    @Composable
    fun songContent(index:Int){
        Row(
            modifier = Modifier
                .clickable(enabled = true, onClick = {actual.value = index})
                .height(60.dp)
                .wrapContentWidth(),

            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = caratulas[index]),
                contentDescription = "Song Image",
                modifier = Modifier
                    .padding(10.dp)
                    .size(50.dp)
                    .clip(RoundedCornerShape(10.dp)
                    )

            )
            Column(modifier = androidx.compose.ui.Modifier.width(250.dp)) {
                Text(text = nombres[index], fontSize = 16.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, color = androidx.compose.material3.MaterialTheme.colorScheme.surface)
                Text(text= artistas[index],fontSize = 14.sp,fontWeight = androidx.compose.ui.text.font.FontWeight.Light,color = androidx.compose.material3.MaterialTheme.colorScheme.surface)
            }

        }
    }


}



