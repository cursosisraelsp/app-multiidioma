package com.example.multiidioma.ui.components.imaxes

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path

/*
@Composable
fun OrganicShape(modifier: Modifier = Modifier, funcionImaxen: (Size) -> Path,tamanho: Dp) {*/
    @Composable
    fun OrganicShape(modifier: Modifier = Modifier, funcionImaxen: (Size) -> Path,tamanho: Float) {
    Canvas(
        modifier = modifier.fillMaxSize(tamanho)
            //.size(tamanho) // ajusta el tamaño
    ) {
        //val path = ImaxenMultimedia(size)
        val path = funcionImaxen(size)
        drawPath(
            path = path,
            color = Color(0xFF2196F3) // azul similar al PNG
        )
    }
}
