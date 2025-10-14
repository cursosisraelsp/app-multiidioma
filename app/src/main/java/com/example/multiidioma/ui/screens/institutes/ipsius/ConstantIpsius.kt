package com.example.multiidioma.ui.screens.institutes.ipsius



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


val valorFiguraIpsius0 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 16.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoDiminuto,
    ruta = Destination.Cretus.route,
    numString = "01",
    relacionNum = NumeroDiminuto,
    textoInfo = R.string.II_IPSIUS_miniscreen_7_paragraph_2,
    anchoTexto = anchoTextoDiminuto,
    lineHeight = LineHeightDiminuta,
    relacionText = LetraDiminuta
)

val valorFiguraIpsius1 = NavegationFiguresData(
    offset_x = 90.dp,
    offset_y = 100.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoGigante,
    ruta = Destination.Cretus.route,
    numString = "02",
    relacionNum = NumeroGigante,
    textoInfo = R.string.II_IPSIUS_miniscreen_8_paragraph_2,
    anchoTexto = anchoTextoGigante,
    lineHeight = LineHeightGigante,
    relacionText = LetraGigante
)

val valorFiguraIpsius2 = NavegationFiguresData(
    offset_x = 280.dp,
    offset_y = 22.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoMicro,
    ruta = Destination.Cretus.route,
    numString = "03",
    relacionNum = NumeroMicro,
    textoInfo = R.string.II_IPSIUS_miniscreen_9_paragraph_2,
    anchoTexto = anchoTextoMicro,
    lineHeight = LineHeightMicro,
    relacionText = LetraMicro
)

val valorFiguraIpsius3 = NavegationFiguresData(
    offset_x = 16.dp,
    offset_y = 275.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoDiminuto,
    ruta = Destination.Imatus.route,
    numString = "04",
    relacionNum = NumeroDiminuto,
    textoInfo = R.string.II_IPSIUS_miniscreen_10_paragraph_3,
    anchoTexto = anchoTextoDiminuto,
    lineHeight = LineHeightDiminuta,
    relacionText = LetraDiminuta
)

val valorFiguraIpsius4 = NavegationFiguresData(
    offset_x = 25.dp,
    offset_y = 390.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoMediano,
    ruta = Destination.Cretus.route,
    numString = "05",
    relacionNum = NumeroMediano,
    textoInfo = R.string.II_IPSIUS_miniscreen_11_paragraph_1,
    anchoTexto = anchoTextoMediano,
    lineHeight = LineHeightMediana,
    relacionText = LetraMediana
)

val valorFiguraIpsius5 = NavegationFiguresData(
    offset_x = 250.dp,
    offset_y = 320.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoMicro,
    ruta = Destination.Cretus.route,
    numString = "06",
    relacionNum = NumeroMicro,
    textoInfo = R.string.II_IPSIUS_miniscreen_12_paragraph_2,
    anchoTexto = anchoTextoMicro,
    lineHeight = LineHeightMicro,
    relacionText = LetraMicro
)

val valorFiguraIpsius6 = NavegationFiguresData(
    offset_x = 250.dp,
    offset_y = 420.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoPequeno,
    ruta = Destination.Cretus.route,
    numString = "07",
    relacionNum = NumeroPequeno,
    textoInfo = R.string.II_IPSIUS_miniscreen_13_paragraph_3,
    anchoTexto = anchoTextoPequeno,
    lineHeight = LineHeightPequena,
    relacionText = LetraPequena
)



/// INVESTIGADORES

val ifcIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Isabel Fraga Carou",
    info = listOf(
        R.string.II_IPSIUS_miniscreen_20_title_0,
        R.string.II_IPSIUS_miniscreen_20_texto_buscado_0,
        R.string.II_IPSIUS_miniscreen_20_title_1,
        R.string.II_IPSIUS_miniscreen_20_texto_buscado_1,
        R.string.II_IPSIUS_miniscreen_20_paragraph_0,
        R.string.II_IPSIUS_miniscreen_20_paragraph_1
    ),
    contentType = ContentType.PLANTILLA
)

val srhIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Socorro Rodríguez Holguín",
    info = listOf(
        R.string.II_IPSIUS_miniscreen_21_title_0,
        R.string.II_IPSIUS_miniscreen_21_texto_buscado_0,
        R.string.II_IPSIUS_miniscreen_21_title_1,
        R.string.II_IPSIUS_miniscreen_21_texto_buscado_1,
        R.string.II_IPSIUS_miniscreen_21_paragraph_0,
        R.string.II_IPSIUS_miniscreen_21_paragraph_1
    ),
    contentType = ContentType.PLANTILLA
)

val cmvIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Carmela Martínez Vispo",
    info = listOf(
        R.string.II_IPSIUS_miniscreen_22_title_0,
        R.string.II_IPSIUS_miniscreen_22_texto_buscado_0,
        R.string.II_IPSIUS_miniscreen_22_paragraph_0,
        R.string.II_IPSIUS_miniscreen_22_paragraph_1
    ),
    contentType = ContentType.PLANTILLA
)

val ebiIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Elisardo Becoña Iglesias",
    info = listOf(
        R.string.II_IPSIUS_miniscreen_23_title_0,
        R.string.II_IPSIUS_miniscreen_23_texto_buscado_0,
        R.string.II_IPSIUS_miniscreen_23_paragraph_0,
        R.string.II_IPSIUS_miniscreen_23_paragraph_1
    ),
    contentType = ContentType.PLANTILLA
)

val fciIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Francisco Caamaño Isorna",
    info = listOf(
        R.string.II_IPSIUS_miniscreen_24_title_0,
        R.string.II_IPSIUS_miniscreen_24_texto_buscado_0,
        R.string.II_IPSIUS_miniscreen_24_paragraph_0,
        R.string.II_IPSIUS_miniscreen_24_paragraph_1
    ),
    contentType = ContentType.PLANTILLA
)

val nmnIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Narmeen Mallah Nasrallah",
    info = listOf(
        R.string.II_IPSIUS_miniscreen_25_title_0,
        R.string.II_IPSIUS_miniscreen_25_texto_buscado_0,
        R.string.II_IPSIUS_miniscreen_25_paragraph_0,
        R.string.II_IPSIUS_miniscreen_25_paragraph_1
    ),
    contentType = ContentType.PLANTILLA
)

val fcmIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Fernando Cadaveira Mahía",
    info = listOf(
        R.string.II_IPSIUS_miniscreen_26_title_0,
        R.string.II_IPSIUS_miniscreen_26_texto_buscado_0,
        R.string.II_IPSIUS_miniscreen_26_paragraph_0,
        R.string.II_IPSIUS_miniscreen_26_paragraph_1
    ),
    contentType = ContentType.PLANTILLA
)

val ertIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Estrella Romero Triñanes",
    info = listOf(
        R.string.II_IPSIUS_miniscreen_27_title_0,
        R.string.II_IPSIUS_miniscreen_27_texto_buscado_0,
        R.string.II_IPSIUS_miniscreen_27_paragraph_0,
        R.string.II_IPSIUS_miniscreen_27_paragraph_1
    ),
    contentType = ContentType.PLANTILLA
)

val llrIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Laura López-Romero",
    info = listOf(
        R.string.II_IPSIUS_miniscreen_28_title_0,
        R.string.II_IPSIUS_miniscreen_28_texto_buscado_0,
        R.string.II_IPSIUS_miniscreen_28_paragraph_0,
        R.string.II_IPSIUS_miniscreen_28_paragraph_1
    ),
    contentType = ContentType.PLANTILLA
)




val datosInvestigadoresIpsius = listOf(ifcIpsius, srhIpsius, cmvIpsius, ebiIpsius, fciIpsius, nmnIpsius, fcmIpsius,ertIpsius,llrIpsius )