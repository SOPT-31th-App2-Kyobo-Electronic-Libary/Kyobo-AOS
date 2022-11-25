package com.junewon.kyobo_android.data.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkModule {
    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("http://3.35.184.0:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    inline fun <reified T> create(): T = retrofit.create(T::class.java)
}

object ServicePool {
    val homeService = NetworkModule.create<HomeService>()
    val myPageService = NetworkModule.create<MyPageService>()
}
