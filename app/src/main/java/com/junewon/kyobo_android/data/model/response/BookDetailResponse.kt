package com.junewon.kyobo_android.data.model.response

import com.junewon.kyobo_android.data.entity.Book
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BookDetailResponse(
    @SerialName("book")
    val book: Book,
    @SerialName("userId")
    val userId: Int
)
