package com.example.multiidioma.utils

import android.graphics.drawable.PictureDrawable
import com.caverock.androidsvg.SVG
import java.io.InputStream

fun loadSvgDrawableFromInputStream(inputStream: InputStream, textoTraducido: String): PictureDrawable {
    var svgString = inputStream.bufferedReader().use { it.readText() }
    svgString = svgString.replace("Hola", textoTraducido)
    val svg = SVG.getFromString(svgString)
    return PictureDrawable(svg.renderToPicture())
}
