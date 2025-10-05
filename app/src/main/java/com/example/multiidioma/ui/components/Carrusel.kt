package com.example.multiidioma.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.carousel.HorizontalUncontainedCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.types.CarouselItem
import com.example.multiidioma.utils.ModificadoresUtils.Companion.Carrusel1


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Carrusel(carouselItems : List<CarouselItem>, navController: NavController){

    HorizontalUncontainedCarousel(
        rememberCarouselState { carouselItems.count() },
        modifier = Carrusel1,
        itemWidth = 186.dp,
        itemSpacing = 10.dp,
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) { i ->
        val item = carouselItems[i]
        Box(contentAlignment = Alignment.Center){

            BoxImage(
                item = item,
                modificadorBox = Modifier,
                modificadorImg = Modifier
                    .height(125.dp)
                    .clickable {
                        navController.navigate(item.ruta)
                    },
                alineacionContido = Alignment.Center
            )
            Box{
                Text(" ${item.ruta}")
            }

        }



    }
}