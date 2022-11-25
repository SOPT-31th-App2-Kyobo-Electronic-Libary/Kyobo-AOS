package com.junewon.kyobo_android.data.service

import com.junewon.kyobo_android.data.model.response.HomeResponse
import retrofit2.Call
import retrofit2.http.GET

interface HomeService {
    @GET("api/user/1/main")
    fun getBook(): Call<HomeResponse>
}
