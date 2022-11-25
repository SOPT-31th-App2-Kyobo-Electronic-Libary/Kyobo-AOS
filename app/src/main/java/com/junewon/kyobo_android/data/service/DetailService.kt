package com.junewon.kyobo_android.data.service

import com.junewon.kyobo_android.data.model.response.BaseResponse
import com.junewon.kyobo_android.data.model.response.BookDetailResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface DetailService {

    @GET("api/book/{bookId}")
    suspend fun fetchBookDetail(@Path("bookId") bookId: Int): BaseResponse<BookDetailResponse>
}
