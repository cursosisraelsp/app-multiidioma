package com.example.multiidioma.ui.screens.centros.igfae_andre


import android.content.res.Resources
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.multiidioma.R
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.data.types.PersonResearcher
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.des


val des = Resources.getSystem().displayMetrics
val numLetra = (80 / des.density).sp
val numLetra2 = ((40 / des.density)).sp
val relacionDimen = 300 / 150
val relacionTexto = (90).dp
val relacionTextoGrande = (175).dp
val numNumeroGrande = ((317.9 / des.density)).sp

val numNumero = ((317.9 / des.density) / relacionDimen).sp

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



///////////////CIRCULOS DE LOS CENTROS/////////////////

val valorFiguraIgfae0 = NavegationFiguresData(
    offset_x = 1.dp,
    offset_y = 1.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoPequeno,
    ruta = Destination.IgfaeMiniscreen7.route,
    numString = "01",
    relacionNum = NumeroPequeno,
    textoInfo = R.string.CS_IGFAE_miniscreen_7_paragraph_2,
    anchoTexto = anchoTextoPequeno,
    lineHeight = LineHeightPequena,
    relacionText = LetraPequena
)

val valorFiguraIgfae1 = NavegationFiguresData(
    offset_x = 260.dp,
    offset_y = 1.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoPequeno,
    ruta = Destination.IgfaeMiniscreen8.route,
    numString = "02",
    relacionNum = NumeroPequeno,
    textoInfo = R.string.CS_IGFAE_miniscreen_8_paragraph_2,
    anchoTexto = anchoTextoPequeno,
    lineHeight = LineHeightPequena,
    relacionText = LetraPequena
)

val valorFiguraIgfae2 = NavegationFiguresData(
    offset_x = 130.dp,
    offset_y = 50.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoPequeno,
    ruta = Destination.IgfaeMiniscreen9.route,
    numString = "03",
    relacionNum = NumeroPequeno,
    textoInfo = R.string.CS_IGFAE_miniscreen_9_paragraph_2,
    anchoTexto = anchoTextoPequeno,
    lineHeight = LineHeightPequena,
    relacionText = LetraPequena
)


val valorFiguraIgfae3 = NavegationFiguresData(
    offset_x = 1.dp,
    offset_y = 10.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoPequeno,
    ruta = Destination.IgfaeMiniscreen11.route,
    numString = "01",
    relacionNum = NumeroPequeno,
    textoInfo = R.string.CS_IGFAE_miniscreen_11_paragraph_2,
    anchoTexto = anchoTextoPequeno,
    lineHeight = LineHeightPequena,
    relacionText = LetraPequena
)

val valorFiguraIgfae4 = NavegationFiguresData(
    offset_x = 260.dp,
    offset_y = 10.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoPequeno,
    ruta = Destination.IgfaeMiniscreen12.route,
    numString = "02",
    relacionNum = NumeroPequeno,
    textoInfo = R.string.CS_IGFAE_miniscreen_12_paragraph_2,
    anchoTexto = anchoTextoPequeno,
    lineHeight = LineHeightPequena,
    relacionText = LetraPequena
)

val valorFiguraIgfae5 = NavegationFiguresData(
    offset_x = 130.dp,
    offset_y = 60.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoPequeno,
    ruta = Destination.IgfaeMiniscreen13.route,
    numString = "03",
    relacionNum = NumeroPequeno,
    textoInfo = R.string.CS_IGFAE_miniscreen_13_paragraph_2,
    anchoTexto = anchoTextoPequeno,
    lineHeight = LineHeightPequena,
    relacionText = LetraPequena
)

val valorFiguraIgfae6 = NavegationFiguresData(
    offset_x = 30.dp,
    offset_y = 20.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoMediano,
    ruta = Destination.IgfaeMiniscreen15.route,
    numString = "01",
    relacionNum = NumeroMediano,
    textoInfo = R.string.CS_IGFAE_miniscreen_15_paragraph_2,
    anchoTexto = anchoTextoMediano,
    lineHeight = LineHeightMediana,
    relacionText = LetraMediana
)

val valorFiguraIgfae7 = NavegationFiguresData(
    offset_x = 200.dp,
    offset_y = 120.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoMediano,
    ruta = Destination.IgfaeMiniscreen16.route,
    numString = "02",
    relacionNum = NumeroMediano,
    textoInfo = R.string.CS_IGFAE_miniscreen_16_paragraph_2,
    anchoTexto = anchoTextoMediano,
    lineHeight = LineHeightMediana,
    relacionText = LetraMediana
)






/// INVESTIGADORES

val caslIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Carlos Alberto Salgado López",
    info = listOf(
        R.string.CS_IGFAE_miniscreen_24_title_0,
        R.string.CS_IGFAE_miniscreen_24_texto_buscado_0,
        R.string.CS_IGFAE_miniscreen_24_title_1,
        R.string.CS_IGFAE_miniscreen_24_texto_buscado_1,
        R.string.CS_IGFAE_miniscreen_24_title_2,
        R.string.CS_IGFAE_miniscreen_24_texto_buscado_2,
        R.string.CS_IGFAE_miniscreen_24_paragraph_0,
        R.string.CS_IGFAE_miniscreen_24_paragraph_1,
        R.string.CS_IGFAE_miniscreen_24_paragraph_2,
        R.string.CS_IGFAE_miniscreen_24_paragraph_3,
        R.string.CS_IGFAE_miniscreen_24_paragraph_4
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val mvdIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Vieites Díaz",
    info = listOf(
        R.string.CS_IGFAE_miniscreen_25_title_0,
        R.string.CS_IGFAE_miniscreen_25_texto_buscado_0,
        R.string.CS_IGFAE_miniscreen_25_title_1,
        R.string.CS_IGFAE_miniscreen_25_texto_buscado_1,
        R.string.CS_IGFAE_miniscreen_25_paragraph_0,
        R.string.CS_IGFAE_miniscreen_25_paragraph_1,
        R.string.CS_IGFAE_miniscreen_25_paragraph_2
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val napIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Néstor Armesto Pérez",
    info = listOf(
        R.string.CS_IGFAE_miniscreen_26_title_0,
        R.string.CS_IGFAE_miniscreen_26_texto_buscado_0,
        R.string.CS_IGFAE_miniscreen_26_title_1,
        R.string.CS_IGFAE_miniscreen_26_texto_buscado_1,
        R.string.CS_IGFAE_miniscreen_26_paragraph_0,
        R.string.CS_IGFAE_miniscreen_26_paragraph_1,
        R.string.CS_IGFAE_miniscreen_26_paragraph_2,
        R.string.CS_IGFAE_miniscreen_26_paragraph_3,
        R.string.CS_IGFAE_miniscreen_26_paragraph_4,
        R.string.CS_IGFAE_miniscreen_26_paragraph_5
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val jeIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Jose Edelstein",
    info = listOf(
        R.string.CS_IGFAE_miniscreen_27_title_0,
        R.string.CS_IGFAE_miniscreen_27_texto_buscado_0,
        R.string.CS_IGFAE_miniscreen_27_title_1,
        R.string.CS_IGFAE_miniscreen_27_texto_buscado_1,
        R.string.CS_IGFAE_miniscreen_27_paragraph_0,
        R.string.CS_IGFAE_miniscreen_27_paragraph_1,
        R.string.CS_IGFAE_miniscreen_27_paragraph_2
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val bfdIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Beatriz Fernández Domínguez",
    info = listOf(
        R.string.CS_IGFAE_miniscreen_28_title_0,
        R.string.CS_IGFAE_miniscreen_28_texto_buscado_0,
        R.string.CS_IGFAE_miniscreen_28_title_1,
        R.string.CS_IGFAE_miniscreen_28_texto_buscado_1,
        R.string.CS_IGFAE_miniscreen_28_paragraph_0,
        R.string.CS_IGFAE_miniscreen_28_paragraph_1,
        R.string.CS_IGFAE_miniscreen_28_paragraph_2,
        R.string.CS_IGFAE_miniscreen_28_paragraph_3,
        R.string.CS_IGFAE_miniscreen_28_paragraph_4
    ),
    contentType = ContentType.PersonalTemplateScreen
)


val datosInvestigadores = listOf(caslIgfae, mvdIgfae, napIgfae, bfdIgfae,jeIgfae)