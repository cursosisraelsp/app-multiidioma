package com.example.multiidioma.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.ui.LocalizedContext

@Composable
fun HomeScreen(onLanguageChange: (String) -> Unit) {
    val context = LocalizedContext.current

    Scaffold { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = context.getString(R.string.greeting),
                style = MaterialTheme.typography.headlineMedium
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { onLanguageChange("es") }) {
                Text(context.getString(R.string.change_language))
            }

            Spacer(modifier = Modifier.height(8.dp))

            Button(onClick = { onLanguageChange("en") }) {
                Text(context.getString(R.string.switch_to_english))
            }
            Spacer(modifier = Modifier.height(8.dp))

            Button(onClick = { onLanguageChange("gl") }) {
                Text(context.getString(R.string.switch_to_galician))
            }
        }
    }
}
