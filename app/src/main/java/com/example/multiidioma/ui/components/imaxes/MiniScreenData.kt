package com.example.multiidioma.ui.components.imaxes

import androidx.annotation.DrawableRes

data class MiniScreenData(
    val id: Int,
    val bodyParagraphs: List<Int> = emptyList(),
    val lottieAnimRes: Int? = null,
    val mapLocation: List<String>? = emptyList(),
    @DrawableRes val imageRes: Int? = null,

)
