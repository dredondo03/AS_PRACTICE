package me.danielredondo.contenedores_dr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.danielredondo.contenedores_dr.ui.theme.Contenedores_drTheme

private val ui: Any

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContentScreen()

        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun ContentScreen() {
    Column(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .padding(18.dp), horizontalArrangement = Arrangement.Center


        ) {
            Text(
                text = "Inicio",
                modifier = Modifier
                    .background(Color.Green)
                    .padding(8.dp)
            )

            Text(
                text = "Perfil",
                modifier = Modifier
                    .background(Color.Yellow)
                    .padding(8.dp)
            )

            Text(
                text = "Configuracion",
                modifier = Modifier
                    .background(Color.Red)
                    .padding(8.dp)
            )

        }
        Text(
            text = "Asi pongo las cosas debajo del row",
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .padding(8.dp)
        )
        Text(
            text = "Papapa",
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .padding(8.dp)

        )
        Text(
            text = "uno dos tres",
            modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .padding(8.dp)

        )
    }
}

@Composable
@Preview(showSystemUi = true)
fun Contenedor() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val imagen = painterResource(R.drawable.check)
        Image(
            painter = imagen,
            contentDescription = "Check",
            modifier = Modifier
                .width(width = 200.dp)
                .height(height = 200.dp),


            )
        Text(
            text = "All Tasks Completed",
            fontWeight = FontWeight.Bold
        )
        Text(text = "Nice Job!")
    }


}

@Composable
@Preview(showSystemUi = true)
fun Tercer_eje(){
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            Column(modifier = Modifier.background(Color.Green).weight(1f)) {
                Text(text = "holala")
                Text(text = "holala")
            }
            Column(modifier = Modifier.background(Color.Magenta).weight(1f)) {
                Text(text = "holala")
                Text(text = "holala")
            }
            Row(modifier = Modifier.weight(1f)) {
                Column(modifier = Modifier.background(Color.Red).weight(1f)) {
                    Text(text = "holala")
                    Text(text = "holala")
                }
                Column(modifier = Modifier.background(Color.Cyan).weight(1f)) {
                    Text(text = "holala")
                    Text(text = "holala")
        }
    }
}}}
