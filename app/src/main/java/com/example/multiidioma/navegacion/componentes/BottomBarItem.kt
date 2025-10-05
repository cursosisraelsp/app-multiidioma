package com.example.multiidioma.navegacion.componentes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.accentColor
import com.example.multiidioma.data.whiteColor

// No necesitas isSelected en este composable. Lo manejará el composable padre.
@Composable
fun BottomBarItem(
    navController: NavController,
    imageVector: ImageVector,
    ruta: Destination,
    label: String,
    isSelected: Boolean // Parámetro para saber si está seleccionado
) {
    // Usamos una Column para apilar el icono y el texto
    Column(
        modifier = Modifier
            .clickable {
                // Navegamos y actualizamos el estado en el composable padre
                navController.navigate(ruta.route)
            }
            .padding(vertical = 8.dp, horizontal = 12.dp), // Añadimos padding para espacio
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = imageVector,
            contentDescription = label,
            tint = if (isSelected) accentColor else whiteColor,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.height(4.dp)) // Espacio entre el icono y el texto
        Text(
            text = label,
            fontSize = if(isSelected) 16.sp else 12.sp,
            fontWeight = if(isSelected) FontWeight.Bold else  FontWeight.Normal,
            color = if (isSelected) accentColor  else whiteColor
        )
    }
}