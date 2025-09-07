package com.example.multiidioma.ui.screens.centros

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import com.example.multiidioma.data.repository.listSingularsCenters
import com.example.multiidioma.ui.components.Carrusel

@Composable
fun CentresSingularsScreen(navController: NavController){

    val carouselItems = remember {
        listSingularsCenters
    }
    Column (){
        Carrusel(carouselItems = carouselItems, navController)
    }
}