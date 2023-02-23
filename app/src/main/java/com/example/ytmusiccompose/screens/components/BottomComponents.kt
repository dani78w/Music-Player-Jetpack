package com.example.ytmusiccompose.screens.components


import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.internal.liveLiteral
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import com.example.ytmusiccompose.MainActivity
import com.example.ytmusiccompose.data.*
import com.example.ytmusiccompose.navigation.AppScreens




class BottomComponents() {



    @OptIn(InternalComposeApi::class)
    @Composable
    fun Greeting(navController: NavController) {


        var context = LocalContext.current
        var loader =  remember{MediaPlayer.create(context, canciones[0])}
        var loader2 = remember{MediaPlayer.create(context, canciones[1])}



        LaunchedEffect(key1 =loader ){
            loader.setOnBufferingUpdateListener { mediaPlayer, i -> progresoActual.value = i.toFloat()/100 }
        }


        Column(

        ) {

                    //imagen de la cancion y botones de reproduccion
                    val haptic = LocalHapticFeedback.current
                    val context = LocalContext.current
                    Row (
                        modifier = androidx.compose.ui.Modifier
                            .background(color = androidx.compose.material3.MaterialTheme.colorScheme.surface)
                            .clickable { haptic.performHapticFeedback(HapticFeedbackType.LongPress) }

                            ){
                        Spacer(modifier = androidx.compose.ui.Modifier.width(5.dp))
                        Image(
                            painter = androidx.compose.ui.res.painterResource(id = caratulas[actual.value]),
                            contentDescription = "Imagen de la cancion",
                            modifier = androidx.compose.ui.Modifier
                                .width(75.dp)
                                .height(55.dp)
                                .padding(top = 7.dp)
                                .weight(1f)
                        )

                        Column(
                            modifier = androidx.compose.ui.Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                                .weight(2f)
                                .clickable {
                                    haptic.performHapticFeedback(HapticFeedbackType.LongPress);navController.navigate(
                                    AppScreens.PlayerScreen.route
                                )
                                }


                        ) {
                            Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
                            Text(text = "Sing me to sleep", fontSize = 16.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, color = androidx.compose.material3.MaterialTheme.colorScheme.inverseSurface)
                            Text(text=artistas[actual.value],fontSize = 14.sp,fontWeight = androidx.compose.ui.text.font.FontWeight.Light,color = androidx.compose.material3.MaterialTheme.colorScheme.inverseSurface)
                        }
                        Column(modifier = androidx.compose.ui.Modifier.weight(1.15f)) {
                            Spacer(modifier = androidx.compose.ui.Modifier.height(15.dp))
                            Row() {



                                var isPlaying by remember { mutableStateOf(0) }
                                isPlaying= estadoActual.value
                                var icons = listOf(Icons.Filled.PlayArrow,Icons.Filled.Pause)


                                IconButton(onClick = {
                                    if(isPlaying==0){
                                        isPlaying = 1;
                                        estadoActual.value=1
                                        if (actual.value == 0) {

                                            loader.start()
                                        } else {
                                            loader2.start()
                                        }

                                    }else{
                                        isPlaying = 0;
                                        estadoActual.value=0
                                        loader.pause()
                                        loader2.pause()

                                    }
                                }){

                                    Icon(icons[isPlaying],
                                        contentDescription = "Play",
                                        tint = androidx.compose.material3.MaterialTheme.colorScheme.inverseSurface)


                                }


                                IconButton(onClick = {
                                    if (actual.value == 0) {
                                        loader.pause()
                                        loader2.start()
                                        actual.value=1
                                        isPlaying=1;
                                    }else {

                                        loader2.pause()
                                        loader.start()
                                        actual.value=0
                                        isPlaying=1;
                                    }

                                }
                                ) {
                                    Icon(Icons.Filled.SkipNext, contentDescription = "Favorito", tint = androidx.compose.material3.MaterialTheme.colorScheme.inverseSurface)
                                }

                            }
                        }



                    }
                    //Linea de progreso
                    Row(modifier= androidx.compose.ui.Modifier
                        .fillMaxWidth()
                        .height(2.dp)
                        .background(androidx.compose.material3.MaterialTheme.colorScheme.surface)
                    ) {


                        LinearProgressIndicator(progress = progresoActual.value, modifier = androidx.compose.ui.Modifier
                            .fillMaxWidth()
                            .height(4.dp)
                            .background(Color.Transparent),trackColor = Color.Transparent
                        )
                    }
                    //Botones de navegacion
                    Row(
                        modifier = androidx.compose.ui.Modifier
                            .fillMaxWidth()
                            .height(73.dp)
                            .background(color = androidx.compose.material3.MaterialTheme.colorScheme.surface)
                    ) {
                        NavigationBar(containerColor = Color.Transparent,
                            modifier = androidx.compose.ui.Modifier
                                .fillMaxWidth()


                        ) {
                            var selectedItem =0
                            val items = listOf("Home", "Artists", "Playlists")
                            val iconslist = listOf(Icons.Filled.Home, Icons.Filled.CompassCalibration, Icons.Filled.List)
                            items.forEachIndexed { index, item ->
                                NavigationBarItem(
                                    icon = { Icon(iconslist[index], contentDescription = "Icono de navegacion",tint = androidx.compose.material3.MaterialTheme.colorScheme.inverseSurface)},
                                    label = { Text(item) },
                                    selected = null == true,
                                    onClick = {
                                        selectedItem = index
                                        when (index) {
                                            0 -> {selectedItem = 0;navController.navigate("FirstScreen")}
                                            1 -> {selectedItem = 1;navController.navigate("SecondScreen")}
                                            2 -> {selectedItem = 2;navController.navigate("ThirdScreen")}


                                        }
                                    },



                                )
                            }

                        }

                    }

                }

        }
    }


