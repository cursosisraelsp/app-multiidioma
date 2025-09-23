package com.example.multiidioma.utils.LazyRowTemplateScreenUtils

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData

@Composable
fun Directives(
    data: MiniScreenData,
    FirstDirectiveImage: @Composable (MiniScreenData) -> Unit = {},
    FirstDirectiveDescriptionText: @Composable (MiniScreenData) -> Unit = {},
    SecondDirectiveImage: @Composable (MiniScreenData) -> Unit = {},
    SecondDirectiveDescriptionText: @Composable (MiniScreenData) -> Unit = {},
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        // Primer directivo
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            FirstDirective(
                data,
                FirstDirectiveImage,
                FirstDirectiveDescriptionText,
                modifier = Modifier
                    .fillMaxSize()
            )
        }

        // Segundo directivo
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SecondDirective(
                data,
                SecondDirectiveImage,
                SecondDirectiveDescriptionText,

                modifier = Modifier
                    .fillMaxSize()
            )
        }
    }
}