package com.example.hoy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.edwinalejandro.instagram2.ui.screens.FeedScreen
import com.edwinalejandro.instagram2.ui.theme.Instagram2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            hoyTheme{
                FeedScreen()
            }
        }
    }
}

