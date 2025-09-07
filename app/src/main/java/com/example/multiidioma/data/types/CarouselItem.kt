package com.example.multiidioma.data.types

import androidx.annotation.DrawableRes

data class CarouselItem(
    val id:Int,
    @DrawableRes val imageResId: Int,
    val contentDescription: String,
    val ruta : String
)
