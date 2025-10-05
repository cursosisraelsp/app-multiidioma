package com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen4.contentImatusMiniScreen4


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.utils.NavigationFIgures.NavigationFiguresImatus
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentImatusMiniScreen4Box2(data: MiniScreenData, navController: NavController) {
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
            NavigationFiguresImatus(navController)
        }
    }
}



