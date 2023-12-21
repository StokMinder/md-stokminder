package com.example.stockminder.network

class ApiConfig {

    companion object{
        private val loggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)


        private val client = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

        fun getApiService(): ApiService {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://stokminder-ch2-ps429.et.r.appspot.com/docs")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
            return retrofit.create(ApiService::class.java)
        }
    }
}