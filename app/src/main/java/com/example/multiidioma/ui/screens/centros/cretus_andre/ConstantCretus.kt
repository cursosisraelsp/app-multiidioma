package com.example.multiidioma.ui.screens.centros.cretus_andre

import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.data.types.PersonResearcher
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.CirculoDiminuto
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.CirculoGrande
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.CirculoMediano
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.LetraDiminuta
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.LetraMediana
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.LetraMicro
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.LineHeightDiminuta
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.LineHeightGrande
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.LineHeightMediana
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.LineHeightMicro
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.NumeroDiminuto
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.NumeroGrande
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.NumeroMediano
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.NumeroMicro
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.anchoTextoDiminuto
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.anchoTextoGrande
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.anchoTextoMediano
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.anchoTextoMicro

/*
val des = Resources.getSystem().displayMetrics
val numLetra = (80 / des.density).sp
val numLetra2 = ((40 / des.density)).sp
val relacionDimen = 300 / 150
val relacionTexto = (90).dp
val relacionTextoGrande = (175).dp
val numNumeroGrande = ((317.9 / des.density)).sp

val numNumero = ((317.9 / des.density) / relacionDimen).sp


// 🔵 Tamaño del círculo
val CirculoGigante = 260.dp
val CirculoGrande = 230.dp
val CirculoMediano = 200.dp
val CirculoPequeno = 170.dp
val CirculoDiminuto = 140.dp
val CirculoMicro = 110.dp

// 🔢 Tamaño del número dentro del círculo (relación proporcional)
val NumeroGigante   = (300 / des.density).sp
val NumeroGrande    = (240 / des.density).sp
val NumeroMediano   = (180 / des.density).sp
val NumeroPequeno   = (140 / des.density).sp
val NumeroDiminuto  = (120 / des.density).sp
val NumeroMicro     = (100 / des.density).sp

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
*/


///////////////CIRCULOS DE LOS CENTROS/////////////////

val valorFiguraCretus0 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 7.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoDiminuto,
    ruta = Destination.CretusMiniscreen9.route,
    numString = "01",
    relacionNum = NumeroMicro,
    textoInfo = R.string.CS_CRETUS_miniscreen_9_paragraph_1,
    anchoTexto = anchoTextoMicro,
    lineHeight = LineHeightMicro,
    relacionText = LetraMicro
)
val valorFiguraCretus1 = NavegationFiguresData(
    offset_x = 160.dp,
    offset_y = 10.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoMediano,
    ruta = Destination.CretusMiniscreen10.route,
    numString = "02",
    relacionNum = NumeroMediano,
    textoInfo = R.string.CS_CRETUS_miniscreen_10_paragraph_1,
    anchoTexto = anchoTextoMediano,
    lineHeight = LineHeightMediana,
    relacionText = LetraMediana
)

val valorFiguraCretus2 = NavegationFiguresData(
    offset_x = 18.dp,
    offset_y = 120.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoMediano,
    ruta = Destination.CretusMiniscreen11.route,
    numString = "03",
    relacionNum = NumeroMediano,
    textoInfo = R.string.CS_CRETUS_miniscreen_11_paragraph_1,
    anchoTexto = anchoTextoMediano,
    lineHeight = LineHeightMediana,
    relacionText = LetraMediana
)

val valorFiguraCretus3 = NavegationFiguresData(
    offset_x = 280.dp,
    offset_y = 155.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoDiminuto,
    ruta = Destination.CretusMiniscreen12.route,
    numString = "04",
    relacionNum = NumeroDiminuto,
    textoInfo = R.string.CS_CRETUS_miniscreen_12_paragraph_1,
    anchoTexto = anchoTextoDiminuto,
    lineHeight = LineHeightDiminuta,
    relacionText = LetraDiminuta
)

val valorFiguraCretus4 = NavegationFiguresData(
    offset_x = 25.dp,
    offset_y = 300.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoDiminuto,
    ruta = Destination.CretusMiniscreen13.route,
    numString = "05",
    relacionNum = NumeroDiminuto,
    textoInfo = R.string.CS_CRETUS_miniscreen_13_paragraph_1,
    anchoTexto = anchoTextoDiminuto,
    lineHeight = LineHeightDiminuta,
    relacionText = LetraDiminuta
)

val valorFiguraCretus5 = NavegationFiguresData(
    offset_x = 145.dp,
    offset_y = 240.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoGrande,
    ruta = Destination.CretusMiniscreen14.route,
    numString = "06",
    relacionNum = NumeroGrande,
    textoInfo = R.string.CS_CRETUS_miniscreen_14_paragraph_1,
    anchoTexto = anchoTextoGrande,
    lineHeight = LineHeightGrande,
    relacionText = LetraMediana
)

val valorFiguraCretus6 = NavegationFiguresData(
    offset_x = 60.dp,
    offset_y = 420.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoDiminuto,
    ruta = Destination.CretusMiniscreen15.route,
    numString = "07",
    relacionNum = NumeroDiminuto,
    textoInfo = R.string.CS_CRETUS_miniscreen_15_paragraph_1,
    anchoTexto = anchoTextoDiminuto,
    lineHeight = LineHeightDiminuta,
    relacionText = LetraDiminuta
)

val valorFiguraCretus7 = NavegationFiguresData(
    offset_x = 230.dp,
    offset_y = 445.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoDiminuto,
    ruta = Destination.CretusMiniscreen16.route,
    numString = "08",
    relacionNum = NumeroDiminuto,
    textoInfo = R.string.CS_CRETUS_miniscreen_16_paragraph_1,
    anchoTexto = anchoTextoDiminuto,
    lineHeight = LineHeightDiminuta,
    relacionText = LetraDiminuta
)




/// INVESTIGADORES

val mtmCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Teresa Moreira",
    info = listOf(
        R.string.CS_CRETUS_miniscreen_23_paragraph_0,
        R.string.CS_CRETUS_miniscreen_23_paragraph_1,
        R.string.CS_CRETUS_miniscreen_23_paragraph_2,
        R.string.CS_CRETUS_miniscreen_23_paragraph_3,
        R.string.CS_CRETUS_miniscreen_23_paragraph_4
    ),
    contentType = ContentType.PersonalTemplateScreen
)


val sfCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Sarah Fiol",
    info = listOf(
        R.string.CS_CRETUS_miniscreen_24_title_1,
        R.string.CS_CRETUS_miniscreen_24_texto_buscado_1,
        R.string.CS_CRETUS_miniscreen_24_paragraph_0,
        R.string.CS_CRETUS_miniscreen_24_paragraph_1,
        R.string.CS_CRETUS_miniscreen_24_paragraph_2,
        R.string.CS_CRETUS_miniscreen_24_paragraph_3,
        R.string.CS_CRETUS_miniscreen_24_paragraph_4,
        R.string.CS_CRETUS_miniscreen_24_paragraph_5
    ),
    contentType = ContentType.PersonalTemplateScreen
)


val abfCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Andrés Baselga Fraga",
    info = listOf(
        R.string.CS_CRETUS_miniscreen_25_title_1,
        R.string.CS_CRETUS_miniscreen_25_texto_buscado_1,
        R.string.CS_CRETUS_miniscreen_25_title_2,
        R.string.CS_CRETUS_miniscreen_25_texto_buscado_2,
        R.string.CS_CRETUS_miniscreen_25_title_3,
        R.string.CS_CRETUS_miniscreen_25_texto_buscado_3,
        R.string.CS_CRETUS_miniscreen_25_paragraph_0,
        R.string.CS_CRETUS_miniscreen_25_paragraph_1,
        R.string.CS_CRETUS_miniscreen_25_title_4,
        R.string.CS_CRETUS_miniscreen_25_paragraph_2,
        R.string.CS_CRETUS_miniscreen_25_paragraph_3,
        R.string.CS_CRETUS_miniscreen_25_paragraph_4,
        R.string.CS_CRETUS_miniscreen_25_paragraph_5,
        R.string.CS_CRETUS_miniscreen_25_paragraph_6
    ),
    contentType = ContentType.PersonalTemplateScreen
)


val gfcCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Gumersindo Feijoo Costa",
    info = listOf(
        R.string.CS_CRETUS_miniscreen_26_title_1,
        R.string.CS_CRETUS_miniscreen_26_texto_buscado_1,
        R.string.CS_CRETUS_miniscreen_26_title_2,
        R.string.CS_CRETUS_miniscreen_26_texto_buscado_2,
        R.string.CS_CRETUS_miniscreen_26_title_3,
        R.string.CS_CRETUS_miniscreen_26_texto_buscado_3,
        R.string.CS_CRETUS_miniscreen_26_paragraph_0,
        R.string.CS_CRETUS_miniscreen_26_paragraph_1,
        R.string.CS_CRETUS_miniscreen_26_paragraph_2,
        R.string.CS_CRETUS_miniscreen_26_title_4,
        R.string.CS_CRETUS_miniscreen_26_paragraph_3,
        R.string.CS_CRETUS_miniscreen_26_paragraph_4,
        R.string.CS_CRETUS_miniscreen_26_paragraph_5,
        R.string.CS_CRETUS_miniscreen_26_paragraph_6,
        R.string.CS_CRETUS_miniscreen_26_paragraph_7,
        R.string.CS_CRETUS_miniscreen_26_paragraph_8,
        R.string.CS_CRETUS_miniscreen_26_paragraph_9,
        R.string.CS_CRETUS_miniscreen_26_paragraph_10,
        R.string.CS_CRETUS_miniscreen_26_paragraph_11,
        R.string.CS_CRETUS_miniscreen_26_paragraph_12,
        R.string.CS_CRETUS_miniscreen_26_paragraph_13,
        R.string.CS_CRETUS_miniscreen_26_paragraph_14,
        R.string.CS_CRETUS_miniscreen_26_paragraph_15,
        R.string.CS_CRETUS_miniscreen_26_paragraph_16,
        R.string.CS_CRETUS_miniscreen_26_paragraph_17,
        R.string.CS_CRETUS_miniscreen_26_paragraph_18
    ),
    contentType = ContentType.PersonalTemplateScreen
)


val cgrCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Cristina Gómez-Román",
    info = listOf(
        R.string.CS_CRETUS_miniscreen_27_title_1,
        R.string.CS_CRETUS_miniscreen_27_texto_buscado_1,
        R.string.CS_CRETUS_miniscreen_27_title_2,
        R.string.CS_CRETUS_miniscreen_27_texto_buscado_2,
        R.string.CS_CRETUS_miniscreen_27_title_3,
        R.string.CS_CRETUS_miniscreen_27_texto_buscado_3,
        R.string.CS_CRETUS_miniscreen_27_paragraph_0,
        R.string.CS_CRETUS_miniscreen_27_paragraph_1,
        R.string.CS_CRETUS_miniscreen_27_paragraph_2,
        R.string.CS_CRETUS_miniscreen_27_paragraph_3,
        R.string.CS_CRETUS_miniscreen_27_paragraph_4,
        R.string.CS_CRETUS_miniscreen_27_title_4,
        R.string.CS_CRETUS_miniscreen_27_paragraph_5,
        R.string.CS_CRETUS_miniscreen_27_paragraph_6,
        R.string.CS_CRETUS_miniscreen_27_paragraph_7,
        R.string.CS_CRETUS_miniscreen_27_paragraph_8,
        R.string.CS_CRETUS_miniscreen_27_paragraph_9,
        R.string.CS_CRETUS_miniscreen_27_paragraph_10
    ),
    contentType = ContentType.PersonalTemplateScreen
)


val jmlrCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Juan M. Lema Rodicio",
    info = listOf(
        R.string.CS_CRETUS_miniscreen_28_title_1,
        R.string.CS_CRETUS_miniscreen_28_texto_buscado_1,
        R.string.CS_CRETUS_miniscreen_28_title_2,
        R.string.CS_CRETUS_miniscreen_28_texto_buscado_2,
        R.string.CS_CRETUS_miniscreen_28_title_3,
        R.string.CS_CRETUS_miniscreen_28_texto_buscado_3,
        R.string.CS_CRETUS_miniscreen_28_paragraph_0,
        R.string.CS_CRETUS_miniscreen_28_paragraph_1,
        R.string.CS_CRETUS_miniscreen_28_paragraph_2,
        R.string.CS_CRETUS_miniscreen_28_paragraph_3,
        R.string.CS_CRETUS_miniscreen_28_paragraph_4,
        R.string.CS_CRETUS_miniscreen_28_paragraph_5,
        R.string.CS_CRETUS_miniscreen_28_title_4,
        R.string.CS_CRETUS_miniscreen_28_paragraph_6,
        R.string.CS_CRETUS_miniscreen_28_paragraph_7,
        R.string.CS_CRETUS_miniscreen_28_paragraph_8,
        R.string.CS_CRETUS_miniscreen_28_paragraph_9,
        R.string.CS_CRETUS_miniscreen_28_paragraph_10,
        R.string.CS_CRETUS_miniscreen_28_paragraph_11
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val mlvCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Llompart Vizoso",
    info = listOf(
        R.string.CS_CRETUS_miniscreen_29_paragraph_0,
        R.string.CS_CRETUS_miniscreen_29_paragraph_1,
        R.string.CS_CRETUS_miniscreen_29_paragraph_2,
        R.string.CS_CRETUS_miniscreen_29_paragraph_3,
        R.string.CS_CRETUS_miniscreen_29_paragraph_4,
        R.string.CS_CRETUS_miniscreen_29_paragraph_5,
        R.string.CS_CRETUS_miniscreen_29_paragraph_6,
        R.string.CS_CRETUS_miniscreen_29_paragraph_7,
        R.string.CS_CRETUS_miniscreen_29_paragraph_8,
        R.string.CS_CRETUS_miniscreen_29_paragraph_9,
        R.string.CS_CRETUS_miniscreen_29_paragraph_10,
        R.string.CS_CRETUS_miniscreen_29_paragraph_11,
        R.string.CS_CRETUS_miniscreen_29_paragraph_12,
        R.string.CS_CRETUS_miniscreen_29_paragraph_13,
        R.string.CS_CRETUS_miniscreen_29_paragraph_14
    ),
    contentType = ContentType.PersonalTemplateScreen
)


val olcCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Olalla López Costas",
    info = listOf(
        R.string.CS_CRETUS_miniscreen_30_paragraph_0,
        R.string.CS_CRETUS_miniscreen_30_paragraph_1,
        R.string.CS_CRETUS_miniscreen_30_paragraph_2,
        R.string.CS_CRETUS_miniscreen_30_paragraph_3,
        R.string.CS_CRETUS_miniscreen_30_paragraph_4,
        R.string.CS_CRETUS_miniscreen_30_paragraph_5,
        R.string.CS_CRETUS_miniscreen_30_paragraph_6,
        R.string.CS_CRETUS_miniscreen_30_paragraph_7,
        R.string.CS_CRETUS_miniscreen_30_paragraph_8,
        R.string.CS_CRETUS_miniscreen_30_paragraph_9,
        R.string.CS_CRETUS_miniscreen_30_paragraph_10,
        R.string.CS_CRETUS_miniscreen_30_paragraph_11
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val jlrCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Jesús López Romalde",
    info = listOf(
        R.string.CS_CRETUS_miniscreen_31_paragraph_0,
        R.string.CS_CRETUS_miniscreen_31_paragraph_1,
        R.string.CS_CRETUS_miniscreen_31_paragraph_2,
        R.string.CS_CRETUS_miniscreen_31_paragraph_3,
        R.string.CS_CRETUS_miniscreen_31_paragraph_4,
        R.string.CS_CRETUS_miniscreen_31_paragraph_5,
        R.string.CS_CRETUS_miniscreen_31_paragraph_6,
        R.string.CS_CRETUS_miniscreen_31_paragraph_7,
        R.string.CS_CRETUS_miniscreen_31_paragraph_8,
        R.string.CS_CRETUS_miniscreen_31_paragraph_9,
        R.string.CS_CRETUS_miniscreen_31_paragraph_10,
        R.string.CS_CRETUS_miniscreen_31_paragraph_11
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val amcCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Anuska Mosquera Corral",
    info = listOf(
        R.string.CS_CRETUS_miniscreen_32_paragraph_0,
        R.string.CS_CRETUS_miniscreen_32_paragraph_1,
        R.string.CS_CRETUS_miniscreen_32_paragraph_2,
        R.string.CS_CRETUS_miniscreen_32_paragraph_3,
        R.string.CS_CRETUS_miniscreen_32_paragraph_4,
        R.string.CS_CRETUS_miniscreen_32_paragraph_5,
        R.string.CS_CRETUS_miniscreen_32_paragraph_6,
        R.string.CS_CRETUS_miniscreen_32_paragraph_7,
        R.string.CS_CRETUS_miniscreen_32_paragraph_8,
        R.string.CS_CRETUS_miniscreen_32_paragraph_9
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val xlopCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Xosé Lois Otero Pérez",
    info = listOf(
        R.string.CS_CRETUS_miniscreen_33_paragraph_0,
        R.string.CS_CRETUS_miniscreen_33_paragraph_1,
        R.string.CS_CRETUS_miniscreen_33_paragraph_2,
        R.string.CS_CRETUS_miniscreen_33_paragraph_3,
        R.string.CS_CRETUS_miniscreen_33_paragraph_4,
        R.string.CS_CRETUS_miniscreen_33_paragraph_5,
        R.string.CS_CRETUS_miniscreen_33_paragraph_6,
        R.string.CS_CRETUS_miniscreen_33_paragraph_7,
        R.string.CS_CRETUS_miniscreen_33_paragraph_8,
        R.string.CS_CRETUS_miniscreen_33_paragraph_9,
        R.string.CS_CRETUS_miniscreen_33_paragraph_10,
        R.string.CS_CRETUS_miniscreen_33_paragraph_11,
        R.string.CS_CRETUS_miniscreen_33_paragraph_12,
        R.string.CS_CRETUS_miniscreen_33_paragraph_13,
        R.string.CS_CRETUS_miniscreen_33_paragraph_14,
        R.string.CS_CRETUS_miniscreen_33_paragraph_15,
        R.string.CS_CRETUS_miniscreen_33_paragraph_16,
        R.string.CS_CRETUS_miniscreen_33_paragraph_17,
        R.string.CS_CRETUS_miniscreen_33_paragraph_18,
        R.string.CS_CRETUS_miniscreen_33_paragraph_19,
        R.string.CS_CRETUS_miniscreen_33_paragraph_20,
        R.string.CS_CRETUS_miniscreen_33_paragraph_21,
        R.string.CS_CRETUS_miniscreen_33_paragraph_22
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val vpmCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Vicente Pérez Muñuzuri",
    info = listOf(
        R.string.CS_CRETUS_miniscreen_34_paragraph_0,
        R.string.CS_CRETUS_miniscreen_34_paragraph_1,
        R.string.CS_CRETUS_miniscreen_34_paragraph_2,
        R.string.CS_CRETUS_miniscreen_34_paragraph_3,
        R.string.CS_CRETUS_miniscreen_34_paragraph_4,
        R.string.CS_CRETUS_miniscreen_34_paragraph_5
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val svlCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Sebastián Villasante Larramendi",
    info = listOf(
        R.string.CS_CRETUS_miniscreen_35_paragraph_0,
        R.string.CS_CRETUS_miniscreen_35_paragraph_1,
        R.string.CS_CRETUS_miniscreen_35_paragraph_2
    ),
    contentType = ContentType.PersonalTemplateScreen
)


val datosInvestigadores = listOf(mtmCretus, sfCretus, abfCretus, gfcCretus, cgrCretus, jmlrCretus, mlvCretus,olcCretus,jlrCretus,amcCretus,xlopCretus,vpmCretus,svlCretus )