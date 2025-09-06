package com.example.multiidioma.navegacion.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.multiidioma.data.Destination

@Composable
fun ToggableIconButton(
    navController: NavHostController,
    imageVector: ImageVector,
    ruta: Destination,
    label: String) {
    var isSelected by remember { mutableStateOf(false) }

    IconButton(
        onClick = {
            isSelected = !isSelected
            navController.navigate(ruta)
        }
    ) {
       Column {
           Icon(
               imageVector = imageVector,
               contentDescription = label,
               tint = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface,
               modifier = Modifier.size(24.dp)
           )
           Text(
               text = label,
               fontSize = 12.sp,
               color = if (isSelected) MaterialTheme.colorScheme.tertiary else Color.White
           )
       }

    }
}


