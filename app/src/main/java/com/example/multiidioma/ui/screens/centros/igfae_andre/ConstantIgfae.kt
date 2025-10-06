package com.example.multiidioma.ui.screens.centros.igfae_andre


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

val valorFiguraIgfae0 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 20.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.IgfaeMiniscreen7.route,
    numString = "01",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_7_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIgfae1 = NavegationFiguresData(
    offset_x = 260.dp,
    offset_y = 70.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.IgfaeMiniscreen8.route,
    numString = "02",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_8_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIgfae2 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 460.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.IgfaeMiniscreen9.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_9_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIgfae3 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.IgfaeMiniscreen11.route,
    numString = "01",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_11_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIgfae4 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.IgfaeMiniscreen12.route,
    numString = "02",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_12_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIgfae5 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.IgfaeMiniscreen13.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_13_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIgfae6 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.IgfaeMiniscreen15.route,
    numString = "01",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_15_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIgfae7 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.IgfaeMiniscreen16.route,
    numString = "02",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_16_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)



/// INVESTIGADORES

val caslIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Carlos Alberto Salgado López",
    info = listOf(
        /*    R.string.info_investigador_test_1,
            R.string.info_investigador_test_2,
            R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val mvdIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Vieites Díaz",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val napIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Néstor Armesto Pérez",
    info = listOf(
        /*     R.string.info_investigador_test_1,
             R.string.info_investigador_test_2,
             R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)

val bfdIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Jose Edelstein",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)
val cgrIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Beatriz Fernández Domínguez",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.PersonalTemplateScreen
)


val datosInvestigadores = listOf(caslIgfae, mvdIgfae, napIgfae, bfdIgfae)