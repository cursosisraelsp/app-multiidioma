package com.example.multiidioma.ui.cimus.miniscreens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.LocalizedContext
import com.example.multiidioma.utils.xmlToAnnotatedString

@Composable
fun MiniScreen1(
    data: MiniScreenData,
    modifier: Modifier = Modifier
) {
    // Usa el contexto localizado que ya pusiste en CompositionLocalProvider
    val context = LocalizedContext.current
    //val context = LocalContext.current.setLocale(language)
    Column(modifier = modifier.padding(16.dp)) {


        data.bodyParagraphs.forEach { res ->
            val rawText = runCatching { context.getString(res) }.getOrElse { "???" }
            Text(
                text = xmlToAnnotatedString(rawText,context, R.string.palabra_buscada),
                style = MaterialTheme.typography.bodyMedium
            )
        }

    }
}