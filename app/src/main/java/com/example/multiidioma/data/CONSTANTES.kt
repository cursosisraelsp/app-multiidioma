package com.example.multiidioma.data

import androidx.compose.ui.graphics.Color

val CorBottomAndTop = Color(0xFF32627E)

val darkBlue = Color(0xFF32627E)
val accentColor = Color(0xFF00BCD4) // Un cian claro
val corLetras = Color(0xFF66aad1)
val whiteColor = Color.White

val nomeInstitutos = listOf("IHUS", "IDEGA", "ICE", "INCIFOR", "IMATUS", "ILG")
val nomeCentros = listOf("CIQUS", "CIMUS", "CITIUS", "CRETUS", "IGFAE", "IDIS")

val urlIhus = "https://www.usc.gal/es/node/49934"
val urlIlg = "https://www.usc.gal/es/node/49934"
val urlIdis = "https://www.idisantiago.es /"
val urlCiqus = "https://www.usc.es/ciqus/es"
data class BOX(
    val Box1: Float,
    val Box2: Float,
    val Box3: Float
)

val valoresTemplateScreen = BOX(Box1 = 0.1f, Box2 = 0.33f, Box3 = 0.33f)

