package com.example.multiidioma.ui.screens.centros.cretus_andre.iarcusMiniScreens.cretusMiniScreen21.contentIpsiusMiniScreen21

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Text.TextBodyMedium

@Composable
fun contentIpsiusMiniScreen21Box2(data: MiniScreenData){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp, bottom = 20.dp, start = 50.dp, end = 50.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Center
    ) {
        val estiloTextos =
            StyleText(style = MaterialTheme.typography.bodyMedium, color =(Color(0xFFFFFFFF)), textAlign = TextAlign.Center)

        TextBodyMedium(data, estiloTextos)

        TextBodyMedium(data, estiloTextos)


    }
}