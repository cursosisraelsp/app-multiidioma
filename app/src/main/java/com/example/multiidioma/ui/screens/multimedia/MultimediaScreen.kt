package com.example.multiidioma.ui.screens.multimedia

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import com.example.multiidioma.R
import android.net.Uri
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.material3.carousel.HorizontalUncontainedCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.repository.MultimediaRepository
import com.example.multiidioma.ui.components.OpenSpotify

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MultimediaScreen(){
    val context = LocalContext.current
    val _multimediaRepository = MultimediaRepository()
    val lista = rememberSaveable{_multimediaRepository.ListPodcasts()}
    val cantidade = _multimediaRepository.ListPodcasts().count()
    val carouselState = rememberCarouselState { lista.size }
    HorizontalMultiBrowseCarousel(
        state = carouselState,
        preferredItemWidth = 75.dp,              // ancho preferido de cada ítem
        modifier = Modifier.fillMaxWidth().fillMaxHeight(0.3f).border(width = 2.dp, color = Color.Green),       // que ocupe todo el ancho
        itemSpacing = 30.dp,                       // espacio entre ítems
        userScrollEnabled = true,                 // permitir scroll manual
        minSmallItemWidth = 225.dp,               // ancho mínimo cuando está en los bordes
        maxSmallItemWidth = 350.dp,               // ancho máximo del ítem principal
        contentPadding = PaddingValues(1.dp)
    ) { i ->
        val podcast = lista[i]
        Column (
            modifier = Modifier.fillMaxSize().border(width = 1.dp, color = Color.Black).padding(5.dp).clickable {
                OpenSpotify(context,podcast)
            },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            podcast.imaxe()
            Text(text = podcast.title)
            Text(text = podcast.protagonista, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
        }

    }


}