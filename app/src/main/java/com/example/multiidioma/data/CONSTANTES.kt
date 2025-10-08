package com.example.multiidioma.data

import androidx.compose.ui.graphics.Color

val CorBottomAndTop = Color(0xFF32627E)

val darkBlue = Color(0xFF32627E)
val accentColor = Color(0xFF00BCD4) // Un cian claro
val whiteColor = Color.White
val corLetras = Color(0xFF66aad1)

val nomeInstitutos = listOf("IHUS", "IDEGA", "ICE", "INCIFOR", "IMATUS", "ILG")
val nomeCentros = listOf("CIQUS", "CIMUS", "CITIUS", "CRETUS", "IGFAE", "IDIS")

val urlIncifor = "https://www.usc.gal/gl/investigar-na-usc/investigar/institutos-centros-investigacion/institutos/INCIFOR"
val urlCitius = "https://citius.gal/es/ "
val urlIpsius = ""
val urlImatus = "https://investigacion.usc.gal/investigadores/60527/detalle"
val urlIce = ""
val urlCimus = ""
data class BOX(
    val Box1: Float,
    val Box2: Float,
    val Box3: Float
)

val valoresTemplateScreen = BOX(Box1 = 0.1f, Box2 = 0.33f, Box3 = 0.33f)


