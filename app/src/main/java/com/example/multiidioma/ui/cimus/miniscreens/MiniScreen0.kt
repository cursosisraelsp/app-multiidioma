package com.example.multiidioma.ui.cimus.miniscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.LocalizedContext
import com.example.multiidioma.ui.components.VideoScreen


@Composable
fun MiniScreen0(
    data: MiniScreenData,
    modifier: Modifier = Modifier
) {
    // Usa el contexto localizado que ya pusiste en CompositionLocalProvider
    val context = LocalizedContext.current

    Box{
        Column(modifier = modifier.padding(16.dp).background(color = Color.Transparent)) {
            Box{
                VideoScreen(videoId = "dQw4w9WgXcQ", // tu ID de video
                    modifier = Modifier.fillMaxSize().aspectRatio(16f / 9f))
            }
            Box(modifier = modifier.background(color = Color.Transparent)){
                data.bodyParagraphs.forEach { res ->
                    Text(
                        text =  runCatching { context.getString(res) }.getOrElse { "???" },
                        color = Color.White,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }



        }
    }


}

