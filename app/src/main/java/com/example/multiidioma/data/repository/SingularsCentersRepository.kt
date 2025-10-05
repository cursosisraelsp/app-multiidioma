package com.example.multiidioma.data.repository

import com.example.multiidioma.R
import com.example.multiidioma.data.nomeCentros
import com.example.multiidioma.data.types.CarouselItem
import com.example.multiidioma.data.types.ContentType

val listSingularsCenters = listOf(
    CarouselItem("0", R.drawable.patron6, nomeCentros[0],"ciqus", contentType = ContentType.CIQUS),
    CarouselItem("1", R.drawable.patron6, nomeCentros[1],"cimus",contentType = ContentType.CIMUS),
    CarouselItem("2", R.drawable.patron6, nomeCentros[2],"citius",contentType = ContentType.CITIUS),
    CarouselItem("3", R.drawable.patron6, nomeCentros[3],"cretus",contentType = ContentType.CRETUS),
    CarouselItem("4", R.drawable.patron6, nomeCentros[4],"igfae",contentType = ContentType.IGFAE)
)