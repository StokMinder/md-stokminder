package com.example.stockminder.response

import com.google.gson.annotations.SerializedName

data class ResponsStatus(
    @SerializedName("Successful Response")
    val code: String,
    @SerializedName("message")
    val message: String, )
    @SerializedName("Validation Error")
    val error:Boolean

)