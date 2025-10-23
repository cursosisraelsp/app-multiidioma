package com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.CiqusMiniScreen4.contentCiqusMiniScreen4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.ui.screens.centros.ciqus.valorFiguraCiqus0
import com.example.multiidioma.ui.screens.centros.ciqus.valorFiguraCiqus1
import com.example.multiidioma.ui.screens.centros.ciqus.valorFiguraCiqus2
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentCiqusMiniScreen4Box2(data: MiniScreenData, navController: NavController) {
    Column {
        Column (modifier = Modifier
            .fillMaxWidth().padding(start = 50.dp, end = 50.dp, top = 15.dp)){
            TextBodyMedium(data, textAlign = TextAlign.Center, index = 0)
            SpacerText()
            TextBodyMedium(data, textAlign = TextAlign.Center, index = 1)
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF66AAD1))
        ) {
            NavigationFiguresComponent(valorFiguraCiqus0, navController)
            NavigationFiguresComponent(valorFiguraCiqus1, navController)
            NavigationFiguresComponent(valorFiguraCiqus2, navController)
        }

    }
}