package com.pallavi.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RetrofitActivity : AppCompatActivity() {
    lateinit var retrofitActivity: RetrofitActivity
    lateinit var retrofitClass: RetrofitClass
    lateinit var btnShow: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShow = findViewById(R.id.btnShow)

        btnShow.setOnClickListener {
        var retrofitclass: Call<RetrofitGetResponse> = RetrofitClass().getRetrofit().getUserInfo()
        retrofitclass.enqueue(object : Callback<RetrofitGetResponse> {
            override fun onResponse(
                call: Call<RetrofitGetResponse>,
                response: Response<RetrofitGetResponse>
            ) {
                System.out.println("in response body ${response.body()}")
                System.out.println("in response ${response}")
            }

            override fun onFailure(call: Call<RetrofitGetResponse>, t: Throwable) {
                System.out.println("In failure ${t.message}")
            }
        })
    }
}
}