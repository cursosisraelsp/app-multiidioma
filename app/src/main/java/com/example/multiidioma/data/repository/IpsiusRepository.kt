package com.example.multiidioma.data.repository

import com.example.multiidioma.R
import com.example.multiidioma.data.MiniScreenData

class IpsiusRepository {
    fun getMiniScreens(): List<MiniScreenData> {
        return listOf(
            MiniScreenData(
                id = 0,

                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_0_paragraph0,

                    ),

                ),
            MiniScreenData(
                id = 1,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen1_paragraph_0,

                    ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_0_paragraph0,

                    ),
                imageRes = R.drawable.ipsius_img_01
            ),
            MiniScreenData(
                id = 3,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_0_paragraph0,

                    ),
                imageRes = R.drawable.ipsius_img_02
            ),

            MiniScreenData(
                id = 4,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_0_paragraph0,

                    ),
            ),
            MiniScreenData(
                id = 5,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_0_paragraph0,

                    ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 6,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_0_paragraph0,

                    ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 7
            ),
            MiniScreenData(
                id = 8
            ),
            MiniScreenData(
                id = 9
            ),
            MiniScreenData(
                id = 10
            ),
            MiniScreenData(
                id = 11
            ),
            MiniScreenData(
                id = 12
            ),
            MiniScreenData(
                id = 13
            ),
            MiniScreenData(
                id = 14,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_0_paragraph0,

                    ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 15,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_0_paragraph0,

                    ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 16,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_0_paragraph0,

                    ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 17,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_0_paragraph0,

                    ),

                ),
            MiniScreenData(
                id = 18,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_0_paragraph0,

                    ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 19
            ),
            MiniScreenData(
                id = 20
            ),
            MiniScreenData(
                id = 21,
                bodyParagraphs = listOf(
                    R.string.II_IPSIUS_miniscreen_0_paragraph0,

                    ),
                imageRes = R.drawable.noimagen
            ),
        )

    }

    fun getData(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }
}