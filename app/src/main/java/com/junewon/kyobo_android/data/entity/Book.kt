package com.junewon.kyobo_android.data.entity


import kotlinx.serialization.Serializable

@Serializable
data class Book(
    val author: String = "",
    val description: String = "",
    val id: Int = -1,
    val image: String = "",
    val name: String = "",
    val pubDate: String = "",
    val publisher: String = "",
    val returnDate: String = ""
)
