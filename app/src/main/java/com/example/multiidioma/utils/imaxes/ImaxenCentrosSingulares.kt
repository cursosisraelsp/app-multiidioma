package com.example.multiidioma.utils.imaxes


import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path

fun institutosCentrosSingularesPath(size: Size): Path {
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


