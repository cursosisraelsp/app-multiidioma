package com.example.multiidioma.ui.screens.home

import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.numLetra2
import com.example.multiidioma.data.numNumero
import com.example.multiidioma.data.relacionTexto
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.data.types.NavegationFiguresHomeData

val figuraMultimediaHome = NavegationFiguresHomeData(
    offset_x = 100.dp,
    offset_y = 200.dp,
    imaxen = R.raw.circulo_azul,
    tamanhoFigura = 250.dp,
    ruta = Destination.Multimedia.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = "Multimedia",
    anchoTexto = relacionTexto,
    relacionText = numLetra2,
    contentType = ContentType.Multimedia
)
val figuraMapaHome = NavegationFiguresHomeData(
    offset_x = 50.dp,
    offset_y = 475.dp,
    imaxen = R.raw.circulo_azul,
    tamanhoFigura = 80.dp,
    ruta = Destination.Mapa.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = "Mapa",
    anchoTexto = relacionTexto,
    relacionText = numLetra2,
    contentType = ContentType.Mapa
)
val figuraInstitutosHome = NavegationFiguresHomeData(
    offset_x = 200.dp,
    offset_y = 50.dp,
    imaxen = R.raw.circulo_azul,
    tamanhoFigura = 100.dp,
    ruta = Destination.Institutos.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = "Institutos",
    anchoTexto = relacionTexto,
    relacionText = numLetra2,
    contentType = ContentType.Institutos
)
val figuraCentrosSingularesHome = NavegationFiguresHomeData(
    offset_x = 20.dp,
    offset_y = 70.dp,
    imaxen = R.raw.circulo_azul,
    tamanhoFigura = 150.dp,
    ruta = Destination.CentrosSingulares.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = "Centros singulares",
    anchoTexto = relacionTexto,
    relacionText = numLetra2,
    contentType = ContentType.CentrosSingulares
)

val figuraMinervaHome = NavegationFiguresHomeData(
    offset_x = 230.dp,
    offset_y = 480.dp,
    imaxen = R.raw.circulo_azul,
    tamanhoFigura = 75.dp,
    ruta = Destination.Minerva.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = "Minerva",
    anchoTexto = relacionTexto,
    relacionText = numLetra2,
    contentType = ContentType.Minerva
)
val figurasHome = listOf(figuraMultimediaHome,figuraMapaHome,figuraInstitutosHome,figuraCentrosSingularesHome,figuraMinervaHome)