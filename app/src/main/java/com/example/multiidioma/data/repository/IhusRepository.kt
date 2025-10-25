package com.example.multiidioma.data.repository



import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData


class IhusRepository {

    fun getMiniScreens(): List<MiniScreenData> {
        return listOf(
            MiniScreenData(
                id = 0,

                bodyParagraphs = listOf(
                    R.string.II_IHUS_miniscreen_0_paragraph0
                ),

                ),
            MiniScreenData(
                id = 1,
                bodyParagraphs = listOf(
                    R.string.II_IHUS_miniscreen_1_paragraph0,
                    R.string.II_IHUS_miniscreen_1_paragraph1,
                ),
                imageRes = R.drawable.ihus_img_01

            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs =listOf(
                    R.string.II_IHUS_miniscreen_2_paragraph0,
                    R.string.II_IHUS_miniscreen_2_paragraph1,
                ),
                imageRes = R.drawable.ihus_img_03
            ) ,
            MiniScreenData(
                id = 3,
                bodyParagraphs =listOf(
                    R.string.II_IHUS_miniscreen_3_paragraph0,
                ),
                imageRes = R.drawable.ihus_img_02

            ),

            MiniScreenData(
                id = 4,
                bodyParagraphs =listOf(
                    R.string.II_IHUS_miniscreen_4_paragraph0,
                ),
                imageRes = R.drawable.ihus_img_02



            ),

            MiniScreenData(
                id = 5,  //Esta es la pagina q tiene q hacer isra//
                bodyParagraphs =listOf(
                    R.string.II_IHUS_miniscreen_5_paragraph0,
                ),
                imageRes = R.drawable.ihus_img_03



            ),
            MiniScreenData(
                id = 6,  //Pagina Kike 1//
                bodyParagraphs = listOf(
                    R.string.II_IHUS_miniscreen_6_title0,
                    R.string.II_IHUS_miniscreen_6_title1,
                    R.string.II_IHUS_miniscreen_6_title2,
                    R.string.II_IHUS_miniscreen_6_paragraph0,
                ),
                imageRes = R.drawable.ihus_img_03
            ),

            MiniScreenData(
                id = 7,  //Pagina Kike 2//
                bodyParagraphs = listOf(
                    R.string.II_IHUS_miniscreen_7_title0,
                    R.string.II_IHUS_miniscreen_7_title1,
                    R.string.II_IHUS_miniscreen_7_title2,
                    R.string.II_IHUS_miniscreen_7_paragraph0,
                ),
                imageRes = R.drawable.ihus_img_03
            ),

            MiniScreenData(
                id = 8,  //Pagina Kike 2//
                bodyParagraphs = listOf(
                    R.string.II_IHUS_miniscreen_8_title0,
                    R.string.II_IHUS_miniscreen_8_title1,
                    R.string.II_IHUS_miniscreen_8_title2,
                    R.string.II_IHUS_miniscreen_8_paragraph0,
                ),
                //imageRes = R.drawable.ihus_img_05_eng

            ),


            MiniScreenData(
                id = 9,
                bodyParagraphs =listOf(
                    R.string.II_IHUS_miniscreen_9_paragraph0,
                    R.string.II_IHUS_miniscreen_9_paragraph1,
                ),
                //imageRes = R.drawable.ihus_img_07 Falta Imagen

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