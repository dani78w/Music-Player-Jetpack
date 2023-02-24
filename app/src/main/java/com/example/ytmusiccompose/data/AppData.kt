package com.example.ytmusiccompose.data

import androidx.compose.runtime.mutableStateOf
import com.example.ytmusiccompose.R

var userName= mutableStateOf("user")
/*Canciones y caratulas*/
var actual = mutableStateOf(0)
var estadoActual = mutableStateOf(0)
var progresoActual = mutableStateOf(0.5f)
var canciones = arrayOf(R.raw.singmetosleep, R.raw.hypnotized)
var nombres = arrayOf("Sing me to sleep", "Hypnotized")
var caratulas = arrayOf(R.drawable.alanphoto, R.drawable.deamphoto)
var artistas = arrayOf("Alan Walker","Deamn")
var videos = arrayOf("https://storage.googleapis.com/exoplayer-test-media-0/BigBuckBunny_320x180.mp4","https://storage.googleapis.com/exoplayer-test-media-0/BigBuckBunny_320x180.mp4")

