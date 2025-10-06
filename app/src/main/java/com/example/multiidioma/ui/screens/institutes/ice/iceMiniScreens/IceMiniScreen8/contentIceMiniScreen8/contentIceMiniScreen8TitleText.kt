package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen8.contentIceMiniScreen8

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
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun contentIceMiniScreen8TitleText(data: MiniScreenData) {
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.titleMedium, textAlign = TextAlign.Start
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 4.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        AppText(data, estilosTextos, index = 0)
        AppText(data, estilosTextos, index = 1)
    }
}

