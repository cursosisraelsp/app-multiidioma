package com.example.multiidioma.ui.components

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages

@Composable
fun ImageAsincComponent(data: MiniScreenData, style: StyleImages) {
    // AsyncImage es la Composable de Coil que maneja la carga remota.
    data.urlImage?.let { res ->
        Log.d("ImageAsincComponent", "Intentando cargar imagen: $res")

        AsyncImage(
            model = res,
            contentDescription = "Imagen de perfil del usuario",
            contentScale = style.contentScale,
            modifier = style.modifier,
            alignment = style.alignment
        )
    } ?: Log.e("ImageAsincComponent", "⚠️ urlImage es nula")

}