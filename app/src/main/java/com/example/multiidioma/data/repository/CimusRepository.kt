package com.example.multiidioma.data.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.multiidioma.R
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.cimus.miniscreens.MiniScreen0
import com.example.multiidioma.ui.cimus.miniscreens.MiniScreen1
import com.example.multiidioma.ui.cimus.miniscreens.MiniScreen2
import com.example.multiidioma.viewmodel.LanguageViewModel

val detailScreenContent = listOf(MiniScreenData(
    bodyParagraphs = listOf(
        R.string.paragraph_1,
        R.string.paragraph_2,
        R.string.paragraph_3
    )
    ),
    MiniScreenData(
    bodyParagraphs = listOf(
        R.string.paragraph_1,
        R.string.paragraph_2,
        R.string.paragraph_3
    )
    ),
    MiniScreenData(
    bodyParagraphs = listOf(
        R.string.paragraph_1,
        R.string.paragraph_2,
        R.string.paragraph_3
    )
    ),
)

fun miniScreensCimus(
    detailScreenContent: List<MiniScreenData>, // ajusta el tipo según tus datos
    languageViewModel: LanguageViewModel
): List<@Composable (Modifier) -> Unit> {
    return listOf(
        { modifier -> MiniScreen0(data = detailScreenContent[0], languageViewModel = languageViewModel, modifier = modifier) },
        { modifier -> MiniScreen1(data = detailScreenContent[1], languageViewModel = languageViewModel, modifier = modifier) },
        { modifier -> MiniScreen2(data = detailScreenContent[2], languageViewModel = languageViewModel, modifier = modifier) }
    )
}

