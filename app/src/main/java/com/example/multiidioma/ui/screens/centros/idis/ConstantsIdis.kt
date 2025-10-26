package com.example.multiidioma.ui.screens.centros.idis

import android.content.res.Resources
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.multiidioma.R
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.numLetra2
import com.example.multiidioma.data.numNumero
import com.example.multiidioma.data.relacionTexto
import com.example.multiidioma.data.relacionTextoGrande
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.data.types.PersonResearcher


val valorFiguraIdis0 = NavegationFiguresData(
    offset_x = 15.dp,
    offset_y = 25.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Ilg.route,
    numString = "01",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CIQUS_miniscreen_2_texto_buscado_2,
    anchoTexto = relacionTexto,
    relacionText = numLetra2,
    lineHeight = 1.sp
)
val valorFiguraIdis1 = NavegationFiguresData(
    offset_x = 175.dp,
    offset_y = 35.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 240.dp,
    ruta = Destination.Ilg.route,
    numString = "02",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CIQUS_miniscreen_2_texto_buscado_2,
    anchoTexto = relacionTextoGrande,
    relacionText = numLetra2,
    lineHeight = 1.sp
)
val valorFiguraIdis2 = NavegationFiguresData(
    offset_x = 15.dp,
    offset_y = 175.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Ilg.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CIQUS_miniscreen_2_texto_buscado_2,
    anchoTexto = relacionTexto,
    relacionText = numLetra2,
    lineHeight = 1.sp
)
val valorFiguraIdis3 = NavegationFiguresData(
    offset_x = 135.dp,
    offset_y = 240.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 200.dp,
    ruta = Destination.Ilg.route,
    numString = "04",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CIQUS_miniscreen_2_texto_buscado_2,
    anchoTexto = relacionTexto,
    relacionText = numLetra2,
    lineHeight = 1.sp
)
val valorFiguraIdis4 = NavegationFiguresData(
    offset_x = 10.dp,
    offset_y = 325.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 140.dp,
    ruta = Destination.Ilg.route,
    numString = "05",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CIQUS_miniscreen_2_texto_buscado_2,
    anchoTexto = relacionTexto,
    relacionText = numLetra2,
    lineHeight = 1.sp
)
val valorFiguraIdis5 = NavegationFiguresData(
    offset_x = 120.dp,
    offset_y = 415.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Ilg.route,
    numString = "06",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CIQUS_miniscreen_2_texto_buscado_2,
    anchoTexto = relacionTexto,
    relacionText = numLetra2,
    lineHeight = 1.sp
)
val valorFiguraIdis6 = NavegationFiguresData(
    offset_x = 270.dp,
    offset_y = 400.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Ilg.route,
    numString = "07",
    relacionNum = numNumero,
    textoInfo = R.string.CS_CIQUS_miniscreen_2_texto_buscado_2,
    anchoTexto = relacionTexto,
    relacionText = numLetra2,
    lineHeight = 1.sp
)
//Investigadores

val mlcpIdis =  PersonResearcher(
    foto = R.drawable.incifor_img_14,
    name = "Mª Luz Couce Pico",
    title = R.string.Directora,
    role = null,
    info =  listOf(R.string.II_INCIFOR_miniscreen_28_paragraph_0),
    contentType = ContentType.PLANTILLA
)
val ilgIdis =  PersonResearcher(
    foto = R.drawable.incifor_img_15,
    name = "Isabel Lista García",
    title = null,
    role = null,
    info =  listOf(R.string.II_INCIFOR_miniscreen_29_paragraph_0),
    contentType = ContentType.PLANTILLA
)

val rllIdis = PersonResearcher(
    foto = R.drawable.incifor_img_16,
    title = null,
    role = null,
    name = "Rafael López López",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)

val acaIdis =  PersonResearcher(
    foto = R.drawable.incifor_img_18_,
    name = "Ángel Carracedo Álvarez",
    title = null,
    role = null,    info =  listOf(),
    contentType = ContentType.PLANTILLA
)

val mlgIdis =  PersonResearcher(
    foto = R.drawable.incifor_img_19,
    name = "Mabel Loza García",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val mamoIdis =  PersonResearcher(
    foto = R.drawable.noimagen, //incifor_img_20
    name = "Miguel Ángel Martínez Olmos",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val lmscIdis =  PersonResearcher(
    foto = R.drawable.noimagen,
    name = "Luisa Mª Seoane Camino",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val jllgIdis =  PersonResearcher(
    foto = R.drawable.incifor_img_22,
    name = "José Luis Labandeira García",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)

val fcpIdis =  PersonResearcher(
    foto = R.drawable.incifor_img_23,
    name = "Francisco Campos Pérez",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val fgsIdis =  PersonResearcher(
    foto = R.drawable.incifor_img_24,
    name = "Francisco Gude Sampedro",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val izfIdis =  PersonResearcher(
    foto = R.drawable.incifor_img_24,
    name = "Irene Zarra Ferro",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val jrgjIdis =  PersonResearcher(
    foto = R.drawable.incifor_img_24,
    name = "José Ramón González Juanatey",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val mrmIdis =  PersonResearcher(
    foto = R.drawable.incifor_img_24,
    name = "Moisés Rodríguez Mañero",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val fmtIdis =  PersonResearcher(
    foto = R.drawable.incifor_img_24,
    name = "Federico Martinón Torres",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val rgbIdis =  PersonResearcher(
    foto = R.drawable.incifor_img_24,
    name = "Rodolfo Gómez Bahamonde",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)

val datosInvestigadoresIdis = listOf(mlcpIdis, ilgIdis, rllIdis, acaIdis, mlgIdis, mamoIdis,
    lmscIdis, jllgIdis, fcpIdis, fgsIdis, izfIdis, jrgjIdis, mrmIdis, fmtIdis, rgbIdis)