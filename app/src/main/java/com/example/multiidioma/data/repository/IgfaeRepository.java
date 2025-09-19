package com.example.multiidioma.data.repository;


import static com.google.android.gms.common.util.CollectionUtils.listOf;

import com.example.multiidioma.R;
import com.example.multiidioma.data.types.MiniScreenData;

import java.util.List;

class IgfaeRepository {
    fun getMiniScreens():List<MiniScreenData>

        {
        return listOf(
                MiniScreenData(
                        id = 0,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,

                                ),

                        ),
                MiniScreenData(
                        id = 1,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,

                                ),
                        imageRes = R.drawable.noimagen
                ),
                MiniScreenData(
                        id = 2,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,

                                ),
                        imageRes = R.drawable.Igfae_img_01
                ),
                MiniScreenData(
                        id = 3,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,

                                ),
                        imageRes = R.drawable.Igfae_img_02
                ),

                MiniScreenData(
                        id = 4,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,

                                ),
                        ),
                MiniScreenData(
                        id = 5,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,

                                ),
                        imageRes = R.drawable.noimagen
                ),
                MiniScreenData(
                        id = 6,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,

                                ),
                        imageRes = R.drawable.noimagen
                ),
                MiniScreenData(
                        id = 7,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0

                        ),
                        imageRes = R.drawable.Igfae_img_05_eng
                ),
                MiniScreenData(
                        id = 8,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0

                        ),
                        imageRes = R.drawable.Igfae_img_06_eng
                ),
                MiniScreenData(
                        id = 9,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0

                        ),
                        imageRes = R.drawable.Igfae_img_07_eng
                ),
                MiniScreenData(
                        id = 10,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0

                        ),
                        imageRes = R.drawable.Igfae_img_08_eng
                ),
                MiniScreenData(
                        id = 11,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0

                        ),
                        imageRes = R.drawable.Igfae_img_09_eng
                ),
                MiniScreenData(
                        id = 12,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0

                        ),
                        imageRes = R.drawable.Igfae_img_10_eng
                ),
                MiniScreenData(
                        id = 13,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0

                        ),
                        imageRes = R.drawable.Igfae_img_11_eng
                ),
                MiniScreenData(
                        id = 14,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0
                                ),
                        imageRes = R.drawable.Igfae_img_11_eng
                ),
                MiniScreenData(
                        id = 15,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0
                                ),
                        imageRes = R.drawable.Igfae_img_11_eng
                ),
                MiniScreenData(
                        id = 16,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0,
                                R.string.II_Igfae_miniscreen_0_paragraph0
                                ),
                        imageRes = R.drawable.Igfae_img_11_eng
                ),
                MiniScreenData(
                        id = 17,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,

                                ),

                        ),
                MiniScreenData(
                        id = 18,
                        bodyParagraphs = listOf(
                                R.string.II_Igfae_miniscreen_0_paragraph0,

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
                                R.string.II_Igfae_miniscreen_0_paragraph0,

                                ),
                        imageRes = R.drawable.Igfae_img_21
                ),
                )
    }

    fun getData(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }
}