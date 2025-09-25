package com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen5

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TemplateCircleScreenUtils.BackWithArrowButtonCircleTemplate
import com.example.multiidioma.utils.TemplateCircleScreenUtils.BodyTextCircleTemplateUtil
import com.example.multiidioma.utils.TemplateCircleScreenUtils.CircleImageUtil
import com.example.multiidioma.utils.TemplateCircleScreenUtils.TitleTextCircleTemplateUtil
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.utils.TextTitleSmall

@Composable
fun ImatusMiniScreen5(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
    CircleImage: @Composable (MiniScreenData) -> Unit = {},
    TitleText: @Composable (MiniScreenData) -> Unit = {},
    BodyText: @Composable (MiniScreenData) -> Unit = {},
    ) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.LightGray)
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
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
        ) {
            // Texto con padding start
            BodyTextCircleTemplateUtil(
                data = data,
                BodyText = BodyText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Red) // importante para alinear botón
            )
            //Imatus Especifico
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Green)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Yellow)
                ) {
                    TextTitleSmall(data, index = )
                    SpacerText()
                    TextBodyMedium(data, index = )
                }

                Column(
                    modifier = Modifier
                        .background(Color.Gray)
                ) { }

            }
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

