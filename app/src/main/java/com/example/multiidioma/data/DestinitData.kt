package com.example.multiidioma.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

enum class TitulosNavegacion(val titulo:String){
    CentroSigular("Centros Singulares"),
    InstitusInvestigacion("Institutos de investigacion"),
    Mapa("Mapa"),
    Minerva("Proxecto minerva"),
    Multimedia("Multimedia")
}
sealed class Destination(val route: String) {
    // Rutas sin argumentos
    object Start : Destination("start")
    object Home : Destination("home")
    object Cimus : Destination("cimus")

    // Rutas en enum
    enum class RutasBottomBar (
        val route: String,
        val label: String,
        val icon: ImageVector?,
        val contentDescription: String?
    ) {
        //DETAIL("detail/{screenId}","Detail",null,null),
        HOME("home", "Homes", Icons.Default.Home, "Homes"),

        SETTINGS("settings", "Settings", Icons.Default.Settings, "Settings")
    }
    // Ruta de detalle con un argumento.
    object Detail : Destination("detail/{screenId}")

    companion object {
        // Esta función crea la ruta específica para navegar.
        fun createDetailRoute(screenId: String) = "detail/$screenId"
    }
}