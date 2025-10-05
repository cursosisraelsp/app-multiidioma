package com.example.multiidioma.data.types

import androidx.annotation.DrawableRes

data class CarouselItem(
    val id: String,
    @DrawableRes val imageResId: Int,
    val contentDescription: String,
    val ruta : String,
    val contentType: ContentType?,
)
