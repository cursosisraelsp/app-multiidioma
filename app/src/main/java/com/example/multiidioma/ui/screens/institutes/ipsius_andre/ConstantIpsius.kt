package com.example.multiidioma.ui.screens.institutes.ipsius_andre

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

val valorFiguraIpsius0 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 20.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Cretus.route,
    numString = "01",
    relacionNum = numNumero,
    textoInfo = R.string.II_IPSIUS_miniscreen_7_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIpsius1 = NavegationFiguresData(
    offset_x = 260.dp,
    offset_y = 70.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Cretus.route,
    numString = "02",
    relacionNum = numNumero,
    textoInfo = R.string.II_IPSIUS_miniscreen_8_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIpsius2 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 460.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Cretus.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = R.string.II_IPSIUS_miniscreen_9_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIpsius3 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Imatus.route,
    numString = "04",
    relacionNum = numNumero,
    textoInfo = R.string.II_IPSIUS_miniscreen_10_paragraph_3,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIpsius4 = NavegationFiguresData(
    offset_x = 80.dp,
    offset_y = 175.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 300.dp,
    ruta = Destination.Cretus.route,
    numString = "05",
    relacionNum = numNumeroGrande,
    textoInfo = R.string.II_IPSIUS_miniscreen_11_paragraph_1,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra
)
val valorFiguraIpsius5 = NavegationFiguresData(
    offset_x = 80.dp,
    offset_y = 175.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 300.dp,
    ruta = Destination.Cretus.route,
    numString = "06",
    relacionNum = numNumeroGrande,
    textoInfo = R.string.II_IPSIUS_miniscreen_12_paragraph_2,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra
)
val valorFiguraIpsius6 = NavegationFiguresData(
    offset_x = 80.dp,
    offset_y = 175.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 300.dp,
    ruta = Destination.Cretus.route,
    numString = "07",
    relacionNum = numNumeroGrande,
    textoInfo = R.string.II_IPSIUS_miniscreen_13_paragraph_3,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra
)



/// INVESTIGADORES

val ifcIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Isabel Fraga Carou",
    info = listOf(
        /*    R.string.info_investigador_test_1,
            R.string.info_investigador_test_2,
            R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)

val srhIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Socorro Rodríguez Holguín",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)

val cmvIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Carmela Martínez Vispo",
    info = listOf(
        /*     R.string.info_investigador_test_1,
             R.string.info_investigador_test_2,
             R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)

val ebiIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Elisardo Becoña Iglesias",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)
val fciIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Francisco Caamaño Isorna",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)
val nmnIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Narmeen Mallah Nasrallah",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)
val fcmIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Fernando Cadaveira Mahía",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)
val ertIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Estrella Romero Triñanes",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)
val llrIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Laura López-Romero",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)


val datosInvestigadores = listOf(ifcIpsius, srhIpsius, cmvIpsius, ebiIpsius, fciIpsius, nmnIpsius, fcmIpsius,ertIpsius,llrIpsius )