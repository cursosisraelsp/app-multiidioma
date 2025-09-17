package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen8.contentIhusMiniScreen8

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.repository.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Text.TextBodyMedium

@Composable
fun contentIhusMiniScreen8Box1(data: MiniScreenData) {

    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium,
        textAlign = TextAlign.Center,
    )
    Column(modifier = Modifier.fillMaxSize()
        .background(Color.Yellow)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f)
                .padding(start = 50.dp, end = 50.dp)
        ) {
            TextBodyMedium(data, estilosTextos)
        }
    }

}