package com.example.multiidioma.ui.screens.institutes

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.multiidioma.R
import com.example.multiidioma.data.repository.listaInstitutos
import com.example.multiidioma.data.urlRecursosApp
import com.example.multiidioma.ui.components.Carrusel

@Composable
fun InstitutesScreen(navController: NavController){

    val carouselItems = remember {
        listaInstitutos
    }
    Log.d("Listainstitus","carouselItems $carouselItems")
    Column (){

        Carrusel(carouselItems = carouselItems, navController)
        Box(modifier = Modifier.fillMaxWidth()){

            val imaxen = "$urlRecursosApp/imaxen_centros_investigacion.jpg"
            AsyncImage(
                model = imaxen,
                contentDescription = "institutos",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxWidth()
            )
            Text(text = "¿Qué son los Institutos Investigación?")
        }
    }
}