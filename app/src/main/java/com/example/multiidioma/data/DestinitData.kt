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
    object Settings : Destination("settings")
    object Home : Destination("home")
    object Minerva : Destination("minerva")
    object Mapa : Destination("mapa")
    object Multimedia : Destination("multimedia")
    object Institutos : Destination("institutos")
    object CentrosSingulares : Destination("centrossingulares")
    // INSTITUTOS
    object Ihus : Destination("ihus")
    object Idega : Destination("idega")
    object Ice : Destination("ice")
    object Incifor : Destination("incifor")
    object Ipsius : Destination("ipsius")
    object Ilg : Destination("ilg")
    object Imatus : Destination("imatus")
    object Iarcus : Destination("iarcus")
    object Idis : Destination("idis")
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

    //Miniscreens - cimus
    object CimusMiniScreen9 : Destination("CimusMiniScreen9")
    object CimusMiniScreen10 : Destination("CimusMiniScreen10")
    object CimusMiniScreen11 : Destination("CimusMiniScreen11")
    object CimusMiniScreen12 : Destination("CimusMiniScreen12")
    object CimusMiniScreen14 : Destination("CimusMiniScreen14")
    object CimusMiniScreen15 : Destination("CimusMiniScreen15")
    object CimusMiniScreen16 : Destination("CimusMiniScreen16")
    object CimusMiniScreen17 : Destination("CimusMiniScreen17")

    object IpsiusMiniscreen7 : Destination("IpsiusMiniScreen7")
    object IpsiusMiniscreen8 : Destination("IpsiusMiniScreen8")
    object IpsiusMiniscreen9 : Destination("IpsiusMiniScreen9")
    object IpsiusMiniscreen10 : Destination("IpsiusMiniScreen10")
    object IpsiusMiniscreen11 : Destination("IpsiusMiniScreen11")
    object IpsiusMiniscreen12 : Destination("IpsiusMiniScreen12")
    object IpsiusMiniscreen13 : Destination("IpsiusMiniScreen13")

    object CretusMiniscreen9 : Destination("CretusMiniScreen9")
    object CretusMiniscreen10 : Destination("CretusMiniScreen10")
    object CretusMiniscreen11 : Destination("CretusMiniScreen11")
    object CretusMiniscreen12 : Destination("CretusMiniScreen12")
    object CretusMiniscreen13 : Destination("CretusMiniScreen13")
    object CretusMiniscreen14 : Destination("CretusMiniScreen14")
    object CretusMiniscreen15 : Destination("CretusMiniScreen15")
    object CretusMiniscreen16 : Destination("CretusMiniScreen16")

    object IgfaeMiniscreen7 : Destination("IgfaeMiniScreen7")
    object IgfaeMiniscreen8 : Destination("IgfaeMiniScreen8")
    object IgfaeMiniscreen9 : Destination("IgfaeMiniScreen9")
    object IgfaeMiniscreen11 : Destination("IgfaeMiniScreen11")
    object IgfaeMiniscreen12 : Destination("IgfaeMiniScreen12")
    object IgfaeMiniscreen13 : Destination("IgfaeMiniScreen13")
    object IgfaeMiniscreen15 : Destination("IgfaeMiniScreen15")
    object IgfaeMiniscreen16 : Destination("IgfaeMiniScreen16")

    object IarcusMiniscreen8 : Destination("IarcusMiniScreen8")
    object IarcusMiniscreen9 : Destination("IarcusMiniScreen9")
    object IarcusMiniscreen10 : Destination("IarcusMiniScreen10")
    object IarcusMiniscreen11 : Destination("IarcusMiniScreen11")

    //miniscreens row de investigadores

    object IpsiusMiniscreen19 : Destination("IpsiusMiniScreen19")
    object CretusMiniscreen22 : Destination("CretusMiniScreen22")
    object IarcusMiniscreen16 : Destination("IarcusMiniScreen16")
    object IgfaeMiniscreen23 : Destination("IgfaeMiniScreen23")


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