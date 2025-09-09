package com.example.multiidioma.ui.screens.multimedia


import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.repository.MultimediaRepository
import com.example.multiidioma.data.types.CarruselMultimediaData
import com.example.multiidioma.ui.components.CarruselMultimedia

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MultimediaScreen(){
    val context = LocalContext.current
    val _multimediaRepository = MultimediaRepository()
    val lista = rememberSaveable{_multimediaRepository.ListPodcasts()}

    val carouselState = rememberCarouselState { lista.size }
    val datosDpPodcast = CarruselMultimediaData(
        preferredItemWidth = 75.dp,
        itemSpacing = 30.dp,
        minSmallItemWidth = 225.dp,
        maxSmallItemWidth = 350.dp
    )
    CarruselMultimedia(carouselState,lista,context, carouselData = datosDpPodcast)
}