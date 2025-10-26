package com.example.multiidioma.ui.screens.institutes.ipsius_andre

import android.content.res.Resources
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.multiidioma.R
import com.example.multiidioma.data.CirculoDiminuto
import com.example.multiidioma.data.CirculoGigante
import com.example.multiidioma.data.CirculoMediano
import com.example.multiidioma.data.CirculoMicro
import com.example.multiidioma.data.CirculoPequeno
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.LetraDiminuta
import com.example.multiidioma.data.LetraGigante
import com.example.multiidioma.data.LetraMediana
import com.example.multiidioma.data.LetraMicro
import com.example.multiidioma.data.LetraPequena
import com.example.multiidioma.data.LineHeightDiminuta
import com.example.multiidioma.data.LineHeightGigante
import com.example.multiidioma.data.LineHeightMediana
import com.example.multiidioma.data.LineHeightMicro
import com.example.multiidioma.data.LineHeightPequena
import com.example.multiidioma.data.NumeroDiminuto
import com.example.multiidioma.data.NumeroGigante
import com.example.multiidioma.data.NumeroMediano
import com.example.multiidioma.data.NumeroMicro
import com.example.multiidioma.data.NumeroPequeno
import com.example.multiidioma.data.anchoTextoDiminuto
import com.example.multiidioma.data.anchoTextoGigante
import com.example.multiidioma.data.anchoTextoMediano
import com.example.multiidioma.data.anchoTextoMicro
import com.example.multiidioma.data.anchoTextoPequeno
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.data.types.PersonResearcher


val valorFiguraIpsius0 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 16.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = CirculoDiminuto,
    ruta = Destination.IpsiusMiniscreen7.route,
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
    ruta = Destination.IpsiusMiniscreen8.route,
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
    ruta = Destination.IpsiusMiniscreen9.route,
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
    ruta = Destination.IpsiusMiniscreen10.route,
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
    ruta = Destination.IpsiusMiniscreen11.route,
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
    ruta = Destination.IpsiusMiniscreen12.route,
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
    ruta = Destination.IpsiusMiniscreen13.route,
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
    title = null,
    role = R.string.Directora,
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
    title = null,
    role = R.string.Secretaria,
    info = listOf(
        R.string.II_IPSIUS_miniscreen_21_title_0,
        R.string.II_IPSIUS_miniscreen_21_texto_buscado_0,
        R.string.II_IPSIUS_miniscreen_21_title_1,
        R.string.II_IPSIUS_miniscreen_21_texto_buscado_1,
        R.string.II_IPSIUS_miniscreen_21_paragraph_0,
        R.string.II_IPSIUS_miniscreen_21_paragraph_1
    ), contentType = ContentType.PLANTILLA
)

val cmvIpsius = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Carmela Martínez Vispo",
    title = null,
    role = R.string.Secretaria,
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
    title = null,
    role = null,
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
    title = null,
    role = null,
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
    title = null,
    role = null,
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
    title = null,
    role = null,
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
    title = null,
    role = null,
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
    title = null,
    role = null,
    info = listOf(
        R.string.II_IPSIUS_miniscreen_28_title_0,
        R.string.II_IPSIUS_miniscreen_28_texto_buscado_0,
        R.string.II_IPSIUS_miniscreen_28_paragraph_0,
        R.string.II_IPSIUS_miniscreen_28_paragraph_1
    ),
    contentType = ContentType.PLANTILLA
)


val datosInvestigadoresIpsius = listOf(
    ifcIpsius,
    srhIpsius,
    cmvIpsius,
    ebiIpsius,
    fciIpsius,
    nmnIpsius,
    fcmIpsius,
    ertIpsius,
    llrIpsius
)