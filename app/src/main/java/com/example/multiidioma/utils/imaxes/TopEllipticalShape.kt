package com.example.multiidioma.utils.imaxes

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class TopEllipticalShape : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path().apply {
            // Empieza en la esquina inferior izquierda
            moveTo(0f, size.height)
            // Dibuja una línea hasta la esquina superior izquierda
            lineTo(0f, size.height / 2f)

            // Dibuja la curva elíptica superior
            arcTo(
                rect = Rect(
                    left = 0f,
                    top = 0f,
                    right = size.width,
                    bottom = size.height
                ),
                startAngleDegrees = 180f,
                sweepAngleDegrees = 180f,
                forceMoveTo = false
            )

            // Dibuja una línea hasta la esquina inferior derecha
            lineTo(size.width, size.height)

            // Cierra la forma
            close()
        }
        return Outline.Generic(path)
    }
}