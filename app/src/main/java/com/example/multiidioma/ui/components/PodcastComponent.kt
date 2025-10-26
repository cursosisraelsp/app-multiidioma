package com.example.multiidioma.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.multiidioma.data.types.Podcast
@Composable
fun PodcastComposable(podcast: Podcast,
                      onClick: () -> Unit) {

    Column (
        modifier = Modifier.fillMaxWidth().height(250.dp)
            .border(width = 1.dp, color = Color.Gray).clickable { onClick() },
        verticalArrangement = Arrangement.SpaceBetween
        //horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen que viene en el modelo
        Column(
            modifier = Modifier
                .padding(16.dp)
                .size(150.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.Transparent),
            //contentAlignment = Alignment.Center
        ) {
            podcast.imaxe()
        }

        //Spacer(modifier = Modifier.width(16.dp))

        Text(text = podcast.title,maxLines = 1,
            overflow = TextOverflow.Ellipsis, modifier = Modifier.width(175.dp).padding(24.dp), color = Color.Red)
        /*Column(modifier = Modifier.weight(1f),verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = podcast.title,
                fontSize = 16.sp,
                //style = MaterialTheme.typography.titleMedium,
                fontFamily = AppTypography.displayLarge.fontFamily,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

        }*/
    }
}
