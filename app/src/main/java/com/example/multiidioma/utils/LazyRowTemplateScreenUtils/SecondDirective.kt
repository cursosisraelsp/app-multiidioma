package com.example.multiidioma.utils.LazyRowTemplateScreenUtils

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData

@Composable
fun SecondDirective(
    data: MiniScreenData,
    SecondDirectiveImage: @Composable (MiniScreenData) -> Unit = {},
    SecondDirectiveDescriptionText: @Composable (MiniScreenData) -> Unit = {},
    modifier: Modifier = Modifier,
) {
    Column(modifier) {
        Box(
            modifier = Modifier
                .weight(0.7f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            SecondDirectiveImage(data)
        }

        Box(
            modifier = Modifier
                .weight(0.3f)
                .fillMaxWidth()
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            SecondDirectiveDescriptionText(data)
        }
    }
}