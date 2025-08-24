package com.example.multiidioma.ui.cimus.miniscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.LocalizedContext
import com.example.multiidioma.viewmodel.LanguageViewModel

@Composable
fun MiniScreen2(data: MiniScreenData, languageViewModel: LanguageViewModel, modifier: Modifier){
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(16.dp)
        ) {
            // Usa un 'if' para verificar si hay párrafos de texto
            if (data.bodyParagraphs != null) {
                // Itera sobre la lista de IDs de recursos y muestra cada texto
                data.bodyParagraphs.forEach { paragraphResId ->
                    val paragraphText = languageViewModel.getString(paragraphResId)
                    Text(text = paragraphText)
                }
            }
        }
    }
}