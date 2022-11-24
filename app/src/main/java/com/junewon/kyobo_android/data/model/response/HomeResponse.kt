package com.junewon.kyobo_android.data.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HomeResponse(
    val status: Int,
    val success: Boolean,
    val message: String,
    @SerialName("data") val books: Books
) {
    @Serializable
    data class Books(
        val lendingBook: List<LendingBook>,
        val bestBook: List<BestBook>,
        val newBook: List<NewBook>,
        val categoryBook: List<CategoryBook>
    ) {
        @Serializable
        data class LendingBook(
            val id: Int,
            val name: String,
            val image: String,
            val lendingDate: String,
            val returnDate: String,
            val dDay: Int
        )
        @Serializable
        data class BestBook(
            val id: Int,
            val name: String,
            val image: String,
            val author: String,
            val description: String
        )
        @Serializable
        data class NewBook(
            val id: Int,
            val name: String,
            val image: String,
            val author: String
        )
        @Serializable
        data class CategoryBook(
            val id: Int,
            val name: String,
            val image: String,
            val author: String,
            val category: String
        )
    }
}
