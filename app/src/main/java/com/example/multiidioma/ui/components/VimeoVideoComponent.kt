package com.example.multiidioma.ui.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MultimediaData
import com.example.multiidioma.utils.currentAppLanguage

@Composable
fun LanguageBasedVimeoVideo(videoUrl: String,imaxen:  @Composable () -> Unit,descripcion: String) {
    val context = LocalContext.current
Column(modifier = Modifier.fillMaxWidth()
    .height(500.dp).border(width = 1.dp, color = Color.LightGray),verticalArrangement = Arrangement.SpaceBetween){
    Column(modifier = Modifier.clickable {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl))
        context.startActivity(intent)
    }) {
        imaxen()
        //Text(text = "descripcion", modifier = Modifier.padding(24.dp))

    }
    Text(text = descripcion, modifier = Modifier.padding(24.dp), color = Color.Red)
}

}
