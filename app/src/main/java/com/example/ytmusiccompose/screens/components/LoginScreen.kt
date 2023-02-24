package com.example.ytmusiccompose.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Key
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.ytmusiccompose.R
import com.example.ytmusiccompose.data.userName

@Composable
fun LoginScreen(navController: NavController) {
    var password = rememberSaveable { mutableStateOf("") }
    Box(){
        Surface(
            modifier = Modifier
                .width(499.dp)
                .zIndex(2f),
            color = Color.Transparent
        ) {
            Column(
                modifier = Modifier
                    .zIndex(2f)
                    .align(Alignment.Center)
            ) {
                Spacer(modifier = Modifier.height(200.dp))
                Column(modifier =Modifier
                    .weight(0.2f)
                    .align(Alignment.CenterHorizontally)

                ) {
                    Image(
                        alignment = Alignment.Center,
                        contentScale = ContentScale.FillHeight,
                        painter = painterResource(id = R.drawable.loginicon),
                        contentDescription = "Login",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(190.dp)
                            .zIndex(2f)


                    )
                }
                Spacer(modifier = Modifier.height(100.dp))
                Column(modifier =Modifier
                    .weight(0.5f)

                ) {


                    var email = rememberSaveable { mutableStateOf("") }
                    TextField(
                        label= { Text(text = "Usuario") },
                        value = email.value ,
                        onValueChange = { email.value = it ;var c1=true},
                        trailingIcon = {Icon(Icons.Filled.AccountCircle, contentDescription = "Visibility")},
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp)
                            .background(color = Color.Transparent)
                            .fillMaxWidth(),
                        colors = TextFieldDefaults.textFieldColors(
                            focusedIndicatorColor =  Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent),
                        shape = MaterialTheme.shapes.extraLarge,
                    )

                    var password = rememberSaveable { mutableStateOf("") }
                    TextField(
                        colors = TextFieldDefaults.textFieldColors(
                            focusedIndicatorColor =  Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent),

                        label= { Text(text = "Contraseña") },
                        value = password.value ,
                        onValueChange = { password.value = it;var c2=true },
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp, top = 30.dp)
                            .background(color = Color.Transparent)
                            .fillMaxWidth()

                        ,
                        shape = MaterialTheme.shapes.extraLarge,



                        trailingIcon = {Icon(Icons.Filled.Key, contentDescription = "Visibility")},
                        visualTransformation = object : VisualTransformation {
                            override fun filter(text: AnnotatedString): TransformedText {
                                return TransformedText(
                                    AnnotatedString("*".repeat(text.length)),
                                    OffsetMapping.Identity
                                )
                            }
                        }
                    )

                    Button(
                        shape = MaterialTheme.shapes.extraLarge,
                        onClick = {
                                  if(email.value == "admin" && password.value == "admin"){
                                      navController.navigate("FirstScreen")
                                      userName.value = email.value
                                  }
                                  },
                        modifier = Modifier
                            .width(90.dp)
                            .align(Alignment.CenterHorizontally)
                            .height(90.dp)
                            .zIndex(2f)
                            .padding(top = 40.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor =Color.White,
                            contentColor = MaterialTheme.colorScheme.primary


                    ))
                    {

                        Icon(Icons.Filled.ArrowForward, contentDescription = "Visibility", modifier = Modifier
                        )
                    }
                }


            }
        }
        Image(
            contentScale = ContentScale.FillBounds,
            painter = painterResource(id = R.drawable.fondologin),
            contentDescription = "Login",
            modifier = Modifier
                .fillMaxSize()
                .zIndex(1f)
                .blur(50.dp)
        )
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .zIndex(0f),
            color = MaterialTheme.colorScheme.primary
        ){}

    }

}
