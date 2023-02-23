package com.example.ytmusiccompose.screens.components

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.ytmusiccompose.R

class Wallpaper {
    @SuppressLint("NotConstructor")
    @Composable
    fun Wallpaper() {

        if (isSystemInDarkTheme()){
            Image(
                alignment = Alignment.Center,
                contentScale = ContentScale.FillBounds,
                painter = painterResource(id = R.drawable.rectangle_18_4),
                contentDescription = stringResource(id = R.string.rectangle_13),
                modifier = Modifier
                    .blur(0.dp)
                    .zIndex(1f)
                    .width(1700.dp)
                    .height(1100.dp)
                    .background(color = Color.Black)

                ,
                colorFilter  = androidx.compose.ui.graphics.ColorFilter.tint(MaterialTheme.colorScheme.surfaceTint)

            )
        }
        else{
            Image(
                alignment =Alignment.TopCenter,
                contentScale = ContentScale.FillBounds,
                painter = painterResource(id = R.drawable.rectangle_18_4),
                contentDescription = stringResource(id = R.string.rectangle_13),
                modifier = Modifier
                    .blur(0.dp)
                    .zIndex(1f)
                    .width(1700.dp)
                    .height(1100.dp)
            )
        }

    }
}