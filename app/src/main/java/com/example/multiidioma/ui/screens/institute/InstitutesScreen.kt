package com.example.multiidioma.ui.screens.institute

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import com.example.multiidioma.data.repository.listaInstitutos
import com.example.multiidioma.ui.components.Carrusel

@Composable
fun InstitutesScreen(navController: NavController){

    val carouselItems = remember {
        listaInstitutos
    }
    Column (){
        Carrusel(carouselItems = carouselItems, navController)
    }
}