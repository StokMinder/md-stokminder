package com.example.stockminder.network

import com.google.android.gms.common.api.Response
import com.google.android.gms.common.internal.safeparcel.SafeParcelable

interface ApiService {

    @GET("profile/{id_user}")
    suspend fun getDatadiri(
        @Path("id_user")id_user:String
    ): Response<ResponseDataDiri>

    @FormUrlEncoded
    @POST("profile")
    suspend fun register(
        @SafeParcelable.Field("id_user")id_user:String,
        @SafeParcelable.Field("nama")nama:String,
        @SafeParcelable.Field("email")email:String,
    ):Response<ResponsStatus>

    @GET("userpreferences/{id_user}")
    suspend fun getUserPreferences(
//        @Header("Authorization") token: String,
        @Path("id_user")id_user:String
    ): Response<ResponseUserPreferences>
