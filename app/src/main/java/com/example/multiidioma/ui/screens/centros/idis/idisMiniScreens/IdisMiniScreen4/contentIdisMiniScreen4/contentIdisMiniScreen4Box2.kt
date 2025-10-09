package com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen4.contentIdisMiniScreen4

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
import com.example.multiidioma.ui.screens.centros.idis.IdisvalorFigura0
import com.example.multiidioma.ui.screens.centros.idis.IdisvalorFigura1
import com.example.multiidioma.ui.screens.centros.idis.IdisvalorFigura2
import com.example.multiidioma.ui.screens.centros.idis.IdisvalorFigura3
import com.example.multiidioma.ui.screens.centros.idis.IdisvalorFigura4
import com.example.multiidioma.ui.screens.centros.idis.IdisvalorFigura5
import com.example.multiidioma.ui.screens.centros.idis.IdisvalorFigura6
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentIdisMiniScreen4Box2(data: MiniScreenData, navController: NavController) {
    Column {
        Column (modifier = Modifier
            .fillMaxWidth().padding(start = 10.dp, end = 10.dp)){
            TextBodyMedium(data, textAlign = TextAlign.Center)
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF66AAD1))
        ) {
            NavigationFiguresComponent(IdisvalorFigura0, navController)
            NavigationFiguresComponent(IdisvalorFigura1, navController)
            NavigationFiguresComponent(IdisvalorFigura2, navController)
            NavigationFiguresComponent(IdisvalorFigura3, navController)
            NavigationFiguresComponent(IdisvalorFigura4, navController)
            NavigationFiguresComponent(IdisvalorFigura5, navController)
            NavigationFiguresComponent(IdisvalorFigura6, navController)
        }

    }
}