package com.example.multiidioma.data.repository


import com.example.multiidioma.R
import com.example.multiidioma.data.centroCitius
import com.example.multiidioma.data.imaxesPNG
import com.example.multiidioma.data.imaxesWEBP
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlRecursosApp
import com.example.multiidioma.ui.screens.centros.citius.datosInvestigadoresCitius
import com.example.multiidioma.utils.GetPersonalResearcherUtils
import com.example.multiidioma.utils.PersonsResearchersUtils

class CitiusRepository {

    fun getMiniScreens(): List<MiniScreenData> {
        return listOf(
            MiniScreenData(
                id = 0,

                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_0_paragraph_0
                ),
            ),
            MiniScreenData(
                id = 1,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_1_paragraph_0,
                ),
                //imageRes = R.drawable.citius_img_1
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroCitius/citius_img_1.webp"
            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_2_paragraph_0
                ),
                //imageRes = R.drawable.citius_img_02
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroCitius/citius_img_2.webp"
            ),
            MiniScreenData(
                id = 3,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_3_paragraph_0,
                    R.string.CS_CITIUS_miniscreen_3_paragraph_1
                ),
                //imageRes = R.drawable.citius_img_03
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroCitius/citius_img_3.webp"
            ),
            MiniScreenData(
                id = 4,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_4_paragraph_0,
                    R.string.CS_CITIUS_miniscreen_4_paragraph_1
                ),
            ),
            MiniScreenData(
                id = 5,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_5_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 6,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_6_title_0,
                    R.string.CS_CITIUS_miniscreen_6_paragraph_0,
                    R.string.CS_CITIUS_miniscreen_6_paragraph_1
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 7,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_7_title_0,
                    R.string.CS_CITIUS_miniscreen_7_paragraph_0,
                    R.string.CS_CITIUS_miniscreen_7_paragraph_1
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
                ),
            MiniScreenData(
                id = 8,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_8_title_0,
                    R.string.CS_CITIUS_miniscreen_8_paragraph_0,
                    R.string.CS_CITIUS_miniscreen_8_paragraph_1
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 9,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_9_title_0,
                    R.string.CS_CITIUS_miniscreen_9_paragraph_0,
                    R.string.CS_CITIUS_miniscreen_9_paragraph_1
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),

            MiniScreenData(
                id = 10,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_10_title_0,
                    R.string.CS_CITIUS_miniscreen_10_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 11,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_11_paragraph_0,
                ),
                //imageRes = R.drawable.citius_img_10
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroCitius/citius_img_10.webp"
            ),

            MiniScreenData(
                id = 12,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_12_paragraph_0,
                    R.string.CS_CITIUS_miniscreen_12_paragraph_1,
                ),

                ),
            MiniScreenData(
                id = 13,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_13_title_0,
                    R.string.CS_CITIUS_miniscreen_13_paragraph_0,

                    ),

                //imageRes = R.drawable.citius_img_11
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroCitius/citius_img_11.webp"
            ),


            MiniScreenData(
                id = 14,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_14_title_0,
                    R.string.CS_CITIUS_miniscreen_14_paragraph_0,
                ),

                //imageRes = R.drawable.citius_img_12
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroCitius/citius_img_12.webp"
            ),
            MiniScreenData(
                id = 15,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_15_title_0,
                    R.string.CS_CITIUS_miniscreen_15_paragraph_0,
                ),
                //imageRes = R.drawable.citius_img_13
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroCitius/citius_img_13.webp"

            ),
            MiniScreenData(
                id = 16,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_16_title_0,

                    ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 17,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_17_title_0,
                    R.string.CS_CITIUS_miniscreen_17_title_1,
                    R.string.CS_CITIUS_miniscreen_17_paragraph_0,
                ),
                personalResearcher = GetPersonalResearcherUtils(
                    PersonsResearchersUtils(
                        datosInvestigadoresCitius
                    )
                )
                ),
            MiniScreenData(
                id = 18,
                personalResearcher = GetPersonalResearcherUtils(
                    PersonsResearchersUtils(
                        datosInvestigadoresCitius
                    )
                )

            ),
            MiniScreenData(
                id = 26,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_26_paragraph_0,
                    R.string.CS_CITIUS_miniscreen_26_title_0,
                ),


                ),
        )
    }

    fun getData(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }
}




