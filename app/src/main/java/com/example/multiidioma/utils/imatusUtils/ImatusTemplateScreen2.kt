package com.example.multiidioma.utils.imatusUtils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
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
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent
import com.example.multiidioma.utils.TemplateCircleScreenUtils.BackWithArrowButtonCircleTemplate
import com.example.multiidioma.utils.TemplateCircleScreenUtils.BodyTextCircleTemplateUtil
import com.example.multiidioma.utils.TemplateCircleScreenUtils.CircleImageUtil
import com.example.multiidioma.utils.TemplateCircleScreenUtils.TitleTextCircleTemplateUtil

@Composable
fun ImatusTemplateScreen2(
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
                .fillMaxHeight(0.30f)
                .fillMaxWidth()
        ) {
            CircleImageUtil(data, CircleImage)
            TitleTextCircleTemplateUtil(data, TitleText)
        }

        // Body principal
        Column(
            modifier = Modifier
                .fillMaxWidth()

        ) {
            BodyTextCircleTemplateUtil(
                data = data,
                BodyText = BodyText,
                modifier = Modifier
                    .fillMaxWidth()

            )

            // Imatus específico 2 bloques con imágenes y texto
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 67.dp)
            ) {
                // Bloque 1
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(0.3f),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        ImatusImage4()
                        LineVerticalComponent()
                    }
                    ImatusTextBox(data, index = 2, modifier = Modifier.weight(1f))
                }

                // Bloque 2
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(0.3f),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        ImatusImage5()
                    }
                    ImatusTextBox(data, index = 4, modifier = Modifier.weight(1f))
                }
            }
        }

        // Botón Back
        BackWithArrowButtonCircleTemplate(
            navController = navController,
            modifier = Modifier
                .padding(end = 16.dp)
                .align(Alignment.End)
        )
    }
}