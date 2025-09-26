package com.example.multiidioma.data.repository

import com.example.multiidioma.data.types.PersonalResearcher
import com.example.multiidioma.ui.screens.institutes.incifor.datosInvestigadores
import com.example.multiidioma.utils.PersonsResearchersUtils
import kotlinx.coroutines.delay


class InfoResearchersRepository(){

   private val infoReaseachersIncifor = InciforRepository()

   suspend fun infoReaseachersIncifor() : List<PersonalResearcher>{
       // Simulación de delay si en el futuro viene de una API/DB
       delay(200)
       return infoReaseachersIncifor.getPersonalResearcher(PersonsResearchersUtils(datosInvestigadores))
   }
}