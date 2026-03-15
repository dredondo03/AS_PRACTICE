package com.danielredondo.quizandroid

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.danielredondo.quizandroid.ui.theme.QuizAndroidDanielRedondoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            pantUno()

        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun pantUno() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween) {
        Row(
            modifier = Modifier
                .background(color = Color.Blue)
                .clip(CircleShape)
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally),



            ) {
            Text(
                text = "Encabezado",
                modifier = Modifier,
                fontSize = 20.sp,
                textAlign= TextAlign.Center


            )
        }




        Row(modifier = Modifier
            .background(color = Color.Green)
            .clip(CircleShape)
            .padding(26.dp)
            .align(alignment = Alignment.CenterHorizontally)
        ) {Row(
            modifier = Modifier
                .clip(CircleShape)
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween



        ) {
            Text(
                text = "Item 1",
                modifier = Modifier
                    .background(color = Color.Yellow)
                    .padding(
                        start = 26.dp,
                        top = 16.dp,
                        end = 26.dp,
                        bottom = 16.dp
                    ),
                fontSize = 15.sp,
                textAlign= TextAlign.Center


            )
            Text(
                text = "Item 2",
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(
                        start = 26.dp,
                        top = 16.dp,
                        end = 26.dp,
                        bottom = 16.dp
                    ),
                fontSize = 15.sp,
                textAlign= TextAlign.Center


            )
            Text(
                text = "Item 3",
                modifier = Modifier
                    .background(color = Color.Gray)
                    .padding(
                        start = 26.dp,
                        top = 16.dp,
                        end = 26.dp,
                        bottom = 16.dp
                    ),
                fontSize = 15.sp,
                textAlign= TextAlign.Center


            )
        }

        }
        Row(
            modifier = Modifier

                .clip(CircleShape)
                .padding(10.dp)
                .align(alignment = Alignment.CenterHorizontally),
            horizontalArrangement = Arrangement.SpaceBetween



        ) {
            Text(
                text = "Pie de Pagina",
                modifier = Modifier
                    .background(color = Color.Yellow)

                    .padding(
                        start = 26.dp,
                        top = 16.dp,
                        end = 26.dp,
                        bottom = 16.dp

                    ),
                fontSize = 15.sp,
                textAlign= TextAlign.Center


            )
    }

}}

@Preview(showSystemUi = true)
@Composable
fun tres () {
    val painter = painterResource(id = R.drawable.imgx)
    Row() {
        Image(
            painter = painter, contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .size(150.dp),


        )

    }
    Text(text = "Daniel Redondo",
    modifier = Modifier,
    fontWeight = FontWeight.Bold,
    textAlign = TextAlign.Center)
    Text(text = "Desarrollador y creador de paginas web, apasionado por la tecnologia y el diseño")


}