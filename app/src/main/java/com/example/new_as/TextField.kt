package com.example.new_as

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun statetextfield(){
    var inputText by remember { mutableStateOf("Mambo") }
    Scaffold (){innerpadding ->
        Column (modifier = Modifier.padding(innerpadding)
        ){ TextField(
            value = inputText,
            onValueChange = {inputText = it} //Lambda que permite que el usuario escriba
        )
            Text(text = "resultado: $inputText",
                fontSize = 30.sp)
        } //dos momentos, value lo que muestra y onvalue que es la actu
    }
}