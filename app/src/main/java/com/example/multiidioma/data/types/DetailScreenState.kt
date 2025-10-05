package com.example.multiidioma.data.types

data class DetailScreenState(
    val detailImaxenClick: ImaxenClickData? = null,
    val detailListSingularsCenters : CarouselItem? = null,
    val detailListInstitus : CarouselItem? = null,
    val detailListMiniScreensIncifor : PersonalResearcher? = null,
    //val detailListMiniScreensIncifor : PersonalResearcher2? = null
    val detailListScreensHome : NavegationFiguresHomeData? = null
)
