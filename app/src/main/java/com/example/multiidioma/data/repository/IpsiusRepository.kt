package com.example.multiidioma.data.repository

import com.example.multiidioma.R
import com.example.multiidioma.data.centroCitius
import com.example.multiidioma.data.centroIpsius
import com.example.multiidioma.data.imaxesPNG
import com.example.multiidioma.data.imaxesWEBP
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlRecursosApp

class IpsiusRepository {
    fun getMiniScreens(): List<MiniScreenData> {
        return listOf(
            MiniScreenData(
                id = 0,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_0_paragraph_0,
                ),
            ),
            MiniScreenData(
                id = 1,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_1_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_1_paragraph_1
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_2_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_2_paragraph_1
                ),
                //imageRes = R.drawable.ipsius_img_01,
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_01.png"
            ),
            MiniScreenData(
                id = 3,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_3_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_3_paragraph_1,
                ),
                //imageRes = R.drawable.ipsius_img_02
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_02.png"
            ),
            MiniScreenData(
                id = 4,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_4_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_4_paragraph_1,
                ),
            ),
            MiniScreenData(
                id = 5,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_6_title_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 6,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_7_title_0,
                    R.string.II_IPSIUS_miniscreen_7_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_7_paragraph_1
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 7,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_8_title_0,
                    R.string.II_IPSIUS_miniscreen_8_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_8_paragraph_1,
                ),
                //imageRes = R.drawable.ipsius_img_05_eng
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_05_eng.png"
            ),
            MiniScreenData(
                id = 8,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_9_title_0,
                    R.string.II_IPSIUS_miniscreen_9_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_9_paragraph_1,
                ),
                //imageRes = R.drawable.ipsius_img_06_eng
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_06_eng.png"
                ),
            MiniScreenData(
                id = 9,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_10_title_0,
                    R.string.II_IPSIUS_miniscreen_10_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_10_paragraph_1,
                    R.string.II_IPSIUS_miniscreen_10_paragraph_2
                ),
                //imageRes = R.drawable.ipsius_img_07_eng
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_07_eng.png"
                ),
            MiniScreenData(
                id = 10,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_11_title_0,
                    R.string.II_IPSIUS_miniscreen_11_paragraph_0
                ),
                //imageRes = R.drawable.ipsius_img_08_eng
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_08_eng.png"
                ),
            MiniScreenData(
                id = 11,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_12_title_0,
                    R.string.II_IPSIUS_miniscreen_12_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_12_paragraph_1,
                ),
                //imageRes = R.drawable.ipsius_img_09_eng
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_09_eng.png"
            ),
            MiniScreenData(
                id = 12,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_13_title_0,
                    R.string.II_IPSIUS_miniscreen_13_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_13_paragraph_1,
                    R.string.II_IPSIUS_miniscreen_13_paragraph_2,
                ),
                //imageRes = R.drawable.ipsius_img_10_eng
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_10_eng.png"
            ),
            MiniScreenData(
                id = 13,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_14_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_14_paragraph_1,
                ),
                //imageRes = R.drawable.ipsius_img_11_eng
                //imageRes = R.drawable.ipsius_img_21
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_21.png"
            ),
            MiniScreenData(
                id = 14,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_15_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_15_paragraph_1,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 15,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_15_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_15_paragraph_1,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 16,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_16_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_16_paragraph_1,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 17,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_17_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_17_paragraph_1,
                    R.string.II_IPSIUS_miniscreen_17_paragraph_2,
                ),
            ),
            MiniScreenData(
                id = 18,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_18_title_0,
                ),
                //imageRes = R.drawable.noimagen
                urlImage = "$urlRecursosApp/$imaxesPNG/bgalega.png"
            ),
            MiniScreenData(
                id = 19,
                bodyParagraphs = listOf(
                R.string.II_IPSIUS_miniscreen_19_title_0,
                R.string.II_IPSIUS_miniscreen_19_title_1,
                R.string.II_IPSIUS_miniscreen_19_paragraph_0,
                R.string.II_IPSIUS_miniscreen_19_paragraph_1,
                R.string.II_IPSIUS_miniscreen_19_paragraph_2,
                R.string.II_IPSIUS_miniscreen_19_paragraph_3,
                R.string.II_IPSIUS_miniscreen_19_paragraph_4,
                R.string.II_IPSIUS_miniscreen_19_paragraph_5,
                R.string.II_IPSIUS_miniscreen_19_paragraph_6,
                R.string.II_IPSIUS_miniscreen_19_paragraph_7,
                R.string.II_IPSIUS_miniscreen_19_paragraph_8,
            ),

            ),
            MiniScreenData(
                id = 20,
                bodyParagraphs = listOf(
                R.string.II_IPSIUS_miniscreen_20_title_0,
                R.string.II_IPSIUS_miniscreen_20_title_1,
                R.string.II_IPSIUS_miniscreen_20_paragraph_0,
                R.string.II_IPSIUS_miniscreen_20_paragraph_1,
                ),
            ),
            MiniScreenData(
                id = 21,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_21_title_0,
                    R.string.II_IPSIUS_miniscreen_21_title_1,
                    R.string.II_IPSIUS_miniscreen_21_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_21_paragraph_1,
                ),
                //imageRes = R.drawable.ipsius_img_21
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_21.png"
            ),
            MiniScreenData(
                id = 22,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_22_title_0,
                    R.string.II_IPSIUS_miniscreen_22_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_22_paragraph_1,
                ),
                //imageRes = R.drawable.ipsius_img_21
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_21.png"
            ),
            MiniScreenData(
                id = 23,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_23_title_0,
                    R.string.II_IPSIUS_miniscreen_23_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_23_paragraph_1,
                ),
                //imageRes = R.drawable.ipsius_img_21
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_21.png"
            ),
            MiniScreenData(
                id = 24,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_24_title_0,
                    R.string.II_IPSIUS_miniscreen_24_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_24_paragraph_1,
                ),
                //imageRes = R.drawable.ipsius_img_21
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_21.png"
            ),
            MiniScreenData(
                id = 25,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_25_title_0,
                    R.string.II_IPSIUS_miniscreen_25_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_25_paragraph_1,
                ),
                //imageRes = R.drawable.ipsius_img_21
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_21.png"
            ),
            MiniScreenData(
                id = 26,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_26_title_0,
                    R.string.II_IPSIUS_miniscreen_26_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_26_paragraph_1,
                ),
                //imageRes = R.drawable.ipsius_img_21
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_21.png"
            ),
            MiniScreenData(
                id = 27,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_27_title_0,
                    R.string.II_IPSIUS_miniscreen_27_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_27_paragraph_1,
                ),
                //imageRes = R.drawable.ipsius_img_21
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_21.png"
            ),
            MiniScreenData(
                id = 28,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_28_title_0,
                    R.string.II_IPSIUS_miniscreen_28_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_28_paragraph_1,
                ),
                //imageRes = R.drawable.ipsius_img_21
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_21.png"
                ),
            MiniScreenData(
                id = 29,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_29_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_29_paragraph_1,
                ),
                //imageRes = R.drawable.ipsius_img_22
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_21.png"
                ),
            MiniScreenData(
                id = 30,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_30_paragraph_0,
                    R.string.II_IPSIUS_miniscreen_30_paragraph_1,
                    R.string.II_IPSIUS_miniscreen_30_paragraph_2,
                ),
                //imageRes = R.drawable.ipsius_img_23
                urlImage = "$urlRecursosApp/$imaxesPNG/$centroIpsius/ipsius_img_23.xml"
            ),

        )
    }

    fun getData(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }
}
