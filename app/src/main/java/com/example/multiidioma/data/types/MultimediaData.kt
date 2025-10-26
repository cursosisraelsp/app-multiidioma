package com.example.multiidioma.data.types

sealed class MultimediaData {
    data class Video(val video: VideoVimeo) : MultimediaData()
    data class PodcastItem(val podcast: Podcast) : MultimediaData()
    data class ShortIhus(val short: VideoVimeo) : MultimediaData()
    data class ShortCretus(val short: VideoVimeo) : MultimediaData()
    data class ShortIdis(val short: VideoVimeo) : MultimediaData()
}

