package com.example.multiidioma.data.repository

import com.example.multiidioma.R
import com.example.multiidioma.data.centroCiqus
import com.example.multiidioma.data.centroCitius
import com.example.multiidioma.data.centroIgfae
import com.example.multiidioma.data.imaxesPNG
import com.example.multiidioma.data.imaxesWEBP
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlRecursosApp

class IgfaeRepository {
    fun getMiniScreens(): List<MiniScreenData> {
        return listOf(
            MiniScreenData(
                id = 0,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_0_paragraph_0,
                ),
            ),
            MiniScreenData(
                id = 1,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_1_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_2_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 3,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_3_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 4,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_4_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_4_paragraph_1,
                ),
            ),
            MiniScreenData(
                id = 5,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_5_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_5_paragraph_1,
                    R.string.CS_IGFAE_miniscreen_5_paragraph_2,

                    ),
                //imageRes = R.drawable.igfae_img_01
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroIgfae/igfae_img_01.webp"
            ),
            MiniScreenData(
                id = 6,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_6_title_0,
                    R.string.CS_IGFAE_miniscreen_6_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_6_paragraph_1,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 7,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_7_title_0,
                    R.string.CS_IGFAE_miniscreen_7_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_7_paragraph_1,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 8,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_8_title_0,
                    R.string.CS_IGFAE_miniscreen_8_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_8_paragraph_1,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 9,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_9_title_0,
                    R.string.CS_IGFAE_miniscreen_9_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_9_paragraph_1,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 10,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_10_title_0,
                    R.string.CS_IGFAE_miniscreen_10_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_10_paragraph_1,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 11,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_11_title_0,
                    R.string.CS_IGFAE_miniscreen_11_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_11_paragraph_1,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 12,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_12_title_0,
                    R.string.CS_IGFAE_miniscreen_12_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_12_paragraph_1,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 13,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_13_title_0,
                    R.string.CS_IGFAE_miniscreen_13_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_13_paragraph_1,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 14,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_14_title_0,
                    R.string.CS_IGFAE_miniscreen_14_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_14_paragraph_1,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 15,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_15_title_0,
                    R.string.CS_IGFAE_miniscreen_15_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_15_paragraph_1,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 16,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_16_title_0,
                    R.string.CS_IGFAE_miniscreen_16_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_16_paragraph_1,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 17,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_17_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_17_paragraph_1,
                ),
                //imageRes = R.drawable.igfae_img_11
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroIgfae/igfae_img_11.webp"
            ),
            MiniScreenData(
                id = 18,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_18_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_18_paragraph_1,
                ),
                //imageRes = R.drawable.igfae_img_12
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroIgfae/igfae_img_12.webp"
                ),
            MiniScreenData(
                id = 19,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_19_paragraph_0,
                    ),
                //imageRes = R.drawable.igfae_img_13
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroIgfae/igfae_img_13.webp"
                ),
            MiniScreenData(
                id = 20,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_20_paragraph_0,
                ),
                //imageRes = R.drawable.igfae_img_14
                urlImage = "$urlRecursosApp/$imaxesWEBP/$centroIgfae/igfae_img_14.webp"
            ),
            MiniScreenData(
                id = 21,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_21_paragraph_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 22,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_22_title_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 23,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_23_title_0,
                    R.string.CS_IGFAE_miniscreen_23_title_1,
                    R.string.CS_IGFAE_miniscreen_23_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_23_paragraph_1,
                    R.string.CS_IGFAE_miniscreen_23_paragraph_2,
                    R.string.CS_IGFAE_miniscreen_23_paragraph_3,
                    R.string.CS_IGFAE_miniscreen_23_paragraph_4,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 24,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_24_title_0,
                    R.string.CS_IGFAE_miniscreen_24_title_1,
                    R.string.CS_IGFAE_miniscreen_24_paragraph_1,
                    R.string.CS_IGFAE_miniscreen_24_paragraph_2,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 25,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_25_title_0,
                    R.string.CS_IGFAE_miniscreen_25_paragraph_1,
                    R.string.CS_IGFAE_miniscreen_25_paragraph_2,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),MiniScreenData(
                id = 26,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_26_title_0,
                    R.string.CS_IGFAE_miniscreen_26_paragraph_1,
                    R.string.CS_IGFAE_miniscreen_26_paragraph_2,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 27,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_27_title_0,
                    R.string.CS_IGFAE_miniscreen_27_paragraph_1,
                    R.string.CS_IGFAE_miniscreen_27_paragraph_2
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 28,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_28_title_0,
                    R.string.CS_IGFAE_miniscreen_28_paragraph_1,
                    R.string.CS_IGFAE_miniscreen_28_paragraph_2
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 29,
                bodyParagraphs = listOf(
                    R.string.CS_IGFAE_miniscreen_29_paragraph_0,
                    R.string.CS_IGFAE_miniscreen_29_paragraph_1,

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
