package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen14a.contentCretusMiniScreen14


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
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae6
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae7
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.utils.TextTitleLarge

@Composable
fun contentIgfaeMiniScreen14Box2(data: MiniScreenData, navController: NavController) {
    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth().padding(top = 10.dp, start = 20.dp, end = 20.dp)
        ) {
            TextTitleLarge(data, textAlign = TextAlign.Center, index = 0)
            SpacerText()
            TextBodyMedium(data, textAlign = TextAlign.Center, index = 1)
            SpacerText()
            TextBodyMedium(data, textAlign = TextAlign.Center, index = 2)
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF66AAD1))
        ) {
            NavigationFiguresComponent(valorFiguraIgfae6, navController)
            NavigationFiguresComponent(valorFiguraIgfae7, navController)
        }
    }
}