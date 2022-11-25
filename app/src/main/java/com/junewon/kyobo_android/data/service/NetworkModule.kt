package com.junewon.kyobo_android.data.service

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.junewon.kyobo_android.BuildConfig
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

object NetworkModule {
    private val jsonCustomFormat = Json {
        ignoreUnknownKeys = true
        isLenient = true
        coerceInputValues = true
        encodeDefaults = true
    }

    @OptIn(ExperimentalSerializationApi::class)
    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("http://3.35.184.0:3000/")
            .client(providesOkHttpClient())
            .addConverterFactory(jsonCustomFormat.asConverterFactory("application/json".toMediaType()))
            .build()
    }

    private fun providesOkHttpClient(): OkHttpClient =
        OkHttpClient
            .Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .apply {
                if (BuildConfig.DEBUG) {
                    addInterceptor(
                        HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }
                    )
                }
            }
            .build()

    inline fun <reified T> create(): T = retrofit.create(T::class.java)
}

object ServicePool {
    val homeService = NetworkModule.create<HomeService>()
    val detailService = NetworkModule.create<DetailService>()
}
