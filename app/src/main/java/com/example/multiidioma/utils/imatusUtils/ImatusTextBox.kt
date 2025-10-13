package com.example.multiidioma.utils.imatusUtils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.utils.TextTitleSmall

@Composable
fun ImatusTextBox(
    data: MiniScreenData,
    index: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(start = 8.dp, bottom = 16.dp)
    ) {
        TextTitleSmall(data, index = index)
        SpacerText()
        TextBodyMedium(data, index = index + 1)
    }
}