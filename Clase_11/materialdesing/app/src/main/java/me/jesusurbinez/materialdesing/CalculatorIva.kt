package me.jesusurbinez.materialdesing

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun CalculatorIva() {

    var inputAmount by remember { mutableStateOf("") }
    var inputPercent by remember { mutableStateOf("") }
    var switchRounded by remember { mutableStateOf(false) }

    val amount = inputAmount.toDoubleOrNull() ?: 0.0
    val percent = inputPercent.toDoubleOrNull() ?: 0.0

    val result = amount * percent / 100
    val resultRounded = kotlin.math.ceil(result)
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(30.dp)
                .fillMaxSize()
        ) {

            Text(
                text = "Calculadora de impuestos",
                modifier = Modifier.padding(bottom = 16.dp, top = 20.dp),
                fontSize = 25.sp,
                color = Color.Red
            )

            OutlinedTextField(
                value = inputAmount,
                onValueChange = { inputAmount = it },
                label = { Text("Cantidad a calcular") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Decimal
                )
            )

            OutlinedTextField(
                value = inputPercent,
                onValueChange = { inputPercent = it },
                label = { Text("Porcentaje") },
                modifier = Modifier.fillMaxWidth()
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Redondear")
                Switch(
                    checked = switchRounded,
                    onCheckedChange = { switchRounded = it }
                )
            }

            Text(
                text = "Resultado: $ ${if (switchRounded) resultRounded else result}",
                modifier = Modifier.padding(bottom = 16.dp, top = 20.dp),
                fontSize = 25.sp
            )
        }
    }
}