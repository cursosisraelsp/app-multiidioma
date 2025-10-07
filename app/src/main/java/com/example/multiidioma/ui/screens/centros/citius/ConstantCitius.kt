package com.example.multiidioma.ui.screens.centros.citius

import android.content.res.Resources
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.multiidioma.R
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.data.types.PersonResearcher

val des = Resources.getSystem().displayMetrics
val numLetra = (80 / des.density).sp
val numLetra2 = ((40 / des.density)).sp
val relacionDimen = 300 / 150
val relacionTexto = (90).dp
val relacionTextoGrande = (175).dp
val numNumeroGrande = ((317.9 / des.density)).sp
val numBigCitius = (200 / des.density).sp
val numSmallCitius = (150 / des.density).sp


val numNumero = ((317.9 / des.density) / relacionDimen).sp


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
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val plCitius = PersonResearcher(
    foto = R.drawable.citius_img_15,
    name = "PAULA LÓPEZ",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)

val pgCitius = PersonResearcher(
    foto = R.drawable.citius_img_16,
    name = "PABLO GAMALLO",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val dgCitius = PersonResearcher(
    foto = R.drawable.citius_img_17,
    name = "DAVID GLOWACKI",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)

val mnCitius = PersonResearcher(
    foto = R.drawable.citius_img_18,
    name = "MARTA NÚÑEZ",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val mjcCitius = PersonResearcher(
    foto = R.drawable.citius_img_19,
    name = "MARIA JOSÉ CARREIRA",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val dlCitius = PersonResearcher(
    foto = R.drawable.citius_img_20,
    name = "DAVID LOSADA",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val nsCitius = PersonResearcher(
    foto = R.drawable.citius_img_21,
    name = "NATALIA SEOANE",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val datosInvestigadoresCitius =
    listOf(sbCitius, plCitius, pgCitius, mnCitius, mjcCitius, dlCitius, nsCitius)