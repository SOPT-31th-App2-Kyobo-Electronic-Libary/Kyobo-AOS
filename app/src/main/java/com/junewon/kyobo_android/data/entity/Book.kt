package com.junewon.kyobo_android.data.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Book(
    @SerialName("author")
    val author: String,
    @SerialName("description")
    val description: String,
    @SerialName("id")
    val id: Int,
    @SerialName("image")
    val image: String,
    @SerialName("name")
    val name: String,
    @SerialName("pubDate")
    val pubDate: String,
    @SerialName("publisher")
    val publisher: String,
    @SerialName("returnDate")
    val returnDate: String
)
