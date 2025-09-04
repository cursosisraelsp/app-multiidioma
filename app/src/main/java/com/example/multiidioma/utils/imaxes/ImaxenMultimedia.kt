package com.example.multiidioma.utils.imaxes

import androidx.compose.ui.graphics.Path
import androidx.compose.ui.geometry.Size

fun ImaxenMultimedia(size: Size) : Path {
    return Path().apply {
        // Empezamos en la parte superior
        moveTo(size.width * 0.5f, 0f)

        // Curva hacia la derecha
        cubicTo(
            size.width * 0.9f, 0f,
            size.width, size.height * 0.3f,
            size.width * 0.95f, size.height * 0.5f
        )

        // Curva hacia abajo
        cubicTo(
            size.width, size.height * 0.8f,
            size.width * 0.7f, size.height,
            size.width * 0.5f, size.height
        )

        // Curva hacia la izquierda
        cubicTo(
            size.width * 0.2f, size.height,
            0f, size.height * 0.7f,
            0f, size.height * 0.5f
        )

        // Curva hacia arriba
        cubicTo(
            0f, size.height * 0.2f,
            size.width * 0.1f, 0f,
            size.width * 0.5f, 0f
        )
        close()
    }
}