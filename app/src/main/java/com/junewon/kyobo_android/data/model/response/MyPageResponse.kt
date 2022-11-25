package com.junewon.kyobo_android.data.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MyPageResponse(
    @SerialName("data")
    val `data`: Data,
    @SerialName("message")
    val message: String,
    @SerialName("status")
    val status: Int,
    @SerialName("success")
    val success: Boolean
) {
    @Serializable
    data class Data(
        @SerialName("books")
        val books: List<Book>,
        @SerialName("userId")
        val userId: Int,
        @SerialName("userName")
        val userName: String
    ) {
        @Serializable
        data class Book(
            @SerialName("dDay")
            val dDay: Int,
            @SerialName("id")
            val id: Int,
            @SerialName("image")
            val image: String,
            @SerialName("lendingDate")
            val lendingDate: String,
            @SerialName("name")
            val name: String,
            @SerialName("returnDate")
            val returnDate: String
        )
    }
}
