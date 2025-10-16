package com.example.multiidioma.data.repository

import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData

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
                imageRes = R.drawable.imatus_img_01
            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_2_paragraph_0,
                    R.string.II_IMATUS_miniscreen_2_paragraph_1
                ),
                imageRes = R.drawable.imatus_img_02
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
                imageRes = R.drawable.noimagen

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
                imageRes = R.drawable.imatus_img_19,
                /*personalResearcher = GetPersonalResearcherUtils(
                    PersonsResearchersUtils(
                        datosInvestigadoresImatus
                    )
                )*/
            ),


            MiniScreenData(
                id = 14,
                bodyParagraphs = listOf(
                    R.string.II_IMATUS_miniscreen_14_title_0,
                    R.string.II_IMATUS_miniscreen_14_title_1,
                    R.string.II_IMATUS_miniscreen_14_paragraph_0,
                ),


                /*
                MiniScreenData(
                    id = 15,
                    bodyParagraphs = listOf(
                        R.string.II_IMATUS_miniscreen_15_title_0,
                        R.string.II_IMATUS_miniscreen_15_title_1,
                        R.string.II_IMATUS_miniscreen_15_paragraph_0,
                    ),

                    ),
                MiniScreenData(
                    id = 16,
                    bodyParagraphs = listOf(
                        R.string.II_IMATUS_miniscreen_16_title_0,
                        R.string.II_IMATUS_miniscreen_16_title_1,
                        R.string.II_IMATUS_miniscreen_16_paragraph_0,
                    ),

                    ),
                MiniScreenData(
                    id = 17,
                    bodyParagraphs = listOf(
                        R.string.II_IMATUS_miniscreen_17_title_0,
                        R.string.II_IMATUS_miniscreen_17_title_1,
                        R.string.II_IMATUS_miniscreen_17_paragraph_0,
                    ),

                    ),
                MiniScreenData(
                    id = 18,
                    bodyParagraphs = listOf(
                        R.string.II_IMATUS_miniscreen_18_title_0,
                        R.string.II_IMATUS_miniscreen_18_paragraph_0,
                    ),

                    ),
                MiniScreenData(
                    id = 19,
                    bodyParagraphs = listOf(
                        R.string.II_IMATUS_miniscreen_19_title_0,
                        R.string.II_IMATUS_miniscreen_19_paragraph_0,
                        R.string.II_IMATUS_miniscreen_19_paragraph_1
                    )
                ),
                MiniScreenData(
                    id = 20,
                    bodyParagraphs = listOf(
                        R.string.II_IMATUS_miniscreen_20_paragraph_0,
                        R.string.II_IMATUS_miniscreen_20_paragraph_1,
                        R.string.II_IMATUS_miniscreen_20_paragraph_2,
                    ),

                    ),
                MiniScreenData(
                    id = 21,
                    bodyParagraphs = listOf(
                        R.string.II_IMATUS_miniscreen_21_title_0,
                        R.string.II_IMATUS_miniscreen_21_paragraph_0,
                        R.string.II_IMATUS_miniscreen_21_paragraph_1,

                        ),

                    ),
                MiniScreenData(
                    id = 22,
                    bodyParagraphs = listOf(
                        R.string.II_IMATUS_miniscreen_22_title_0,
                        R.string.II_IMATUS_miniscreen_22_paragraph_0,


                        ),

                    ),
                MiniScreenData(
                    id = 23,
                    bodyParagraphs = listOf(
                        R.string.II_IMATUS_miniscreen_23_title_0,
                        R.string.II_IMATUS_miniscreen_23_paragraph_0,


                        ),

                    ),
                MiniScreenData(
                    id = 24,
                    bodyParagraphs = listOf(
                        R.string.II_IMATUS_miniscreen_24_paragraph_0,


                        ),

                    ),
                MiniScreenData(
                    id = 25,
                    bodyParagraphs = listOf(
                        R.string.II_IMATUS_miniscreen_25_paragraph_0
                    ),

                    ),
                MiniScreenData(
                    id = 26,
                    bodyParagraphs = listOf(
                        R.string.II_IMATUS_miniscreen_26_paragraph_0,
                        R.string.II_IMATUS_miniscreen_26_paragraph_1
                    ),

                    ),
                MiniScreenData(
                    id = 27,
                    bodyParagraphs = listOf(
                        R.string.II_IMATUS_miniscreen_27_title_0,
                        R.string.II_IMATUS_miniscreen_27_title_1,
                        R.string.II_IMATUS_miniscreen_27_paragraph_1
                    ),

                    ),
                MiniScreenData(
                    id = 28,
                    bodyParagraphs = listOf(
                        R.string.II_IMATUS_miniscreen_28_paragraph_0,
                        R.string.More_info
                    ),
                ),*/
                /*         MiniScreenData(
                             id = 35,
                             bodyParagraphs = listOf(
                                 R.string.II_IMATUS_miniscreen_35_paragraph_0,
                                 R.string.II_IMATUS_miniscreen_35_title_0,
                             ),
                         ),*/
            ),
        )
    }

    fun getData(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }
}