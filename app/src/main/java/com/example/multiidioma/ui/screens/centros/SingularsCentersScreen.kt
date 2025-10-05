package com.example.multiidioma.ui.screens.centros

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import com.example.multiidioma.data.repository.listSingularsCenters
import com.example.multiidioma.ui.components.Carrusel

@Composable
fun CentresSingularsScreen(navController: NavController){

    val carouselItems = remember {
        listSingularsCenters
    }
    Column (){
        Carrusel(carouselItems = carouselItems, navController)
        Box(modifier = Modifier.border(width = 1.dp, color = Color.Red)){
            Box(){
                Image(painterResource(R.drawable.imaxen_centros_singulares), contentDescription = "centro singular",
                    contentScale = ContentScale.Crop)
            }
            Text(text = "¿Qué son los centros singulares?")
        }
    }
}