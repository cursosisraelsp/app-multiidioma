package com.example.multiidioma.data.data

import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData


class IlgRepository {

    fun getMiniScreens(): List<MiniScreenData> {
        return listOf(
            MiniScreenData(
                id = 0,

                bodyParagraphs = listOf(
                    R.string.II_ILG_miniscreen_0_paragraph_0
                ),

                ),
            MiniScreenData(
                id = 1,
                bodyParagraphs = listOf(
                    R.string.II_ILG_miniscreen_1_paragraph_0,
                    R.string.II_ILG_miniscreen_1_paragraph_1,
                ),
                imageRes = R.drawable.bgalega

            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs =listOf(
                    R.string.II_ILG_miniscreen_2_paragraph_0,
                    R.string.II_ILG_miniscreen_2_paragraph_1,
                ),
            ) ,
            MiniScreenData(
                id = 3,
                bodyParagraphs =listOf(
                    R.string.II_ILG_miniscreen_3_paragraph_0,
                    R.string.II_ILG_miniscreen_3_paragraph_1,
                    R.string.II_ILG_miniscreen_3_paragraph_2,
                    R.string.II_ILG_miniscreen_3_paragraph_3,
                    R.string.II_ILG_miniscreen_3_paragraph_4,
                    R.string.II_ILG_miniscreen_3_paragraph_5,
                    R.string.II_ILG_miniscreen_3_paragraph_6,
                    ),


            ),

            MiniScreenData(
                id = 4,
                bodyParagraphs =listOf(
                    R.string.II_ILG_miniscreen_4_paragraph_0,
                    R.string.II_ILG_miniscreen_4_paragraph_1,
                ),
                imageRes = R.drawable.ilg_img_02



            ),

            MiniScreenData(
                id = 5,  //Esta es la pagina q tiene q hacer isra//
                bodyParagraphs =listOf(
                    R.string.II_ILG_miniscreen_5_paragraph_0,
                    R.string.II_ILG_miniscreen_5_paragraph_1
                    ),
                imageRes = R.drawable.bgalega



            ),
            MiniScreenData(
                id = 6,
                bodyParagraphs = listOf(
                    R.string.II_ILG_miniscreen_6_paragraph_0,
                    R.string.II_ILG_miniscreen_6_paragraph_1,

                ),
                imageRes = R.drawable.bgalega
            ),

            MiniScreenData(
                id = 7,
                bodyParagraphs = listOf(
                    R.string.II_ILG_miniscreen_7_paragraph_0,
                    R.string.II_ILG_miniscreen_7_paragraph_1,
                ),
                imageRes = R.drawable.bgalega

            ),

            MiniScreenData(
                id = 8,
                bodyParagraphs = listOf(
                    R.string.II_ILG_miniscreen_8_paragraph_0,
                   // R.string.II_ILG_miniscreen_8_paragraph_1,
                ),
                imageRes = R.drawable.ihus_img_05_eng

            ),


            MiniScreenData(
                id = 9,
                bodyParagraphs =listOf(
                    R.string.II_IHUS_miniscreen_9_paragraph0,
                    R.string.II_IHUS_miniscreen_9_paragraph1,
                ),
                imageRes = R.drawable.bgalega

            ),

            MiniScreenData(
                id = 10,
                bodyParagraphs =listOf(
                    R.string.II_IHUS_miniscreen_10_paragraph0,
                ),
                imageRes = R.drawable.bgalega

            ),
            MiniScreenData(
                id = 11,
                bodyParagraphs =listOf(
                    R.string.II_IHUS_miniscreen_11_title0,
                ),
                imageRes = R.drawable.bgalega

            ),
            MiniScreenData(
                id = 12,
                bodyParagraphs =listOf(
                    R.string.II_IHUS_miniscreen_11_title0,
                ),
                imageRes = R.drawable.bgalega

            ),
            MiniScreenData(
                id = 13,
                bodyParagraphs =listOf(
                    R.string.II_IHUS_miniscreen_13_title0,
                    R.string.II_IHUS_miniscreen_13_paragraph0,
                    R.string.II_IHUS_miniscreen_13_paragraph1,
                ),
                imageRes = R.drawable.bgalega


            ),


            MiniScreenData(
                id = 14,
                bodyParagraphs =listOf(
                    R.string.II_IHUS_miniscreen_11_title0,
                    R.string.II_IHUS_miniscreen_6_title0,
                ),

                ),

            )
    }
    fun getData(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }
}