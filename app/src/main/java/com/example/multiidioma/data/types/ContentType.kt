package com.example.multiidioma.data.types

sealed class ContentType (){
    object CentroSingularContent : ContentType()
    object MapContent : ContentType()
    object MultimediaContent : ContentType()
    object MinervaContent : ContentType()
    object InstitutoInvestigation : ContentType()
    ///////INSTITUTOS//////
    object IHUS : ContentType()
    object IDEGA : ContentType()
    object ICE : ContentType()
    object INCIFOR : ContentType()
    object IMATUS : ContentType()
    object ILG : ContentType()
    object IPSIUS : ContentType()
    object IARCUS : ContentType()
    /////////CENTROS///////
    object CIQUS : ContentType()
    object CIMUS : ContentType()
    object CITIUS : ContentType()
    object CRETUS : ContentType()
    object IGFAE : ContentType()
}