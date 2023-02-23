package com.example.ytmusiccompose.screens.components

import android.annotation.SuppressLint
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Chips {
    @SuppressLint("NotConstructor")
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Chips(

    ) {
        Row(
            modifier = Modifier.height(90.dp).scrollable(
                orientation = Orientation.Horizontal,
                state = ScrollState(0)
            ).horizontalScroll(ScrollState(0)).padding(top = 45.dp)
            //añadir pading entre chips
        ) {
            AssistChip(
                onClick = { /* Do something! */ },
                label = { Text("Relajacion", color = MaterialTheme.colorScheme.inverseOnSurface) },
                shape = MaterialTheme.shapes.extraLarge,
                modifier = Modifier.padding(start=10.dp).height(90.dp)
                    .shadow(10.dp, MaterialTheme.shapes.extraLarge, spotColor = MaterialTheme.colorScheme.inverseSurface)
            )

            AssistChip(
                onClick = { /* Do something! */ },
                label = { Text("Diversión", color = MaterialTheme.colorScheme.inverseOnSurface) },
                shape = MaterialTheme.shapes.extraLarge,
                modifier = Modifier.padding(start=10.dp).height(100.dp)
                    .shadow(10.dp, MaterialTheme.shapes.extraLarge, spotColor = MaterialTheme.colorScheme.inverseSurface)
            )
            AssistChip(
                onClick = { /* Do something! */ },
                label = { Text("Concentración", color = MaterialTheme.colorScheme.inverseOnSurface) },
                shape = MaterialTheme.shapes.extraLarge,
                modifier = Modifier.padding(start=10.dp).height(100.dp)
                    .shadow(10.dp, MaterialTheme.shapes.extraLarge, spotColor = MaterialTheme.colorScheme.inverseSurface)
            )
            AssistChip(
                onClick = { /* Do something! */ },
                label = { Text("Concentración", color = MaterialTheme.colorScheme.inverseOnSurface)  },
                shape = MaterialTheme.shapes.extraLarge,
                modifier = Modifier.padding(start=10.dp).height(100.dp)
                    .shadow(10.dp, MaterialTheme.shapes.extraLarge, spotColor = MaterialTheme.colorScheme.inverseSurface)
            )
            AssistChip(
                onClick = { /* Do something! */ },
                label = { Text("Relajacion", color = MaterialTheme.colorScheme.inverseOnSurface)  },
                shape = MaterialTheme.shapes.extraLarge,
                modifier = Modifier.padding(start=10.dp).height(100.dp)
                    .shadow(10.dp, MaterialTheme.shapes.extraLarge, spotColor = MaterialTheme.colorScheme.inverseSurface)
            )
            AssistChip(
                onClick = { /* Do something! */ },
                label = { Text("Relajacion", color = MaterialTheme.colorScheme.inverseOnSurface) },
                shape = MaterialTheme.shapes.extraLarge,
                modifier = Modifier.padding(start=10.dp).height(100.dp)
                    .shadow(10.dp, MaterialTheme.shapes.extraLarge, spotColor = MaterialTheme.colorScheme.inverseSurface)
            )
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Chips()
    }
}