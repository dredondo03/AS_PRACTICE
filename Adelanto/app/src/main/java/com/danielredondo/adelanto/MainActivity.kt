package com.danielredondo.adelanto

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.danielredondo.adelanto.ui.theme.AdelantoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StateScreen()

        }
    }
}
@Composable
@Preview(showSystemUi = true)
fun StateScreen(){
    val context = LocalContext.current
    //Nuevo
    var contador by remember { mutableStateOf(0) }//var porque va a cambiar -esto es un estado
    Scaffold() {innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally, //centra horizontalmente
            verticalArrangement = Arrangement.Center) {//centra verticalmente
            Text(text = "Contador: $contador", fontSize = 30.sp)
            Spacer(modifier = Modifier.height(16.dp))
//Nuevoooo
            Button(onClick = {
                contador = contador + 1
                Toast
                    .makeText(context,"Di click", Toast.LENGTH_LONG)
                    .show()
            }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null
                )
                Text(text = "Sumar")
            }
        }

    }
}

