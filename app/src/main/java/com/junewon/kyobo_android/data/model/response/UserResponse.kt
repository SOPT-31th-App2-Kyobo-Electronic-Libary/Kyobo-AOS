package com.junewon.kyobo_android.data.model.response

import kotlinx.serialization.Serializable

/**
 * 예시 !! */
@Serializable
data class UserResponse(
    val id: Int,
    val name: String
)
