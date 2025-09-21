package com.example.multiidioma.utils


import android.content.Context
import android.graphics.drawable.PictureDrawable
import android.widget.ImageView
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@Composable
fun SvgImageComposable(
    context: Context,
    rawResId: Int,
    modifier: Modifier = Modifier,
    textos: Map<String, String>
) {
    //val replacements = remember { buildSvgReplacements(context) }
    val drawable by produceState<PictureDrawable?>(initialValue = null, textos) {
        value = withContext(Dispatchers.IO) {
            loadSvgDrawableWithReplacements(context, rawResId, textos)
        }
    }

    drawable?.let { d ->
        AndroidView(
            factory = { ctx ->
                ImageView(ctx).apply {
                    setLayerType(ImageView.LAYER_TYPE_SOFTWARE, null) // evita crash con PictureDrawable
                    setImageDrawable(d)
                }
            },
            modifier = modifier
        )
    }
}


/*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import android.widget.ImageView
import android.content.Context

@Composable
fun SvgImageComposable(context: Context, texto: String, modifier: Modifier = Modifier) {
    val drawable = loadSvgDrawableFromAssets(context, "mi_svg.svg", texto)

    AndroidView(
        factory = { ctx ->
            ImageView(ctx).apply {
                setLayerType(ImageView.LAYER_TYPE_SOFTWARE, null) // 🔹 Importante
                setImageDrawable(drawable)
            }
        },
        modifier = modifier
    )
}
*/