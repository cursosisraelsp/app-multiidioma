package com.example.multiidioma.ui.screens.institutes.ihus

import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.LetraMediana
import com.example.multiidioma.data.LineHeightMediana
import com.example.multiidioma.data.NumeroMediano
import com.example.multiidioma.data.anchoTextoMediano
import com.example.multiidioma.data.numLetra2
import com.example.multiidioma.data.numNumero
import com.example.multiidioma.data.relacionTexto
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.data.types.PersonResearcher



val valorFiguraIhus0 = NavegationFiguresData(
    offset_x = 35.dp,
    offset_y = 225.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Ilg.route,
    numString = "01",
    relacionNum = numNumero,
    textoInfo =  R.string.II_IHUS_miniscreen_5_paragraph1,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2,
    relacionText = numLetra2
)
val valorFiguraIhus1 = NavegationFiguresData(
    offset_x = 165.dp,
    offset_y = 265.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 240.dp,
    ruta = Destination.Ilg.route,
    numString = "02",
    relacionNum = NumeroMediano,
    textoInfo = R.string.II_IHUS_miniscreen_5_paragraph2,
    anchoTexto = anchoTextoMediano,
    lineHeight = LineHeightMediana,
    relacionText = LetraMediana
)
val valorFiguraIhus2 = NavegationFiguresData(
    offset_x = 35.dp,
    offset_y = 375.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Ilg.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = R.string.II_IHUS_miniscreen_5_paragraph3,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2,
    relacionText = numLetra2
)
//Investigadores

val mlcpIhus =  PersonResearcher(
    foto = R.drawable.incifor_img_14,
    name = "Mª Luz Couce Pico",
    title = R.string.Directora,
    role = null,
    info =  listOf(R.string.II_INCIFOR_miniscreen_28_paragraph_0),
    contentType = ContentType.PLANTILLA
)
val ilgIhus =  PersonResearcher(
    foto = R.drawable.incifor_img_15,
    name = "Isabel Lista García",
    title = null,
    role = null,
    info =  listOf(R.string.II_INCIFOR_miniscreen_29_paragraph_0),
    contentType = ContentType.PLANTILLA
)

val rllIhus = PersonResearcher(
    foto = R.drawable.incifor_img_16,
    title = null,
    role = null,
    name = "Rafael López López",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)

val acaIhus =  PersonResearcher(
    foto = R.drawable.incifor_img_18_,
    name = "Ángel Carracedo Álvarez",
    title = null,
    role = null,    info =  listOf(),
    contentType = ContentType.PLANTILLA
)

val mlgIhus =  PersonResearcher(
    foto = R.drawable.incifor_img_19,
    name = "Mabel Loza García",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val mamoIhus =  PersonResearcher(
    foto = R.drawable.noimagen, //incifor_img_20
    name = "Miguel Ángel Martínez Olmos",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val lmscIhus =  PersonResearcher(
    foto = R.drawable.noimagen,
    name = "Luisa Mª Seoane Camino",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val jllgIhus =  PersonResearcher(
    foto = R.drawable.incifor_img_22,
    name = "José Luis Labandeira García",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)

val fcpIhus =  PersonResearcher(
    foto = R.drawable.incifor_img_23,
    name = "Francisco Campos Pérez",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val fgsIhus =  PersonResearcher(
    foto = R.drawable.incifor_img_24,
    name = "Francisco Gude Sampedro",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val izfIhus =  PersonResearcher(
    foto = R.drawable.incifor_img_24,
    name = "Irene Zarra Ferro",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val jrgjIhus =  PersonResearcher(
    foto = R.drawable.incifor_img_24,
    name = "José Ramón González Juanatey",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val mrmIhus =  PersonResearcher(
    foto = R.drawable.incifor_img_24,
    name = "Moisés Rodríguez Mañero",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val fmtIhus =  PersonResearcher(
    foto = R.drawable.incifor_img_24,
    name = "Federico Martinón Torres",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val rgbIhus =  PersonResearcher(
    foto = R.drawable.incifor_img_24,
    name = "Rodolfo Gómez Bahamonde",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)

val datosInvestigadoresIhus = listOf(mlcpIhus, ilgIhus, rllIhus, acaIhus, mlgIhus, mamoIhus,
    lmscIhus, jllgIhus, fcpIhus, fgsIhus, izfIhus, jrgjIhus, mrmIhus, fmtIhus, rgbIhus)