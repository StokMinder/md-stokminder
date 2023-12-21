package com.example.stockminder.login


data class Data(
    @SerializedName("idToken")
    val idToken: String,
    @SerializedName("id")
    val uid: String
)