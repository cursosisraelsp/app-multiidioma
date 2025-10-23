package com.example.multiidioma.data.repository

import com.example.multiidioma.data.types.PersonalResearcher
import com.example.multiidioma.ui.screens.centros.citius.datosInvestigadoresCitius
import com.example.multiidioma.ui.screens.centros.cretus_andre.datosInvestigadoresCretus
import com.example.multiidioma.ui.screens.centros.igfae_andre.datosInvestigadoresIgfae
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.datosInvestigadoresIarcus
import com.example.multiidioma.ui.screens.institutes.imatus.datosInvestigadoresImatus
import com.example.multiidioma.ui.screens.institutes.incifor.datosInvestigadoresIncifor
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.datosInvestigadoresIpsius
import com.example.multiidioma.utils.GetPersonalResearcherUtils
import com.example.multiidioma.utils.PersonsResearchersUtils
import kotlinx.coroutines.delay


class InfoResearchersRepository(){

    private val infoReaseachersIpsius = IpsiusRepository()

    suspend fun infoReaseachersIpsius(): List<PersonalResearcher> {
        // Simulación de delay si en el futuro viene de una API/DB
        delay(200)
        return GetPersonalResearcherUtils(PersonsResearchersUtils(datosInvestigadoresIpsius))

    }
    suspend fun infoReaseachersIgfae(): List<PersonalResearcher> {
        // Simulación de delay si en el futuro viene de una API/DB
        delay(200)
        return GetPersonalResearcherUtils(PersonsResearchersUtils(datosInvestigadoresIgfae))

    }
    suspend fun infoReaseachersIarcus(): List<PersonalResearcher> {
        // Simulación de delay si en el futuro viene de una API/DB
        delay(200)
        return GetPersonalResearcherUtils(PersonsResearchersUtils(datosInvestigadoresIarcus))

    }
    suspend fun infoReaseachersCretus(): List<PersonalResearcher> {
        // Simulación de delay si en el futuro viene de una API/DB
        delay(200)
        return GetPersonalResearcherUtils(PersonsResearchersUtils(datosInvestigadoresCretus))

    }

    suspend fun infoReaseachersIncifor() : List<PersonalResearcher>{
        // Simulación de delay si en el futuro viene de una API/DB
        delay(200)
        return GetPersonalResearcherUtils(PersonsResearchersUtils(datosInvestigadoresIncifor))

    }

   suspend fun infoReaseachersImatus() : List<PersonalResearcher>{
        // Simulación de delay si en el futuro viene de una API/DB
        delay(200)
        return GetPersonalResearcherUtils(PersonsResearchersUtils(datosInvestigadoresImatus))

    }
    suspend fun infoReaseachersCitius() : List<PersonalResearcher>{
        // Simulación de delay si en el futuro viene de una API/DB
        delay(200)
        return GetPersonalResearcherUtils(PersonsResearchersUtils(datosInvestigadoresCitius))

    }


}