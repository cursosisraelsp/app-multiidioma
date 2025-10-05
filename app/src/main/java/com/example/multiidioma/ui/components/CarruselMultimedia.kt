package com.example.multiidioma.ui.components

import android.content.Context
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.carousel.CarouselState
import androidx.compose.runtime.Composable
import com.example.multiidioma.data.types.CarruselMultimediaData
import com.example.multiidioma.data.types.MultimediaData

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun CarruselMultimedia(carouselState: CarouselState, podcasts: List<MultimediaData>, context: Context, carouselData: CarruselMultimediaData){
    /*
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
        val item = podcasts[i]

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
    */
}