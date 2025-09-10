package com.example.multiidioma.data.types

sealed class MultimediaData {
    data class Video(val video: VideoYoutube) : MultimediaData()
    data class PodcastItem(val podcast: Podcast) : MultimediaData()
}

