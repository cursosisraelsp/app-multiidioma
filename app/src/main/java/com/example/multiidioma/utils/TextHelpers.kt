package com.example.multiidioma.utils


import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun TextTitleSmall(
    data: MiniScreenData,
    index: Int? = null,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = Color.White,
) = AppText(
    data = data,
    style = StyleText(
        style = MaterialTheme.typography.titleSmall,
        textAlign = TextAlign.Start
    ),
    index = index,
)

@Composable
fun TextTitleMedium(
    data: MiniScreenData,
    index: Int? = null,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = Color.White,
) = AppText(
    data = data,
    style = StyleText(
        style = MaterialTheme.typography.titleMedium,
        textAlign = TextAlign.Start
    ),
    index = index,
)

@Composable
fun TextDisplayMedium(
    data: MiniScreenData,
    index: Int? = null,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = Color.White,
) = AppText(
    data = data,
    style = StyleText(
        style = MaterialTheme.typography.displayMedium,
        textAlign = TextAlign.Start
    ),
    index = index,
)


@Composable
fun TextTitleLarge(
    data: MiniScreenData,
    index: Int? = null,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = Color.White,
) = AppText(
    data = data,
    style = StyleText(
        style = MaterialTheme.typography.titleLarge,
        textAlign = TextAlign.Start
    ),
    index = index,
)

@Composable
fun TextBodyMedium(
    data: MiniScreenData,
    index: Int? = null,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = Color.White,
) = AppText(
    data = data,
    style = StyleText(
        style = MaterialTheme.typography.bodyMedium,
        textAlign = textAlign
    ),
    index = index,
)

