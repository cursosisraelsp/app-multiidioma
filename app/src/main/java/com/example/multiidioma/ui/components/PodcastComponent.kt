package com.example.multiidioma.ui.components

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.Podcast
import com.example.multiidioma.ui.theme.AppTypography

@Composable
fun PodcastComposable(podcast: Podcast,
                      onClick: () -> Unit) {

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp).border(width = 1.dp, color = Color.Gray).clickable { onClick() },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen que viene en el modelo
        Box(
            modifier = Modifier
                .size(64.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.Transparent),
            contentAlignment = Alignment.Center
        ) {
            podcast.imaxe()
        }

        Spacer(modifier = Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f),verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = podcast.title,
                style = MaterialTheme.typography.titleMedium,
                fontFamily = AppTypography.displayLarge.fontFamily,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Text(
                text = podcast.protagonista,
                style = MaterialTheme.typography.bodyMedium,
                fontFamily = AppTypography.displayLarge.fontFamily,
                color = Color.Gray
            )
        }
    }
}