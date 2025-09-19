package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen11a.contentCretusMiniScreen11


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Text.TextBodyMedium

@Composable
fun contentIgfaeMiniScreen11TitleText(data: MiniScreenData) {
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.titleMedium, textAlign = TextAlign.Start
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp, end = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextBodyMedium(data, estilosTextos, index = 0)
        TextBodyMedium(data, estilosTextos, index = 1)
    }
}