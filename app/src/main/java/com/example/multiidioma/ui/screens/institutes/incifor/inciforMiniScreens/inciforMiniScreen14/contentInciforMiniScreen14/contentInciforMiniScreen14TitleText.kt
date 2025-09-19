package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen14.contentInciforMiniScreen14

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.Text.TextBodyMedium

@Composable
fun contentInciforMiniScreen14TitleText(data: MiniScreenData) {
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.titleMedium, textAlign = TextAlign.Start
    )

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ) {
        TextBodyMedium(data, estilosTextos, index = 0)
        TextBodyMedium(data, estilosTextos, index = 1)
    }
}

