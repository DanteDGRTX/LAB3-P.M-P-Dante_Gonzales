package com.example.lab3_pm_dante_gonzales

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                TarjetaPresentacion()
            }
        }
    }
}

@Composable
fun TarjetaPresentacion() {

    val dorado = Color(0xFFF09716)
    val doradoSuave = Color(0xFFE7B76A)
    val negroTransparente = Color.Black.copy(alpha = 0.72f)

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.fondo),
            contentDescription = "Fondo de la aplicación",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 28.dp,
                    end = 28.dp,
                    top = 70.dp,
                    bottom = 35.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "B I E N V E N I D O   A L   C U R S O",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = dorado
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Programación\nen Móviles",
                fontSize = 38.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(22.dp))

            Text(
                text = "Dante Gonzales",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = doradoSuave
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Android 14",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(35.dp))

            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(18.dp),
                color = negroTransparente,
                border = BorderStroke(1.dp, dorado)
            ) {

                Column(
                    modifier = Modifier.padding(
                        horizontal = 22.dp,
                        vertical = 20.dp
                    )
                ) {

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.ic_phone),
                            contentDescription = "Teléfono",
                            modifier = Modifier.size(28.dp)
                        )

                        Spacer(modifier = Modifier.width(18.dp))

                        Column {
                            Text(
                                text = "TELÉFONO",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = dorado
                            )

                            Text(
                                text = "9666683486",
                                fontSize = 17.sp,
                                color = Color.White
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.ic_share),
                            contentDescription = "Usuario",
                            modifier = Modifier.size(28.dp)
                        )

                        Spacer(modifier = Modifier.width(18.dp))

                        Column {
                            Text(
                                text = "USUARIO",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = dorado
                            )

                            Text(
                                text = "@DanteDG",
                                fontSize = 17.sp,
                                color = Color.White
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.ic_mail),
                            contentDescription = "Correo",
                            modifier = Modifier.size(28.dp)
                        )

                        Spacer(modifier = Modifier.width(18.dp))

                        Column {
                            Text(
                                text = "CORREO",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = dorado
                            )

                            Text(
                                text = "ronal.gonzales@tecsup.edu.pe",
                                fontSize = 15.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(28.dp))

            Text(
                text = "ANDROID + KOTLIN + GONZALES",
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                color = doradoSuave
            )
        }
    }
}

@Composable
fun GreetingCard() {

    val dorado = Color(0xFFE7B76A)
    val negroTransparente = Color.Black.copy(alpha = 0.68f)

    var nombre by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.fondo),
            contentDescription = "Fondo de la aplicación",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
// DANTE GONZALES
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 55.dp,
                    bottom = 30.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            Text(
                text = "B I E N V E N I D O   A L   C U R S O",
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                color = dorado,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(
                modifier = Modifier.height(10.dp)
            )

            Text(
                text = "Programación",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.fillMaxWidth()
            )

            Text(
                text = "en Móviles",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = dorado,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(
                modifier = Modifier.height(18.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(
                        id = R.drawable.ic_person
                    ),
                    contentDescription = "Usuario",
                    modifier = Modifier.size(24.dp)
                )

                Spacer(
                    modifier = Modifier.width(10.dp)
                )

                Text(
                    text = "Hola, Dante Gonzales!",
                    fontSize = 18.sp,
                    color = Color.White
                )
            }

            Spacer(
                modifier = Modifier.height(20.dp)
            )

            OutlinedTextField(
                value = nombre,

                onValueChange = {
                    nombre = it
                },

                placeholder = {
                    Text(
                        text = "Ingresa tu nombre",
                        color = Color.LightGray
                    )
                },

                leadingIcon = {

                    Image(
                        painter = painterResource(
                            id = R.drawable.ic_person
                        ),
                        contentDescription = "Usuario",
                        modifier = Modifier.size(22.dp)
                    )
                },

                modifier = Modifier.fillMaxWidth(),

                shape = RoundedCornerShape(12.dp),

                colors = TextFieldDefaults.colors(

                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,

                    focusedContainerColor = negroTransparente,
                    unfocusedContainerColor = negroTransparente,

                    focusedLabelColor = dorado,
                    unfocusedLabelColor = Color.LightGray,

                    focusedIndicatorColor = dorado,
                    unfocusedIndicatorColor = dorado,

                    cursorColor = dorado
                )
            )

            Spacer(
                modifier = Modifier.height(22.dp)
            )
// DANTE GONZALES
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Button(
                    onClick = {
                    },

                    modifier = Modifier.width(135.dp),

                    shape = RoundedCornerShape(12.dp),

                    border = BorderStroke(
                        width = 1.dp,
                        color = dorado
                    ),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = negroTransparente,
                        contentColor = Color.White
                    )
                ) {

                    Text(
                        text = "Aceptar",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }

                Button(
                    onClick = {

                    },

                    modifier = Modifier.width(135.dp),

                    shape = RoundedCornerShape(12.dp),

                    border = BorderStroke(
                        width = 1.dp,
                        color = dorado
                    ),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = negroTransparente,
                        contentColor = Color.White
                    )
                ) {

                    Text(
                        text = "Rechazar",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewGreetingCard() {
    GreetingCard()
}