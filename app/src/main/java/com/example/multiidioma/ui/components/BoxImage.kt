package com.example.multiidioma.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.multiidioma.data.types.CarouselItem

@Composable
fun BoxImage(item: CarouselItem, modificadorBox: Modifier, modificadorImg: Modifier, alineacionContido: Alignment){

    Box(
        modifier= modificadorBox,
        contentAlignment = alineacionContido
    ){
        Image(
            modifier = modificadorImg,
            painter = painterResource(id = item.imageResId),
            contentDescription = item.contentDescription,
            contentScale = ContentScale.Crop
        )
    }
}