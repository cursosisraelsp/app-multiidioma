package com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen26.contentInciforMiniScreen

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.Text.TextBodyMedium

@Composable
fun contentSecondDirectiveTextDescriptionMiniScreen26(data: MiniScreenData) {
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center
    )

    TextBodyMedium(data, estilosTextos)
}
