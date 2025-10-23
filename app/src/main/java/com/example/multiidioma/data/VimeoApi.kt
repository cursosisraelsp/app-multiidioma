package com.example.multiidioma.data
import com.example.multiidioma.data.types.VimeoTokenResponse
import com.example.multiidioma.data.types.VimeoVideoResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path


interface VimeoApi {
    @GET("videos/{video_id}")
    suspend fun getVideo(
        @Path("video_id") videoId: String,
        @Header("Authorization") auth: String
    ): VimeoVideoResponse
}
interface VimeoAuthApi {
    @FormUrlEncoded
    @POST("oauth/access_token")
    suspend fun getAccessToken(
        @Header("Authorization") auth: String,
        @Field("grant_type") grantType: String,
        @Field("scope") scope: String
    ): VimeoTokenResponse
}

/*
interface VimeoApi {
    @GET("videos/{video_id}")
    suspend fun getVideo(
        @Path("video_id") videoId: String
    ): VimeoVideoResponse
}

*/
/*
interface VimeoAuthApi {
    @POST("oauth/access_token")
    suspend fun getAccessToken(
        @Header("Authorization") auth: String,
        @Body body: ClientCredentialsRequest = ClientCredentialsRequest()
    ): VimeoTokenResponse
}*/
/*
interface VimeoAuthApi {
    @FormUrlEncoded
    @POST("oauth/access_token")
    suspend fun getAccessToken(
        @Header("Authorization") auth: String,
        @Field("grant_type") grantType: String = "client_credentials",
        @Field("scope") scope: String = "public video_files"
    ): VimeoTokenResponse
}

*/
/*
interface VimeoApi {
    @GET("videos/{video_id}")
    suspend fun getVideo(
        @Path("video_id") videoId: String,
        @Header("Authorization") auth: String = "Bearer TU_TOKEN_AQUI"
    ): VimeoVideoResponse
}*/