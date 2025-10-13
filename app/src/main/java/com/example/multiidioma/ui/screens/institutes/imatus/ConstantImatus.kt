package com.example.multiidioma.ui.screens.institutes.imatus

import android.content.res.Resources
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.multiidioma.R
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.numBigImatus
import com.example.multiidioma.data.numLetra
import com.example.multiidioma.data.numLetra2
import com.example.multiidioma.data.numSmallImatus
import com.example.multiidioma.data.relacionTextoGrande
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.data.types.PersonResearcher


val valorFiguraImatus0 = NavegationFiguresData(
    offset_x = 30.dp,
    offset_y = 20.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 220.dp,
    ruta = Destination.ImatusMiniScreen5.route,
    numString = "01",
    relacionNum = numBigImatus,
    textoInfo = R.string.II_IMATUS_miniscreen_4_paragraph_1,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra
)

val valorFiguraImatus1 = NavegationFiguresData(
    offset_x = 200.dp,
    offset_y = 200.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 200.dp,
    ruta = Destination.ImatusMiniScreen6.route,
    numString = "02",
    relacionNum = numBigImatus,
    textoInfo = R.string.II_IMATUS_miniscreen_4_paragraph_2,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraImatus2 = NavegationFiguresData(
    offset_x = 90.dp,
    offset_y = 370.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 250.dp,
    ruta = Destination.ImatusMiniScreen7.route,
    numString = "03",
    relacionNum = numSmallImatus,
    textoInfo = R.string.II_IMATUS_miniscreen_4_paragraph_3,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)


/// INVESTIGADORES

val calImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Carmen Alvarez Lorenzo",
    info = listOf(
        R.string.II_IMATUS_miniscreen_4_paragraph_1,
        R.string.II_IMATUS_miniscreen_5_title_0,
        R.string.II_INCIFOR_miniscreen_0_paragraph_0
    ),
    contentType = ContentType.MINISCREEN27
)

val jscImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Josefa Salgado Carballo",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)

val aggImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Alvaro Goyanes Goyanes",
    info = listOf(
        /*     R.string.info_investigador_test_1,
             R.string.info_investigador_test_2,
             R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)

val fjoeImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Francisco Javier Otero Espinar",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val bbfImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Bárbara Blanco Fernández",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val ptaImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Pablo Taboada Antelo",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val caggImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Carlos A. García-González",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val pdrImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Patricia Díaz Rodríguez",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val japImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Justo Arines Piferrer",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val jmpImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Jorge Mira Pérez",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val arbqImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Ana Rodríguez Bernaldo de Quirós",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val jlbImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Jesús Liñares Beiras",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)

val aigvImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Ana Isabel Gómez Varela",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val xpbImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Xesús Prieto Blanco",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val mellImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Elena López Lago",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val mfaImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Maite Flores Arias",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val mcbvImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Mª del Carmen Bao Varela",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val mjggImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Jesús García Guimarey",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val ampImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Antonio Moreda Piñeiro",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val cvvmatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Carlos Vázquez Vázquez",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)


val jmvImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Luis Miguel Varela",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)


val datosInvestigadoresImatus = listOf(
    calImatus,
    aggImatus,
    fjoeImatus,
    bbfImatus,
    ptaImatus,
    caggImatus,
    pdrImatus,
    japImatus,
    jmpImatus,
    arbqImatus,
    jlbImatus,
    aigvImatus,
    xpbImatus,
    mellImatus,
    mfaImatus,
    mcbvImatus,
    mjggImatus,
    ampImatus,
    cvvmatus,
    jmvImatus
)
