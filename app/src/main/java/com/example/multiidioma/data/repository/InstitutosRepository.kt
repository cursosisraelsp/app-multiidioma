package com.example.multiidioma.data.repository

import com.example.multiidioma.R
import com.example.multiidioma.data.nomeInstitutos
import com.example.multiidioma.data.types.CarouselItem
import com.example.multiidioma.data.types.ContentType

val listaInstitutos = listOf(
    CarouselItem("0", R.drawable.patron6, nomeInstitutos[0],"ihus", contentType = ContentType.IHUS),
    CarouselItem("1", R.drawable.patron6, nomeInstitutos[1],"idega", contentType = ContentType.IDEGA),
    CarouselItem("2", R.drawable.patron6, nomeInstitutos[2],"ice", contentType = ContentType.ICE),
    CarouselItem("3", R.drawable.patron6, nomeInstitutos[3],"incifor", contentType = ContentType.INCIFOR),
    CarouselItem("4", R.drawable.patron6, nomeInstitutos[4],"imatus", contentType = ContentType.IMATUS),
    CarouselItem("5", R.drawable.patron6, nomeInstitutos[5],"ilg", contentType = ContentType.ILG),
)

