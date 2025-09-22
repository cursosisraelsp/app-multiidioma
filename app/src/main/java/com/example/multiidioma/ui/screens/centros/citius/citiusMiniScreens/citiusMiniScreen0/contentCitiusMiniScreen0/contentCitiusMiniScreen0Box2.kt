package com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen0.contentCitiusMiniScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.Text.AppText


@Composable
fun contentCitiusMiniScreen0Box2(data: MiniScreenData) {
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp, top = 50.dp)


    ) {
        AppText(data, estilosTextos)
    }
}