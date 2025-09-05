package com.example.multiidioma.utils.imaxes

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp

fun institutosInvestigacionPath(size: Size): Path {
    return Path().apply {
        moveTo(size.width * 0.5f, 0f)

        // Parte superior derecha
        cubicTo(
            size.width * 0.85f, 0f,
            size.width, size.height * 0.3f,
            size.width * 0.95f, size.height * 0.5f
        )

        // Parte inferior derecha
        cubicTo(
            size.width, size.height * 0.8f,
            size.width * 0.65f, size.height,
            size.width * 0.5f, size.height
        )

        // Parte inferior izquierda
        cubicTo(
            size.width * 0.25f, size.height,
            0f, size.height * 0.75f,
            0f, size.height * 0.5f
        )

        // Parte superior izquierda
        cubicTo(
            0f, size.height * 0.25f,
            size.width * 0.15f, 0f,
            size.width * 0.5f, 0f
        )

        close()
    }
}

@Composable
fun InstitutosInvestigacionShape(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.size(200.dp)) {
        drawPath(
            path = institutosInvestigacionPath(size),
            color = Color(0xFF2196F3) // Azul del PNG
        )
    }
}
