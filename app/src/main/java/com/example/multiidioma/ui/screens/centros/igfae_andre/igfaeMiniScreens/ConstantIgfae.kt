package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens


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

val valorFigura0 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 20.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Igfae.route,
    numString = "01",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_7_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFigura1 = NavegationFiguresData(
    offset_x = 260.dp,
    offset_y = 70.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Igfae.route,
    numString = "02",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_8_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFigura2 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 460.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Igfae.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_9_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFigura3 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Igfae.route,
    numString = "04",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_10_paragraph_3,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFigura4 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Igfae.route,
    numString = "05",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_11_paragraph_3,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFigura5 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Igfae.route,
    numString = "06",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_12_paragraph_3,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFigura6 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Igfae.route,
    numString = "07",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_13_paragraph_3,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFigura7 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Igfae.route,
    numString = "08",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_14_paragraph_3,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFigura8 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Igfae.route,
    numString = "09",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_15_paragraph_3,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFigura9 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Igfae.route,
    numString = "10",
    relacionNum = numNumero,
    textoInfo = R.string.CS_IGFAE_miniscreen_16_paragraph_3,
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
    contentType = ContentType.MINISCREEN24
)

val mvdIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "María Vieites Díaz",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN25
)

val napIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Néstor Armesto Pérez",
    info = listOf(
        /*     R.string.info_investigador_test_1,
             R.string.info_investigador_test_2,
             R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN26
)

val bfdIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Jose Edelstein",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN27
)
val cgrIgfae = PersonResearcher(
    foto = R.drawable.cientifico,
    name = "Beatriz Fernández Domínguez",
    info = listOf(
        /*   R.string.info_investigador_test_1,
           R.string.info_investigador_test_2,
           R.string.info_investigador_test_3*/
    ),
    contentType = ContentType.MINISCREEN28
)


val datosInvestigadores = listOf(caslIgfae, mvdIgfae, napIgfae, bfdIgfae)