package com.danielredondo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun StateTexxtField(){
    Scaffold() { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) { TextField(
            value = "",
            onValueChange = {}
        ) }
    }
}