package com.junewon.kyobo_android.data.model.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BaseResponse<T>(
    @SerialName("data")
    val `data`: T,
    val message: String,
    val status: Int,
    val success: Boolean
)
