package com.example.multiidioma.ui.components.Templates

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.valoresPlantillaScreen

@Composable
fun PlantillaScreen(
    data: MiniScreenData,
    BoxWeight: BOX = valoresPlantillaScreen, // Usamos valores predeterminados para el peso de las cajas
    Box1: (@Composable (MiniScreenData) -> Unit)? = null,
    Box2: (@Composable (MiniScreenData) -> Unit)? = null,
    Box3: (@Composable (MiniScreenData) -> Unit)? = null
) {
    Column(modifier = Modifier.fillMaxSize()) {

        // Box1
        if (Box1 != null && BoxWeight.Box1 > 0f) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                //.weight(BoxWeight.Box1) // Puedes activar este si quieres usar weight
            ) {
                Box1(data)  // Solo se ejecutará si Box1 no es nulo
            }
        }

        // Box2
        if (Box2 != null && BoxWeight.Box2 > 0f) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                //.weight(BoxWeight.Box2) // Igualmente puedes activar este si quieres usar weight
            ) {
                Box2(data)  // Solo se ejecutará si Box2 no es nulo
            }
        }

        // Box3
        if (Box3 != null && BoxWeight.Box3 > 0f) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                //.weight(BoxWeight.Box3) // Puedes activar este si quieres usar weight
            ) {
                Box3(data)  // Solo se ejecutará si Box3 no es nulo
            }
        }
    }
}
