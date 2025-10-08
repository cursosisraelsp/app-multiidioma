package com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen1.contentIdisMiniScreen1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentIdisMiniScreen1Box1() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
         LineVerticalComponent()

        }
    }
}