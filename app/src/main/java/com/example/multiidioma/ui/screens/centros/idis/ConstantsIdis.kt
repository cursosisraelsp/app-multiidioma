package com.example.multiidioma.ui.screens.centros.idis

import android.content.res.Resources
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.multiidioma.R
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.data.types.PersonResearcher

val des = Resources.getSystem().displayMetrics
val numLetra = (80/des.density).sp
val numLetra2 = ((40/des.density)).sp
val relacionDimen = 300/150
val relacionTexto = (90).dp
val relacionTextoGrande = (175).dp
val numNumeroGrande = ((317.9/des.density)).sp

val numNumero = ((317.9/des.density)/relacionDimen).sp

val valorFiguraIdis0 = NavegationFiguresData(
    offset_x = 15.dp,
    offset_y = 25.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Ilg.route,
    numString = "01",
    relacionNum = numNumero,
    textoInfo = "este texto en Ilg",
    anchoTexto = relacionTexto,
    relacionText = numLetra2
)
val valorFiguraIdis1 = NavegationFiguresData(
    offset_x = 175.dp,
    offset_y = 35.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 240.dp,
    ruta = Destination.Ilg.route,
    numString = "02",
    relacionNum = numNumero,
    textoInfo = "este texto en Ilg",
    anchoTexto = relacionTextoGrande,
    relacionText = numLetra2
)
val valorFiguraIdis2 = NavegationFiguresData(
    offset_x = 15.dp,
    offset_y = 175.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Ilg.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = "este texto en Ilg",
    anchoTexto = relacionTexto,
    relacionText = numLetra2
)
val valorFiguraIdis3 = NavegationFiguresData(
    offset_x = 135.dp,
    offset_y = 240.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 200.dp,
    ruta = Destination.Ilg.route,
    numString = "04",
    relacionNum = numNumero,
    textoInfo = "este texto en Ilg",
    anchoTexto = relacionTexto,
    relacionText = numLetra2
)
val valorFiguraIdis4 = NavegationFiguresData(
    offset_x = 10.dp,
    offset_y = 325.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 140.dp,
    ruta = Destination.Ilg.route,
    numString = "05",
    relacionNum = numNumero,
    textoInfo = "este texto en Ilg",
    anchoTexto = relacionTexto,
    relacionText = numLetra2
)
val valorFiguraIdis5 = NavegationFiguresData(
    offset_x = 120.dp,
    offset_y = 415.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Ilg.route,
    numString = "06",
    relacionNum = numNumero,
    textoInfo = "este texto en Ilg",
    anchoTexto = relacionTexto,
    relacionText = numLetra2
)
val valorFiguraIdis6 = NavegationFiguresData(
    offset_x = 270.dp,
    offset_y = 400.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Ilg.route,
    numString = "07",
    relacionNum = numNumero,
    textoInfo = "este texto en Ilg",
    anchoTexto = relacionTexto,
    relacionText = numLetra2
)
