package com.example.ytmusiccompose.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.ytmusiccompose.data.actual
import com.example.ytmusiccompose.data.userName
import com.example.ytmusiccompose.screens.components.*
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import java.nio.file.WatchEvent


@Composable
fun FirstScreen(navController: NavController){
    var visible by remember { mutableStateOf(true) }


    val density = LocalDensity.current
    var scr1 = BottomComponents()
    var wll = Wallpaper()
    var tbar = Topbar()
    var chps = Chips()
    var cont = ContentMain()
    // A surface container using the 'background' color from the theme
    Box(){
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .zIndex(2f),
            color = MaterialTheme.colorScheme.primary
            //color = Color.Transparent
        ) {
            Column() {
                //topbar
                Row(
                    modifier = Modifier
                        .wrapContentHeight()
                ) {

                    tbar.topbar(navController)

                }
                //content
                Column(
                    modifier = Modifier
                        .wrapContentWidth()
                        .weight(1f)
                        .verticalScroll(enabled = true, state = rememberScrollState())
                ) {


                    chps.Generos(navController)
                    chps.Emogis(navController)
                    Divider(thickness = 1.dp,
                        color = MaterialTheme.colorScheme.primaryContainer,
                        modifier = Modifier.padding(start=120.dp,end = 120.dp, top = 30.dp, bottom = 30.dp))
                    cont.content(navController)
                }

                //bottom_bar
                Row(
                    modifier = Modifier
                        .wrapContentHeight()
                ) {

                    scr1.Greeting(navController)

                }

            }

        }

        wll.Wallpaper()

    }
}