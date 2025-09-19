package com.example.multiidioma.utils.LazyRowTemplateScreenUtils



import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData

@Composable
fun FirstDirective(
    data: MiniScreenData,
    FirstDirectiveImage: @Composable (MiniScreenData) -> Unit = {},
    FirstDirectiveDescriptionText: @Composable (MiniScreenData) -> Unit = {},
    modifier: Modifier = Modifier,
) {
    Column(modifier) {
        Box(
            modifier = Modifier
                .weight(0.7f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            FirstDirectiveImage(data)
        }

        Spacer(modifier = Modifier.width(12.dp))

        Box(
            modifier = Modifier
                .weight(0.3f)
                .fillMaxWidth()
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            FirstDirectiveDescriptionText(data)
        }
    }
}