package com.example.multiidioma.utils

import android.content.Context
import com.example.multiidioma.R

fun buildSvgReplacements(context: Context): Map<String, String> {
    return mapOf(
        "label1" to context.getString(R.string.mi_texto),
        "label2" to context.getString(R.string.otro_texto)
    )
}
