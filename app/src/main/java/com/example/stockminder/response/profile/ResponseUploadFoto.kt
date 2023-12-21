package com.example.stockminder.response.profile


import com.google.gson.annotations.SerializedName

data class ResponseUploadFoto(
    @SerializedName("code")
    val code: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("url")
    val url: String
)