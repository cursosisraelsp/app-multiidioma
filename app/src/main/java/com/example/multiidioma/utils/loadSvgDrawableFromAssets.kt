package com.example.multiidioma.utils

import android.content.Context
import android.graphics.drawable.PictureDrawable
import com.caverock.androidsvg.SVG

fun loadSvgDrawableFromAssets(context: Context, assetName: String, textoTraducido: String): PictureDrawable {
    val svgInput = context.assets.open(assetName)
    var svgString = svgInput.bufferedReader().use { it.readText() }
    svgString = svgString.replace("Hola", textoTraducido)
    val svg = SVG.getFromString(svgString)
    return PictureDrawable(svg.renderToPicture())
}
