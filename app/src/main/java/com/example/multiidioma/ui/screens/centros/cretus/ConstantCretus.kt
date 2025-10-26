package com.example.multiidioma.ui.screens.centros.cretus_andre

import android.content.res.Resources
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.multiidioma.R
import com.example.multiidioma.data.CirculoDiminuto
import com.example.multiidioma.data.CirculoGrande
import com.example.multiidioma.data.CirculoMediano
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.LetraDiminuta
import com.example.multiidioma.data.LetraMediana
import com.example.multiidioma.data.LetraMicro
import com.example.multiidioma.data.LineHeightDiminuta
import com.example.multiidioma.data.LineHeightGrande
import com.example.multiidioma.data.LineHeightMediana
import com.example.multiidioma.data.LineHeightMicro
import com.example.multiidioma.data.NumeroDiminuto
import com.example.multiidioma.data.NumeroGrande
import com.example.multiidioma.data.NumeroMediano
import com.example.multiidioma.data.NumeroMicro
import com.example.multiidioma.data.anchoTextoDiminuto
import com.example.multiidioma.data.anchoTextoGrande
import com.example.multiidioma.data.anchoTextoMediano
import com.example.multiidioma.data.anchoTextoMicro
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.data.types.PersonResearcher



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
    title = null,
    role = R.string.CRETUS_role_0,
    info = listOf(
        R.string.CS_CRETUS_miniscreen_23_paragraph_0,
        R.string.CS_CRETUS_miniscreen_23_paragraph_1,
        R.string.CS_CRETUS_miniscreen_23_paragraph_2,
        R.string.CS_CRETUS_miniscreen_23_paragraph_3,
        R.string.CS_CRETUS_miniscreen_23_paragraph_4
    ),
    contentType = ContentType.PLANTILLA
)


val sfCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Sarah Fiol",
    title = null,
    role = R.string.CRETUS_role_1,
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
    contentType = ContentType.PLANTILLA
)


val abfCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Andrés Baselga Fraga",
    title = R.string.CRETUS_title_0, R.string.CRETUS_title_1,
    role = R.string.CRETUS_role_2,
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
    contentType = ContentType.PLANTILLA
)


val gfcCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Gumersindo Feijoo Costa",
    title = R.string.CRETUS_title_2, R.string.CRETUS_title_3,
    role = R.string.CRETUS_role_3,
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
    contentType = ContentType.PLANTILLA
)


val cgrCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Cristina Gómez-Román",
    title = R.string.CRETUS_title_4,
    R.string.CRETUS_title_5,
    R.string.CRETUS_title_6,
    role = R.string.CRETUS_role_4,
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
    contentType = ContentType.PLANTILLA
)


val jmlrCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Juan M. Lema Rodicio",
    title = R.string.CRETUS_title_7,
    R.string.CRETUS_title_8,
    role = R.string.CRETUS_role_5,
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
    contentType = ContentType.PLANTILLA
)

val mlvCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Llompart Vizoso",
    title = R.string.CRETUS_title_9,R.string.CRETUS_title_10,
    role = R.string.CRETUS_role_6,
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
    contentType = ContentType.PLANTILLA
)


val olcCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Olalla López Costas",
    title = R.string.CRETUS_title_11,R.string.CRETUS_title_12,
    role = R.string.CRETUS_role_7,
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
    contentType = ContentType.PLANTILLA
)

val jlrCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Jesús López Romalde",
    title = R.string.CRETUS_title_13,R.string.CRETUS_title_14,
    role = R.string.CRETUS_role_8,
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
    contentType = ContentType.PLANTILLA
)

val amcCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Anuska Mosquera Corral",
    title = R.string.CRETUS_title_15,R.string.CRETUS_title_16,
    role = R.string.CRETUS_role_9,
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
    contentType = ContentType.PLANTILLA
)

val xlopCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Xosé Lois Otero Pérez",
    title = R.string.CRETUS_title_17,R.string.CRETUS_title_18,
    role = R.string.CRETUS_role_10,
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
    contentType = ContentType.PLANTILLA
)

val vpmCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Vicente Pérez Muñuzuri",
    title = R.string.CRETUS_title_19,R.string.CRETUS_title_20,
    role = R.string.CRETUS_role_11,
    info = listOf(
        R.string.CS_CRETUS_miniscreen_34_paragraph_0,
        R.string.CS_CRETUS_miniscreen_34_paragraph_1,
        R.string.CS_CRETUS_miniscreen_34_paragraph_2,
        R.string.CS_CRETUS_miniscreen_34_paragraph_3,
        R.string.CS_CRETUS_miniscreen_34_paragraph_4,
        R.string.CS_CRETUS_miniscreen_34_paragraph_5
    ),
    contentType = ContentType.PLANTILLA
)

val svlCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Sebastián Villasante Larramendi",
    title = R.string.CRETUS_title_21,R.string.CRETUS_title_22,
    role = R.string.CRETUS_role_12,
    info = listOf(
        R.string.CS_CRETUS_miniscreen_35_paragraph_0,
        R.string.CS_CRETUS_miniscreen_35_paragraph_1,
        R.string.CS_CRETUS_miniscreen_35_paragraph_2
    ),
    contentType = ContentType.PLANTILLA
)


val datosInvestigadoresCretus = listOf(
    mtmCretus,
    sfCretus,
    abfCretus,
    gfcCretus,
    cgrCretus,
    jmlrCretus,
    mlvCretus,
    olcCretus,
    jlrCretus,
    amcCretus,
    xlopCretus,
    vpmCretus,
    svlCretus
)