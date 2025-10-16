package com.example.multiidioma.utils

import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.PersonResearcher
import com.example.multiidioma.data.types.PersonalResearcher2

fun PersonsResearchersUtils(datosInvestigadores: List<PersonResearcher>): MutableList<PersonalResearcher2> {
    val listaMutable = mutableListOf<PersonalResearcher2>()

    for ((index, investigador) in datosInvestigadores.withIndex()) {
        val investigadorNuevo = PersonalResearcher2(
            id = index.toString(),
            foto = investigador.foto,
            name = investigador.name ?: "",
            info = investigador.info,
            title = investigador.title,
            role = investigador.role,
            contentType = investigador.contentType ?: ContentType.PLANTILLA
        )
        listaMutable.add(investigadorNuevo)
    }
    return listaMutable
}