package com.example.multiidioma.data.types

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit

data class NavegationFiguresData(
    val offset_x : Dp,
    val offset_y: Dp,
    val imaxen: Int,
    val tamanhoFigura: Dp,
    val ruta: String,
    val numString: String?,
    val relacionNum: TextUnit?,
    val textoInfo: Int,
    val anchoTexto: Dp,
    val relacionText: TextUnit,
    val lineHeight: TextUnit
)
data class NavegationFiguresHomeData(
    val offset_x : Dp,
    val offset_y: Dp,
    val imaxen: Int,
    val tamanhoFigura: Dp,
    val ruta: String,
    val numString: String?,
    val relacionNum: TextUnit?,
    val textoInfo: String,
    val anchoTexto: Dp,
    val relacionText: TextUnit,
    val contentType: ContentType
)