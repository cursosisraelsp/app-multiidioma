package com.example.multiidioma.ui.components

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun VimeoWebViewComponent(
    videoId: String,
    modifier: Modifier = Modifier
) {
    val videoHtml = """
        <html>
        <body style="margin:0;padding:0;">
            <iframe 
                src="https://player.vimeo.com/video/$videoId?autoplay=1&loop=1&muted=1&background=1" 
                width="100%" height="100%" 
                frameborder="0" 
                allow="autoplay; fullscreen; picture-in-picture" 
                allowfullscreen>
            </iframe>
        </body>
        </html>
    """

    AndroidView(
        modifier = modifier,
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                settings.domStorageEnabled = true
                settings.mediaPlaybackRequiresUserGesture = false // 🚀 Permite autoplay
                webViewClient = WebViewClient()
                loadDataWithBaseURL(
                    null,
                    videoHtml,
                    "text/html",
                    "UTF-8",
                    null
                )
            }
        }
    )
}

