package com.example.multiidioma.data.repository

import com.example.multiidioma.R
import com.example.multiidioma.data.centroCitius
import com.example.multiidioma.data.centroImatus
import com.example.multiidioma.data.imaxesPNG
import com.example.multiidioma.data.imaxesWEBP
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlRecursosApp
import com.example.multiidioma.ui.screens.institutes.imatus.datosInvestigadoresImatus
import com.example.multiidioma.utils.GetPersonalResearcherUtils
import com.example.multiidioma.utils.PersonsResearchersUtils

class ImatusRepository {

    fun getMiniScreens(): List<MiniScreenData> {
        return listOf(
            MiniScreenData(
                id = 0,

                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_0_paragraph_0,
                    R.string.II_IMATUS_miniscreen_0_paragraph_1,
                    R.string.II_IMATUS_miniscreen_0_paragraph_2
                ),
            ),
            MiniScreenData(
                id = 1,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_1_paragraph_0,
                    R.string.II_IMATUS_miniscreen_1_paragraph_1,
                ),
                //imageRes = R.drawable.imatus_img_01
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroImatus/citius_img_01.webp"
            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_2_paragraph_0,
                    R.string.II_IMATUS_miniscreen_2_paragraph_1
                ),
                //imageRes = R.drawable.imatus_img_02
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroImatus/citius_img_02.webp"
            ),
            MiniScreenData(
                id = 3,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_3_paragraph_0,
                    R.string.II_IMATUS_miniscreen_3_paragraph_0,
                    R.string.II_IMATUS_miniscreen_3_paragraph_0,
                ),
            ),
            MiniScreenData(
                id = 4,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_4_paragraph_0
                ),

                ),
            MiniScreenData(
                id = 5,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_5_title_0,
                    R.string.II_IMATUS_miniscreen_5_paragraph_0,
                    R.string.II_IMATUS_miniscreen_5_title_1,
                    R.string.II_IMATUS_miniscreen_5_paragraph_1,
                    R.string.II_IMATUS_miniscreen_5_title_2,
                    R.string.II_IMATUS_miniscreen_5_paragraph_2,
                    R.string.II_IMATUS_miniscreen_5_title_3,
                    R.string.II_IMATUS_miniscreen_5_paragraph_3,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"

            ),
            MiniScreenData(
                id = 6,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_6_title_0,
                    R.string.II_IMATUS_miniscreen_6_paragraph_0,
                    R.string.II_IMATUS_miniscreen_6_title_1,
                    R.string.II_IMATUS_miniscreen_6_paragraph_1,
                    R.string.II_IMATUS_miniscreen_6_title_2,
                    R.string.II_IMATUS_miniscreen_6_paragraph_2,

                    ),

                ),
            MiniScreenData(
                id = 7,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_7_title_0,
                    R.string.II_IMATUS_miniscreen_7_paragraph_0,
                    R.string.II_IMATUS_miniscreen_7_title_1,
                    R.string.II_IMATUS_miniscreen_7_paragraph_1,
                    R.string.II_IMATUS_miniscreen_7_title_2,
                    R.string.II_IMATUS_miniscreen_7_paragraph_2,
                ),

                ),
            MiniScreenData(
                id = 8,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_8_paragraph_0
                ),

                ),
            MiniScreenData(
                id = 9,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_9_paragraph_0,
                    R.string.II_IMATUS_miniscreen_9_paragraph_1
                ),

                ),

            MiniScreenData(
                id = 10,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_10_paragraph_0,

                    ),
            ),
            MiniScreenData(
                id = 11,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_11_paragraph_0,
                ),

                ),

            MiniScreenData(
                id = 12,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_12_title_0,

                    ),

                ),
            MiniScreenData(
                id = 13,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_12_title_0,
                ),
                //imageRes = R.drawable.imatus_img_13
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroImatus/citius_img_13.webp",
                personalResearcher = GetPersonalResearcherUtils(
                    PersonsResearchersUtils(
                        datosInvestigadoresImatus
                    )
                )
            ),
            MiniScreenData(
                id = 14,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_14_title_0,
                    R.string.II_IMATUS_miniscreen_14_title_1,
                    R.string.II_IMATUS_miniscreen_14_paragraph_0,
                ),
            ),
        )
    }

    fun getData(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }
}