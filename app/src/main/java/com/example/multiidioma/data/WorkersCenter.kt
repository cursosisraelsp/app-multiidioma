package com.example.multiidioma.data

import androidx.compose.runtime.Composable
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.Podcast

data class WorkersCenter(
    val infoWorkerCenter : List<@Composable ((MiniScreenData) -> Unit)>,
    val podcast: List<Podcast>,
)


