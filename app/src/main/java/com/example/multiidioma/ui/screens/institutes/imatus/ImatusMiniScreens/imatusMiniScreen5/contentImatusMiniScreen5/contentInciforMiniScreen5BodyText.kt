package com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen5.contentImatusMiniScreen5

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
import com.example.multiidioma.utils.TextBodyMedium


@Composable
fun contentImatusMiniScreen5BodyText(data: MiniScreenData) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp, end = 50.dp, bottom = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextBodyMedium(data, index = 1, textAlign = TextAlign.Start)
    }
}

