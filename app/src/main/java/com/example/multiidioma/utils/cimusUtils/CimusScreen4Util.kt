package com.example.multiidioma.utils.cimusUtils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.LineVerticalComponent
import com.example.multiidioma.utils.TemplateCircleScreenUtils.BackWithArrowButtonCircleTemplate
import com.example.multiidioma.utils.TemplateCircleScreenUtils.BodyTextCircleTemplateUtil
import com.example.multiidioma.utils.TemplateCircleScreenUtils.CircleImageUtil
import com.example.multiidioma.utils.TemplateCircleScreenUtils.TitleTextCircleTemplateUtil
import com.example.multiidioma.utils.cimusUtils.CimusImage1

@Composable
fun CimusTemplateScreen1(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
    CircleImage: @Composable (MiniScreenData) -> Unit = {},
    TitleText: @Composable (MiniScreenData) -> Unit = {},
    BodyText: @Composable (MiniScreenData) -> Unit = {},
) {

    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        // Parte superior: CircleImage + Título
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            CircleImageUtil(data, CircleImage)
            TitleTextCircleTemplateUtil(data, TitleText)
        }

        // Body principal
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp)
        ) {
            BodyTextCircleTemplateUtil(
                data = data,
                BodyText = BodyText,
                modifier = Modifier
                    .fillMaxWidth()
            )

            // Bloques de imágenes y texto
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 67.dp, end = 2.dp)
            ) {
                // Bloque 1
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Top
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(0.3f),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        CimusImage1()
                        LineVerticalComponent()
                    }
                    CimusTextBox(data, index = 2, modifier = Modifier.weight(1f))
                }

                // Bloque 2
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Top
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(0.3f),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        CimusImage2()
                        LineVerticalComponent()
                    }
                    CimusTextBox(data, index = 4, modifier = Modifier.weight(1f))
                }

                // Bloque 3
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Top
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(0.3f),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        CimusImage3()
                    }
                    CimusTextBox(data, index = 6, modifier = Modifier.weight(1f))
                }
            }

            // Botón Back
            BackWithArrowButtonCircleTemplate(
                navController = navController,
                modifier = Modifier
                    .padding(top = 24.dp, end = 16.dp)
                    .align(Alignment.End)
            )
        }
    }
}