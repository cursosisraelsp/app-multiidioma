package com.example.multiidioma.ui.components


import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView



@Composable
fun VimeoWebViewComponent(identificador: String, modifier: Modifier = Modifier,width: String,height : String) {
    Box(modifier = Modifier){
        AndroidView(
            factory = { context ->
                WebView(context).apply {
                    settings.javaScriptEnabled = true
                    settings.domStorageEnabled = true
                    webViewClient = WebViewClient()
                    webChromeClient = WebChromeClient()
                }
            },
            modifier = modifier
        ) { webView ->
            // Carga el embed de Vimeo
            val html = """
            <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
           
            <body style="margin:0;padding:0;">
                <iframe 
                    src="https://player.vimeo.com/video/$identificador?loop=1&autoplay=1&muted=1" 
                    width="$width" 
                    height="$height" 
                    frameborder="0" 
                    allow="autoplay; fullscreen; picture-in-picture" 
                    allowfullscreen>
                </iframe>
            </body>
            </html>
        """
            webView.loadData(html, "text/html", "utf-8")
        }
    }

}



