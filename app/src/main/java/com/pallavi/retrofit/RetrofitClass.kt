package com.pallavi.retrofit

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory.*

class RetrofitClass {

    public lateinit var apiInterface: ApiInterface
    lateinit var retrofit : Retrofit

    fun getRetrofit() : ApiInterface {
        retrofit = Retrofit.Builder()
            .baseUrl("https://gorest.co.in/public/v2/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
        apiInterface =  retrofit.create(ApiInterface::class.java)
        return apiInterface
    }
}