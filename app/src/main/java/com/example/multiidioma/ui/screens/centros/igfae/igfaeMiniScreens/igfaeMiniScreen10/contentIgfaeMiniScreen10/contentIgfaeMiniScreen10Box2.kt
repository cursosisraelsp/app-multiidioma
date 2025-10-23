package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen10a.contentCretusMiniScreen10


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
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.NavigationFigures.NavigationFiguresIgfae.NavigationFiguresIgfae2
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.utils.TextTitleLarge

@Composable
fun contentIgfaeMiniScreen10Box2(data: MiniScreenData, navController: NavController) {
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
            NavigationFiguresIgfae2(navController)
        }
    }
}