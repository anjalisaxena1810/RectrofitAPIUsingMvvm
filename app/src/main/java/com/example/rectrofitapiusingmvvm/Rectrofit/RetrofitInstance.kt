package com.example.rectrofitapiusingmvvm.Rectrofit

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {


    private val retrofitInstance: Retrofit.Builder by lazy{
        Retrofit.Builder().baseUrl(Constants.BASEURL).addConverterFactory(
            GsonConverterFactory.create(
                GsonBuilder().create()))
    }

    val apiInterface:ApiInterface by lazy {
        retrofitInstance.build().create(ApiInterface::class.java)
    }
}