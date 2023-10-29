package com.example.littlelemon

import androidx.compose.foundation.layout.Column
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import kotlinx.coroutines.CoroutineScope

@Composable
fun RightKartPanel(
    scaffoldState: ScaffoldState,
    scope: CoroutineScope
){
    Column {
        Text(text = "Cart coming soon...")
        // From here onwards I can easily implement my LeftDrawablePanel
    }
}
