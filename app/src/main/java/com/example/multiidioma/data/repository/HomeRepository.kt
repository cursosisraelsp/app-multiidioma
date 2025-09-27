package com.example.multiidioma.data.repository
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.ImaxenClickData
import com.example.multiidioma.data.types.ListaImaxenClickData
import com.example.multiidioma.ui.screens.home.figurasHome
import com.example.multiidioma.utils.imaxes.ImaxenMapa
import com.example.multiidioma.utils.imaxes.ImaxenMultimedia
import com.example.multiidioma.utils.imaxes.institutosCentrosSingularesPath
import com.example.multiidioma.utils.imaxes.institutosInvestigacionPath

val imaxenClickMultimedia = ImaxenClickData(
    id = "1",
    title = R.string.multimedia,
    funcionImaxen = { size: Size -> ImaxenMultimedia(size) },// ::ImaxenMultimedia
    xOffset = 100.dp,// negativos móvese a esquerda
    yOffset = 250.dp,// negativos móvese cara abaixo
    //tamanho = 175.dp,
    tamanho = 0.45f,
    ruta = "multimedia",
    contentType = ContentType.MultimediaContent
)
val imaxenClickMapa = ImaxenClickData(
    id = "2",
    title = R.string.map,
    funcionImaxen = { size: Size -> ImaxenMapa(size) },// ::ImaxenMapa
    xOffset = 50.dp,    // mueve 150 dp a la derecha
    yOffset = 500.dp,    // mueve 10 dp hacia arriba
    //tamanho = 80.dp,
    tamanho = 0.2f,
    ruta = "mapa",
    contentType = ContentType.MapContent
)
val imaxenClickInstitutos = ImaxenClickData(
    id = "3",
    title = R.string.institutos,
    funcionImaxen = {size: Size -> institutosInvestigacionPath(size)},
    xOffset = 200.dp,
    yOffset = 50.dp,
    //tamanho = 150.dp,
    tamanho = 0.3f,
    ruta = "institutos",
    contentType = ContentType.InstitutoInvestigation
)
val imaxenClickCentrosSingulares = ImaxenClickData(
    id = "4",
    title = R.string.centrossingulares,
    funcionImaxen = {size: Size -> institutosCentrosSingularesPath(size)},
    xOffset = 20.dp,
    yOffset = 80.dp,
    //tamanho = 125.dp,
    tamanho = 0.4f,
    ruta = "centrossingulares",
    contentType = ContentType.CentroSingularContent
)
val imaxenClickMinerva = ImaxenClickData(
    id = "5",
    title = R.string.minerva,
    funcionImaxen = {size: Size -> institutosCentrosSingularesPath(size)},
    xOffset = 0.dp,
    yOffset = 0.dp,
    //tamanho = 125.dp,
    tamanho = 0.3f,
    ruta = "minerva",
    contentType = ContentType.MinervaContent
)
val formasClickHome = listOf(
    imaxenClickMultimedia,
    imaxenClickMapa,
    imaxenClickInstitutos,
    imaxenClickCentrosSingulares,
    imaxenClickMinerva)

val listaImaxesHome = ListaImaxenClickData(figurasHome)