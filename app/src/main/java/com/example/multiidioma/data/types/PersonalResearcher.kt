package com.example.multiidioma.data.types

data class PersonalResearcher(
    val id:String,
    val foto:Int,
    val name: String?,
    val info: List<Int?>,
    //val info: String?,
    val ruta:String,
    val contentType: ContentType?,
)


data class PersonalResearcher2(
    val id:String,
    val foto:Int,
    val name: String?,
    val info: List<Int?>,
    //val info: String,
    val contentType: ContentType?,
){

    val ruta: String
        get() = "detalles/$id"  // se recalcula cada vez que lo accedes
}


/*data class PersonalResearcher2(
    val id: String,
    val foto: Int,
    val name: String?,
    val info: List<Int?>,
    val contentType: ContentType?,
) {
    fun ruta(centro: String): String {
        return "detalles/$centro/$id"
    }
}*/

data class PersonResearcher(
    val foto:Int,
    val name: String?,
    val info: List<Int?>,
    //val info: String?,
    val contentType: ContentType?
)