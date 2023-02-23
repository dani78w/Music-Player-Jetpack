package com.example.ytmusiccompose.screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.example.ytmusiccompose.data.actual
import com.example.ytmusiccompose.data.videos
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.ui.StyledPlayerView

@Composable
fun PlayerVideoScreen(navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize(), color = Color.Black) {
        Column() {
            Column(modifier = Modifier.weight(2f)) {

                PlayerVideoScreenTopBar(navController)

                VideoView(videoUri = videos[actual.value])

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
@Composable
fun VideoView(videoUri: String) {
    val context = LocalContext.current

    val exoPlayer = ExoPlayer.Builder(LocalContext.current)
        .build()
        .also { exoPlayer ->
            val mediaItem = MediaItem.Builder()
                .setUri(videoUri)
                .build()
            exoPlayer.setMediaItem(mediaItem)
            exoPlayer.prepare()
        }

    DisposableEffect(
        AndroidView(factory = {
            StyledPlayerView(context).apply {
                player = exoPlayer
            }
        })
    ) {
        onDispose { exoPlayer.release() }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlayerVideoScreenTopBar(navController: NavController) {
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
                    .width(75.dp).shadow(
                        30.dp,
                        MaterialTheme.shapes.extraLarge,
                        ambientColor = MaterialTheme.colorScheme.primary,
                        spotColor = MaterialTheme.colorScheme.primary
                    )

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


