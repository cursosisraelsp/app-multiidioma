package com.example.multiidioma.ui.screens.institutes.incifor

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

val numNumero = ((317.9 / des.density) / relacionDimen).sp

val valorFigura0 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 20.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.InciforMiniscreen14.route,
    numString = "01",
    relacionNum = numNumero,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_1,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFigura1 = NavegationFiguresData(
    offset_x = 260.dp,
    offset_y = 70.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.InciforMiniscreen15.route,
    numString = "02",
    relacionNum = numNumero,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFigura2 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 460.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.InciforMiniscreen16.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_3,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFigura3 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.InciforMiniscreen17.route,
    numString = "04",
    relacionNum = numNumero,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_4,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFigura4 = NavegationFiguresData(
    offset_x = 80.dp,
    offset_y = 175.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 300.dp,
    ruta = Destination.InciforMiniscreen18.route,
    numString = "05",
    relacionNum = numNumeroGrande,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_5,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra
)


/// INVESTIGADORES

val mvlhIncifor = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Victoria Lareu Huidobro",
    info = listOf(
        /*    R.string.info_investigador_test_1,
            R.string.info_investigador_test_2,
            R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)

val ambbIncifor = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Ana María Bermejo Barrera",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)

val jimbIncifor = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "José Ignacio Muñoz Barús",
    info = listOf(
        /*     R.string.info_investigador_test_1,
             R.string.info_investigador_test_2,
             R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)

val aclIncifor = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Angelines Cruz Landeira",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)

val datosInvestigadores = listOf(mvlhIncifor, ambbIncifor, jimbIncifor, aclIncifor)