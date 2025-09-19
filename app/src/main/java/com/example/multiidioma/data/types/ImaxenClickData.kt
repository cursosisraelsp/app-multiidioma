package com.example.multiidioma.data.types

import androidx.annotation.StringRes
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path


data class ImaxenClickData(
    val id: String,
    @StringRes val title: Int,
    val funcionImaxen: (Size)->Path,
    val xOffset: Float?,
    val yOffset: Float?,
    //val tamanho: Dp,
    val tamanho: Float,
    val contentType: ContentType?,
    val ruta: String
)

/*
data class ImaxenClickData(
    val id: String,
    val title: Int,
    val funcionImaxen: (Size) -> Unit,
    val xOffset: (Size) -> Float,   // antes Float fijo
    val yOffset: (Size) -> Float,
    val tamanho: (Size) -> Dp,      // también dinámico
    val ruta: String,
    val contentType: ContentType
)
*/
data class ListaImaxenClickData(
    val lista: List<ImaxenClickData> = emptyList() // se non se coloca emptyList sae erro no ViewModel
)


