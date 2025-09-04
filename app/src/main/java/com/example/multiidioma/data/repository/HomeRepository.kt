package com.example.multiidioma.data.repository
import com.example.multiidioma.data.ImaxenClickData
import com.example.multiidioma.utils.imaxes.ImaxenMultimedia
import androidx.compose.ui.geometry.Size
import com.example.multiidioma.R
import com.example.multiidioma.data.ListaImaxenClickData
import com.example.multiidioma.utils.imaxes.ImaxenMapa

val imaxenClickMultimedia = ImaxenClickData(
    id = "1",
    title = R.string.multimedia,
    funcionImaxen = { size: Size -> ImaxenMultimedia(size) },// ::ImaxenMultimedia
    xOffset = (0f),// negativos móvese a esquerda
    yOffset = 10f// negativos móvese cara arriba
)
val imaxenClickMapa = ImaxenClickData(
    id = "2",
    title = R.string.map,
    funcionImaxen = { size: Size -> ImaxenMapa(size) },// ::ImaxenMapa
    xOffset = 150f,    // mueve 150 dp a la derecha
    yOffset = -10f    // mueve 10 dp hacia arriba
)

val formasClickHome = listOf(imaxenClickMultimedia, imaxenClickMapa)

val listaImaxesHome = ListaImaxenClickData(formasClickHome)