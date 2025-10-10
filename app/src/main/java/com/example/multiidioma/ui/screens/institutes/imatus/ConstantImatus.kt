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
    textoInfo = R.string.II_IMATUS_miniscreen_4_paragraph_3 ,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)


/// INVESTIGADORES

val mvlhImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Victoria Lareu Huidobro",
    info = listOf(
            R.string.II_IMATUS_miniscreen_4_paragraph_1,
            R.string.II_IMATUS_miniscreen_5_title_0,
            R.string.II_INCIFOR_miniscreen_0_paragraph_0
    ),
    contentType = ContentType.MINISCREEN27
)

val ambbImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Ana María Bermejo Barrera",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)

val jimbImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "José Ignacio Muñoz Barús",
    info = listOf(
        /*     R.string.info_investigador_test_1,
             R.string.info_investigador_test_2,
             R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)

val aclImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Angelines Cruz Landeira",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)

val datosInvestigadoresImatus = listOf(mvlhImatus, ambbImatus, jimbImatus, aclImatus)