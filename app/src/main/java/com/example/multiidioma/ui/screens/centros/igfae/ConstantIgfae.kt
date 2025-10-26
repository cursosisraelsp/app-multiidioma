package com.example.multiidioma.ui.screens.centros.igfae_andre


import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.CirculoMediano
import com.example.multiidioma.data.CirculoPequeno
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.LetraMediana
import com.example.multiidioma.data.LetraPequena
import com.example.multiidioma.data.LineHeightMediana
import com.example.multiidioma.data.LineHeightPequena
import com.example.multiidioma.data.NumeroMediano
import com.example.multiidioma.data.NumeroPequeno
import com.example.multiidioma.data.anchoTextoMediano
import com.example.multiidioma.data.anchoTextoPequeno
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.data.types.PersonResearcher


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
    title = R.string.IGFAE_catedratico_0,
    role = R.string.IGFAE_director,
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
    contentType = ContentType.PLANTILLA
)

val mvdIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Vieites Díaz",
    title = R.string.IGFAE_investigador_0,
    role = null,
    info = listOf(
        R.string.CS_IGFAE_miniscreen_25_title_0,
        R.string.CS_IGFAE_miniscreen_25_texto_buscado_0,
        R.string.CS_IGFAE_miniscreen_25_title_1,
        R.string.CS_IGFAE_miniscreen_25_texto_buscado_1,
        R.string.CS_IGFAE_miniscreen_25_paragraph_0,
        R.string.CS_IGFAE_miniscreen_25_paragraph_1,
        R.string.CS_IGFAE_miniscreen_25_paragraph_2
    ),
    contentType = ContentType.PLANTILLA
)

val napIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Néstor Armesto Pérez",
    title = R.string.IGFAE_catedratico_1,
    role = null,
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
    contentType = ContentType.PLANTILLA
)

val jeIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Jose Edelstein",
    title = R.string.IGFAE_catedratico_1,
    role = null,
    info = listOf(
        R.string.CS_IGFAE_miniscreen_27_title_0,
        R.string.CS_IGFAE_miniscreen_27_texto_buscado_0,
        R.string.CS_IGFAE_miniscreen_27_title_1,
        R.string.CS_IGFAE_miniscreen_27_texto_buscado_1,
        R.string.CS_IGFAE_miniscreen_27_paragraph_0,
        R.string.CS_IGFAE_miniscreen_27_paragraph_1,
        R.string.CS_IGFAE_miniscreen_27_paragraph_2
    ),
    contentType = ContentType.PLANTILLA
)

val bfdIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Beatriz Fernández Domínguez",
    title = R.string.IGFAE_catedratico_2,
    role = null,
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
    contentType = ContentType.PLANTILLA
)


val datosInvestigadoresIgfae = listOf(caslIgfae, mvdIgfae, napIgfae, bfdIgfae, jeIgfae)