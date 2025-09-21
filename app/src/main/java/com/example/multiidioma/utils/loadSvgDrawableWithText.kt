package com.example.multiidioma.utils

import android.content.Context
import android.graphics.drawable.PictureDrawable
import com.caverock.androidsvg.SVG
import com.example.multiidioma.R

// 🔹 Función para reemplazar textos en SVG por id
fun replaceSvgText(svgString: String, replacements: Map<String, String>): String {
    var result = svgString
    for ((id, newText) in replacements) {
        result = result.replace(
            Regex("""(<text[^>]*id="$id"[^>]*>)(.*?)(</text>)""", RegexOption.DOT_MATCHES_ALL),
            "$1$newText$3"
        )
    }
    return result
}

// 🔹 Función que carga el SVG desde raw y devuelve un PictureDrawable
suspend fun loadSvgDrawableWithReplacements(
    context: Context,
    rawResId: Int,
    replacements: Map<String, String>
): PictureDrawable {
    val svgString = context.resources.openRawResource(rawResId).bufferedReader().use { it.readText() }
    val updatedSvg = replaceSvgText(svgString, replacements)
    val svg = SVG.getFromString(updatedSvg)
    return PictureDrawable(svg.renderToPicture())
}

/*
* val updatedSvg = replaceSvgText(svgString, mapOf(
    "label1" to context.getString(R.string.mi_texto),
    "label2" to "Otro texto"
))

* */