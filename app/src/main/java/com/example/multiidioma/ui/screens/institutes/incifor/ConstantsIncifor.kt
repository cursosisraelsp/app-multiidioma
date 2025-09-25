package com.example.multiidioma.ui.screens.institutes.incifor

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
val relacionTexto = (75).dp
val relacionTextoGrande = (175).dp
val numNumeroGrande = ((317.9/des.density)).sp

val numNumero = ((317.9/des.density)/relacionDimen).sp

val valorFigura0 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 20.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Cretus.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = "este texto en Incifor",
    anchoTexto = relacionTexto,
    relacionText = numLetra2
)
val valorFigura1 = NavegationFiguresData(
    offset_x = 260.dp,
    offset_y = 70.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Cretus.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = "este texto en Incifor",
    anchoTexto = relacionTexto,
    relacionText = numLetra2
)
val valorFigura2 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 460.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Cretus.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = "este texto en Incifor",
    anchoTexto = relacionTexto,
    relacionText = numLetra2
)
val valorFigura3 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Imatus.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = "este texto en Incifor",
    anchoTexto = relacionTexto,
    relacionText = numLetra2
)
val valorFigura4 = NavegationFiguresData(
    offset_x = 80.dp,
    offset_y = 175.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 300.dp,
    ruta = Destination.Cretus.route,
    numString = "03",
    relacionNum = numNumeroGrande,
    textoInfo = "este texto en Incifor",
    anchoTexto = relacionTextoGrande,
    relacionText = numLetra
)
