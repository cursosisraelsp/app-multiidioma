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


// Escala de texto progresiva
// Tamaños de letra con más contraste entre ellos
val letraGigante = (96 / des.density).sp       // Muy grande (~38sp en densidad 2.5)
val letraGrande = (78 / des.density).sp        // Grande (~31sp)
val letraMediana = (60 / des.density).sp       // Mediana (~24sp)
val letraPequena = (45 / des.density).sp       // Pequeña (~18sp)
val letraDiminuta = (30 / des.density).sp      // Muy pequeña (~12sp)


// Altura de línea proporcional (mayor para letras más grandes)
// Altura de línea proporcional a cada tamaño de letra


val lineHeightGigante = letraGigante * 1.3f    // Título destacado
val lineHeightGrande = letraGrande * 1.2f
val lineHeightMediana = letraMediana * 1.15f
val lineHeightPequena = letraPequena * 1.05f
val lineHeightDiminuta = letraDiminuta * 1.0f  // Justo, sin espacio extra




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
    tamanhoFigura = 140.dp,
    ruta = Destination.IarcusMiniscreen11.route,
    numString = "04",
    relacionNum = numNumero,
    textoInfo = R.string.II_IARCUS_miniscreen_11_paragraph_3,
    anchoTexto = relacionTexto,
    lineHeight = lineHeightDiminuta,
    relacionText = letraDiminuta
)


/// INVESTIGADORES

val cpdIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Carlos Pereira Dopazo",
    info = listOf(
        /*    R.string.info_investigador_test_1,
            R.string.info_investigador_test_2,
            R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val jsqaIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "José Benito Quintana Álvarez",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val mibmIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Isabel Bandín Matos",
    info = listOf(
        /*     R.string.info_investigador_test_1,
             R.string.info_investigador_test_2,
             R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val abiIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Antón Barreiro Iglesias",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val jmlvIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "José Manuel Leiro Vidal",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val bmfIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Beatriz Magariños Ferro",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val pmcIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Pablo Meira Cartea",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val amgIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Azucena Mora Gutiérrez",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val amocIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Ana María Otero Casal",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val mrrrIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Mª del Rosario Rodil Rodríguez",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val irpIarcus = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Isaac Rodríguez Pereiro",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val datosInvestigadores = listOf(cpdIarcus, jsqaIarcus, mibmIarcus, abiIarcus, jmlvIarcus, bmfIarcus, pmcIarcus,amgIarcus,amocIarcus,mrrrIarcus,irpIarcus )