package com.example.multiidioma.ui.screens.centros.citius

import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.numBigCitius
import com.example.multiidioma.data.numLetra
import com.example.multiidioma.data.numLetra2
import com.example.multiidioma.data.numSmallCitius
import com.example.multiidioma.data.relacionTexto
import com.example.multiidioma.data.relacionTextoGrande
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.data.types.PersonResearcher


val valorFiguraCitius0 = NavegationFiguresData(
    offset_x = 30.dp,
    offset_y = 20.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 200.dp,
    ruta = Destination.CitiusMiniScreen6.route,
    numString = "01",
    relacionNum = numBigCitius,
    textoInfo = R.string.CS_CITIUS_miniscreen_5_paragraph_1,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra
)
val valorFiguraCitius1 = NavegationFiguresData(
    offset_x = 220.dp,
    offset_y = 50.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 180.dp,
    ruta = Destination.CitiusMiniScreen7.route,
    numString = "02",
    relacionNum = numBigCitius,
    textoInfo = R.string.CS_CITIUS_miniscreen_5_paragraph_2,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra
)
val valorFiguraCitius2 = NavegationFiguresData(
    offset_x = 45.dp,
    offset_y = 210.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.CitiusMiniScreen8.route,
    numString = "03",
    relacionNum = numSmallCitius,
    textoInfo = R.string.CS_CITIUS_miniscreen_5_paragraph_3,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra
)
val valorFiguraCitius3 = NavegationFiguresData(
    offset_x = 200.dp,
    offset_y = 200.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 225.dp,
    ruta = Destination.CitiusMiniScreen9.route,
    numString = "04",
    relacionNum = numBigCitius,
    textoInfo = R.string.CS_CITIUS_miniscreen_5_paragraph_4,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraCitius4 = NavegationFiguresData(
    offset_x = 90.dp,
    offset_y = 370.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 120.dp,
    ruta = Destination.CitiusMiniScreen10.route,
    numString = "05",
    relacionNum = numSmallCitius,
    textoInfo = R.string.CS_CITIUS_miniscreen_5_paragraph_5,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)

//No ponerlos en datosInvestigadoresCitius a los directores sino ponerlos en otro nombre para ponerlo en directores?

//investigadores
val sbCitius = PersonResearcher(
    foto = R.drawable.citius_img_14,
    name = "SENÉN BARRO",
    title = null,
    role = null,

    info = listOf(
        R.string.CS_CITIUS_miniscreen_18_title_1,
        R.string.CS_CITIUS_miniscreen_18_paragraph_0,
        R.string.prueba_link,
    ),
    contentType = ContentType.PLANTILLA
)
val plCitius = PersonResearcher(
    foto = R.drawable.citius_img_15,
    name = "PAULA LÓPEZ",
    title = null,
    role = null,
    info = listOf(),
    contentType = ContentType.PLANTILLA
)

val pgCitius = PersonResearcher(
    foto = R.drawable.citius_img_16,
    name = "PABLO GAMALLO",
    title = null,
    role = null,
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val dgCitius = PersonResearcher(
    foto = R.drawable.citius_img_17,
    name = "DAVID GLOWACKI",
    title = null,
    role = null,
    info = listOf(),
    contentType = ContentType.PLANTILLA
)

val mnCitius = PersonResearcher(
    foto = R.drawable.citius_img_18,
    name = "MARTA NÚÑEZ",
    title = null,
    role = null,
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val mjcCitius = PersonResearcher(
    foto = R.drawable.citius_img_19,
    name = "MARIA JOSÉ CARREIRA",
    title = null,
    role = null,
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val dlCitius = PersonResearcher(
    foto = R.drawable.citius_img_20,
    name = "DAVID LOSADA",
    title = null,
    role = null,
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val nsCitius = PersonResearcher(
    foto = R.drawable.citius_img_21,
    name = "NATALIA SEOANE",
    title = null,
    role = null,
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val datosInvestigadoresCitius =
    listOf(sbCitius, plCitius, pgCitius, dgCitius, mnCitius, mjcCitius, dlCitius, nsCitius)