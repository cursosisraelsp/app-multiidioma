package com.example.multiidioma.utils.imatusUtils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.LineVerticalComponent

@Composable
fun Imatus3ImagesWithLine(data: MiniScreenData, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Yellow)
    ) {
        Column(
            modifier = Modifier.weight(0.2f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ImatusImage1()
        }
        Box(modifier = Modifier.weight(0.2f)) {
            LineVerticalComponent()
        }

        Column(
            modifier = Modifier.weight(0.2f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ImatusImage2()
        }
        Box(modifier = Modifier.weight(0.2f)) {
            LineVerticalComponent()
        }

        Column(
            modifier = Modifier.weight(0.2f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ImatusImage3()
        }
    }
}