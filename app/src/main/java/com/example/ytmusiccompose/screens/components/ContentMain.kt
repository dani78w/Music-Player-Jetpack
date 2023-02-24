package com.example.ytmusiccompose.screens.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.PlayCircle
import androidx.compose.material3.Icon
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
import com.example.ytmusiccompose.data.*

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
       Text(text ="Selecciones rapidas", fontSize = 33.sp , fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraBold, modifier = Modifier.padding(15.dp, 0.dp, bottom = 3.dp))
       Text(text ="Inicia una radio a partir de una cancion", fontSize = 15.sp,fontWeight = androidx.compose.ui.text.font.FontWeight.Light, modifier = Modifier.padding(15.dp,0.dp,bottom = 25.dp))

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
                    for(i in 0..canciones.size-1){
                        songContent(i)
                    }
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
            modifier = Modifier.padding(15.dp, 0.dp)
        )
        Text(text ="Inicia una cancion reciente", fontSize = 15.sp,fontWeight = androidx.compose.ui.text.font.FontWeight.Light, modifier = Modifier.padding(15.dp,0.dp,bottom = 25.dp))

        Spacer(modifier = Modifier.height(5.dp))

        Row(
            modifier = Modifier
                .wrapContentWidth()
                .horizontalScroll(state = ScrollState(0), enabled = true)
        ) {
            Spacer(modifier =Modifier.width(30.dp))
            for(i in 0..canciones.size-1){
                Column(
                    modifier = Modifier
                        .width(150.dp)
                        .clickable {
                            actual.value = i;
                        }
                    ,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = caratulas[i]),
                        contentDescription = "Song Image",
                        modifier = Modifier
                            .padding(1.dp)
                            .size(150.dp)
                    )
                    Text(
                        textAlign = TextAlign.Center,
                        text = nombres[i],
                        fontSize = 16.sp,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Light,
                        color = MaterialTheme.colorScheme.inverseOnSurface,
                    )
                }
            }





        }
    }
    @Composable
    fun VideosMusicalesRecomendados(navController: NavController) {

        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Videos Musicales",
            fontSize = 33.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraBold,
            lineHeight = 34.sp,
            modifier = Modifier.padding(15.dp, bottom = 0.dp)
        )
        Text(text ="Inicia un video a partir de una canción", fontSize = 15.sp,fontWeight = androidx.compose.ui.text.font.FontWeight.Light, modifier = Modifier.padding(15.dp,0.dp,bottom = 25.dp))

        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .wrapContentWidth()
                .horizontalScroll(state = ScrollState(0), enabled = true)
        ) {
            Spacer(modifier = Modifier.width(30.dp))
            for (i in 0..canciones.size - 1) {
                Column(
                    modifier = Modifier.wrapContentWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = caratulas[i]),
                        contentDescription = "Song Image",
                        modifier = Modifier
                            .padding(1.dp)
                            .width(300.dp)
                            .height(150.dp)
                            .background(Color.Black)
                            .clickable {
                                actual.value = i;
                                navController.navigate("PlayerVideoScreen")
                            }
                    )
                    Text(
                        textAlign = TextAlign.Center,
                        text = nombres[i]+" - "+artistas[i],
                        fontSize = 16.sp,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Light,
                        color = MaterialTheme.colorScheme.inverseOnSurface,
                        modifier=Modifier.padding(bottom = 30.dp)
                    )
                }
            }
        }
    }
    @Composable
    fun songContent(index:Int){
        Row(
            modifier = Modifier
                .clickable(enabled = true, onClick = { actual.value = index })
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
                    .weight(0.2f)
                    .clip(
                        RoundedCornerShape(10.dp)
                    )

            )
            Column(modifier = androidx.compose.ui.Modifier
                .width(250.dp)
                .weight(0.7f)) {
                Text(text = nombres[index], fontSize = 16.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, color = androidx.compose.material3.MaterialTheme.colorScheme.surface)
                Text(text= artistas[index],fontSize = 14.sp,fontWeight = androidx.compose.ui.text.font.FontWeight.Light,color = androidx.compose.material3.MaterialTheme.colorScheme.surface)
            }

            Icon(
                imageVector = Icons.Filled.PlayCircle,
                contentDescription = "More",
                modifier = Modifier
                    .weight(0.1f)
                    .padding(10.dp)
                    .size(20.dp))

        }
    }


}



