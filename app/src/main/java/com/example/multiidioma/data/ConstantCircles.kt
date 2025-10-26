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

// Tamaño del círculo
val CirculoGigante = 260.dp
val CirculoGrande = 230.dp
val CirculoMediano = 200.dp
val CirculoPequeno = 170.dp
val CirculoDiminuto = 140.dp
val CirculoMicro = 110.dp

//  Tamaño del número dentro del círculo (relación proporcional, relacion num)
val NumeroGigante = (300 / des.density).sp
val NumeroGrande = (240 / des.density).sp
val NumeroMediano = (180 / des.density).sp
val NumeroPequeno = (140 / des.density).sp
val NumeroDiminuto = (120 / des.density).sp
val NumeroMicro = (100 / des.density).sp

// Tamaño de letra general
val LetraGigante = (96 / des.density).sp      // ~38sp
val LetraGrande = (78 / des.density).sp       // ~31sp
val LetraMediana = (60 / des.density).sp      // ~24sp
val LetraPequena = (50 / des.density).sp      // ~18sp
val LetraDiminuta = (40 / des.density).sp     // ~12sp
val LetraMicro = (34 / des.density).sp        // ~8–9sp

// Line height (más ajustado cuanto más pequeño)
val LineHeightGigante = LetraGigante * 1.3f
val LineHeightGrande = LetraGrande * 1.2f
val LineHeightMediana = LetraMediana * 1.15f
val LineHeightPequena = LetraPequena * 1.05f
val LineHeightDiminuta = LetraDiminuta * 0.95f
val LineHeightMicro = LetraMicro * 0.9f

// Porcentajes para el ancho del texto según el tamaño del círculo
val porcentajeAnchoTextoGigante = 0.7f
val porcentajeAnchoTextoGrande = 0.7f
val porcentajeAnchoTextoMediano = 0.7f
val porcentajeAnchoTextoPequeno = 0.65f
val porcentajeAnchoTextoDiminuto = 0.6f
val porcentajeAnchoTextoMicro = 0.6f

// Ancho del texto calculado dinámicamente
val anchoTextoGigante = CirculoGigante * porcentajeAnchoTextoGigante
val anchoTextoGrande = CirculoGrande * porcentajeAnchoTextoGrande
val anchoTextoMediano = CirculoMediano * porcentajeAnchoTextoMediano
val anchoTextoPequeno = CirculoPequeno * porcentajeAnchoTextoPequeno
val anchoTextoDiminuto = CirculoDiminuto * porcentajeAnchoTextoDiminuto
val anchoTextoMicro = CirculoMicro * porcentajeAnchoTextoMicro

