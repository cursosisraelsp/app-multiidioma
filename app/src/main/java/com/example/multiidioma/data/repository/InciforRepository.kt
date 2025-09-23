package com.example.multiidioma.data.repository


import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.example.multiidioma.R
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.PersonalResearcher

val personalResearcher = listOf(
    PersonalResearcher(
        id = "0",
        foto = R.drawable.cientifico,
        name = "Pepe",
        info = "Investigador",
        ruta = "miniscreen27",
        contentType = ContentType.MINISCREEN27
    ),
    PersonalResearcher(
        id = "1",
        foto = R.drawable.instituto,
        name = "Xoan",
        info = "Investigador na área de ...",
        ruta = "miniscreen28",
        contentType = ContentType.MINISCREEN28
    ),
    PersonalResearcher(
        id = "2",
        foto = R.drawable.instituto_all,
        name = "Anxo",
        info = "Investigador na área do Citius",
        ruta = "miniscreen27",
        contentType = ContentType.MINISCREEN27
    ),
    PersonalResearcher(
        id = "3",
        foto = R.drawable.centro_de_investigacion,
        name = "Xoan",
        info = "Investigador",
        ruta = "miniscreen28",
        contentType = ContentType.MINISCREEN28
    ),
    PersonalResearcher(
        id = "4",
        foto = R.drawable.instituto_all,
        name = "Alexandre",
        info = "Investigador",
        ruta = "detalles/2",
        contentType = ContentType.MINISCREEN28
    )
)

class InciforRepository {

    fun getMiniScreens(): List<MiniScreenData> {
        return listOf(
            MiniScreenData(
                id = 0,

                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_0_paragraph0
                ),
            ),
            MiniScreenData(
                id = 1,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_1_paragraph0,
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_2_paragraph0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 3,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_3_paragraph0
                ),
                imageRes = R.drawable.incifor_img_01_c
            ),
            MiniScreenData(
                id = 4,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_4_paragraph0
                ),
                imageRes = R.drawable.incifor_img_01_d
            ),
            MiniScreenData(
                id = 5,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_5_paragraph0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 6,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_6_paragraph0
                ),
                imageRes = R.drawable.incifor_img_02
            ),
            MiniScreenData(
                id = 7,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_7_paragraph0
                ),
                imageRes =
                    R.drawable.noimagen
            ),
            MiniScreenData(
                id = 8,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_8_paragraph0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 9,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_9_paragraph0
                ),
                imageRes = R.drawable.noimagen
            ),

            MiniScreenData(
                id = 10,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_10_paragraph0,
                    R.string.II_INCIFOR_miniscreen_10_paragraph1,
                    R.string.II_INCIFOR_miniscreen_10_paragraph2
                ),
            ),
            MiniScreenData(
                id = 11,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_11_paragraph0,
                ),
                imageRes = R.drawable.noimagen
            ),

            MiniScreenData(
                id = 12,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_12_paragraph0,
                ),
                imageRes = R.drawable.incifor_img_03
            ),
            MiniScreenData(
                id = 13,
            ),
            MiniScreenData(
                id = 14,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_14_title0,
                    R.string.II_INCIFOR_miniscreen_14_title1,
                    R.string.II_INCIFOR_miniscreen_14_paragraph0,
                ),
                imageRes = R.drawable.incifor_img_04
            ),
            MiniScreenData(
                id = 15,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_15_title0,
                    R.string.II_INCIFOR_miniscreen_15_title1,
                    R.string.II_INCIFOR_miniscreen_15_paragraph0,
                ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 16,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_16_title0,
                    R.string.II_INCIFOR_miniscreen_16_title1,
                    R.string.II_INCIFOR_miniscreen_16_paragraph0,
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 17,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_17_title0,
                    R.string.II_INCIFOR_miniscreen_17_title1,
                    R.string.II_INCIFOR_miniscreen_17_paragraph0,
                ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 18,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_18_title0,
                    R.string.II_INCIFOR_miniscreen_18_paragraph0,
                ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 19,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_19_title0,
                    R.string.II_INCIFOR_miniscreen_19_paragraph0,
                    R.string.II_INCIFOR_miniscreen_19_paragraph1
                ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 20,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_20_paragraph0,
                    R.string.II_INCIFOR_miniscreen_20_paragraph1,
                    R.string.II_INCIFOR_miniscreen_20_paragraph2,
                ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 21,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_21_title0,
                    R.string.II_INCIFOR_miniscreen_21_paragraph0,
                    R.string.II_INCIFOR_miniscreen_21_paragraph1,

                    ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 22,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_22_title0,
                    R.string.II_INCIFOR_miniscreen_22_paragraph0,


                    ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 23,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_23_title0,
                    R.string.II_INCIFOR_miniscreen_23_paragraph0,


                    ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 24,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_24_paragraph0,


                    ),
                imageRes = R.drawable.incifor_img_05
            ),
            MiniScreenData(
                id = 25,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_25_paragraph0
                ),
                imageRes = R.drawable.incifor_img_01_d
            ),
            MiniScreenData(
                id = 26,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_26_paragraph0,
                    R.string.II_INCIFOR_miniscreen_26_paragraph1
                ),
                imageRes = R.drawable.incifor_img_01_d,
                personalResearcher = personalResearcher
            )


            )
    }

    fun getPersonalResearcher(): List<PersonalResearcher>{
        return personalResearcher
    }
    fun getData(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }

    fun getDataResearcher(i: Int): PersonalResearcher{
        return getPersonalResearcher()[i]
    }
}
