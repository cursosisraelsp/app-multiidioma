package com.example.multiidioma.ui.screens.centros.ciqus

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

val valorFiguraCiqus0 = NavegationFiguresData(
    offset_x = 35.dp,
    offset_y = 25.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.Ilg.route,
    numString = "01",
    relacionNum = numNumero,
    textoInfo =  R.string.CS_CIQUS_miniscreen_2_texto_buscado_2,
    anchoTexto = relacionTexto,
    relacionText = numLetra2,
    lineHeight = 1.sp
)
val valorFiguraCiqus1 = NavegationFiguresData(
    offset_x = 165.dp,
    offset_y = 65.dp,
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
val valorFiguraCiqus2 = NavegationFiguresData(
    offset_x = 35.dp,
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

//Investigadores

val dpgCiqus =  PersonResearcher(
    foto = R.drawable.incifor_img_14,
    name = "Diego Peña Gil",
    title = R.string.Directora,
    role = null,
    info =  listOf(R.string.II_INCIFOR_miniscreen_28_paragraph_0),
    contentType = ContentType.PLANTILLA
)
val mfmCiqus =  PersonResearcher(
    foto = R.drawable.incifor_img_15,
    name = "Martín Fañanás Mastral",
    title = null,
    role = null,
    info =  listOf(R.string.II_INCIFOR_miniscreen_29_paragraph_0),
    contentType = ContentType.PLANTILLA
)

val mglCiqus = PersonResearcher(
    foto = R.drawable.incifor_img_16,
    title = null,
    role = null,
    name = "María Giménez López",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)

val iilCiqus =  PersonResearcher(
    foto = R.drawable.incifor_img_18_,
    name = "Ignacio Insua López",
    title = null,
    role = null,    info =  listOf(),
    contentType = ContentType.PLANTILLA
)

val jlmCiqus =  PersonResearcher(
    foto = R.drawable.incifor_img_19,
    name = "José Luis Mascareñas",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val jmCiqus =  PersonResearcher(
    foto = R.drawable.noimagen, //incifor_img_20
    name = "Javier Montenegro",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val bopCiqus =  PersonResearcher(
    foto = R.drawable.noimagen,
    name = "Beatriz Orosa Puente",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val bpCiqus =  PersonResearcher(
    foto = R.drawable.incifor_img_22,
    name = "Beatriz Pelaz",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)

val frfCiqus =  PersonResearcher(
    foto = R.drawable.incifor_img_23,
    name = "Francisco Rivadulla Fernández",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val mssCiqus =  PersonResearcher(
    foto = R.drawable.incifor_img_24,
    name = "Manuel Souto Salom",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)


val datosInvestigadoresCiqus = listOf(dpgCiqus, mfmCiqus, mglCiqus, iilCiqus, jlmCiqus, jmCiqus,
    bopCiqus, bpCiqus, frfCiqus, mssCiqus)