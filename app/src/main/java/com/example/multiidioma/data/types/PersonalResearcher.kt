package com.example.multiidioma.data.types

data class PersonalResearcher(
    val id: String,
    val foto: Int,
    val name: String?,
    val info: List<Int?>,
    val title: Int?,
    val title2: Int? = null,
    val title3: Int? = null,
    val role: Int? = null,
    val role2: Int? = null,
    val ruta: String,
    val contentType: ContentType?
)
data class PersonalResearcher2(
    val id:String,
    val foto:Int,
    val name: String?,
    val info: List<Int?>,
    val title: Int?,
    val role: Int? = null,
    val role2: Int? = null,
    val title2: Int? = null,
    val title3: Int? = null,
    //val info: String,
    val contentType: ContentType?,
){

    val ruta: String
        get() = "detalles/$id"  // se recalcula cada vez que lo accedes
}


data class PersonResearcher(
    val foto: Int,
    val name: String?,
    val title: Int?,
    val title2: Int? = null,
    val title3: Int? = null,
    val role: Int? = null,
    val role2: Int? = null,
    val info: List<Int>,
    val contentType: ContentType
)