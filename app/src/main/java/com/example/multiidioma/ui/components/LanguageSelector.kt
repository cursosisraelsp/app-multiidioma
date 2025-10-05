package com.example.multiidioma.ui.components


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.viewmodel.LanguageViewModel

@Composable
fun LanguageSelector(languageViewModel: LanguageViewModel) {

    var expanded by rememberSaveable { mutableStateOf(false) }
    val languages = listOf(
        "en" to "English",
        "es" to "Español",
        "gl" to "Galego"
    )
    var selected by rememberSaveable { mutableStateOf(languages[0]) }

    Box(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        OutlinedTextField(
            value = selected.second,
            onValueChange = {},
            readOnly = true,
            label = { Text(languageViewModel.getString(R.string.app_name)) },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    Modifier.clickable { expanded = !expanded }
                )
            },
            modifier = Modifier.fillMaxWidth()
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.fillMaxWidth()
        ) {
            languages.forEach { lang ->
                DropdownMenuItem(
                    text = { Text(lang.second) },
                    onClick = {
                        selected = lang
                        languageViewModel.setLanguage(lang.first)
                        expanded = false
                    }
                )
            }
        }
    }
}
