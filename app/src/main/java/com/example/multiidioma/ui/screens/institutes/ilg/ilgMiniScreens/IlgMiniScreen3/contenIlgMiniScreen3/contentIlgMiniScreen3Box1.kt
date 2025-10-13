package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen3.contenIlgMiniScreen3

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.example.multiidioma.data.data.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun contentIlgMiniScreen3Box1(data : MiniScreenData) {
Column(modifier = Modifier
        .fillMaxSize() ){

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.8f)
            ) {
                LineVerticalComponent(contentAlignment = Alignment.Center, color = Color.Black)
            }


        }
}