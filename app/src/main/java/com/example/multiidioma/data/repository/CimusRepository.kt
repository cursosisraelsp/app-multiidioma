package com.example.multiidioma.data.repository

import com.example.multiidioma.R
import com.example.multiidioma.data.centroCimus
import com.example.multiidioma.data.imaxesWEBP
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlRecursosApp

class CimusRepository {

    fun getMiniScreens(): List<MiniScreenData> {
        return listOf(
            MiniScreenData(
                id = 0,

                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_0_paragraph_0,

                    ),
            ),
            MiniScreenData(
                id = 1,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_1_paragraph_0,

                    ),
            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_2_paragraph_0,
                ),
                //imageRes = R.drawable.cimus_img_01,
                urlImage = "${urlRecursosApp}/${imaxesWEBP}/${centroCimus}/cimus_img_01.webp"
            ),
            MiniScreenData(
                id = 3,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_3_paragraph_0,
                    R.string.CS_CIMUS_miniscreen_3_paragraph_1,
                    ),
            ),
            MiniScreenData(
                id = 4,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_4_paragraph_0,
                    R.string.CS_CIMUS_miniscreen_4_paragraph_1,
                    R.string.CS_CIMUS_miniscreen_4_paragraph_2

                ),

                ),
            MiniScreenData(
                id = 5,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_5_paragraph_0,
                    ),
                imageRes = R.drawable.cimus_img_03,
                urlImage = "${urlRecursosApp}/${imaxesWEBP}/${centroCimus}/cimus_img_03.webp"

            ),
            MiniScreenData(
                id = 6,
                bodyParagraphs = listOf(

                    R.string.CS_CIMUS_miniscreen_6_paragraph_0,
                    R.string.CS_CIMUS_miniscreen_6_paragraph_1,

                    ),

                ),
            MiniScreenData(
                id = 7,
                bodyParagraphs = listOf(

                    R.string.CS_CIMUS_miniscreen_7_paragraph_0,
                    R.string.CS_CIMUS_miniscreen_7_paragraph_1,

                    ),
                imageRes = R.drawable.cimus_img_04,
                urlImage = "${urlRecursosApp}/${imaxesWEBP}/${centroCimus}/cimus_img_04.webp"

                ),
            MiniScreenData(
                id = 8,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_8_title_0,

                    R.string.CS_CIMUS_miniscreen_8_paragraph_0,
                ),

                ),
            MiniScreenData(
                id = 9,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_9_title_0,

                    R.string.CS_CIMUS_miniscreen_9_paragraph_0,
                ),

                ),

            MiniScreenData(
                id = 10,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_10_title_0,

                    R.string.CS_CIMUS_miniscreen_10_paragraph_0,
                ),

                ),
            MiniScreenData(
                id = 11,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_11_title_0,

                    R.string.CS_CIMUS_miniscreen_11_paragraph_0,
                ),

                ),

            MiniScreenData(
                id = 12,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_12_title_0,

                    R.string.CS_CIMUS_miniscreen_12_paragraph_0,

                    ),

                ),
            MiniScreenData(
                id = 13,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_13_title_0,

                    R.string.CS_CIMUS_miniscreen_13_paragraph_0,

                    ),

                ),

            MiniScreenData(
                id = 14,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_14_paragraph_0,

                    ),

                ),
            MiniScreenData(
                id = 15,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_15_title_0,

                    R.string.CS_CIMUS_miniscreen_15_paragraph_0,
                ),
            ),
            MiniScreenData(
                id = 16,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_16_title_0,

                    R.string.CS_CIMUS_miniscreen_16_paragraph_0,
                ),


                ),
            MiniScreenData(
                id = 17,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_17_title_0,

                    R.string.CS_CIMUS_miniscreen_17_paragraph_0,
                ),


                ),
            MiniScreenData(
                id = 18,
                bodyParagraphs = listOf(

                    R.string.CS_CIMUS_miniscreen_18_paragraph_0,
                    R.string.CS_CIMUS_miniscreen_18_paragraph_1,
                ),
                imageRes = R.drawable.cimus_img_14,
                urlImage = "${urlRecursosApp}/${imaxesWEBP}/${centroCimus}/cimus_img_14.webp"
                ),
            MiniScreenData(
                id = 19,
                bodyParagraphs = listOf(

                    R.string.CS_CIMUS_miniscreen_19_paragraph_0,
                    R.string.CS_CIMUS_miniscreen_19_paragraph_1
                ),
                imageRes = R.drawable.cimus_img_15,
                urlImage = "${urlRecursosApp}/${imaxesWEBP}/${centroCimus}/cimus_img_15.webp"

                ),
            MiniScreenData(
                id = 20,
                bodyParagraphs = listOf(

                    R.string.CS_CIMUS_miniscreen_20_paragraph_0,
                    R.string.CS_CIMUS_miniscreen_20_paragraph_1,

                    ),
                imageRes = R.drawable.cimus_img_16,
                urlImage = "${urlRecursosApp}/${imaxesWEBP}/${centroCimus}/cimus_img_16.webp"

                ),
            MiniScreenData(
                id = 21,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_21_title_0,

                    ),

                ),
            MiniScreenData(
                id = 22,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_22_title_0,
                    R.string.CS_CIMUS_miniscreen_22_paragraph_0,
                    R.string.CS_CIMUS_miniscreen_22_paragraph_1,
                ),


                ),
            MiniScreenData(
                id = 23,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_23_paragraph_0,
                    R.string.CS_CIMUS_miniscreen_23_paragraph_1,


                    ),

                ),
            MiniScreenData(
                id = 24,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_24_paragraph_0,
                    R.string.CS_CIMUS_miniscreen_24_paragraph_1,


                    ),


                ),
            MiniScreenData(
                id = 25,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_25_paragraph_0,
                    R.string.CS_CIMUS_miniscreen_25_paragraph_1,

                    ),


                ),
            MiniScreenData(
                id = 26,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_26_title_0,

                    ),

                ),
            MiniScreenData(
                id = 27,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_27_title_0,
                    R.string.CS_CIMUS_miniscreen_27_title_1,
                    R.string.CS_CIMUS_miniscreen_27_paragraph_1
                ),

                ),
            MiniScreenData(
                id = 28,
                bodyParagraphs = listOf(
                    R.string.CS_CIMUS_miniscreen_28_paragraph_0,
                    R.string.More_info
                ),
            ),
            MiniScreenData(
                id = 35,
                bodyParagraphs = listOf(

                ),
            ),
        )
    }

    fun getData(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }
}