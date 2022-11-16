package com.junewon.kyobo_android.data.model.resquest

import kotlinx.serialization.Serializable

/**
 * 예시 !! */
@Serializable
data class UserRequest(
    val id: Int,
    val name: String
)
