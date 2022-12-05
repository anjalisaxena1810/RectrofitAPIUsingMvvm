package com.example.rectrofitapiusingmvvm.Rectrofit

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class JsonPlaceHolderViewModel :ViewModel(){

    var listPost = MutableLiveData<PostList>()
    fun getPost(): LiveData<PostList> {
        listPost = JsonPlaceHolderRepository.getPosts()
        return listPost
    }
}