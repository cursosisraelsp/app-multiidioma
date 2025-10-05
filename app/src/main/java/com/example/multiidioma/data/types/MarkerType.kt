package com.example.multiidioma.data.types

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.multiidioma.R

enum class MarkerType(
    @StringRes val title: Int,
    @DrawableRes val selectedIcon: Int,

) {

    CENTROS_SINGULARES(
        title = R.string.centros_singulares,
        selectedIcon = R.drawable.novo_marcador_svg_azul,

    ),
    INSTITUTOS_INVESTIGACION(
        title = R.string.institutos_investigacion,
        //selectedIcon = Icons.Filled.Place,
        selectedIcon = R.drawable.novo_marcador_svg_rojo,

    ),

    INSTITUTOS_e_CENTROS(
        title = R.string.institutosEcentros,
        //selectedIcon = Icons.Filled.Place,
        selectedIcon = R.drawable.novo_marcador_svg_rojo,


    )

}