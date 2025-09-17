package com.example.multiidioma.ui.components

import android.graphics.drawable.AnimatedImageDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.LocalContext
// Android y Compose

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text

import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import coil.ImageLoader
import coil.compose.AsyncImage

import com.example.multiidioma.R
// Coil

import coil.request.ImageRequest






@RequiresApi(Build.VERSION_CODES.P)
@Composable

fun ParallaxComponent() {
    val scrollState = rememberLazyListState()
    val offsetY = remember { derivedStateOf { scrollState.firstVisibleItemScrollOffset * 0.5f } }

    Box {
        // GIF con parallax
        AsyncImage(
            model = R.raw.incifor_anim_01 ,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .graphicsLayer {
                    translationY = offsetY.value.toFloat()
                }
        )

        // LazyColumn para scroll
        /*LazyColumn(
            state = scrollState,
            contentPadding = PaddingValues(top = 250.dp)
        ) {
            items(50) { index ->
                Text(
                    text = "Item $index",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )
            }
        }*/
    }
}

