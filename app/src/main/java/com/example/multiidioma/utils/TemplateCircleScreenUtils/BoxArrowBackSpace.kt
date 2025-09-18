package com.example.multiidioma.utils.TemplateCircleScreenUtils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun BoxArrowBackSpace(navController: NavController) {
    // Columna para apilar texto anterior y botón
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp) // margen opcional
    ) {
        // Aquí estaría tu bloque de texto (BodyTextCircleTemplateUtil o lo que uses)

        // Botón Back alineado al end
        BackWithArrowButtonCircleTemplate(
            navController = navController,
            modifier = Modifier
                .align(Alignment.End) // 🔑 se pega al final del texto anterior
        )
    }
}