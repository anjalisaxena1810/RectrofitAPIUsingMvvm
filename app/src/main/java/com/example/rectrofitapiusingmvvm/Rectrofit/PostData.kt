package com.example.rectrofitapiusingmvvm.Rectrofit

import com.google.gson.annotations.SerializedName

data class PostData(
@SerializedName("userId")
val UserId:Int,
@SerializedName("Id")
val id:Int,
@SerializedName("title")
val title : String,
@SerializedName("body")
val body: String
)
