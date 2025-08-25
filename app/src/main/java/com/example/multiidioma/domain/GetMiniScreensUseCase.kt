package com.example.multiidioma.domain

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.data.repository.CimusRepository

class GetMiniScreensUseCase(
    private val repository: CimusRepository
) {
    operator fun invoke(detailScreenContent: List<MiniScreenData>, language: String): List<@Composable (Modifier) -> Unit> {
        return repository.getMiniScreens(detailScreenContent, language)
    }
}