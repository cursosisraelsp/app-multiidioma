package com.example.multiidioma.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

enum class TitulosNavegacion(val titulo: String) {
    CentroSigular("Centros Singulares"),
    InstitusInvestigacion("Institutos de investigacion"),
    Mapa("Mapa"),
    Minerva("Proxecto minerva"),
    Multimedia("Multimedia")
}

sealed class Destination(val route: String) {
    // Rutas sin argumentos
    object Start : Destination("start")
    object Settings : Destination("settings")
    object Home : Destination("home")
    object Minerva : Destination("minerva")
    object Mapa : Destination("mapa")

    // INSTITUTOS
    object Ihus : Destination("ihus")
    object Idega : Destination("idega")
    object Ice : Destination("ice")
    object Incifor : Destination("incifor")

    //Miniscreens - incifor
    object InciforMiniscreen14 : Destination("InciforMiniscreen14")
    object InciforMiniscreen15 : Destination("InciforMiniscreen15")
    object InciforMiniscreen16 : Destination("InciforMiniscreen16")
    object InciforMiniscreen17 : Destination("InciforMiniscreen17")
    object InciforMiniscreen18 : Destination("InciforMiniscreen18")
    object InciforMiniscreen27 : Destination("InciforMiniscreen27")

    //Miniscreens - citius
    object CitiusMiniScreen6 : Destination("CitiusMiniScreen6")
    object CitiusMiniScreen7 : Destination("CitiusMiniScreen7")
    object CitiusMiniScreen8 : Destination("CitiusMiniScreen8")
    object CitiusMiniScreen9 : Destination("CitiusMiniScreen9")
    object CitiusMiniScreen10 : Destination("CitiusMiniScreen10")
    object CitiusMiniScreen11 : Destination("CitiusMiniScreen11")

    //Miniscreens - imatus
    object ImatusMiniScreen5 : Destination("ImatusMiniScreen5")
    object ImatusMiniScreen6 : Destination("ImatusMiniScreen6")
    object ImatusMiniScreen7 : Destination("ImatusMiniScreen7")

    //Miniscreens - ice
    object IceMiniScreen7 : Destination("IceMiniScreen7")
    object IceMiniScreen8 : Destination("IceMiniScreen8")
    object IceMiniScreen9 : Destination("IceMiniScreen9")
    object IceMiniScreen10 : Destination("IceMiniScreen10")
    object IceMiniScreen11 : Destination("IceMiniScreen11")
    object IceMiniScreen12 : Destination("IceMiniScreen12")
    object IceMiniScreen13 : Destination("IceMiniScreen13")


    object Imatus : Destination("imatus")
    object Ilg : Destination("ilg")

    // CENTROS
    object Cimus : Destination("cimus")
    object Ciqus : Destination("ciqus")
    object Citius : Destination("citius")
    object Cretus : Destination("cretus")
    object Igfae : Destination("igfae")

    // Rutas en enum
    enum class RutasBottomBar(
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