package com.example.multiidioma.ui.screens.institutes.ilg.ilgMiniScreens.ilgMiniScreen15.contentIlgMiniScreen

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun contentFirstDirectiveTextDescriptionMiniScreen15(data: MiniScreenData) {
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center
    )

    AppText(data, estilosTextos)
}