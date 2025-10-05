package com.example.multiidioma.ui.components

import android.annotation.SuppressLint
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun YouTubePlayerCompose(
    videoId: String,
    modifier: Modifier = Modifier
) {
    val html = """
        <!DOCTYPE html>
        <html>
        <body style="margin:0">
            <div id="player"></div>
            <script>
              var tag = document.createElement('script');
              tag.src = "https://www.youtube.com/iframe_api";
              var firstScriptTag = document.getElementsByTagName('script')[0];
              firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

              var player;
              function onYouTubeIframeAPIReady() {
                player = new YT.Player('player', {
                  height: '100%',
                  width: '100%',
                  videoId: '$videoId',
                  
                  playerVars: {
                    'autoplay': 1,
                    'controls': 0,
                    'modestbranding': 1,
                    'rel': 0,
                    'playsinline': 1,
                    'mute': 1
                  },
                  events: {
                    'onReady': onPlayerReady
                  }
                });
              }

              function onPlayerReady(event) {
                event.target.playVideo();
              }
            </script>
        </body>
        </html>
    """.trimIndent()

    AndroidView(
        modifier = modifier,
        factory = { context ->
            WebView(context).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                settings.javaScriptEnabled = true
                webChromeClient = WebChromeClient()
                loadDataWithBaseURL(
                    "https://www.youtube.com",
                    html,
                    "text/html",
                    "utf-8",
                    null
                )
            }
        },
        update = { webView ->
            webView.loadDataWithBaseURL(
                "https://www.youtube.com",
                html,
                "text/html",
                "utf-8",
                null
            )
        }
    )

    DisposableEffect(Unit) {
        onDispose {
            // liberar recursos
        }
    }
}
