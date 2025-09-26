package com.example.multiidioma.utils

import com.example.multiidioma.data.types.PersonalResearcher
import com.example.multiidioma.data.types.PersonalResearcher2

fun GetPersonalResearcher(personal :  MutableList<PersonalResearcher2>): List<PersonalResearcher>{
    val lista1: List<PersonalResearcher> = personal.map{ investigador ->
        PersonalResearcher(
            id = investigador.id,
            foto = investigador.foto,
            name = investigador.name,
            info = investigador.info,
            ruta = investigador.ruta,
            contentType = investigador.contentType
        )

    }
    return lista1

}