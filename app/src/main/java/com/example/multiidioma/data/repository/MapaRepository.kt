package com.example.multiidioma.data.repository

import com.google.android.gms.maps.model.LatLng

data class Centro(
    val position: LatLng,
    val title: String,
    val description: String
)
// Marcadores
val iARCUS = LatLng(42.87434584313793, -8.561456786566236)
val iMATUS = LatLng(42.87287787590329, -8.558428816370364)
val iGFAE = LatLng(42.877518466443064, -8.558955945205511)
val iCE = LatLng(42.876456234085246, -8.552803545205595)
val iLG = LatLng(42.87886807391224, -8.542679731711427)
val cIQUS = LatLng(42.87312610094581, -8.557557674040995)
val cIMUS = LatLng(42.871199716306094, -8.561833287535125)
val iDIS = LatLng(42.870423239108426, -8.565678560547143)
val cRETUS = LatLng(42.87450611079023, -8.560144675888262)
val iDEGA = LatLng(42.87628834421211, -8.552506345205597)
val iPSIUS = LatLng(42.875165708857516, -8.561098202876266)
val iNCIFOR = LatLng(42.882508525754034, -8.546514204723271)
val cITIUS = LatLng(42.87354426452495, -8.557769833558977)
val iHUS = LatLng(42.886014808470485, -8.546510694106493)
val santiago = LatLng(42.87312610094581, -8.557557674040995)

// Descripcions centros e institutos
val descriptionCiqus = "Centro Singular de Investigación en Química Biolóxica e Materiais Moleculares "
val descriptionCimus = "Centro Singular de Investigación en Medicina Molecular y Enfermedades Crónicas"
val descriptionCitius = "Centro Singular de Investigación en Tecnoloxías Intelixentes"
val descriptionCretus = "Centro de Investigación Interdisciplinar en Tecnoloxías Ambientais"
val descriptionIgfae = "Instituto Galego de Física de Altas Enerxías"
val descriptionIdis = "Fundación Instituto de Investigación Sanitaria de Santiago"
val descriptionIlg = "Instituto de la Lengua Gallega "
val descriptionIarcus = "Instituto de Investigación del Medio Acuático para Una Salud Global"
val descriptionIce = "Instituto de Ciencias de la Educación"
val descriptionIncifor = "Instituto de Ciencias Forenses Luís Concheiro"
val descriptionIdega = "Instituto de Estudios y Desarrollo de Galicia"
val descriptionIhus = "Instituto de Investigación de Humanidades"
val descriptionImatus = "Instituto de Materiales"
val descriptionIpsius = "Instituto de Psicología"

val centrosSingulares = listOf(
    Centro(cIQUS,"cIQUS",descriptionCiqus), // CIQUS
    Centro(cIMUS,"cIMUS",descriptionCimus), // CIMUS
    Centro(cITIUS,"cITIUS",descriptionCitius), // CITIUS
    Centro(cRETUS,"cRETUS",descriptionCretus), // CRETUS
    Centro(iGFAE,"iGFAE",descriptionIgfae), // IGFAE
    Centro(iDIS,"iDIS", descriptionIdis) // IDIS
)

val institutosInvestigacion = listOf(
    Centro(iLG,"ilga", descriptionIlg), // ILG
    Centro(iARCUS,"iarcus", descriptionIarcus), // Iarcus
    Centro(iCE,"ice", descriptionIce), // ICE
    Centro(iNCIFOR,"iNCIFOR", descriptionIncifor), // INCIFOR
    Centro(iDEGA,"iDEGA", descriptionIdega), // IDEGA
    Centro(iHUS,"iHUS", descriptionIhus), // IHUS
    Centro(iMATUS,"iMATUS", descriptionImatus), // iMATUS
    Centro(iPSIUS,"iPSIUS", descriptionIpsius)  // IPSIUS
)
val institutosEcentros = listOf(
    Centro(cIQUS,"cIQUS",descriptionCiqus), // CIQUS
    Centro(cIMUS,"cIMUS",descriptionCimus), // CIMUS
    Centro(cITIUS,"cITIUS",descriptionCitius), // CITIUS
    Centro(cRETUS,"cRETUS",descriptionCretus), // CRETUS
    Centro(iGFAE,"iGFAE",descriptionIgfae), // IGFAE
    Centro(iDIS,"iDIS", descriptionIdis), // IDIS
    Centro(iLG,"ilga", descriptionIlg), // ILG
    Centro(iARCUS,"iarcus", descriptionIarcus), // Iarcus
    Centro(iCE,"ice", descriptionIce), // ICE
    Centro(iNCIFOR,"iNCIFOR", descriptionIncifor), // INCIFOR
    Centro(iDEGA,"iDEGA", descriptionIdega), // IDEGA
    Centro(iHUS,"iHUS", descriptionIhus), // IHUS
    Centro(iMATUS,"iMATUS", descriptionImatus), // iMATUS
    Centro(iPSIUS,"iPSIUS", descriptionIpsius)  // IPSIUS
)