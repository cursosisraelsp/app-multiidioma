package com.example.multiidioma.data.types

import androidx.annotation.StringRes
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.Dp

data class ImaxenClickData(
    val id: String,
    @StringRes val title: Int,
    val funcionImaxen: (Size)->Path,
    val xOffset: Float?,
    val yOffset: Float?,
    val tamanho: Dp,
    val contentType: ContentType?,
    val ruta: String
)

data class ListaImaxenClickData(
    val lista: List<ImaxenClickData> = emptyList() // se non se coloca emptyList sae erro no ViewModel
)


