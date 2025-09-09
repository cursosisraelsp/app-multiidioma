package com.example.multiidioma.ui.components

import android.content.Context
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.carousel.CarouselState
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.repository.MultimediaRepository
import com.example.multiidioma.data.types.CarruselMultimediaData

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun CarruselMultimedia(carouselState: CarouselState,lista: List<MultimediaRepository. Podcast>,context: Context, carouselData: CarruselMultimediaData){
    HorizontalMultiBrowseCarousel(
        state = carouselState,
        preferredItemWidth = carouselData.preferredItemWidth,              // ancho preferido de cada ítem
        modifier = Modifier.fillMaxWidth().fillMaxHeight(0.3f).border(width = 2.dp, color = Color.Green),       // que ocupe todo el ancho
        itemSpacing = carouselData.itemSpacing,                       // espacio entre ítems
        userScrollEnabled = true,                 // permitir scroll manual
        minSmallItemWidth = carouselData.minSmallItemWidth,               // ancho mínimo cuando está en los bordes
        maxSmallItemWidth = carouselData.maxSmallItemWidth,               // ancho máximo del ítem principal
        contentPadding = PaddingValues(1.dp)
    ) { i ->
        val item = lista[i]
        Column (
            modifier = Modifier.fillMaxSize().border(width = 1.dp, color = Color.Black).padding(5.dp).clickable {
                OpenSpotify(context,item)
            },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            item.imaxe()
            Text(text = item.title)
            Text(text = item.protagonista, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
        }

    }
}