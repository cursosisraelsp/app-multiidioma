package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen7.contentIarcusMiniScreen7


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.components.Text.AppText
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.valorFiguraIarcus0
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.valorFiguraIarcus1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.valorFiguraIarcus2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.valorFiguraIarcus3
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentIarcusMiniScreen7Box2(data: MiniScreenData, navController: NavController) {
    Column {
        Column (modifier = Modifier
            .fillMaxWidth().padding(top= 20.dp,start = 20.dp, end = 20.dp)){
            TextBodyMedium(data, textAlign = TextAlign.Center)
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF66AAD1))
        ) {
            NavigationFiguresComponent(valorFiguraIarcus0, navController)
            NavigationFiguresComponent(valorFiguraIarcus1, navController)
            NavigationFiguresComponent(valorFiguraIarcus2, navController)
            NavigationFiguresComponent(valorFiguraIarcus3, navController)
        }
    }
}