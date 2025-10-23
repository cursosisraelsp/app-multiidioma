@file:JvmName("ContentCretusMiniScreen8Box2Kt")

package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen8.contentCretusMiniScreen8


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
import com.example.multiidioma.utils.NavigationFigures.NavigationFiguresCretus
import com.example.multiidioma.utils.TextBodyMedium


@Composable
fun contentCretusMiniScreen8Box2(data: MiniScreenData, navController: NavController) {
    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth().padding(top = 20.dp, start = 20.dp, end = 20.dp)
        ) {
            TextBodyMedium(data, textAlign = TextAlign.Center)
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF66AAD1))
        ) {
            NavigationFiguresCretus(navController)
        }
    }

}