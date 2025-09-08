package com.example.multiidioma.ui.screens.institutes

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.R
import com.example.multiidioma.data.repository.listaInstitutos
import com.example.multiidioma.ui.components.Carrusel

@Composable
fun InstitutesScreen(navController: NavController){

    val carouselItems = remember {
        listaInstitutos
    }
    Column (){
        Carrusel(carouselItems = carouselItems, navController)
        Box(modifier = Modifier.fillMaxWidth().border(width = 1.dp, color = Color.Red)){
            Image(

                painterResource(R.drawable.imaxen_centros_investigacion),
                contentDescription = "institutos",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillBounds
            )

            Text(text = "¿Qué son los Institutos Investigación?")
        }
    }
}