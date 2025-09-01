package com.example.multiidioma.utils

import android.content.Context
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.text.SpanStyle


import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.graphics.Color


fun xmlToAnnotatedString(
    rawText: String,
    context: Context,
    oString: Int
): AnnotatedString {


    return buildAnnotatedString {
        val highlightWord = context.getString(oString)
        val startIndex = rawText.indexOf(highlightWord)

        if (startIndex != -1) {
            append(rawText.substring(0, startIndex)) // antes de la palabra

            withStyle(
                style = SpanStyle(
                    color = Color(0xFFF59127),
                    fontWeight = FontWeight.Bold
                )
            ) {
                append(highlightWord)
            }

            append(rawText.substring(startIndex + highlightWord.length)) // resto del texto
        } else {
            append(rawText) // si no existe la palabra, se imprime normal
        }
    }
}



