package com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen5.contentCitiusMiniScreen5


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.utils.NavigationFIgures.NavigationFiguresCitius
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentCitiusMiniScreen5Box2(data: MiniScreenData, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
        ) {
            TextBodyMedium(
                data,
                index = 0,
                textAlign = TextAlign.Center
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            NavigationFiguresCitius(navController)
        }
    }
}



