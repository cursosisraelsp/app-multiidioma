package com.example.multiidioma.data.types

import androidx.compose.runtime.Composable

data class Podcast(
    val id: Int,
    val uriSpotifyApp: String,
    val uriSpotifyWeb: String,
    val protagonista: String,
    val title : String,
    val imaxe : @Composable () -> Unit
)
