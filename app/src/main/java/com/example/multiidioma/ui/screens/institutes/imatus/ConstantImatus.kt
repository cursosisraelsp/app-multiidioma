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
//paragraph 2 son el link

val calImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Carmen Álvarez Lorenzo",
    title = R.string.Directora,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_14_paragraph_0,
        R.string.II_IMATUS_miniscreen_14_paragraph_1,
        R.string.II_IMATUS_miniscreen_14_paragraph_2
    ),
    contentType = ContentType.PLANTILLA
)

val jscImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Josefa Salgado Carballo",
    title = null,
    role = R.string.Secretaria,
    info = listOf(
        R.string.II_IMATUS_miniscreen_15_paragraph_0,
        R.string.II_IMATUS_miniscreen_15_paragraph_1,
        R.string.II_IMATUS_miniscreen_15_paragraph_2
    ),
    contentType = ContentType.PLANTILLA
)

val aggImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Alvaro Goyanes Goyanes",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_16_paragraph_0,
        R.string.II_IMATUS_miniscreen_16_paragraph_1,
        R.string.II_IMATUS_miniscreen_16_paragraph_2
    ),
    contentType = ContentType.PLANTILLA
)

val fjoeImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Francisco Javier Otero Espinar",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_17_paragraph_0,
        R.string.II_IMATUS_miniscreen_17_paragraph_1,
        R.string.II_IMATUS_miniscreen_17_paragraph_2
    ),
    contentType = ContentType.PLANTILLA
)
val bbfImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Bárbara Blanco Fernández",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_18_paragraph_0,
        R.string.II_IMATUS_miniscreen_18_paragraph_1,
        R.string.II_IMATUS_miniscreen_18_paragraph_2
    ),
    contentType = ContentType.PLANTILLA
)
val ptaImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    title = null,
    role = null,
    name = "Pablo Taboada Antelo",
    info = listOf(
        R.string.II_IMATUS_miniscreen_19_paragraph_0,
        R.string.II_IMATUS_miniscreen_19_paragraph_1,
        R.string.II_IMATUS_miniscreen_19_paragraph_2
    ),
    contentType = ContentType.PLANTILLA
)
val caggImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Carlos A. García-González",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_20_paragraph_0,
        R.string.II_IMATUS_miniscreen_20_paragraph_1,
        R.string.II_IMATUS_miniscreen_20_paragraph_2
    ),
    contentType = ContentType.PLANTILLA
)
val pdrImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Patricia Díaz Rodríguez",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_21_paragraph_0,
        R.string.II_IMATUS_miniscreen_21_paragraph_1,
        R.string.II_IMATUS_miniscreen_21_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)
val japImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Justo Arines Piferrer",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_22_paragraph_0,
        R.string.II_IMATUS_miniscreen_22_paragraph_1,
        R.string.II_IMATUS_miniscreen_22_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)
val jmpImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Jorge Mira Pérez",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_23_paragraph_0,
        R.string.II_IMATUS_miniscreen_23_paragraph_1,
        R.string.II_IMATUS_miniscreen_23_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)
val arbqImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Ana Rodríguez Bernaldo de Quirós",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_24_paragraph_0,
        R.string.II_IMATUS_miniscreen_24_paragraph_1,
        R.string.II_IMATUS_miniscreen_24_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)
val jlbImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Jesús Liñares Beiras",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_25_paragraph_0,
        R.string.II_IMATUS_miniscreen_25_paragraph_1,
        R.string.II_IMATUS_miniscreen_25_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)

val aigvImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Ana Isabel Gómez Varela",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_26_paragraph_0,
        R.string.II_IMATUS_miniscreen_26_paragraph_1,
        R.string.II_IMATUS_miniscreen_26_paragraph_2,
    ),

    contentType = ContentType.PLANTILLA
)
val xpbImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Xesús Prieto Blanco",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_27_paragraph_0,
        R.string.II_IMATUS_miniscreen_27_paragraph_1,
        R.string.II_IMATUS_miniscreen_27_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)
val mellImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Elena López Lago",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_28_paragraph_0,
        R.string.II_IMATUS_miniscreen_28_paragraph_1,
        R.string.II_IMATUS_miniscreen_28_paragraph_2,

        ),
    contentType = ContentType.PLANTILLA
)
val mfaImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Maite Flores Arias",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_29_paragraph_0,
        R.string.II_IMATUS_miniscreen_29_paragraph_1,
        R.string.II_IMATUS_miniscreen_29_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)
val mcbvImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Mª del Carmen Bao Varela",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_30_paragraph_0,
        R.string.II_IMATUS_miniscreen_30_paragraph_1,
        R.string.II_IMATUS_miniscreen_30_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)
val mjggImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Jesús García Guimarey",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_31_paragraph_0,
        R.string.II_IMATUS_miniscreen_31_paragraph_1,
        R.string.II_IMATUS_miniscreen_31_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)
val ampImatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Antonio Moreda Piñeiro",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_32_paragraph_0,
        R.string.II_IMATUS_miniscreen_32_paragraph_1,
        R.string.II_IMATUS_miniscreen_32_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)
val cvvmatus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Carlos Vázquez Vázquez",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_33_paragraph_0,
        R.string.II_IMATUS_miniscreen_33_paragraph_1,
        R.string.II_IMATUS_miniscreen_33_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)


val lmv = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Luis Miguel Varela",
    title = null,
    role = null,
    info = listOf(
        R.string.II_IMATUS_miniscreen_34_paragraph_0,
        R.string.II_IMATUS_miniscreen_34_paragraph_1,
        R.string.II_IMATUS_miniscreen_34_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)


val datosInvestigadoresImatus = listOf(lmv)
