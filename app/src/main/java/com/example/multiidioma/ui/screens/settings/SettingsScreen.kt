package com.example.multiidioma.ui.screens.settings

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.multiidioma.R
import com.example.multiidioma.ui.LocalizedContext

@Composable
fun SettigsScreen(){
    val context = LocalizedContext.current
    Text(text = context.getString(R.string.greeting))
}