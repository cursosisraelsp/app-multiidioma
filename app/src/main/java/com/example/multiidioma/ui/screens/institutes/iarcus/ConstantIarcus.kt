package com.example.multiidioma.ui.screens.institutes.iarcus_andre

import android.content.res.Resources
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.multiidioma.R
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.LetraDiminuta
import com.example.multiidioma.data.LineHeightDiminuta
import com.example.multiidioma.data.numLetra2
import com.example.multiidioma.data.numNumero
import com.example.multiidioma.data.relacionTexto
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.data.types.PersonResearcher


///////////////CIRCULOS DE LOS CENTROS/////////////////

val valorFiguraIarcus0 = NavegationFiguresData(
    offset_x = 40.dp,
    offset_y = 10.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 195.dp,
    ruta = Destination.IarcusMiniscreen8.route,
    numString = "01",
    relacionNum = numNumero,
    textoInfo = R.string.II_IARCUS_miniscreen_8_paragraph_14,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIarcus1 = NavegationFiguresData(
    offset_x = 220.dp,
    offset_y = 70.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 170.dp,
    ruta = Destination.IarcusMiniscreen9.route,
    numString = "02",
    relacionNum = numNumero,
    textoInfo = R.string.II_IARCUS_miniscreen_9_paragraph_6,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIarcus2 = NavegationFiguresData(
    offset_x = 65.dp,
    offset_y = 210.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 170.dp,
    ruta = Destination.IarcusMiniscreen10.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = R.string.II_IARCUS_miniscreen_10_paragraph_4,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)

val valorFiguraIarcus3 = NavegationFiguresData(
    offset_x = 230.dp,
    offset_y = 270.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.IarcusMiniscreen11.route,
    numString = "04",
    relacionNum = numNumero,
    textoInfo = R.string.II_IARCUS_miniscreen_11_paragraph_3,
    anchoTexto = relacionTexto,
    lineHeight = LineHeightDiminuta,
    relacionText = LetraDiminuta
)

/// INVESTIGADORES

val cpdIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Carlos Pereira Dopazo",
    title = null,
    role = R.string.CRETUS_role_0,
    role2= R.string.CRETUS_role_1,
    info = listOf(
        R.string.II_IARCUS_miniscreen_17_title_0,
        R.string.II_IARCUS_miniscreen_17_texto_buscado_0,
        R.string.II_IARCUS_miniscreen_17_title_1,
        R.string.II_IARCUS_miniscreen_17_texto_buscado_1,
        R.string.II_IARCUS_miniscreen_17_paragraph_0,
        R.string.II_IARCUS_miniscreen_17_paragraph_1,
        R.string.II_IARCUS_miniscreen_17_paragraph_2,
        R.string.II_IARCUS_miniscreen_17_paragraph_3,
        R.string.II_IARCUS_miniscreen_17_paragraph_4,
        R.string.II_IARCUS_miniscreen_17_paragraph_5,
        ),
    contentType = ContentType.PLANTILLA
)

val jsqaIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "José Benito Quintana Álvarez",
    title = null,
    role = R.string.CRETUS_role_2,
    info = listOf(
        R.string.II_IARCUS_miniscreen_18_title_0,
        R.string.II_IARCUS_miniscreen_18_texto_buscado_0,
        R.string.II_IARCUS_miniscreen_18_title_1,
        R.string.II_IARCUS_miniscreen_18_texto_buscado_1,
        R.string.II_IARCUS_miniscreen_18_paragraph_0,
        R.string.II_IARCUS_miniscreen_18_paragraph_1,
        R.string.II_IARCUS_miniscreen_18_paragraph_2,
        ),
    contentType = ContentType.PLANTILLA
)

val mibmIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Isabel Bandín Matos",
    title = null,
    role = R.string.CRETUS_role_3,
    info = listOf(
        R.string.II_IARCUS_miniscreen_19_title_0,
        R.string.II_IARCUS_miniscreen_19_texto_buscado_0,
        R.string.II_IARCUS_miniscreen_19_title_1,
        R.string.II_IARCUS_miniscreen_19_texto_buscado_1,
        R.string.II_IARCUS_miniscreen_19_paragraph_0,
        R.string.II_IARCUS_miniscreen_19_paragraph_1,
        R.string.II_IARCUS_miniscreen_19_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)
val abiIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Antón Barreiro Iglesias",
    title = null,
    role = R.string.CRETUS_role_4,
    info = listOf(
        R.string.II_IARCUS_miniscreen_20_title_0,
        R.string.II_IARCUS_miniscreen_20_texto_buscado_0,
        R.string.II_IARCUS_miniscreen_20_title_1,
        R.string.II_IARCUS_miniscreen_20_texto_buscado_1,
        R.string.II_IARCUS_miniscreen_20_paragraph_0,
        R.string.II_IARCUS_miniscreen_20_paragraph_1,
        R.string.II_IARCUS_miniscreen_20_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)
val jmlvIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "José Manuel Leiro Vidal",
    title = null,
    role = R.string.CRETUS_role_5,
    info = listOf(
        R.string.II_IARCUS_miniscreen_21_title_0,
        R.string.II_IARCUS_miniscreen_21_texto_buscado_0,
        R.string.II_IARCUS_miniscreen_21_title_1,
        R.string.II_IARCUS_miniscreen_21_texto_buscado_1,
        R.string.II_IARCUS_miniscreen_21_paragraph_0,
        R.string.II_IARCUS_miniscreen_21_paragraph_1,
        R.string.II_IARCUS_miniscreen_21_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)
val bmfIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Beatriz Magariños Ferro",
    title = null,
    role = R.string.CRETUS_role_6,
    info = listOf(
        R.string.II_IARCUS_miniscreen_22_title_0,
        R.string.II_IARCUS_miniscreen_22_texto_buscado_0,
        R.string.II_IARCUS_miniscreen_22_title_1,
        R.string.II_IARCUS_miniscreen_22_texto_buscado_1,
        R.string.II_IARCUS_miniscreen_22_paragraph_0,
        R.string.II_IARCUS_miniscreen_22_paragraph_1,
        R.string.II_IARCUS_miniscreen_22_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)
val pmcIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Pablo Meira Cartea",
    title = null,
    role = R.string.CRETUS_role_7,
    info = listOf(
        R.string.II_IARCUS_miniscreen_23_title_0,
        R.string.II_IARCUS_miniscreen_23_texto_buscado_0,
        R.string.II_IARCUS_miniscreen_23_title_1,
        R.string.II_IARCUS_miniscreen_23_texto_buscado_1,
        R.string.II_IARCUS_miniscreen_23_paragraph_0,
        R.string.II_IARCUS_miniscreen_23_paragraph_1,
        R.string.II_IARCUS_miniscreen_23_paragraph_2,
        R.string.II_IARCUS_miniscreen_23_paragraph_3,
    ),
    contentType = ContentType.PLANTILLA
)
val amgIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Azucena Mora Gutiérrez",
    title = null,
    role = R.string.CRETUS_role_8,
    info = listOf(
        R.string.II_IARCUS_miniscreen_24_title_0,
        R.string.II_IARCUS_miniscreen_24_texto_buscado_0,
        R.string.II_IARCUS_miniscreen_24_title_1,
        R.string.II_IARCUS_miniscreen_24_texto_buscado_1,
        R.string.II_IARCUS_miniscreen_24_paragraph_0,
        R.string.II_IARCUS_miniscreen_24_paragraph_1,
        R.string.II_IARCUS_miniscreen_24_paragraph_2,
        R.string.II_IARCUS_miniscreen_24_paragraph_3,
        R.string.II_IARCUS_miniscreen_24_paragraph_4,
    ),
    contentType = ContentType.PLANTILLA
)
val amocIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Ana María Otero Casal",
    title = null,
    role = R.string.CRETUS_role_9,
    info = listOf(
        R.string.II_IARCUS_miniscreen_25_title_0,
        R.string.II_IARCUS_miniscreen_25_texto_buscado_0,
        R.string.II_IARCUS_miniscreen_25_title_1,
        R.string.II_IARCUS_miniscreen_25_texto_buscado_1,
        R.string.II_IARCUS_miniscreen_25_paragraph_0,
        R.string.II_IARCUS_miniscreen_25_paragraph_1,
        R.string.II_IARCUS_miniscreen_25_paragraph_2,
        R.string.II_IARCUS_miniscreen_25_paragraph_3,
    ),
    contentType = ContentType.PLANTILLA
)
val mrrrIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Mª del Rosario Rodil Rodríguez",
    title = null,
    role = R.string.CRETUS_role_10,
    info = listOf(
        R.string.II_IARCUS_miniscreen_26_title_0,
        R.string.II_IARCUS_miniscreen_26_texto_buscado_0,
        R.string.II_IARCUS_miniscreen_26_title_1,
        R.string.II_IARCUS_miniscreen_26_texto_buscado_1,
        R.string.II_IARCUS_miniscreen_26_paragraph_0,
        R.string.II_IARCUS_miniscreen_26_paragraph_1,
        R.string.II_IARCUS_miniscreen_26_paragraph_2,

    ),
    contentType = ContentType.PLANTILLA
)

val irpIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Isaac Rodríguez Pereiro",
    title = null,
    role = R.string.CRETUS_role_11,
    info = listOf(
        R.string.II_IARCUS_miniscreen_27_title_0,
        R.string.II_IARCUS_miniscreen_27_texto_buscado_0,
        R.string.II_IARCUS_miniscreen_27_title_1,
        R.string.II_IARCUS_miniscreen_27_texto_buscado_1,
        R.string.II_IARCUS_miniscreen_27_paragraph_0,
        R.string.II_IARCUS_miniscreen_27_paragraph_1,
        R.string.II_IARCUS_miniscreen_27_paragraph_2,
    ),
    contentType = ContentType.PLANTILLA
)

val datosInvestigadoresIarcus = listOf(
    cpdIarcus,
    jsqaIarcus,
    mibmIarcus,
    abiIarcus,
    jmlvIarcus,
    bmfIarcus,
    pmcIarcus,
    amgIarcus,
    amocIarcus,
    mrrrIarcus,
    irpIarcus
)