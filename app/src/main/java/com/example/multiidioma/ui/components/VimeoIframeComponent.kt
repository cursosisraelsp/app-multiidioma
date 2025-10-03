package com.example.multiidioma.ui.components

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun VimeoIframeComponent(
    modifier: Modifier = Modifier
) {
    val videoHtml = """
        <!DOCTYPE html>
        <html>
          <head>
            <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
            <style>html,body,iframe{margin:0;padding:0;height:100%;width:100%;}</style>
          </head>
          <body>
            <iframe 
                title="vimeo-player"
                src="https://player.vimeo.com/video/1124127714?h=b7bd5dec91&autoplay=1&loop=1&muted=1"
                width="100%" height="100%"
                frameborder="0"
                referrerpolicy="strict-origin-when-cross-origin"
                allow="autoplay; fullscreen; picture-in-picture; clipboard-write; encrypted-media; web-share"
                allowfullscreen>
            </iframe>
          </body>
        </html>
    """.trimIndent()

    AndroidView(
        modifier = modifier,
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                settings.domStorageEnabled = true
                settings.mediaPlaybackRequiresUserGesture = false // permite autoplay
                webViewClient = WebViewClient()
                loadDataWithBaseURL(
                    "https://player.vimeo.com",
                    videoHtml,
                    "text/html",
                    "UTF-8",
                    null
                )
            }
        }
    )
}
