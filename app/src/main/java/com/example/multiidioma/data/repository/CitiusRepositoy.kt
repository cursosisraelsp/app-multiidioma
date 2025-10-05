package com.example.multiidioma.data.repository


import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData

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
                imageRes = R.drawable.citius_img_1
            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_2_paragraph_0
                ),
                imageRes = R.drawable.citius_img_02
            ),
            MiniScreenData(
                id = 3,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_3_paragraph_0,
                    R.string.CS_CITIUS_miniscreen_3_paragraph_1
                ),
                imageRes = R.drawable.citius_img_03

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
                    R.string.CS_CITIUS_miniscreen_5_paragraph_0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 6,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_6_title_0,
                    R.string.CS_CITIUS_miniscreen_6_paragraph_0,
                    R.string.CS_CITIUS_miniscreen_6_paragraph_1
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 7,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_7_title_0,
                    R.string.CS_CITIUS_miniscreen_7_paragraph_0,
                    R.string.CS_CITIUS_miniscreen_7_paragraph_1
                ),
                imageRes =
                    R.drawable.noimagen
            ),
            MiniScreenData(
                id = 8,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_8_title_0,
                    R.string.CS_CITIUS_miniscreen_8_paragraph_0,
                    R.string.CS_CITIUS_miniscreen_8_paragraph_1
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 9,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_9_title_0,
                    R.string.CS_CITIUS_miniscreen_9_paragraph_0,
                    R.string.CS_CITIUS_miniscreen_9_paragraph_1
                ),
                imageRes = R.drawable.noimagen
            ),

            MiniScreenData(
                id = 10,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_10_title_0,
                    R.string.CS_CITIUS_miniscreen_10_paragraph_0,
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 11,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_11_paragraph_0,
                ),
                imageRes = R.drawable.citius_img_10
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

                imageRes = R.drawable.citius_img_11
            ),


            MiniScreenData(
                id = 14,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_14_title_0,
                    R.string.CS_CITIUS_miniscreen_14_paragraph_0,
                ),

                imageRes = R.drawable.citius_img_12
            ),
            MiniScreenData(
                id = 15,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_15_title_0,
                    R.string.CS_CITIUS_miniscreen_15_paragraph_0,
                ),
                imageRes = R.drawable.citius_img_13

                ),
            MiniScreenData(
                id = 16,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_16_title_0,

                    ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 17,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_17_title_0,
                    R.string.CS_CITIUS_miniscreen_17_title_1,
                    R.string.CS_CITIUS_miniscreen_17_paragraph_0,
                ),

                ),
            MiniScreenData(
                id = 18,
                bodyParagraphs = listOf(
                    R.string.CS_CITIUS_miniscreen_18_title_0,
                    R.string.CS_CITIUS_miniscreen_18_paragraph_0,
                ),

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




