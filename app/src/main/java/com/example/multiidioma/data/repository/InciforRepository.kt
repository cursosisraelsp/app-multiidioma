package com.example.multiidioma.data.repository


import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.example.multiidioma.R
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.PersonalResearcher

import com.example.multiidioma.data.types.PersonalResearcher2
import com.example.multiidioma.ui.screens.institutes.incifor.aclIncifor
import com.example.multiidioma.ui.screens.institutes.incifor.ambbIncifor
import com.example.multiidioma.ui.screens.institutes.incifor.jimbIncifor
import com.example.multiidioma.ui.screens.institutes.incifor.mvlhIncifor




fun persoasInvestigadoras() :
        MutableList<PersonalResearcher2>{
    val listaMutable = mutableListOf<PersonalResearcher2>()

    val datosInvestigadores = listOf(mvlhIncifor, ambbIncifor, jimbIncifor, aclIncifor)
    for ((index, investigador) in datosInvestigadores.withIndex()) {
        val investigadorNuevo = PersonalResearcher2(
            id = index.toString(),
            foto = investigador.foto,
            name = investigador.name ?: "",
            info = investigador.info ?: listOf(""),
            contentType = investigador.contentType ?: ContentType.MINISCREEN27
        )
        listaMutable.add(investigadorNuevo)
    }
    return listaMutable
}





class InciforRepository {

    fun getMiniScreens(): List<MiniScreenData> {

        return listOf(
            MiniScreenData(
                id = 0,

                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_0_paragraph0
                ),
            ),
            MiniScreenData(
                id = 1,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_1_paragraph0,
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_2_paragraph0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 3,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_3_paragraph0
                ),
                imageRes = R.drawable.incifor_img_01_c
            ),
            MiniScreenData(
                id = 4,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_4_paragraph0
                ),
                imageRes = R.drawable.incifor_img_01_d
            ),
            MiniScreenData(
                id = 5,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_5_paragraph0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 6,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_6_paragraph0
                ),
                imageRes = R.drawable.incifor_img_02
            ),
            MiniScreenData(
                id = 7,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_7_paragraph0
                ),
                imageRes =
                    R.drawable.noimagen
            ),
            MiniScreenData(
                id = 8,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_8_paragraph0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 9,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_9_paragraph0
                ),
                imageRes = R.drawable.noimagen
            ),

            MiniScreenData(
                id = 10,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_10_paragraph0,
                    R.string.II_INCIFOR_miniscreen_10_paragraph1,
                    R.string.II_INCIFOR_miniscreen_10_paragraph2
                ),
            ),
            MiniScreenData(
                id = 11,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_11_paragraph0,
                ),
                imageRes = R.drawable.noimagen
            ),

            MiniScreenData(
                id = 12,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_12_paragraph0,
                ),
                imageRes = R.drawable.incifor_img_03
            ),
            MiniScreenData(
                id = 13,
            ),
            MiniScreenData(
                id = 14,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_14_title0,
                    R.string.II_INCIFOR_miniscreen_14_title1,
                    R.string.II_INCIFOR_miniscreen_14_paragraph0,
                ),
                imageRes = R.drawable.incifor_img_04
            ),
            MiniScreenData(
                id = 15,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_15_title0,
                    R.string.II_INCIFOR_miniscreen_15_title1,
                    R.string.II_INCIFOR_miniscreen_15_paragraph0,
                ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 16,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_16_title0,
                    R.string.II_INCIFOR_miniscreen_16_title1,
                    R.string.II_INCIFOR_miniscreen_16_paragraph0,
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 17,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_17_title0,
                    R.string.II_INCIFOR_miniscreen_17_title1,
                    R.string.II_INCIFOR_miniscreen_17_paragraph0,
                ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 18,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_18_title0,
                    R.string.II_INCIFOR_miniscreen_18_paragraph0,
                ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 19,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_19_title0,
                    R.string.II_INCIFOR_miniscreen_19_paragraph0,
                    R.string.II_INCIFOR_miniscreen_19_paragraph1
                ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 20,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_20_paragraph0,
                    R.string.II_INCIFOR_miniscreen_20_paragraph1,
                    R.string.II_INCIFOR_miniscreen_20_paragraph2,
                ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 21,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_21_title0,
                    R.string.II_INCIFOR_miniscreen_21_paragraph0,
                    R.string.II_INCIFOR_miniscreen_21_paragraph1,

                    ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 22,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_22_title0,
                    R.string.II_INCIFOR_miniscreen_22_paragraph0,


                    ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 23,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_23_title0,
                    R.string.II_INCIFOR_miniscreen_23_paragraph0,


                    ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 24,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_24_paragraph0,


                    ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 25,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_25_paragraph0
                ),
                imageRes = R.drawable.incifor_img_01_d
            ),
            MiniScreenData(
                id = 26,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_26_paragraph0,
                    R.string.II_INCIFOR_miniscreen_26_paragraph1
                ),
                imageRes = R.drawable.incifor_img_01_d,
                personalResearcher = getPersonalResearcher()

            )


            )
    }

    fun getPersonalResearcher(): List<PersonalResearcher>{
        val personal = persoasInvestigadoras()
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
    fun getData(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }

    fun getDataResearcher(i: Int): PersonalResearcher{
        return getPersonalResearcher()[i]
    }
}
