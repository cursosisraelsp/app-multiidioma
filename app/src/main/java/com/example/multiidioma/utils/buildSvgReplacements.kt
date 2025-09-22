package com.example.multiidioma.utils

import android.content.Context
import com.example.multiidioma.R
// R.string.mi_texto R.string.otro_texto
//
fun buildSvgReplacements(context: Context,texto1: Int,texto2: Int): Map<String, String> {
    return mapOf(
        "label1" to context.getString(texto1),
        "label2" to context.getString(texto2)
    )
}
