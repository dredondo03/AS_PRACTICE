package me.jesusurbinez.materialdesing
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun StateTextField() {

    var inputUser by remember { mutableStateOf(value = "Jesus") }

    Scaffold() { innerPading ->
        Column(
            modifier = Modifier
                .padding(innerPading)
        ) {
            TextField(
                value = inputUser,
                onValueChange = { it -> inputUser = it },
                label = { Text("Escribe lo que quieras") }
            )
            Text(fontSize = 35.sp, text = "El usuario escribio:")
            Text(fontSize = 35.sp, text = inputUser)
        }

    }
}
