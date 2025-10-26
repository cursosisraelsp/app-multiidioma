package com.example.multiidioma.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.multiidioma.data.imaxesJPG
import com.example.multiidioma.data.urlRecursosApp


@Composable
fun ImageAsyncVimeo(){
    AsyncImage(
        model = "$urlRecursosApp/$imaxesJPG/logo_vimeo.jpeg",
        contentDescription = "Imagen remota en formato jpeg",
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(20.dp)
    )

}