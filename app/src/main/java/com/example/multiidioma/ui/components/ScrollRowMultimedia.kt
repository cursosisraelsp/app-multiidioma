package com.example.multiidioma.ui.components

import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MultimediaData
import com.example.multiidioma.data.urlVimeo

@Composable
fun ScrollRowMultimedia(multimediaList: List<MultimediaData>) {
    val context = LocalContext.current
    LazyColumn(modifier = Modifier.fillMaxSize().fillMaxHeight(),
        contentPadding = PaddingValues(bottom = 32.dp, top = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item{
            LazyRow (modifier =Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.spacedBy(6.dp)) {
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
        }
        item{
            LazyRow (modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.spacedBy(0.dp)) {
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
        // 🎬 Shorts Ihus
        item {
            val shorts = multimediaList.filterIsInstance<MultimediaData.ShortIhus>()
            Text("IHUS", modifier = Modifier.padding(16.dp),style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.W900)

            LazyRow(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                items(shorts) { multimediaData ->
                    LanguageBasedVimeoVideo(
                        videoUrl = "${urlVimeo}${multimediaData.short.identificadorVimeo}",
                        imaxen = multimediaData.short.imaxe,
                        descripcion = multimediaData.short.description
                    )
                }
            }
        }

        // 🎬 Shorts Cretus
        item {
            val shorts = multimediaList.filterIsInstance<MultimediaData.ShortCretus>()
            Text("CRETUS", modifier = Modifier.padding(16.dp),style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.W900)

            LazyRow(
                modifier =Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                items(shorts) { multimediaData ->
                    LanguageBasedVimeoVideo(
                        videoUrl = "${urlVimeo}${multimediaData.short.identificadorVimeo}",
                        imaxen = multimediaData.short.imaxe,
                        descripcion = multimediaData.short.description
                    )
                }
            }
        }
        // 🎬 Shorts Idis
        item {
            val shorts = multimediaList.filterIsInstance<MultimediaData.ShortIdis>()
            Text("IDIS", modifier = Modifier.padding(16.dp),style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.W900)

            LazyRow(
                modifier =Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                items(shorts) { multimediaData ->
                    LanguageBasedVimeoVideo(
                        videoUrl = "${urlVimeo}${multimediaData.short.identificadorVimeo}",
                        imaxen = multimediaData.short.imaxe,
                        descripcion = multimediaData.short.description
                    )
                }
            }
        }

    }

}


