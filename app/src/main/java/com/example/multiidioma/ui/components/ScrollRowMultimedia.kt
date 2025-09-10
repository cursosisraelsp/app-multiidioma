package com.example.multiidioma.ui.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import com.example.multiidioma.data.types.MultimediaData
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun ScrollRowMultimedia(multimediaList: List<MultimediaData>) {
    val context = LocalContext.current
    Column {
        LazyRow (modifier = Modifier.fillMaxHeight(0.3f)) {
            items(multimediaList) { multimediaData ->
                when (multimediaData) {

                    is MultimediaData.PodcastItem -> {

                        PodcastComposable(
                            podcast = multimediaData.podcast,
                            onClick = { OpenSpotify(context, multimediaData.podcast) }
                        )
                    }
                    else -> ""
                }
            }
        }
        LazyRow (modifier = Modifier.fillMaxHeight(0.3f)) {
            items(multimediaList) { multimediaData ->
                when (multimediaData) {
                    is MultimediaData.Video -> {
                        VideoComponente(
                            video = multimediaData.video,
                            onClick = {
                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(multimediaData.video.uriYoutube))
                                context.startActivity(intent)
                            }
                        )
                    }
                    else -> ""
                }
            }
        }
    }

}


