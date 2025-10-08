package com.example.multiidioma.ui.screens.centros.cimus

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
val numBigCimus = (200 / des.density).sp
val numSmallCimus = (150 / des.density).sp


val numNumero = ((317.9 / des.density) / relacionDimen).sp

val valorFiguraCimus0 = NavegationFiguresData(
    offset_x = 30.dp,
    offset_y = 20.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 200.dp,
    ruta = Destination.CimusMiniScreen9.route,
    numString = "01",
    relacionNum = numBigCimus,
    textoInfo = R.string.CS_CITIUS_miniscreen_5_paragraph_1,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra
)
val valorFiguraCimus1 = NavegationFiguresData(
    offset_x = 220.dp,
    offset_y = 50.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 180.dp,
    ruta = Destination.CimusMiniScreen10.route,
    numString = "02",
    relacionNum = numBigCimus,
    textoInfo = R.string.CS_CITIUS_miniscreen_5_paragraph_2,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra
)
val valorFiguraCimus2 = NavegationFiguresData(
    offset_x = 45.dp,
    offset_y = 210.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.CimusMiniScreen11.route,
    numString = "03",
    relacionNum = numSmallCimus,
    textoInfo = R.string.CS_CITIUS_miniscreen_5_paragraph_3,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra
)
val valorFiguraCimus3 = NavegationFiguresData(
    offset_x = 200.dp,
    offset_y = 200.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 225.dp,
    ruta = Destination.CimusMiniScreen12.route,
    numString = "04",
    relacionNum = numBigCimus,
    textoInfo = R.string.CS_CITIUS_miniscreen_5_paragraph_4,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraCimus4 = NavegationFiguresData(
    offset_x = 90.dp,
    offset_y = 370.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 120.dp,
    ruta = Destination.CimusMiniScreen13.route,
    numString = "05",
    relacionNum = numSmallCimus,
    textoInfo = R.string.CS_CITIUS_miniscreen_5_paragraph_5,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)

val valorFiguraCimus5 = NavegationFiguresData(
    offset_x = 90.dp,
    offset_y = 370.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 120.dp,
    ruta = Destination.CimusMiniScreen15.route,
    numString = "05",
    relacionNum = numSmallCimus,
    textoInfo = R.string.CS_CITIUS_miniscreen_5_paragraph_5,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraCimus6 = NavegationFiguresData(
    offset_x = 90.dp,
    offset_y = 370.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 120.dp,
    ruta = Destination.CimusMiniScreen16.route,
    numString = "05",
    relacionNum = numSmallCimus,
    textoInfo = R.string.CS_CITIUS_miniscreen_5_paragraph_5,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraCimus7 = NavegationFiguresData(
    offset_x = 90.dp,
    offset_y = 370.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 120.dp,
    ruta = Destination.CimusMiniScreen17.route,
    numString = "05",
    relacionNum = numSmallCimus,
    textoInfo = R.string.CS_CITIUS_miniscreen_5_paragraph_5,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)


//No ponerlos en datosInvestigadoresCimus a los directores sino ponerlos en otro nombre para ponerlo en directores?

//investigadores
val sbCimus = PersonResearcher(
    foto = R.drawable.cimus_img_14,
    name = "SENÉN BARRO",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val plCimus = PersonResearcher(
    foto = R.drawable.cimus_img_15,
    name = "PAULA LÓPEZ",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)

val pgCimus = PersonResearcher(
    foto = R.drawable.cimus_img_16,
    name = "PABLO GAMALLO",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val dgCimus = PersonResearcher(
    foto = R.drawable.cimus_img_17,
    name = "DAVID GLOWACKI",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)

val mnCimus = PersonResearcher(
    foto = R.drawable.cimus_img_18,
    name = "MARTA NÚÑEZ",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val mjcCimus = PersonResearcher(
    foto = R.drawable.cimus_img_19,
    name = "MARIA JOSÉ CARREIRA",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val dlCimus = PersonResearcher(
    foto = R.drawable.cimus_img_20,
    name = "DAVID LOSADA",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val nsCimus = PersonResearcher(
    foto = R.drawable.cimus_img_21,
    name = "NATALIA SEOANE",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)
val datosInvestigadoresCimus =
    listOf(sbCimus, plCimus, pgCimus, mnCimus, mjcCimus, dlCimus, nsCimus)
