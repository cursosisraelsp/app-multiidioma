package com.example.multiidioma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.multiidioma.ui.MyApp
import com.example.multiidioma.viewmodel.LanguageViewModel

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

