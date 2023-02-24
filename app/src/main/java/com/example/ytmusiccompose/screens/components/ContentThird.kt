package com.example.ytmusiccompose.screens.components

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
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
import com.example.ytmusiccompose.data.actual
import com.example.ytmusiccompose.data.artistas
import com.example.ytmusiccompose.data.caratulas
import com.example.ytmusiccompose.data.nombres

class ContentThird {

    @Composable
    fun content(navController: NavController) {
        Column(
            modifier = Modifier

                .wrapContentHeight()
                .wrapContentWidth()
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            ButtonList(navController)
            Divider(thickness = 1.dp,
                color = MaterialTheme.colorScheme.primaryContainer,
                modifier = Modifier.padding(start=120.dp,end = 120.dp, top = 30.dp))
            AnimoYgeneros(navController)
            Comentarios(navController)

        }


    }

    @Composable
    fun AnimoYgeneros(navController:NavController){
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            lineHeight = 40.sp,
            text = "Ánimo y Géneros",
            fontSize = 33.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraBold,
            modifier = Modifier.padding(10.dp, 0.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))

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
                            .clickable { navController.navigate("WorkInProgress") }
                            .wrapContentWidth()
                            .height(40.dp)
                            .background(
                                color = MaterialTheme.colorScheme.surface,
                                shape = RoundedCornerShape(10.dp)


                            )
                            .clip(shape = MaterialTheme.shapes.small),
                        verticalAlignment = Alignment.CenterVertically


                    ) {
                        Spacer(modifier = Modifier
                            .width(5.dp)
                            .height(50.dp)
                            .background(Color.Red))

                        Text(listaDeGeneros[i], color = MaterialTheme.colorScheme.onPrimaryContainer, fontSize = 15.sp, modifier = Modifier.padding(start=30.dp,end=30.dp))
                    }
                    Spacer(modifier = Modifier
                        .width(25.dp)
                        .height(50.dp))
                }




        }
        Row(
            modifier = Modifier
                .wrapContentWidth()

                .horizontalScroll(state = ScrollState(220), enabled = true)
        ) {
            Spacer(modifier =Modifier.width(10.dp))


            var listaDeEstadosDeAnimo = listOf("Emocionado","Triste","Feliz","Enojado","Relajado","Animado","Romantico","Alegre","Soleado","Cansado","Estresado","Enamorado","Enfermo")
            for(i in 0..listaDeEstadosDeAnimo.size-1) {

                Row(
                    modifier = Modifier
                        .clickable { navController.navigate("WorkInProgress") }

                        .wrapContentWidth()
                        .height(40.dp)
                        .background(
                            color = MaterialTheme.colorScheme.surface,
                            shape = RoundedCornerShape(10.dp)


                        )
                        .clip(shape = MaterialTheme.shapes.small),
                    verticalAlignment = Alignment.CenterVertically


                ) {
                    Spacer(modifier = Modifier
                        .width(5.dp)
                        .height(50.dp)
                        .background(Color.Blue))

                    Text(listaDeEstadosDeAnimo[i], color = MaterialTheme.colorScheme.onPrimaryContainer, fontSize = 15.sp, modifier = Modifier.padding(start=30.dp,end=30.dp))
                }
                Spacer(modifier = Modifier
                    .width(25.dp)
                    .height(50.dp))
            }



        }
        Row(
            modifier = Modifier
                .wrapContentWidth()
                .horizontalScroll(state = ScrollState(220), enabled = true)
        ) {
            Spacer(modifier =Modifier.width(10.dp))

            var listaDeSitios = listOf("Casa","Trabajo","Gimnasio","Calle","Cochera","Auto","Cocina","Baño","Escuela","Universidad","Parque","Cancha","Cine","Teatro","Casa de un amigo")
            for(i in 0..listaDeSitios.size-1) {

                Row(
                    modifier = Modifier
                        .clickable { navController.navigate("WorkInProgress") }

                        .wrapContentWidth()
                        .height(40.dp)
                        .background(
                            color = MaterialTheme.colorScheme.surface,
                            shape = RoundedCornerShape(10.dp)


                        )
                        .clip(shape = MaterialTheme.shapes.small),
                    verticalAlignment = Alignment.CenterVertically


                ) {
                    Spacer(modifier = Modifier
                        .width(5.dp)
                        .height(50.dp)
                        .background(Color.Yellow))

                    Text(listaDeSitios[i], color = MaterialTheme.colorScheme.onPrimaryContainer, fontSize = 15.sp, modifier = Modifier.padding(start=30.dp,end=30.dp))
                }
                Spacer(modifier = Modifier
                    .width(25.dp)
                    .height(50.dp))
            }



        }
    }
    @Composable
    fun Comentarios(navController:NavController) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            lineHeight = 40.sp,
            text = "Social",
            fontSize = 33.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraBold,
            modifier = Modifier.padding(10.dp, 0.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))



        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(10.dp)

        ) {
            Spacer(modifier =Modifier.width(10.dp))

            var listaDeComentariosLargos=
                listOf("¡Wow, esta playlist es increíble! Me encanta cómo combina diferentes géneros y artistas para crear una experiencia auditiva única y emocionante. Cada canción fluye perfectamente en la siguiente!",
                "¡Esta playlist es genial! Me encanta la selección de canciones y cómo se complementan entre sí. Cada canción tiene su propio estilo y personalidad, pero juntas crean una experiencia auditiva que es simplemente genial. ¡Me ha encantado!",
                    "Me apetecía repostear otra playlist pero no sé cómo hacerlo. ¿Alguien me puede ayudar? 👽"

                    )
            for(i in 0..listaDeComentariosLargos.size-1) {

                Column(
                    modifier = Modifier
                        .clickable { navController.navigate("WorkInProgress") }

                        .fillMaxWidth()
                        .wrapContentHeight()
                        .background(
                            color = MaterialTheme.colorScheme.surface,
                            shape = RoundedCornerShape(10.dp)


                        )

                        .clip(shape = MaterialTheme.shapes.small),



                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(top = 10.dp, start = 10.dp, end = 10.dp)

                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.acounticon),
                            contentDescription = "Profile",
                            modifier = Modifier

                                .size(50.dp)
                                .clip(shape = MaterialTheme.shapes.small)
                                .background(MaterialTheme.colorScheme.surface)

                        )

                        Text(
                            listaDeComentariosLargos[i],
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 10.dp)

                        )
                    }
                    Row(
                        modifier = Modifier
                            .height(30.dp)
                            .fillMaxWidth()
                            .background(MaterialTheme.colorScheme.inverseOnSurface),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(text = "Reproduce esta lista", color = MaterialTheme.colorScheme.primary, fontSize = 16.sp, modifier = Modifier
                            .padding(start = 10.dp, end = 10.dp)
                            .weight(0.9f))
                        Icon(
                            Icons.Filled.PlayArrow, tint = MaterialTheme.colorScheme.primary, contentDescription = "Home", modifier = Modifier

                                .size(25.dp)
                                .weight(0.1f)
                        )
                    }
                }
                Spacer(modifier = Modifier
                    .width(25.dp)
                    .height(10.dp))
            }



        }
    }
    
    @Composable
    fun ButtonList(navController: NavController){
        var listoficons = listOf(Icons.Filled.NoiseAware, Icons.Filled.TrendingUp, Icons.Filled.SentimentSatisfiedAlt, Icons.Filled.List, Icons.Filled.DiscFull, Icons.Filled.YoutubeSearchedFor, Icons.Filled.Home)
        var listofStrings = listOf("Novedades","Listas de exitos","Ánimo y géneros")
        for(i in 0..2){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(start = 10.dp, end = 10.dp)
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
                        .padding(top = 15.dp)
                        .size(20.dp)
                        .rotate(180f)
                        .height(1.dp))


            }
            Spacer(modifier =Modifier.height(5.dp))

        }




    }


}



