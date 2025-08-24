package com.example.multiidioma.data

import androidx.annotation.DrawableRes

data class MiniScreenData(

    @DrawableRes val imageRes: Int? = null,
    // Nuevas propiedades para la pantalla de detalle (opcionales)
    val bodyParagraphs: List<Int>?= emptyList(),
    val additionalImages: List<Int>? = emptyList(),
    val lottieAnimRes: Int? = null,
    val mapLocation: List<String>? = emptyList()
)

sealed class MultiMiniScreenState{
    //abstract val message: String

    object Loading : MultiMiniScreenState()
    data class Success(
        val miniScreens: List<MiniScreenData>
    ):MultiMiniScreenState()
    data class Error(val message: String) : MultiMiniScreenState()
}