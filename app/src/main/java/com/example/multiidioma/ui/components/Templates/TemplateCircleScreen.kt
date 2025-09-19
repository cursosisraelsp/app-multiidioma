package com.example.multiidioma.ui.components.Templates



import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.utils.TemplateCircleScreen.BodyTextCircleTemplateUtil
import com.example.multiidioma.utils.TemplateCircleScreen.BoxArrowBackSpace
import com.example.multiidioma.utils.TemplateCircleScreen.CircleImageUtil
import com.example.multiidioma.utils.TemplateCircleScreen.TitleTextCircleTemplateutil


@Composable
fun TemplateCircleScreen(
    data: MiniScreenData,
    navController: NavController,
    CircleImage: @Composable ((MiniScreenData) -> Unit) = {},
    TitleText: @Composable ((MiniScreenData) -> Unit) = {},
    BodyText: @Composable ((MiniScreenData) -> Unit) = {}
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        //Row con circulo y titulo
        Row(
            modifier = Modifier
                .fillMaxHeight(0.25f)
                .fillMaxWidth()
        ) {
            //Imagen Circulo
            CircleImageUtil(data, CircleImage)

            //Titulo
            TitleTextCircleTemplateutil(data, TitleText)
        }

        //Columna con texto
        BodyTextCircleTemplateUtil(data, BodyText)

        //Box con flecha, ATRAS y espacio final
        BoxArrowBackSpace(navController = navController)
    }
}

