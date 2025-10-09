package com.example.multiidioma

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity

import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.multiidioma.ui.MyApp
import com.example.multiidioma.ui.screens.mapa.MapScreen
import com.example.multiidioma.viewmodel.LanguageViewModel

import android.webkit.WebView
import android.webkit.WebViewClient

import androidx.compose.ui.Modifier

import androidx.compose.ui.viewinterop.AndroidView
import android.webkit.WebChromeClient
import com.example.multiidioma.ui.components.VimeoWebViewComponent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val languageViewModel: LanguageViewModel = viewModel()
            MyApp(languageViewModel)
            //MapScreen()
            //AbrirUnity()
            //AbrirUnityConLoader()
            //BotonAbrirUnity()
            //BotonAbrirFakeCameraActivityUnity()
            //VimeoWebView(videoUrl = "https://player.vimeo.com/video/1124127714?loop=1&autoplay=1&muted=1")
            //val INCIFOR_VC= "1124127714"
            //VimeoWebViewComponent(videoUrl = "https://player.vimeo.com/video/$INCIFOR_VC?loop=1&autoplay=1&muted=1", height = "800px", width = "400px")
        }
    }
}





/*
@Composable
fun VimeoWebView(videoUrl: String, modifier: Modifier = Modifier) {
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
                    src="$videoUrl" 
                    width="400px" 
                    height="800px" 
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
*/

