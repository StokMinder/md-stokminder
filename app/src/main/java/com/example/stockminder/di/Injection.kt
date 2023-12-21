package com.example.stockminder.di

import android.content.Context
import com.example.raflistoryapp.data.StoryRepositori
import com.example.raflistoryapp.database.StoryDataBase
import com.example.raflistoryapp.network.ApiConfig
import com.example.raflistoryapp.preference.PreferenceLogin

object Injection {
    fun provideRepository(context: Context): StoryRepositori {
        val pref = PreferenceLogin(context)
        val token = pref.getToken().toString()
        val database = StoryDataBase.getDatabase(context)
        val apiService = ApiConfig.getApiService()
        return StoryRepositori(database, apiService, token)
    }
}