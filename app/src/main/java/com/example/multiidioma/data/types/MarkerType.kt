package com.example.multiidioma.data.types

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.outlined.Place
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.multiidioma.R

enum class MarkerType(
    @StringRes val title: Int,
    //val selectedIcon: ImageVector,
    @DrawableRes val selectedIcon: Int,

) {

    CENTROS_SINGULARES(
        title = R.string.centros_singulares,
        selectedIcon = R.drawable.marcador_de_posicion_rojo,

    ),
    INSTITUTOS_INVESTIGACION(
        title = R.string.institutos_investigacion,
        //selectedIcon = Icons.Filled.Place,
        selectedIcon = R.drawable.marcador_de_posicion_azul,

    ),

    INSTITUTOS_e_CENTROS(
        title = R.string.institutosEcentros,
        //selectedIcon = Icons.Filled.Place,
        selectedIcon = R.drawable.marcador_de_posicion_azul,


    )

}