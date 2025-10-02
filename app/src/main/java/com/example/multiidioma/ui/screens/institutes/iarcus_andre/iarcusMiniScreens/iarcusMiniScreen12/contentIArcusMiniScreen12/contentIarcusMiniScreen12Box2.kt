package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen12.contentIArcusMiniScreen12


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextBodyMedium


@Composable
fun contentIarcusMiniScreen12Box2(data: MiniScreenData) {
    val estiloTextos =
        StyleText(style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        TextBodyMedium(data, textAlign = TextAlign.Center, index = 0)
        SpacerText()
        TextBodyMedium(data, textAlign = TextAlign.Center, index = 1)
        SpacerText()
        TextBodyMedium( data, textAlign = TextAlign.Center, index = 2)

    }
}