package com.example.rectrofitapiusingmvvm.Rectrofit

import android.util.Log
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object JsonPlaceHolderRepository {


    val listPost = MutableLiveData<PostList>()
    fun getPosts(): MutableLiveData<PostList> {
        val call = RetrofitInstance.apiInterface.getPost()
        call.enqueue(object : Callback<PostList> {
            override fun onResponse(call: Call<PostList>, response: Response<PostList>) {
                if(response.isSuccessful){
                    val body = response.body()
                    listPost.value = body!!

                }else{
                    Log.d("Error", "onResponse: "+response.message())
                }
            }

            override fun onFailure(call: Call<PostList>, t: Throwable) {
                Log.d("FAIL", "onFailure: "+t.message)
            }

        })
        return listPost
    }
}