package com.pallavi.retrofit
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RetrofitGetResponse(
    @Json(name = "email")
    val email: String?,
    @Json(name = "gender")
    val gender: String?,
    @Json(name = "id")
    val id: Int?,
    @Json(name = "name")
    val name: String?,
    @Json(name = "status")
    val status: String?
)