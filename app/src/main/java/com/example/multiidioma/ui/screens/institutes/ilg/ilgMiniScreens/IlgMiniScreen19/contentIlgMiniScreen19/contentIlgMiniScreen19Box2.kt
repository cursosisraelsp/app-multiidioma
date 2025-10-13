package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen19.contentIlgMiniScreen19

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.utils.TextTitleMedium
import com.example.multiidioma.utils.TextTitleMediumRegular

@Composable
fun contentIlgMiniScreen19Box2(data: MiniScreenData) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp)
            .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextTitleMedium(data, index = 0, textAlign = TextAlign.Center)
        TextTitleMediumRegular(data, index = 1, textAlign = TextAlign.Center)
    }
}