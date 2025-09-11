package com.example.multiidioma.data.types

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.outlined.Place
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.multiidioma.R

enum class MarkerType(
    @StringRes val title: Int,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val selectedTint: Color,
) {

    CENTROS_SINGULARES(
        title = R.string.centros_singulares,
        selectedIcon = Icons.Filled.Place,
        unselectedIcon = Icons.Outlined.Place,
        selectedTint = Color.Red
    ),
    INSTITUTOS_INVESTIGACION(
        title = R.string.institutos_investigacion,
        selectedIcon = Icons.Filled.Place,
        unselectedIcon = Icons.Outlined.Place,
        selectedTint = Color.Green
    ),

    INSTITUTOS_e_CENTROS(
        title = R.string.institutosEcentros,
        selectedIcon = Icons.Filled.Place,
        unselectedIcon = Icons.Outlined.Place,
        selectedTint = Color.Green
    )

}