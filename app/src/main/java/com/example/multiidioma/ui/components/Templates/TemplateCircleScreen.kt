package com.example.multiidioma.ui.components.Templates

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.utils.TemplateCircleScreenUtils.BackWithArrowButtonCircleTemplate
import com.example.multiidioma.utils.TemplateCircleScreenUtils.BodyTextCircleTemplateUtil
import com.example.multiidioma.utils.TemplateCircleScreenUtils.BoxArrowBackSpace
import com.example.multiidioma.utils.TemplateCircleScreenUtils.CircleImageUtil
import com.example.multiidioma.utils.TemplateCircleScreenUtils.TitleTextCircleTemplateUtil

@Composable
fun TemplateCircleScreen(
    data: MiniScreenData,
    navController: NavController,
    CircleImage: @Composable (MiniScreenData) -> Unit = {},
    TitleText: @Composable (MiniScreenData) -> Unit = {},
    BodyText: @Composable (MiniScreenData) -> Unit = {}
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // Row con círculo y título
        Row(
            modifier = Modifier
                .fillMaxHeight(0.30f)
                .fillMaxWidth()
        ) {
            CircleImageUtil(data, CircleImage)
            TitleTextCircleTemplateUtil(data, TitleText)
        }

        // Columna que contiene texto y botón
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            // Texto con padding start
            BodyTextCircleTemplateUtil(
                data = data,
                BodyText = BodyText,
                modifier = Modifier.fillMaxWidth() // importante para alinear botón
            )

            // Botón Back alineado al end
            BackWithArrowButtonCircleTemplate(
                navController = navController,
                modifier = Modifier
                    .padding(end = 16.dp) // opcional, margen a la derecha
                    .align(Alignment.End)
            )
        }
    }
}


