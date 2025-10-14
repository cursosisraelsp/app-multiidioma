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
//title es para sus estudios, role es para su posicion )

val calImatus = PersonResearcher(
    foto = R.drawable.imatus_img_13,
    name = "Carmen Álvarez Lorenzo",
    title = R.string.Directora,
    role = null, // No tiene cargo
    info = listOf(
        R.string.II_IMATUS_miniscreen_14_paragraph_0,
        R.string.II_IMATUS_miniscreen_14_paragraph_1,
        R.string.II_IMATUS_miniscreen_14_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)

val jscImatus = PersonResearcher(
    foto = R.drawable.imatus_img_14,
    name = "Josefa Salgado Carballo",
    title = R.string.II_IMATUS_miniscreen_15_title_1,
    role =  R.string.II_IMATUS_miniscreen_15_role_1,
    info = listOf(
        R.string.II_IMATUS_miniscreen_15_paragraph_0,
        R.string.II_IMATUS_miniscreen_15_paragraph_1,
        R.string.II_IMATUS_miniscreen_15_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)

val aggImatus = PersonResearcher(
    foto = R.drawable.imatus_img_15,
    name = "Alvaro Goyanes Goyanes",
    title = null,
    role = null,
    info = listOf(
        /*     R.string.info_investigador_test_1,
             R.string.info_investigador_test_2,
             R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)

val fjoeImatus = PersonResearcher(
    foto = R.drawable.imatus_img_16,
    name = "Francisco Javier Otero Espinar",
    title = null,
    role = null,
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)
val bbfImatus = PersonResearcher(
    foto = R.drawable.imatus_img_17,
    name = "Bárbara Blanco Fernández",
    title = null,
    role = null,
    info = listOf(
    ),
    contentType = ContentType.PLANTILLA
)
val ptaImatus = PersonResearcher(
    foto = R.drawable.imatus_img_18,
    name = "Pablo Taboada Antelo",
    title = null,
    role = null,
    info = listOf(

    ),
    contentType = ContentType.PLANTILLA
)
val caggImatus = PersonResearcher(
    foto = R.drawable.imatus_img_19,
    name = "Carlos A. García-González",
    title = null,
    role = null,
    info = listOf(

    ),
    contentType = ContentType.PLANTILLA
)
val pdrImatus = PersonResearcher(
    foto = R.drawable.imatus_img_20,
    name = "Patricia Díaz Rodríguez",
    title = null,
    role = null,
    info = listOf(
    ),
    contentType = ContentType.PLANTILLA
)
val japImatus = PersonResearcher(
    foto = R.drawable.imatus_img_21,
    name = "Justo Arines Piferrer",
    title = null,
    role = null,
    info = listOf(

    ),
    contentType = ContentType.PLANTILLA
)
val jmpImatus = PersonResearcher(
    foto = R.drawable.imatus_img_22,
    name = "Jorge Mira Pérez",
    title = null,
    role = null,
    info = listOf(
    ),
    contentType = ContentType.PLANTILLA
)
val arbqImatus = PersonResearcher(
    foto = R.drawable.imatus_img_23,
    name = "Ana Rodríguez Bernaldo de Quirós",
    title = null,
    role = null,
    info = listOf(
    ),
    contentType = ContentType.PLANTILLA
)
val jlbImatus = PersonResearcher(
    foto = R.drawable.imatus_img_24,
    name = "Jesús Liñares Beiras",
    title = null,
    role = null,
    info = listOf(
    ),
    contentType = ContentType.PLANTILLA
)

val aigvImatus = PersonResearcher(
    foto = R.drawable.imatus_img_25,
    name = "Ana Isabel Gómez Varela",
    title = null,
    role = null,
    info = listOf(
    ),
    contentType = ContentType.PLANTILLA
)
val xpbImatus = PersonResearcher(
    foto = R.drawable.imatus_img_26,
    name = "Xesús Prieto Blanco",
    title = null,
    role = null,
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)
val mellImatus = PersonResearcher(
    foto = R.drawable.imatus_img_27,
    name = "María Elena López Lago",
    title = null,
    role = null,
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)
val mfaImatus = PersonResearcher(
    foto = R.drawable.imatus_img_28,
    name = "Maite Flores Arias",
    title = null,
    role = null,
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)
val mcbvImatus = PersonResearcher(
    foto = R.drawable.imatus_img_29,
    name = "Mª del Carmen Bao Varela",
    title = null,
    role = null,
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)
val mjggImatus = PersonResearcher(
    foto = R.drawable.imatus_img_30,
    name = "María Jesús García Guimarey",
    title = null,
    role = null,
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)
val ampImatus = PersonResearcher(
    foto = R.drawable.imatus_img_31,
    name = "Antonio Moreda Piñeiro",
    title = null,
    role = null,
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)
val cvvmatus = PersonResearcher(
    foto = R.drawable.imatus_img_32,
    name = "Carlos Vázquez Vázquez",
    title = null,
    role = null,
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)


val jmvImatus = PersonResearcher(
    foto = R.drawable.imatus_img_33,
    name = "Luis Miguel Varela",
    title = null,
    role = null,
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PLANTILLA
)


val datosInvestigadoresImatus = listOf(
    calImatus,
    jscImatus,
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
