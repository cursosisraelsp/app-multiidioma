package com.example.multiidioma.data.repository

import com.example.multiidioma.R
import com.example.multiidioma.data.centroCitius
import com.example.multiidioma.data.centroCretus
import com.example.multiidioma.data.imaxesPNG
import com.example.multiidioma.data.imaxesWEBP
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlRecursosApp

class CretusRepository {
    fun getMiniScreens(): List<MiniScreenData> {
        return listOf(
            MiniScreenData(
                id = 0,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_0_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_0_paragraph_1,
                ),
            ),
            MiniScreenData(
                id = 1,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_1_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_2_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 3,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_3_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 4,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_4_paragraph_0,
                ),
            ),
            MiniScreenData(
                id = 5,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_5_paragraph_0,
                ),
                //imageRes = R.drawable.cretus_img_01,
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroCretus/cretus_img_01.webp"
            ),
            MiniScreenData(
                id = 6,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_6_paragraph_0,
                ),
                //imageRes = R.drawable.cretus_img_02
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroCretus/cretus_img_02.webp"
            ),
            MiniScreenData(
                id = 7,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_7_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_7_paragraph_1,
                ),
                //imageRes = R.drawable.cretus_img_03
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroCretus/cretus_img_03.webp"
            ),
            MiniScreenData(
                id = 8,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_8_paragraph_0,
                ),
            ),
            MiniScreenData(
                id = 9,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_9_title_0,
                    R.string.CS_CRETUS_miniscreen_9_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 10,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_10_title_0,
                    R.string.CS_CRETUS_miniscreen_10_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 11,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_11_title_0,
                    R.string.CS_CRETUS_miniscreen_11_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 12,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_12_title_0,
                    R.string.CS_CRETUS_miniscreen_12_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 13,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_13_title_0,
                    R.string.CS_CRETUS_miniscreen_13_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 14,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_14_title_0,
                    R.string.CS_CRETUS_miniscreen_14_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 15,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_15_title_0,
                    R.string.CS_CRETUS_miniscreen_15_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 16,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_16_title_0,
                    R.string.CS_CRETUS_miniscreen_16_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 17,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_17_paragraph_0,
                ),
                //imageRes = R.drawable.cretus_img_13
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroCretus/cretus_img_13.webp"
            ),
            MiniScreenData(
                id = 18,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_18_paragraph_0,
                ),
                //imageRes = R.drawable.cretus_img_14
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroCretus/cretus_img_14.webp"
            ),
            MiniScreenData(
                id = 19,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_19_paragraph_0,
                ),
                //imageRes = R.drawable.cretus_img_15
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroCretus/cretus_img_15.webp"
            ),
            MiniScreenData(
                id = 20,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_20_paragraph_0,
                ),
                //imageRes = R.drawable.cretus_img_16
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroCretus/cretus_img_16.webp"
            ),
            MiniScreenData(
                id = 21,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_21_title_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 22,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_22_title_0,
                    R.string.CS_CRETUS_miniscreen_22_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_22_paragraph_1,
                    R.string.CS_CRETUS_miniscreen_22_title_1,
                    R.string.CS_CRETUS_miniscreen_22_paragraph_2,
                    R.string.CS_CRETUS_miniscreen_22_paragraph_3,
                    R.string.CS_CRETUS_miniscreen_22_paragraph_4,
                    R.string.CS_CRETUS_miniscreen_22_paragraph_5,
                    R.string.CS_CRETUS_miniscreen_22_paragraph_6,
                    R.string.CS_CRETUS_miniscreen_22_paragraph_7,
                    R.string.CS_CRETUS_miniscreen_22_paragraph_8,
                    R.string.CS_CRETUS_miniscreen_22_paragraph_9,
                    R.string.CS_CRETUS_miniscreen_22_paragraph_10,
                    R.string.CS_CRETUS_miniscreen_22_paragraph_11,
                    R.string.CS_CRETUS_miniscreen_22_paragraph_12,
                ),
            ),
            MiniScreenData(
                id = 23,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_23_title_0,
                    R.string.CS_CRETUS_miniscreen_23_title_1,
                    R.string.CS_CRETUS_miniscreen_23_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_23_paragraph_1,
                    R.string.CS_CRETUS_miniscreen_23_paragraph_2,
                    R.string.CS_CRETUS_miniscreen_23_paragraph_3,
                    R.string.CS_CRETUS_miniscreen_23_paragraph_4,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 24,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_24_title_0,
                    R.string.CS_CRETUS_miniscreen_24_title_1,
                    R.string.CS_CRETUS_miniscreen_24_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_24_paragraph_1,
                    R.string.CS_CRETUS_miniscreen_24_paragraph_2,
                    R.string.CS_CRETUS_miniscreen_24_paragraph_3,
                    R.string.CS_CRETUS_miniscreen_24_paragraph_4,
                    R.string.CS_CRETUS_miniscreen_24_paragraph_5

                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 25,
                bodyParagraphs = listOf(

                    R.string.CS_CRETUS_miniscreen_25_title_0,
                    R.string.CS_CRETUS_miniscreen_25_title_1,
                    R.string.CS_CRETUS_miniscreen_25_title_2,
                    R.string.CS_CRETUS_miniscreen_25_title_3,
                    R.string.CS_CRETUS_miniscreen_25_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_25_paragraph_1,
                    R.string.CS_CRETUS_miniscreen_25_paragraph_2,
                    R.string.CS_CRETUS_miniscreen_25_paragraph_3,
                    R.string.CS_CRETUS_miniscreen_25_paragraph_4,
                    R.string.CS_CRETUS_miniscreen_25_paragraph_5,
                    R.string.CS_CRETUS_miniscreen_25_paragraph_6,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 26,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_26_title_0,
                    R.string.CS_CRETUS_miniscreen_26_title_1,
                    R.string.CS_CRETUS_miniscreen_26_title_2,
                    R.string.CS_CRETUS_miniscreen_26_title_3,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_1,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_2,
                    R.string.CS_CRETUS_miniscreen_26_title_4,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_3,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_4,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_5,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_6,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_7,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_8,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_9,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_10,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_11,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_12,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_13,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_14,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_15,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_16,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_17,
                    R.string.CS_CRETUS_miniscreen_26_paragraph_18,

                    ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 27,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_27_title_0,
                    R.string.CS_CRETUS_miniscreen_27_title_1,
                    R.string.CS_CRETUS_miniscreen_27_title_2,
                    R.string.CS_CRETUS_miniscreen_27_title_3,
                    R.string.CS_CRETUS_miniscreen_27_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_27_paragraph_1,
                    R.string.CS_CRETUS_miniscreen_27_paragraph_2,
                    R.string.CS_CRETUS_miniscreen_27_paragraph_3,
                    R.string.CS_CRETUS_miniscreen_27_paragraph_4,
                    R.string.CS_CRETUS_miniscreen_27_title_4,
                    R.string.CS_CRETUS_miniscreen_27_paragraph_5,
                    R.string.CS_CRETUS_miniscreen_27_paragraph_6,
                    R.string.CS_CRETUS_miniscreen_27_paragraph_7,
                    R.string.CS_CRETUS_miniscreen_27_paragraph_8,
                    R.string.CS_CRETUS_miniscreen_27_paragraph_9,
                    R.string.CS_CRETUS_miniscreen_27_paragraph_10,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 28,
                bodyParagraphs = listOf(

                    R.string.CS_CRETUS_miniscreen_28_title_0,
                    R.string.CS_CRETUS_miniscreen_28_title_1,
                    R.string.CS_CRETUS_miniscreen_28_title_2,
                    R.string.CS_CRETUS_miniscreen_28_title_3,
                    R.string.CS_CRETUS_miniscreen_28_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_28_paragraph_1,
                    R.string.CS_CRETUS_miniscreen_28_paragraph_2,
                    R.string.CS_CRETUS_miniscreen_28_paragraph_3,
                    R.string.CS_CRETUS_miniscreen_28_paragraph_4,
                    R.string.CS_CRETUS_miniscreen_28_paragraph_5,
                    R.string.CS_CRETUS_miniscreen_28_title_4,
                    R.string.CS_CRETUS_miniscreen_28_paragraph_6,
                    R.string.CS_CRETUS_miniscreen_28_paragraph_7,
                    R.string.CS_CRETUS_miniscreen_28_paragraph_8,
                    R.string.CS_CRETUS_miniscreen_28_paragraph_9,
                    R.string.CS_CRETUS_miniscreen_28_paragraph_10,
                    R.string.CS_CRETUS_miniscreen_28_paragraph_11,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),

            MiniScreenData(
                id = 29,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_29_title_0,
                    R.string.CS_CRETUS_miniscreen_29_title_1,
                    R.string.CS_CRETUS_miniscreen_29_title_2,
                    R.string.CS_CRETUS_miniscreen_29_title_3,
                    R.string.CS_CRETUS_miniscreen_29_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_29_paragraph_1,
                    R.string.CS_CRETUS_miniscreen_29_paragraph_2,
                    R.string.CS_CRETUS_miniscreen_29_paragraph_3,
                    R.string.CS_CRETUS_miniscreen_29_paragraph_4,
                    R.string.CS_CRETUS_miniscreen_29_paragraph_5,
                    R.string.CS_CRETUS_miniscreen_29_paragraph_6,
                    R.string.CS_CRETUS_miniscreen_29_paragraph_7,
                    R.string.CS_CRETUS_miniscreen_29_paragraph_8,
                    R.string.CS_CRETUS_miniscreen_29_paragraph_9,
                    R.string.CS_CRETUS_miniscreen_29_paragraph_10,
                    R.string.CS_CRETUS_miniscreen_29_paragraph_11,
                    R.string.CS_CRETUS_miniscreen_29_paragraph_12,
                    R.string.CS_CRETUS_miniscreen_29_paragraph_13,
                    R.string.CS_CRETUS_miniscreen_29_paragraph_14,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 30,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_30_title_0,
                    R.string.CS_CRETUS_miniscreen_30_title_1,
                    R.string.CS_CRETUS_miniscreen_30_title_2,
                    R.string.CS_CRETUS_miniscreen_30_title_3,
                    R.string.CS_CRETUS_miniscreen_30_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_30_paragraph_1,
                    R.string.CS_CRETUS_miniscreen_30_paragraph_2,
                    R.string.CS_CRETUS_miniscreen_30_paragraph_3,
                    R.string.CS_CRETUS_miniscreen_30_paragraph_4,
                    R.string.CS_CRETUS_miniscreen_30_paragraph_5,
                    R.string.CS_CRETUS_miniscreen_30_paragraph_6,
                    R.string.CS_CRETUS_miniscreen_30_paragraph_7,
                    R.string.CS_CRETUS_miniscreen_30_paragraph_8,
                    R.string.CS_CRETUS_miniscreen_30_paragraph_9,
                    R.string.CS_CRETUS_miniscreen_30_paragraph_10,
                    R.string.CS_CRETUS_miniscreen_30_paragraph_11,

                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 31,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_31_title_0,
                    R.string.CS_CRETUS_miniscreen_31_title_1,
                    R.string.CS_CRETUS_miniscreen_31_title_2,
                    R.string.CS_CRETUS_miniscreen_31_title_3,
                    R.string.CS_CRETUS_miniscreen_31_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_31_paragraph_1,
                    R.string.CS_CRETUS_miniscreen_31_paragraph_2,
                    R.string.CS_CRETUS_miniscreen_31_paragraph_3,
                    R.string.CS_CRETUS_miniscreen_31_paragraph_4,
                    R.string.CS_CRETUS_miniscreen_31_paragraph_5,
                    R.string.CS_CRETUS_miniscreen_31_paragraph_6,
                    R.string.CS_CRETUS_miniscreen_31_paragraph_7,
                    R.string.CS_CRETUS_miniscreen_31_paragraph_8,
                    R.string.CS_CRETUS_miniscreen_31_paragraph_9,
                    R.string.CS_CRETUS_miniscreen_31_paragraph_10,
                    R.string.CS_CRETUS_miniscreen_31_paragraph_11,
                    ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 32,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_32_title_0,
                    R.string.CS_CRETUS_miniscreen_32_title_1,
                    R.string.CS_CRETUS_miniscreen_32_title_2,
                    R.string.CS_CRETUS_miniscreen_32_title_3,
                    R.string.CS_CRETUS_miniscreen_32_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_32_paragraph_1,
                    R.string.CS_CRETUS_miniscreen_32_paragraph_2,
                    R.string.CS_CRETUS_miniscreen_32_paragraph_3,
                    R.string.CS_CRETUS_miniscreen_32_paragraph_4,
                    R.string.CS_CRETUS_miniscreen_32_paragraph_5,
                    R.string.CS_CRETUS_miniscreen_32_paragraph_6,
                    R.string.CS_CRETUS_miniscreen_32_paragraph_7,
                    R.string.CS_CRETUS_miniscreen_32_paragraph_8,
                    R.string.CS_CRETUS_miniscreen_32_paragraph_9,
                    ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 33,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_33_title_0,
                    R.string.CS_CRETUS_miniscreen_33_title_1,
                    R.string.CS_CRETUS_miniscreen_33_title_2,
                    R.string.CS_CRETUS_miniscreen_33_title_3,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_1,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_2,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_3,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_4,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_5,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_6,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_7,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_8,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_9,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_10,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_11,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_12,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_13,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_14,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_15,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_16,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_17,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_18,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_19,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_20,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_21,
                    R.string.CS_CRETUS_miniscreen_33_paragraph_22,
                    ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 34,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_34_title_0,
                    R.string.CS_CRETUS_miniscreen_34_title_1,
                    R.string.CS_CRETUS_miniscreen_34_title_2,
                    R.string.CS_CRETUS_miniscreen_34_title_3,
                    R.string.CS_CRETUS_miniscreen_34_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_34_paragraph_1,
                    R.string.CS_CRETUS_miniscreen_34_paragraph_2,
                    R.string.CS_CRETUS_miniscreen_34_paragraph_3,
                    R.string.CS_CRETUS_miniscreen_34_paragraph_4,
                    R.string.CS_CRETUS_miniscreen_34_paragraph_5,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 35,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_35_title_0,
                    R.string.CS_CRETUS_miniscreen_35_title_1,
                    R.string.CS_CRETUS_miniscreen_35_title_2,
                    R.string.CS_CRETUS_miniscreen_35_title_3,
                    R.string.CS_CRETUS_miniscreen_35_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_35_paragraph_1,
                    R.string.CS_CRETUS_miniscreen_35_paragraph_2,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 36,
                bodyParagraphs = listOf(
                    R.string.CS_CRETUS_miniscreen_36_paragraph_0,
                    R.string.CS_CRETUS_miniscreen_36_title_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),

            )
    }

    fun getData(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }
}
