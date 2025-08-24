package com.example.multiidioma.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.multiidioma.R
import com.example.multiidioma.ui.LocalizedContext

@Composable
fun HomeScreen(){
    val context = LocalizedContext.current
    Text(text = context.getString(R.string.greeting))
}