package com.example.multiidioma.http

import com.example.multiidioma.data.VimeoApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

import android.util.Base64
import com.example.multiidioma.data.VimeoAuthApi

object VimeoAuthService {
    private const val BASE_URL = "https://api.vimeo.com/"
    private const val CLIENT_ID = "83e3757130562cddbf744af4440482551e2784db"
    private const val CLIENT_SECRET = "IKvTx6rmWJWSrtB+M60Gazs10rIY2XurOs/R6M3OtePBDGwAell+q394umX24YyOBxDXnzgcjpZivI4r1a+Q5COxCIlROyTyOZWuOmCx2dfDsorCgZ/tREFBlb99sQSv"

    private val authHeader = "Basic " + Base64.encodeToString(
        "$CLIENT_ID:$CLIENT_SECRET".toByteArray(),
        Base64.NO_WRAP
    )

    val api: VimeoAuthApi = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(OkHttpClient.Builder().build())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(VimeoAuthApi::class.java)

    fun getAuthHeader(): String = authHeader
}


object VimeoVideoService {
    private const val BASE_URL = "https://api.vimeo.com/"

    suspend fun getApi(token: String): VimeoApi {
        val client = OkHttpClient.Builder().build()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(VimeoApi::class.java)
    }
}


object VimeoService {
    private const val BASE_URL = "https://api.vimeo.com/"
    //private const val TOKEN = "2Zh+gvJJuVPHy1NeC7PA/0F6mluTmnLpjgE2NeArgERUiTU4tFeecJg8r1xXwW6ed3nqJMgjgKDKnEvRPZgQvBd7dtm7oRpyrhJhYDtxh4BC+v79lQwte3AV8YKg2NhD" // 🔑 pon aquí tu token de Vimeo
    private const val TOKEN = "2Zh+gvJJuVPHy1NeC7PA/0F6mluTmnLpjgE2NeArgERUiTU4tFeecJg8r1xXwW6ed3nqJMgjgKDKnEvRPZgQvBd7dtm7oRpyrhJhYDtxh4BC+v79lQwte3AV8YKg2NhD"
    private val client = OkHttpClient.Builder()
        .addInterceptor { chain ->
            val request = chain.request().newBuilder()
                .addHeader("Authorization", "Bearer $TOKEN")
                .build()
            chain.proceed(request)
        }
        .build()

    val api: VimeoApi = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(VimeoApi::class.java)
}

