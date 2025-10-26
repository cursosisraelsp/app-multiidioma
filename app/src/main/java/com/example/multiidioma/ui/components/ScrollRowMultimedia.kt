package com.example.multiidioma.ui.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MultimediaData
import com.example.multiidioma.data.urlVimeo

@Composable
fun ScrollRowMultimedia(multimediaList: List<MultimediaData>) {
    val context = LocalContext.current
    Column {
        LazyRow (modifier = Modifier.fillMaxHeight(0.35f),horizontalArrangement = Arrangement.spacedBy(6.dp)) {
            items(multimediaList) { multimediaData ->
                when (multimediaData) {

                    is MultimediaData.PodcastItem -> {

                        PodcastComposable(
                            podcast = multimediaData.podcast,
                            onClick = { ClickableImagePodcast(context = context,podcastUrl = multimediaData.podcast) }

                        )
                    }
                    else -> ""
                }
            }
        }
        LazyRow (modifier = Modifier.fillMaxHeight(0.6f),horizontalArrangement = Arrangement.spacedBy(6.dp)) {
            items(multimediaList) { multimediaData ->
                when (multimediaData) {
                    is MultimediaData.Video -> {
                        LanguageBasedVimeoVideo(
                            videoUrl = "${urlVimeo}${multimediaData.video.identificadorVimeo}",
                            imaxen = multimediaData.video.imaxe,
                            descripcion = multimediaData.video.description
                        )
                    }
                    else -> ""
                }
            }
        }

    }

}


