package com.example.multiidioma.data.types

data class VimeoVideoResponse(
    val uri: String,
    val name: String,
    val description: String?,
    val duration: Int,
    val link: String,
    val created_time: String,
    val files: List<VimeoFile>?
)

data class VimeoFile(
    val quality: String,
    val type: String,
    val width: Int,
    val height: Int,
    val link: String,
    val created_time: String
)

data class VimeoTokenResponse(
    val access_token: String,
    val token_type: String,
    val scope: String,
    val created_at: Int
)

data class ClientCredentialsRequest(
    val grant_type: String = "client_credentials",
    val scope: String = "public video_files"
)



