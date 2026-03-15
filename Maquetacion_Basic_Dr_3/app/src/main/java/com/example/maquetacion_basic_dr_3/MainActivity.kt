package com.example.maquetacion_basic_dr_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.maquetacion_basic_dr_3.ui.theme.Maquetacion_Basic_Dr_3Theme
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.ExperimentalLayoutApi

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            primero()
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun primero() {
    val painter = painterResource(id = R.drawable.lapc)
    val painterr = painterResource(id = R.drawable.trashcan)
    val painterja = painterResource(id = R.drawable.lapi)

    Column(

        modifier = Modifier,


        ) {
        Image(
            painter, contentDescription = "L",
            modifier = Modifier
                .size(250.dp)
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)


        )

        Text(
            text = "Nombre del Producto",
            modifier = Modifier,
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp

        )
        Text(
            text = "100000$",
            modifier = Modifier,
            color = Color.Green,
            fontSize = 26.sp
        )
        Text(
            text = "El Asus vivobook mas potente de la historia"
        )

        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(

                )
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Row(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 6.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFF7E57C2))
                    .clip(RoundedCornerShape(8.dp))
                    .padding(vertical = 12.dp),
                horizontalArrangement = Arrangement.Center
            ) {

                Image(painterr, contentDescription = "Lapiz", modifier = Modifier.size(18.dp))

                Text(
                    " Editar",
                    style = TextStyle(color = Color.White)
                )

            }

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 6.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.Red)
                    .padding(vertical = 12.dp),

                ) {
                Image(
                    painterja,
                    contentDescription = "pote basura",
                    modifier = Modifier.size(18.dp)
                )

                Text(
                    " Eliminar",
                    style = TextStyle(color = Color.White)
                )

            }

        }

    }

}

@Composable
@Preview(showSystemUi = true)
fun text() {
    val paintercinco = painterResource(id = R.drawable.jetjet)

    Column(
        modifier = Modifier


    ) {

        Image(
            paintercinco, contentDescription = "jojo"
        )
        Text(
            text = "Jetpack Compose Tutorial",
            modifier = Modifier
                .padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, nd intuitive Kotlin APIS.",
            modifier = Modifier
                .padding(16.dp),

            )
        Text(
            text = "In this tutorial, you build a simple Ul component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the Ul's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            modifier = Modifier
                .padding(16.dp)
        )

    }
}

@Preview(showSystemUi = true)
@Composable
fun perfil() {
    val yo = painterResource(id = R.drawable.clove)
    val foto = painterResource(id = R.drawable.noalcancehacercaja)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(
            painter = yo,
            contentDescription = "LA CLOVe",

            modifier = Modifier
                .size(150.dp)
                .align(Alignment.CenterHorizontally)
                .clip(CircleShape)
        )
        Text(
            text = "Clove",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp), // Ajustado el padding
            fontWeight = FontWeight.Bold,
            fontSize = 27.sp,

            )
        Text(
            text = "Personaje de Valorant y desarrolladora de Android Studio apasionada por el diseño y tecnología",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
            fontSize = 15.sp,
            textAlign = TextAlign.Center
        )

        //Row que hace que no se vea sdisparejo
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            // Columna 1
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "3", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text(text = "Posts", color = Color.Magenta, fontSize = 14.sp)
            }

            // Columna 2
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "10k", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text(text = "Seguidores", color = Color.Magenta, fontSize = 14.sp)
            }

            // Columna 3
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "389k", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text(text = "Likes", color = Color.Magenta, fontSize = 14.sp)
            }

        }
        // Botones ---Repasar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .background(Color(0xFF6A53A1))

                    .padding(vertical = 12.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Seguir",
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold
                )
            }


            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(CircleShape)
                    .border(1.dp, Color.LightGray, CircleShape)
                    .padding(vertical = 12.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Mensaje",
                    color = Color(0xFF6A53A1),
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
        Text(
            text = "Intereses",
            modifier = Modifier
                .padding(16.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Caja 1
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFFE0E0E0))
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text(text = "Ciclismo", color = Color.Black)
            }

            // Caja 2
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFFE0E0E0))
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text(text = "Gaming", color = Color.Black)
            }

            // Caja 3
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFFE0E0E0))
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text(text = "Música", color = Color.Black)
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Caja 1
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFFE0E0E0))
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text(text = "Jugar", color = Color.Black)
            }

            // Caja 2
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFFE0E0E0))
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text(text = "Comer", color = Color.Black)
            }

            // Caja 3
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFFE0E0E0))
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text(text = "Gym", color = Color.Black)
            }



    }
        Text(
            text = "Proyectos Recientes",
            modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

// Tarjeta del Proyecto
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(12.dp)) // Bordes redondeados de la tarjeta
                .background(Color(0xFF8E8E8E)) // Color gris de fondo de la imagen
        ) {
            // 1. Imagen del proyecto (Ciclismo)
            Image(
                painter = painterResource(id = R.drawable.clove), // Cambia por tu imagen de la bici
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp), // Tamaño fijo para la imagen
                contentScale = ContentScale.Crop
            )

            // 2. Contenedor de texto y botón
            Column(
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "App de Ciclismo",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black
                )
                Text(
                    text = "Aplicación para rastrear rutas de ciclismo con mapas y estadísticas.",
                    fontSize = 13.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(vertical = 4.dp)
                )

                // Espaciador para empujar el botón a la derecha
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
                    // Botón "Ver más"
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(Color(0xFF6A53A1)) // Morado Clove
                            .padding(horizontal = 16.dp, vertical = 6.dp)
                    ) {
                        Text(
                            text = "Ver más",
                            color = Color.White,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }

}
}