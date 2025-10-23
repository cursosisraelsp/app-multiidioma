package com.example.multiidioma.ui.screens.institutes.ice

import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.numLetra
import com.example.multiidioma.data.numLetra2
import com.example.multiidioma.data.numNumero
import com.example.multiidioma.data.numNumeroGrande
import com.example.multiidioma.data.relacionTexto
import com.example.multiidioma.data.relacionTextoGrande
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.data.types.PersonResearcher


val valorFiguraIce0 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 20.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.IceMiniScreen7.route,
    numString = "01",
    relacionNum = numNumero,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_1,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIce1 = NavegationFiguresData(
    offset_x = 260.dp,
    offset_y = 70.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.IceMiniScreen8.route,
    numString = "02",
    relacionNum = numNumero,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIce2 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 460.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.IceMiniScreen9.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_3,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIce3 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.IceMiniScreen10.route,
    numString = "04",
    relacionNum = numNumero,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_4,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIce4 = NavegationFiguresData(
    offset_x = 80.dp,
    offset_y = 175.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 300.dp,
    ruta = Destination.IceMiniScreen11.route,
    numString = "05",
    relacionNum = numNumeroGrande,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_5,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra
)
val valorFiguraIce5 = NavegationFiguresData(
    offset_x = 80.dp,
    offset_y = 175.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 300.dp,
    ruta = Destination.IceMiniScreen12.route,
    numString = "05",
    relacionNum = numNumeroGrande,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_5,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra
)
val valorFiguraIce6 = NavegationFiguresData(
    offset_x = 80.dp,
    offset_y = 175.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 300.dp,
    ruta = Destination.IceMiniScreen13.route,
    numString = "05",
    relacionNum = numNumeroGrande,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_5,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra
)


//INVESTIGADORES

val mvlhIce = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Victoria Lareu Huidobro",
    title = null,
    role = null,
    info = listOf(
    ),
    contentType = ContentType.PLANTILLA
)

val ambbIce = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Ana María Bermejo Barrera",
    title = null,
    role = null,
    info = listOf(

),
contentType = ContentType.PLANTILLA
)

val jimbIce = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "José Ignacio Muñoz Barús",
    title = null,
    role = null,
    info = listOf(

),
contentType = ContentType.PLANTILLA
)

val aclIce = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Angelines Cruz Landeira",
    title = null,
    role = null,
    info = listOf(
    ),
    contentType = ContentType.PLANTILLA
)

val datosInvestigadoresIce = listOf(mvlhIce, ambbIce, jimbIce, aclIce)
