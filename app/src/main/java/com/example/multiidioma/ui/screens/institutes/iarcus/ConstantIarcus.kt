package com.example.multiidioma.ui.screens.institutes.iarcus_andre

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


//🔵 Tamaño del círculo
val CirculoGigante = 260.dp
val CirculoGrande = 230.dp
val CirculoMediano = 200.dp
val CirculoPequeno = 170.dp
val CirculoDiminuto = 140.dp
val CirculoMicro = 110.dp

// 🔢 Tamaño del número dentro del círculo (relación proporcional)
val NumeroGigante = (300 / des.density).sp
val NumeroGrande = (240 / des.density).sp
val NumeroMediano = (180 / des.density).sp
val NumeroPequeno = (140 / des.density).sp
val NumeroDiminuto = (120 / des.density).sp
val NumeroMicro = (100 / des.density).sp

// 🔠 Tamaño de letra general
val LetraGigante = (96 / des.density).sp      // ~38sp
val LetraGrande = (78 / des.density).sp       // ~31sp
val LetraMediana = (60 / des.density).sp      // ~24sp
val LetraPequena = (50 / des.density).sp      // ~18sp
val LetraDiminuta = (40 / des.density).sp     // ~12sp
val LetraMicro = (34 / des.density).sp        // ~8–9sp

// 📏 Line height (más ajustado cuanto más pequeño)
val LineHeightGigante = LetraGigante * 1.3f
val LineHeightGrande = LetraGrande * 1.2f
val LineHeightMediana = LetraMediana * 1.15f
val LineHeightPequena = LetraPequena * 1.05f
val LineHeightDiminuta = LetraDiminuta * 0.95f
val LineHeightMicro = LetraMicro * 0.9f

// Porcentajes para el ancho del texto según el tamaño del círculo
val porcentajeAnchoTextoGigante = 0.7f
val porcentajeAnchoTextoGrande = 0.7f
val porcentajeAnchoTextoMediano = 0.7f
val porcentajeAnchoTextoPequeno = 0.65f
val porcentajeAnchoTextoDiminuto = 0.6f
val porcentajeAnchoTextoMicro = 0.6f

// Ancho del texto calculado dinámicamente
val anchoTextoGigante = CirculoGigante * porcentajeAnchoTextoGigante
val anchoTextoGrande = CirculoGrande * porcentajeAnchoTextoGrande
val anchoTextoMediano = CirculoMediano * porcentajeAnchoTextoMediano
val anchoTextoPequeno = CirculoPequeno * porcentajeAnchoTextoPequeno
val anchoTextoDiminuto = CirculoDiminuto * porcentajeAnchoTextoDiminuto
val anchoTextoMicro = CirculoMicro * porcentajeAnchoTextoMicro


val numNumero = ((317.9 / des.density) / relacionDimen).sp

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