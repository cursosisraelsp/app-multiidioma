package com.example.multiidioma.navegacion.componentes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun PressableIconButton(navController: NavHostController) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    Icon(
        imageVector = Icons.Default.Home,
        contentDescription = "Home",
        tint = if (isPressed) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface,
        modifier = Modifier.clickable(
            interactionSource = interactionSource,
            indication = null // Opcional: elimina el efecto de ripple
        ) {
            // Acción al hacer clic
        }
    )
}