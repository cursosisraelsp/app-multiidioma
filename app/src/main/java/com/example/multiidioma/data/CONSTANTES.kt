package com.example.multiidioma.data

import androidx.compose.ui.graphics.Color

val CorBottomAndTop = Color(0xFF32627E)

val darkBlue = Color(0xFF32627E)
val accentColor = Color(0xFF00BCD4) // Un cian claro
val whiteColor = Color.White

val nomeInstitutos = listOf("IHUS","IDEGA","ICE","INCIFOR","IMATUS","ILG","IPSIUS")
val nomeCentros = listOf("CIQUS","CIMUS","CITIUS","CRETUS","IGFAE","IDIS")
data class BOX(
    val Box1: Float,
    val Box2: Float,
    val Box3: Float
)

val valoresPlantillaScreen = BOX(Box1 = 0.1f, Box2 = 0.33f, Box3 = 0.33f)

