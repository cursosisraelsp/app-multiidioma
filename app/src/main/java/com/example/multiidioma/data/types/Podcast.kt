package com.example.multiidioma.data.types

import androidx.compose.runtime.Composable

data class Podcast(
    val id: Int,
    val uriSpotifyApp: String? = null,
    val uriSpotifyWeb: String? = null,
    val uriIvoox: String? = null,
    val protagonista: String? = null,
    val title : String,
    val imaxe : @Composable () -> Unit
)
