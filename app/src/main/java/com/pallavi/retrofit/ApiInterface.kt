package com.pallavi.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("users/516")
    fun getUserInfo(): Call<RetrofitGetResponse>
}