package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen5.contentIhusMiniScreen5

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.utils.NavigationFigures.NavigationFiguresIhus
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentIhusMiniScreen5Box2(data: MiniScreenData, navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.2f)
            .padding(start = 50.dp, end = 50.dp, top = 50.dp)
    ) {
        TextBodyMedium(data, index = 0, textAlign = TextAlign.Center)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        NavigationFiguresIhus(navController)
    }
}
