package com.example.multiidioma.data

import android.content.res.Resources
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val des = Resources.getSystem().displayMetrics
val numLetra = (80 / des.density).sp
val numLetra2 = ((40 / des.density)).sp
val relacionDimen = 300 / 150
val relacionTexto = (90).dp
val relacionTextoGrande = (175).dp
val numNumeroGrande = ((317.9 / des.density)).sp

//Especifico CITIUS
val numBigCitius = (200 / des.density).sp
val numSmallCitius = (150 / des.density).sp
val numNumero = ((317.9 / des.density) / relacionDimen).sp

//Especifico CIMUS
val numBigCimus = (200 / des.density).sp
val numSmallCimus = (150 / des.density).sp

//Especifico IMATUS
val numBigImatus = (200 / des.density).sp
val numSmallImatus = (150  / des.density).sp