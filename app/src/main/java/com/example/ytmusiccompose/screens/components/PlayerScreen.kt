package com.example.ytmusiccompose.screens.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material.icons.rounded.Shuffle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ytmusiccompose.MainActivity
import com.example.ytmusiccompose.data.actual
import com.example.ytmusiccompose.data.caratulas
import com.example.ytmusiccompose.data.progresoActual


@Composable
fun PlayerScreen(navController: NavController) {


    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.primary) {
        Column() {
            Column(modifier = Modifier.weight(2f)) {
                Column(modifier = Modifier.weight(0.5f)) {
                    PlayerScreenTopBar(navController)
                }

                Column(modifier = Modifier.weight(2f)) {
                    Spacer(modifier = Modifier.height(30.dp))
                    PlayerScreenCaratula(actual.value)
                }
                Column(modifier = Modifier.weight(2f)) {
                    Spacer(modifier = Modifier.height(10.dp))
                    PlayerScreenPlayer()
                }


            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.2f)
                    .background(MaterialTheme.colorScheme.surface)
                    .wrapContentHeight(Alignment.CenterVertically)
                    .padding(start = 15.dp, end = 15.dp)
            ) {
                Text(
                    text = "SIGUIENTE",
                    modifier = Modifier.weight(3f),
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "LETRAS",
                    modifier = Modifier.weight(2f),
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    textAlign = TextAlign.Right,
                    text = "RELACIONADO",
                    modifier = Modifier.weight(3f),
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                )
            }

        }

    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlayerScreenTopBar(navController: NavController) {
    Row(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        Icon(modifier = Modifier
            .height(60.dp)
            .width(50.dp)
            .padding(top = 30.dp, start = 10.dp)
            .clickable { navController.navigate("FirstScreen") }
            .weight(0.3f),
            imageVector = Icons.Filled.KeyboardArrowDown,
            contentDescription = "aaa",
            tint = MaterialTheme.colorScheme.primaryContainer
        )
        Spacer(modifier = Modifier.weight(0.1f))
        Row(
            modifier = Modifier
                .padding(start = 10.dp, top = 25.dp)
                .background(
                    color = MaterialTheme.colorScheme.surface,
                    shape = MaterialTheme.shapes.extraLarge
                )


        ) {
            AssistChip(
                onClick = { navController.navigate("PlayerScreen") },
                label = {
                    Text(
                        "Cancion",
                        color = MaterialTheme.colorScheme.inverseSurface,
                        textAlign = TextAlign.Center
                    )
                },
                border = null,
                shape = MaterialTheme.shapes.extraLarge,
                modifier = Modifier

                    .height(40.dp)
                    .width(85.dp)
                    .shadow(
                        30.dp,
                        MaterialTheme.shapes.extraLarge,
                        ambientColor = MaterialTheme.colorScheme.primary,
                        spotColor = MaterialTheme.colorScheme.primary
                    )
            )

            AssistChip(
                onClick = { navController.navigate("PlayerVideoScreen") },
                label = {
                    Text(
                        "Video",
                        color = MaterialTheme.colorScheme.inverseSurface,
                        textAlign = TextAlign.Center
                    )
                },
                shape = MaterialTheme.shapes.extraLarge,
                border = null,
                modifier = Modifier

                    .height(40.dp)
                    .width(75.dp)

            )
        }

        Spacer(modifier = Modifier.weight(0.1f))
        Icon(modifier = Modifier
            .height(50.dp)
            .width(50.dp)
            .padding(top = 25.dp, start = 10.dp)
            .clickable { navController.navigate("FirstScreen") }
            .weight(0.3f),
            imageVector = Icons.Outlined.Settings,
            contentDescription = "aaa",
            tint = MaterialTheme.colorScheme.primaryContainer
        )

    }

}

@Composable
fun PlayerScreenCaratula(index:Int) {

    Image(
        alignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .aspectRatio(1f, true),
        painter = androidx.compose.ui.res.painterResource(id = caratulas[index]),
        contentDescription = "caratula",
        contentScale = ContentScale.FillWidth



        )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlayerScreenPlayer() {
    var index = 0
    var player = BottomComponents()



    Row(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        Icon(
            modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .padding(top = 25.dp, start = 20.dp)
                .clickable { }
                .weight(0.4f),
            imageVector = Icons.Filled.ThumbUp,
            contentDescription = "aaa",
            tint = MaterialTheme.colorScheme.primaryContainer
        )
        Spacer(modifier = Modifier.weight(0.1f))
        Column(
            modifier = Modifier
                .wrapContentWidth()
        ) {
            Text(
                fontWeight = FontWeight.ExtraBold,
                fontSize = 25.sp,
                text = ("Sing me to sleep"),
                color = MaterialTheme.colorScheme.surface,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 5.dp)
            )
            Text(
                fontSize = 15.sp,
                text = "Alan Walker",
                color = MaterialTheme.colorScheme.inversePrimary,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 5.dp)
            )
        }

        Spacer(modifier = Modifier.weight(0.1f))
        Icon(
            modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .padding(top = 25.dp, end = 20.dp)
                .clickable { }
                .weight(0.5f)
                .rotate(180f),
            imageVector = Icons.Outlined.ThumbUp,
            contentDescription = "aaa",
            tint = MaterialTheme.colorScheme.primaryContainer
        )

    }

    LinearProgressIndicator(
        progress = progresoActual.value,
        modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(start = 20.dp, end = 20.dp)
            .clip(MaterialTheme.shapes.large)
            .background(MaterialTheme.colorScheme.primaryContainer),
        trackColor = MaterialTheme.colorScheme.inversePrimary,
        color = MaterialTheme.colorScheme.secondaryContainer
    )

    Row(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary)
            .padding(10.dp)
            .width(80.dp)
    ) {
        val haptic = LocalHapticFeedback.current
        val context = LocalContext.current
        Icon(
            modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .clickable { haptic.performHapticFeedback(HapticFeedbackType.LongPress) }
                .padding(15.dp)
                .weight(0.4f),
            imageVector = Icons.Rounded.Shuffle,
            contentDescription = "aaa",
            tint = MaterialTheme.colorScheme.primaryContainer
        )
        Icon(
            modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .padding(5.dp)
                .clickable { haptic.performHapticFeedback(HapticFeedbackType.LongPress) }
                .weight(0.4f),
            imageVector = Icons.Filled.SkipPrevious,
            contentDescription = "aaa",
            tint = MaterialTheme.colorScheme.primaryContainer
        )
        Icon(
            modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .clickable { haptic.performHapticFeedback(HapticFeedbackType.LongPress) }

                .weight(0.8f),
            imageVector = Icons.Filled.PlayArrow,
            contentDescription = "aaa",
            tint = MaterialTheme.colorScheme.primaryContainer
        )
        Icon(
            modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .padding(5.dp)
                .clickable { haptic.performHapticFeedback(HapticFeedbackType.LongPress) }
                .weight(0.4f),
            imageVector = Icons.Filled.SkipNext,
            contentDescription = "aaa",
            tint = MaterialTheme.colorScheme.primaryContainer
        )
        Icon(
            modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .clickable { haptic.performHapticFeedback(HapticFeedbackType.LongPress) }
                .weight(0.4f)
                .padding(15.dp),
            imageVector = Icons.Filled.Loop,
            contentDescription = "aaa",
            tint = MaterialTheme.colorScheme.primaryContainer
        )

    }


}

