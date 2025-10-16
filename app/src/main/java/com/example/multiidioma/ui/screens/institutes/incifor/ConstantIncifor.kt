package com.example.multiidioma.ui.screens.institutes.incifor


import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.numLetra
import com.example.multiidioma.data.numLetra2
import com.example.multiidioma.data.numNumero
import com.example.multiidioma.data.numNumeroGrande
import com.example.multiidioma.data.relacionTexto
import com.example.multiidioma.data.relacionTextoGrande
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.data.types.PersonResearcher

val valorFiguraIncifor0 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 20.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.InciforMiniscreen14.route,
    numString = "01",
    relacionNum = numNumero,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_1,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIncifor1 = NavegationFiguresData(
    offset_x = 260.dp,
    offset_y = 70.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.InciforMiniscreen15.route,
    numString = "02",
    relacionNum = numNumero,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_2,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIncifor2 = NavegationFiguresData(
    offset_x = 50.dp,
    offset_y = 460.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.InciforMiniscreen16.route,
    numString = "03",
    relacionNum = numNumero,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_3,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIncifor3 = NavegationFiguresData(
    offset_x = 240.dp,
    offset_y = 470.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 150.dp,
    ruta = Destination.InciforMiniscreen17.route,
    numString = "04",
    relacionNum = numNumero,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_4,
    anchoTexto = relacionTexto,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra2
)
val valorFiguraIncifor4 = NavegationFiguresData(
    offset_x = 80.dp,
    offset_y = 175.dp,
    imaxen = R.raw.circulo_blanco,
    tamanhoFigura = 300.dp,
    ruta = Destination.InciforMiniscreen18.route,
    numString = "05",
    relacionNum = numNumeroGrande,
    textoInfo = R.string.II_INCIFOR_miniscreen_13_paragraph_5,
    anchoTexto = relacionTextoGrande,
    lineHeight = numLetra2 * 0.95f,
    relacionText = numLetra
)




//Investigadores

val ambbIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_14,
    name = "Ana María Bermejo Barrera",
    title = R.string.Directora,
    role = null,
    info =  listOf(R.string.II_INCIFOR_miniscreen_28_paragraph_0),
    contentType = ContentType.PLANTILLA
)
val issIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_15,
    name = "Inés Sánchez Sellero",
    title = null,
    role = null,
    info =  listOf(R.string.II_INCIFOR_miniscreen_29_paragraph_0),
    contentType = ContentType.PLANTILLA
)

val mvlhIncifor = PersonResearcher(
    foto = R.drawable.incifor_img_16,
    title = null,
    role = null,
    name = "María Victoria Lareu Huidobro",
    info = listOf(),
    contentType = ContentType.PLANTILLA
)

val jimbIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_18_,
    name = "José Ignacio Muñoz Barús",
    title = null,
    role = null,    info =  listOf(),
    contentType = ContentType.PLANTILLA
)

val aclIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_19,
    name = "Angelines Cruz Landeira",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val favpsIncifor =  PersonResearcher(
    foto = R.drawable.noimagen, //incifor_img_20
    name = "Fernando Antonio Vázquez-Portomeñe Seijas",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val sbbcIncifor =  PersonResearcher(
    foto = R.drawable.noimagen,
    name = "Santiago Bernardo Brage Cendán",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val acrIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_22,
    name = "Ana de Castro Ríos",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)

val ggcIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_23,
    name = "Gumersindo Guinarte Cabada",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val elbincIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_24,
    name = "Elena Lendoiro Belío",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val msrcIncifor =  PersonResearcher(
    foto = R.drawable.noimagen,
    name = "María Sol Rodríguez Calvo",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val aseIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_26,
    name = "Antonio Salas Ellacuriaga",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val mjtdIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_28,
    name = "María Jesús Tabernero Duque",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val mivaIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_29,
    name = "María Inmaculada Valeije Álvarez",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)

val iaflIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_30,
    name = "Iván Álvarez Freire",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)

val pcflIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_31,
    name = "Pamela Cabarcos Fernández",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val mcpvIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_32,
    name = "María del Carmen de la Puente Vila",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val amfaIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_33,
    name = "Ana María Freire Aradas",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val alrIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_34,
    name = "Ángela López Rabuñal",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)
val ammIncifor =  PersonResearcher(
    foto = R.drawable.incifor_img_35,
    name = "Ana Mosquera Miguel",
    title = null,
    role = null,
    info =  listOf(),
    contentType = ContentType.PLANTILLA
)


val datosInvestigadoresIncifor = listOf(ambbIncifor, issIncifor,mvlhIncifor,jimbIncifor,aclIncifor,favpsIncifor,sbbcIncifor,acrIncifor,ggcIncifor,elbincIncifor,msrcIncifor,msrcIncifor,aseIncifor,mjtdIncifor,mivaIncifor,iaflIncifor,pcflIncifor,mcpvIncifor,amfaIncifor,alrIncifor,ammIncifor)