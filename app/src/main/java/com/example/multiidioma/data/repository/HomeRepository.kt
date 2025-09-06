package com.example.multiidioma.data.repository
import com.example.multiidioma.data.types.ImaxenClickData
import com.example.multiidioma.utils.imaxes.ImaxenMultimedia
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.ListaImaxenClickData
import com.example.multiidioma.utils.imaxes.ImaxenMapa
import com.example.multiidioma.utils.imaxes.institutosInvestigacionPath

val imaxenClickMultimedia = ImaxenClickData(
    id = "1",
    title = R.string.multimedia,
    funcionImaxen = { size: Size -> ImaxenMultimedia(size) },// ::ImaxenMultimedia
    xOffset = (0f),// negativos móvese a esquerda
    yOffset = 10f,// negativos móvese cara arriba
    tamanho = 175.dp,
    ruta = "multimedia",
    contentType = ContentType.MultimediaContent
)
val imaxenClickMapa = ImaxenClickData(
    id = "2",
    title = R.string.map,
    funcionImaxen = { size: Size -> ImaxenMapa(size) },// ::ImaxenMapa
    xOffset = 150f,    // mueve 150 dp a la derecha
    yOffset = -10f,    // mueve 10 dp hacia arriba
    tamanho = 80.dp,
    ruta = "mapa",
    contentType = ContentType.MapContent
)
val imaxenClickInstitutos = ImaxenClickData(
    id = "3",
    title = R.string.institutos,
    funcionImaxen = {size: Size -> institutosInvestigacionPath(size)},
    xOffset = 200f,
    yOffset = 50f,
    tamanho = 150.dp,
    ruta = "institutos",
    contentType = ContentType.InstitutoInvestigation
)
val formasClickHome = listOf(imaxenClickMultimedia, imaxenClickMapa,imaxenClickInstitutos)

val listaImaxesHome = ListaImaxenClickData(formasClickHome)