package com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen3.contentImatusMiniScreen3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.SpacerText

import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentImatusMiniScreen3Box2(data: MiniScreenData) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp, end = 50.dp, bottom = 20.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextBodyMedium(data, index = 0, textAlign = TextAlign.Center)

        SpacerText()

        TextBodyMedium(data, index = 1, textAlign = TextAlign.Center)

        SpacerText()

        TextBodyMedium(data, index = 2, textAlign = TextAlign.Center)
    }
}