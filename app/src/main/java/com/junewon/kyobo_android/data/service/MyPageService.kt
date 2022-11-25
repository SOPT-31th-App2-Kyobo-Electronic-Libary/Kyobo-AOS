package com.junewon.kyobo_android.data.service

import com.junewon.kyobo_android.data.model.response.MyPageResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET

interface MyPageService {
    @GET("api/user/1/lending")
    fun getBorrowedInfo(): Call<MyPageResponse>
}
