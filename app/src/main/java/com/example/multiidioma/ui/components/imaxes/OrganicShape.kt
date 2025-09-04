package com.example.multiidioma.ui.components.imaxes

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Path
import com.example.multiidioma.utils.imaxes.ImaxenMultimedia
import androidx.compose.ui.geometry.Size
@Composable
fun OrganicShape(modifier: Modifier = Modifier, funcionImaxen: (Size) -> Path) {
    Canvas(
        modifier = modifier
            .size(200.dp) // ajusta el tamaño
    ) {
        //val path = ImaxenMultimedia(size)
        val path = funcionImaxen(size)
        drawPath(
            path = path,
            color = Color(0xFF2196F3) // azul similar al PNG
        )
    }
}
