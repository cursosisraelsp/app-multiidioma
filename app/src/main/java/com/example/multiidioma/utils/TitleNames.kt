package com.example.multiidioma.utils

import androidx.navigation.NavBackStackEntry
import com.example.multiidioma.data.TitulosNavegacion

fun TitleNames(ruta : String?,navBackStackEntry: NavBackStackEntry?):String{

    return when(ruta) {

        "detail/{screenId}" -> {
            // Extraemos el screenId de la ruta
            val screenId = navBackStackEntry?.arguments?.getString("screenId")
            // Podrías tener una lógica para buscar el título del ítem aquí
            // Por ahora, usamos el screenId como título
            //screenId ?: "Detalle"
            when (screenId){
                "1" -> TitulosNavegacion.Multimedia.titulo  // Multimedia
                "2" -> TitulosNavegacion.Mapa.titulo// mapa
                "3" -> TitulosNavegacion.InstitusInvestigacion.titulo // Institus de investigacion
                "4" -> TitulosNavegacion.CentroSigular.titulo// centros singulares
                "5" -> TitulosNavegacion.Minerva.titulo// Centros singulares
                else -> "estou noou"
            }
        }
        else -> {
            when(ruta){
                "home" -> "INXENIUS"
                "ciqus" -> "CiQus"
                else -> ruta.toString().uppercase()
            }
        }
    }
}