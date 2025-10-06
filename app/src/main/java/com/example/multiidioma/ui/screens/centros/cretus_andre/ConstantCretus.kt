package com.example.multiidioma.ui.screens.centros.cretus_andre

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

///////////////CIRCULOS DE LOS CENTROS/////////////////

val valorFiguraCretus0 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 20.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.CretusMiniscreen9.route,
    numString = "01",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CRETUS_miniscreen_9_paragraph_1,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraCretus1 = NavegationFiguresData(
    offset_x = 260.dp,
    offset_y = 70.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.CretusMiniscreen10.route,
    numString = "02",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CRETUS_miniscreen_10_paragraph_1,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraCretus2 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 460.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.CretusMiniscreen11.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CRETUS_miniscreen_11_paragraph_1,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraCretus3 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.CretusMiniscreen12.route,
    numString = "04",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CRETUS_miniscreen_12_paragraph_1,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraCretus4 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.CretusMiniscreen13.route,
    numString = "05",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CRETUS_miniscreen_13_paragraph_1,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraCretus5 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.CretusMiniscreen14.route,
    numString = "06",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CRETUS_miniscreen_14_paragraph_1,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraCretus6 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.CretusMiniscreen15.route,
    numString = "07",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CRETUS_miniscreen_15_paragraph_1,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraCretus7 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.CretusMiniscreen16.route,
    numString = "08",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CRETUS_miniscreen_16_paragraph_1,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)





/// INVESTIGADORES

val mtmCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Teresa Moreira",
    info = listOf(
        /*    R.string.info_investigador_test_1,
            R.string.info_investigador_test_2,
            R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val sfCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Sarah Fiol",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val abfCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Andrés Baselga Fraga",
    info = listOf(
        /*     R.string.info_investigador_test_1,
             R.string.info_investigador_test_2,
             R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val gfcCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Gumersindo Feijoo Costa",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val cgrCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Cristina Gómez-Román",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val jmlrCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Juan M. Lema Rodicio",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val mlvCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Llompart Vizoso",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val olcCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Olalla López Costas",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val jlrCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Jesús López Romalde",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val amcCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Anuska Mosquera Corral",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val xlopCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Xosé Lois Otero Pérez",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val vpmCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Vicente Pérez Muñuzuri",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val svlCretus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Sebastián Villasante Larramendi",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val datosInvestigadores = listOf(mtmCretus, sfCretus, abfCretus, gfcCretus, cgrCretus, jmlrCretus, mlvCretus,olcCretus,jlrCretus,amcCretus,xlopCretus,vpmCretus,svlCretus )