package com.example.multiidioma.data.types

import androidx.compose.runtime.Composable

data class VideoYoutube(
    val uriYoutube : String,
    val description : String,
    val imaxe: @Composable () -> Unit
)
