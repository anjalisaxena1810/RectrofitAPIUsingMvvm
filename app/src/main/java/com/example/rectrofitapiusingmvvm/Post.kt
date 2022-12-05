package com.example.rectrofitapiusingmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rectrofitapiusingmvvm.Rectrofit.JsonPlaceHolderViewModel
import com.example.rectrofitapiusingmvvm.databinding.ActivityPostBinding

class Post : AppCompatActivity() {
    private lateinit var  dataBinding : ActivityPostBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_post)



        val viewModel= ViewModelProvider(this)[JsonPlaceHolderViewModel::class.java]

        dataBinding.recyclerView.layoutManager = LinearLayoutManager(this)
        viewModel.getPost().observe(this, Observer {
            val adapter = PostRecyclerViewAdapter(it)
            dataBinding.recyclerView.adapter = adapter
        })
    }
}