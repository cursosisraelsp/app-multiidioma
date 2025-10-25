package com.example.multiidioma.ui.screens.centros.ciqus

import android.content.res.Resources
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.multiidioma.R
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.types.NavegationFiguresData

val des = Resources.getSystem().displayMetrics
val numLetra = (80/des.density).sp
val numLetra2 = ((40/des.density)).sp
val relacionDimen = 300/150
val relacionTexto = (90).dp
val relacionTextoGrande = (175).dp
val numNumeroGrande = ((317.9/des.density)).sp

val numNumero = ((317.9/des.density)/relacionDimen).sp

val valorFiguraCiqus0 = NavegationFiguresData(
    offset_x = 35.dp,
    offset_y = 25.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Ilg.route,
    numString = "01",
    relacionNum = numNumero,
    textoInfo =  R.string.CS_CIQUS_miniscreen_4_paragraph_3,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2,
    relacionText = numLetra2
)
val valorFiguraCiqus1 = NavegationFiguresData(
    offset_x = 165.dp,
    offset_y = 65.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 240.dp,
    ruta = Destination.Ilg.route,
    numString = "02",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CIQUS_miniscreen_4_paragraph_2,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2,
    relacionText = numLetra2
)
val valorFiguraCiqus2 = NavegationFiguresData(
    offset_x = 35.dp,
    offset_y = 175.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Ilg.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CIQUS_miniscreen_4_paragraph_4,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2,
    relacionText = numLetra2
)
