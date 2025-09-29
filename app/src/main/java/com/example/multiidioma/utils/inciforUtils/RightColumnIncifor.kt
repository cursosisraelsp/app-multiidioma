package com.example.multiidioma.utils.inciforUtils

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData

@Composable
fun RightColumnIncifor6(data: MiniScreenData, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            TextBoxInciforScreen6(data, index = 2)
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            TextBoxInciforScreen6(data, index = 4)
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            TextBoxInciforScreen6(data, index = 6)
        }
    }
}
