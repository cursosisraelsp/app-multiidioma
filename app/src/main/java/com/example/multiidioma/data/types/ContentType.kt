package com.example.multiidioma.data.types

sealed class ContentType (){
    object CentroSingularContent : ContentType()
    object MapContent : ContentType()
    object MultimediaContent : ContentType()
    object MinervaContent : ContentType()
    object InstitutoInvestigation : ContentType()
}